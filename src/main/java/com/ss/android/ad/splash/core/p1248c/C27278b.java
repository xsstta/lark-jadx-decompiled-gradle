package com.ss.android.ad.splash.core.p1248c;

import android.text.TextUtils;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.ad.splash.core.C27287e;
import com.ss.android.ad.splash.core.C27319h;
import com.ss.android.ad.splash.core.model.C27331b;
import com.ss.android.ad.splash.origin.AbstractC27456a;
import com.ss.android.ad.splash.utils.C27477g;
import com.ss.android.ad.splash.utils.C27478h;
import com.ss.android.ad.splash.utils.C27480i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.c.b */
public class C27278b {

    /* renamed from: a */
    private static volatile C27278b f67986a;

    /* renamed from: b */
    private List<C27276a> f67987b = new ArrayList();

    /* renamed from: a */
    public void mo97298a(boolean z) {
        List<C27276a> list = this.f67987b;
        if (list != null) {
            if (!z) {
                try {
                    if (list.size() > 0) {
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        for (C27276a aVar : this.f67987b) {
                            if (aVar != null && aVar.mo97279a() > 0) {
                                jSONObject.put(aVar.mo97281c() + "", aVar.mo97279a());
                            }
                        }
                        jSONObject3.put("ad_show_fail_list", jSONObject);
                        jSONObject3.put("ad_show_fail_type", 3);
                        jSONObject2.put("log_extra", "{}");
                        jSONObject2.putOpt("is_ad_event", "1");
                        jSONObject2.put("ad_extra_data", jSONObject3);
                        C27287e.m99229a(84378473382L, "splash_ad", "open_splash", jSONObject2);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            mo97304c();
        }
    }

    /* renamed from: a */
    public void mo97297a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.putOpt("uri", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.putOpt("path", str2);
            }
            jSONObject2.put("log_extra", C27319h.m99371a().mo97400i());
            jSONObject.putOpt("ad_extra_data", jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C27287e.m99229a(84378473382L, "splash_ad", "error_save_sp", jSONObject);
    }

    /* renamed from: a */
    public void mo97296a(AbstractC27456a aVar, long j, String str, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                m99172a(jSONObject, hashMap);
                m99172a(jSONObject2, hashMap2);
                if (aVar != null) {
                    if (!TextUtils.isEmpty(aVar.mo97511x())) {
                        jSONObject.put("log_extra", aVar.mo97511x());
                    }
                    jSONObject.put("ad_fetch_time", aVar.mo97491f());
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.putOpt("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
                C27477g.m100325a("error in putting log_extra into json");
            }
            if (aVar != null) {
                j = aVar.mo97509v();
            }
            C27287e.m99229a(j, "splash_ad", str, jSONObject);
        }
    }

    /* renamed from: c */
    public void mo97304c() {
        List<C27276a> list = this.f67987b;
        if (list != null) {
            list.clear();
        }
    }

    private C27278b() {
    }

    /* renamed from: a */
    public static C27278b m99171a() {
        if (f67986a == null) {
            synchronized (C27278b.class) {
                if (f67986a == null) {
                    f67986a = new C27278b();
                }
            }
        }
        return f67986a;
    }

    /* renamed from: b */
    public void mo97299b() {
        if (this.f67987b == null) {
            this.f67987b = new ArrayList();
        }
        this.f67987b.clear();
    }

    /* renamed from: d */
    public void mo97308d() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("start_time", Long.valueOf(System.currentTimeMillis()));
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("log_extra", C27319h.m99371a().mo97400i());
            jSONObject.putOpt("is_ad_event", "1");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C27287e.m99229a(84378473382L, "splash_ad", "request", jSONObject);
    }

    /* renamed from: a */
    public void mo97291a(C27276a aVar) {
        List<C27276a> list;
        if (aVar != null && (list = this.f67987b) != null) {
            list.add(aVar);
        }
    }

    /* renamed from: c */
    public void mo97306c(C27331b bVar) {
        if (bVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (!TextUtils.isEmpty(bVar.mo97511x())) {
                    jSONObject.put("log_extra", bVar.mo97511x());
                }
                jSONObject.putOpt("is_ad_event", "1");
                jSONObject.putOpt("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
            }
            C27287e.m99229a(bVar.mo97509v(), "splash_ad", "open_splash", jSONObject);
        }
    }

    /* renamed from: b */
    public void mo97300b(C27276a aVar) {
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (aVar.mo97280b() > 0) {
                    jSONObject2.put("ad_show_fail_type", aVar.mo97280b());
                }
                if (!TextUtils.isEmpty(aVar.mo97282d())) {
                    jSONObject.put("log_extra", aVar.mo97282d());
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_extra_data", jSONObject2);
            } catch (Exception e) {
                e.printStackTrace();
            }
            C27287e.m99229a(aVar.mo97281c(), "splash_ad", "open_splash", jSONObject);
        }
    }

    /* renamed from: c */
    public void mo97305c(C27276a aVar) {
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (aVar.mo97280b() > 0 && aVar.mo97279a() > 0) {
                    jSONObject2.put("ad_show_fail_type", aVar.mo97280b());
                    jSONObject2.put("ad_error_code", aVar.mo97279a());
                }
                if (!TextUtils.isEmpty(aVar.mo97283e())) {
                    jSONObject2.put("is_topview", aVar.mo97283e());
                }
                if (!TextUtils.isEmpty(aVar.mo97282d())) {
                    jSONObject.put("log_extra", aVar.mo97282d());
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_extra_data", jSONObject2);
            } catch (Exception e) {
                e.printStackTrace();
            }
            C27287e.m99229a(aVar.mo97281c(), "splash_ad", "open_splash", jSONObject);
        }
    }

