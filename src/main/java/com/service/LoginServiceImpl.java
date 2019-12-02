package com.service;

import com.mapper.LoginMapper;
import com.po.po;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wuhl
 * @Date 2019/12/1 22:44
 */

@Service
public class LoginServiceImpl implements ILoginService {

    LoginServiceImpl(){
        System.out.println("2222");
    }

    @Autowired
   public LoginMapper loginMapper;

    @Override
    public List<po> getAllPo() {
        return this.loginMapper.list();
    }
}
