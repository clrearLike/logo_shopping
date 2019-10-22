package com.jack.logo_provider_us.modular.service;

import com.baomidou.mybatisplus.service.IService;
import com.jack.logo_provider_us.modular.model.Users;

import java.util.List;
import java.util.Map;

/**
 * 用户服务业务层
 */
public interface UsersService extends IService<Users> {


    /**
     * 获取全部用户信息
     * @return
     */
    List<Map<String,Object>> findAll();

}
