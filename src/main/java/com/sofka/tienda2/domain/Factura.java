package com.sofka.tienda2.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "factura")
@Entity
public class Factura {
    @Id
    @Column(name = "fac_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ven_id_vendedor")
    private Integer vendedor;

    @JsonBackReference(value = "cliente-factura") // evita que se intente serializar otro cliente
    @JoinColumn(name = "cli_id_cliente")
    @ManyToOne(targetEntity = Cliente.class)
    private Cliente cliente;

    @Column(name = "fac_descuento_general")
    private Integer descuento;


}