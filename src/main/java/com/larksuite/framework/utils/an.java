package com.larksuite.framework.utils;

import java.util.Random;

public class an {

    /* renamed from: a */
    static String[] f64854a;

    /* renamed from: b */
    static short f64855b;

    static {
        String[] split = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".split("");
        f64854a = split;
        f64855b = (short) split.length;
    }

    /* renamed from: a */
    public static String m95036a(short s) {
        return m95037a(s, f64855b);
    }

    /* renamed from: a */
    public static String m95037a(short s, short s2) {
        short s3 = f64855b;
        if (s2 > s3) {
            s2 = s3;
        }
        if (s2 >= 0) {
            s3 = s2;
        }
        Random random = new Random();
        if (s <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (short s4 = 0; s4 < s; s4 = (short) (s4 + 1)) {
            sb.append(f64854a[(short) random.nextInt(s3)]);
        }
        return sb.toString();
    }
}
