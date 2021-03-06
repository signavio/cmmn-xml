
package com.signavio.cmmn.xml.v11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * 
 *         tCaseTask defines the type of element "caseTask"
 *       
 * 
 * <p>Java class for tCaseTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tCaseTask">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/CMMN/20151109/MODEL}tTask">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.omg.org/spec/CMMN/20151109/MODEL}parameterMapping" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="caseRefExpression" type="{http://www.omg.org/spec/CMMN/20151109/MODEL}tExpression" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="caseRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCaseTask", propOrder = {
    "parameterMapping",
    "caseRefExpression"
})
public class TCaseTask
    extends TTask
{

    protected List<TParameterMapping> parameterMapping;
    protected TExpression caseRefExpression;
    @XmlAttribute(name = "caseRef")
    protected QName caseRef;

    /**
     * Gets the value of the parameterMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TParameterMapping }
     * 
     * 
     */
    public List<TParameterMapping> getParameterMapping() {
        if (parameterMapping == null) {
            parameterMapping = new ArrayList<TParameterMapping>();
        }
        return this.parameterMapping;
    }

    /**
     * Gets the value of the caseRefExpression property.
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    public TExpression getCaseRefExpression() {
        return caseRefExpression;
    }

    /**
     * Sets the value of the caseRefExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    public void setCaseRefExpression(TExpression value) {
        this.caseRefExpression = value;
    }

    /**
     * Gets the value of the caseRef property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getCaseRef() {
        return caseRef;
    }

    /**
     * Sets the value of the caseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setCaseRef(QName value) {
        this.caseRef = value;
    }

    public TCaseTask withParameterMapping(TParameterMapping... values) {
        if (values!= null) {
            for (TParameterMapping value: values) {
                getParameterMapping().add(value);
            }
        }
        return this;
    }

    public TCaseTask withParameterMapping(Collection<TParameterMapping> values) {
        if (values!= null) {
            getParameterMapping().addAll(values);
        }
        return this;
    }

    public TCaseTask withCaseRefExpression(TExpression value) {
        setCaseRefExpression(value);
        return this;
    }

    public TCaseTask withCaseRef(QName value) {
        setCaseRef(value);
        return this;
    }

    @Override
    public TCaseTask withInput(TCaseParameter... values) {
        if (values!= null) {
            for (TCaseParameter value: values) {
                getInput().add(value);
            }
        }
        return this;
    }

    @Override
    public TCaseTask withInput(Collection<TCaseParameter> values) {
        if (values!= null) {
            getInput().addAll(values);
        }
        return this;
    }

    @Override
    public TCaseTask withOutput(TCaseParameter... values) {
        if (values!= null) {
            for (TCaseParameter value: values) {
                getOutput().add(value);
            }
        }
        return this;
    }

    @Override
    public TCaseTask withOutput(Collection<TCaseParameter> values) {
        if (values!= null) {
            getOutput().addAll(values);
        }
        return this;
    }

    @Override
    public TCaseTask withIsBlocking(Boolean value) {
        setIsBlocking(value);
        return this;
    }

    @Override
    public TCaseTask withDefaultControl(TPlanItemControl value) {
        setDefaultControl(value);
        return this;
    }

    @Override
    public TCaseTask withName(String value) {
        setName(value);
        return this;
    }

    @Override
    public TCaseTask withDocumentation(TDocumentation... values) {
        if (values!= null) {
            for (TDocumentation value: values) {
                getDocumentation().add(value);
            }
        }
        return this;
    }

    @Override
    public TCaseTask withDocumentation(Collection<TDocumentation> values) {
        if (values!= null) {
            getDocumentation().addAll(values);
        }
        return this;
    }

    @Override
    public TCaseTask withExtensionElements(TExtensionElements value) {
        setExtensionElements(value);
        return this;
    }

    @Override
    public TCaseTask withId(String value) {
        setId(value);
        return this;
    }

}
