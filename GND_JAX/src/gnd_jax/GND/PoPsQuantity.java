//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.27 at 11:31:49 AM PDT 
//


package gnd_jax.GND;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PoPs_quantity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PoPs_quantity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="double" type="{}PQU_double"/>
 *         &lt;element name="integer" type="{}PQU_integer"/>
 *         &lt;element name="fraction" type="{}PQU_fraction"/>
 *         &lt;element name="string" type="{}PQU_string"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoPs_quantity", propOrder = {
    "_double",
    "integer",
    "fraction",
    "string"
})
public class PoPsQuantity {

    @XmlElement(name = "double")
    protected PQUDouble _double;
    protected PQUInteger integer;
    protected PQUFraction fraction;
    protected PQUString string;

    /**
     * Gets the value of the double property.
     * 
     * @return
     *     possible object is
     *     {@link PQUDouble }
     *     
     */
    public PQUDouble getDouble() {
        return _double;
    }

    /**
     * Sets the value of the double property.
     * 
     * @param value
     *     allowed object is
     *     {@link PQUDouble }
     *     
     */
    public void setDouble(PQUDouble value) {
        this._double = value;
    }

    /**
     * Gets the value of the integer property.
     * 
     * @return
     *     possible object is
     *     {@link PQUInteger }
     *     
     */
    public PQUInteger getInteger() {
        return integer;
    }

    /**
     * Sets the value of the integer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PQUInteger }
     *     
     */
    public void setInteger(PQUInteger value) {
        this.integer = value;
    }

    /**
     * Gets the value of the fraction property.
     * 
     * @return
     *     possible object is
     *     {@link PQUFraction }
     *     
     */
    public PQUFraction getFraction() {
        return fraction;
    }

    /**
     * Sets the value of the fraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link PQUFraction }
     *     
     */
    public void setFraction(PQUFraction value) {
        this.fraction = value;
    }

    /**
     * Gets the value of the string property.
     * 
     * @return
     *     possible object is
     *     {@link PQUString }
     *     
     */
    public PQUString getString() {
        return string;
    }

    /**
     * Sets the value of the string property.
     * 
     * @param value
     *     allowed object is
     *     {@link PQUString }
     *     
     */
    public void setString(PQUString value) {
        this.string = value;
    }

}