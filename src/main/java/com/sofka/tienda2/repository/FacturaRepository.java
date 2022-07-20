package com.sofka.tienda2.repository;

import com.sofka.tienda2.domain.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura, Integer> {}