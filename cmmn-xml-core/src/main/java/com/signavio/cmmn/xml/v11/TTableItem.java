
package com.signavio.cmmn.xml.v11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tTableItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tTableItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/CMMN/20151109/MODEL}tCmmnElement">
 *       &lt;attribute name="applicabilityRuleRefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="authorizedRoleRefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTableItem")
@XmlSeeAlso({
    TPlanningTable.class,
    TDiscretionaryItem.class
})
public abstract class TTableItem
    extends TCmmnElement
{

    @XmlAttribute(name = "applicabilityRuleRefs")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> applicabilityRuleRefs;
    @XmlAttribute(name = "authorizedRoleRefs")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> authorizedRoleRefs;

    /**
     * Gets the value of the applicabilityRuleRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicabilityRuleRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicabilityRuleRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getApplicabilityRuleRefs() {
        if (applicabilityRuleRefs == null) {
            applicabilityRuleRefs = new ArrayList<Object>();
        }
        return this.applicabilityRuleRefs;
    }

    /**
     * Gets the value of the authorizedRoleRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizedRoleRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizedRoleRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAuthorizedRoleRefs() {
        if (authorizedRoleRefs == null) {
            authorizedRoleRefs = new ArrayList<Object>();
        }
        return this.authorizedRoleRefs;
    }

    public TTableItem withApplicabilityRuleRefs(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getApplicabilityRuleRefs().add(value);
            }
        }
        return this;
    }

    public TTableItem withApplicabilityRuleRefs(Collection<Object> values) {
        if (values!= null) {
            getApplicabilityRuleRefs().addAll(values);
        }
        return this;
    }

    public TTableItem withAuthorizedRoleRefs(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getAuthorizedRoleRefs().add(value);
            }
        }
        return this;
    }

    public TTableItem withAuthorizedRoleRefs(Collection<Object> values) {
        if (values!= null) {
            getAuthorizedRoleRefs().addAll(values);
        }
        return this;
    }

    @Override
    public TTableItem withDocumentation(TDocumentation... values) {
        if (values!= null) {
            for (TDocumentation value: values) {
                getDocumentation().add(value);
            }
        }
        return this;
    }

    @Override
    public TTableItem withDocumentation(Collection<TDocumentation> values) {
        if (values!= null) {
            getDocumentation().addAll(values);
        }
        return this;
    }

    @Override
    public TTableItem withExtensionElements(TExtensionElements value) {
        setExtensionElements(value);
        return this;
    }

    @Override
    public TTableItem withId(String value) {
        setId(value);
        return this;
    }

}
