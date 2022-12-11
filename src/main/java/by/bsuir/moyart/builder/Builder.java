package by.bsuir.moyart.builder;

import by.bsuir.moyart.exception.RepositoryException;

import java.sql.ResultSet;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException;
}
