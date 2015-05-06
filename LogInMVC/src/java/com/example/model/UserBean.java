/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

/**
 *
 * @author User
 */
public class UserBean 
{
    public boolean isUserValid(String username, String password)
    {
        boolean valid = false;
        
        if (username.equals("mark") && password.equals("mark"))
            valid = true;
        
        return valid;
    }
}
