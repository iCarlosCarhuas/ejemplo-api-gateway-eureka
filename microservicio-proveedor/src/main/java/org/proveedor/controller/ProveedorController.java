package org.proveedor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proveedor")
public class ProveedorController {

    @GetMapping
    public String index() {
        return "Corriendo microservicio 1 (Proveedor)";
    }
}
