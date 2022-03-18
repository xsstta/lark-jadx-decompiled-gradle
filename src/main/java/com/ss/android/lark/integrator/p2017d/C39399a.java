package com.ss.android.lark.integrator.p2017d;

import com.ss.android.lark.live.C41487a;
import com.ss.android.lark.live.model.AbstractC41519a;

/* renamed from: com.ss.android.lark.integrator.d.a */
public class C39399a {

    /* renamed from: a */
    private static AbstractC41519a f100731a;

    private C39399a() {
    }

    /* renamed from: a */
    public static AbstractC41519a m155624a() {
        if (f100731a == null) {
            synchronized (C39399a.class) {
                if (f100731a == null) {
                    f100731a = new C41487a();
                }
            }
        }
        return f100731a;
    }
}
