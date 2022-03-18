package com.huawei.hms.hatool;

import android.content.Context;

public final class f1 {

    /* renamed from: b */
    public static f1 f58204b;

    /* renamed from: c */
    public static final Object f58205c = new Object();

    /* renamed from: a */
    public Context f58206a;

    static {
        new String[]{"ABTesting", "_default_config_tag", "_openness_config_tag", "_hms_config_tag"};
    }

    /* renamed from: a */
    public static f1 m85710a() {
        if (f58204b == null) {
            m85711b();
        }
        return f58204b;
    }

    /* renamed from: b */
    public static synchronized void m85711b() {
        synchronized (f1.class) {
            if (f58204b == null) {
                f58204b = new f1();
            }
        }
    }

    /* renamed from: a */
    public void mo83002a(Context context) {
        synchronized (f58205c) {
            if (this.f58206a != null) {
                C23625y.m85982f("hmsSdk", "DataManager already initialized.");
                return;
            }
            this.f58206a = context;
            C23606i.m85750c().mo83025b().mo83084a(this.f58206a);
            C23606i.m85750c().mo83025b().mo83097g(context.getPackageName());
            x0.m85956a().mo83178a(context);
        }
    }

    /* renamed from: a */
    public void mo83003a(String str) {
        C23625y.m85977c("hmsSdk", "HiAnalyticsDataManager.setAppid(String appid) is execute.");
        Context context = this.f58206a;
        if (context == null) {
            C23625y.m85981e("hmsSdk", "sdk is not init");
            return;
        }
        C23606i.m85750c().mo83025b().mo83095f(q0.m85892a("appID", str, "[a-zA-Z0-9_][a-zA-Z0-9. _-]{0,255}", context.getPackageName()));
    }
}
