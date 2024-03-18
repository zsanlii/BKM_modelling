package org.example;
public class User extends Person {

    private int adressId;

    private String email;

    private String passwordHash;

    private String tcNo;


    public User() {
    }

    public User(int adressId, String email, String passwordHash, String tcNo) {
        this.adressId = adressId;
        this.email = email;
        this.passwordHash = passwordHash;
        this.tcNo = tcNo;
    }

    public int getAdressId() {
        return adressId;
    }

    public void setAdressId(int adressId) {
        this.adressId = adressId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }
}


