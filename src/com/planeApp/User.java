package com.planeApp;

import java.math.BigInteger;

public class User {
    private String name;
    private String email;
    private BigInteger phoneNumber;
    private int ID;
    private BigInteger passport;

    public User(String name, String email, BigInteger phoneNumber, int ID, BigInteger passport) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.ID = ID;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigInteger getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(BigInteger phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public BigInteger getPassport() {
        return passport;
    }

    public void setPassport(BigInteger passport) {
        this.passport = passport;
    }
}
