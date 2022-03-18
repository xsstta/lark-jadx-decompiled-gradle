package com.bytedance.crash.runtime;

import android.content.Context;
import com.bytedance.crash.C3691b;
import com.bytedance.crash.C3722c;
import com.bytedance.crash.ICommonParams;
import com.bytedance.crash.util.C3955q;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.runtime.d */
public class C3850d {

    /* renamed from: d */
    private static JSONObject f11821d;

    /* renamed from: a */
    private final Context f11822a;

    /* renamed from: b */
    private final ICommonParams f11823b;

    /* renamed from: c */
    private final ICommonParams f11824c;

    /* renamed from: c */
    public ICommonParams mo15458c() {
        return this.f11823b;
    }

    /* renamed from: d */
    public String mo15459d() {
        try {
            return this.f11823b.getDeviceId();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: f */
    public String mo15461f() {
        try {
            return this.f11823b.getSessionId();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: g */
    public long mo15462g() {
        try {
            return this.f11823b.getUserId();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: e */
    public String mo15460e() {
        try {
            return String.valueOf(this.f11823b.getCommonParams().get("aid"));
        } catch (Throwable unused) {
            return "4444";
        }
    }

    /* renamed from: a */
    public Map<String, Object> mo15456a() {
        Map<String, Object> b = mo15457b();
        if (m15953a(b, "aid") == null) {
            b.put("aid", 4444);
        }
        return b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054 A[SYNTHETIC, Splitter:B:25:0x0054] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c2 A[SYNTHETIC, Splitter:B:41:0x00c2] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0115  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, java.lang.Object> mo15457b() {
        /*
        // Method dump skipped, instructions count: 308
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.runtime.C3850d.mo15457b():java.util.Map");
    }

    /* renamed from: a */
    public static boolean m15956a(Map<String, Object> map) {
        if (map == null || map.isEmpty() || ((!map.containsKey("app_version") && !map.containsKey("version_name")) || !map.containsKey("version_code") || !map.containsKey("update_version_code"))) {
            return true;
        }
        return false;
    }

    public C3850d(Context context, ICommonParams iCommonParams) {
        this(context, iCommonParams, null);
    }

    /* renamed from: a */
    private static String m15953a(Map<String, Object> map, String str) {
        Object obj;
        if (map == null || (obj = map.get(str)) == null) {
            return null;
        }
        return String.valueOf(obj);
    }

    /* renamed from: a */
    public static Map<String, String> m15955a(JSONObject jSONObject, String... strArr) {
        return m15954a(C3955q.m16458c(jSONObject), strArr);
    }

    /* renamed from: a */
    public static Map<String, String> m15954a(Map<String, Object> map, String... strArr) {
        HashMap hashMap = new HashMap();
        if (strArr == null || strArr.length == 0 || strArr.length % 2 != 0) {
            C3722c a = C3691b.m15203a();
            a.mo15177a("NPTH_CATCH", new IllegalArgumentException("err keysWithDefaultValue:" + strArr));
            return hashMap;
        }
        for (int i = 0; i < strArr.length; i += 2) {
            String str = strArr[i];
            Object obj = map.get(str);
            if (obj == null) {
                hashMap.put(str, strArr[i + 1]);
            } else {
                hashMap.put(str, String.valueOf(obj));
            }
        }
        return hashMap;
    }

    public C3850d(Context context, ICommonParams iCommonParams, C3850d dVar) {
        ICommonParams iCommonParams2;
        this.f11822a = context;
        this.f11823b = iCommonParams;
        if (dVar == null) {
            iCommonParams2 = null;
        } else {
            iCommonParams2 = dVar.f11823b;
        }
        this.f11824c = iCommonParams2;
    }
}
