package com.sofka.tienda2.service;

import com.sofka.tienda2.domain.Cliente;
import com.sofka.tienda2.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClienteRepository clientRepository;

    public List<Cliente> getClients() {
        return clientRepository.findAll();
    }

    public Cliente getClient(Integer id) {
        return clientRepository.findById(id).get();
    }
}
