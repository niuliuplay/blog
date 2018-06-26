package com.niuliuplay.dao;

import com.niuliuplay.pojo.ActicleClassify;

public interface ActicleClassifyMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActicleClassify record);

    int insertSelective(ActicleClassify record);

    ActicleClassify selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActicleClassify record);

    int updateByPrimaryKey(ActicleClassify record);
}