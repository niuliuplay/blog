package com.niuliuplay.dao;

import com.niuliuplay.pojo.RoleMenu;
import org.springframework.stereotype.Component;

@Component
public interface RoleMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleMenu record);

    int insertSelective(RoleMenu record);

    RoleMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleMenu record);

    int updateByPrimaryKey(RoleMenu record);
}