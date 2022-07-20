package com.sofka.tienda2.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cli_id")
    private Integer id;

    @Column(name = "cli_nombre")
    private String nombre;

    @Column(name = "cli_telefono")
    private String telefono;

    @Column(name = "cli_correo")
    private String correo;

    @OneToOne(mappedBy = "cli_id", fetch = FetchType.EAGER, targetEntity = Factura.class)
    @JsonManagedReference(value = "cliente-factura")
    private Factura factura;
}
