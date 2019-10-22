package com.jack.core.logo_common_core.core.tip;

/**
 * 返回给前端的成功提示
 */
public class SuccessTip extends Tip {


    public SuccessTip(){
        super.code = 200;
        super.message = "操作成功";
    }


    public SuccessTip(int code, String message) {
        super();
        super.code = code;
        super.message = message;
    }

}
