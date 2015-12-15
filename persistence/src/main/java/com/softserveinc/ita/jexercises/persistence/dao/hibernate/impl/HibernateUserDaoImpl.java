package com.softserveinc.ita.jexercises.persistence.dao.hibernate.impl;

import org.springframework.stereotype.Repository;
import com.softserveinc.ita.jexercises.common.entity.User;
import com.softserveinc.ita.jexercises.persistence.dao.hibernate.UserDao;

/**
 * Represents Hibernate User DAO implementation.
 *
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
