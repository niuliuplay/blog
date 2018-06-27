package com.niuliuplay.service.ServiceImpl;

import com.github.pagehelper.PageHelper;
import com.niuliuplay.dao.RoleMapper;
import com.niuliuplay.pojo.Role;
import com.niuliuplay.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author liuhuihai
 * @Description
 * @Date :Created in 8:48 2018-06-27
 */
@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    RoleMapper roleMapper;

    @Override
    public List<Role> roleList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Role> getList  = roleMapper.getRoles();
        return getList;
    }
}
