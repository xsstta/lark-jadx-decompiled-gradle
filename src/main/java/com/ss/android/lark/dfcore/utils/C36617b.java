package com.ss.android.lark.dfcore.utils;

import android.app.Application;
import com.bytedance.morpheus.AbstractC20194a;
import com.bytedance.morpheus.C20207c;
import com.larksuite.framework.utils.C26246a;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.dfcore.utils.b */
public class C36617b implements AbstractC20194a {

    /* renamed from: a */
    private static volatile boolean f94233a;

    private C36617b() {
        C20207c.m73746a(this);
    }

    @Override // com.bytedance.morpheus.AbstractC20194a
    /* renamed from: a */
    public Application mo68355a() {
        return LarkContext.getApplication();
    }

    @Override // com.bytedance.morpheus.AbstractC20194a
    /* renamed from: b */
    public int mo68356b() {
        return C26246a.m94978b(LarkContext.getApplication());
    }

    /* renamed from: c */
    public static void m144489c() {
        if (!f94233a) {
            synchronized (C36617b.class) {
                if (!f94233a) {
                    new C36617b();
                    f94233a = true;
                }
            }
        }
    }
}
