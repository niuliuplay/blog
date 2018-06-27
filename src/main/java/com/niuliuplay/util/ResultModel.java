package com.niuliuplay.util;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Author liuhuihai
 * @Para msg  错误信息
 * @Para code http状态值
 * @Description 自定义的接口统一返回类型
 * @Date :Created in 20:33 2018-06-26
 */
public class ResultModel<T>  implements Serializable{
    private static final long serialVersionUID = 1L;
    @Getter @Setter
    private String msg;
    @Getter @Setter
    private String code;
    @Getter @Setter
    private T        data;
    public ResultModel(){}
    public ResultModel(String code,String msg){
        this.code = code;
        this.msg = msg;
    }
    public ResultModel(String code,String msg,T data ){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    @Override
    public String toString(){
        return "code :"+ code +", msg :"+msg;
    }
}
