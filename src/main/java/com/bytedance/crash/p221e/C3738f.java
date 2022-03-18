package com.bytedance.crash.p221e;

import com.bytedance.crash.C3774m;
import com.bytedance.crash.util.C3969y;

/* renamed from: com.bytedance.crash.e.f */
public class C3738f {
    /* renamed from: a */
    public static boolean m15396a(long j) {
        if (C3969y.m16550a(2)) {
            return true;
        }
        if (!C3969y.m16550a(1024) && j - C3774m.m15612m() <= C3774m.m15611l().getLaunchCrashInterval() && (!C3774m.m15615p() || C3774m.m15618s() != 0)) {
            return true;
        }
        return false;
    }
}
