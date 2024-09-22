package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("!! Hibernate started !!");

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        // creating 1st customer using constructor.
        Customer cus1 = new Customer("pavan", "allur", "gulbarga");
        System.out.println(cus1);

        // creating 2nd customer using setters
        Customer cust2 = new Customer();
        cust2.setCustomerfirstName("arvind");
        cust2.setCustomerLastName("kk");
        cust2.setCustomerAddress("BLR");
        System.out.println("2nd customer details-" + cust2);

        // creating 3rd customer
        Customer cust3 = new Customer();
        cust2.setCustomerfirstName("arun");
        cust2.setCustomerLastName("CD");
        cust2.setCustomerAddress("hyd");
        System.out.println("3rd customer details-" + cust3);


        try {
            Session session = factory.openSession();

            Transaction tx = session.beginTransaction();
            //session.save(cus1);
            //session.save(cust2);
            session.save(cust3);

            tx.commit();
            session.close();
        } catch (Exception e) {
            System.out.println("exception occured" + e);
        }
        System.out.println("program successfully done"
        );
    }
}
