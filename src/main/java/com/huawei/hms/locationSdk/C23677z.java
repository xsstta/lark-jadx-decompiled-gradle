package com.huawei.hms.locationSdk;

import com.huawei.hms.support.log.HMSLog;

/* renamed from: com.huawei.hms.locationSdk.z */
public class C23677z extends C23676y {

    /* renamed from: b */
    private static volatile C23677z f58443b;

    /* renamed from: c */
    private static final byte[] f58444c = new byte[0];

    /* renamed from: b */
    public static C23677z m86138b() {
        if (f58443b == null) {
            synchronized (f58444c) {
                if (f58443b == null) {
                    f58443b = new C23677z();
                }
            }
        }
        return f58443b;
    }

    /* renamed from: a */
    public void mo83548a(a0 a0Var, int i) {
        if (a0Var == null || t0.m86101a(mo83543a())) {
            HMSLog.m86966i("LocationRequestCacheManager", "updateCacheNumUpdates fail, cache or numUpdates is null");
            return;
        }
        for (int i2 = 0; i2 < mo83543a().size(); i2++) {
            a0 a0Var2 = null;
            if (mo83543a().get(i2) instanceof a0) {
                a0Var2 = (a0) mo83543a().get(i2);
            }
            if (a0Var2 != null && a0Var2.equals(a0Var)) {
                if (i > 0) {
                    a0Var2.mo83483d().setNumUpdates(i);
                }
                a0Var2.mo83477a(i);
            }
        }
    }
}
