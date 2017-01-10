package com.login.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

    public LoginServlet() {
        super();
    }

    public void init() throws ServletException
    {
        System.out.println("Begin");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String username = request.getParameter("username").trim();
        if (!"wang".equals(username)) {
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/jsp/main.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
