package com.bytedance.apm.block;

import com.bytedance.apm.p141g.C2937a;
import com.bytedance.apm.util.C3121h;
import com.bytedance.monitor.collector.C20152k;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.block.f */
public class C2867f {

    /* renamed from: a */
    private static volatile C2867f f9167a;

    /* renamed from: b */
    private int f9168b;

    /* renamed from: a */
    public static int m12069a(int i) {
        if (i == 11) {
            return 2;
        }
        if (i != 101) {
            return i != 1001 ? 1 : 0;
        }
        return 3;
    }

    private C2867f() {
    }

    /* renamed from: c */
    public void mo12314c() {
        C20152k.m73538a().mo68293b();
    }

    /* renamed from: b */
    public void mo12313b() {
        C2937a.m12396a(new C2937a.AbstractC2938a() {
            /* class com.bytedance.apm.block.C2867f.C28681 */
        });
    }

    /* renamed from: a */
    public static C2867f m12071a() {
        if (f9167a == null) {
            synchronized (C2867f.class) {
                if (f9167a == null) {
                    f9167a = new C2867f();
                }
            }
        }
        return f9167a;
    }

    /* renamed from: a */
    public static int m12070a(JSONObject jSONObject) {
        int a = C3121h.m12996a(jSONObject, "performance_modules", "smooth", "block_monitor_mode");
        if (a == 11) {
            return 2;
        }
        if (a == 101) {
            return 3;
        }
        if (a != 1001) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public void mo12312a(int i, boolean z) {
        this.f9168b = m12069a(i);
        C20152k.m73538a().mo68287a(this.f9168b);
    }
}
