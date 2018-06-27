package com.niuliuplay.dao;

import com.niuliuplay.pojo.Role;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RoleMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    List<Role> getRoles();
}