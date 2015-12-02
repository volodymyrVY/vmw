package com.softserveinc.ita.jexercises.persistence.dao.mongo;

import com.mongodb.WriteResult;
import com.softserveinc.ita.jexercises.common.entity.mongo.Trailer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class TrailerDaoImpl {

    @Autowired
    private MongoOperations mongoOps;

    private static final String PERSON_COLLECTION = "Trailer";

    public TrailerDaoImpl() {
    }

    public TrailerDaoImpl(MongoOperations mongoOps){
        this.mongoOps=mongoOps;
    }

    public void create(Trailer p) {
        this.mongoOps.insert(p, PERSON_COLLECTION);
    }

    public Trailer readById(String id) {
        org.springframework.data.mongodb.core.query.Query query = new org.springframework.data.mongodb.core.query.Query(Criteria.where("_id").is(id));
        return this.mongoOps.findOne(query, Trailer.class, PERSON_COLLECTION);
    }

    public void update(Trailer p) {
        this.mongoOps.save(p, PERSON_COLLECTION);
    }

    public int deleteById(String id) {
        org.springframework.data.mongodb.core.query.Query query = new org.springframework.data.mongodb.core.query.Query(Criteria.where("_id").is(id));
        WriteResult result = this.mongoOps.remove(query, Trailer.class, PERSON_COLLECTION);
        return result.getN();
    }
}
