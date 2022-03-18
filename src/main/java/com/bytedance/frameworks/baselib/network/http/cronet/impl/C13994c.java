package com.bytedance.frameworks.baselib.network.http.cronet.impl;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.util.UrlUtils;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.impl.c */
public class C13994c {

    /* renamed from: a */
    private static volatile C13994c f36655a = null;

    /* renamed from: b */
    private static final String f36656b = "c";

    /* renamed from: c */
    private volatile int f36657c;

    /* renamed from: d */
    private List<C13995a> f36658d = new CopyOnWriteArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.impl.c$a */
    public static class C13995a {

        /* renamed from: a */
        final List<String> f36659a;

        /* renamed from: b */
        final List<String> f36660b;

        /* renamed from: c */
        List<String> f36661c;

        /* renamed from: d */
        List<String> f36662d;

        /* renamed from: e */
        List<Pattern> f36663e;

        /* renamed from: f */
        Set<Integer> f36664f;

        /* renamed from: g */
        int f36665g = 0;

        /* renamed from: h */
        int f36666h = Integer.MAX_VALUE;

        /* renamed from: i */
        String f36667i = UUID.randomUUID().toString();

        /* renamed from: j */
        volatile int f36668j = 0;

        /* renamed from: k */
        volatile long f36669k = SystemClock.uptimeMillis();

        /* renamed from: l */
        volatile boolean f36670l = false;

        /* renamed from: m */
        int f36671m = 4000;

        /* renamed from: n */
        boolean f36672n = false;

        /* renamed from: o */
        boolean f36673o = true;

        /* renamed from: a */
        public List<String> mo51537a() {
            return this.f36660b;
        }

        /* renamed from: b */
        public String mo51538b() {
            return this.f36667i;
        }

        public C13995a(List<String> list, List<String> list2) {
            this.f36659a = list;
            this.f36660b = list2;
        }
    }

