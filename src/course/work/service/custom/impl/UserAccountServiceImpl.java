/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package course.work.service.custom.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import course.work.dto.UserAccountDto;
import course.work.entity.UserAccountEntity;
import course.work.service.SuperService;
import course.work.service.custom.UserAccountService;
import repository.RepositoryFactory;
import repository.custom.UserAccountRepository;
import repository.custom.impl.UserAccountRepositoryImpl;
import util.SessionFactoryConfiguration;

/**
 *
 * @author ASUS
 */
public class UserAccountServiceImpl implements UserAccountService {

    private UserAccountRepository userAccountRepository = (UserAccountRepository) RepositoryFactory.getInstance()
            .getRepository(RepositoryFactory.RepositoryType.USER);

    @Override
    public String saveCustomer(UserAccountDto dto) throws Exception {
        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            UserAccountEntity entity = new UserAccountEntity();
            entity.setUsername(dto.getUsername());
            entity.setPassword(dto.getPassword());
            entity.setName(dto.getName());
            entity.setPhone(dto.getPhone());
            entity.setEmail(dto.getEmail());
            entity.setCountry(dto.getCountry());

            boolean isCustomerSaved = userAccountRepository.save(entity, session);

            if (isCustomerSaved) {
                transaction.commit();
                return "Successfully Saved";
            } else {
                transaction.rollback();
                return "Customer Save Error";
            }
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }

    }

    @Override
    public UserAccountDto getCustomer(String id) throws Exception {

        Session session = SessionFactoryConfiguration.getInstance().getSession();
        try {

            UserAccountRepository userAccountRepository = new UserAccountRepositoryImpl();
            UserAccountEntity entity = userAccountRepository.get(id, session);
            if (entity != null) {
                return new UserAccountDto(entity.getUsername(), entity.getPassword(), entity.getName(),
                        entity.getPhone(), entity.getEmail(), entity.getCountry());
            }
            return null;
        } finally {
            session.close();
        }

    }

}
