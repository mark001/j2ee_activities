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
public class ProcessAdminServlet extends HttpServlet{
    public void init() throws ServletException{
    
    }
    public void destroy(){
    
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String name = request.getParameter("name");
        String course = request.getParameter("course");
        String type = request.getParameter("type");
        
        PrintWriter out = response.getWriter();
        out.println("Name: " + name);
        out.println("Course: " + course);
        out.println("Programming Languages:");
        if(request.getParameterValues("pl") != null)
        {
            String[] pl = request.getParameterValues("pl");
            for (int i = 0; i < pl.length; i++)
             out.print(pl[i] + " ");
        }
        out.print("The Real Champion:");
        if (request.getParameter("winner") != null)
        {
            String winner = request.getParameter("winner");
            if(winner.equals("Manny Pacquiao"))
                out.println("You're a winner!");
            else
                out.println("You're gay!");
        }
        out.println("You are an" + type +"! Congratulations!");
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String name = request.getParameter("name");
        String course = request.getParameter("course");
        String type = request.getParameter("type");
        
        PrintWriter out = response.getWriter();
        out.println("Name: " + name);
        out.println("Course: " + course);
        out.println("Programming Languages:");
        if(request.getParameterValues("pl") != null)
        {
            String[] pl = request.getParameterValues("pl");
            for (int i = 0; i < pl.length; i++)
             out.print(pl[i] + " ");
        }
        out.print("The Real Champion:");
        if (request.getParameter("winner") != null)
        {
            String winner = request.getParameter("winner");
            if(winner.equals("Manny Pacquiao"))
                out.println("You're a winner!");
            else
                out.println("You're gay!");
        }
        out.println("You are an" + type +"! Congratulations!");
    }
}
