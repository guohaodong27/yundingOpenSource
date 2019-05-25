package com.yunding.tools;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 常量配置类
 */
@Component
public class MyConst {

    //分页时每页的大小
    @Value("10")
    private int pageSize;

    public int getPageSize() {
        return pageSize;
    }

}
