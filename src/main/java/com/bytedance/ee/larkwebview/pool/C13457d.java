package com.bytedance.ee.larkwebview.pool;

import android.content.Context;
import com.bytedance.ee.larkwebview.pool.p680a.C13450c;

/* renamed from: com.bytedance.ee.larkwebview.pool.d */
public class C13457d {

    /* renamed from: a */
    private static volatile AbstractC13454b f35495a;

    /* renamed from: a */
    public static synchronized AbstractC13454b m54696a(Context context) {
        AbstractC13454b bVar;
        synchronized (C13457d.class) {
            if (f35495a == null) {
                f35495a = new C13450c(context);
            }
            bVar = f35495a;
        }
        return bVar;
    }
}
