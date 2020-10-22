package com.blam.ionic.mySql.web.controller;

import com.blam.ionic.mySql.services.ComidaServices;
import com.blam.ionic.mySql.web.model.ComidaDto;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/comida")
public class ComidaController {

    private final ComidaServices comidaServices;


    @GetMapping("/lista")
    public ResponseEntity getComidas(){

        List<ComidaDto> comidaDtoList = comidaServices.getAll();

        return new ResponseEntity(comidaDtoList,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity getComidaById(@PathVariable Long id){
        return new ResponseEntity(comidaServices.findById(id), HttpStatus.OK);
    }
}
