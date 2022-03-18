package com.bytedance.crash.runtime.p229c;

import android.content.Context;
import android.os.Handler;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.entity.C3743c;
import com.bytedance.crash.runtime.C3850d;
import com.bytedance.crash.runtime.C3866n;
import com.bytedance.crash.runtime.C3873q;
import java.util.Map;

/* renamed from: com.bytedance.crash.runtime.c.b */
public class C3848b extends AbstractRunnableC3847a {

    /* renamed from: a */
    private static C3848b f11820a;

    /* renamed from: c */
    public static void m15952c() {
        C3866n.m16016b().mo15509a(m15951b(), 1000);
    }

    /* renamed from: b */
    public static C3848b m15951b() {
        if (f11820a == null) {
            f11820a = new C3848b(C3866n.m16016b().mo15507a(), 0, 30000, C3774m.m15609j());
        }
        return f11820a;
    }

    public void run() {
        Map<String, Object> map;
        C3866n.m16016b().mo15507a().removeCallbacks(this);
        try {
            map = C3774m.m15591a().mo15457b();
        } catch (Throwable unused) {
            map = null;
        }
        if (map != null) {
            try {
                if (C3850d.m15956a(map)) {
                    mo15453a(mo15452a());
                    return;
                }
            } catch (Throwable unused2) {
                return;
            }
        }
        C3873q.m16033a().mo15490a(map, C3743c.m15469a());
    }

    private C3848b(Handler handler, long j, long j2, Context context) {
        super(handler, j, j2);
    }
}
