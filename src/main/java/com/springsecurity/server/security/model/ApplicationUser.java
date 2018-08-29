package com.springsecurity.server.security.model;

public class ApplicationUser {
    private String Username;
    private String Password;

    public ApplicationUser() {
    }

    public ApplicationUser(String username, String password) {
        Username = username;
        Password = password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}