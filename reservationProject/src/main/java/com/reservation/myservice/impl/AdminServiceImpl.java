package com.reservation.myservice.impl;

import com.reservation.bean.AdminUser;
import com.reservation.bean.AdminUserExample;
import com.reservation.mapper.AdminUserMapper;
import com.reservation.myservice.AdminService;
import com.reservation.vo.RegisterVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminUserMapper adminUserMapper;

    @Override
    public String registerAdmin(RegisterVO registerVO) {
        AdminUserExample adminUserExample = new AdminUserExample();
        AdminUserExample.Criteria criteria = adminUserExample.createCriteria();
        criteria.andUsernameEqualTo(registerVO.getUsername());
        List<AdminUser> adminUserList = adminUserMapper.selectByExample(adminUserExample);
        if(adminUserList.size()!=0){
            return "已经存在这个用户了";
        }
        AdminUser adminUser = new AdminUser();
        adminUser.setUsername(registerVO.getUsername());
        adminUser.setPassword(registerVO.getPassword());
        adminUser.setAdminEmail(registerVO.getEmail());
        adminUser.setAdminPhone(registerVO.getPhone());
        adminUserMapper.insert(adminUser);
        return "注册成功";

    }
}
