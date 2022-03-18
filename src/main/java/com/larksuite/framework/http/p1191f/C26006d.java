package com.larksuite.framework.http.p1191f;

import java.util.Random;

/* renamed from: com.larksuite.framework.http.f.d */
public class C26006d {
    /* renamed from: a */
    public static String m94128a() {
        long currentTimeMillis = System.currentTimeMillis();
        int nextInt = new Random(currentTimeMillis).nextInt();
        return String.valueOf(currentTimeMillis) + Math.abs(nextInt);
    }
}
