package com.bytedance.apm6.p160b.p161a.p165d;

import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p160b.p161a.C3159a;
import com.bytedance.apm6.p160b.p161a.p163b.C3163a;
import com.bytedance.apm6.p160b.p161a.p163b.C3164b;
import com.bytedance.apm6.p160b.p161a.p163b.C3169d;
import com.bytedance.apm6.p187i.C3336c;
import com.bytedance.apm6.p187i.p193f.AbstractC3344a;
import com.bytedance.apm6.util.C3348b;
import com.bytedance.apm6.util.C3356f;
import com.bytedance.apm6.util.C3359i;
import com.bytedance.apm6.util.p195b.C3350b;
import com.google.firebase.messaging.Constants;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.apm6.b.a.d.f */
public interface AbstractC3198f {
    /* renamed from: a */
    String mo13274a();

    /* renamed from: a */
    byte[] mo13275a(HashMap<Long, JSONArray> hashMap);

    /* renamed from: b */
    List<String> mo13276b();

    /* renamed from: com.bytedance.apm6.b.a.d.f$a */
    public static class C3199a implements AbstractC3198f {
        @Override // com.bytedance.apm6.p160b.p161a.p165d.AbstractC3198f
        /* renamed from: a */
        public String mo13274a() {
            return ApiHandler.API_CALLBACK_EXCEPTION;
        }

        @Override // com.bytedance.apm6.p160b.p161a.p165d.AbstractC3198f
        /* renamed from: b */
        public List<String> mo13276b() {
            return C3190c.m13326a().mo13265k();
        }

        @Override // com.bytedance.apm6.p160b.p161a.p165d.AbstractC3198f
        /* renamed from: a */
        public byte[] mo13275a(HashMap<Long, JSONArray> hashMap) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                for (Long l : hashMap.keySet()) {
                    JSONArray jSONArray2 = hashMap.get(l);
                    if (jSONArray2 != null) {
                        for (int i = 0; i < jSONArray2.length(); i++) {
                            jSONArray.put(jSONArray2.get(i));
                        }
                    }
                }
                jSONObject.put("header", C3169d.m13259a(C3164b.m13245a().mo13196a(String.valueOf(C3169d.m13256a()))));
                jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONArray);
                return C3359i.m13991a(jSONObject.toString());
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: com.bytedance.apm6.b.a.d.f$b */
    public static class C3200b implements AbstractC3198f {
        @Override // com.bytedance.apm6.p160b.p161a.p165d.AbstractC3198f
        /* renamed from: a */
        public String mo13274a() {
            return "log";
        }

        @Override // com.bytedance.apm6.p160b.p161a.p165d.AbstractC3198f
        /* renamed from: b */
        public List<String> mo13276b() {
            return C3190c.m13326a().mo13263i();
        }

        @Override // com.bytedance.apm6.p160b.p161a.p165d.AbstractC3198f
        /* renamed from: a */
        public byte[] mo13275a(HashMap<Long, JSONArray> hashMap) {
            C3163a a;
            try {
                JSONArray jSONArray = new JSONArray();
                for (Long l : hashMap.keySet()) {
                    C3163a a2 = C3164b.m13245a().mo13196a(String.valueOf(l));
                    if (a2 != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, hashMap.get(l));
                        jSONObject.put("header", C3169d.m13259a(a2));
                        jSONArray.put(jSONObject);
                    } else if (C3318a.m13915u()) {
                        String str = C3159a.f10110a;
                        C3350b.m13936c(str, "HeaderInfo null for key " + l);
                    }
                }
                JSONArray b = C3187b.m13320a().mo13248b();
                if (!(b == null || b.length() <= 0 || (a = C3164b.m13245a().mo13196a(String.valueOf(C3169d.m13256a()))) == null)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, b);
                    jSONObject2.put("header", C3169d.m13259a(a));
                    jSONArray.put(jSONObject2);
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("list", jSONArray);
                if (C3318a.m13915u()) {
                    String str2 = C3159a.f10110a;
                    C3350b.m13932a(str2, "request:" + jSONObject3);
                }
                AbstractC3344a aVar = (AbstractC3344a) C3336c.m13901a(AbstractC3344a.class);
                if (aVar != null) {
                    jSONObject3 = aVar.mo13573a(jSONObject3);
                }
                return C3359i.m13991a(jSONObject3.toString());
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: com.bytedance.apm6.b.a.d.f$c */
    public static class C3201c implements AbstractC3198f {
        @Override // com.bytedance.apm6.p160b.p161a.p165d.AbstractC3198f
        /* renamed from: a */
        public String mo13274a() {
            return "trace";
        }

        @Override // com.bytedance.apm6.p160b.p161a.p165d.AbstractC3198f
        /* renamed from: b */
        public List<String> mo13276b() {
            return C3190c.m13326a().mo13264j();
        }

        @Override // com.bytedance.apm6.p160b.p161a.p165d.AbstractC3198f
        /* renamed from: a */
        public byte[] mo13275a(HashMap<Long, JSONArray> hashMap) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                for (Long l : hashMap.keySet()) {
                    JSONArray jSONArray2 = hashMap.get(l);
                    if (jSONArray2 != null) {
                        for (int i = 0; i < jSONArray2.length(); i++) {
                            try {
                                List<Object> a = C3348b.m13923a(jSONArray2.getJSONObject(i));
                                if (!C3356f.m13964a(a)) {
                                    for (Object obj : a) {
                                        jSONArray.put(obj);
                                        if (C3318a.m13915u()) {
                                            String str = C3159a.f10110a;
                                            C3350b.m13932a(str, ":" + obj);
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                C3350b.m13935b(C3159a.f10110a, "serialize", e);
                            }
                        }
                    }
                }
                if (C3318a.m13915u()) {
                    String str2 = C3159a.f10110a;
                    C3350b.m13932a(str2, "jsonArray:" + jSONArray);
                }
                jSONObject.put("header", C3169d.m13259a(C3164b.m13245a().mo13196a(String.valueOf(C3169d.m13256a()))));
                jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONArray);
                return C3359i.m13991a(jSONObject.toString());
            } catch (Exception unused) {
                return null;
            }
        }
    }
}
