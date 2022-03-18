package com.ss.android.lark.browser.biz.messenger.jsapi.p1419a;

import java.util.Random;

/* renamed from: com.ss.android.lark.browser.biz.messenger.jsapi.a.c */
public class C29839c {

    /* renamed from: a */
    static Random f74568a = new Random(System.currentTimeMillis());

    /* renamed from: a */
    public static String m110321a() {
        return m110322a(16);
    }

    /* renamed from: a */
    public static String m110322a(int i) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(random.nextInt(62)));
        }
        return stringBuffer.toString();
    }
}
