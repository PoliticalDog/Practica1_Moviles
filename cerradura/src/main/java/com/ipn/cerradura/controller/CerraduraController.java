package com.ipn.cerradura.controller;

import com.ipn.cerradura.service.CerraduraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cerradura")
public class CerraduraController {

    private final CerraduraService cerraduraService = new CerraduraService();

    // Endpoint para "estrella" (Cerradura de Kleene)
    @PutMapping("/estrella/{n}")
    public ResponseEntity<List<String>> cerraduraEstrella(@PathVariable int n) {
        List<String> resultado = cerraduraService.cerraduraKleene(n);
        return ResponseEntity.ok(resultado);
    }

    // Endpoint para "positiva" (Cerradura Positiva)
    @PutMapping("/positiva/{n}")
    public ResponseEntity<List<String>> cerraduraPositiva(@PathVariable int n) {
        List<String> resultado = cerraduraService.cerraduraPositiva(n);
        return ResponseEntity.ok(resultado);
    }
}
