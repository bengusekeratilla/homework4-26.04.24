package HwInheritance;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        List<Customer> customers1 = customerManager.getList();

        Customer customer1 = new Customer();

        for (Customer cust : customers1) {
            System.out.println(cust.getId() + " Id'li " + cust.getFirstName() + " " + cust.getLastName()
                    + " Isimli Musteri " + cust.getCreatedDate() + " tarihinde yaratıldı");
        }

        customer1.setId(2);
        customer1.setFirstName("Çağan");
        customer1.setLastName("Şeker");
        customer1.setEmail("cagan@gmail.com");
        customer1.setPassword("cagan123");

        customerManager.add(customer1);

        customers1 = customerManager.getList();;
        for (Customer cust : customers1) {
            System.out.println(cust.getId() + " Id'li " + cust.getFirstName() + " " + cust.getLastName()
                    + " Isimli Musteri " + cust.getCreatedDate() + " tarihinde oluşturuldu.");
        }
        customerManager.delete(1);
        for (Customer cust : customers1) {
            System.out.println(cust.getId() + " Id'li " + cust.getFirstName() + " " + cust.getLastName()
                    + " Isimli Musteri " + cust.getCreatedDate() + " tarihinde oluşturuldu.");
        }
        //Employee Operations

        System.out.println("-----------------------------");
        System.out.println("Employee Operations");


        EmployeeManager employeeManager = new EmployeeManager();
        List<Employee> employees1 = employeeManager.getList();

        Employee employee1 = new Employee();
        employee1.setId(2);
        employee1.setFirstName("Jane");
        employee1.setLastName("Doe");
        employee1.setEmail("jane@gmail.com");
        employee1.setPassword("jane123");
        employee1.setDepartment("Test");


        for (Employee emp : employees1) {
            System.out.println(emp.getId() + " Id'li " + emp.getFirstName() + " " + emp.getLastName()
                    + " Isimli Musteri " + emp.getCreatedDate() + " tarihinde oluşturuldu" + "Departmanı: " + emp.getDepartment());
        }

        employeeManager.add(employee1);
        for (Employee emp : employees1) {
            System.out.println(emp.getId() + " Id'li " + emp.getFirstName() + " " + emp.getLastName()
                    + " Isimli Musteri " + emp.getCreatedDate() + " tarihinde oluşturuldu" + "Departmanı: " + emp.getDepartment());
        }

        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setFirstName("John");
        employee2.setLastName("Doe");
        employee2.setEmail("john@gmail.com");
        employee2.setPassword("john123");
        employee2.setDepartment("Test");

        employeeManager.update(employee2);

        System.out.println("Updated: ");
        for (Employee emp : employees1) {
            System.out.println(emp.getId() + " Id'li " + emp.getFirstName() + " " + emp.getLastName()
                    + " Isimli Musteri " + emp.getCreatedDate() + " tarihinde oluşturuldu." + "Departmanı:  " + emp.getDepartment());
        }

    }

    }