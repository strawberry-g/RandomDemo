package com.gp.servlet;

import com.gp.service.AdminService;
import com.gp.service.impl.AdminServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "androidRegisterServlet",urlPatterns = "/servlet/adminRegisterServlet")
public class androidRegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        String id = request.getParameter("id");
        String password = request.getParameter("password");

        AdminService adminService = new AdminServiceImpl();
        adminService.register(id,password);

        PrintWriter out = response.getWriter();
        out.write("注册成功!");
        out.flush();
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
