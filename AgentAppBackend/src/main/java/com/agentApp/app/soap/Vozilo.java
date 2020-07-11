//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.11 at 07:47:35 PM CEST 
//


package com.agentApp.app.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vozilo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vozilo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="markaVozila" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="modelVozila" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="klasaVozila" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vrstaMenjaca" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipGoriva" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="predjeniKM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="brsedistadeca" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="user" type="{http://zahtev.com/soap}user"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vozilo", propOrder = {
    "id",
    "markaVozila",
    "modelVozila",
    "klasaVozila",
    "vrstaMenjaca",
    "tipGoriva",
    "predjeniKM",
    "brsedistadeca",
    "user"
})
public class Vozilo {

    protected long id;
    @XmlElement(required = true)
    protected String markaVozila;
    @XmlElement(required = true)
    protected String modelVozila;
    @XmlElement(required = true)
    protected String klasaVozila;
    @XmlElement(required = true)
    protected String vrstaMenjaca;
    @XmlElement(required = true)
    protected String tipGoriva;
    @XmlElement(required = true)
    protected String predjeniKM;
    @XmlElement(required = true)
    protected String brsedistadeca;
    @XmlElement(required = true)
    protected User user;

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
     * Gets the value of the markaVozila property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkaVozila() {
        return markaVozila;
    }

    /**
     * Sets the value of the markaVozila property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkaVozila(String value) {
        this.markaVozila = value;
    }

    /**
     * Gets the value of the modelVozila property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelVozila() {
        return modelVozila;
    }

    /**
     * Sets the value of the modelVozila property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelVozila(String value) {
        this.modelVozila = value;
    }

    /**
     * Gets the value of the klasaVozila property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKlasaVozila() {
        return klasaVozila;
    }

    /**
     * Sets the value of the klasaVozila property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKlasaVozila(String value) {
        this.klasaVozila = value;
    }

    /**
     * Gets the value of the vrstaMenjaca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrstaMenjaca() {
        return vrstaMenjaca;
    }

    /**
     * Sets the value of the vrstaMenjaca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrstaMenjaca(String value) {
        this.vrstaMenjaca = value;
    }

    /**
     * Gets the value of the tipGoriva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipGoriva() {
        return tipGoriva;
    }

    /**
     * Sets the value of the tipGoriva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipGoriva(String value) {
        this.tipGoriva = value;
    }

    /**
     * Gets the value of the predjeniKM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredjeniKM() {
        return predjeniKM;
    }

    /**
     * Sets the value of the predjeniKM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredjeniKM(String value) {
        this.predjeniKM = value;
    }

    /**
     * Gets the value of the brsedistadeca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrsedistadeca() {
        return brsedistadeca;
    }

    /**
     * Sets the value of the brsedistadeca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrsedistadeca(String value) {
        this.brsedistadeca = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

}
