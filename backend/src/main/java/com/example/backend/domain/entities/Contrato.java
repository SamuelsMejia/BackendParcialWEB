package com.example.backend.domain.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String identificador;
    private Double valor;
    private String nombreContratante;
    private String documentoContratante;
    private String nombreContratista;
    private String documentoContratista;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;

    @ManyToOne
    @JoinColumn(name = "entidad_id")
    private Entidad entidad;
}
