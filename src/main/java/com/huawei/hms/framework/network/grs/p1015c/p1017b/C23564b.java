package com.huawei.hms.framework.network.grs.p1015c.p1017b;

import android.os.SystemClock;
import com.huawei.hms.framework.network.grs.p1015c.C23568e;
import java.util.concurrent.Future;

/* renamed from: com.huawei.hms.framework.network.grs.c.b.b */
public class C23564b {

    /* renamed from: a */
    private Future<C23568e> f58076a;

    /* renamed from: b */
    private long f58077b = SystemClock.elapsedRealtime();

    public C23564b(Future<C23568e> future) {
        this.f58076a = future;
    }

    /* renamed from: a */
    public Future<C23568e> mo82879a() {
        return this.f58076a;
    }

    /* renamed from: b */
    public boolean mo82880b() {
        return SystemClock.elapsedRealtime() - this.f58077b <= 300000;
    }
}
