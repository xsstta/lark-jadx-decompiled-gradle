package com.ss.android.lark.integrator.p1999b;

import android.content.Context;
import com.larksuite.framework.utils.C26254af;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.integrator.b.b */
public class C39125b {
    /* renamed from: a */
    public static void m154428a(Context context) {
        try {
            Object b = C26254af.m95008b(C26254af.m95008b(context, "mBase"), "mPackageInfo");
            C26254af.m95007a(C26254af.m95002a(b, "mClassLoader"), b, new C39113a((ClassLoader) C26254af.m95008b(b, "mClassLoader")));
        } catch (Exception e) {
            Log.m165386e("ModuleAutoInitProcessor", e);
        }
    }
}
