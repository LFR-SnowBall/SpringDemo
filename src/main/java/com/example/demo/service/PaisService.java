package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Pais;
import com.example.demo.repository.PaisRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class PaisService implements PaisRepository{

    @Autowired
    private PaisRepository paisRepository;

    @Override
    public List<Pais> findAll() {
        // TODO Auto-generated method stub
        return paisRepository.findAll();
    }

    @Override
    public List<Pais> findAll(Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Pais> findAllById(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Pais> List<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void flush() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public <S extends Pais> S saveAndFlush(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Pais> List<S> saveAllAndFlush(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Pais> entities) {
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
    public Pais getOne(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Pais getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Pais> List<S> findAll(Example<S> example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Pais> List<S> findAll(Example<S> example, Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Page<Pais> findAll(Pageable arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void delete(Pais arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll(Iterable<? extends Pais> arg0) {
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
    public Optional<Pais> findById(Long arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Pais> S save(S arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Pais> long count(Example<S> arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public <S extends Pais> boolean exists(Example<S> arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public <S extends Pais> Page<S> findAll(Example<S> arg0, Pageable arg1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Pais> Optional<S> findOne(Example<S> arg0) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
