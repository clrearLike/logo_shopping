package com.jack.core.logo_common_core.core.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.jack.core.logo_common_core.core.page.PageHelper;
import com.jack.core.logo_common_core.core.tip.SuccessTip;
import com.jack.core.logo_common_core.core.util.HttpKit;
import com.jack.core.logo_common_core.core.warpper.BaseWarpper;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 控制层基类
 */
public class BaseController {

    protected static String SUCCESS = "SUCCESS";
    protected static String ERROR = "ERROR";

    protected static String REDIRECT = "REDIRECT";
    protected static String FORWARD = "FORWARD";

    protected static SuccessTip successTip = new SuccessTip();


    protected HttpServletRequest getRequest(){
        return HttpKit.getRequest();
    }

    protected HttpServletResponse getResponse(){
        return HttpKit.getResponse();
    }

    protected HttpSession getSession(){
        return HttpKit.getRequest().getSession();
    }


    /**
     * 把service层的分页信息，封装为Bootstrap table通用的分页封装
     */
    protected <T> PageHelper<T> pageForBT(Page<T> page) {
        return new PageHelper<T>(page);
    }


    /**
     * 包装一个list，让list增加额外的属性
     * @param baseWarpper
     * @return
     */
    protected Object warpObject(BaseWarpper baseWarpper) {
        return baseWarpper.warp();
    }




}
