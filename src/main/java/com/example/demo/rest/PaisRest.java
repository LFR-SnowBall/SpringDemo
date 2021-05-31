package com.example.demo.rest;

import java.util.List;

import com.example.demo.model.Pais;
import com.example.demo.service.PaisService;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//da entender a spring que es un rest
@RestController
// asigna la ruta para la manipulación
@RequestMapping("/pais/")
public class PaisRest {
    @Autowired
    private PaisService paisService;

    //retornara todos los paises mediante peticion get en este caso
    @GetMapping
    private ResponseEntity<List<Pais>> gelAllPais(){
        return ResponseEntity.ok(paisService.findAll());
    }

    
}
