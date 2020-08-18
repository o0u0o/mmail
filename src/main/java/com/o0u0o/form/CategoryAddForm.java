package com.o0u0o.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Author aiuiot
 * @Date 2020/3/2 2:36 上午
 * @Descripton:
 **/
@Data
public class CategoryAddForm {


    /**
     * 父ID
     */
    private Integer parentId = 0;

    /**
     * 分类名
     */
    @NotBlank
    private String name;

    /**
     * 状态
     */
    private Boolean status = true;

    /**
     * 排序
     */
    private Integer sortOrder;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
