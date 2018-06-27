package com.niuliuplay.service;

import com.niuliuplay.pojo.Role;
import java.util.List;

/**
 * @Author liuhuihai
 * @Description
 * @Date :Created in 8:42 2018-06-27
 */
public interface RoleService {

    List<Role> roleList(int pageNum, int pageSize);
}
