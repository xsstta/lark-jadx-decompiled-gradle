package com.ss.android.lark.p1382b.p1383a;

import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.b.a.a */
public class C29411a {

    /* renamed from: a */
    private static volatile AbstractC29413b f73526a;

    /* renamed from: a */
    public static AbstractC29413b m108291a() {
        m108292b();
        return f73526a;
    }

    /* renamed from: com.ss.android.lark.b.a.a$a */
    public static class C29412a implements AbstractC29413b {

        /* renamed from: a */
        public static final Integer f73527a = 2600;

        /* renamed from: b */
        private static final Integer f73528b = 1161;

        /* renamed from: c */
        private static final Integer f73529c = 1664;

        @Override // com.ss.android.lark.p1382b.p1383a.AbstractC29413b
        /* renamed from: c */
        public int mo104279c() {
            return C29410a.m108290d().getAppIdByPackage();
        }

        @Override // com.ss.android.lark.p1382b.p1383a.AbstractC29413b
        /* renamed from: b */
        public int mo104278b() {
            Integer num;
            if (C29410a.m108290d().isUsPackage()) {
                num = f73529c;
            } else {
                num = f73528b;
            }
            return num.intValue();
        }

        @Override // com.ss.android.lark.p1382b.p1383a.AbstractC29413b
        /* renamed from: a */
        public int mo104277a() {
            Integer num;
            if (C26284k.m95185a(LarkContext.getApplication()) || C26284k.m95186b(LarkContext.getApplication())) {
                return f73527a.intValue();
            }
            if (C29410a.m108290d().isUsPackage()) {
                num = f73529c;
            } else {
                num = f73528b;
            }
            return num.intValue();
        }
    }

    /* renamed from: b */
    private static void m108292b() {
        if (f73526a == null) {
            boolean z = false;
            synchronized (C29411a.class) {
                if (f73526a == null) {
                    f73526a = new C29412a();
                    z = true;
                }
            }
            if (z) {
                Log.m165389i("AppIdProvider", "AppIdProvider init finished");
            }
        }
    }
}
