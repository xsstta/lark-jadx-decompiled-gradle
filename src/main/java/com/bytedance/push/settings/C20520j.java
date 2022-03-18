package com.bytedance.push.settings;

import android.content.Context;
import com.bytedance.push.settings.storage.C20536h;

/* renamed from: com.bytedance.push.settings.j */
public class C20520j {

    /* renamed from: a */
    private static final C20536h f50064a;

    /* renamed from: b */
    private static final C20517g f50065b;

    /* renamed from: c */
    private static final C20518h f50066c = new C20518h();

    /* renamed from: a */
    public static AbstractC20521k m74723a() {
        return f50064a;
    }

    static {
        C20536h hVar = new C20536h();
        f50064a = hVar;
        f50065b = new C20517g(hVar);
    }

    /* renamed from: a */
    public static <T> T m74724a(Context context, Class<T> cls) {
        if (ISettings.class.isAssignableFrom(cls)) {
            return (T) f50066c.mo69091a(context, cls);
        }
        if (ILocalSettings.class.isAssignableFrom(cls)) {
            return (T) f50065b.mo69090a(context, cls);
        }
        throw new IllegalArgumentException("tClass必须是ISettings或ILocalSettings的子类");
    }
}
