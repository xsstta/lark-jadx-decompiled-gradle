package com.huawei.hms.framework.network.grs.p1013a;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.C23545a;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.p1015c.C23568e;
import com.huawei.hms.framework.network.grs.p1015c.C23575l;
import com.huawei.hms.framework.network.grs.p1018d.C23587e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.huawei.hms.framework.network.grs.a.a */
public class C23548a {

    /* renamed from: a */
    private static final String f58043a = "a";

    /* renamed from: b */
    private Map<String, Map<String, Map<String, String>>> f58044b = new ConcurrentHashMap(16);

    /* renamed from: c */
    private Map<String, Long> f58045c = new ConcurrentHashMap(16);

    /* renamed from: d */
    private C23550c f58046d;

    /* renamed from: e */
    private C23575l f58047e;

    public C23548a(C23550c cVar, C23575l lVar) {
        this.f58046d = cVar;
        this.f58047e = lVar;
        lVar.mo82917a(this);
    }

    /* renamed from: a */
    private void m85395a(GrsBaseInfo grsBaseInfo, C23549b bVar, Context context, String str) {
        Long l = this.f58045c.get(grsBaseInfo.getGrsParasKey(false, true, context));
        if (C23587e.m85566a(l)) {
            bVar.mo82845a(2);
            return;
        }
        if (C23587e.m85567a(l, 300000)) {
            this.f58047e.mo82916a(grsBaseInfo, context, null, str);
        }
        bVar.mo82845a(1);
    }

    /* renamed from: a */
    private void m85396a(GrsBaseInfo grsBaseInfo, String str, Context context) {
        if (C23587e.m85567a(this.f58045c.get(str), 300000)) {
            this.f58047e.mo82916a(grsBaseInfo, context, null, null);
        }
    }

    /* renamed from: a */
    public String mo82840a(GrsBaseInfo grsBaseInfo, String str, String str2, C23549b bVar, Context context) {
        Map<String, String> a = mo82841a(grsBaseInfo, str, bVar, context);
        if (a == null) {
            return null;
        }
        return a.get(str2);
    }

    /* renamed from: a */
    public Map<String, String> mo82841a(GrsBaseInfo grsBaseInfo, String str, C23549b bVar, Context context) {
        Map<String, Map<String, String>> map = this.f58044b.get(grsBaseInfo.getGrsParasKey(false, true, context));
        if (map == null || map.isEmpty()) {
            return new HashMap();
        }
        m85395a(grsBaseInfo, bVar, context, str);
        return map.get(str);
    }

    /* renamed from: a */
    public void mo82842a(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(false, true, context);
        C23550c cVar = this.f58046d;
        cVar.mo82851b(grsParasKey + "time", "0");
        Map<String, Long> map = this.f58045c;
        map.remove(grsParasKey + "time");
        this.f58044b.remove(grsParasKey);
        this.f58047e.mo82918a(grsParasKey);
    }

    /* renamed from: a */
    public void mo82843a(GrsBaseInfo grsBaseInfo, C23568e eVar, Context context) {
        if (eVar.mo82901e() == 2) {
            Logger.m85375w(f58043a, "update cache from server failed");
            return;
        }
        String grsParasKey = grsBaseInfo.getGrsParasKey(false, true, context);
        this.f58046d.mo82851b(grsParasKey, eVar.mo82905i());
        C23550c cVar = this.f58046d;
        cVar.mo82851b(grsParasKey + "time", eVar.mo82893a());
        this.f58044b.put(grsParasKey, C23545a.m85381a(eVar.mo82905i()));
        this.f58045c.put(grsParasKey, Long.valueOf(Long.parseLong(eVar.mo82893a())));
    }

    /* renamed from: b */
    public void mo82844b(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(false, true, context);
        String a = this.f58046d.mo82847a(grsParasKey, "");
        C23550c cVar = this.f58046d;
        String a2 = cVar.mo82847a(grsParasKey + "time", "0");
        long j = 0;
        if (!TextUtils.isEmpty(a2) && a2.matches("\\d+")) {
            try {
                j = Long.parseLong(a2);
            } catch (NumberFormatException e) {
                Logger.m85376w(f58043a, "convert urlParamKey from String to Long catch NumberFormatException.", e);
            }
        }
        this.f58044b.put(grsParasKey, C23545a.m85381a(a));
        this.f58045c.put(grsParasKey, Long.valueOf(j));
        m85396a(grsBaseInfo, grsParasKey, context);
    }
}
