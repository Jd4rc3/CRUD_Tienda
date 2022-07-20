package com.sofka.tienda2.repository;

import com.sofka.tienda2.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {}