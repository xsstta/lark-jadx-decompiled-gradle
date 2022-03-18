package com.bytedance.apm.p143i.p147c;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.p124a.p125a.AbstractC2742b;
import com.bytedance.apm.p124a.p125a.AbstractC2743c;
import com.bytedance.apm.p124a.p125a.C2741a;
import com.bytedance.apm.p124a.p125a.C2744d;
import com.bytedance.apm.p139e.C2921a;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm.util.C3141x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.i.c.a */
public class C2960a {

    /* renamed from: a */
    public boolean f9505a;

    /* renamed from: b */
    private boolean f9506b;

    /* renamed from: c */
    private Map<String, C2964a> f9507c;

    /* renamed from: d */
    private Map<String, C2964a> f9508d;

    /* renamed from: e */
    private C3141x<C2980h> f9509e;

    /* renamed from: f */
    private volatile long f9510f;

    /* renamed from: g */
    private Map<String, Map<String, C2964a>> f9511g;

    /* renamed from: h */
    private double f9512h;

    /* renamed from: i */
    private double f9513i;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.i.c.a$b */
    public static final class C2965b {

        /* renamed from: a */
        public static final C2960a f9524a = new C2960a();
    }

    /* renamed from: a */
    public void mo12677a(JSONObject jSONObject) {
    }

    /* renamed from: a */
    public static C2960a m12448a() {
        return C2965b.f9524a;
    }

    /* renamed from: c */
    public Map<String, C2964a> mo12680c() {
        return this.f9508d;
    }

    /* renamed from: d */
    public C3141x<C2980h> mo12682d() {
        return this.f9509e;
    }

    /* renamed from: e */
    public Map<String, C2964a> mo12683e() {
        return this.f9507c;
    }

    /* renamed from: f */
    public long mo12684f() {
        return this.f9510f;
    }

    private C2960a() {
        this.f9512h = 102400.0d;
        this.f9513i = 102400.0d;
    }

    /* renamed from: h */
    private void m12451h() {
        C2744d.m11644c().mo11798a(new AbstractC2743c() {
            /* class com.bytedance.apm.p143i.p147c.C2960a.C29611 */

            @Override // com.bytedance.apm.p124a.p125a.AbstractC2743c
            /* renamed from: a */
            public void mo11797a(String str, JSONObject jSONObject) {
                if (C2960a.this.f9505a) {
                    C2960a.this.mo12676a(str, jSONObject);
                }
            }
        });
    }

