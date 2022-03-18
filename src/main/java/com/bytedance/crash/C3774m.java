package com.bytedance.crash;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.crash.entity.C3746e;
import com.bytedance.crash.runtime.C3850d;
import com.bytedance.crash.runtime.C3856h;
import com.bytedance.crash.runtime.C3878r;
import com.bytedance.crash.runtime.ConfigManager;
import com.bytedance.crash.util.C3954p;
import com.bytedance.crash.util.C3955q;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.m */
public final class C3774m {

    /* renamed from: a */
    private static Context f11610a = null;

    /* renamed from: b */
    private static Application f11611b = null;

    /* renamed from: c */
    private static long f11612c = 0;

    /* renamed from: d */
    private static long f11613d = 0;

    /* renamed from: e */
    private static String f11614e = "default";

    /* renamed from: f */
    private static boolean f11615f;

    /* renamed from: g */
    private static C3850d f11616g;

    /* renamed from: h */
    private static final ConfigManager f11617h = new ConfigManager();

    /* renamed from: i */
    private static final AppDataCenter f11618i = new AppDataCenter();

    /* renamed from: j */
    private static volatile ConcurrentHashMap<Integer, String> f11619j;

    /* renamed from: k */
    private static final JSONObject f11620k = new JSONObject();

    /* renamed from: l */
    private static C3878r f11621l;

    /* renamed from: m */
    private static volatile String f11622m;

    /* renamed from: n */
    private static final Object f11623n = new Object();

    /* renamed from: o */
    private static volatile int f11624o;

    /* renamed from: p */
    private static volatile String f11625p;

    /* renamed from: q */
    private static long f11626q = -1;

    /* renamed from: r */
    private static boolean f11627r = false;

    /* renamed from: s */
    private static String f11628s;

    /* renamed from: b */
    public static long m15600b() {
        return f11626q;
    }

    /* renamed from: c */
    public static AppDataCenter m15602c() {
        return f11618i;
    }

    /* renamed from: j */
    public static Context m15609j() {
        return f11610a;
    }

    /* renamed from: k */
    public static Application m15610k() {
        return f11611b;
    }

    /* renamed from: l */
    public static ConfigManager m15611l() {
        return f11617h;
    }

    /* renamed from: m */
    public static long m15612m() {
        return f11612c;
    }

    /* renamed from: n */
    public static long m15613n() {
        return f11613d;
    }

    /* renamed from: o */
    public static String m15614o() {
        return f11614e;
    }

    /* renamed from: p */
    public static boolean m15615p() {
        return f11615f;
    }

    /* renamed from: q */
    public static ConcurrentHashMap<Integer, String> m15616q() {
        return f11619j;
    }

    /* renamed from: r */
    public static JSONObject m15617r() {
        return f11620k;
    }

    /* renamed from: s */
    public static int m15618s() {
        return f11624o;
    }

    /* renamed from: t */
    public static String m15619t() {
        return f11625p;
    }

    /* renamed from: a */
    public static C3850d m15591a() {
        if (f11616g == null) {
            f11616g = C3856h.m15985a(f11610a);
        }
        return f11616g;
    }

    /* renamed from: e */
    public static boolean m15604e() {
        return m15620u().contains("test_crash");
    }

    /* renamed from: d */
    public static C3878r m15603d() {
        if (f11621l == null) {
            synchronized (C3774m.class) {
                f11621l = new C3878r(f11610a);
            }
        }
        return f11621l;
    }

    /* renamed from: g */
    public static String m15606g() {
        if (f11622m == null) {
            synchronized (f11623n) {
                if (f11622m == null) {
                    f11622m = m15607h();
                }
            }
        }
        return f11622m;
    }

    /* renamed from: u */
    private static String m15620u() {
        Object obj = m15591a().mo15456a().get("channel");
        if (obj == null) {
            return "unknown";
        }
        return String.valueOf(obj);
    }

    /* renamed from: f */
    public static String m15605f() {
        return m15606g() + '_' + Long.toHexString(new Random().nextLong()) + "G";
    }

    /* renamed from: h */
    public static String m15607h() {
        return Long.toHexString(new Random().nextLong()) + '-' + m15612m() + '-' + Process.myPid() + "G";
    }

    /* renamed from: i */
    public static String m15608i() {
        if (f11628s == null) {
            synchronized (C3774m.class) {
                if (f11628s == null) {
                    f11628s = C3746e.m15493e().optString("bytrace_id_prefix", String.valueOf(UUID.randomUUID())) + "-" + Process.myPid();
                }
            }
        }
        return f11628s;
    }

    /* renamed from: a */
    static void m15597a(String str) {
        f11614e = str;
    }

    /* renamed from: a */
    public static void m15594a(Application application) {
        if (application != null) {
            f11611b = application;
        }
    }

    /* renamed from: a */
    static void m15599a(boolean z) {
        f11615f = z;
    }

    /* renamed from: b */
    static void m15601b(int i, String str) {
        f11624o = i;
        f11625p = str;
    }

    /* renamed from: a */
    public static void m15595a(Application application, Context context) {
        if (f11611b == null || f11610a == null) {
            f11612c = System.currentTimeMillis();
            f11613d = SystemClock.uptimeMillis();
            f11610a = context;
            f11611b = application;
            f11622m = m15606g();
        }
    }

    /* renamed from: a */
    static void m15593a(int i, String str) {
        if (f11619j == null) {
            synchronized (C3774m.class) {
                if (f11619j == null) {
                    f11619j = new ConcurrentHashMap<>();
                }
            }
        }
        f11619j.put(Integer.valueOf(i), str);
    }

    /* renamed from: a */
    public static void m15598a(String str, String str2) {
        C3955q.m16447a(f11620k, str, str2);
    }

    /* renamed from: a */
    static void m15596a(Application application, Context context, ICommonParams iCommonParams) {
        if (!f11627r) {
            m15595a(application, context);
            f11616g = new C3850d(f11610a, iCommonParams, m15591a());
            f11627r = true;
        }
    }

    /* renamed from: a */
    public static String m15592a(long j, CrashType crashType, boolean z, boolean z2) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("_");
        sb.append(crashType.getName());
        sb.append('_');
        sb.append(m15606g());
        sb.append('_');
        String str3 = "normal_";
        if (z) {
            str = "oom_";
        } else {
            str = str3;
        }
        sb.append(str);
        sb.append(m15612m());
        sb.append('_');
        if (z2) {
            str2 = "ignore_";
        } else {
            str2 = str3;
        }
        sb.append(str2);
        if (C3954p.m16441b()) {
            str3 = "nospace_";
        }
        sb.append(str3);
        sb.append(Long.toHexString(new Random().nextLong()));
        sb.append("G");
        return sb.toString();
    }
}