    /* renamed from: a */
    public void mo97292a(C27331b bVar) {
        String str = "1";
        if (bVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (!TextUtils.isEmpty(bVar.mo97511x())) {
                    jSONObject.put("log_extra", bVar.mo97511x());
                }
                jSONObject.put("is_ad_event", str);
                jSONObject.put("ad_fetch_time", bVar.mo97491f());
                if (!C27478h.m100357a(bVar)) {
                    str = "0";
                }
                jSONObject2.putOpt("is_topview", str);
                jSONObject.putOpt("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
                C27477g.m100325a("error in putting log_extra into json");
            }
            C27287e.m99229a(bVar.mo97509v(), "splash_ad", "ad_selected", jSONObject);
        }
    }

    /* renamed from: b */
    public void mo97301b(C27331b bVar) {
        String str = "1";
        if (bVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (!TextUtils.isEmpty(bVar.mo97511x())) {
                    jSONObject.put("log_extra", bVar.mo97511x());
                }
                jSONObject.put("is_ad_event", str);
                jSONObject.put("ad_fetch_time", bVar.mo97491f());
                if (!C27478h.m100357a(bVar)) {
                    str = "0";
                }
                jSONObject2.putOpt("is_topview", str);
                jSONObject.putOpt("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
                C27477g.m100325a("error in putting log_extra into json");
            }
            C27287e.m99229a(bVar.mo97509v(), "splash_ad", "ad_no_selected", jSONObject);
        }
    }

    /* renamed from: c */
    public void mo97307c(boolean z) {
        int i;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            jSONObject2.putOpt(UpdateKey.STATUS, Integer.valueOf(i));
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("log_extra", C27319h.m99371a().mo97400i());
            jSONObject.putOpt("is_ad_event", "1");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C27287e.m99229a(84378473382L, "splash_ad", "response", jSONObject);
    }

