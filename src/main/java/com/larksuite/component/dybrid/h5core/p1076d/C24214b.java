package com.larksuite.component.dybrid.h5core.p1076d;

import android.content.Context;

/* renamed from: com.larksuite.component.dybrid.h5core.d.b */
public class C24214b {

    /* renamed from: a */
    private static Context f59852a;

    /* renamed from: a */
    public static Context m88460a() {
        return f59852a;
    }

    /* renamed from: a */
    public static void m88461a(Context context) {
        if (f59852a == null && context != null) {
            f59852a = context.getApplicationContext();
        }
    }
}
