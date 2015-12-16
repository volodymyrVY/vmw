package com.softserveinc.ita.jexercises.persistence.dao.mongo.impl;

import com.softserveinc.ita.jexercises.persistence.dao.mongo.GenericMongoDao;
import org.springframework.stereotype.Repository;

@Repository
public class TrailerDaoImpl extends GenericMongoDao {

 /*   @Override
    public long count() {
        return this.getMongoOperations().count(new Query(),User.class);
    }*/

   /* @Override
    public void delete(Serializable serializable) {

        this.getMongoOperations().remove(getIdQuery(serializable), User.class);
    }

    @Override
    public void deleteAll() {
        this.getMongoOperations().remove(new Query(),User.class);
    }

    @Override
    public boolean exists(Serializable serializable) {
        return this.getMongoOperations().exists(getIdQuery(serializable),User.class);
    }

    @Override
    public List findAll() {
        return this.getMongoOperations().find(new Query(),User.class);
    }

    @Override
    public Iterable  findAll(Iterable  iterable) {
        return null;
    }

    @Override
    public Page findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List findAll(Sort sort) {
        return null;
    }

    @Override
    public User findOne(Serializable serializable) {
        return this.getMongoOperations().findOne(getIdQuery(serializable),User.class);
    }

    @Override
    public User findUserByUserName(String uname) {

        List<User> list = this.getMongoOperations().find(Query.query(Criteria.where("username").is(uname)),User.class);
        if(list != null && list.size() > 0){
            return list.get(0);
        }
        return null;
    }*/
}
