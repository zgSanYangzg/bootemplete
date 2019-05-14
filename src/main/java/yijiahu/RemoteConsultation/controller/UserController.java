package yijiahu.RemoteConsultation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yijiahu.RemoteConsultation.service.IUserService;

import javax.annotation.Resource;

@RestController
public class UserController {

    private Logger logger=LoggerFactory.getLogger(this.getClass());
    @Resource
    private IUserService iUserService;


    @RequestMapping("/hello")
    public Object sayHello() {
        logger.info("this is one  hello  !");
        return "hello";
    }

    @RequestMapping("/login")
    public String login(String username,String passwd) {
        boolean login = iUserService.login(username, passwd);
        if(login) {
            return "登陆成功";
        }else {
            return  "登陆失败";
        }
    }

    @RequestMapping("/register")
    public String register(String username,String passwd) {
        boolean login = iUserService.register(username, passwd);
        if(login) {
            return "注册成功";
        }else {
            return  "注册失败";
        }
    }
}
