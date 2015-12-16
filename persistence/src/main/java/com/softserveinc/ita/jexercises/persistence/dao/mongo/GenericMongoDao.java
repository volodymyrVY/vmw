/*
package com.softserveinc.ita.jexercises.persistence.dao.mongo;

import com.softserveinc.ita.jexercises.persistence.dao.GenericDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public interface GenericMongoDao<T,PK extends Serializable> implements GenericDao<T,PK extends Serializable> {

    @Override
    T create(T object);

    @Override
    T update(T object);

    @Override
    void delete(T object);

    @Override
    void deleteById(PK id);

    @Override
    T findById(PK id);

    @Override
    List<T> findAll();
}*/
