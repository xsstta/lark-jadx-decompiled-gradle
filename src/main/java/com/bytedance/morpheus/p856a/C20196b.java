package com.bytedance.morpheus.p856a;

import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.morpheus.a.b */
public class C20196b {

    /* renamed from: a */
    private static volatile C20196b f49329a;

    /* renamed from: b */
    private Map<String, SplitInstallSessionState> f49330b = new HashMap();

    private C20196b() {
    }

    /* renamed from: a */
    public static C20196b m73717a() {
        if (f49329a == null) {
            synchronized (C20196b.class) {
                if (f49329a == null) {
                    f49329a = new C20196b();
                }
            }
        }
        return f49329a;
    }

    /* renamed from: a */
    public SplitInstallSessionState mo68357a(String str) {
        return this.f49330b.get(str);
    }

    /* renamed from: a */
    public void mo68358a(String str, SplitInstallSessionState splitInstallSessionState) {
        this.f49330b.put(str, splitInstallSessionState);
    }
}
