package com.bytedance.apm;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.apm.core.AbstractC2908b;
import com.bytedance.apm.core.C2907a;
import com.bytedance.apm.net.DefaultHttpServiceImpl;
import com.bytedance.apm.util.C3111a;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.services.apm.api.C20697b;
import com.bytedance.services.apm.api.IHttpService;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.b */
public class C2785b {

    /* renamed from: A */
    private static C2920e f8866A;

    /* renamed from: B */
    private static boolean f8867B = false;

    /* renamed from: C */
    private static AbstractC2877c f8868C = null;

    /* renamed from: a */
    private static Context f8869a;

    /* renamed from: b */
    private static boolean f8870b;

    /* renamed from: c */
    private static boolean f8871c;

    /* renamed from: d */
    private static boolean f8872d;

    /* renamed from: e */
    private static long f8873e;

    /* renamed from: f */
    private static long f8874f;

    /* renamed from: g */
    private static JSONObject f8875g = new JSONObject();

    /* renamed from: h */
    private static AbstractC2908b f8876h = new C2907a();

    /* renamed from: i */
    private static Map<String, String> f8877i = Collections.emptyMap();

    /* renamed from: j */
    private static IHttpService f8878j = new DefaultHttpServiceImpl();

    /* renamed from: k */
    private static long f8879k = -1;

    /* renamed from: l */
    private static volatile int f8880l = -1;

    /* renamed from: m */
    private static boolean f8881m = false;

    /* renamed from: n */
    private static long f8882n;

    /* renamed from: o */
    private static long f8883o;

    /* renamed from: p */
    private static long f8884p;

    /* renamed from: q */
    private static long f8885q;

    /* renamed from: r */
    private static String f8886r;

    /* renamed from: s */
    private static boolean f8887s;

    /* renamed from: t */
    private static boolean f8888t;

    /* renamed from: u */
    private static boolean f8889u;

    /* renamed from: v */
    private static long f8890v = 0;

    /* renamed from: w */
    private static boolean f8891w = true;

    /* renamed from: x */
    private static List<String> f8892x;

    /* renamed from: y */
    private static String f8893y;

    /* renamed from: z */
    private static boolean f8894z = true;

    /* renamed from: a */
    public static Context m11735a() {
        return f8869a;
    }

    /* renamed from: c */
    public static AbstractC2877c m11753c() {
        return f8868C;
    }

    /* renamed from: g */
    public static boolean m11766g() {
        return f8881m;
    }

    /* renamed from: i */
    public static int m11768i() {
        return f8880l;
    }

    /* renamed from: k */
    public static boolean m11770k() {
        return f8871c;
    }

    /* renamed from: o */
    public static JSONObject m11774o() {
        return f8875g;
    }

    /* renamed from: p */
    public static AbstractC2908b m11775p() {
        return f8876h;
    }

    /* renamed from: q */
    public static IHttpService m11776q() {
        return f8878j;
    }

    /* renamed from: s */
    public static long m11778s() {
        return f8882n;
    }

    /* renamed from: t */
    public static boolean m11779t() {
        return f8889u;
    }

    /* renamed from: u */
    public static long m11780u() {
        return f8873e;
    }

    /* renamed from: v */
    public static long m11781v() {
        return f8874f;
    }

    /* renamed from: w */
    public static boolean m11782w() {
        return f8888t;
    }

    /* renamed from: x */
    public static String m11783x() {
        return f8893y;
    }

