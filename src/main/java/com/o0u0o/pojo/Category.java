package com.o0u0o.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Category {

    /**
     * 分类ID&主键ID
     */
    private Integer id;

    /**
     * 父ID
     */
    private Integer parentId;

    /**
     * 分类名
     */
    private String name;

    /**
     * 状态
     */
    private Boolean status;

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