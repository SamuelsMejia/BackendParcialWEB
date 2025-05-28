package com.example.backend.repository;

import com.example.backend.domain.entities.Entidad;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EntidadRepository extends JpaRepository<Entidad, Long> {}
