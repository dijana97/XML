//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 

// Generated on: 2020.07.11 at 12:36:33 PM CEST 

//


package com.agentApp.app.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for oglas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oglas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="mesto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="slobodanOd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="slobodanDo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vozilo" type="{http://zahtev.com/soap}vozilo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oglas", propOrder = {
    "id",
    "mesto",
    "slobodanOd",
    "slobodanDo",
    "vozilo"
})
public class Oglas {

    protected long id;
    @XmlElement(required = true)
    protected String mesto;
    @XmlElement(required = true)
    protected String slobodanOd;
    @XmlElement(required = true)
    protected String slobodanDo;
    @XmlElement(required = true)
    protected Vozilo vozilo;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the mesto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesto() {
        return mesto;
    }

    /**
     * Sets the value of the mesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesto(String value) {
        this.mesto = value;
    }

    /**
     * Gets the value of the slobodanOd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlobodanOd() {
        return slobodanOd;
    }

    /**
     * Sets the value of the slobodanOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlobodanOd(String value) {
        this.slobodanOd = value;
    }

    /**
     * Gets the value of the slobodanDo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlobodanDo() {
        return slobodanDo;
    }

    /**
     * Sets the value of the slobodanDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlobodanDo(String value) {
        this.slobodanDo = value;
    }

    /**
     * Gets the value of the vozilo property.
     * 
     * @return
     *     possible object is
     *     {@link Vozilo }
     *     
     */
    public Vozilo getVozilo() {
        return vozilo;
    }

    /**
     * Sets the value of the vozilo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vozilo }
     *     
     */
    public void setVozilo(Vozilo value) {
        this.vozilo = value;
    }

}
