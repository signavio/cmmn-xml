
package com.signavio.cmmn.xml.v11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         tCaseFile defines the type of element "caseFile".
 *       
 * 
 * <p>Java class for tCaseFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tCaseFile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/CMMN/20151109/MODEL}tCmmnElement">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.omg.org/spec/CMMN/20151109/MODEL}caseFileItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCaseFile", propOrder = {
    "caseFileItem"
})
public class TCaseFile
    extends TCmmnElement
{

    protected List<TCaseFileItem> caseFileItem;

    /**
     * Gets the value of the caseFileItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caseFileItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaseFileItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCaseFileItem }
     * 
     * 
     */
    public List<TCaseFileItem> getCaseFileItem() {
        if (caseFileItem == null) {
            caseFileItem = new ArrayList<TCaseFileItem>();
        }
        return this.caseFileItem;
    }

    public TCaseFile withCaseFileItem(TCaseFileItem... values) {
        if (values!= null) {
            for (TCaseFileItem value: values) {
                getCaseFileItem().add(value);
            }
        }
        return this;
    }

    public TCaseFile withCaseFileItem(Collection<TCaseFileItem> values) {
        if (values!= null) {
            getCaseFileItem().addAll(values);
        }
        return this;
    }

    @Override
    public TCaseFile withDocumentation(TDocumentation... values) {
        if (values!= null) {
            for (TDocumentation value: values) {
                getDocumentation().add(value);
            }
        }
        return this;
    }

    @Override
    public TCaseFile withDocumentation(Collection<TDocumentation> values) {
        if (values!= null) {
            getDocumentation().addAll(values);
        }
        return this;
    }

    @Override
    public TCaseFile withExtensionElements(TExtensionElements value) {
        setExtensionElements(value);
        return this;
    }

    @Override
    public TCaseFile withId(String value) {
        setId(value);
        return this;
    }

}
