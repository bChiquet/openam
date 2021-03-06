//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.idpp.jaxb;


/**
 * Java content class for EmploymentIdentityType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/allan/A-SVN/trunk/opensso/products/federation/library/xsd/liberty/lib-id-sis-pp.xsd line 134)
 * <p>
 * <pre>
 * &lt;complexType name="EmploymentIdentityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}JobTitle" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}LJobTitle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}O" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}LO" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}AltO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}AltLO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}Extension" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:liberty:id-sis-pp:2003-08}commonAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface EmploymentIdentityType {


    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.ExtensionElement}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.ExtensionType}
     */
    com.sun.identity.liberty.ws.idpp.jaxb.ExtensionType getExtension();

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.ExtensionElement}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.ExtensionType}
     */
    void setExtension(com.sun.identity.liberty.ws.idpp.jaxb.ExtensionType value);

    /**
     * Gets the value of the AltLO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the AltLO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltLO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.liberty.ws.idpp.jaxb.AltLOElement}
     * {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTLocalizedString}
     * 
     */
    java.util.List getAltLO();

    /**
     * Gets the value of the modificationTime property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     */
    java.util.Calendar getModificationTime();

    /**
     * Sets the value of the modificationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     */
    void setModificationTime(java.util.Calendar value);

    /**
     * Gets the value of the AltO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the AltO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTString}
     * {@link com.sun.identity.liberty.ws.idpp.jaxb.AltOElement}
     * 
     */
    java.util.List getAltO();

    /**
     * Gets the value of the lo property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.LOElement}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTLocalizedString}
     */
    com.sun.identity.liberty.ws.idpp.jaxb.DSTLocalizedString getLO();

    /**
     * Sets the value of the lo property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.LOElement}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTLocalizedString}
     */
    void setLO(com.sun.identity.liberty.ws.idpp.jaxb.DSTLocalizedString value);

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getId();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setId(java.lang.String value);

    /**
     * Gets the value of the o property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.OElement}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTString}
     */
    com.sun.identity.liberty.ws.idpp.jaxb.DSTString getO();

    /**
     * Sets the value of the o property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.OElement}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTString}
     */
    void setO(com.sun.identity.liberty.ws.idpp.jaxb.DSTString value);

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTString}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.JobTitleElement}
     */
    com.sun.identity.liberty.ws.idpp.jaxb.DSTString getJobTitle();

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTString}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.JobTitleElement}
     */
    void setJobTitle(com.sun.identity.liberty.ws.idpp.jaxb.DSTString value);

    /**
     * Gets the value of the LJobTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the LJobTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLJobTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.liberty.ws.idpp.jaxb.LJobTitleElement}
     * {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTLocalizedString}
     * 
     */
    java.util.List getLJobTitle();

}
