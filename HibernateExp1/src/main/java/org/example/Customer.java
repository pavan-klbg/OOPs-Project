package org.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customer {
    @Column
    private  String customerfirstName,customerLastName,customerAddress;
    @Id
    private Integer customerId;

    public Customer(String customerfirstName, String customerLastName, String customerAddress, Integer customerId) {
        this.customerfirstName = customerfirstName;
        this.customerLastName = customerLastName;
        this.customerAddress = customerAddress;
        this.customerId = customerId;
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
