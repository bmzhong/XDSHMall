package com.reservation;

import com.reservation.myservice.AdminService;
import com.reservation.myservice.ClerkService;
import com.reservation.myservice.EmployeeService;
import com.reservation.vo.RegisterVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/employee")
public class LoginAndRegisterController {

    @Autowired
    AdminService adminService;

    @Autowired
    ClerkService clerkService;

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/toIndex.html")
    public String toIndex() {
        return "employee/list";
    }

    @RequestMapping("/login.html")
    public String login() {
        System.out.println("hello");
        return "Sign in";
    }
//
//    @RequestMapping("/register.html")
//    public String register() {
//        System.out.println("hello");
//        return "Sign up.html";
//    }

//    @RequestMapping(value = "/handleRegister", produces = "application/json;charset=UTF-8")
//    @ResponseBody
//    public Map<String, Object> handleRegister(@RequestBody RegisterVO registerVO) {
//        Map<String, Object> resultMap = new HashMap<>();
//        System.out.println(registerVO.toString());
//        String resultMsg = null;
//        if (registerVO.getPersonnel().equals("餐厅员工")) {
//            resultMsg = employeeService.registerEmployee(registerVO);
//        }else if(registerVO.getPersonnel().equals("送餐员")){
//            resultMsg = clerkService.registerClerk(registerVO);
//        }else if(registerVO.getPersonnel().equals("餐厅经理")){
//            resultMsg = adminService.registerAdmin(registerVO);
//        }
//        resultMap.put("msg",resultMsg);
//        return resultMap;
//    }
}
