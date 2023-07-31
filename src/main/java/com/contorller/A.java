package com.contorller;

import org.apache.log4j.Logger;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Author wuhl
 * @Date 2019/12/1 21:40
 */

public class A implements ServletContextListener{
    private static final Logger logger=Logger.getLogger(A.class);
    A(){
        logger.debug("this is aaaaa....");
        System.out.println("aaaaa.....");
    }

    A(String a){
        System.out.println("aaaaa.....");
    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("bbbb.....");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ccc.....");
        logger.debug("this is cccc....");

    }
}
