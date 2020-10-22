package com.blam.ionic.mySql.web.mapper;

import com.blam.ionic.mySql.domain.Categoria;
import com.blam.ionic.mySql.web.model.CategoriaDto;
import org.mapstruct.Mapper;

@Mapper(uses = ComidaMapper.class)
public interface CategoriaMapper {

    CategoriaDto categoriaDtoToCategoria(Categoria categoria);
    Categoria categoriaToCategoriaDto(CategoriaDto categoriaDto);
}
