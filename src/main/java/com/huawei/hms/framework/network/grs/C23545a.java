package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.local.model.CountryCodeBean;
import com.huawei.hms.framework.network.grs.p1013a.C23548a;
import com.huawei.hms.framework.network.grs.p1013a.C23549b;
import com.huawei.hms.framework.network.grs.p1014b.C23553b;
import com.huawei.hms.framework.network.grs.p1015c.C23568e;
import com.huawei.hms.framework.network.grs.p1015c.C23575l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.framework.network.grs.a */
public class C23545a {

    /* renamed from: a */
    private static final String f58032a = "a";

    /* renamed from: b */
    private GrsBaseInfo f58033b;

    /* renamed from: c */
    private C23548a f58034c;

    /* renamed from: d */
    private C23575l f58035d;

    /* access modifiers changed from: private */
    /* renamed from: com.huawei.hms.framework.network.grs.a$a */
    public static class C23546a implements AbstractC23551b {

        /* renamed from: a */
        String f58036a;

        /* renamed from: b */
        Map<String, String> f58037b;

        /* renamed from: c */
        IQueryUrlsCallBack f58038c;

        C23546a(String str, Map<String, String> map, IQueryUrlsCallBack iQueryUrlsCallBack) {
            this.f58036a = str;
            this.f58037b = map;
            this.f58038c = iQueryUrlsCallBack;
        }

        @Override // com.huawei.hms.framework.network.grs.AbstractC23551b
        /* renamed from: a */
        public void mo82838a() {
            Map<String, String> map = this.f58037b;
            if (map == null || map.isEmpty()) {
                this.f58038c.onCallBackFail(-3);
            } else {
                this.f58038c.onCallBackSuccess(this.f58037b);
            }
        }

        @Override // com.huawei.hms.framework.network.grs.AbstractC23551b
        /* renamed from: a */
        public void mo82839a(C23568e eVar) {
            Map<String, String> a = C23545a.m85383a(eVar.mo82905i(), this.f58036a);
            if (!a.isEmpty()) {
                this.f58038c.onCallBackSuccess(a);
                return;
            }
            Map<String, String> map = this.f58037b;
            if (map == null || map.isEmpty()) {
                this.f58038c.onCallBackFail(-5);
            } else {
                this.f58038c.onCallBackSuccess(this.f58037b);
            }
        }
    }

    /* renamed from: com.huawei.hms.framework.network.grs.a$b */
    private static class C23547b implements AbstractC23551b {

        /* renamed from: a */
        String f58039a;

        /* renamed from: b */
        String f58040b;

        /* renamed from: c */
        IQueryUrlCallBack f58041c;

        /* renamed from: d */
        String f58042d;

        C23547b(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, String str3) {
            this.f58039a = str;
            this.f58040b = str2;
            this.f58041c = iQueryUrlCallBack;
            this.f58042d = str3;
        }

        @Override // com.huawei.hms.framework.network.grs.AbstractC23551b
        /* renamed from: a */
        public void mo82838a() {
            if (!TextUtils.isEmpty(this.f58042d)) {
                this.f58041c.onCallBackSuccess(this.f58042d);
            } else {
                this.f58041c.onCallBackFail(-3);
            }
        }

        @Override // com.huawei.hms.framework.network.grs.AbstractC23551b
        /* renamed from: a */
        public void mo82839a(C23568e eVar) {
            String a = C23545a.m85380a(eVar.mo82905i(), this.f58039a, this.f58040b);
            if (!TextUtils.isEmpty(a)) {
                this.f58041c.onCallBackSuccess(a);
            } else if (!TextUtils.isEmpty(this.f58042d)) {
                this.f58041c.onCallBackSuccess(this.f58042d);
            } else {
                this.f58041c.onCallBackFail(-5);
            }
        }
    }

    public C23545a(GrsBaseInfo grsBaseInfo, C23548a aVar, C23575l lVar) {
        this.f58033b = grsBaseInfo;
        this.f58034c = aVar;
        this.f58035d = lVar;
    }

    /* renamed from: a */
    public static CountryCodeBean m85378a(Context context, boolean z) {
        return new CountryCodeBean(context, z);
    }

    /* renamed from: a */
    private String m85379a(String str, String str2, C23549b bVar, Context context) {
        String a = this.f58034c.mo82840a(this.f58033b, str, str2, bVar, context);
        if (TextUtils.isEmpty(a)) {
            return C23553b.m85431a(context.getPackageName(), this.f58033b).mo82867a(this.f58033b, str, str2);
        }
        Logger.m85371i(f58032a, "get url from sp is not empty.");
        return a;
    }

