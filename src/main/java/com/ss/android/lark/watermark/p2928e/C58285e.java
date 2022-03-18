package com.ss.android.lark.watermark.p2928e;

import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.watermark.C58275e;

/* renamed from: com.ss.android.lark.watermark.e.e */
public class C58285e implements AbstractC58279b {
    @Override // com.ss.android.lark.watermark.p2928e.AbstractC58279b
    /* renamed from: b */
    public int mo197379b() {
        return C57744a.m224104a().getInt("global_watermark", 0);
    }

    @Override // com.ss.android.lark.watermark.p2928e.AbstractC58279b
    /* renamed from: a */
    public int mo197378a() {
        int a = C58275e.m225982a().mo177765b().mo177770a();
        C57744a.m224104a().putInt("global_watermark", a);
        return a;
    }
}
