package com.service;

import com.contorller.A;
import com.mapper.LoginMapper;
import com.po.po;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wuhl
 * @Date 2019/12/1 22:44
 */

@Service
public class LoginServiceImpl implements ILoginService {
    private static final Logger logger=Logger.getLogger(LoginServiceImpl.class);


    LoginServiceImpl(){
        System.out.println("2222");
        logger.debug("xxxxx=====2222===================");
        logger.info("xxxxx===========2222=======");
        logger.error("xxxxx===========2222===========================================================================");
        logger.warn("==================");

    }

    @Autowired
   public LoginMapper loginMapper;

    @Override
    public List<po> getAllPo() {
        return this.loginMapper.list();
    }
}
