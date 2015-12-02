package com.softserveinc.ita.jexercises.business.services;

import com.softserveinc.ita.jexercises.common.entity.Person;
import com.softserveinc.ita.jexercises.persistence.dao.PersonDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/spring/business-context.xml");

        PersonDao personDAO = ctx.getBean("personDAO", PersonDao.class);

        Person p = new Person(null, "PankajKr", "Bangalore, India");

        //create
        personDAO.create(p);
        System.out.println("Generated ID="+p.getId());

        //read
        Person p1 = personDAO.readById(p.getId());
        System.out.println("Retrieved Person="+p1);

        //update
        p1.setName("Megan");p1.setAddress("SFO, Lviv");
        personDAO.update(p1);
        Person temp = personDAO.readById(p1.getId());
        System.out.println("Retrieved Person after update="+temp);

        //delete
        /*int count = personDAO.deleteById(p1.getId());
        System.out.println("Number of records deleted="+count);*/

        ctx.close();

    }

}