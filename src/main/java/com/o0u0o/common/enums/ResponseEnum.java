package com.o0u0o.common.enums;

import lombok.Getter;

/**
 * @Author aiuiot
 * @Date 2020/3/2 2:26 上午
 * @Descripton:
 **/
@Getter
public enum ResponseEnum {

    SUCCESS(0, "成功"),

    ADD_CATEGORY_FAID(1, "添加分类失败")

    ;

    /**
     * 响应码
     */
    Integer code;

    /**
     * 描述
     */
    String desc;

    ResponseEnum(Integer code, String desc){
        this.code = code;
        this.desc = desc;
    }
}
