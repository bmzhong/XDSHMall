package com.xidian.mall.web.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class Jump {

    @RequestMapping("/toJump.html")
    public void testRed(HttpServletResponse response) throws Exception{
        response.sendRedirect("http://www.blabla1024.cn:8080/");
    }

}
