//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.27 at 11:31:49 AM PDT 
//


package gnd_jax.GND;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for angularTwoBody complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="angularTwoBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="XYs2d" type="{}xData_XYs2d_primary"/>
 *         &lt;element name="regions2d" type="{}xData_regions_2d_primary"/>
 *         &lt;element name="isotropic" type="{}isotropic"/>
 *         &lt;element name="recoil" type="{}xlink"/>
 *       &lt;/choice>
 *       &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="productFrame" use="required" type="{}frame" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "angularTwoBody", propOrder = {
    "xYs2DOrRegions2DOrIsotropic"
})
public class AngularTwoBody {

    @XmlElements({
        @XmlElement(name = "XYs2d", type = XDataXYs2DPrimary.class),
        @XmlElement(name = "regions2d", type = XDataRegions2DPrimary.class),
        @XmlElement(name = "isotropic", type = Isotropic.class),
        @XmlElement(name = "recoil", type = Xlink.class)
    })
    protected List<Object> xYs2DOrRegions2DOrIsotropic;
    @XmlAttribute(name = "label", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String label;
    @XmlAttribute(name = "productFrame", required = true)
    protected Frame productFrame;

    /**
     * Gets the value of the xYs2DOrRegions2DOrIsotropic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xYs2DOrRegions2DOrIsotropic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXYs2DOrRegions2DOrIsotropic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XDataXYs2DPrimary }
     * {@link XDataRegions2DPrimary }
     * {@link Isotropic }
     * {@link Xlink }
     * 
     * 
     */
    public List<Object> getXYs2DOrRegions2DOrIsotropic() {
        if (xYs2DOrRegions2DOrIsotropic == null) {
            xYs2DOrRegions2DOrIsotropic = new ArrayList<Object>();
        }
        return this.xYs2DOrRegions2DOrIsotropic;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the productFrame property.
     * 
     * @return
     *     possible object is
     *     {@link Frame }
     *     
     */
    public Frame getProductFrame() {
        return productFrame;
    }

    /**
     * Sets the value of the productFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frame }
     *     
     */
    public void setProductFrame(Frame value) {
        this.productFrame = value;
    }

}