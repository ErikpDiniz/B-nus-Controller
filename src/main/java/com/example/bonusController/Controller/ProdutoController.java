package com.example.bonusController.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @GetMapping
    public ResponseEntity<String> listarProdutos() {
        return ResponseEntity.ok("lista de produtos");
    }

    @PostMapping
    public ResponseEntity<String> criarProduto(@RequestBody String produto) {
        return ResponseEntity.status(HttpStatus.CREATED).body("Produto criado");
    }

    @PutMapping
    public ResponseEntity<String> atualizarProduto(@PathVariable long id, @RequestBody String produto){
        return ResponseEntity.ok("Produto atualizado");
    }

    @DeleteMapping
    public ResponseEntity<String> deletarProduto(@PathVariable Long id) {
        return ResponseEntity.ok("Produto deletado");
    }

}
