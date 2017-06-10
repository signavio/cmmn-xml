
package com.signavio.cmmn.xml.v11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for CMMNDiagram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CMMNDiagram">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/CMMN/20151109/DI}Diagram">
 *       &lt;sequence>
 *         &lt;element name="Size" type="{http://www.omg.org/spec/CMMN/20151109/DC}Dimension" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/CMMN/20151109/CMMNDI}CMMNDiagramElement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="cmmnElementRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMMNDiagram", propOrder = {
    "size",
    "cmmnDiagramElement"
})
public class CMMNDiagram
    extends Diagram
{

    @XmlElement(name = "Size")
    protected Dimension size;
    @XmlElementRef(name = "CMMNDiagramElement", namespace = "http://www.omg.org/spec/CMMN/20151109/CMMNDI", type = JAXBElement.class, required = false)
    protected List<JAXBElement<?>> cmmnDiagramElement;
    @XmlAttribute(name = "cmmnElementRef")
    protected QName cmmnElementRef;

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Dimension }
     *     
     */
    public Dimension getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dimension }
     *     
     */
    public void setSize(Dimension value) {
        this.size = value;
    }

    /**
     * Gets the value of the cmmnDiagramElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmmnDiagramElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCMMNDiagramElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CMMNEdge }{@code >}
     * {@link JAXBElement }{@code <}{@link DiagramElement }{@code >}
     * {@link JAXBElement }{@code <}{@link CMMNShape }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getCMMNDiagramElement() {
        if (cmmnDiagramElement == null) {
            cmmnDiagramElement = new ArrayList<JAXBElement<?>>();
        }
        return this.cmmnDiagramElement;
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

    public CMMNDiagram withSize(Dimension value) {
        setSize(value);
        return this;
    }

    public CMMNDiagram withCMMNDiagramElement(JAXBElement<?> ... values) {
        if (values!= null) {
            for (JAXBElement<?> value: values) {
                getCMMNDiagramElement().add(value);
            }
        }
        return this;
    }

    public CMMNDiagram withCMMNDiagramElement(Collection<JAXBElement<?>> values) {
        if (values!= null) {
            getCMMNDiagramElement().addAll(values);
        }
        return this;
    }

    public CMMNDiagram withCmmnElementRef(QName value) {
        setCmmnElementRef(value);
        return this;
    }

}
