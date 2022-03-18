package com.huawei.hms.framework.network.grs.p1018d;

import android.os.SystemClock;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.huawei.hms.framework.network.grs.d.d */
public class C23585d {

    /* renamed from: a */
    private static Map<String, C23586a> f58158a = new ConcurrentHashMap(16);

    /* renamed from: com.huawei.hms.framework.network.grs.d.d$a */
    public static class C23586a {

        /* renamed from: a */
        private long f58159a;

        /* renamed from: b */
        private long f58160b;

        public C23586a(long j, long j2) {
            this.f58159a = j;
            this.f58160b = j2;
        }

        /* renamed from: a */
        public boolean mo82936a() {
            return SystemClock.elapsedRealtime() - this.f58160b <= this.f58159a;
        }
    }

    /* renamed from: a */
    public static C23586a m85563a(String str) {
        Logger.m85373v("RequestUtil", "map size of get is before:" + f58158a.size());
        C23586a aVar = f58158a.get(str);
        Logger.m85373v("RequestUtil", "map size of get is after:" + f58158a.size());
        return aVar;
    }

    /* renamed from: a */
    public static void m85564a(String str, C23586a aVar) {
        Logger.m85373v("RequestUtil", "map size of put is before:" + f58158a.size());
        f58158a.put(str, aVar);
        Logger.m85373v("RequestUtil", "map size of put is after:" + f58158a.size());
    }
}
