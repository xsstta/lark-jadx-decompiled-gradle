package com.ss.android.ad.splash.core.model;

import com.ss.android.ad.splash.core.C27287e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.model.q */
public class C27351q {

    /* renamed from: a */
    private List<C27342j> f68274a = new ArrayList();

    /* renamed from: b */
    private LinkedHashMap<Long, String> f68275b = null;

    /* renamed from: c */
    private List<Long> f68276c = null;

    /* renamed from: d */
    private int f68277d = 0;

    /* renamed from: a */
    public List<Long> mo97583a() {
        return this.f68276c;
    }

    /* renamed from: b */
    public List<C27342j> mo97586b() {
        return this.f68274a;
    }

    /* renamed from: c */
    public LinkedHashMap<Long, String> mo97588c() {
        return this.f68275b;
    }

    /* renamed from: d */
    public int mo97589d() {
        return this.f68277d;
    }

    /* renamed from: a */
    public void mo97584a(int i) {
        this.f68277d = i;
    }

    /* renamed from: b */
    public void mo97587b(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                this.f68276c = new ArrayList();
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        this.f68276c.add(Long.valueOf(jSONArray.optLong(i)));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                this.f68276c = null;
            }
        }
    }

    /* renamed from: a */
    public void mo97585a(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                this.f68275b = new LinkedHashMap<>();
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("item_key", "");
                            Long valueOf = Long.valueOf(optJSONObject.optLong("splash_id", 0));
                            String optString2 = optJSONObject.optString("log_extra", "");
                            if (valueOf.longValue() > 0) {
                                if (!C27287e.ai()) {
                                    this.f68274a.add(new C27342j(valueOf.longValue(), optString, optString2));
                                }
                                this.f68275b.put(valueOf, optString2);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                this.f68275b = null;
                this.f68274a = null;
            }
        }
    }
}
