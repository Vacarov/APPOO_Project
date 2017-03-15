package com.servlet;

import com.database.data.AuthetificationService;
import com.database.data.RegistrationRepository;
import com.database.util.ConnectionConfiguration;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;

/**
 * Created by wergin on 03-Mar-17.
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        AuthetificationService authetificationService = new AuthetificationService();
        if (authetificationService.authetification(email, password).booleanValue()) {
            HttpSession session = request.getSession();
            session.setAttribute("emailLogin", email);
            response.setContentType("text/html");
            response.sendRedirect("home.jsp");
        } else response.sendRedirect("index.jsp");
    }
}