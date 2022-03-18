package com.ss.android.ad.splash.core;

import com.ss.android.ad.splash.core.model.C27331b;
import com.ss.android.ad.splash.utils.C27476f;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ad.splash.core.j */
public final class C27325j {

    /* renamed from: a */
    private static volatile C27325j f68121a;

    private C27325j() {
    }

    /* renamed from: a */
    public static C27325j m99410a() {
        if (f68121a == null) {
            synchronized (C27325j.class) {
                if (f68121a == null) {
                    f68121a = new C27325j();
                }
            }
        }
        return f68121a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo97413a(long j) {
        m99411b(j);
        m99412c(j);
    }

    /* renamed from: b */
    private synchronized boolean m99411b(long j) {
        boolean z;
        Exception e;
        boolean z2 = false;
        try {
            JSONArray jSONArray = new JSONArray(C27368t.m99732a().mo97682m());
            int length = jSONArray.length();
            z = false;
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        if (optJSONObject.optLong("id") == j) {
                            try {
                                optJSONObject.put("has_callback", true);
                                z = true;
                            } catch (Exception e2) {
                                e = e2;
                                z2 = true;
                                e.printStackTrace();
                                z = z2;
                                return z;
                            }
                        }
                        JSONArray optJSONArray = optJSONObject.optJSONArray("interval_creative");
                        if (optJSONArray != null) {
                            int length2 = optJSONArray.length();
                            for (int i2 = 0; i2 < length2; i2++) {
                                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                                if (optJSONObject2 != null && optJSONObject2.optLong("id") == j) {
                                    optJSONObject2.put("has_callback", true);
                                    z = true;
                                }
                            }
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    z2 = z;
                    e.printStackTrace();
                    z = z2;
                    return z;
                }
            }
            if (z) {
                C27368t.m99732a().mo97660c(jSONArray.toString()).mo97681l();
            }
        } catch (Exception e4) {
            e = e4;
            e.printStackTrace();
            z = z2;
            return z;
        }
        return z;
    }

    /* renamed from: c */
    private synchronized boolean m99412c(long j) {
        boolean z;
        z = false;
        List<C27331b> e = C27319h.m99371a().mo97395e();
        if (!C27476f.m100322a(e)) {
            for (C27331b bVar : e) {
                if (bVar.mo97509v() == j) {
                    bVar.mo97498l();
                    z = true;
                }
                if (!C27476f.m100322a(bVar.mo97443I())) {
                    for (C27331b bVar2 : bVar.mo97443I()) {
                        if (bVar2 != null && bVar2.mo97509v() == j) {
                            bVar2.mo97498l();
                            z = true;
                        }
                    }
                }
            }
        }
        return z;
    }
}
