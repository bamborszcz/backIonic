package com.blam.ionic.mySql.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Entity // persiste la tabla
@Getter
@Setter
@AllArgsConstructor // crea un contructor con todos los argumentos
@NoArgsConstructor // crea un contructor vacio
@Builder // para llamar al constructor
public class Categoria implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String name;


    @OneToMany(mappedBy = "categoria", fetch = FetchType.EAGER)// trae to do lo mapeado
    private List<Comida> comida = new ArrayList<>();
}
