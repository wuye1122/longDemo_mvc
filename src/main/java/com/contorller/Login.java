package com.contorller;

import com.po.po;
import com.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author wuhl
 */

@Controller
@RequestMapping("/login")
public class Login {

     Login(){
         System.out.println("asdad");
     }
     @Autowired
     public ILoginService iLoginService;

     @RequestMapping("/getAll")
     public String getAllLogin(){
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
        List<po> list =this.iLoginService.getAllPo();
        System.out.println(list.toString());
        System.out.println(list.size());
        response.setContentType("application/json;charset=UTF-8");
        return list.toString();

    }
}
