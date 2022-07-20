package com.sofka.tienda2.service;

import com.sofka.tienda2.domain.Cliente;
import com.sofka.tienda2.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public List<Cliente> getClients() {
        return clientRepository.findAll();
    }

    public List<Cliente> onlyGmail(){
        return clientRepository.onlyGmail();
    }

    public Cliente getClientByCorreo(String correo){
        return clientRepository.findByCorreo(correo);
    }
}
