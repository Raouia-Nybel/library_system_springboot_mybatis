package com.example.library_system_springboot_mybatis.model;

public class AuthentificationSystem {
    private int loginID;
    private String password;

    public AuthentificationSystem() {
    }
    public AuthentificationSystem(int loginID, String password) {
            this.loginID=loginID;
            this.password=password;
        }
    public int getLoginID() {
        return loginID;
    }

    public void setLoginID(int loginID) {
        this.loginID = loginID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
