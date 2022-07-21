package com.sofka.tienda2.service;

import com.sofka.tienda2.domain.Factura;
import com.sofka.tienda2.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaService {
    @Autowired
    private FacturaRepository facturaRepository;

    public Factura findById(Integer id) {
        return facturaRepository.findById(id).orElse(null);
    }
}
