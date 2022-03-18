package com.ss.android.lark.platform.p2473a;

import android.content.Context;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.p1322a.C28476b;
import com.ss.android.lark.p1322a.p1323a.AbstractC28475a;
import com.ss.android.lark.platform.abtest.C51660a;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.platform.a.a */
public class C51654a {

    /* renamed from: a */
    private static volatile C28476b f128533a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.a.a$a */
    public static class C51656a {

        /* renamed from: a */
        public static final AbstractC28475a f128534a = C51654a.m200377a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static C28476b m200378a() {
        if (f128533a == null) {
            synchronized (C51654a.class) {
                if (f128533a == null) {
                    f128533a = new C28476b(C51656a.f128534a);
                }
            }
        }
        return f128533a;
    }

    /* renamed from: a */
    public static AbstractC28475a m200377a(Context context) {
        return new AbstractC28475a() {
            /* class com.ss.android.lark.platform.p2473a.C51654a.C516551 */

            @Override // com.ss.android.lark.p1322a.p1323a.AbstractC28475a
            /* renamed from: a */
            public boolean mo101336a() {
                return C37239a.m146648b().mo136951a("lark.startup.aot");
            }

            @Override // com.ss.android.lark.p1322a.p1323a.AbstractC28475a
            /* renamed from: a */
            public <T> T mo101335a(Class<? extends AbstractC28490a> cls, boolean z) {
                return (T) C51660a.m200386a().getAbTestValue(cls, z);
            }
        };
    }
}
