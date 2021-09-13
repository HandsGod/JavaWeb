package com.mihoya.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * 设置session，往session中存取数据
 */
public class sessionDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决乱码问题
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");
        //拿到session
        HttpSession session = req.getSession();
        //往session中存东西
        session.setAttribute("name","张三");
        //拿到session ID
        String id = session.getId();
        //判断session是不是新创建的
        if(session.isNew()){

            resp.getWriter().write("第一次访问：");
        }
        else{
            resp.getWriter().write("session id is："+id);
        }

        /*
        session创建的时候做了什么
         Cookie cookie=new Cookie("JSESSIONID",id);
        resp.addCookie(cookie);
         */

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
