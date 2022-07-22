package com.sofka.tienda2.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
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
        @JoinColumn(name = "fac_id_factura", nullable = false)
        private Factura facIdFactura;

        @OneToMany(mappedBy = "detalles")
        @JsonManagedReference(value = "producto-detalle")
        @JoinColumn(name = "prod_id_producto", nullable = false)
        private List<Producto> productsList = new ArrayList<>();

    @Column(name = "det_cantidad", nullable = false)
    private Integer detCantidad;

    @Column(name = "det_iva", nullable = false)
    private Integer detIva;

    @Column(name = "det_descuento", nullable = false)
    private Integer detDescuento;
}