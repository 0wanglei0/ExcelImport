package com.login.servlet;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionCounter implements HttpSessionListener {

    private static int sessionCount = 0;
    public void sessionCreated(HttpSessionEvent event) {
     HttpSession session = event.getSession();
     ServletContext application = session.getServletContext();
     sessionCount++;
     application.setAttribute("onlineCount", 5);
    }
    public void sessionDestroyed(HttpSessionEvent event) {
     HttpSession session = event.getSession();
     ServletContext application = session.getServletContext();
     if(sessionCount >= 1){
     sessionCount = sessionCount - 1;
    }
    application.setAttribute("onlineCount", 5);
    }

}
