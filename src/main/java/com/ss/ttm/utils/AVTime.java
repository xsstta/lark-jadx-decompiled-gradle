package com.ss.ttm.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AVTime {
    public static String getFormatNow() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm ss:SSS").format(new Date());
    }
}
