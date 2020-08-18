package com.o0u0o.dao;

import com.o0u0o.pojo.Category;

/**
 * 分类
 * @author aiuiot
 */
public interface CategoryMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}