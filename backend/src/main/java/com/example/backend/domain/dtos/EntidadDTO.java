package com.example.backend.domain.dtos;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntidadDTO {
    private Long id;
    private String nit;
    private String nombre;
    private List<ContratoDTO> contratos; 
}
