package com.blam.ionic.mySql.web.controller;

import com.blam.ionic.mySql.services.CategoriaServices;
import com.blam.ionic.mySql.web.model.CategoriaDto;
import com.blam.ionic.mySql.web.model.ComidaDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    private final CategoriaServices categoriaServices;

    @CrossOrigin(origins = "http://localhost:8100")
    @GetMapping("/lista")
    public ResponseEntity getAllCategorias(){

        List<CategoriaDto> categoriaDtos = categoriaServices.getAllCategorias();
        System.out.println(categoriaDtos);
        return new ResponseEntity(categoriaDtos, HttpStatus.OK);
    }
}
