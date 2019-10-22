package com.jack.core.logo_common_core.core.tip;

/**
 * 返回给前端的错误提示
 */
public class ErrorTip extends Tip {

    public ErrorTip(int code,String message){
        super();
        super.code = code;
        super.message = message;
    }


}
