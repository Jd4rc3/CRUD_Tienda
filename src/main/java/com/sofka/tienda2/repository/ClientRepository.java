package com.sofka.tienda2.repository;

import com.sofka.tienda2.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClientRepository extends JpaRepository<Cliente, Integer> {

    @Query("SELECT c FROM Cliente c WHERE c.correo LIKE '%@gmail%'")
    public List<Cliente> onlyGmail();

    @Query("SELECT c FROM Cliente c WHERE c.correo LIKE %:correo%")
    public Cliente findByCorreo(@Param("correo") String correo);

}
