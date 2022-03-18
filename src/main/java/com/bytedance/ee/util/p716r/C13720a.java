package com.bytedance.ee.util.p716r;

import com.github.p964a.p965a.C21285b;

/* renamed from: com.bytedance.ee.util.r.a */
public class C13720a {
    /* renamed from: c */
    private static boolean m55636c(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: d */
    private static boolean m55637d(char c) {
        return c >= 'a' && c <= 'z';
    }

    /* renamed from: e */
    private static boolean m55638e(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: f */
    private static boolean m55639f(char c) {
        if ("[`~!@#$^&*()=|{}':;,[].<>/?！￥¥《》「」…（）—【】‘；：”“。，、？～]$".indexOf(c) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m55634a(char c) {
        if (m55637d(c) || m55636c(c)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m55635b(char c) {
        if (m55639f(c)) {
            return 1;
        }
        if (m55638e(c)) {
            return 2;
        }
        if (m55634a(c)) {
            return 3;
        }
        if (C21285b.m77125b(c)) {
            return 4;
        }
        return 5;
    }
}
