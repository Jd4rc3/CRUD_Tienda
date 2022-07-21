package com.sofka.tienda2.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
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

@Entity
@Data
@Table(name = "vendedor")
public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ven_id", nullable = false)
    private Integer id;

    @Column(name = "ven_nombre", nullable = false, length = 100)
    private String venNombre;

    @Column(name = "ven_correo", nullable = false, length = 100)
    private String venCorreo;

    //    @OneToMany(mappedBy = "venIdVendedor")
    //    @JsonBackReference
    //    private Set<Factura> facturas = new LinkedHashSet<>();

}