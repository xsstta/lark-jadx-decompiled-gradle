package com.tt.miniapp.util;

import java.util.Random;

/* renamed from: com.tt.miniapp.util.x */
public class C67067x {
    /* renamed from: a */
    public static String m261375a() {
        return m261376a(16);
    }

    /* renamed from: a */
    public static String m261376a(int i) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(random.nextInt(62)));
        }
        return stringBuffer.toString();
    }
}
