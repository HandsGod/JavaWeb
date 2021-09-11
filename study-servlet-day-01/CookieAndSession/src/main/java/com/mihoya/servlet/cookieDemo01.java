package com.mihoya.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Date;

public class cookieDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setCharacterEncoding("utf-8");
        req.setCharacterEncoding("utf-8");

        //客户端得到Cookie
        Cookie[] cookies = req.getCookies();
        if(cookies!=null){
            for (int i=0;i<cookies.length;i++){
                Cookie cookie=cookies[i];
                if(cookie.getName().equals("llt")){
                    Long llt=Long.parseLong(cookie.getValue());
                    Date date=new Date(llt);
                    out.write(date.toLocaleString());
                }
            }
        }
        else {
            out.write(URLEncoder.encode("第一次访问"));
        }

        //服务器端给客户端颁发Cookie
        Cookie cookie=new Cookie("llt",System.currentTimeMillis()+"");
        resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
