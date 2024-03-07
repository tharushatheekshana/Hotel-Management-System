package course.work.service.custom.impl;

import course.work.dto.CustomerDto;
import course.work.dto.ReservationDto;
import course.work.dto.RoomDto;
import course.work.entity.CustomerEntity;
import course.work.entity.ReservationEntity;
import course.work.entity.RoomCategoryEntity;
import course.work.entity.RoomEntity;
import course.work.service.custom.ReservationService;
import repository.RepositoryFactory;
import repository.custom.CustomerRepository;
import repository.custom.ReservationRepository;
import repository.custom.RoomRepository;
import repository.custom.impl.CustomerRepositoryImpl;
import repository.custom.impl.ReservationRepositoryImpl;
import repository.custom.impl.RoomRepositoryImpl;
import util.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ReservationServiceImpl implements ReservationService {

    // private CustomerRepository customerRepository = (CustomerRepository)
    // RepositoryFactory.getInstance()
    // .getRepository(RepositoryFactory.RepositoryType.CUSTOMER);
    // private ReservationRepository reservationRepository = (ReservationRepository)
    // RepositoryFactory.getInstance()
    // .getRepository(RepositoryFactory.RepositoryType.RESERVATION);
    private SessionFactoryConfiguration sessionFactoryConfiguration = SessionFactoryConfiguration.getInstance();
    private CustomerRepository customerRepository = (CustomerRepository) RepositoryFactory.getInstance()
            .getRepository(RepositoryFactory.RepositoryType.CUSTOMER);
    private ReservationRepository reservationRepository = (ReservationRepository) RepositoryFactory.getInstance()
            .getRepository(RepositoryFactory.RepositoryType.RESERVATION);
    private RoomRepository roomRepository = (RoomRepository) RepositoryFactory.getInstance()
            .getRepository(RepositoryFactory.RepositoryType.ROOM);

    @Override
    public String saveReservation(ReservationDto dto) throws Exception {
        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        try {

            ReservationEntity reservationEntity = new ReservationEntity();
            reservationEntity.setRoom(dto.getRoom());
            reservationEntity.setDate(dto.getDate());
            reservationEntity.setPrice(dto.getPrice());

            if (session.save(reservationEntity) != null) {

                boolean isCustomerSaved = true;

                for (CustomerDto customerDto : dto.getCustomerDtos()) {
                    CustomerEntity customerEntity = new CustomerEntity(
                            dto.getRoom(), customerDto.getName(), customerDto.getPhone(),
                            customerDto.getEmail(),
                            customerDto.getAddress(), customerDto.getCity(), customerDto.getNationality(),
                            customerDto.getIdNo(), customerDto.getRoomType(), customerDto.getCustomerPackage(),
                            customerDto.getCheckInDate(),
                            customerDto.getCheckOutDate(), customerDto.getCheckInTime(), customerDto.getCheckOutTime());

                    if (session.save(customerEntity) == null) {
                        isCustomerSaved = false;
                    }
                }

                if (isCustomerSaved) {
                    boolean isRoomSaved = true;
                    for (CustomerDto customerDto : dto.getCustomerDtos()) {
                        RoomEntity entity = session.get(RoomEntity.class, customerDto.getRoom());
                        if (entity != null) {
                            entity.setCustName(customerDto.getName());
                            entity.setRoomPackage(customerDto.getCustomerPackage());
                            entity.setStatus("Booked");
                            if (session.save(entity) == null) {
                                isRoomSaved = false;
                            }
                        }
                    }

                    if (isRoomSaved) {
                        transaction.commit();
                        return "Successfully Saved";
                    } else {
                        transaction.rollback();
                        return "Room Save Error";
                    }
                } else {
                    transaction.rollback();
                    return "Customer Save Error";
                }
            } else {
                transaction.rollback();
                return "Reservation Save Error";
            }

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            throw e;
        } finally {
            session.close();
        }
    }

    @Override
    public String deleteReservation(Integer ID) throws Exception {
        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        try {
            ReservationEntity entity = session.get(ReservationEntity.class, ID);

            boolean isReservationDelete = reservationRepository.delete(ID, session);

            if (isReservationDelete) {
                Integer id = entity.getRoom();
                boolean isCustomerDeleted = customerRepository.delete(id, session);

                if (isCustomerDeleted) {

                    RoomEntity roomEntity = roomRepository.get(id, session);
                    boolean isRoomUpdated = roomRepository.update(roomEntity, session);
                    if (roomEntity != null) {
                        roomEntity.setCustName("");
                        roomEntity.setRoomPackage("");
                        roomEntity.setStatus("Not Booked");

                        session.delete(entity);
                    }
                    if (isRoomUpdated) {
                        transaction.commit();
                        return "Successfully Canceled";
                    } else {
                        transaction.rollback();
                        return "Room Update Error";
                    }

                } else {
                    transaction.rollback();
                    return "Customer not deleted for Reservation ID: " + id;
                }
            } else {
                transaction.rollback();
                return "Reservation not deleted for ID: " + ID;
            }

        } catch (Exception e) {

            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            throw e;
        } finally {
            // Make sure to close the session in the finally block
            session.close();
        }

    }

}
