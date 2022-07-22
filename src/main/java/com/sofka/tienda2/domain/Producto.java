package com.sofka.tienda2.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id", nullable = false)
    private Integer id;

    @Column(name = "prod_nombre", nullable = false, length = 100)
    private String prodNombre;

    @Column(name = "prod_valor", nullable = false)
    private Integer prodValor;

    @OneToMany(mappedBy = "producto", fetch = FetchType.EAGER)
    @JsonBackReference(value = "detalle-producto")
    private List<Detalle> detalle;

}