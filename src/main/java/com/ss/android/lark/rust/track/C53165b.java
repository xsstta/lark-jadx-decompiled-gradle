package com.ss.android.lark.rust.track;

import com.ss.android.lark.rust.track.impl.C53180f;
import com.ss.android.lark.rust.track.impl.PushMonitor;
import com.ss.android.lark.rust.track.impl.PushMonitorService;
import com.ss.android.lark.rust.track.service.AbstractC53194b;
import com.ss.android.lark.rust.track.service.IPushMonitorService;

/* renamed from: com.ss.android.lark.rust.track.b */
public class C53165b {

    /* renamed from: a */
    private static IRustTrackModuleDependency f131461a;

    /* renamed from: a */
    public static IRustTrackModuleDependency m205769a() {
        return f131461a;
    }

    /* renamed from: b */
    public AbstractC53194b mo181563b() {
        return C53180f.m205805a();
    }

    /* renamed from: c */
    public IPushMonitorService mo181564c() {
        return PushMonitorService.f131480b.mo181597a();
    }

    /* renamed from: e */
    public void mo181566e() {
        PushMonitor.f131464h.mo181589a().mo181585c();
    }

    /* renamed from: d */
    public void mo181565d() {
        PushMonitor.f131464h.mo181589a().mo181583b();
        PushMonitor.f131464h.mo181589a().mo181587d();
    }

    public C53165b(IRustTrackModuleDependency aVar) {
        f131461a = aVar;
    }

    /* renamed from: a */
    public void mo181562a(boolean z) {
        PushMonitor.f131464h.mo181589a().mo181586c(z);
    }
}
