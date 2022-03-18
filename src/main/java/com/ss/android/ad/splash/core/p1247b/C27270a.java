package com.ss.android.ad.splash.core.p1247b;

import android.content.Context;
import com.ss.android.ad.splash.core.p1247b.C27271b;

/* renamed from: com.ss.android.ad.splash.core.b.a */
public class C27270a extends C27271b {

    /* renamed from: c */
    private static volatile C27270a f67948c;

    @Override // com.ss.android.ad.splash.core.p1247b.C27271b
    /* renamed from: a */
    public /* bridge */ /* synthetic */ C27271b.C27274c mo97256a() {
        return super.mo97256a();
    }

    private C27270a(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static C27270a m99131a(Context context) {
        if (f67948c == null) {
            synchronized (C27270a.class) {
                if (f67948c == null) {
                    f67948c = new C27270a(context);
                }
            }
        }
        return f67948c;
    }
}
