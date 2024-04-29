package HwInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerManager {
    private List<Customer> customers;


    public CustomerManager(){
        customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setId(1);
        customer.setFirstName("Bengü");
        customer.setLastName("Şeker");
        customer.setEmail("bengu@etiya.com");
        customer.setPassword("bengu123");
        customer.setCreatedDate(LocalDateTime.now());

        customers.add(customer);
    }

    public void add(Customer addedCustomer){
        addedCustomer.setCreatedDate(LocalDateTime.now());
        customers.add(addedCustomer);
    }

    public void update(Customer customer){
        for(Customer updatedCustomer: customers){
            updatedCustomer.setUpdatedDate(LocalDateTime.now());
            updatedCustomer.setId(customer.getId());
            updatedCustomer.setFirstName(customer.getFirstName());
            updatedCustomer.setLastName(customer.getLastName());
            updatedCustomer.setPassword(customer.getPassword());
            updatedCustomer.setEmail(updatedCustomer.getEmail());
        }
    }
    public void delete(int id){
        Iterator<Customer> iterator = customers.iterator();
        while(iterator.hasNext()){
            Customer customer = iterator.next();
            if (customer.getId() == id){
                customer.setDeletedDate(LocalDateTime.now());
                iterator.remove();
            }
        }
    }

    public List<Customer> getList(){
        return customers;
    }

    public Customer getById(int id){
        for(Customer customer: customers){
            if (customer.getId()==id)
                return customer;
        }
        return null;
    }
}