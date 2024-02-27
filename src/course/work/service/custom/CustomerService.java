/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package course.work.service.custom;

import course.work.dto.CustomerDto;
import course.work.service.SuperService;
import java.util.List;

import org.hibernate.Session;

/**
 *
 * @author ASUS
 */
public interface CustomerService extends SuperService {

    String addCustomer(CustomerDto dto) throws Exception;

    String deleteCustomer(Integer id) throws Exception;

    CustomerDto getCustomer(Integer room) throws Exception;

    List<CustomerDto> getAll() throws Exception;

    String updateCustomer(CustomerDto dto) throws Exception;
}
