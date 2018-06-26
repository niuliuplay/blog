package com.niuliuplay.dao;

import com.niuliuplay.pojo.Acticle;

public interface ActicleMapper {
    int deleteByPrimaryKey(String id);

    int insert(Acticle record);

    int insertSelective(Acticle record);

    Acticle selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Acticle record);

    int updateByPrimaryKeyWithBLOBs(Acticle record);

    int updateByPrimaryKey(Acticle record);
}