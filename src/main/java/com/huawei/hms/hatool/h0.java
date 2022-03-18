package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONObject;

public class h0 {

    /* renamed from: b */
    public static h0 f58210b;

    /* renamed from: a */
    public Context f58211a;

    static {
        new HashMap();
    }

    /* renamed from: a */
    public static h0 m85735a() {
        return m85736b();
    }

    /* renamed from: b */
    public static synchronized h0 m85736b() {
        h0 h0Var;
        synchronized (h0.class) {
            if (f58210b == null) {
                f58210b = new h0();
            }
            h0Var = f58210b;
        }
        return h0Var;
    }

    /* renamed from: a */
    public void mo83009a(Context context) {
        this.f58211a = context;
        mo83014b(context);
        C23606i.m85750c().mo83025b().mo83093e(AbstractC23601f.m85692a());
    }

    /* renamed from: a */
    public void mo83010a(String str, int i) {
        if (this.f58211a == null) {
            C23625y.m85981e("hmsSdk", "onReport() null context or SDK was not init.");
            return;
        }
        C23625y.m85977c("hmsSdk", "onReport: Before calling runtaskhandler()");
        mo83013a(str, s0.m85913a(i), AbstractC23596b.m85617d());
    }

    /* renamed from: a */
    public void mo83011a(String str, int i, String str2, JSONObject jSONObject) {
        long currentTimeMillis = System.currentTimeMillis();
        if (2 == i) {
            currentTimeMillis = s0.m85911a("yyyy-MM-dd", currentTimeMillis);
        }
        n0.m85861b().mo83125a(new j0(str2, jSONObject, str, s0.m85913a(i), currentTimeMillis));
    }

    /* renamed from: a */
    public void mo83012a(String str, String str2) {
        if (AbstractC23598c.m85631a(str, str2)) {
            long j = AbstractC23598c.m85640j(str, str2);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j > 30000) {
                C23625y.m85971a("hmsSdk", "begin to call onReport!");
                AbstractC23598c.m85630a(str, str2, currentTimeMillis);
                mo83013a(str, str2, AbstractC23596b.m85617d());
                return;
            }
            C23625y.m85982f("hmsSdk", "autoReport timeout. interval < 30s ");
            return;
        }
        C23625y.m85977c("hmsSdk", "auto report is closed tag:" + str);
    }

    /* renamed from: a */
    public void mo83013a(String str, String str2, String str3) {
        Context context = this.f58211a;
        if (context == null) {
            C23625y.m85981e("hmsSdk", "onReport() null context or SDK was not init.");
            return;
        }
        String a = C23605h.m85734a(context);
        if (AbstractC23598c.m85635e(str, str2) && !"WIFI".equals(a)) {
            C23625y.m85977c("hmsSdk", "strNetworkType is :" + a);
        } else if (TextUtils.isEmpty(a) || "2G".equals(a)) {
            C23625y.m85981e("hmsSdk", "The network is bad.");
        } else {
            n0.m85861b().mo83125a(new k0(str, str2, str3));
        }
    }

    /* renamed from: b */
    public final void mo83014b(Context context) {
        String str;
        String d = AbstractC23601f.m85699d(context);
        AbstractC23596b.m85612a(d);
        if (u0.m85929b().mo83164a()) {
            String a = g0.m85719a(context, "global_v2", "app_ver", "");
            g0.m85724b(context, "global_v2", "app_ver", d);
            AbstractC23596b.m85614b(a);
            if (TextUtils.isEmpty(a)) {
                str = "app ver is first save!";
            } else if (!a.equals(d)) {
                C23625y.m85977c("hmsSdk", "the appVers are different!");
                m85735a().mo83013a("", "alltype", a);
                return;
            } else {
                return;
            }
        } else {
            str = "userManager.isUserUnlocked() == false";
        }
        C23625y.m85977c("hmsSdk", str);
    }
}
