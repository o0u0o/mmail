package com.o0u0o.common.exception;

import com.o0u0o.common.enums.ResponseEnum;
import com.o0u0o.vo.ResponseVo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author aiuiot
 * @Date 2020/3/2 3:30 上午
 * @Descripton: 自定义异常处理类
 **/
@ControllerAdvice
public class RuntimeExceptionHander {

    /**
     * 捕获运行时异常 要捕获的exception类
     * @param e
     * @return
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public ResponseVo handle(RuntimeException e){
        return ResponseVo.error(ResponseEnum.ADD_CATEGORY_FAID, e.getMessage());
    }


}
