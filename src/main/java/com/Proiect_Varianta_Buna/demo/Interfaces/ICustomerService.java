package com.Proiect_Varianta_Buna.demo.Interfaces;

import com.Proiect_Varianta_Buna.demo.TableEntities.Customer;
import java.util.List;
public interface ICustomerService {

    List<Customer> getCustomers();
    void createCustomer(Customer customer);
    void updateCustomer(Integer id,Customer customer);
    //void deleteCustomer(CUSTOMER customer);

}