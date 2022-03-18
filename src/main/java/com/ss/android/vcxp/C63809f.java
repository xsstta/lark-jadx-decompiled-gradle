package com.ss.android.vcxp;

import android.content.Context;
import android.os.Process;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vcxp.p3186c.C63803b;
import com.ss.android.vcxp.p3186c.C63806d;
import java.lang.ref.WeakReference;
import org.aspectj.lang.annotation.Aspect;

@Aspect
/* renamed from: com.ss.android.vcxp.f */
public class C63809f {

    /* renamed from: a */
    public static WeakReference<Context> f161023a = null;

    /* renamed from: b */
    public static int f161024b = 0;

    /* renamed from: c */
    public static String f161025c = "";

    /* renamed from: d */
    public static String f161026d = "";

    /* renamed from: e */
    public static String f161027e = "";

    static {
        try {
            f161023a = new WeakReference<>(C63791b.m250470d());
            f161024b = Process.myPid();
            f161025c = C63803b.m250505a(f161023a.get());
            f161027e = f161023a.get().getPackageName();
            f161026d = C63806d.m250512a(f161025c);
        } catch (Exception e) {
            C60700b.m235865g("XScheduler", "[init]", e.getMessage());
        }
    }
}
