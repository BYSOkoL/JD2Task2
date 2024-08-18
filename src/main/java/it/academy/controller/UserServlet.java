package it.academy.controller;

import it.academy.dto.UserDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "UserServlet", urlPatterns = "/api/user")
public class UserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String fio = req.getParameter("fio");
        String birthday = req.getParameter("birthday");

        UserDTO user = new UserDTO();
        user.setLogin(login);
        user.setPassword(password);
        user.setFio(fio);
        user.setBirthday(LocalDate.parse(birthday, DateTimeFormatter.ISO_LOCAL_DATE));
    }
}
