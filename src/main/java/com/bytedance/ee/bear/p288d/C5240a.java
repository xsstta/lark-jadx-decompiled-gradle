package com.bytedance.ee.bear.p288d;

import android.content.Context;

/* renamed from: com.bytedance.ee.bear.d.a */
public class C5240a {

    /* renamed from: a */
    static volatile AbstractC5241a f14986a;

    /* renamed from: com.bytedance.ee.bear.d.a$a */
    public interface AbstractC5241a {
        Context injectBaseContext(Context context);
    }

    /* renamed from: a */
    public static AbstractC5241a m21422a() {
        return f14986a;
    }

    /* renamed from: a */
    public static void m21423a(AbstractC5241a aVar) {
        f14986a = aVar;
    }
}
