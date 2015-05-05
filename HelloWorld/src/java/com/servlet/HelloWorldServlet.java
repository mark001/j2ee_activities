/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class HelloWorldServlet extends HttpServlet{
    public void init() throws ServletException{
    
    }
    public void destroy(){
    
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String name = request.getParameter("name");
        String course = request.getParameter("course");
        String[] pl = request.getParameterValues("pl");
                
        PrintWriter out = response.getWriter();
        out.println("Name: " + name);
        out.println("Course: " + course);
        out.println("Programming Languages:");
        for (int i = 0; i < pl.length; i++)
             out.println(pl[i]);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String name = request.getParameter("name");
        String course = request.getParameter("course");
        
        
        PrintWriter out = response.getWriter();
        out.println("Name: " + name);
        out.println("Course: " + course);
        out.println("Programming Languages:");
        if(request.getParameterValues("pl") != null || request.getParameter("winner") != null)
        {
            String[] pl = request.getParameterValues("pl");
            String winner = request.getParameter("winner");
            for (int i = 0; i < pl.length; i++)
             out.println(pl[i]);
            if(winner.equals("Manny Pacquiao"))
                out.println("You're a winner!");
            else
                out.println("You're gay!");
        }
    }
}
