package com.xidian.mall.web.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class Jump {

    @Value("${redirect.url}")
    String redirectUrl;

    @RequestMapping("/toJump.html")
    public void testRed(HttpServletResponse response) throws Exception{
//        response.sendRedirect("http://localhost:8080/");
//        response.sendRedirect("http://n316a18929.zicp.vip");
        response.sendRedirect(redirectUrl);
    }

}
