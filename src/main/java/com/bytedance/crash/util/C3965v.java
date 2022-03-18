package com.bytedance.crash.util;

import java.io.FileInputStream;
import java.util.Properties;

/* renamed from: com.bytedance.crash.util.v */
public class C3965v {
    /* renamed from: a */
    public static Properties m16524a(String str) {
        String str2 = str + "/map_size.txt";
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(str2));
            return properties;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
