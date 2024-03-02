/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.custom.impl;

import course.work.entity.ReservationEntity;
import course.work.entity.RoomEntity;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import repository.custom.ReservationRepository;
import util.SessionFactoryConfiguration;

/**
 *
 * @author ASUS
 */
public class ReservationRepositoryImpl implements ReservationRepository {

    @Override
    public boolean save(ReservationEntity t, Session session) throws Exception {
        Integer id = (Integer) session.save(t);
        return true;

    }

    @Override
    public boolean update(ReservationEntity t, Session session) throws Exception {
        session.update(t);
        return true;
    }

    @Override
    public boolean delete(Integer ID, Session session) throws Exception {
        ReservationEntity reservationEntity = session.get(ReservationEntity.class, ID);

        if (reservationEntity != null) {
            session.delete(reservationEntity);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public ReservationEntity get(Integer id, Session session) throws Exception {
        ReservationEntity reservationEntity = session.get(ReservationEntity.class, id);
        return reservationEntity;
    }

    @Override
    public List<ReservationEntity> getAll(Session session) throws Exception {
        String hql = "FROM ReservationEntity"; // HQL query to retrieve all rooms
        Query query = session.createQuery(hql);
        List<ReservationEntity> reservationEntities = query.list();
        return reservationEntities;
    }

}
