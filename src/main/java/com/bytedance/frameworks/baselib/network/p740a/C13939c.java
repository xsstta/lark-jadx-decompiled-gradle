package com.bytedance.frameworks.baselib.network.p740a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.util.UrlBuilder;
import com.bytedance.frameworks.baselib.network.http.util.UrlUtils;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.a.c */
public class C13939c {

    /* renamed from: a */
    private static volatile C13939c f36445a = null;

    /* renamed from: f */
    private static final String f36446f = "c";

    /* renamed from: b */
    private volatile String f36447b;

    /* renamed from: c */
    private volatile boolean f36448c;

    /* renamed from: d */
    private List<AbstractC13938b> f36449d = new CopyOnWriteArrayList();

    /* renamed from: e */
    private List<String> f36450e = new CopyOnWriteArrayList();

    private C13939c() {
    }

    /* renamed from: a */
    public static C13939c m56420a() {
        if (f36445a == null) {
            synchronized (C13939c.class) {
                if (f36445a == null) {
                    f36445a = new C13939c();
                }
            }
        }
        return f36445a;
    }

    /* renamed from: a */
    public void mo51300a(boolean z) {
        this.f36448c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.frameworks.baselib.network.a.c$a */
    public class C13940a implements Comparator<AbstractC13938b> {
        C13940a() {
        }

        /* renamed from: a */
        public int compare(AbstractC13938b bVar, AbstractC13938b bVar2) {
            return bVar.mo51292a() - bVar2.mo51292a();
        }
    }

    /* renamed from: b */
    public void mo51301b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f36450e.clear();
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.f36450e.add(jSONArray.getString(i));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private JSONArray m56421a(List<C13937a> list) {
        JSONArray jSONArray = new JSONArray();
        for (C13937a aVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("hit", aVar.mo51290b());
                jSONObject.put("priority", aVar.mo51291c());
                jSONObject.put("consume", aVar.mo51285a());
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        String str = f36446f;
        Logger.m15167d(str, "action info: " + jSONArray.toString());
        return jSONArray;
    }

    /* renamed from: c */
    private synchronized void m56424c(String str) throws JSONException {
        if (TextUtils.isEmpty(this.f36447b) || !this.f36447b.equals(str)) {
            ArrayList<AbstractC13938b> arrayList = new ArrayList<>();
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                m56422a(jSONArray.getJSONObject(i), arrayList);
            }
            Collections.sort(arrayList, new C13940a());
            this.f36449d.clear();
            this.f36449d.addAll(arrayList);
            this.f36447b = str;
            return;
        }
        Logger.m15167d(f36446f, "Config is same with local config, do not parse.");
    }

    /* renamed from: a */
    public Request mo51298a(Request request) {
        if (!this.f36448c) {
            Logger.m15167d(f36446f, "Query filter engine is not enabled");
            return null;
        }
        String url = request.getUrl();
        if (TextUtils.isEmpty(url)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> parseUrlWithValueList = UrlUtils.parseUrlWithValueList(url, linkedHashMap);
            if (parseUrlWithValueList != null) {
                if (!linkedHashMap.isEmpty()) {
                    if (!m56423a(request, linkedHashMap)) {
                        return null;
                    }
                    UrlBuilder urlBuilder = new UrlBuilder(((String) parseUrlWithValueList.first) + ((String) parseUrlWithValueList.second));
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry<String, List<String>> entry : linkedHashMap.entrySet()) {
                            if (entry != null) {
                                if (entry.getKey() != null) {
                                    List<String> value = entry.getValue();
                                    if (value != null) {
                                        if (!value.isEmpty()) {
                                            for (String str : value) {
                                                urlBuilder.addParam(entry.getKey(), str);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Request.C20591a newBuilder = request.newBuilder();
                    newBuilder.mo69377a(urlBuilder.build());
                    return newBuilder.mo69380b();
                }
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public void mo51299a(String str) {
        String str2 = f36446f;
        Logger.m15167d(str2, "onNetConfigChanged config: " + str + " enabled: " + this.f36448c);
        if (this.f36448c && !TextUtils.isEmpty(str)) {
            try {
                m56424c(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private void m56422a(JSONObject jSONObject, ArrayList<AbstractC13938b> arrayList) throws JSONException {
        String string = jSONObject.getString("action");
        int i = jSONObject.getInt("act_priority");
        if (i >= 0) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("param");
            int optInt = jSONObject.optInt("set_req_priority", i);
            if (optInt == -1) {
                optInt = Integer.MAX_VALUE;
            }
            AbstractC13938b a = AbstractC13938b.m56407a(string, i, optInt, jSONObject2);
            if (a != null) {
                arrayList.add(a);
            }
        }
    }

    /* renamed from: a */
    private boolean m56423a(Request request, Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        request.setQueryFilterPriority(0);
        for (AbstractC13938b bVar : this.f36449d) {
            if (bVar.mo51296a(request, map, arrayList)) {
                z = true;
            }
        }
        String str = f36446f;
        Logger.m15167d(str, "dispatchQueryMap hit: " + z);
        if (request.getMetrics() != null) {
            request.getMetrics().f50269O = m56421a(arrayList);
        }
        return z;
    }
}
