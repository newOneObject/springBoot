package com.cao.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/8/29.
 */
@Controller
@RequestMapping("login")
public class LoginController {

    /**
     * 测试成功返回html页面
     * @return
     */
    @RequestMapping(value = "testSuccessReturnHtml")
    @ResponseBody
    public ModelAndView testSuccessReturnHtml(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Login");
        return  modelAndView;
    }

    /**
     * 测试成功返回String字符
     * @return
     */
    @RequestMapping(value = "testSuccessReturn",method = RequestMethod.GET)
    @ResponseBody
    public String testSuccessReturn(){
        return  "no error";
    }

}
