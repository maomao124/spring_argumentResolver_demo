package mao.spring_argumentresolver_demo.controller;

import mao.spring_argumentresolver_demo.CurrentUser;
import mao.spring_argumentresolver_demo.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project name(项目名称)：spring_argumentResolver_demo
 * Package(包名): mao.spring_argumentresolver_demo.controller
 * Class(类名): UserController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/11/7
 * Time(创建时间)： 21:09
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@RestController
@RequestMapping(value = "/user")
public class UserController
{
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    //获取当前系统登录用户
    @GetMapping("/getCurrentUser")
    public String getCurrentUser(@CurrentUser User user)
    {
        log.info(user.toString());
        return user.toString();
    }
}
