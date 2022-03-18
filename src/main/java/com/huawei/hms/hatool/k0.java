package com.huawei.hms.hatool;

import android.content.Context;
import android.util.Pair;
import java.util.List;
import java.util.Map;

public class k0 implements m0 {

    /* renamed from: a */
    public Context f58258a = AbstractC23596b.m85619f();

    /* renamed from: b */
    public String f58259b;

    /* renamed from: c */
    public String f58260c;

    /* renamed from: d */
    public String f58261d;

    public k0(String str, String str2, String str3) {
        this.f58259b = str;
        this.f58260c = str2;
        this.f58261d = str3;
    }

    /* renamed from: a */
    public final void mo83075a(String str, List<C23615q> list) {
        Pair<String, String> a = s0.m85912a(str);
        new C23618t(list, (String) a.first, (String) a.second, this.f58261d).mo83156a();
    }

    public void run() {
        C23625y.m85977c("hmsSdk", "eventReportTask is running");
        boolean a = p0.m85877a(this.f58258a);
        if (a) {
            C23625y.m85977c("hmsSdk", "workKey is refresh,begin report all data");
            this.f58260c = "alltype";
        }
        try {
            Map<String, List<C23615q>> a2 = C23621w.m85939a(this.f58258a, this.f58259b, this.f58260c);
            if (a2.size() == 0) {
                C23625y.m85975b("hmsSdk", "no have events to report: tag:%s : type:%s", this.f58259b, this.f58260c);
                if ("alltype".equals(this.f58260c)) {
                    g0.m85721a(this.f58258a, "stat_v2_1", new String[0]);
                    g0.m85721a(this.f58258a, "cached_v2_1", new String[0]);
                    return;
                }
                String a3 = s0.m85914a(this.f58259b, this.f58260c);
                g0.m85721a(this.f58258a, "stat_v2_1", a3);
                g0.m85721a(this.f58258a, "cached_v2_1", a3);
                return;
            }
            for (Map.Entry<String, List<C23615q>> entry : a2.entrySet()) {
                mo83075a(entry.getKey(), entry.getValue());
            }
            if ("alltype".equals(this.f58260c)) {
                g0.m85721a(this.f58258a, "stat_v2_1", new String[0]);
                g0.m85721a(this.f58258a, "cached_v2_1", new String[0]);
            } else {
                String a4 = s0.m85914a(this.f58259b, this.f58260c);
                g0.m85721a(this.f58258a, "stat_v2_1", a4);
                g0.m85721a(this.f58258a, "cached_v2_1", a4);
            }
            if (a) {
                C23625y.m85977c("hmsSdk", "refresh local key");
                d0.m85666f().mo82984b();
            }
        } catch (IllegalArgumentException e) {
            C23625y.m85981e("hmsSdk", "readEventRecords handData IllegalArgumentException:" + e.getMessage());
            if ("alltype".equals(this.f58260c)) {
                g0.m85721a(this.f58258a, "stat_v2_1", new String[0]);
                g0.m85721a(this.f58258a, "cached_v2_1", new String[0]);
            } else {
                String a5 = s0.m85914a(this.f58259b, this.f58260c);
                g0.m85721a(this.f58258a, "stat_v2_1", a5);
                g0.m85721a(this.f58258a, "cached_v2_1", a5);
            }
        } catch (Exception e2) {
            C23625y.m85981e("hmsSdk", "readEventRecords handData Exception:" + e2.getMessage());
            if ("alltype".equals(this.f58260c)) {
                g0.m85721a(this.f58258a, "stat_v2_1", new String[0]);
                g0.m85721a(this.f58258a, "cached_v2_1", new String[0]);
            } else {
                String a6 = s0.m85914a(this.f58259b, this.f58260c);
                g0.m85721a(this.f58258a, "stat_v2_1", a6);
                g0.m85721a(this.f58258a, "cached_v2_1", a6);
            }
        } catch (Throwable th) {
            if ("alltype".equals(this.f58260c)) {
                g0.m85721a(this.f58258a, "stat_v2_1", new String[0]);
                g0.m85721a(this.f58258a, "cached_v2_1", new String[0]);
            } else {
                String a7 = s0.m85914a(this.f58259b, this.f58260c);
                g0.m85721a(this.f58258a, "stat_v2_1", a7);
                g0.m85721a(this.f58258a, "cached_v2_1", a7);
            }
            throw th;
        }
    }
}
