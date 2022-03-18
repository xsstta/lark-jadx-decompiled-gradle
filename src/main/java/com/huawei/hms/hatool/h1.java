package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import java.util.LinkedHashMap;

public class h1 {

    /* renamed from: a */
    public String f58212a;

    /* renamed from: b */
    public C23610m f58213b;

    public h1(String str) {
        this.f58212a = str;
        this.f58213b = new C23610m(str);
        C23606i.m85750c().mo83024a(this.f58212a, this.f58213b);
    }

    /* renamed from: a */
    public void mo83015a(int i) {
        C23625y.m85972a("hmsSdk", "HiAnalyticsInstance.onReport() is execute.TAG: %s,TYPE: %d", this.f58212a, Integer.valueOf(i));
        g1.m85726a().mo83006a(this.f58212a, i);
    }

    /* renamed from: a */
    public void mo83016a(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        C23625y.m85972a("hmsSdk", "HiAnalyticsInstance.onEvent(int type, String eventId, Map<String, String> mapValue) is execute.TAG: %s,TYPE: %d", this.f58212a, Integer.valueOf(i));
        if (q0.m85893a(str) || !mo83021c(i)) {
            C23625y.m85981e("hmsSdk", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f58212a + ", TYPE: " + i);
            return;
        }
        if (!q0.m85896a(linkedHashMap)) {
            C23625y.m85981e("hmsSdk", "onEvent() parameter mapValue will be cleared.TAG: " + this.f58212a + ", TYPE: " + i);
            linkedHashMap = null;
        }
        g1.m85726a().mo83007a(this.f58212a, i, str, linkedHashMap);
    }

    /* renamed from: a */
    public void mo83017a(Context context, String str, String str2) {
        C23625y.m85977c("hmsSdk", "HiAnalyticsInstance.onEvent(eventId, mapValue) is execute.TAG : " + this.f58212a);
        if (context == null) {
            C23625y.m85981e("hmsSdk", "context is null in onevent ");
        } else if (q0.m85893a(str) || !mo83021c(0)) {
            C23625y.m85981e("hmsSdk", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f58212a);
        } else {
            if (!q0.m85894a("value", str2, 65536)) {
                C23625y.m85981e("hmsSdk", "onEvent() parameter VALUE is overlong, content will be cleared.TAG: " + this.f58212a);
                str2 = "";
            }
            g1.m85726a().mo83008a(this.f58212a, context, str, str2);
        }
    }

    /* renamed from: a */
    public void mo83018a(C23608k kVar) {
        C23625y.m85977c("hmsSdk", "HiAnalyticsInstanceImpl.setMaintConf() is executed.TAG : " + this.f58212a);
        if (kVar == null) {
            C23625y.m85981e("hmsSdk", "HiAnalyticsInstanceImpl.setMaintConf(): config for maint is null!");
            this.f58213b.mo83116a((C23608k) null);
            return;
        }
        this.f58213b.mo83116a(kVar);
    }

    /* renamed from: b */
    public final C23608k mo83019b(int i) {
        if (i == 0) {
            return this.f58213b.mo83119c();
        }
        if (i == 1) {
            return this.f58213b.mo83117b();
        }
        if (i == 2) {
            return this.f58213b.mo83120d();
        }
        if (i != 3) {
            return null;
        }
        return this.f58213b.mo83114a();
    }

    /* renamed from: b */
    public void mo83020b(C23608k kVar) {
        C23625y.m85977c("hmsSdk", "HiAnalyticsInstanceImpl.setOperConf() is executed.TAG: " + this.f58212a);
        if (kVar == null) {
            this.f58213b.mo83118b(null);
            C23625y.m85981e("hmsSdk", "HiAnalyticsInstanceImpl.setOperConf(): config for oper is null!");
            return;
        }
        this.f58213b.mo83118b(kVar);
    }

    /* renamed from: c */
    public final boolean mo83021c(int i) {
        String str;
        if (i != 2) {
            C23608k b = mo83019b(i);
            if (b != null && !TextUtils.isEmpty(b.mo83065h())) {
                return true;
            }
            str = "verifyURL(): URL check failed. type: " + i;
        } else if ("_default_config_tag".equals(this.f58212a)) {
            return true;
        } else {
            str = "verifyURL(): type: preins. Only default config can report Pre-install data.";
        }
        C23625y.m85981e("hmsSdk", str);
        return false;
    }
}
