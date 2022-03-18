package com.ss.android.lark.voip.service.impl.p2914b;

import android.content.Context;
import com.ss.android.lark.util.share_preference.C57744a;

/* renamed from: com.ss.android.lark.voip.service.impl.b.b */
public class C58142b {
    /* renamed from: a */
    public void mo197027a() {
        C57744a.m224104a().putBoolean("voip_crash_sp", true);
    }

    /* renamed from: b */
    public Boolean mo197028b() {
        return Boolean.valueOf(C57744a.m224104a().getBoolean("voip_crash_sp", false));
    }

    /* renamed from: c */
    public void mo197029c() {
        C57744a.m224104a().remove("voip_crash_sp");
    }

    public C58142b(Context context) {
    }
}