    /* renamed from: a */
    public boolean mo51535a(int i, String str) {
        C13995a b;
        if (i == 0 || TextUtils.isEmpty(str) || (b = m56610b(str)) == null || b.f36664f == null) {
            return false;
        }
        return b.f36664f.contains(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo51534a(String str, boolean z) {
        C13995a b;
        if (!TextUtils.isEmpty(str) && (b = m56610b(str)) != null) {
            m56605a(b, z);
        }
    }

    /* renamed from: b */
    public boolean mo51536b() {
        if (this.f36657c > 0) {
            return true;
        }
        return false;
    }

    private C13994c() {
    }

    /* renamed from: a */
    public static C13994c m56604a() {
        if (f36655a == null) {
            synchronized (C13994c.class) {
                if (f36655a == null) {
                    f36655a = new C13994c();
                }
            }
        }
        return f36655a;
    }

    /* renamed from: c */
    private void m56611c() {
        for (C13995a aVar : this.f36658d) {
            if (aVar.f36670l) {
                long uptimeMillis = SystemClock.uptimeMillis() - aVar.f36669k;
                if (uptimeMillis > ((long) (aVar.f36665g * 1000))) {
                    aVar.f36670l = false;
                }
                if (Logger.debug()) {
                    String str = f36656b;
                    Logger.m15167d(str, "Rule id: " + aVar.f36667i + " has forbidden duration: " + uptimeMillis + " fail count: " + aVar.f36668j + " forbidden duration: " + (aVar.f36665g * 1000));
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m56608a(List<?> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private C13995a m56610b(String str) {
        for (C13995a aVar : this.f36658d) {
            if (aVar.mo51538b().equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m56606a(JSONObject jSONObject) throws JSONException {
        boolean z;
        ArrayList arrayList = new ArrayList();
        m56609a(jSONObject, "host_group", arrayList);
        ArrayList arrayList2 = new ArrayList();
        m56609a(jSONObject, "concurrent_hosts", arrayList2);
        if (!arrayList.isEmpty() && arrayList2.size() >= 2) {
            C13995a aVar = new C13995a(arrayList, arrayList2);
            ArrayList arrayList3 = new ArrayList();
            if (m56609a(jSONObject, "equal_group", arrayList3)) {
                aVar.f36661c = arrayList3;
            }
            ArrayList arrayList4 = new ArrayList();
            if (m56609a(jSONObject, "prefix_group", arrayList4)) {
                aVar.f36662d = arrayList4;
            }
            ArrayList arrayList5 = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("pattern_group");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        try {
                            arrayList5.add(Pattern.compile(optString, 2));
                        } catch (Throwable unused) {
                        }
                    }
                }
                aVar.f36663e = arrayList5;
            }
            aVar.f36666h = jSONObject.optInt("fail_count", Integer.MAX_VALUE);
            aVar.f36665g = jSONObject.optInt("forbid_seconds", 0);
            aVar.f36671m = jSONObject.optInt("connect_interval_millis", 4000);
            boolean z2 = true;
            if (jSONObject.optInt("bypass_rs_enabled", 1) > 0) {
                z = true;
            } else {
                z = false;
            }
            aVar.f36673o = z;
            if (aVar.f36671m > 0) {
                if (jSONObject.optInt("retry_for_not_2xx_code", 0) <= 0) {
                    z2 = false;
                }
                aVar.f36672n = z2;
                HashSet hashSet = new HashSet();
                JSONArray optJSONArray2 = jSONObject.optJSONArray("block_code_list");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        hashSet.add(Integer.valueOf(optJSONArray2.optInt(i2)));
                    }
                    aVar.f36664f = hashSet;
                }
                this.f36658d.add(aVar);
            }
        }
    }

    /* renamed from: a */
    public C13995a mo51532a(Request request) {
        m56611c();
        for (C13995a aVar : this.f36658d) {
            if (m56607a(request, aVar)) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo51533a(String str) {
        String str2 = f36656b;
        Logger.m15167d(str2, "onNetConfigChanged config: " + str);
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f36657c = jSONObject.optInt("enabled_v2", 0);
                this.f36658d.clear();
                JSONArray jSONArray = jSONObject.getJSONArray("match_rules");
                for (int i = 0; i < jSONArray.length(); i++) {
                    m56606a((JSONObject) jSONArray.get(i));
                }
            } catch (Throwable unused) {
                Logger.m15167d(f36656b, "parse json config error");
            }
        }
    }

    /* renamed from: a */
    private void m56605a(C13995a aVar, boolean z) {
        if (Logger.debug()) {
            String str = f36656b;
            Logger.m15167d(str, "Forbidden: " + aVar.f36670l + " failed count: " + aVar.f36668j + " max count: " + aVar.f36666h);
        }
        if (!z) {
            int i = aVar.f36668j + 1;
            aVar.f36668j = i;
            if (i >= aVar.f36666h) {
                if (!aVar.f36670l) {
                    aVar.f36670l = true;
                    aVar.f36669k = SystemClock.uptimeMillis();
                }
                if (Logger.debug()) {
                    String str2 = f36656b;
                    Logger.m15167d(str2, "Forbidden: " + aVar.f36670l + " failed count: " + aVar.f36668j);
                }
            }
        } else if (aVar.f36668j != 0 || aVar.f36670l) {
            aVar.f36668j = 0;
            aVar.f36670l = false;
        }
    }

    /* renamed from: a */
    private boolean m56607a(Request request, C13995a aVar) {
        boolean z;
        if (aVar.f36665g > 0 && aVar.f36670l) {
            return false;
        }
        String url = request.getUrl();
        if (TextUtils.isEmpty(url)) {
            return false;
        }
        Iterator<String> it = aVar.f36659a.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (UrlUtils.matchPattern(request.getHost(), it.next())) {
                z = true;
                break;
            }
        }
        if (!z) {
            String str = f36656b;
            Logger.m15167d(str, "host not match: " + url);
            return false;
        }
        String path = request.getPath();
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        if (!m56608a(aVar.f36661c)) {
            for (String str2 : aVar.f36661c) {
                if (path.equals(str2)) {
                    return true;
                }
            }
        }
        if (!m56608a(aVar.f36662d)) {
            for (String str3 : aVar.f36662d) {
                if (path.startsWith(str3)) {
                    return true;
                }
            }
        }
        if (!m56608a(aVar.f36663e)) {
            for (Pattern pattern : aVar.f36663e) {
                if (pattern != null && pattern.matcher(path).matches()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m56609a(JSONObject jSONObject, String str, List<String> list) {
        JSONArray optJSONArray;
        if (jSONObject == null || TextUtils.isEmpty(str) || list == null || (optJSONArray = jSONObject.optJSONArray(str)) == null) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            String optString = optJSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                list.add(optString);
            }
        }
        return true;
    }
}
