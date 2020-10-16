package com.reservation.myservice;

import com.reservation.bean.Clerk;
import com.reservation.vo.RegisterVO;

import java.util.List;

public interface ClerkService {

    String registerClerk(RegisterVO registerVO);

    List<Clerk> selectClerkByUsername(String username);
}
