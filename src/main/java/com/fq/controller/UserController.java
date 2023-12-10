package com.fq.controller;

import com.fq.pojo.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RequestMapping("users")
@RestController
public class UserController {

    @GetMapping("add1")
    public String add1(String username, String password) {
        System.out.println("username:" + username);
        System.out.println("password:" + password);
        return "success";
    }

    @GetMapping("add2")
    public String add2(User user) {
        System.out.println("username:" + user.getUserName());
        System.out.println("password:" + user.getPassword());
        return "success";
    }

    /**
     * 接收RestFul风格的请求
     */
    @GetMapping("add3/{username}/{password}")
    public String add3(@PathVariable("username") String userName, @PathVariable String password) {
        System.out.println("username:" + userName);
        System.out.println("password:" + password);
        return "success";
    }

    /**
     * request对象中的数据是以key:value的键值对形式存储的
     * key就是前端中参数名称：
     *
     * @param request
     * @return
     */
    @GetMapping("add4")
    public String add4(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:" + username);
        System.out.println("password:" + password);
        return "success";
    }

    @GetMapping("add5")
    public User add5(@RequestBody User user) {
        System.out.println("username:" + user.getUserName());
        System.out.println("password:" + user.getPassword());
        return user;
    }


    @GetMapping("add6")
    public User add6(@RequestBody User user) {
        System.out.println("username:" + user.getUserName());
        System.out.println("password:" + user.getPassword());
        return user;
    }


    @GetMapping("add7")
    public User add7(@RequestBody User user) {
        System.out.println(user);
        return user;
    }

    /**
     * 前端传递的是简单的json数据格式：
     * {"username":"fq","password":"123"}
     *
     * @param map
     * @return
     */
    @GetMapping("add8")
    public String add8(@RequestBody Map<String, String> map) {
        String username = map.get("username");
        String password = map.get("password");
        System.out.println("username:" + username);
        System.out.println("password:" + password);
        return "success";
    }

    @GetMapping("add9")
    public String add9(@RequestParam("username") String userName, @RequestParam(value = "password", defaultValue = "123") String password) {

        return userName + "---" + password;
    }


}
