package com.blam.ionic.mySql.services;

import com.blam.ionic.mySql.domain.Categoria;
import com.blam.ionic.mySql.repository.CategoriaRepository;
import com.blam.ionic.mySql.web.mapper.CategoriaMapper;
import com.blam.ionic.mySql.web.model.CategoriaDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CategoriaServicesImpl implements CategoriaServices {

    private final CategoriaRepository categoriaRepository;
    private final CategoriaMapper categoriaMapper;


    @Override
    public List<CategoriaDto> getAllCategorias() {
        //comidaRepository.findAll().stream().map(comidaMapper::ComidaToComidaDto).collect(Collectors.toList());
        return categoriaRepository.findAll().stream().map(categoria -> CategoriaDto.builder().categoria(categoria.getCategoria()).id(categoria.getId()).build()).collect(Collectors.toList());
    }


    @Override
    public CategoriaDto findById(Long id) {
        return null;
    }
}
