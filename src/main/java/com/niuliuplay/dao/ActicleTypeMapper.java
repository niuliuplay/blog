package com.niuliuplay.dao;

import com.niuliuplay.pojo.ActicleType;
import org.springframework.stereotype.Component;

@Component
public interface ActicleTypeMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(ActicleType record);

    int insertSelective(ActicleType record);

    ActicleType selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(ActicleType record);

    int updateByPrimaryKey(ActicleType record);
}