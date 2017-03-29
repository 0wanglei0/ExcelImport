package com.servlet.car;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("username") != null && request.getParameter("username") == null) {
            request.getRequestDispatcher("/jsp/MainC.jsp").forward(request, response);
        } else {
            request.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=UTF-8");
            String username = request.getParameter("username").trim();
            if (!"wang".equals(username)) {
                request.getRequestDispatcher("/Error.jsp").forward(request, response);
            } else {
                session.setAttribute("username", username);
                request.getRequestDispatcher("/jsp/MainC.jsp").forward(request, response);
            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
