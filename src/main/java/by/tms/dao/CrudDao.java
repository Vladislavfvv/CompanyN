package by.tms.dao;

import java.util.List;

public interface CrudDao<T, ID> {
    T save(T entity);
    List<T> getList();
    T findById(ID id);
}
