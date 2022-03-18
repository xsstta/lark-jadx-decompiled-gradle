package com.ss.android.lark.platform.p2498r;

import android.content.Context;
import com.ss.android.lark.resource.AbstractC53137a;
import com.ss.android.lark.resource.C53138b;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.platform.r.a */
public class C51947a {

    /* renamed from: a */
    private static volatile C53138b f128995a;

    /* renamed from: a */
    public static C53138b m201491a() {
        if (f128995a == null) {
            synchronized (C51947a.class) {
                if (f128995a == null) {
                    f128995a = new C53138b(m201490a(LarkContext.getApplication()));
                }
            }
        }
        return f128995a;
    }

    /* renamed from: a */
    private static AbstractC53137a m201490a(final Context context) {
        return new AbstractC53137a() {
            /* class com.ss.android.lark.platform.p2498r.C51947a.C519481 */
        };
    }
}
