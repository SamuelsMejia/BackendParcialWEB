package com.example.backend.domain.modelmapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.backend.domain.dtos.EntidadDTO;
import com.example.backend.domain.entities.Entidad;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

    
        modelMapper.typeMap(Entidad.class, EntidadDTO.class).addMappings(mapper -> 
            mapper.skip(EntidadDTO::setContratos));

        return modelMapper;
    }

}
