
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
 *         tProcessTask defines the type of element "process"
 *       
 * 
 * <p>Java class for tProcessTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tProcessTask">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/CMMN/20151109/MODEL}tTask">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.omg.org/spec/CMMN/20151109/MODEL}parameterMapping" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="processRefExpression" type="{http://www.omg.org/spec/CMMN/20151109/MODEL}tExpression" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="processRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tProcessTask", propOrder = {
    "parameterMapping",
    "processRefExpression"
})
public class TProcessTask
    extends TTask
{

    protected List<TParameterMapping> parameterMapping;
    protected TExpression processRefExpression;
    @XmlAttribute(name = "processRef")
    protected QName processRef;

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
     * Gets the value of the processRefExpression property.
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    public TExpression getProcessRefExpression() {
        return processRefExpression;
    }

    /**
     * Sets the value of the processRefExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    public void setProcessRefExpression(TExpression value) {
        this.processRefExpression = value;
    }

    /**
     * Gets the value of the processRef property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getProcessRef() {
        return processRef;
    }

    /**
     * Sets the value of the processRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setProcessRef(QName value) {
        this.processRef = value;
    }

    public TProcessTask withParameterMapping(TParameterMapping... values) {
        if (values!= null) {
            for (TParameterMapping value: values) {
                getParameterMapping().add(value);
            }
        }
        return this;
    }

    public TProcessTask withParameterMapping(Collection<TParameterMapping> values) {
        if (values!= null) {
            getParameterMapping().addAll(values);
        }
        return this;
    }

    public TProcessTask withProcessRefExpression(TExpression value) {
        setProcessRefExpression(value);
        return this;
    }

    public TProcessTask withProcessRef(QName value) {
        setProcessRef(value);
        return this;
    }

    @Override
    public TProcessTask withInput(TCaseParameter... values) {
        if (values!= null) {
            for (TCaseParameter value: values) {
                getInput().add(value);
            }
        }
        return this;
    }

    @Override
    public TProcessTask withInput(Collection<TCaseParameter> values) {
        if (values!= null) {
            getInput().addAll(values);
        }
        return this;
    }

    @Override
    public TProcessTask withOutput(TCaseParameter... values) {
        if (values!= null) {
            for (TCaseParameter value: values) {
                getOutput().add(value);
            }
        }
        return this;
    }

    @Override
    public TProcessTask withOutput(Collection<TCaseParameter> values) {
        if (values!= null) {
            getOutput().addAll(values);
        }
        return this;
    }

    @Override
    public TProcessTask withIsBlocking(Boolean value) {
        setIsBlocking(value);
        return this;
    }

    @Override
    public TProcessTask withDefaultControl(TPlanItemControl value) {
        setDefaultControl(value);
        return this;
    }

    @Override
    public TProcessTask withName(String value) {
        setName(value);
        return this;
    }

    @Override
    public TProcessTask withDocumentation(TDocumentation... values) {
        if (values!= null) {
            for (TDocumentation value: values) {
                getDocumentation().add(value);
            }
        }
        return this;
    }

    @Override
    public TProcessTask withDocumentation(Collection<TDocumentation> values) {
        if (values!= null) {
            getDocumentation().addAll(values);
        }
        return this;
    }

    @Override
    public TProcessTask withExtensionElements(TExtensionElements value) {
        setExtensionElements(value);
        return this;
    }

    @Override
    public TProcessTask withId(String value) {
        setId(value);
        return this;
    }

}
