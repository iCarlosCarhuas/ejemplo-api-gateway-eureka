package org.pedido.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @GetMapping
    public String index() {
        return "Corriendo microservicio 3 (Pedido)";
    }
}
