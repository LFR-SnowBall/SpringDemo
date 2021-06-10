package com.example.demo.rest;

import java.util.List;

import com.example.demo.model.Estado;
import com.example.demo.service.EstadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estados/")
public class EstadoRest {
    @Autowired 
    private EstadoService estadoService;

    //se le dice que recibira una variable id pais la cual limpiara en la parte de abajo en el metodo 
    @GetMapping("{id}")
    private ResponseEntity<List<Estado>> getAllEstadosBYPais(@PathVariable("id") Long id_pais){
        return ResponseEntity.ok(estadoService.findAllByCountry(id_pais));
    }
    
}
