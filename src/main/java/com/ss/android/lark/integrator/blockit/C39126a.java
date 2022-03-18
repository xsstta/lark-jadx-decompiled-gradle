package com.ss.android.lark.integrator.blockit;

import com.larksuite.component.blockit.C24062d;

/* renamed from: com.ss.android.lark.integrator.blockit.a */
public class C39126a {

    /* renamed from: a */
    private static C24062d f100423a;

    /* renamed from: a */
    public static C24062d m154429a() {
        if (f100423a == null) {
            synchronized (C39126a.class) {
                if (f100423a == null) {
                    C24062d a = C24062d.m87896a();
                    f100423a = a;
                    a.mo86323b();
                }
            }
        }
        return f100423a;
    }
}
