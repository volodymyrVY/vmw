package com.softserveinc.ita.jexercises.business.services;

import com.softserveinc.ita.jexercises.common.entity.mongo.Trailer;
import com.softserveinc.ita.jexercises.persistence.dao.mongo.TrailerDaoImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/spring/business-context.xml");

        TrailerDaoImpl personDAO = ctx.getBean("dao",TrailerDaoImpl.class);



        Trailer trailer = new Trailer ();
        trailer.setAxis("axis");
trailer.setColor("red");
        trailer.setPrice("100");


        //create
        personDAO.create(trailer);
        System.out.println("Generated ID=" + trailer.getId());

        //read
        Trailer p1 = personDAO.readById(trailer.getId());
        System.out.println("Retrieved Person=" + p1);

        //update
       /* p1.setName("Megan");p1.setAddress("SFO, Lviv");
        personDAO.update(p1);
        Person temp = personDAO.readById(p1.getId());
        System.out.println("Retrieved Person after update="+temp);*/

        //delete
        /*int count = personDAO.deleteById(p1.getId());
        System.out.println("Number of records deleted="+count);*/

        ctx.close();

    }

}