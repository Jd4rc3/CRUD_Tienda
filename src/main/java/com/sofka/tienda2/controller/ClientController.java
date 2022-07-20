package com.sofka.tienda2.controller;

import com.sofka.tienda2.domain.Cliente;
import com.sofka.tienda2.service.ClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/")
    public List<Cliente> getClientes() {
        return clientService.getClients();
    }

    @GetMapping("/gmail")
    public List<Cliente> getClientesGmail() {
        return clientService.onlyGmail();
    }

    @GetMapping("/{correo}/{nombre}")
    public void getClientByCorreo(@PathVariable(value = "correo") String correo,
            @PathVariable(value = "nombre") String nombre) {
        System.out.println("Correo: " + correo + " Nombre: " + nombre);
        //        clientService.getClientByCorreo(nombre);
        //        ?key=value
        //        &key=value
    }

    @PostMapping(value = "/new", consumes = "application/json")
    public void newClient(@RequestBody String cliente) {
        log.info("Nuevo cliente: " + cliente);
    }
}