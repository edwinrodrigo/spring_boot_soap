
package com.ifis.ws_ifis.wsdl.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pagoOrden complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pagoOrden"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoidentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroidentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tiposervicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="codigotransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoifi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="canaldepago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechahoratransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechahoracontabilizado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ordenpago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pagoOrden", propOrder = {
    "tipoidentificacion",
    "numeroidentificacion",
    "tiposervicio",
    "valor",
    "codigotransaccion",
    "codigoifi",
    "sucursal",
    "canaldepago",
    "provincia",
    "fechahoratransaccion",
    "fechahoracontabilizado",
    "ordenpago"
})
public class PagoOrden {

    protected String tipoidentificacion;
    protected String numeroidentificacion;
    protected String tiposervicio;
    protected long valor;
    protected String codigotransaccion;
    protected String codigoifi;
    protected String sucursal;
    protected String canaldepago;
    protected String provincia;
    protected String fechahoratransaccion;
    protected String fechahoracontabilizado;
    protected String ordenpago;

    /**
     * Gets the value of the tipoidentificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoidentificacion() {
        return tipoidentificacion;
    }

    /**
     * Sets the value of the tipoidentificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoidentificacion(String value) {
        this.tipoidentificacion = value;
    }

    /**
     * Gets the value of the numeroidentificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroidentificacion() {
        return numeroidentificacion;
    }

    /**
     * Sets the value of the numeroidentificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroidentificacion(String value) {
        this.numeroidentificacion = value;
    }

    /**
     * Gets the value of the tiposervicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiposervicio() {
        return tiposervicio;
    }

    /**
     * Sets the value of the tiposervicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiposervicio(String value) {
        this.tiposervicio = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     */
    public long getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     */
    public void setValor(long value) {
        this.valor = value;
    }

    /**
     * Gets the value of the codigotransaccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigotransaccion() {
        return codigotransaccion;
    }

    /**
     * Sets the value of the codigotransaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigotransaccion(String value) {
        this.codigotransaccion = value;
    }

    /**
     * Gets the value of the codigoifi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoifi() {
        return codigoifi;
    }

    /**
     * Sets the value of the codigoifi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoifi(String value) {
        this.codigoifi = value;
    }

    /**
     * Gets the value of the sucursal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSucursal() {
        return sucursal;
    }

    /**
     * Sets the value of the sucursal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSucursal(String value) {
        this.sucursal = value;
    }

    /**
     * Gets the value of the canaldepago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanaldepago() {
        return canaldepago;
    }

    /**
     * Sets the value of the canaldepago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanaldepago(String value) {
        this.canaldepago = value;
    }

    /**
     * Gets the value of the provincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Sets the value of the provincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Gets the value of the fechahoratransaccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechahoratransaccion() {
        return fechahoratransaccion;
    }

    /**
     * Sets the value of the fechahoratransaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechahoratransaccion(String value) {
        this.fechahoratransaccion = value;
    }

    /**
     * Gets the value of the fechahoracontabilizado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechahoracontabilizado() {
        return fechahoracontabilizado;
    }

    /**
     * Sets the value of the fechahoracontabilizado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechahoracontabilizado(String value) {
        this.fechahoracontabilizado = value;
    }

    /**
     * Gets the value of the ordenpago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdenpago() {
        return ordenpago;
    }

    /**
     * Sets the value of the ordenpago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdenpago(String value) {
        this.ordenpago = value;
    }

}
