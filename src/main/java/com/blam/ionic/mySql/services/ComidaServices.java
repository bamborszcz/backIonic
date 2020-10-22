package com.blam.ionic.mySql.services;

import com.blam.ionic.mySql.domain.Comida;
import com.blam.ionic.mySql.web.model.ComidaDto;

import java.util.List;

public interface ComidaServices {

    List<ComidaDto>getAll();
    List<Comida>getAllComida();

    ComidaDto findById(Long id);
}
