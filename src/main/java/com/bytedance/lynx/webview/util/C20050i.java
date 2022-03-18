package com.bytedance.lynx.webview.util;

import android.content.Context;
import com.bytedance.lynx.webview.internal.C20011y;
import com.bytedance.lynx.webview.sdkadapt.C20025a;

/* renamed from: com.bytedance.lynx.webview.util.i */
public class C20050i {
    /* renamed from: f */
    public static String m73185f() {
        return "libbytedanceweb.so";
    }

    /* renamed from: g */
    public static String m73187g() {
        return "ttwebview.json";
    }

    /* renamed from: a */
    public static String m73172a() {
        return C20011y.m72976a().mo67938u().getFilesDir().getAbsolutePath();
    }

    /* renamed from: b */
    public static String m73175b() {
        String a = m73172a();
        return a + "/webview_bytedance/";
    }

    /* renamed from: c */
    public static String m73178c() {
        return C20011y.m72976a().mo67938u().getDir("dex", 0).getAbsolutePath();
    }

    /* renamed from: d */
    public static String m73181d() {
        return m73175b() + "data/";
    }

    /* renamed from: e */
    public static String m73183e() {
        return m73175b() + "database/";
    }

    /* renamed from: h */
    public static String m73189h() {
        return m73175b() + "com.bytedance.webview.chromium.shm.lock.ensure";
    }

    /* renamed from: i */
    public static String m73191i() {
        return m73175b() + "com.bytedance.webview.chromium.shm.lock";
    }

    /* renamed from: j */
    public static String m73193j(String str) {
        return m73190h(str);
    }

    /* renamed from: f */
    public static String m73186f(String str) {
        return m73178c() + '/' + str + "_md5/";
    }

    /* renamed from: g */
    public static String m73188g(String str) {
        return m73186f(str) + "classes.dex";
    }

    /* renamed from: a */
    public static String m73173a(Context context) {
        return m73179c(context) + m73185f();
    }

    /* renamed from: b */
    public static String m73176b(Context context) {
        return m73179c(context) + m73187g();
    }

    /* renamed from: c */
    private static String m73179c(Context context) {
        return context.getExternalFilesDir("").getAbsolutePath() + "/.patches/";
    }

    /* renamed from: d */
    public static String m73182d(String str) {
        String d = C20025a.m73073d(str);
        return m73174a(str) + d;
    }

    /* renamed from: e */
    public static String m73184e(String str) {
        return m73174a(str) + "classes.dex";
    }

    /* renamed from: h */
    public static String m73190h(String str) {
        return m73174a(str) + "libbytedanceweb.apk";
    }

    /* renamed from: i */
    public static String m73192i(String str) {
        return m73174a(str) + "libwebview.so";
    }

    /* renamed from: a */
    public static String m73174a(String str) {
        return m73175b() + str + "_md5/";
    }

    /* renamed from: b */
    public static String m73177b(String str) {
        return m73174a(str) + str;
    }

    /* renamed from: c */
    public static String m73180c(String str) {
        return m73174a(str) + str + "_compiled";
    }
}
