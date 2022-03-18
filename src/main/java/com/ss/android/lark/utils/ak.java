package com.ss.android.lark.utils;

import android.app.Application;
import android.ss.com.vboost.AbstractC0079a;
import android.ss.com.vboost.C0087c;
import android.ss.com.vboost.Status;

public class ak {

    /* renamed from: a */
    private static boolean f142314a;

    /* renamed from: a */
    public static void m224264a() {
        if (f142314a) {
            C0087c.m176a().mo142a(AbstractC0079a.f133b, Status.BEGIN);
        }
    }

    /* renamed from: b */
    public static void m224267b() {
        if (f142314a) {
            C0087c.m176a().mo142a(AbstractC0079a.f133b, Status.END);
        }
    }

    /* renamed from: c */
    public static void m224268c() {
        if (f142314a) {
            C0087c.m176a().mo142a(AbstractC0079a.f138g, Status.BEGIN);
        }
    }

    /* renamed from: d */
    public static void m224269d() {
        if (f142314a) {
            C0087c.m176a().mo142a(AbstractC0079a.f138g, Status.END);
        }
    }

    /* renamed from: a */
    public static void m224266a(boolean z) {
        f142314a = z;
    }

    /* renamed from: a */
    public static void m224265a(Application application) {
        if (f142314a) {
            C0087c.m176a().mo141a(application);
        }
    }
}
