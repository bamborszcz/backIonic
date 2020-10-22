package com.blam.ionic.mySql.web.mapper;

import com.blam.ionic.mySql.domain.Comida;
import com.blam.ionic.mySql.web.model.ComidaDto;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(uses = CategoriaMapper.class)
public interface ComidaMapper {

    ComidaDto ComidaToComidaDto(Comida comida);
    Comida ComidaDtoToComida(ComidaDto comidaDto);
}
