package com.lynx.tasm.p1216a;

import com.lynx.tasm.utils.DisplayMetricsHolder;

/* renamed from: com.lynx.tasm.a.h */
public class C26552h extends C26547c {
    public C26552h(int i, String str) {
        super(i, str);
    }

    /* renamed from: a */
    public static C26552h m96260a(int i, String str) {
        return new C26552h(i, str);
    }

    /* renamed from: a */
    public void mo94356a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (DisplayMetricsHolder.m97898a() != null) {
            mo94347a("scrollLeft", Float.valueOf(((float) i) / DisplayMetricsHolder.m97898a().density));
            mo94347a("scrollTop", Float.valueOf(((float) i2) / DisplayMetricsHolder.m97898a().density));
            mo94347a("scrollHeight", Float.valueOf(((float) i3) / DisplayMetricsHolder.m97898a().density));
            mo94347a("scrollWidth", Float.valueOf(((float) i4) / DisplayMetricsHolder.m97898a().density));
            mo94347a("deltaX", Float.valueOf(((float) i5) / DisplayMetricsHolder.m97898a().density));
            mo94347a("deltaY", Float.valueOf(((float) i6) / DisplayMetricsHolder.m97898a().density));
        }
    }
}
