package com.contorller;

import com.po.po;
import com.service.ILoginService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author wuhl
 */

@Controller
@RequestMapping("/login")
public class Login {

    @RequestMapping("/index")
    public String index(){
        logger.debug("getIndex.....");
        logger.info("getIndex.....");
        logger.error("getIndex.....");
        System.out.println("Index......");
        return "index";
    }

    private static final Logger logger=Logger.getLogger(Login.class);
     Login(){
         System.out.println("asdad");
         logger.debug("xxxxxasdad");
         logger.info("xxxxasdadx");
         logger.error("xxxxasdad-------------x");
         logger.warn("=======asdad===========");

     }
     @Autowired
     public ILoginService iLoginService;

     @RequestMapping("/getAll")
     public String getAllLogin(){
         logger.debug("getAllLogin.....");
         logger.info("getAllLogin.....");
         logger.error("getAllLogin.....");
         System.out.println("getAll......");
         List<po> list =this.iLoginService.getAllPo();
         System.out.println(list.toString());
         System.out.println(list.size());
         return "index";
     }

    @ResponseBody
    @RequestMapping(value="/get",produces = "application/json; charset=utf-8")
    public String getAll(HttpServletRequest request,HttpServletResponse response){
        System.out.println("get......");
        System.out.println(request.getCharacterEncoding());
        logger.debug("get.....");
        logger.info("get.....");
        logger.error("get.....");

        List<po> list =this.iLoginService.getAllPo();
        System.out.println(list.toString());
        System.out.println(list.size());
        response.setContentType("application/json;charset=UTF-8");
        return list.toString();

    }
}
