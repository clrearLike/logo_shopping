package com.jack.core.logo_common_core.core.warpper;

import java.util.List;
import java.util.Map;

/**
 * 返回给页面的包装基类
 */
public abstract class BaseWarpper {

    public Object object;

    public BaseWarpper(Object object){this.object = object;}


    public Object warp(){
        if (this.object instanceof List) {
            List<Map<String,Object>> list = (List<Map<String,Object>>) this.object;
            for (Map<String, Object> map : list) {
                warpTheMap(map);
            }
            return list;
        } else {
            return this.object;
        }
    }


    protected abstract void warpTheMap(Map<String,Object> map);

}
