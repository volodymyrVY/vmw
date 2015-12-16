package com.softserveinc.ita.jexercises.persistence.dao.mongo.impl;

import com.softserveinc.ita.jexercises.persistence.dao.GenericDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public class GenericMongoDaoImpl <T,PK extends Serializable> implements GenericDao<T,PK> {
    @Autowired
    private MongoOperations mongoOperation;

    private Class<T> entityClass;

    public GenericMongoDaoImpl() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass()
                .getGenericSuperclass();
        entityClass = (Class) genericSuperclass.getActualTypeArguments()[0];
    }

    public T create(T object){
        mongoOperation.insert(object);
        return object;
    }

    public T update(T object){
        mongoOperation.save(object);
        return object;
    }

    public void delete(T object){
        mongoOperation.remove(object);
    }

    public void deleteById(PK id){
        mongoOperation.remove(getIdQuery(id), entityClass);
    }

    public T findById(PK id){
        return mongoOperation.findById(getIdQuery(id), entityClass);
    }

    public List<T> findAll(){
        return mongoOperation.findAll(entityClass);
    }

    protected Query getIdQuery(PK id){
        return Query.query(getIdCriteria(id));
    }

    protected Criteria getIdCriteria(PK id){
        return Criteria.where("id").is(id);
    }
}
