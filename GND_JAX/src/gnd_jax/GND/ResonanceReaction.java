//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.27 at 11:31:49 AM PDT 
//


package gnd_jax.GND;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resonanceReaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resonanceReaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="link" type="{}xlink"/>
 *         &lt;element name="Q" type="{}resonanceRegionQ" minOccurs="0"/>
 *         &lt;element name="scatteringRadius" type="{}scatteringRadius" minOccurs="0"/>
 *         &lt;element name="hardSphereRadius" type="{}scatteringRadius" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ejectile" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="computeShiftFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="eliminated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resonanceReaction", propOrder = {
    "link",
    "q",
    "scatteringRadius",
    "hardSphereRadius"
})
public class ResonanceReaction {

    @XmlElement(required = true)
    protected Xlink link;
    @XmlElement(name = "Q")
    protected ResonanceRegionQ q;
    protected ScatteringRadius scatteringRadius;
    protected ScatteringRadius hardSphereRadius;
    @XmlAttribute(name = "label", required = true)
    protected String label;
    @XmlAttribute(name = "ejectile", required = true)
    protected String ejectile;
    @XmlAttribute(name = "computeShiftFactor")
    protected Boolean computeShiftFactor;
    @XmlAttribute(name = "eliminated")
    protected Boolean eliminated;

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link Xlink }
     *     
     */
    public Xlink getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link Xlink }
     *     
     */
    public void setLink(Xlink value) {
        this.link = value;
    }

    /**
     * Gets the value of the q property.
     * 
     * @return
     *     possible object is
     *     {@link ResonanceRegionQ }
     *     
     */
    public ResonanceRegionQ getQ() {
        return q;
    }

    /**
     * Sets the value of the q property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResonanceRegionQ }
     *     
     */
    public void setQ(ResonanceRegionQ value) {
        this.q = value;
    }

    /**
     * Gets the value of the scatteringRadius property.
     * 
     * @return
     *     possible object is
     *     {@link ScatteringRadius }
     *     
     */
    public ScatteringRadius getScatteringRadius() {
        return scatteringRadius;
    }

    /**
     * Sets the value of the scatteringRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScatteringRadius }
     *     
     */
    public void setScatteringRadius(ScatteringRadius value) {
        this.scatteringRadius = value;
    }

    /**
     * Gets the value of the hardSphereRadius property.
     * 
     * @return
     *     possible object is
     *     {@link ScatteringRadius }
     *     
     */
    public ScatteringRadius getHardSphereRadius() {
        return hardSphereRadius;
    }

    /**
     * Sets the value of the hardSphereRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScatteringRadius }
     *     
     */
    public void setHardSphereRadius(ScatteringRadius value) {
        this.hardSphereRadius = value;
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
     * Gets the value of the ejectile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEjectile() {
        return ejectile;
    }

    /**
     * Sets the value of the ejectile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEjectile(String value) {
        this.ejectile = value;
    }

    /**
     * Gets the value of the computeShiftFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComputeShiftFactor() {
        return computeShiftFactor;
    }

    /**
     * Sets the value of the computeShiftFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComputeShiftFactor(Boolean value) {
        this.computeShiftFactor = value;
    }

    /**
     * Gets the value of the eliminated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEliminated() {
        return eliminated;
    }

    /**
     * Sets the value of the eliminated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEliminated(Boolean value) {
        this.eliminated = value;
    }

}
