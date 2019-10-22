package com.jack.logo_provider_us.modular.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jack.logo_provider_us.modular.model.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 用户服务DAO层
 */
@Mapper
public interface UsersMapper extends BaseMapper<Users> {

    /**
     * 获取用户所有数据
     * @return
     */
    List<Map<String,Object>> selectAll();

}
