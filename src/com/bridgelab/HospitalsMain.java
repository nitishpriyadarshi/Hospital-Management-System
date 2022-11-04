package com.bridgelab;

import java.util.Scanner;

public class HospitalsMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Hospitals hospitals=new Hospitals();
        int choice;
        do {
            System.out.println("1. Add Patient Details \n2. Show Details \n3. Exit ");
            System.out.println("Enter choice :");
            choice= sc.nextInt();
            switch (choice) {
                case 1:
                    hospitals.addPatient();
                    break;
                case 2:
                    hospitals.showDetails();
                    break;
                case 3:
                    System.out.println("Visit again!!!!");
                    break;
                default:
                    System.out.println("Enter Valid input");
                    break;
            }
        }while (choice != 3) ;
    }
}
