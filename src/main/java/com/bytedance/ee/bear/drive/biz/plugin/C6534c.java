package com.bytedance.ee.bear.drive.biz.plugin;

import com.bytedance.ee.bear.drive.biz.plugin.p330a.AbstractC6531b;
import com.bytedance.ee.bear.drive.biz.plugin.p330a.C6530a;
import com.bytedance.ee.bear.drive.biz.plugin.p330a.C6532c;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.utils.C57824f;

/* renamed from: com.bytedance.ee.bear.drive.biz.plugin.c */
public final class C6534c {

    /* renamed from: a */
    private static AbstractC6531b f17985a;

    /* renamed from: b */
    private static boolean f17986b;

    /* renamed from: c */
    private static boolean f17987c = C57824f.m224469c();

    /* renamed from: a */
    public static boolean m26231a() {
        return f17986b;
    }

    /* renamed from: b */
    public static boolean m26232b() {
        return f17987c;
    }

    static {
        boolean z;
        try {
            if (Class.forName("com.bytedance.mira.Mira") != null) {
                z = true;
            } else {
                z = false;
            }
            f17986b = z;
        } catch (Throwable th) {
            C13479a.m54758a("PluginUtils", "check plugin class not found! error=" + th);
        }
        if (f17987c) {
            f17985a = new C6530a();
        } else {
            f17985a = new C6532c();
        }
    }

    /* renamed from: a */
    public static Object m26230a(String str) {
        return f17985a.mo26090a(str);
    }

    /* renamed from: b */
    public static boolean m26233b(String str) {
        return f17985a.mo26091b(str);
    }

    /* renamed from: c */
    public static ClassLoader m26234c(String str) {
        return f17985a.mo26092c(str);
    }

    /* renamed from: d */
    public static boolean m26235d(String str) {
        return f17985a.mo26093d(str);
    }

    /* renamed from: e */
    public static boolean m26236e(String str) {
        return f17985a.mo26094e(str);
    }

    /* renamed from: f */
    public static boolean m26237f(String str) {
        return f17985a.mo26095f(str);
    }
}
