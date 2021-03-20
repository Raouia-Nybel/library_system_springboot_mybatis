package com.example.library_system_springboot_mybatis.model;

public class Author {

    private int authorID;
    private String name;

    public Author( String name) {
        this.name = name;
    }

    public Author() {
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
