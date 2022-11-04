package com.bridgelab;

public class PatientDetails {
    private String name;
    private String age;
    private String phoneNo;
    private String city;
    private String state;
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Patient Details :-"+'\n' +
                "Name :" + name + '\n' +
                "Age :" + age + '\n' +
                "PhoneNo :" + phoneNo + '\n' +
                "City :" + city + '\n' +
                "State :" + state ;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
