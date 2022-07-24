package com.eylee.cluster_jpa.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonResponseVo {

    private Object result;

    private int errorCode;
    private String errorMessage;

    public CommonResponseVo(Object result){
        this.result = result;
    }

    public CommonResponseVo(){}

}