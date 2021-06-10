package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "personas", name = "persona")
public class Persona {

    
    // creacion de campos especificando id como aunto incremement pero desde el
    // back-end
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String apellido;
    private int edad;
    // especificacndo que esta tabla va hacer una relacion entre ellas m-1 en este
    // caso un pais puede tener varias personas
    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Pais pais;
    // se entiende que pasa con la explicacion de arriba XD

    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado estado;

    public Persona(String name, String apellido, int edad, Pais pais, Estado estado) {
        super();
        this.name = name;
        this.apellido = apellido;
        this.edad = edad;
        this.pais = pais;
        this.estado = estado;
    }

    public Persona() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
