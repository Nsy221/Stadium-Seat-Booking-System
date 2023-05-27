/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stadiumseatbooking;

/**
 *
 * @author Nassya
 */
public class Customer {
    private String name;
    private String email;
    // Add other customer attributes as needed

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }
    
      @Override
    public String toString() {
        return "Name: " + name + "  , Email: " + email;
    
}
}