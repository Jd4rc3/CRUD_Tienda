package com.sofka.tienda2.preuba;

import com.sofka.tienda2.domain.Factura;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detalle")
public class Detalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "det_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fac_id_factura", nullable = false)
    private Factura facIdFactura;

    @Column(name = "det_cantidad", nullable = false)
    private Integer detCantidad;

    @Column(name = "det_iva", nullable = false)
    private Integer detIva;

    @Column(name = "det_descuento", nullable = false)
    private Integer detDescuento;

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public Factura getFacIdFactura() {return facIdFactura;}

    public void setFacIdFactura(Factura facIdFactura) {this.facIdFactura = facIdFactura;}

    public Integer getDetCantidad() {return detCantidad;}

    public void setDetCantidad(Integer detCantidad) {this.detCantidad = detCantidad;}

    public Integer getDetIva() {return detIva;}

    public void setDetIva(Integer detIva) {this.detIva = detIva;}

    public Integer getDetDescuento() {return detDescuento;}

    public void setDetDescuento(Integer detDescuento) {this.detDescuento = detDescuento;}

}