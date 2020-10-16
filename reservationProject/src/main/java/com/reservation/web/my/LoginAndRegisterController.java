package com.reservation.web.my;

import com.reservation.myservice.AdminService;
import com.reservation.myservice.ClerkService;
import com.reservation.myservice.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class LoginAndRegisterController {

    @Autowired
    AdminService adminService;

    @Autowired
    ClerkService clerkService;

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/toList.html")
    public String toList() {
        return "employee/list";
    }

    @RequestMapping("/register.html")
    public String login() {
        System.out.println("hello");
        return "employee/Sign up";
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
