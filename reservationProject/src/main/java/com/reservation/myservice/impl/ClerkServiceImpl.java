package com.reservation.myservice.impl;

import com.reservation.bean.Clerk;
import com.reservation.bean.ClerkExample;
import com.reservation.mapper.ClerkMapper;
import com.reservation.myservice.ClerkService;
import com.reservation.vo.RegisterVO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClerkServiceImpl implements ClerkService {

    @Autowired
    ClerkMapper clerkMapper;



    @Override
    public String registerClerk(RegisterVO registerVO) {
        ClerkExample clerkExample =  new ClerkExample();
        ClerkExample.Criteria criteria =  clerkExample.createCriteria();
        criteria.andClearkNameEqualTo(registerVO.getUsername());
        List<Clerk> clerkList = clerkMapper.selectByExample(clerkExample);
        if(clerkList.size()!=0){
            return "已经存在这个用户了";
        }
        Clerk clerk =  new Clerk();
        clerk.setClearkName(registerVO.getUsername());
        clerk.setClearkPassword(registerVO.getPassword());
        clerk.setClerkEmail(registerVO.getEmail());
        clerk.setClerkPhone(registerVO.getPhone());
        clerkMapper.insert(clerk);
        return "注册成功";
    }

    @Override
    public List<Clerk> selectClerkByUsername(String username) {
        ClerkExample clerkExample =  new ClerkExample();
        ClerkExample.Criteria criteria = clerkExample.createCriteria();
        criteria.andClearkNameEqualTo(username);
        return clerkMapper.selectByExample(clerkExample);
    }
}
