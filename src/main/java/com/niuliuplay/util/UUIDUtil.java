package com.niuliuplay.util;

import java.util.UUID;

/*
* 生成UUID的类
* */
public class UUIDUtil {

    public static String getUUID(){
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        return uuid;
    }

}
