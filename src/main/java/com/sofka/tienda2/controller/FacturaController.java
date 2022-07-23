package com.sofka.tienda2.controller;

import com.sofka.tienda2.domain.Factura;
import com.sofka.tienda2.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factura")
public class FacturaController {
    @Autowired
    FacturaService facturaService;

    @GetMapping("/{id}")
    public Factura findById(@PathVariable(name = "id") Integer id) {
        return facturaService.findById(id);
    }
}
