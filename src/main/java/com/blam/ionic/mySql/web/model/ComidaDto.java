package com.blam.ionic.mySql.web.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import java.io.Serializable;

@Data // tiene to do lo de lombok
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ComidaDto implements Serializable {

    @Null
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String description;

    @NotBlank
    private String fotoUrl;

    @NotBlank
    private String videoUrl;

    private CategoriaDto categoria;
}
