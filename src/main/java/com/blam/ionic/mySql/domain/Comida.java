package com.blam.ionic.mySql.domain;

import com.sun.istack.Nullable;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity // persiste la tabla
@Getter
@Setter
@AllArgsConstructor // crea un contructor con todos los argumentos
@NoArgsConstructor // crea un contructor vacio
@Builder // para llamar al constructor
public class Comida implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String title;

    private String description;

    private String fotoUrl;

    private String videoUrl;

    @ManyToOne()
    @JoinTable(name = "categoria_comida")
    private Categoria categoria;
}
