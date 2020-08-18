package com.o0u0o.service;

import com.o0u0o.form.CategoryAddForm;
import com.o0u0o.vo.ResponseVo;

/**
 * @Author aiuiot
 * @Date 2020/3/2 2:30 上午
 * @Descripton: 分类服务接口
 **/
public interface ICategoryService {

    /**
     * 添加分类
     * @param form
     * @return
     */
    ResponseVo add(CategoryAddForm form);

    /**
     * 删除分类
     * @param id 分类ID
     * @return
     */
    ResponseVo delete(Integer id);
}
