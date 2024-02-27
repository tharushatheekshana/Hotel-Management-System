/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.custom.impl;

import course.work.entity.RoomEntity;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import repository.custom.RoomRepository;
import util.SessionFactoryConfiguration;

/**
 *
 * @author ASUS
 */
public class RoomRepositoryImpl implements RoomRepository {

    @Override
    public boolean save(RoomEntity t, Session session) throws Exception {
        Integer id = (Integer) session.save(t);
        return true;
    }

    @Override
    public boolean update(RoomEntity t, Session session) throws Exception {
        session.update(t);
        return true;
    }

    @Override
    public boolean delete(Integer id, Session session) throws Exception {
        RoomEntity roomEntity = session.get(RoomEntity.class, id);
        if (roomEntity != null) {
            session.delete(roomEntity);
            return true;
        }
        return false;
    }

    @Override
    public RoomEntity get(Integer id, Session session) throws Exception {
        RoomEntity roomEntity = session.get(RoomEntity.class, id);
        return roomEntity;
    }

    @Override
    public List<RoomEntity> getAll(Session session) throws Exception {
        String hql = "FROM RoomEntity"; // HQL query to retrieve all rooms
        Query query = session.createQuery(hql);
        List<RoomEntity> roomEntities = query.list();
        return roomEntities;
    }

}