    /* renamed from: d */
    public void mo97309d(C27276a aVar) {
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (aVar.mo97280b() > 0) {
                    jSONObject2.put("ad_show_fail_type", aVar.mo97280b());
                }
                if (aVar.mo97279a() > 0) {
                    jSONObject2.put("ad_error_code", aVar.mo97279a());
                }
                if (!TextUtils.isEmpty(aVar.mo97282d())) {
                    jSONObject.put("log_extra", aVar.mo97282d());
                }
                jSONObject.putOpt("is_ad_event", "1");
                jSONObject.putOpt("ad_extra_data", jSONObject2);
            } catch (Exception e) {
                e.printStackTrace();
            }
            C27287e.m99229a(aVar.mo97281c(), "splash_ad", "open_splash", jSONObject);
        }
    }

    /* renamed from: b */
    public void mo97303b(boolean z) {
        int i;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            jSONObject2.putOpt("is_empty_data", Integer.valueOf(i));
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("log_extra", C27319h.m99371a().mo97400i());
            jSONObject.putOpt("is_ad_event", "1");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C27287e.m99229a(84378473382L, "splash_ad", "parse_finished", jSONObject);
    }

    /* renamed from: a */
    private void m99172a(JSONObject jSONObject, HashMap<String, Object> hashMap) throws JSONException {
        if (!(jSONObject == null || hashMap == null || hashMap.isEmpty())) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!TextUtils.isEmpty(key) && value != null) {
                    jSONObject.putOpt(key, value);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo97290a(int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("diff", Long.valueOf(C27478h.m100379g() - System.currentTimeMillis()));
            jSONObject2.putOpt("server_time", Long.valueOf(C27478h.m100379g()));
            jSONObject2.putOpt("device_time", Long.valueOf(System.currentTimeMillis()));
            jSONObject2.putOpt("is_time_valid", Integer.valueOf(i));
            jSONObject2.putOpt("invalid_reason", Integer.valueOf(i2));
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("is_ad_event", "1");
            jSONObject.putOpt("log_extra", C27319h.m99371a().mo97400i());
        } catch (Exception unused) {
            C27477g.m100325a("error in putting data into json");
        }
        C27287e.m99229a(84378473382L, "splash_ad", "valid_time", jSONObject);
    }

    /* renamed from: a */
    public void mo97293a(C27331b bVar, int i) {
        String str;
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("ad_error_code", Integer.valueOf(i));
        if (C27478h.m100357a(bVar)) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("is_topview", str);
        mo97296a(bVar, 0, "open_splash", null, hashMap);
    }

    /* renamed from: b */
    public void mo97302b(C27331b bVar, String str) {
        int i;
        if (bVar != null && !C27480i.m100385a(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(bVar.mo97511x())) {
                    jSONObject.put("log_extra", bVar.mo97511x());
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_fetch_time", bVar.mo97491f());
                if (bVar.mo97502p()) {
                    JSONObject jSONObject2 = new JSONObject();
                    if (bVar.mo97504r()) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.put("topview_type", i));
                }
            } catch (Exception unused) {
                C27477g.m100325a("error in putting log_extra into json");
            }
            C27287e.m99229a(bVar.mo97509v(), "splash_ad", str, jSONObject);
        }
    }

    /* renamed from: a */
    public void mo97294a(C27331b bVar, C27331b bVar2) {
        if (bVar != null && bVar2 != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (!TextUtils.isEmpty(bVar2.mo97511x())) {
                    jSONObject.put("log_extra", bVar2.mo97511x());
                }
                if (!TextUtils.isEmpty(bVar.mo97457W())) {
                    jSONObject2.put("topview_ad_id", bVar.mo97457W());
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_extra_data", jSONObject2);
                jSONObject.put("ad_fetch_time", bVar2.mo97491f());
            } catch (Exception e) {
                e.printStackTrace();
            }
            C27287e.m99229a(bVar2.mo97509v(), "splash_ad", "topview_other_show", jSONObject);
        }
    }

    /* renamed from: a */
    public void mo97295a(C27331b bVar, String str) {
        if (bVar != null && !C27480i.m100385a(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(bVar.mo97511x())) {
                    jSONObject.put("log_extra", bVar.mo97511x());
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_fetch_time", bVar.mo97491f());
            } catch (Exception unused) {
                C27477g.m100325a("error in putting log_extra into json");
            }
            C27287e.m99229a(bVar.mo97509v(), "splash_ad", str, jSONObject);
        }
    }
}
