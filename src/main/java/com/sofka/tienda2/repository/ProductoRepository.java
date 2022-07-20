package com.sofka.tienda2.repository;

import com.sofka.tienda2.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {}