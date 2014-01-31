package com.crud.operations.services.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T, ID extends Serializable> {

	/*
	 * Insert and Update operations are combined into a single operation (e.g.
	 * Store) This is to let the ORM framework (not you) decide whether an
	 * object should be inserted or updated
	 */
	T store(T entity);
	void delete(T entity);
	T findById(ID id);
	List<T> findAll();
	void flush();
}
