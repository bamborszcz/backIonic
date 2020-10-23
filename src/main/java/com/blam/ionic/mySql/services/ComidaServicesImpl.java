package com.blam.ionic.mySql.services;

import com.blam.ionic.mySql.domain.Categoria;
import com.blam.ionic.mySql.domain.Comida;
import com.blam.ionic.mySql.repository.CategoriaRepository;
import com.blam.ionic.mySql.repository.ComidaRepository;
import com.blam.ionic.mySql.web.mapper.CategoriaMapper;
import com.blam.ionic.mySql.web.mapper.ComidaMapper;
import com.blam.ionic.mySql.web.model.CategoriaDto;
import com.blam.ionic.mySql.web.model.ComidaDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ComidaServicesImpl implements ComidaServices {


    private final ComidaMapper comidaMapper;

    private final ComidaRepository comidaRepository;

    private final CategoriaRepository categoriaRepository;
    private final CategoriaMapper categoriaMapper;

    @Override
    public List<ComidaDto> getAll() {

        return comidaRepository.findAll().stream().map(comidaMapper::ComidaToComidaDto).collect(Collectors.toList()); //
    }

    @Override
    public List<Comida> getAllComida() {
        return comidaRepository.findAll();
    }

    @Override
    public ComidaDto findById(Long id) {

        return comidaMapper.ComidaToComidaDto(comidaRepository.findById(id).orElseThrow(RuntimeException::new));
    }
}
