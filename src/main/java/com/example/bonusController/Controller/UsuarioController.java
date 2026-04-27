package com.example.bonusController.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Usuarios")
public class UsuarioController {

    @GetMapping("/{id}")
    public String bucarPorId(@PathVariable Long id){
        return "Usuario com id " + id;
    }
    @GetMapping("/buscar")
    public String buscarPorNome(@RequestParam String nome){
    return "Usuario com nome " + nome;
    }
}
