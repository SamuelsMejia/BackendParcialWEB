package com.example.backend.controller;

import com.example.backend.domain.dtos.EntidadDTO;
import com.example.backend.domain.services.EntidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entidades")
@CrossOrigin(origins = "http://localhost:4200")
public class EntidadController {

    @Autowired
    private EntidadService entidadService;

    @GetMapping
    public List<EntidadDTO> obtenerTodos() {
        return entidadService.listarTodos();
    }

    @GetMapping("/{id}")
    public EntidadDTO obtenerPorId(@PathVariable Long id) {
        return entidadService.buscarPorId(id);
    }

    @PostMapping
    public EntidadDTO crear(@RequestBody EntidadDTO dto) {
        return entidadService.crear(dto);
    }

    @PutMapping("/{id}")
    public EntidadDTO actualizar(@PathVariable Long id, @RequestBody EntidadDTO dto) {
        return entidadService.actualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        entidadService.eliminar(id);
    }
}
