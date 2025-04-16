package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the Serial Number: ");
        String serialNumber = input.nextLine();
        System.out.print("Please enter your phones Model: ");
        String model = input.nextLine();
        System.out.print("Please enter your service Carrier: ");
        String carrier = input.nextLine();
        System.out.print("Please enter your Phone Number: ");
        String phoneNumber = input.nextLine();
        System.out.print("Please enter the owner of the Phone: ");
        String owner = input.nextLine();

        CellPhone userPhone = new CellPhone(serialNumber, model, carrier, phoneNumber, owner);

        System.out.println("Serial Number: " + userPhone.getSerialNumber());
        System.out.println("Model: " + userPhone.getModel());
        System.out.println("Carrier: " + userPhone.getCarrier());
        System.out.println("Phone Number: " + userPhone.getPhoneNumber());
        System.out.println("Owner: " + userPhone.getOwner());






    }

}


