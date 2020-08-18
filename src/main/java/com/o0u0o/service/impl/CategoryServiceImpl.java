package com.o0u0o.service.impl;

import com.o0u0o.common.enums.ResponseEnum;
import com.o0u0o.dao.CategoryMapper;
import com.o0u0o.form.CategoryAddForm;
import com.o0u0o.pojo.Category;
import com.o0u0o.service.ICategoryService;
import com.o0u0o.vo.ResponseVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author aiuiot
 * @Date 2020/3/2 2:30 上午
 * @Descripton:
 **/
@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public ResponseVo add(CategoryAddForm form){
        Category category = new Category();
        form.setCreateTime(new Date());
        form.setUpdateTime(new Date());
        BeanUtils.copyProperties(form, category);

        int row = categoryMapper.insertSelective(category);
        if (row == 0){
            return ResponseVo.error(ResponseEnum.ADD_CATEGORY_FAID);
        }
        return ResponseVo.successByMsg("添加分类成功");
    }

    /**
     * 删除分类ID
     * @param id 分类ID
     * @return
     */
    @Override
    public ResponseVo delete(Integer id) {

        Category category = categoryMapper.selectByPrimaryKey(id);
        if (category == null){
            return ResponseVo.error(ResponseEnum.ADD_CATEGORY_FAID);
        }

        int i = categoryMapper.deleteByPrimaryKey(id);
        if (i == 0){
            //细化休息改
            return ResponseVo.error(ResponseEnum.ADD_CATEGORY_FAID);
        }
        return ResponseVo.success();
    }
}
