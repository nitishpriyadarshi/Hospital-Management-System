package com.bridgelab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hospitals {
    PatientDetails patient = new PatientDetails();
    Scanner sc = new Scanner(System.in);
    HashMap<String,String> list =new HashMap<>();


    public void addPatient() {
        System.out.println("Enter Name :");
        patient.setName(sc.next());
        System.out.println("Enter Age:");
        patient.setAge(sc.next());
        System.out.println("Enter PhoneNumber :");
        patient.setPhoneNo(sc.next());
        System.out.println("Enter City :");
        patient.setCity(sc.next());
        System.out.println("Enter State:");
        patient.setState(sc.next());
        System.out.println("Enter Department:");
        patient.setDepartment(sc.next());
        System.out.println("Enter Hospital Name :");
        list.put(sc.next(),list.get(patient));

    }

    public void showDetails() {
        for (Map.Entry<String,String> entry:list.entrySet()) {
            System.out.println("-----------------------");
            System.out.println("Hospital Name : "+entry.getKey());
            System.out.println(patient);
            System.out.println("------------------------");
        }
    }
}

