package com.bytedance.apm6.foundation.p182a;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.apm.p138d.AbstractC2917d;
import com.bytedance.apm6.p187i.C3336c;
import com.bytedance.apm6.util.C3345a;
import com.bytedance.services.apm.api.C20697b;
import com.bytedance.services.apm.api.IHttpService;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.foundation.a.a */
public class C3318a extends C3345a {

    /* renamed from: a */
    private static AbstractC3319b f10587a = null;

    /* renamed from: b */
    private static String f10588b = null;

    /* renamed from: c */
    private static Boolean f10589c = null;

    /* renamed from: d */
    private static String f10590d = null;

    /* renamed from: e */
    private static int f10591e = -1;

    /* renamed from: f */
    private static String f10592f = null;

    /* renamed from: g */
    private static int f10593g = -1;

    /* renamed from: h */
    private static String f10594h = null;

    /* renamed from: i */
    private static String f10595i = null;

    /* renamed from: j */
    private static long f10596j = -1;

    /* renamed from: k */
    private static long f10597k = 0;

    /* renamed from: l */
    private static int f10598l = -1;

    /* renamed from: m */
    private static JSONObject f10599m = null;

    /* renamed from: n */
    private static Map<String, String> f10600n = null;

    /* renamed from: o */
    private static long f10601o = -1;

    /* renamed from: p */
    private static AbstractC2917d f10602p;

    /* renamed from: a */
    public static AbstractC2917d m13817a() {
        return f10602p;
    }

    /* renamed from: b */
    public static AbstractC3319b m13822b() {
        return f10587a;
    }

    /* renamed from: s */
    public static long m13841s() {
        return f10601o;
    }

    /* renamed from: g */
    public static int m13829g() {
        return f10587a.mo13068c();
    }

    /* renamed from: p */
    public static String m13838p() {
        return f10587a.mo13069d();
    }

    /* renamed from: q */
    public static String m13839q() {
        return f10587a.mo13071f();
    }

    /* renamed from: r */
    public static long m13840r() {
        return f10587a.mo13070e();
    }

    /* renamed from: c */
    public static long m13824c() {
        if (f10596j < 0) {
            f10596j = System.currentTimeMillis();
        }
        return f10596j;
    }

    /* renamed from: d */
    public static long m13826d() {
        if (f10597k <= 0) {
            f10597k = System.currentTimeMillis();
        }
        return f10597k;
    }

    /* renamed from: f */
    public static String m13828f() {
        if (f10588b == null) {
            synchronized (C3318a.class) {
                if (f10588b == null) {
                    f10588b = f10587a.mo13072g();
                }
            }
        }
        return f10588b;
    }

    /* renamed from: h */
    public static String m13830h() {
        if (f10590d == null) {
            synchronized (C3318a.class) {
                if (f10590d == null) {
                    f10590d = f10587a.mo13073h();
                }
            }
        }
        return f10590d;
    }

    /* renamed from: i */
    public static int m13831i() {
        if (f10591e == -1) {
            synchronized (C3318a.class) {
                if (f10591e == -1) {
                    f10591e = f10587a.mo13074i();
                }
            }
        }
        return f10591e;
    }

    /* renamed from: k */
    public static int m13833k() {
        if (f10593g == -1) {
            synchronized (C3318a.class) {
                if (f10593g == -1) {
                    f10593g = f10587a.mo13076k();
                }
            }
        }
        return f10593g;
    }

    /* renamed from: n */
    public static String m13836n() {
        if (f10598l == -1) {
            synchronized (C3318a.class) {
                if (f10598l == -1) {
                    f10598l = f10587a.mo13079n();
                }
            }
        }
        return String.valueOf(f10598l);
    }

    /* renamed from: o */
    public static JSONObject m13837o() {
        if (f10599m == null) {
            synchronized (C3318a.class) {
                if (f10599m == null) {
                    f10599m = f10587a.mo13082q();
                }
            }
        }
        return f10599m;
    }

    /* renamed from: j */
    public static String m13832j() {
        if (TextUtils.isEmpty(f10592f)) {
            synchronized (C3318a.class) {
                if (TextUtils.isEmpty(f10592f)) {
                    f10592f = f10587a.mo13075j();
                }
            }
        }
        return f10592f;
    }

    /* renamed from: l */
    public static String m13834l() {
        if (TextUtils.isEmpty(f10594h)) {
            synchronized (C3318a.class) {
                if (TextUtils.isEmpty(f10594h)) {
                    f10594h = f10587a.mo13077l();
                }
            }
        }
        return f10594h;
    }

    /* renamed from: m */
    public static String m13835m() {
        if (TextUtils.isEmpty(f10595i)) {
            synchronized (C3318a.class) {
                if (TextUtils.isEmpty(f10595i)) {
                    f10595i = f10587a.mo13078m();
                }
            }
        }
        return f10595i;
    }

    /* renamed from: e */
    public static boolean m13827e() {
        if (f10589c == null) {
            synchronized (C3318a.class) {
                if (f10589c == null) {
                    String f = m13828f();
                    boolean z = false;
                    if (f == null || !f.contains(":")) {
                        if (f != null && f.equals(m13917w().getPackageName())) {
                            z = true;
                        }
                        f10589c = Boolean.valueOf(z);
                    } else {
                        f10589c = false;
                    }
                }
            }
        }
        return f10589c.booleanValue();
    }

    /* renamed from: t */
    public static Map<String, String> m13842t() {
        if (f10600n == null) {
            HashMap hashMap = new HashMap();
            f10600n = hashMap;
            hashMap.put("aid", String.valueOf(m13829g()));
            f10600n.put("os", "Android");
            f10600n.put("device_platform", "android");
            Map<String, String> map = f10600n;
            map.put("os_api", Build.VERSION.SDK_INT + "");
            f10600n.put("update_version_code", String.valueOf(m13831i()));
            f10600n.put("version_code", m13834l());
            f10600n.put("channel", m13830h());
            f10600n.put("device_model", Build.MODEL);
            f10600n.put("device_brand", Build.BRAND);
        }
        f10600n.put("device_id", m13838p());
        if (m13915u()) {
            f10600n.put("_log_level", "debug");
        }
        try {
            Map<String, String> s = m13822b().mo13084s();
            if (s != null && s.size() > 0) {
                for (Map.Entry<String, String> entry : s.entrySet()) {
                    f10600n.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable unused) {
        }
        return f10600n;
    }

    /* renamed from: c */
    public static void m13825c(long j) {
        f10601o = j;
    }

    /* renamed from: a */
    public static void m13819a(long j) {
        f10597k = j;
    }

    /* renamed from: b */
    public static void m13823b(long j) {
        f10596j = j;
    }

    /* renamed from: a */
    public static void m13820a(AbstractC2917d dVar) {
        f10602p = dVar;
    }

    /* renamed from: a */
    public static void m13821a(AbstractC3319b bVar) {
        if (bVar != null) {
            f10587a = bVar;
            C3345a.m13912a(bVar.mo13067b());
            return;
        }
        throw new IllegalArgumentException("apmAdapter cannot be null!");
    }

    /* renamed from: a */
    public static C20697b m13818a(String str, Map<String, String> map, byte[] bArr) throws Exception {
        return ((IHttpService) C3336c.m13901a(IHttpService.class)).doPost(str, bArr, map);
    }
}
