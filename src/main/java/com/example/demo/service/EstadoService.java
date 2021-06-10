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
public class EstadoService implements EstadoRepository {

    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public List<Estado> findAll() {
        return estadoRepository.findAll();
    }
    //se puedenc rear metodos en back-end para control de la base de datos mediante los get y los metodos
    // como por ejemplo en este caso solo trae los estados de cierto pais
    public List<Estado> findAllByCountry(Long id) {
        List<Estado> estadosRespuesta = new ArrayList<>();
        List<Estado> estados = estadoRepository.findAll();
        for (int i = 0; i < estados.size(); i++) {
            if (estados.get(i).getPais().getId() == id) {
                estadosRespuesta.add(estados.get(i));
            }
        }
        return estadosRespuesta;
    }
    //lista todo lo de la tabla en este caso todos los estados
    @Override
    public List<Estado> findAll(Sort sort) {
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
    public void deleteInBatch(Iterable<Estado> entities) {
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
    public Page<Estado> findAll(Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Estado> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Estado> findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean existsById(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Estado entity) {
        estadoRepository.delete(entity);
    }

    @Override
    public void deleteAll(Iterable<? extends Estado> entities) {
        estadoRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        estadoRepository.deleteAll();
    }

    @Override
    public <S extends Estado> Optional<S> findOne(Example<S> example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Estado> Page<S> findAll(Example<S> example, Pageable pageable) {
        return estadoRepository.findAll(example, pageable);
    }

    @Override
    public <S extends Estado> long count(Example<S> example) {
        return estadoRepository.count(example);
    }

    @Override
    public <S extends Estado> boolean exists(Example<S> example) {
        return estadoRepository.exists(example);
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
    public Estado getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        // TODO Auto-generated method stub
        
    }

}