package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car porsche = new Car();
        System.out.println(porsche.getModel());
        porsche.setModel("Carrera");

        System.out.println(porsche.getModel());
        porsche.setModel("Unknown Model");
        System.out.println(porsche.getModel());


        BankAccount myAccount = new BankAccount("P4355", 100, "Brady", "bpeterson@test.com", "123-456-7890");
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.getNumber());
        System.out.println(myAccount.getCustomerName());
        System.out.println(myAccount.getCustomerEmail());
        System.out.println(myAccount.getCustomerPhone());

        myAccount.withdrawal(400);
        myAccount.deposit(10250);

        myAccount.setBalance(100);
        myAccount.setNumber("New Account Number");
        myAccount.setCustomerEmail("new@email.com");
        myAccount.setCustomerName("New Name");
        myAccount.setCustomerPhone("new-number");
    }
}
