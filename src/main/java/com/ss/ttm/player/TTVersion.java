package com.ss.ttm.player;

import com.ss.ttm.port.BuildConfig;

public class TTVersion {
    public static final String VERSION_NAME = "2.10.56.60-lark";

    public static void saveVersionInfo() {
        TTPlayerConfiger.setValue(15, "098ee17fd 2021-11-19 02:41:40");
        TTPlayerConfiger.setValue(13, (int) BuildConfig.VERSION_CODE);
        TTPlayerConfiger.setValue(14, "2.10.56.60-lark");
    }
}
