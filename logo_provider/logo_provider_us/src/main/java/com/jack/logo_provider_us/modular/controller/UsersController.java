package com.jack.logo_provider_us.modular.controller;

import com.jack.core.logo_common_core.core.controller.BaseController;
import com.jack.logo_provider_us.modular.service.UsersService;
import com.jack.logo_provider_us.modular.warpper.UsersWarpper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/users")
public class UsersController extends BaseController {

    private final String PREFIX = "user/";

    @Resource
    private UsersService usersService;


    @RequestMapping("")
    public String index(){
        return PREFIX + "list.html";
    }


    @RequestMapping("/list")
    public Object list(){
        List<Map<String,Object>> list = this.usersService.findAll();
        return new UsersWarpper(list).warp();
    }



}
