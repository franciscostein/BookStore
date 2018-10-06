package br.com.bookstore.domain.dao;

import java.util.List;

public interface GenericDAO<T> {

    List<T> getAll() throws Exception;

    T getById(Long id) throws Exception;

    Long save(T object) throws Exception;

    void update(T object) throws Exception;

    void delete(Long id) throws Exception;
}