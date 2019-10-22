package com.jack.logo_provider_us.modular.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jack.logo_provider_us.modular.dao.UsersMapper;
import com.jack.logo_provider_us.modular.model.Users;
import com.jack.logo_provider_us.modular.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

    @Resource
    private UsersMapper usersMapper;

    @Override
    public List<Map<String, Object>> findAll() {
        return this.baseMapper.selectAll();
    }
}
