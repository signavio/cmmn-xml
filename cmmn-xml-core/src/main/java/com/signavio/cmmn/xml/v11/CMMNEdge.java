
package com.signavio.cmmn.xml.v11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for CMMNEdge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CMMNEdge">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/CMMN/20151109/DI}Edge">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.omg.org/spec/CMMN/20151109/CMMNDI}CMMNLabel"/>
 *       &lt;/sequence>
 *       &lt;attribute name="cmmnElementRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="sourceCMMNElementRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="targetCMMNElementRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="isStandardEventVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMMNEdge", propOrder = {
    "cmmnLabel"
})
public class CMMNEdge
    extends Edge
{

    @XmlElement(name = "CMMNLabel", required = true)
    protected CMMNLabel cmmnLabel;
    @XmlAttribute(name = "cmmnElementRef")
    protected QName cmmnElementRef;
    @XmlAttribute(name = "sourceCMMNElementRef")
    protected QName sourceCMMNElementRef;
    @XmlAttribute(name = "targetCMMNElementRef")
    protected QName targetCMMNElementRef;
    @XmlAttribute(name = "isStandardEventVisible")
    protected Boolean isStandardEventVisible;

    /**
     * Gets the value of the cmmnLabel property.
     * 
     * @return
     *     possible object is
     *     {@link CMMNLabel }
     *     
     */
    public CMMNLabel getCMMNLabel() {
        return cmmnLabel;
    }

    /**
     * Sets the value of the cmmnLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CMMNLabel }
     *     
     */
    public void setCMMNLabel(CMMNLabel value) {
        this.cmmnLabel = value;
    }

    /**
     * Gets the value of the cmmnElementRef property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getCmmnElementRef() {
        return cmmnElementRef;
    }

    /**
     * Sets the value of the cmmnElementRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setCmmnElementRef(QName value) {
        this.cmmnElementRef = value;
    }

    /**
     * Gets the value of the sourceCMMNElementRef property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getSourceCMMNElementRef() {
        return sourceCMMNElementRef;
    }

    /**
     * Sets the value of the sourceCMMNElementRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setSourceCMMNElementRef(QName value) {
        this.sourceCMMNElementRef = value;
    }

    /**
     * Gets the value of the targetCMMNElementRef property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getTargetCMMNElementRef() {
        return targetCMMNElementRef;
    }

    /**
     * Sets the value of the targetCMMNElementRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setTargetCMMNElementRef(QName value) {
        this.targetCMMNElementRef = value;
    }

    /**
     * Gets the value of the isStandardEventVisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStandardEventVisible() {
        return isStandardEventVisible;
    }

    /**
     * Sets the value of the isStandardEventVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStandardEventVisible(Boolean value) {
        this.isStandardEventVisible = value;
    }

    public CMMNEdge withCMMNLabel(CMMNLabel value) {
        setCMMNLabel(value);
        return this;
    }

    public CMMNEdge withCmmnElementRef(QName value) {
        setCmmnElementRef(value);
        return this;
    }

    public CMMNEdge withSourceCMMNElementRef(QName value) {
        setSourceCMMNElementRef(value);
        return this;
    }

    public CMMNEdge withTargetCMMNElementRef(QName value) {
        setTargetCMMNElementRef(value);
        return this;
    }

    public CMMNEdge withIsStandardEventVisible(Boolean value) {
        setIsStandardEventVisible(value);
        return this;
    }

}
