package com.ss.android.lark.integrator.im.p2033l.p2034a;

import android.content.Context;
import com.ss.android.lark.lkp.screenshot.C41542a;
import com.ss.android.lark.lkp.screenshot.p2142a.AbstractC41543a;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.integrator.im.l.a.a */
public class C39712a {

    /* renamed from: a */
    private static volatile C41542a f101257a;

    /* renamed from: a */
    public static C41542a m157640a() {
        if (f101257a == null) {
            synchronized (C41542a.class) {
                if (f101257a == null) {
                    f101257a = new C41542a(m157639a(LarkContext.getApplication()));
                }
            }
        }
        return f101257a;
    }

    /* renamed from: a */
    private static AbstractC41543a m157639a(final Context context) {
        return new AbstractC41543a() {
            /* class com.ss.android.lark.integrator.im.p2033l.p2034a.C39712a.C397131 */

            @Override // com.ss.android.lark.lkp.screenshot.p2142a.AbstractC41543a
            /* renamed from: a */
            public Context mo143886a() {
                return context;
            }
        };
    }
}
