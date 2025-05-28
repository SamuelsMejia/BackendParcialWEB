package com.example.backend.domain.services;

import com.example.backend.domain.dtos.EntidadDTO;
import com.example.backend.domain.entities.Entidad;
import com.example.backend.repository.EntidadRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class EntidadService {

    @Autowired
    private EntidadRepository entidadRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<EntidadDTO> listarTodos() {
        return entidadRepo.findAll()
                .stream()
                .map(e -> modelMapper.map(e, EntidadDTO.class))
                .collect(Collectors.toList());
    }

    public EntidadDTO buscarPorId(Long id) {
        Entidad entidad = entidadRepo.findById(id).orElseThrow();
        return modelMapper.map(entidad, EntidadDTO.class);
    }

    public EntidadDTO crear(EntidadDTO dto) {
        Entidad entidad = modelMapper.map(dto, Entidad.class);
        entidad = entidadRepo.save(entidad);
        return modelMapper.map(entidad, EntidadDTO.class);
    }
    

    public EntidadDTO actualizar(Long id, EntidadDTO dto) {
        Entidad entidad = entidadRepo.findById(id).orElseThrow();
        entidad.setNit(dto.getNit());
        entidad.setNombre(dto.getNombre());
        entidad = entidadRepo.save(entidad);
        return modelMapper.map(entidad, EntidadDTO.class);
    }

    public void eliminar(Long id) {
        entidadRepo.deleteById(id);
    }
}