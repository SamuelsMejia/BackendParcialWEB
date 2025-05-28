package com.example.backend.domain.dtos;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContratoDTO {
    private Long id;
    private String identificador;
    private Double valor;
    private String nombreContratante;
    private String documentoContratante;
    private String nombreContratista;
    private String documentoContratista;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
}
