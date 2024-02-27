/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.List;

import org.hibernate.Session;

/**
 *
 * @author ASUS
 */
public interface CrudRepository<T, ID> extends SuperRepository {

    boolean save(T t, Session session) throws Exception;

    boolean update(T t, Session session) throws Exception;

    boolean delete(ID id, Session session) throws Exception;

    T get(ID id, Session session) throws Exception;

    List<T> getAll(Session session) throws Exception;
}
