package com.ss.android.lark.http.p1953b;

import java.util.Random;

/* renamed from: com.ss.android.lark.http.b.c */
public class C38762c {
    /* renamed from: a */
    public static String m153059a() {
        long currentTimeMillis = System.currentTimeMillis();
        int nextInt = new Random(currentTimeMillis).nextInt();
        return String.valueOf(currentTimeMillis) + Math.abs(nextInt);
    }
}
