package com.blam.ionic.mySql.services;

import com.blam.ionic.mySql.domain.Categoria;
import com.blam.ionic.mySql.web.model.CategoriaDto;

import java.util.List;

public interface CategoriaServices {

    List<CategoriaDto> getAllCategorias();
    CategoriaDto findById(Long id);
}
