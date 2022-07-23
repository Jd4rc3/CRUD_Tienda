package com.sofka.tienda2.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity /// respresentación de la tabla
@Table(name = "cliente")
public class Cliente {
    @Id
    @Column(name = "cli_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cli_nombre")
    private String nombre;

    @Column(name = "cli_telefono")
    private String telefono;

    @Column(name = "cli_correo")
    private String correo;

    @JsonBackReference(value = "factura-cliente")
    @OneToMany(mappedBy = "clienta", fetch = FetchType.EAGER)
    private List<Factura> factura = new ArrayList<>();
}