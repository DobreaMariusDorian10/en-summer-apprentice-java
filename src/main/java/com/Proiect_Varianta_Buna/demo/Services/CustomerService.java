package com.Proiect_Varianta_Buna.demo.Services;
import com.Proiect_Varianta_Buna.demo.Interfaces.ICustomerService;
import com.Proiect_Varianta_Buna.demo.Repositories.CustomerRepository;
import com.Proiect_Varianta_Buna.demo.TableEntities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
public class CustomerService implements ICustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getCustomers()
    {
        return customerRepository.findAll();
    }

    @Override
    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void updateCustomer(Integer id, Customer customer) {
        Customer customerToUpdate=customerRepository.findById(id).orElseThrow(
                ()-> new IllegalStateException(String.format("Customer with ID %s doesn't exist",id))) ;
        customerToUpdate.setCustomerName(customer.getCustomerName());
        customerToUpdate.setEmail(customer.getEmail());

        customerRepository.save(customerToUpdate);
    }
}