    /* renamed from: i */
    private void m12452i() {
        C2741a.m11630c().mo11795a(new AbstractC2742b() {
            /* class com.bytedance.apm.p143i.p147c.C2960a.C29622 */

            @Override // com.bytedance.apm.p124a.p125a.AbstractC2742b
            /* renamed from: a */
            public void mo11796a(String str, String str2, JSONObject jSONObject) {
                if (C2960a.this.f9505a && "image_monitor_v2".equals(str2)) {
                    C2960a.this.mo12677a(jSONObject);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo12678b() {
        m12449a(true);
        m12450b(true);
        m12451h();
        m12452i();
    }

    /* renamed from: g */
    public void mo12685g() {
        Map<String, C2964a> map = this.f9507c;
        if (map != null) {
            map.clear();
        }
        C3141x<C2980h> xVar = this.f9509e;
        if (xVar != null) {
            xVar.mo13063c();
        }
        this.f9510f = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.apm.i.c.a$a */
    public class C2964a {

        /* renamed from: a */
        public String f9520a;

        /* renamed from: b */
        public Map<String, Long> f9521b = new HashMap();

        /* renamed from: c */
        public long f9522c;

        /* renamed from: a */
        public JSONObject mo12687a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("biz", this.f9520a);
                jSONObject.put("usage", this.f9522c);
                JSONArray jSONArray = new JSONArray();
                Map<String, Long> map = this.f9521b;
                if (map != null && map.size() > 0) {
                    for (Map.Entry<String, Long> entry : this.f9521b.entrySet()) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("source_id", entry.getKey());
                        jSONObject2.put("usage", entry.getValue());
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("detail", jSONArray);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        public C2964a(String str) {
            this.f9520a = str;
        }

        /* renamed from: a */
        public void mo12688a(String str, long j) {
            if (this.f9521b.containsKey(str)) {
                Map<String, Long> map = this.f9521b;
                map.put(str, Long.valueOf(map.get(str).longValue() + j));
            } else {
                this.f9521b.put(str, Long.valueOf(j));
            }
            this.f9522c += j;
        }
    }

    /* renamed from: a */
    private void m12449a(boolean z) {
        this.f9505a = z;
    }

    /* renamed from: b */
    private void m12450b(boolean z) {
        this.f9506b = z;
        C2921a.m12356a(z);
    }

    /* renamed from: a */
    public void mo12672a(double d) {
        this.f9512h = d;
    }

    /* renamed from: a */
    public void mo12674a(String str) {
        if (this.f9511g == null) {
            this.f9511g = new HashMap();
        }
        this.f9511g.put(str, new HashMap());
    }

    /* renamed from: b */
    public void mo12679b(String str) {
        Map<String, Map<String, C2964a>> map = this.f9511g;
        if (map != null) {
            map.remove(str);
        }
    }

    /* renamed from: c */
    public Map<String, C2964a> mo12681c(String str) {
        if (this.f9511g == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f9511g.get(str);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:11|(2:13|(1:15))|16|(1:18)|19|(3:21|(1:23)|24)|25|(2:27|28)|29|30|32) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0098 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12676a(java.lang.String r10, org.json.JSONObject r11) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p143i.p147c.C2960a.mo12676a(java.lang.String, org.json.JSONObject):void");
    }

    /* renamed from: a */
    public void mo12675a(String str, long j, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (this.f9507c == null) {
                this.f9507c = new HashMap();
            }
            if (this.f9507c.containsKey(str)) {
                this.f9507c.get(str).mo12688a(str2, j);
            } else {
                C2964a aVar = new C2964a(str);
                aVar.mo12688a(str2, j);
                this.f9507c.put(str, aVar);
            }
            if (this.f9508d == null) {
                this.f9508d = new HashMap();
            }
            if (this.f9508d.containsKey(str)) {
                this.f9508d.get(str).mo12688a(str2, j);
            } else {
                C2964a aVar2 = new C2964a(str);
                aVar2.mo12688a(str2, j);
                this.f9508d.put(str, aVar2);
            }
            Map<String, Map<String, C2964a>> map = this.f9511g;
            if (map != null) {
                for (Map.Entry<String, Map<String, C2964a>> entry : map.entrySet()) {
                    Map<String, C2964a> value = entry.getValue();
                    if (value.containsKey(str)) {
                        value.get(str).mo12688a(str2, j);
                    } else {
                        C2964a aVar3 = new C2964a(str);
                        aVar3.mo12688a(str2, j);
                        value.put(str, aVar3);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo12673a(final long j, final String str, final String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (this.f9505a) {
            C3047b.m12756a().mo12886a(new Runnable() {
                /* class com.bytedance.apm.p143i.p147c.C2960a.RunnableC29633 */

                public void run() {
                    C2960a.this.mo12675a(str2, j, str);
                }
            });
            String str9 = "";
            if (this.f9506b && ((double) j) > this.f9513i) {
                Object[] objArr = new Object[6];
                objArr[0] = Long.valueOf(j);
                objArr[1] = str;
                objArr[2] = str2;
                if (str3 == null) {
                    str6 = str9;
                } else {
                    str6 = str3;
                }
                objArr[3] = str6;
                if (jSONObject == null) {
                    str7 = str9;
                } else {
                    str7 = jSONObject.toString();
                }
                objArr[4] = str7;
                if (jSONObject2 == null) {
                    str8 = str9;
                } else {
                    str8 = jSONObject2.toString();
                }
                objArr[5] = str8;
                C2921a.m12360c("BizTrafficStats", String.format("trafficBytes: %d, sourceId: %s, business: %s, scene: %s, extraStatus: %s, extraLog: %s", objArr));
            }
            if (C2785b.m11769j()) {
                Object[] objArr2 = new Object[6];
                objArr2[0] = Long.valueOf(j);
                objArr2[1] = str;
                objArr2[2] = str2;
                if (str3 == null) {
                    str4 = str9;
                } else {
                    str4 = str3;
                }
                objArr2[3] = str4;
                if (jSONObject == null) {
                    str5 = str9;
                } else {
                    str5 = jSONObject.toString();
                }
                objArr2[4] = str5;
                if (jSONObject2 != null) {
                    str9 = jSONObject2.toString();
                }
                objArr2[5] = str9;
                Log.d("BizTrafficStats", String.format("trafficBytes: %d, sourceId: %s, business: %s, scene: %s, extraStatus: %s, extraLog: %s", objArr2));
            }
            this.f9510f += j;
        }
    }
}
