package com.bumptech.glide.request;

import android.graphics.Bitmap;
import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.load.AbstractC2393i;
import com.bumptech.glide.load.engine.AbstractC2354j;

/* renamed from: com.bumptech.glide.request.g */
public class C2537g extends AbstractC2510a<C2537g> {

    /* renamed from: a */
    private static C2537g f8219a;

    /* renamed from: b */
    private static C2537g f8220b;

    /* renamed from: b */
    public static C2537g m10787b(AbstractC2265c cVar) {
        return (C2537g) new C2537g().mo11127a(cVar);
    }

    /* renamed from: b */
    public static C2537g m10788b(AbstractC2354j jVar) {
        return (C2537g) new C2537g().mo11129a(jVar);
    }

    /* renamed from: b */
    public static C2537g m10789b(AbstractC2393i<Bitmap> iVar) {
        return (C2537g) new C2537g().mo11130a(iVar);
    }

    /* renamed from: d */
    public static C2537g m10791d(boolean z) {
        if (z) {
            if (f8219a == null) {
                f8219a = (C2537g) ((C2537g) new C2537g().mo11145c(true)).mo11159p();
            }
            return f8219a;
        }
        if (f8220b == null) {
            f8220b = (C2537g) ((C2537g) new C2537g().mo11145c(false)).mo11159p();
        }
        return f8220b;
    }

    /* renamed from: b */
    public static C2537g m10790b(Class<?> cls) {
        return (C2537g) new C2537g().mo11134a(cls);
    }
}
