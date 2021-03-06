package com.niuliuplay.dao;

import com.niuliuplay.pojo.Comment;
import org.springframework.stereotype.Component;

@Component
public interface CommentMapper {
    int deleteByPrimaryKey(String id);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}