package com.gp.servlet;

import com.google.gson.Gson;
import com.gp.model.Admin;
import com.gp.service.AdminService;
import com.gp.service.impl.AdminServiceImpl;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AdminLoginServlet",urlPatterns = "/servlet/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final Logger LOGGER = LogManager.getLogger(AdminLoginServlet.class);

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        //PrintWriter out = response.getWriter();

        String id = request.getParameter("id");
        String password = request.getParameter("password");

        AdminService adminService = new AdminServiceImpl();
       /* boolean b = false;
        try {
            b = adminService.login(id,password);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        if (id.equals("1001") && password.equals("1001")){
            System.out.println("登录成功");
        }else {
            System.out.println("登陆失败");
        }
        //out.write(String.valueOf(b));
        //out.flush();
        //out.close();

        //改变地址栏
        response.sendRedirect("../view.html");
        LOGGER.debug("跳转成功");
        return;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
