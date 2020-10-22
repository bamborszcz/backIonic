package com.blam.ionic.mySql.web.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data // tiene to do lo de lombok
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoriaDto implements Serializable {

    @Null
    private Long id;

    @NotBlank
    private String name;

    private List<ComidaDto> comida = new ArrayList<>();

}
