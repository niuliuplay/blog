package com.niuliuplay.controller;

import com.niuliuplay.logger.LoggerManage;
import com.niuliuplay.pojo.Role;
import com.niuliuplay.service.RoleService;
import com.niuliuplay.util.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author liuhuihai
 * @Description
 * @Date :Created in 8:55 2018-06-27
 */
@RestController
@RequestMapping("role")
public class RoleController {
    @Autowired
    RoleService roleService;

    @LoggerManage(description = "获取角色")
    @GetMapping("roles")
    public ResultModel getRoles(int pageNum, int pageSize){
        List<Role> roles = roleService.roleList(pageNum, pageSize);
        return new ResultModel("200","success",roles);
    }
}
