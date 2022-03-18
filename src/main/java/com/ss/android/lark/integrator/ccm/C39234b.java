package com.ss.android.lark.integrator.ccm;

import com.ss.android.lark.integrator.ccm.p2006c.C39239c;

/* renamed from: com.ss.android.lark.integrator.ccm.b */
public class C39234b {

    /* renamed from: a */
    private static volatile C39239c f100542a;

    /* renamed from: a */
    public static C39239c m154731a() {
        if (f100542a == null) {
            synchronized (C39234b.class) {
                if (f100542a == null) {
                    f100542a = new C39239c();
                }
            }
        }
        return f100542a;
    }
}
