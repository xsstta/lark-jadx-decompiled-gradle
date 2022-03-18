package com.bytedance.retrofit2;

import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.retrofit2.k */
public class C20639k {

    /* renamed from: A */
    public long f50255A = -1;

    /* renamed from: B */
    public long f50256B = -1;

    /* renamed from: C */
    public long f50257C = -1;

    /* renamed from: D */
    public long f50258D = -1;

    /* renamed from: E */
    public long f50259E = -1;

    /* renamed from: F */
    public long f50260F = -1;

    /* renamed from: G */
    public long f50261G = -1;

    /* renamed from: H */
    public long f50262H = -1;

    /* renamed from: I */
    public long f50263I = -1;

    /* renamed from: J */
    public long f50264J = -1;

    /* renamed from: K */
    public long f50265K = -1;

    /* renamed from: L */
    public long f50266L = -1;

    /* renamed from: M */
    public Map<String, Long> f50267M = new HashMap();

    /* renamed from: N */
    public String f50268N = "";

    /* renamed from: O */
    public JSONArray f50269O;

    /* renamed from: P */
    public Map<String, Long> f50270P = new ConcurrentHashMap();

    /* renamed from: a */
    public int f50271a = -1;

    /* renamed from: b */
    public String f50272b = "";

    /* renamed from: c */
    public JSONObject f50273c;

    /* renamed from: d */
    public String f50274d;

    /* renamed from: e */
    public boolean f50275e;

    /* renamed from: f */
    public long f50276f;

    /* renamed from: g */
    public long f50277g;

    /* renamed from: h */
    public long f50278h;

    /* renamed from: i */
    public long f50279i;

    /* renamed from: j */
    public long f50280j;

    /* renamed from: k */
    public long f50281k;

    /* renamed from: l */
    public long f50282l;

    /* renamed from: m */
    public long f50283m;

    /* renamed from: n */
    public long f50284n;

    /* renamed from: o */
    public long f50285o;

    /* renamed from: p */
    public long f50286p;

    /* renamed from: q */
    public long f50287q;

    /* renamed from: r */
    public long f50288r;

    /* renamed from: s */
    public long f50289s;

    /* renamed from: t */
    public long f50290t;

    /* renamed from: u */
    public long f50291u;

    /* renamed from: v */
    public long f50292v;

    /* renamed from: w */
    public long f50293w;

    /* renamed from: x */
    public Map<String, Long> f50294x = new HashMap();

    /* renamed from: y */
    public Map<String, Long> f50295y = new HashMap();

    /* renamed from: z */
    public long f50296z = -1;

    /* renamed from: b */
    private JSONObject m75021b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("model", Build.MODEL);
            String str = "";
            if (Build.VERSION.SDK_INT < 21) {
                str = Build.CPU_ABI;
            } else {
                String[] strArr = Build.SUPPORTED_ABIS;
                if (strArr != null && strArr.length > 0) {
                    str = Arrays.asList(strArr).toString();
                }
            }
            jSONObject.put("abis", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: d */
    private JSONObject m75023d() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Long> entry : this.f50270P.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: e */
    private JSONObject m75024e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("filterUrl", this.f50296z);
            jSONObject.put("addCommonParam", this.f50255A);
            jSONObject.put("requestVerify", this.f50256B);
            jSONObject.put("encryptRequest", this.f50258D);
            jSONObject.put("genReqTicket", this.f50259E);
            jSONObject.put("checkReqTicket", this.f50260F);
            jSONObject.put("preCdnVerify", this.f50261G);
            jSONObject.put("postCdnVerify", this.f50264J);
            jSONObject.put("addClientKey", this.f50262H);
            jSONObject.put("updateClientKey", this.f50263I);
            jSONObject.put("commandListener", this.f50265K);
            jSONObject.put("filterDupQuery", this.f50257C);
            jSONObject.put("queryFilter", this.f50266L);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: f */
    private JSONObject m75025f() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.f50294x.isEmpty()) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, Long> entry : this.f50294x.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("request", jSONObject2);
            }
            if (!this.f50295y.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry<String, Long> entry2 : this.f50295y.entrySet()) {
                    jSONObject3.put(entry2.getKey(), entry2.getValue());
                }
                jSONObject.put("response", jSONObject3);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public String mo69449a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f50271a != -1) {
                jSONObject.put("model", m75021b());
            }
            JSONObject jSONObject2 = this.f50273c;
            if (jSONObject2 != null) {
                jSONObject.put("concurrentRequest", jSONObject2);
            }
            jSONObject.put("concurrent", this.f50275e);
            jSONObject.put("base", m75022c());
            jSONObject.put("callback", m75024e());
            jSONObject.put("interceptor", m75025f());
            jSONObject.put("ttnetVersion", this.f50268N);
            JSONArray jSONArray = this.f50269O;
            if (jSONArray != null) {
                jSONObject.put("actionInfo", jSONArray);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: c */
    private JSONObject m75022c() {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fallback", this.f50271a);
            if (!TextUtils.isEmpty(this.f50272b)) {
                jSONObject.put("fallbackMessage", this.f50272b);
            }
            jSONObject.put("createRetrofitTime", this.f50276f);
            jSONObject.put("appRequestStartTime", this.f50277g);
            jSONObject.put("beforeAllInterceptTime", this.f50278h);
            jSONObject.put("callServerInterceptTime", this.f50279i);
            jSONObject.put("callExecuteStartTime", this.f50280j);
            jSONObject.put("reportTime", this.f50281k);
            jSONObject.put("delayWait", this.f50286p);
            jSONObject.put("injectInterceptorTime", m75023d());
            if (!TextUtils.isEmpty(this.f50274d)) {
                jSONObject.put("transactionId", this.f50274d);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        boolean a = m75020a(jSONObject, "loadServiceMethod", this.f50282l, this.f50283m, true);
        long j = this.f50284n;
        if (j > 0) {
            z = m75020a(jSONObject, "enqueueWait", j, this.f50287q, a);
        } else {
            z = m75020a(jSONObject, "executeWait", this.f50285o, this.f50287q, a);
        }
        m75020a(jSONObject, "responseParse", this.f50292v, this.f50293w, m75020a(jSONObject, "requestParse", this.f50288r, this.f50289s, m75020a(jSONObject, "executeCall", this.f50290t, this.f50291u, z)));
        return jSONObject;
    }

    /* renamed from: a */
    private boolean m75020a(JSONObject jSONObject, String str, long j, long j2, boolean z) {
        if (!z || j > j2) {
            jSONObject.put(str, -1);
            return false;
        }
        try {
            jSONObject.put(str, j2 - j);
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }
}
