package com.o0u0o.vo;

import com.o0u0o.common.enums.ResponseEnum;
import org.springframework.validation.BindingResult;

import java.util.Objects;

/**
 * @Author aiuiot
 * @Date 2020/3/2 2:24 上午
 * @Descripton:
 **/
public class ResponseVo <T> {

    // 状态值
    private Integer status;

    //消息
    private String msg;

    //数据
    private T data;

    private ResponseVo(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    private ResponseVo(Integer status, T data) {
        this.status = status;
        this.data = data;
    }

    //成功 返回消息
    public static <T> ResponseVo<T> successByMsg(String msg){
        return new ResponseVo<>(ResponseEnum.SUCCESS.getCode(), msg);
    }

    //成功 返回一个对象
    public static <T> ResponseVo<T> success(T data){
        return new ResponseVo<T>(ResponseEnum.SUCCESS.getCode(), data);
    }

    //成功
    public static <T> ResponseVo<T> success(){
        return new ResponseVo<>(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getDesc());
    }

    public static <T> ResponseVo<T> error(ResponseEnum responseEnum){
        return new ResponseVo<>(responseEnum.getCode(), responseEnum.getDesc());
    }

    public static <T> ResponseVo<T> error(ResponseEnum responseEnum, String msg){
        return new ResponseVo<>(responseEnum.getCode(), msg);
    }

    public static <T> ResponseVo error(ResponseEnum responseEnum, BindingResult bindingResult){
        return new ResponseVo<>(responseEnum.getCode(), Objects.requireNonNull(bindingResult.getFieldError().getField() + " " + bindingResult.getFieldError()));
    }
}
