package com.bytedance.ee.bear.lark;

import com.bytedance.ee.bear.list.p422a.C8143b;

/* renamed from: com.bytedance.ee.bear.lark.e */
public class C8032e {

    /* renamed from: a */
    private static volatile C8032e f21523a;

    /* renamed from: a */
    public void mo31046a(String str, String str2) {
    }

    /* renamed from: a */
    public static C8032e m32090a() {
        if (f21523a == null) {
            synchronized (C8032e.class) {
                if (f21523a == null) {
                    f21523a = new C8032e();
                }
            }
        }
        return f21523a;
    }

    /* renamed from: b */
    public void mo31047b(String str, String str2) {
        C8143b.m32605a().mo31467b();
        C8143b.m32605a().mo31466a("init", "key_open_finish_recent");
    }
}
