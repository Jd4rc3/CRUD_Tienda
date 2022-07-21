package com.sofka.tienda2.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
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


    @JsonManagedReference(value = "cliente-factura")
    @OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
    private List<Factura> factura = new ArrayList<>();
}