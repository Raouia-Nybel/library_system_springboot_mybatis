package com.example.library_system_springboot_mybatis.model;

public class Member {
    private int userID;
    private String password;
    private String address;
    private String firstName;
    private String lastName;
    private double phoneNo;
    private String profession;


    public Member(String password, String address, String firstName, String lastName, double phoneNo, String profession) {

        this.password = password;
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        this.profession = profession;

    }

    public Member() {
    }

    public int getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getPhoneNo() {
        return phoneNo;
    }

    public String getProfession() {
        return profession;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNo(double phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
