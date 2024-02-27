/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.custom.impl;

import course.work.entity.CustomerEntity;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import repository.custom.CustomerRepository;
import util.SessionFactoryConfiguration;

/**
 *
 * @author ASUS
 */
public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public boolean save(CustomerEntity t, Session session) throws Exception {
        Integer id = (Integer) session.save(t);
        return true;

    }

    @Override
    public boolean update(CustomerEntity t, Session session) throws Exception {
        session.update(t);
        return true;
    }

    @Override
    public boolean delete(Integer id, Session session) throws Exception {
        CustomerEntity customer = session.get(CustomerEntity.class, id);
        if (customer != null) {
            session.delete(customer);
            return true;
        }
        return false;
    }

    @Override
    public CustomerEntity get(Integer id, Session session) throws Exception {
        CustomerEntity customerEntity = session.get(CustomerEntity.class, id);
        return customerEntity;

    }   

    @Override
    public List<CustomerEntity> getAll(Session session) throws Exception {
        String hql = "FROM CustomerEntity"; // HQL query to retrieve all customers
        Query query = session.createQuery(hql);
        List<CustomerEntity> customerEntities = query.list();
        return customerEntities;
    }

}
