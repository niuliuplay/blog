package com.niuliuplay.dao;

import com.niuliuplay.pojo.Token;
import org.springframework.stereotype.Component;

@Component
public interface TokenMapper {
    int deleteByPrimaryKey(String id);

    int insert(Token record);

    int insertSelective(Token record);

    Token selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Token record);

    int updateByPrimaryKey(Token record);
}