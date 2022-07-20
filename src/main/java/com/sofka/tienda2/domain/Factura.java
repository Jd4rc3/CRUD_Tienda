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
import javax.persistence.Table;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "factura")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fac_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ven_id_vendedor", nullable = false)
    @JsonManagedReference(value = "vendedor-factura")
    private Vendedor venIdVendedor;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonBackReference(value = "cliente-factura")
    @JoinColumn(name = "cli_id_cliente", nullable = false)
    private Cliente cliIdCliente;

    @Column(name = "fac_descuento_general", nullable = false)
    private Integer facDescuentoGeneral;

    @OneToMany(mappedBy = "facIdFactura")
    @JsonManagedReference(value = "factura-detalle")
    private Set<Detalle> detalles = new LinkedHashSet<>();
}