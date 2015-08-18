/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions copyright [year] [name of copyright owner]".
 *
 * Copyright 2015 ForgeRock AS.
 */

package org.forgerock.openam.sts.tokengeneration.service;

import static org.forgerock.http.routing.RoutingMode.STARTS_WITH;
import static org.forgerock.openam.audit.AuditConstants.Component.STS;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Collections;
import java.util.Set;

import com.google.inject.Key;
import com.google.inject.TypeLiteral;
import org.forgerock.http.Handler;
import org.forgerock.json.resource.CollectionResourceProvider;
import org.forgerock.openam.http.HttpRoute;
import org.forgerock.openam.http.HttpRouteProvider;
import org.forgerock.openam.rest.RestRouter;
import org.forgerock.openam.rest.authz.STSTokenGenerationServiceAuthzModule;
import org.forgerock.openam.sts.tokengeneration.CTSTokenPersistence;
import org.forgerock.openam.sts.tokengeneration.config.TokenGenerationServiceInjectorHolder;
import org.forgerock.openam.sts.tokengeneration.oidc.OpenIdConnectTokenGeneration;
import org.forgerock.openam.sts.tokengeneration.saml2.SAML2TokenGeneration;
import org.forgerock.openam.sts.tokengeneration.state.RestSTSInstanceState;
import org.forgerock.openam.sts.tokengeneration.state.STSInstanceStateProvider;
import org.forgerock.openam.sts.tokengeneration.state.SoapSTSInstanceState;
import org.forgerock.util.Function;
import org.forgerock.util.promise.NeverThrowsException;
import org.slf4j.Logger;

public class TokenGenerationServiceHttpRouteProvider implements HttpRouteProvider {

    private RestRouter rootRouter;

    @Inject
    public void setRouters(RestRouter router) {
        this.rootRouter = router;
    }

    @Override
    public Set<HttpRoute> get() {
        return Collections.singleton(HttpRoute.newHttpRoute(STARTS_WITH, "sts-tokengen", new Function<Void, Handler, NeverThrowsException>() {
                    @Override
                    public Handler apply(Void value) throws NeverThrowsException {
                        CollectionResourceProvider tokenGenerationService =
                                new TokenGenerationService(
                                        TokenGenerationServiceInjectorHolder.getInstance(Key.get(SAML2TokenGeneration.class)),
                                        TokenGenerationServiceInjectorHolder.getInstance(Key.get(OpenIdConnectTokenGeneration.class)),
                                        TokenGenerationServiceInjectorHolder.getInstance(Key.get(new TypeLiteral<STSInstanceStateProvider<RestSTSInstanceState>>(){})),
                                        TokenGenerationServiceInjectorHolder.getInstance(Key.get(new TypeLiteral<STSInstanceStateProvider<SoapSTSInstanceState>>(){})),
                                        TokenGenerationServiceInjectorHolder.getInstance(Key.get(CTSTokenPersistence.class)),
                                        TokenGenerationServiceInjectorHolder.getInstance(Key.get(Logger.class)));

                        rootRouter.route("")
                                .auditAs(STS)
                                .authorizeWith(STSTokenGenerationServiceAuthzModule.class)
                                .toCollection(tokenGenerationService);
                        return rootRouter.getRouter();
                    }
                }));
    }
}
