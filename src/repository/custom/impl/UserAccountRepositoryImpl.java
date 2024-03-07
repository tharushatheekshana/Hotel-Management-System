/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.custom.impl;

import course.work.entity.UserAccountEntity;
import java.util.List;

import org.hibernate.Session;

import repository.custom.UserAccountRepository;

/**
 *
 * @author ASUS
 */
public class UserAccountRepositoryImpl implements UserAccountRepository {

    @Override
    public boolean save(UserAccountEntity t, Session session) throws Exception {
        session.save(t);
        return true;
    }

    @Override
    public boolean update(UserAccountEntity t, Session session) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String id, Session session) throws Exception {
        return false;
    }

    @Override
    public UserAccountEntity get(String id, Session session) throws Exception {
        UserAccountEntity entity = session.get(UserAccountEntity.class, id);
        return entity;
    }

    

    @Override
    public List<UserAccountEntity> getAll(Session session) throws Exception {
        return null;
    }

}