    /* renamed from: a */
    public static String m85380a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new JSONObject(str).getJSONObject(str2).getString(str3);
        } catch (JSONException e) {
            Logger.m85376w(f58032a, "Method{getServiceNameUrl} query url from SP occur an JSONException", e);
            return "";
        }
    }

    /* renamed from: a */
    public static Map<String, Map<String, String>> m85381a(String str) {
        HashMap hashMap = new HashMap(16);
        if (TextUtils.isEmpty(str)) {
            Logger.m85373v(f58032a, "isSpExpire jsonValue is null.");
            return hashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                hashMap.put(obj, m85384a(jSONObject.getJSONObject(obj)));
            }
            return hashMap;
        } catch (JSONException e) {
            Logger.m85376w(f58032a, "getServicesUrlsMap occur a JSONException", e);
            return hashMap;
        }
    }

    /* renamed from: a */
    private Map<String, String> m85382a(String str, C23549b bVar, Context context) {
        Map<String, String> a = this.f58034c.mo82841a(this.f58033b, str, bVar, context);
        return (a == null || a.isEmpty()) ? C23553b.m85431a(context.getPackageName(), this.f58033b).mo82868a(this.f58033b, str) : a;
    }

    /* renamed from: a */
    public static Map<String, String> m85383a(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            Logger.m85373v(f58032a, "isSpExpire jsonValue is null.");
            return hashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject(str2);
            if (jSONObject == null) {
                Logger.m85373v(f58032a, "getServiceNameUrls jsObject null.");
                return hashMap;
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                hashMap.put(obj, jSONObject.get(obj).toString());
            }
            return hashMap;
        } catch (JSONException e) {
            Logger.m85376w(f58032a, "Method{getServiceNameUrls} query url from SP occur an JSONException", e);
            return hashMap;
        }
    }

    /* renamed from: a */
    public static Map<String, String> m85384a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap(16);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                hashMap.put(obj, jSONObject.get(obj).toString());
            }
            return hashMap;
        } catch (JSONException e) {
            Logger.m85376w(f58032a, "getServiceUrls occur a JSONException", e);
            return hashMap;
        }
    }

    /* renamed from: a */
    private void m85385a(String str, Map<String, String> map, IQueryUrlsCallBack iQueryUrlsCallBack, Context context) {
        this.f58035d.mo82916a(this.f58033b, context, new C23546a(str, map, iQueryUrlsCallBack), str);
    }

    /* renamed from: a */
    public String mo82833a(Context context, String str) {
        C23568e a = this.f58035d.mo82915a(this.f58033b, context, str);
        return a == null ? "" : a.mo82905i();
    }

    /* renamed from: a */
    public String mo82834a(String str, String str2, Context context) {
        C23549b bVar = new C23549b();
        String a = m85379a(str, str2, bVar, context);
        if (bVar.mo82846a()) {
            Logger.m85374v(f58032a, "get unexpired cache localUrl{%s}", a);
            return a;
        }
        String a2 = m85380a(mo82833a(context, str), str, str2);
        if (TextUtils.isEmpty(a2)) {
            return a;
        }
        Logger.m85371i(f58032a, "get url is from remote server");
        return a2;
    }

    /* renamed from: a */
    public Map<String, String> mo82835a(String str, Context context) {
        C23549b bVar = new C23549b();
        Map<String, String> a = m85382a(str, bVar, context);
        if (bVar.mo82846a()) {
            return a;
        }
        Map<String, String> a2 = m85383a(mo82833a(context, str), str);
        return !a2.isEmpty() ? a2 : a;
    }

    /* renamed from: a */
    public void mo82836a(String str, IQueryUrlsCallBack iQueryUrlsCallBack, Context context) {
        C23549b bVar = new C23549b();
        Map<String, String> a = m85382a(str, bVar, context);
        if (!bVar.mo82846a()) {
            m85385a(str, a, iQueryUrlsCallBack, context);
        } else if (a == null || a.isEmpty()) {
            iQueryUrlsCallBack.onCallBackFail(-5);
        } else {
            iQueryUrlsCallBack.onCallBackSuccess(a);
        }
    }

    /* renamed from: a */
    public void mo82837a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, Context context) {
        C23549b bVar = new C23549b();
        String a = m85379a(str, str2, bVar, context);
        if (!bVar.mo82846a()) {
            this.f58035d.mo82916a(this.f58033b, context, new C23547b(str, str2, iQueryUrlCallBack, a), str);
        } else if (TextUtils.isEmpty(a)) {
            iQueryUrlCallBack.onCallBackFail(-5);
        } else {
            iQueryUrlCallBack.onCallBackSuccess(a);
        }
    }
}