    /* renamed from: a */
    public static void m11747a(boolean z) {
        f8867B = z;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00f5 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0129 A[Catch:{ Exception -> 0x01ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x015a A[Catch:{ Exception -> 0x01ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x016d A[Catch:{ Exception -> 0x01ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x019e A[Catch:{ Exception -> 0x01ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01cf A[Catch:{ Exception -> 0x01ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01e2 A[Catch:{ Exception -> 0x01ed }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m11746a(org.json.JSONObject r5) {
        /*
        // Method dump skipped, instructions count: 508
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.C2785b.m11746a(org.json.JSONObject):void");
    }

    /* renamed from: a */
    public static boolean m11748a(String str, String str2) {
        JSONObject jSONObject = f8875g;
        if (jSONObject == null) {
            return false;
        }
        try {
            jSONObject.put(str, str2);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m11745a(List<String> list) {
        f8892x = list;
    }

    /* renamed from: j */
    public static boolean m11769j() {
        if (f8870b || f8872d) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static synchronized C2920e m11772m() {
        C2920e eVar;
        synchronized (C2785b.class) {
            eVar = f8866A;
        }
        return eVar;
    }

    /* renamed from: n */
    public static synchronized Map<String, String> m11773n() {
        Map<String, String> map;
        synchronized (C2785b.class) {
            map = f8877i;
        }
        return map;
    }

    /* renamed from: b */
    public static boolean m11752b() {
        return f8891w;
    }

    /* renamed from: d */
    public static String m11756d() {
        if (TextUtils.isEmpty(f8886r)) {
            f8886r = C3111a.m12935a(Process.myPid());
        }
        return f8886r;
    }

    /* renamed from: f */
    public static boolean m11764f() {
        String d;
        if (!f8887s && (d = m11756d()) != null && d.contains(":")) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static long m11767h() {
        if (f8879k == -1) {
            f8879k = System.currentTimeMillis();
        }
        return f8879k;
    }

    /* renamed from: l */
    public static boolean m11771l() {
        JSONObject jSONObject = f8875g;
        if (jSONObject == null || jSONObject.optString("channel") == null) {
            return false;
        }
        return f8875g.optString("channel").contains("local");
    }

    /* renamed from: r */
    public static long m11777r() {
        if (f8883o == 0) {
            f8883o = System.currentTimeMillis();
        }
        return f8883o;
    }

    /* renamed from: e */
    public static boolean m11761e() {
        boolean z = true;
        if (f8887s) {
            return true;
        }
        if (f8869a == null) {
            return m11764f();
        }
        String d = m11756d();
        if (d == null || !d.contains(":")) {
            if (d == null || !d.equals(f8869a.getPackageName())) {
                z = false;
            }
            f8887s = z;
        } else {
            f8887s = false;
        }
        return f8887s;
    }

    /* renamed from: b */
    public static void m11749b(long j) {
        f8874f = j;
    }

    /* renamed from: d */
    public static void m11757d(long j) {
        f8883o = j;
    }

    /* renamed from: e */
    public static void m11759e(long j) {
        f8884p = j;
    }

    /* renamed from: f */
    public static void m11762f(long j) {
        f8885q = j;
    }

    /* renamed from: b */
    public static void m11750b(String str) {
        f8893y = str;
    }

    /* renamed from: d */
    public static void m11758d(boolean z) {
        f8871c = z;
    }

    /* renamed from: e */
    public static void m11760e(boolean z) {
        f8889u = z;
    }

    /* renamed from: f */
    public static void m11763f(boolean z) {
        f8888t = z;
    }

    /* renamed from: b */
    public static void m11751b(boolean z) {
        f8881m = z;
    }

    /* renamed from: c */
    public static void m11755c(boolean z) {
        f8870b = z;
        C3318a.m13913a(m11769j());
    }

    /* renamed from: g */
    public static void m11765g(long j) {
        if (j > 0) {
            long j2 = f8882n;
            if (j2 == 0 || j < j2) {
                f8882n = j;
            }
        }
    }

    /* renamed from: a */
    public static void m11739a(int i) {
        f8880l = i;
    }

    /* renamed from: a */
    public static void m11740a(long j) {
        f8873e = j;
    }

    /* renamed from: c */
    public static String m11754c(long j) {
        long j2 = j - f8883o;
        if (j2 < 30000) {
            return "0 - 30s";
        }
        if (j2 < 60000) {
            return "30s - 1min";
        }
        if (j2 < 120000) {
            return "1min - 2min";
        }
        if (j2 < 300000) {
            return "2min - 5min";
        }
        if (j2 < 600000) {
            return "5min - 10min";
        }
        if (j2 < 1800000) {
            return "10min - 30min";
        }
        if (j2 < 3600000) {
            return "30min - 1h";
        }
        return "1h - ";
    }

    /* renamed from: a */
    public static void m11741a(Context context) {
        if (context != null) {
            f8869a = C3111a.m12934a(context);
        }
    }

    /* renamed from: a */
    public static synchronized void m11742a(AbstractC2908b bVar) {
        synchronized (C2785b.class) {
            f8876h = bVar;
            Map<String, String> a = bVar.mo12551a();
            f8877i = a;
            if (a == null) {
                f8877i = new HashMap();
            }
            if (!f8877i.containsKey("aid")) {
                f8877i.put("aid", f8875g.optString("aid"));
            }
            if (!f8877i.containsKey("device_id")) {
                f8877i.put("device_id", f8875g.optString("device_id"));
            }
            if (!f8877i.containsKey("device_platform")) {
                f8877i.put("device_platform", "android");
            }
            f8877i.put("os", "Android");
            if (!f8877i.containsKey("update_version_code")) {
                f8877i.put("update_version_code", f8875g.optString("update_version_code"));
            }
            if (!f8877i.containsKey("version_code")) {
                f8877i.put("version_code", f8875g.optString("version_code"));
            }
            if (!f8877i.containsKey("channel")) {
                f8877i.put("channel", f8875g.optString("channel"));
            }
            if (!f8877i.containsKey("os_api")) {
                Map<String, String> map = f8877i;
                map.put("os_api", Build.VERSION.SDK_INT + "");
            }
            if (m11769j() && !f8877i.containsKey("_log_level")) {
                f8877i.put("_log_level", "debug");
            }
            if (f8866A == null) {
                f8866A = new C2920e();
            }
            f8866A.mo12605a(new HashMap(f8877i));
        }
    }

    /* renamed from: a */
    public static void m11743a(IHttpService iHttpService) {
        if (iHttpService != null) {
            f8878j = iHttpService;
        }
    }

    /* renamed from: a */
    public static void m11744a(String str) {
        f8886r = str;
    }

    /* renamed from: a */
    public static C20697b m11737a(String str, Map<String, String> map) throws Exception {
        return f8878j.doGet(str, map);
    }

    /* renamed from: a */
    public static C20697b m11736a(String str, List<File> list, Map<String, String> map) throws Exception {
        return f8878j.uploadFiles(str, list, map);
    }

    /* renamed from: a */
    public static C20697b m11738a(String str, byte[] bArr, Map<String, String> map) throws Exception {
        return f8878j.doPost(str, bArr, map);
    }
}
