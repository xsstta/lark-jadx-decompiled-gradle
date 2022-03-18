package com.ss.android.lark.platform.aa;

import android.content.Context;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.ttwebview.C57299a;
import com.ss.android.lark.ttwebview.p2847a.AbstractC57300a;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.platform.aa.a */
public class C51657a {

    /* renamed from: a */
    private static volatile C57299a f128535a;

    /* renamed from: b */
    public static AbstractC57300a m200382b() {
        return new AbstractC57300a() {
            /* class com.ss.android.lark.platform.aa.C51657a.C516581 */

            @Override // com.ss.android.lark.ttwebview.p2847a.AbstractC57300a
            /* renamed from: a */
            public Context mo177702a() {
                return LarkContext.getApplication();
            }

            @Override // com.ss.android.lark.ttwebview.p2847a.AbstractC57300a
            /* renamed from: b */
            public boolean mo177703b() {
                return C37239a.m146648b().mo136951a("lark.manis");
            }
        };
    }

    /* renamed from: a */
    public static C57299a m200381a() {
        if (f128535a == null) {
            synchronized (C51657a.class) {
                if (f128535a == null) {
                    f128535a = new C57299a(m200382b());
                }
            }
        }
        return f128535a;
    }
}
