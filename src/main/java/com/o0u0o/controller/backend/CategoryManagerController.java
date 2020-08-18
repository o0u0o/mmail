package com.o0u0o.controller.backend;

import com.o0u0o.form.CategoryAddForm;
import com.o0u0o.service.ICategoryService;
import com.o0u0o.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author aiuiot
 * @Date 2020/3/2 2:06 上午
 * @Descripton: 后台-分类管理接口
 **/
@RestController
@RequestMapping("/manage/category")
public class CategoryManagerController {

    @Autowired
    private ICategoryService categoryService;

    /**
     * 新增分类
     * @param form
     * @return
     */
    @PostMapping("/add")
    public ResponseVo add(@RequestBody CategoryAddForm form){
        //用户是否登录
        //校验是否为管理员
        return categoryService.add(form);
    }

    /**
     * 删除分类
     * @param id 分类ID
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public ResponseVo delete(@PathVariable Integer id){
        return categoryService.delete(id);
    }

    @GetMapping("test")
    public ResponseVo test(){
        return ResponseVo.success();
    }

}
