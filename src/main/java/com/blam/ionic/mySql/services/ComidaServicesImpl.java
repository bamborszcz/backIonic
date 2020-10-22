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

@RequiredArgsConstructor
@Service
public class ComidaServicesImpl implements ComidaServices {


    private final ComidaMapper comidaMapper;

    private final ComidaRepository comidaRepository;

    private final CategoriaRepository categoriaRepository;
    private final CategoriaMapper categoriaMapper;

    @Override
    public List<ComidaDto> getAll() {
       List<Comida> comidaList = comidaRepository.findAll();
        List<ComidaDto>comidaDtoList = new ArrayList<>();

        for (Comida comida: comidaList) {
            Categoria categoria = categoriaRepository.findById(comida.getCategoria().getId()).orElseThrow(RuntimeException::new);
            CategoriaDto categoriaDto = categoriaMapper.categoriaDtoToCategoria(categoria);
            ComidaDto comidaDto = comidaMapper.ComidaToComidaDto(comida);
            comidaDto.setCategoria(categoriaDto);
            comidaDtoList.add(comidaDto);
        }

      //return comidaRepository.findAll().stream().map(comidaMapper::comidaToComidaDto).collect(Collectors.toList()); // los busca a todos y crea la lista.
       /* List<ComidaDto>comidaDtoList = new ArrayList<>();
        for (Comida comida: comidaList) {
            ComidaDto comidaDto = ComidaDto.builder().id(comida.getId())
                    .categoria(CategoriaDto.builder().id(comida.getCategoria().getId()).build())
                    .description(comida.getDescription())
                    .fotoUrl(comida.getFotoUrl())
                    .title(comida.getTitle())
                    .videoUrl(comida.getVideoUrl()).build();

            comidaDtoList.add(comidaDto);
        }*/

        return comidaDtoList;
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
