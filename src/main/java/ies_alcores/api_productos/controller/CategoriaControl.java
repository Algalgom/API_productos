package ies_alcores.api_productos.controller;


import ies_alcores.api_productos.model.Categoria;
import ies_alcores.api_productos.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/categoria")
public class CategoriaControl {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public ResponseEntity<List<Categoria>> listar(){

        return ResponseEntity.ok(this.categoriaService.findAll());
    }
}
