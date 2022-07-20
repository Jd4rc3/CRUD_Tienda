package com.sofka.tienda2.preuba;

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

    @OneToMany(mappedBy = "prodIdProducto")
    private Set<Detalle> detalles = new LinkedHashSet<>();

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getProdNombre() {return prodNombre;}

    public void setProdNombre(String prodNombre) {this.prodNombre = prodNombre;}

    public Integer getProdValor() {return prodValor;}

    public void setProdValor(Integer prodValor) {this.prodValor = prodValor;}

    public Set<Detalle> getDetalles() {return detalles;}

    public void setDetalles(Set<Detalle> detalles) {this.detalles = detalles;}

}