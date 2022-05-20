package com.luciano.deliveryapi.controller;

import com.luciano.deliveryapi.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {
        var cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("João da Silva");
        cliente1.setEmail("joao@email.com");
        cliente1.setTelefone("41 9999-1234");

        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Maria de Souza");
        cliente2.setEmail("maria@email.com");
        cliente2.setTelefone("41 8888-1234");

        return Arrays.asList(cliente1, cliente2);

    }

}
