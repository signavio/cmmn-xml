
package com.signavio.cmmn.xml.v11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         tCase defines the type of element "case".
 *       
 * 
 * <p>Java class for tCase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tCase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/CMMN/20151109/MODEL}tCmmnElement">
 *       &lt;sequence>
 *         &lt;element name="caseFileModel" type="{http://www.omg.org/spec/CMMN/20151109/MODEL}tCaseFile" minOccurs="0"/>
 *         &lt;element name="casePlanModel" type="{http://www.omg.org/spec/CMMN/20151109/MODEL}tStage" minOccurs="0"/>
 *         &lt;element name="caseRoles" type="{http://www.omg.org/spec/CMMN/20151109/MODEL}tCaseRoles" minOccurs="0"/>
 *         &lt;element name="input" type="{http://www.omg.org/spec/CMMN/20151109/MODEL}tCaseParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="output" type="{http://www.omg.org/spec/CMMN/20151109/MODEL}tCaseParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCase", propOrder = {
    "caseFileModel",
    "casePlanModel",
    "caseRoles",
    "input",
    "output"
})
public class TCase
    extends TCmmnElement
{

    protected TCaseFile caseFileModel;
    protected TStage casePlanModel;
    protected TCaseRoles caseRoles;
    protected List<TCaseParameter> input;
    protected List<TCaseParameter> output;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the caseFileModel property.
     * 
     * @return
     *     possible object is
     *     {@link TCaseFile }
     *     
     */
    public TCaseFile getCaseFileModel() {
        return caseFileModel;
    }

    /**
     * Sets the value of the caseFileModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCaseFile }
     *     
     */
    public void setCaseFileModel(TCaseFile value) {
        this.caseFileModel = value;
    }

    /**
     * Gets the value of the casePlanModel property.
     * 
     * @return
     *     possible object is
     *     {@link TStage }
     *     
     */
    public TStage getCasePlanModel() {
        return casePlanModel;
    }

    /**
     * Sets the value of the casePlanModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TStage }
     *     
     */
    public void setCasePlanModel(TStage value) {
        this.casePlanModel = value;
    }

    /**
     * Gets the value of the caseRoles property.
     * 
     * @return
     *     possible object is
     *     {@link TCaseRoles }
     *     
     */
    public TCaseRoles getCaseRoles() {
        return caseRoles;
    }

    /**
     * Sets the value of the caseRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCaseRoles }
     *     
     */
    public void setCaseRoles(TCaseRoles value) {
        this.caseRoles = value;
    }

    /**
     * Gets the value of the input property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the input property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCaseParameter }
     * 
     * 
     */
    public List<TCaseParameter> getInput() {
        if (input == null) {
            input = new ArrayList<TCaseParameter>();
        }
        return this.input;
    }

    /**
     * Gets the value of the output property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the output property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCaseParameter }
     * 
     * 
     */
    public List<TCaseParameter> getOutput() {
        if (output == null) {
            output = new ArrayList<TCaseParameter>();
        }
        return this.output;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    public TCase withCaseFileModel(TCaseFile value) {
        setCaseFileModel(value);
        return this;
    }

    public TCase withCasePlanModel(TStage value) {
        setCasePlanModel(value);
        return this;
    }

    public TCase withCaseRoles(TCaseRoles value) {
        setCaseRoles(value);
        return this;
    }

    public TCase withInput(TCaseParameter... values) {
        if (values!= null) {
            for (TCaseParameter value: values) {
                getInput().add(value);
            }
        }
        return this;
    }

    public TCase withInput(Collection<TCaseParameter> values) {
        if (values!= null) {
            getInput().addAll(values);
        }
        return this;
    }

    public TCase withOutput(TCaseParameter... values) {
        if (values!= null) {
            for (TCaseParameter value: values) {
                getOutput().add(value);
            }
        }
        return this;
    }

    public TCase withOutput(Collection<TCaseParameter> values) {
        if (values!= null) {
            getOutput().addAll(values);
        }
        return this;
    }

    public TCase withName(String value) {
        setName(value);
        return this;
    }

    @Override
    public TCase withDocumentation(TDocumentation... values) {
        if (values!= null) {
            for (TDocumentation value: values) {
                getDocumentation().add(value);
            }
        }
        return this;
    }

    @Override
    public TCase withDocumentation(Collection<TDocumentation> values) {
        if (values!= null) {
            getDocumentation().addAll(values);
        }
        return this;
    }

    @Override
    public TCase withExtensionElements(TExtensionElements value) {
        setExtensionElements(value);
        return this;
    }

    @Override
    public TCase withId(String value) {
        setId(value);
        return this;
    }

}
