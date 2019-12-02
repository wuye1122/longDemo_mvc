package com.contorller;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Author wuhl
 * @Date 2019/12/1 21:40
 */

public class A implements ServletContextListener{

    A(){
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

    }
}
