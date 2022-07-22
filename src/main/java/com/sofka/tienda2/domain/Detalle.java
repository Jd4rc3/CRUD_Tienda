package com.sofka.tienda2.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "detalle")
@Data
public class Detalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "det_id", nullable = false)
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JsonBackReference(value = "factura-detalle")
    @JoinColumn(name = "fac_id_factura", nullable = false, insertable = false, updatable = false)
    private Factura facIdFactura;

    @ManyToOne(targetEntity = Producto.class, fetch = FetchType.EAGER)
    @JsonManagedReference(value = "detalle-producto")
    @JoinColumn(name = "prod_id_producto", nullable = false)
    private Producto producto;

    @Column(name = "det_cantidad", nullable = false)
    private Integer detCantidad;

    @Column(name = "det_iva", nullable = false)
    private Integer detIva;

    @Column(name = "det_descuento", nullable = false)
    private Integer detDescuento;
}