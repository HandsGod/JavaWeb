package com.mihoya.studyResponse;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class imageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //1.让浏览器3秒刷新一次
        resp.setHeader("refresh","3");
        //2.在内存中创建一个图片
        BufferedImage bufferedImage = new BufferedImage(80, 20, BufferedImage.TYPE_INT_RGB);
        //3.得到图片
        Graphics2D g= (Graphics2D) bufferedImage.getGraphics();
        //4.设置图片的背景颜色
        g.setColor(Color.WHITE);
        g.fillRect(0,0,80,20);
        //5.给图片写数据
        g.setColor(Color.BLUE);
        g.setFont(new Font(null,Font.BOLD,20));
        g.drawString(getRandomNum(),0,20);
        //6.告诉浏览器，这个请求用图片方式打开
        resp.setContentType("image/png");
        //网站存在缓存，不让浏览器缓存
        resp.setDateHeader("expires",-1);
        resp.setHeader("Cache-Control","no-cache");
        resp.setHeader("Pragma","no-cache");
        //7.把图片写给浏览器
        ImageIO.write(bufferedImage,"png",resp.getOutputStream());
    }
    private String getRandomNum(){
        Random random=new Random();
        String num = random.nextInt(9999999) + "";
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<7-num.length();i++){
            sb.append("0");
        }
        num=num+sb.toString();
        return num;
    }

}
