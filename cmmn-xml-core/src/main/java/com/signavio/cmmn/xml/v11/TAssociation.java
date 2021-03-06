
package com.signavio.cmmn.xml.v11;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tAssociation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/CMMN/20151109/MODEL}tArtifact">
 *       &lt;attribute name="sourceRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="targetRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="associationDirection" type="{http://www.omg.org/spec/CMMN/20151109/MODEL}tAssociationDirection" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tAssociation")
public class TAssociation
    extends TArtifact
{

    @XmlAttribute(name = "sourceRef")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object sourceRef;
    @XmlAttribute(name = "targetRef")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object targetRef;
    @XmlAttribute(name = "associationDirection")
    protected TAssociationDirection associationDirection;

    /**
     * Gets the value of the sourceRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSourceRef() {
        return sourceRef;
    }

    /**
     * Sets the value of the sourceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSourceRef(Object value) {
        this.sourceRef = value;
    }

    /**
     * Gets the value of the targetRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTargetRef() {
        return targetRef;
    }

    /**
     * Sets the value of the targetRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTargetRef(Object value) {
        this.targetRef = value;
    }

    /**
     * Gets the value of the associationDirection property.
     * 
     * @return
     *     possible object is
     *     {@link TAssociationDirection }
     *     
     */
    public TAssociationDirection getAssociationDirection() {
        return associationDirection;
    }

    /**
     * Sets the value of the associationDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAssociationDirection }
     *     
     */
    public void setAssociationDirection(TAssociationDirection value) {
        this.associationDirection = value;
    }

    public TAssociation withSourceRef(Object value) {
        setSourceRef(value);
        return this;
    }

    public TAssociation withTargetRef(Object value) {
        setTargetRef(value);
        return this;
    }

    public TAssociation withAssociationDirection(TAssociationDirection value) {
        setAssociationDirection(value);
        return this;
    }

    @Override
    public TAssociation withDocumentation(TDocumentation... values) {
        if (values!= null) {
            for (TDocumentation value: values) {
                getDocumentation().add(value);
            }
        }
        return this;
    }

    @Override
    public TAssociation withDocumentation(Collection<TDocumentation> values) {
        if (values!= null) {
            getDocumentation().addAll(values);
        }
        return this;
    }

    @Override
    public TAssociation withExtensionElements(TExtensionElements value) {
        setExtensionElements(value);
        return this;
    }

    @Override
    public TAssociation withId(String value) {
        setId(value);
        return this;
    }

}
