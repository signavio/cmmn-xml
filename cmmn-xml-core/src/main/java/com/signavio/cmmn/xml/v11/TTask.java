
package com.signavio.cmmn.xml.v11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tTask">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/CMMN/20151109/MODEL}tPlanItemDefinition">
 *       &lt;sequence>
 *         &lt;element name="input" type="{http://www.omg.org/spec/CMMN/20151109/MODEL}tCaseParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="output" type="{http://www.omg.org/spec/CMMN/20151109/MODEL}tCaseParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isBlocking" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTask", propOrder = {
    "input",
    "output"
})
@XmlSeeAlso({
    TProcessTask.class,
    TCaseTask.class,
    THumanTask.class,
    TDecisionTask.class
})
public class TTask
    extends TPlanItemDefinition
{

    protected List<TCaseParameter> input;
    protected List<TCaseParameter> output;
    @XmlAttribute(name = "isBlocking")
    protected Boolean isBlocking;

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
     * Gets the value of the isBlocking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsBlocking() {
        if (isBlocking == null) {
            return true;
        } else {
            return isBlocking;
        }
    }

    /**
     * Sets the value of the isBlocking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBlocking(Boolean value) {
        this.isBlocking = value;
    }

    public TTask withInput(TCaseParameter... values) {
        if (values!= null) {
            for (TCaseParameter value: values) {
                getInput().add(value);
            }
        }
        return this;
    }

    public TTask withInput(Collection<TCaseParameter> values) {
        if (values!= null) {
            getInput().addAll(values);
        }
        return this;
    }

    public TTask withOutput(TCaseParameter... values) {
        if (values!= null) {
            for (TCaseParameter value: values) {
                getOutput().add(value);
            }
        }
        return this;
    }

    public TTask withOutput(Collection<TCaseParameter> values) {
        if (values!= null) {
            getOutput().addAll(values);
        }
        return this;
    }

    public TTask withIsBlocking(Boolean value) {
        setIsBlocking(value);
        return this;
    }

    @Override
    public TTask withDefaultControl(TPlanItemControl value) {
        setDefaultControl(value);
        return this;
    }

    @Override
    public TTask withName(String value) {
        setName(value);
        return this;
    }

    @Override
    public TTask withDocumentation(TDocumentation... values) {
        if (values!= null) {
            for (TDocumentation value: values) {
                getDocumentation().add(value);
            }
        }
        return this;
    }

    @Override
    public TTask withDocumentation(Collection<TDocumentation> values) {
        if (values!= null) {
            getDocumentation().addAll(values);
        }
        return this;
    }

    @Override
    public TTask withExtensionElements(TExtensionElements value) {
        setExtensionElements(value);
        return this;
    }

    @Override
    public TTask withId(String value) {
        setId(value);
        return this;
    }

}
