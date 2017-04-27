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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xData_XYs2d complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xData_XYs2d">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="Legendre" type="{}xData_Legendre_1d"/>
 *           &lt;element name="XYs1d" type="{}xData_XYs1d"/>
 *           &lt;element name="regions1d" type="{}xData_regions_1d"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="interpolation" type="{}interpolation" />
 *       &lt;attribute name="interpolationQualifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xData_XYs2d", propOrder = {
    "legendreOrXYs1DOrRegions1D"
})
public class XDataXYs2D {

    @XmlElements({
        @XmlElement(name = "Legendre", type = XDataLegendre1D.class),
        @XmlElement(name = "XYs1d", type = XDataXYs1D.class),
        @XmlElement(name = "regions1d", type = XDataRegions1D.class)
    })
    protected List<Object> legendreOrXYs1DOrRegions1D;
    @XmlAttribute(name = "value", required = true)
    protected double value;
    @XmlAttribute(name = "interpolation")
    protected Interpolation interpolation;
    @XmlAttribute(name = "interpolationQualifier")
    protected String interpolationQualifier;

    /**
     * Gets the value of the legendreOrXYs1DOrRegions1D property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legendreOrXYs1DOrRegions1D property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegendreOrXYs1DOrRegions1D().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XDataLegendre1D }
     * {@link XDataXYs1D }
     * {@link XDataRegions1D }
     * 
     * 
     */
    public List<Object> getLegendreOrXYs1DOrRegions1D() {
        if (legendreOrXYs1DOrRegions1D == null) {
            legendreOrXYs1DOrRegions1D = new ArrayList<Object>();
        }
        return this.legendreOrXYs1DOrRegions1D;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the value of the interpolation property.
     * 
     * @return
     *     possible object is
     *     {@link Interpolation }
     *     
     */
    public Interpolation getInterpolation() {
        return interpolation;
    }

    /**
     * Sets the value of the interpolation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interpolation }
     *     
     */
    public void setInterpolation(Interpolation value) {
        this.interpolation = value;
    }

    /**
     * Gets the value of the interpolationQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterpolationQualifier() {
        return interpolationQualifier;
    }

    /**
     * Sets the value of the interpolationQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterpolationQualifier(String value) {
        this.interpolationQualifier = value;
    }

}
