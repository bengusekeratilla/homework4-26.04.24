package HwInheritance;


import java.time.LocalDateTime;

public class Customer extends User{
    private String phoneNumber;

    private String address;

    public Customer(String phoneNumber,String address){
        super();
        this.phoneNumber = phoneNumber;
        this.address = address;

    }
    public Customer(){
        super();

    }


}