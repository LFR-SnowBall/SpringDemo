package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Estado;
import com.example.demo.repository.EstadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class EstadoService implements EstadoRepository{
    //crea inyeccion ala estxancia
    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public List<Estado> findAll() {
        // TODO Auto-generated method stub
        return estadoRepository.findAll();
    }
    
    //se puedenc rear metodos en back-end para control de la base de datos mediante los get y los metodos
    // como por ejemplo en este caso solo trae los estados de cierto pais
    public List<Estado> findAllEstadosByidPais(int id){
        List<Estado> estadosRespuestas=new ArrayList<>();
        List<Estado> estados = estadoRepository.findAll();
        for(int i =0; i<estados.size(); i++){
            if(estados.get(i).getPais().getId()==id){
                estadosRespuestas.add(estados.get(i));
            }
        }
        return estadosRespuestas;
    }

    //lista todo lo de la tabla en este caso todos los estados
    @Override
    public List<Estado> findAll(Sort sort) {
        // TODO Auto-generated method stub
        return estadoRepository.findAll(sort);
    }

    @Override
    public List<Estado> findAllById(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Estado> List<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void flush() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public <S extends Estado> S saveAndFlush(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Estado> List<S> saveAllAndFlush(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Estado> entities) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllInBatch() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Estado getOne(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Estado getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Estado> List<S> findAll(Example<S> example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Estado> List<S> findAll(Example<S> example, Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Page<Estado> findAll(Pageable arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void delete(Estado arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll(Iterable<? extends Estado> arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteById(Long arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean existsById(Long arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Optional<Estado> findById(Long arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Estado> S save(S arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Estado> long count(Example<S> arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public <S extends Estado> boolean exists(Example<S> arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public <S extends Estado> Page<S> findAll(Example<S> arg0, Pageable arg1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Estado> Optional<S> findOne(Example<S> arg0) {
        // TODO Auto-generated method stub
        return null;
    }
}
