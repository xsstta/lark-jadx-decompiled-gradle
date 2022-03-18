package com.huawei.updatesdk.p1029a.p1039b.p1040a;

import android.content.Context;

/* renamed from: com.huawei.updatesdk.a.b.a.a */
public class C23854a {

    /* renamed from: b */
    private static final Object f59076b = new Object();

    /* renamed from: c */
    private static C23854a f59077c;

    /* renamed from: a */
    private Context f59078a;

    public C23854a(Context context) {
        this.f59078a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static void m87209a(Context context) {
        synchronized (f59076b) {
            if (f59077c == null) {
                f59077c = new C23854a(context);
            }
        }
    }

    /* renamed from: c */
    public static C23854a m87210c() {
        C23854a aVar;
        synchronized (f59076b) {
            aVar = f59077c;
        }
        return aVar;
    }

    /* renamed from: a */
    public Context mo85582a() {
        return this.f59078a;
    }

    /* renamed from: b */
    public String mo85583b() {
        Context context = this.f59078a;
        return (context == null || context.getFilesDir() == null) ? "" : this.f59078a.getFilesDir().getAbsolutePath();
    }
}
