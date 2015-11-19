package com.softserveinc.ita.jexercises.persistence.dao.impl.hibernate;

import org.springframework.stereotype.Repository;
import com.softserveinc.ita.jexercises.common.entity.User;
import com.softserveinc.ita.jexercises.persistence.dao.impl.UserDao;

/**
 * Represents Hibernate User DAO implementation.
 * 
 * @author Oksana Senchuk
 * @version 1.0
 */
@Repository
public class HibernateUserDaoImpl extends HibernateGenericDaoImpl<User, Long>
        implements UserDao {

    @Override
    public User findByEmail(String email) {

        return null;
    }
}
