package com.sofka.tienda2.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.LinkedHashSet;
import java.util.Set;


@Data
@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cli_id", nullable = false)
    private Integer id;

    @Column(name = "cli_nombre", nullable = false, length = 100)
    private String cliNombre;

    @Column(name = "cli_telefono", length = 50)
    private String cliTelefono;

    @Column(name = "cli_correo", nullable = false, length = 100)
    private String cliCorreo;

    @OneToMany(mappedBy = "cliIdCliente") //Al atributo de la clase con la referencia al id del cliente
    @JsonManagedReference(value = "cliente-factura")
    private Set<Factura> facturas = new LinkedHashSet<>();

}