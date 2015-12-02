package com.softserveinc.ita.jexercises.persistence.dao;

import com.mongodb.WriteResult;
import com.softserveinc.ita.jexercises.common.entity.Person;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.repository.Query;

public class PersondaoImpl implements PersonDao {

    private MongoOperations mongoOps;
    private static final String PERSON_COLLECTION = "Person";

    public PersondaoImpl(MongoOperations mongoOps){
        this.mongoOps=mongoOps;
    }

    @Override
    public void create(Person p) {
        this.mongoOps.insert(p, PERSON_COLLECTION);
    }

    @Override
    public Person readById(String id) {
        org.springframework.data.mongodb.core.query.Query query = new org.springframework.data.mongodb.core.query.Query(Criteria.where("_id").is(id));
        return this.mongoOps.findOne(query, Person.class, PERSON_COLLECTION);
    }

    @Override
    public void update(Person p) {
        this.mongoOps.save(p, PERSON_COLLECTION);
    }

    @Override
    public int deleteById(String id) {
        org.springframework.data.mongodb.core.query.Query query = new org.springframework.data.mongodb.core.query.Query(Criteria.where("_id").is(id));
        WriteResult result = this.mongoOps.remove(query, Person.class, PERSON_COLLECTION);
        return result.getN();
    }

}
