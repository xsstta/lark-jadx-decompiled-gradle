package com.ss.android.lark.platform.p2506v;

import android.content.Context;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.p2921w.C58201a;
import com.ss.android.lark.p2921w.p2922a.AbstractC58204a;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.platform.v.a */
public class C52014a {

    /* renamed from: a */
    private static volatile C58201a f129174a;

    /* renamed from: b */
    private static AbstractC58204a m201805b() {
        return new AbstractC58204a() {
            /* class com.ss.android.lark.platform.p2506v.C52014a.C520151 */

            @Override // com.ss.android.lark.p2921w.p2922a.AbstractC58204a
            /* renamed from: a */
            public AbstractC58204a.AbstractC58205a mo178259a() {
                return new AbstractC58204a.AbstractC58205a() {
                    /* class com.ss.android.lark.platform.p2506v.C52014a.C520151.C520161 */

                    @Override // com.ss.android.lark.p2921w.p2922a.AbstractC58204a.AbstractC58205a
                    /* renamed from: a */
                    public boolean mo178261a(String str) {
                        return C37239a.m146648b().mo136951a(str);
                    }
                };
            }

            @Override // com.ss.android.lark.p2921w.p2922a.AbstractC58204a
            /* renamed from: b */
            public Context mo178260b() {
                return LarkContext.getApplication().getApplicationContext();
            }
        };
    }

    /* renamed from: a */
    public static C58201a m201804a() {
        if (f129174a == null) {
            synchronized (C58201a.class) {
                if (f129174a == null) {
                    f129174a = new C58201a(m201805b());
                    f129174a.mo197213a();
                }
            }
        }
        return f129174a;
    }
}
