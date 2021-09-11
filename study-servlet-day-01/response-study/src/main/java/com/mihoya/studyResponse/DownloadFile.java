package com.mihoya.studyResponse;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.Set;

public class DownloadFile extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取下载文件的路径
        ServletContext servletContext = this.getServletContext();
        String realPath="/Users/hubeizhiwuren/IdeaProjects/Maven/study-servlet-day-01/response-study/src/main/resources/img.png";
        //2.获取下载文件名
        String FileName=realPath.substring(realPath.lastIndexOf("/")+1);
        System.out.println(FileName);
        //3.设置浏览器能够支持下载
        /**
         * resp.setHeader("content-disposition", "attachment;filename=" + FileName);强制浏览器下载
         * resp.setHeader("content-disposition", "inline;filename=" + FileName);支持office online或浏览器预览pdf功能
         */
        resp.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(FileName,"utf-8"));
        //4.获取下载文件的输入流
        FileInputStream in=new FileInputStream(realPath);
        //5.设置缓冲区
        int len=0;
        byte[] buffer=new byte[1024];
        //6.获取output对象
        ServletOutputStream out = resp.getOutputStream();
        //7.将文件写入到缓冲区，并将缓冲区数据输出到客户端
        while((len=in.read(buffer))>0){
            out.write(buffer,0,len);
        }
        in.close();
        out.close();

    }
}
