package com.reservation.myservice.impl;

import com.reservation.bean.Employee;
import com.reservation.bean.EmployeeExample;
import com.reservation.mapper.EmployeeMapper;
import com.reservation.myservice.EmployeeService;
import com.reservation.vo.RegisterVO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public String registerEmployee(RegisterVO registerVO) {
        EmployeeExample employeeExample = new EmployeeExample();
        EmployeeExample.Criteria criteria =  employeeExample.createCriteria();
        criteria.andEmployeeNameEqualTo(registerVO.getUsername());
        List<Employee> employeeList = employeeMapper.selectByExample(employeeExample);
        if(employeeList.size()!=0){
            return "已经存在这个用户了";
        }
        Employee employee = new Employee();
        employee.setEmployeeName(registerVO.getUsername());
        employee.setEmployeePassword(registerVO.getPassword());
        employee.setEmployeeEmail(registerVO.getEmail());
        employee.setEmployeePhone(registerVO.getPhone());
        employeeMapper.insert(employee);
        return "注册成功";
    }

}
