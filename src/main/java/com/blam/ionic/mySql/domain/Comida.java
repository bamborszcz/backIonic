package com.blam.ionic.mySql.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "fotoUrl")
    private String fotoUrl;

    @Column(name = "videoUrl")
    private String videoUrl;

    @ManyToOne()
    @JoinColumn(name = "categoria",referencedColumnName = "categoria")
    private Categoria categoria;
}
