/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import repository.custom.impl.CustomerRepositoryImpl;
import repository.custom.impl.ReservationRepositoryImpl;
import repository.custom.impl.RoomCategoryRepositoryImpl;
import repository.custom.impl.RoomRepositoryImpl;
import repository.custom.impl.UserAccountRepositoryImpl;

/**
 *
 * @author ASUS
 */
public class RepositoryFactory {

    private static RepositoryFactory repositoryFactory;

    private RepositoryFactory() {
    }

    public static RepositoryFactory getInstance() {
        if (repositoryFactory == null) {
            repositoryFactory = new RepositoryFactory();
        }

        return repositoryFactory;
    }

    public SuperRepository getRepository(RepositoryType type) {
        switch (type) {
            case USER:
                return new UserAccountRepositoryImpl();
            case RESERVATION:
                return new ReservationRepositoryImpl();
            case ROOM:
                return new RoomRepositoryImpl();
            case CUSTOMER:
                return new CustomerRepositoryImpl();
            case ROOMCATEGORY:
                return new RoomCategoryRepositoryImpl();
            default:
                return null;
        }
    }

    public enum RepositoryType {
        USER, RESERVATION, ROOM, CUSTOMER, ROOMCATEGORY
    }
}
