package com.sofka.tienda2.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "factura")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fac_id")
    private Integer id;

    @OneToOne(optional = false, targetEntity = Cliente.class)
    @JsonBackReference(value = "cliente-factura")
    @JoinColumn(referencedColumnName = "cli_id")
    @Column(name = "cli_id")
    private Cliente cliente_id;


    @Column(name = "fac_descuento_general")
    private Integer total;

//    @Column(name = "ven_id_vender")
//    private Integer vender_id;


}
