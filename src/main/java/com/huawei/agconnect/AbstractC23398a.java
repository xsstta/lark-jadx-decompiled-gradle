package com.huawei.agconnect;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.core.p1011a.C23411a;

/* renamed from: com.huawei.agconnect.a */
public abstract class AbstractC23398a {

    /* renamed from: a */
    private static AbstractC23398a f57710a;

    /* renamed from: a */
    public static synchronized void m84920a(Context context) {
        synchronized (AbstractC23398a.class) {
            Log.i("AGConnectInstance", "AGConnectInstance#initialize");
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (f57710a == null) {
                f57710a = new C23411a(context);
            }
        }
    }
}
