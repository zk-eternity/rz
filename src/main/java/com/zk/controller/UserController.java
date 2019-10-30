package com.zk.controller;

import com.zk.pojo.User;
import com.zk.pojo.UserVo;
import com.zk.service.UserService;
import com.zk.utils.Captcha2;
import com.zk.utils.R;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/sys")
@CrossOrigin("http://localhost:8989")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public R LoginLogic(@RequestBody UserVo userVo, HttpServletResponse response) throws IOException {
        System.out.println("login");
        System.out.println(userVo);
        UsernamePasswordToken token = new UsernamePasswordToken(userVo.getUsername(), userVo.getPassword());
        Subject subject = SecurityUtils.getSubject();
        subject.login(token);
        return R.ok();
    }

    @RequestMapping("/logout")
    @ResponseBody
    public R logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return R.ok();
    }

    @RequestMapping("/user/password")
    @ResponseBody
    public R password(@RequestBody UserVo userVo) {
        userService.UpdateUserByUsername(userVo.getUsername(), userVo.getPassword());
        return R.ok();
    }

    @RequestMapping("captcha")
    public void captcha(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Captcha2.generateCaptcha(request, response);
    }

    @RequestMapping("/user/info")
    @ResponseBody
    public R info() {
        String username = (String) SecurityUtils.getSubject().getPrincipal();
        User user = userService.queryUserByUsername(username);
        return R.ok().put("user", user);
    }


}
