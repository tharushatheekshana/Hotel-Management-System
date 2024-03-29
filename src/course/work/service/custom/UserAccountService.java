/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package course.work.service.custom;

import course.work.dto.UserAccountDto;
import course.work.service.SuperService;

/**
 *
 * @author ASUS
 */
public interface UserAccountService extends SuperService {

    String saveCustomer(UserAccountDto dto) throws Exception;

    UserAccountDto getCustomer(String id) throws Exception;
}
