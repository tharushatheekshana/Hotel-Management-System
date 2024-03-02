/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package course.work.service.custom.impl;

import course.work.dto.CustomerDto;
import course.work.dto.RoomCategoryDto;
import course.work.entity.CustomerEntity;
import course.work.entity.RoomCategoryEntity;
import course.work.service.custom.CustomerService;
import repository.RepositoryFactory;
import repository.custom.CustomerRepository;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import repository.custom.impl.CustomerRepositoryImpl;
import util.SessionFactoryConfiguration;

/**
 *
 * @author ASUS
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = (CustomerRepository) RepositoryFactory.getInstance()
            .getRepository(RepositoryFactory.RepositoryType.CUSTOMER);

    @Override
    public String addCustomer(CustomerDto dto) throws Exception {
        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        try {
            CustomerEntity customerEntity = new CustomerEntity();
            customerEntity.setRoom(dto.getRoom());
            customerEntity.setName(dto.getName());
            customerEntity.setPhone(dto.getPhone());
            customerEntity.setEmail(dto.getEmail());
            customerEntity.setAddress(dto.getAddress());
            customerEntity.setCity(dto.getCity());
            customerEntity.setNationality(dto.getNationality());
            customerEntity.setIdNo(dto.getIdNo());
            customerEntity.setCustomerPackage(dto.getCustomerPackage());
            customerEntity.setCheckInDate(dto.getCheckInDate());
            customerEntity.setCheckOutDate(dto.getCheckOutDate());
            boolean isCustomerSaved = customerRepository.save(customerEntity, session);
            if (isCustomerSaved) {
                transaction.commit();
                return "Successfully Saved";
            } else {
                transaction.rollback();
                return "Customer Save Error";
            }

        } catch (Exception e) {
            transaction.rollback();
            throw e; // Rethrow the exception for proper handling
        } finally {
            session.close();
        }
    }

    @Override
    public String deleteCustomer(Integer id) throws Exception {
        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        try {
            CustomerRepository customerRepository = new CustomerRepositoryImpl(); // Instantiate your repository
            boolean isCustomerDeleted = customerRepository.delete(id, session);

            if (isCustomerDeleted) {
                transaction.commit();
                return "Customer deleted successfully";
            } else {
                transaction.rollback();
                return "Customer not found";
            }
        } catch (Exception e) {
            transaction.rollback();
            throw e; // Rethrow for proper error handling
        } finally {
            session.close();
        }
    }

    @Override
    public CustomerDto getCustomer(Integer id) throws Exception {
        Session session = SessionFactoryConfiguration.getInstance().getSession();
        try {
            // CustomerEntity entity = session.get(CustomerEntity.class, id);
            CustomerRepository customerRepository = new CustomerRepositoryImpl(); // Instantiate your repository
            CustomerEntity entity = customerRepository.get(id, session);

            if (entity != null) {
                return new CustomerDto(entity.getRoom(), entity.getName(), entity.getPhone(),
                        entity.getEmail(), entity.getAddress(), entity.getCity(),
                        entity.getNationality(), entity.getIdNo(), entity.getCustomerPackage(), entity.getCheckInDate(),
                        entity.getCheckOutDate(), entity.getCheckInTime(), entity.getCheckOutTime());
            }
            return null;
        } finally {
            session.close();
        }
    }

    @Override
    public List<CustomerDto> getAll() throws Exception {
        Session session = SessionFactoryConfiguration.getInstance().getSession();
        try {
            CustomerRepository customerRepository = new CustomerRepositoryImpl(); // Instantiate your repository

            List<CustomerEntity> customerEntities = customerRepository.getAll(session);
            List<CustomerDto> customerDtos = new ArrayList<>();

            for (CustomerEntity entity : customerEntities) {
                customerDtos.add(new CustomerDto(entity.getRoom(), entity.getName(), entity.getPhone(),
                        entity.getEmail(), entity.getAddress(), entity.getCity(),
                        entity.getNationality(), entity.getIdNo(), entity.getCustomerPackage(), entity.getCheckInDate(),
                        entity.getCheckOutDate(), entity.getCheckInTime(), entity.getCheckOutTime()));
            }
            return customerDtos;
        } finally {
            session.close();
        }
    }

    @Override
    public String updateCustomer(CustomerDto dto) throws Exception {
        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        try {
            CustomerRepository customerRepository = new CustomerRepositoryImpl();

            CustomerEntity entity = customerRepository.get(dto.getRoom(), session);
            if (entity != null) {
                entity.setName(dto.getName());
                entity.setPhone(dto.getPhone());
                entity.setEmail(dto.getEmail());
                entity.setAddress(dto.getAddress());
                entity.setCity(dto.getCity());
                entity.setNationality(dto.getNationality());

                boolean isCustomerUpdated = customerRepository.update(entity, session);

                if (isCustomerUpdated) {
                    transaction.commit();
                    return "Successfully Updated";
                } else {
                    transaction.rollback();
                    return "Error updating customer";
                }
            }
            return "User Not Found";
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
    }

}
