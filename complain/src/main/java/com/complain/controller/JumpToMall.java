package com.complain.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
public class JumpToMall {

    @Value("${redirect.url}")
    String redirectUrl;

    @RequestMapping("/toJump")
    public void testRed(HttpServletResponse response) throws Exception{
//        response.sendRedirect("http://3165i18929.picp.vip/mall");
        response.sendRedirect(redirectUrl);
    }
}
