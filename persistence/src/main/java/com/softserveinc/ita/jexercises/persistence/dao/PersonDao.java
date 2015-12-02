package com.softserveinc.ita.jexercises.persistence.dao;

import com.softserveinc.ita.jexercises.common.entity.Person;

public interface PersonDao {

    public void create(Person p);

    public Person readById(String id);

    public void update(Person p);

    public int deleteById(String id);
}
