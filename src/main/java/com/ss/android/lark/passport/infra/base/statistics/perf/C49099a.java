package com.ss.android.lark.passport.infra.base.statistics.perf;

import android.os.SystemClock;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.passport.infra.base.statistics.perf.a */
public class C49099a {

    /* renamed from: a */
    public static String f123309a = "";

    /* renamed from: b */
    private final String f123310b;

    /* renamed from: c */
    private final Map<String, String> f123311c = new HashMap();

    /* renamed from: d */
    private final Map<String, Object> f123312d = new HashMap();

    /* renamed from: e */
    private final Map<String, String> f123313e = new HashMap();

    /* renamed from: f */
    private long f123314f;

    /* renamed from: d */
    protected static long m193617d() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: b */
    public C49099a mo171421b() {
        mo171418a("timespend");
        return this;
    }

    /* renamed from: a */
    public C49099a mo171417a() {
        this.f123312d.clear();
        this.f123314f = m193617d();
        return this;
    }

    /* renamed from: c */
    public void mo171422c() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("SigninPerf data: -> ");
        sb.append("Event:");
        sb.append("passport_business_overall");
        sb.append("Sence:");
        sb.append(this.f123310b);
        sb.append("Metric:");
        Map<String, Object> map = this.f123312d;
        String str3 = "";
        if (map == null) {
            str = str3;
        } else {
            str = map.toString();
        }
        sb.append(str);
        sb.append("Category:");
        Map<String, String> map2 = this.f123311c;
        if (map2 == null) {
            str2 = str3;
        } else {
            str2 = map2.toString();
        }
        sb.append(str2);
        sb.append("Extra:");
        Map<String, String> map3 = this.f123313e;
        if (map3 != null) {
            str3 = map3.toString();
        }
        sb.append(str3);
        PassportLog.f123351c.mo171474a().mo171465b("SigninPerf", sb.toString());
        mo171420a("scene", this.f123310b);
        if (ServiceFinder.m193748c() != null) {
            ServiceFinder.m193748c().startPerfMonitor("passport_business_overall", this.f123311c, this.f123312d, this.f123313e);
        }
    }

    public C49099a(String str) {
        this.f123310b = str;
    }

    /* renamed from: a */
    public C49099a mo171418a(String str) {
        if (this.f123314f <= 0) {
            return this;
        }
        long d = m193617d() - this.f123314f;
        mo171419a(this.f123310b, Long.valueOf(d));
        return mo171419a(str, Long.valueOf(d));
    }

    /* renamed from: a */
    public C49099a mo171419a(String str, Object obj) {
        this.f123312d.put(str, obj);
        return this;
    }

    /* renamed from: a */
    public C49099a mo171420a(String str, String str2) {
        this.f123311c.put(str, str2);
        return this;
    }
}
