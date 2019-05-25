package com.yunding.tools;
import java.util.UUID;

public class UUIDTools {
    /**
     * 获得32位的uuid
     */
    public static String getUUID(){
        return UUID.randomUUID().toString().toUpperCase().replace("-","");
    }
}
