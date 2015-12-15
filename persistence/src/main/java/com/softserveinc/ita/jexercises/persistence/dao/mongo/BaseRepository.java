package com.softserveinc.ita.jexercises.persistence.dao.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseRepository<T,ID extends Serializable> /*implements IBaseRepository<T,ID>*/ {

    @Autowired
    private MongoOperations mongoOperations;


    public void delete(T entity) {

        this.mongoOperations.remove(entity);
    }


    public void delete(Iterable<T> entities) {


        for (T entity : entities) {
            delete(entity);
        }
    }

    protected MongoOperations getMongoOperations(){
        return  this.mongoOperations;
    }


    public <S extends T> List<S> save(Iterable<S> entities) {


        List<S> result = new ArrayList<S>();
        for (S entity : entities) {
            save(entity);
            result.add(entity);
        }
        return result;
    }

    public <S extends T> S save(S entity) {

        mongoOperations.save(entity);
        return entity;
    }
/*    protected Query getIdQuery(ID id){
        return Query.query(getIdCriteria(id));
    }

    protected Criteria getIdCriteria(ID id){
        return Criteria.where("id").is(id);
    }*/


}