package com.example.library_system_springboot_mybatis.model;

public class Reservations {
    private int reservationNo;
    private int reserveDate;
    private int returnDate;
    private int duration;
    private double fees;
    private int ISBN;
    private int userID;
    private int adminID;

    public Reservations(int reservationNo, int reserveDate, int returnDate, int duration, double fees, int ISBN, int userID, int adminID) {
        this.reservationNo=reservationNo;
        this.reserveDate = reserveDate;
        this.returnDate = returnDate;
        this.duration = duration;
        this.fees = fees;
        this.ISBN = ISBN;
        this.userID = userID;
        this.adminID=adminID;
    }

    public Reservations() {
    }

    public int getReservationNo() {
        return reservationNo;
    }

    public void setReservationNo(int reservationNo) {
        this.reservationNo = reservationNo;
    }

    public int getReserveDate() {
        return reserveDate;
    }

    public void setReserveDate(int reserveDate) {
        this.reserveDate = reserveDate;
    }

    public int getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(int returnDate) {
        this.returnDate = returnDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }
}
