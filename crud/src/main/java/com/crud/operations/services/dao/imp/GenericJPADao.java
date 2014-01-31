package com.crud.operations.services.dao.imp;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.crud.operations.services.dao.GenericDao;

@Transactional
public class GenericJPADao<T, ID extends Serializable> implements
		GenericDao<T, ID> {

	private Class<T> classToPersistent;
	private EntityManager entityManager;

	public GenericJPADao(Class<T> classToPersistent) {
		this.classToPersistent = classToPersistent;
	}

	public T store(T entity) {
		T entityStored = getEntityManager().merge(entity);
		return entityStored;

	}

	public void delete(T entity) {
		getEntityManager().remove(getEntityManager().merge(entity));

	}

	@Transactional(readOnly = true)
	public T findById(ID id) {
		T entity = (T) getEntityManager().find(getClassToPersistent(), id);
		return entity;
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<T> findAll() {

		List<T> entityList = (List<T>) getEntityManager().createQuery(
				"select x from " + getClassToPersistent().getSimpleName()
						+ " x").getResultList();

		return entityList;
	}

	public void flush() {
		getEntityManager().flush();

	}

	public Class<T> getClassToPersistent() {
		return classToPersistent;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * To Use the context injection approach, you can declare an entity manager
	 * field in your DAO and annotate it with the @PersistenceContext
	 * annotation. Spring will inject an Entity Manager into this field for you
	 * to persist your object
	 * 
	 * @param entityManager
	 */
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}

