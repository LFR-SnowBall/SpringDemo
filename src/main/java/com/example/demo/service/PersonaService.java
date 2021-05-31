package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements PersonaRepository{

    private PersonaRepository personaRepository;

    @Override
    public List<Persona> findAll() {
        // TODO Auto-generated method stub
        return personaRepository.findAll();
    }

    @Override
    public List<Persona> findAll(Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Persona> findAllById(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Persona> List<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void flush() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public <S extends Persona> S saveAndFlush(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Persona> List<S> saveAllAndFlush(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Persona> entities) {
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
    public Persona getOne(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Persona getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Persona> List<S> findAll(Example<S> example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Persona> List<S> findAll(Example<S> example, Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Page<Persona> findAll(Pageable arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void delete(Persona arg0) {
        personaRepository.delete(arg0);
        
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll(Iterable<? extends Persona> arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteById(Long arg0) {
        personaRepository.deleteById(arg0);
        
    }

    @Override
    public boolean existsById(Long arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Optional<Persona> findById(Long arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Persona> S save(S arg0) {
        // TODO Auto-generated method stub
        return personaRepository.save(arg0);
    }

    @Override
    public <S extends Persona> long count(Example<S> arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public <S extends Persona> boolean exists(Example<S> arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public <S extends Persona> Page<S> findAll(Example<S> arg0, Pageable arg1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Persona> Optional<S> findOne(Example<S> arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    
    
}
