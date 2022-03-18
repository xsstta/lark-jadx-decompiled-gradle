package com.larksuite.framework.http.p1187b;

import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.ss.android.lark.log.Log;

/* renamed from: com.larksuite.framework.http.b.a */
public class C25989a {

    /* renamed from: a */
    private static volatile AbstractC25990b f64343a;

    /* renamed from: a */
    public static AbstractC25990b m94082a() {
        return f64343a;
    }

    /* renamed from: a */
    public static void m94083a(AbstractC25990b.C25991a aVar) {
        if (f64343a == null) {
            synchronized (C25989a.class) {
                if (f64343a == null) {
                    f64343a = aVar.mo92421a();
                    Log.m165389i("DefaultClientContainer", "lark DefaultClientContainer do init!");
                }
            }
        }
    }
}
