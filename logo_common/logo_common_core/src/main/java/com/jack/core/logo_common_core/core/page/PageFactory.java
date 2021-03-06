package com.jack.core.logo_common_core.core.page;


import com.baomidou.mybatisplus.plugins.Page;
import com.jack.core.logo_common_core.core.util.HttpKit;
import com.jack.core.logo_common_core.core.util.ToolUtil;

import javax.servlet.http.HttpServletRequest;

/**
 * bootstrap table 默认分页参数创建
 * @param <T>
 */
public class PageFactory<T> {


    public Page<T> defaultPage(){
        HttpServletRequest request = HttpKit.getRequest();
        int limit = Integer.valueOf(request.getParameter("limit"));
        int offset = Integer.valueOf(request.getParameter("offset"));
        String sort = request.getParameter("sort");
        String order = request.getParameter("order");

        if (ToolUtil.isEmpty(sort)) {
            Page<T> page = new Page<>((offset / limit + 1), limit);
            page.setOpenSort(false);
            return page;
        } else {
            Page<T> page = new Page<>((offset / limit + 1), limit, sort);
            if ("asc".equals(order)) {
                page.setAsc(true);
            } else {
                page.setAsc(false);
            }
            return page;
        }
    }


}
