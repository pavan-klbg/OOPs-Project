package org.example;

import javax.persistence.*;

@Entity
@Table(name = "Customers")
public class Customer {
    @Column
    private  String customerfirstName,customerLastName,customerAddress;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customerId;

    public Customer(String customerfirstName, String customerLastName, String customerAddress) {
        this.customerfirstName = customerfirstName;
        this.customerLastName = customerLastName;
        this.customerAddress = customerAddress;
    }

    // creating no arg customer
    public Customer(){

    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerfirstName='" + customerfirstName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerId=" + customerId +
                '}';
    }

    public String getCustomerfirstName() {
        return customerfirstName;
    }

    public void setCustomerfirstName(String customerfirstName) {
        this.customerfirstName = customerfirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}
