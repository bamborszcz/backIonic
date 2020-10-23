package com.blam.ionic.mySql.web.mapper;

import com.blam.ionic.mySql.domain.Comida;
import com.blam.ionic.mySql.web.model.ComidaDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper
public interface ComidaMapper {

    ComidaDto ComidaToComidaDto(Comida comida);
    Comida ComidaDtoToComida(ComidaDto comidaDto);
}
