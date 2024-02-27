/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.custom.impl;

import course.work.entity.RoomCategoryEntity;
import course.work.entity.RoomEntity;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import repository.custom.RoomCategoryRepository;
import util.SessionFactoryConfiguration;

/**
 *
 * @author ASUS
 */
public class RoomCategoryRepositoryImpl implements RoomCategoryRepository {


    @Override
    public boolean save(RoomCategoryEntity t,Session session) throws Exception {
        Integer id = (Integer) session.save(t);
        return true;
    }

    @Override
    public boolean update(RoomCategoryEntity t,Session session) throws Exception {
        session.update(t);
        return true;
    }

    @Override
    public boolean delete(String id,Session session) throws Exception {
        RoomCategoryEntity roomCategoryEntity = session.get(RoomCategoryEntity.class, id);
        if (roomCategoryEntity != null) {
            session.delete(roomCategoryEntity);
            return true;
        }
        return false;
    }

    @Override
    public RoomCategoryEntity get(String id,Session session) throws Exception {
        RoomCategoryEntity roomCategoryEntity = session.get(RoomCategoryEntity.class, id);
        return roomCategoryEntity;
    }

    @Override
    public List<RoomCategoryEntity> getAll(Session session) throws Exception {
        String hql = "FROM RoomCategoryEntity"; // HQL query to retrieve all rooms
        Query query = session.createQuery(hql);
        List<RoomCategoryEntity> roomEntities = query.list();
        return roomEntities;
    }

}
