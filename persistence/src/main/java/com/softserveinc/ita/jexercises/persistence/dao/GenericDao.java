package com.softserveinc.ita.jexercises.persistence.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Represents interface for generic DAO. Parent interface for all DAO
 * interfaces.
 *
 * @param <T>  Entity class.
 * @param <PK> Type of entity key.
 * @author Taras Vuyiv
 */
public interface GenericDao<T, PK extends Serializable> {
    /**
     * Create record in database.
     *
     * @param object Entity object.
     * @return Entity object.
     */
    T create(T object);

    /**
     * Update record in database.
     *
     * @param object Entity object.
     * @return Entity object.
     */
    T update(T object);

    /**
     * Delete record in database.
     *
     * @param object Entity object.
     */
    void delete(T object);

    /**
     * Delete record by ID.
     *
     * @param id ID of record should be deleted.
     */
    void deleteById(PK id);

    /**
     * Find a record by ID.
     *
     * @param id ID of record should be found.
     * @return Entity object.
     */
    T findById(PK id);

    /**
     * Find all records.
     *
     * @return List of entity objects.
     */
    List<T> findAll();
}
