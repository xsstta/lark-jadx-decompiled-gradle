package com.bytedance.crash.upload;

import android.os.Looper;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.entity.C3743c;
import com.bytedance.crash.runtime.C3840b;
import com.bytedance.crash.runtime.C3850d;
import com.bytedance.crash.runtime.C3851e;
import com.bytedance.crash.runtime.C3866n;
import com.bytedance.crash.runtime.p228b.C3842a;
import com.bytedance.crash.util.C3949m;
import com.bytedance.crash.util.C3962t;
import com.bytedance.crash.util.C3968x;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.upload.m */
public class C3919m {

    /* renamed from: a */
    private static File f12007a;

    /* renamed from: b */
    private static boolean f12008b;

    /* renamed from: c */
    private static boolean f12009c;

    /* renamed from: d */
    private static boolean f12010d;

    /* renamed from: e */
    private static final Runnable f12011e = new Runnable() {
        /* class com.bytedance.crash.upload.C3919m.RunnableC39212 */

        public void run() {
            C3866n.m16016b().mo15507a().removeCallbacks(this);
            if (C3919m.m16223a((String) null)) {
                C3886a.m16111a();
            }
        }
    };

    /* renamed from: f */
    private static Map<String, String> f12012f;

    /* renamed from: a */
    public static Thread m16219a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* renamed from: b */
    static boolean m16225b() {
        return f12008b;
    }

    /* renamed from: g */
    public static File m16230g() {
        return new File(C3962t.m16522p(C3774m.m15609j()), "npth/configCrash/");
    }

    /* renamed from: d */
    public static void m16227d() {
        if (!f12010d) {
            f12010d = true;
            boolean a = m16223a((String) null);
            m16226c();
            if (a) {
                C3968x.m16530a((Object) "start fetch apmConfig");
                C3886a.m16111a();
            }
        }
    }

    /* renamed from: f */
    public static boolean m16229f() {
        Map<String, String> map = f12012f;
        if (map == null || map.isEmpty() || f12012f.size() < C3743c.m15476b()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private static File m16231h() {
        if (f12007a == null) {
            f12007a = new File(C3962t.m16522p(C3774m.m15609j()), "npth/configCrash/configInvalid");
        }
        return f12007a;
    }

    /* renamed from: c */
    static void m16226c() {
        if (!f12008b) {
            f12009c = true;
            File file = new File(C3962t.m16522p(C3774m.m15609j()), "npth/configCrash/configFile");
            if (file.exists()) {
                try {
                    C3840b.m15876a(new JSONArray(C3949m.m16426e(file)), false);
                    f12008b = true;
                } catch (Throwable unused) {
                    C3840b.m15876a((JSONArray) null, false);
                }
            }
        }
    }

    /* renamed from: e */
    public static void m16228e() {
        try {
            m16227d();
            C3949m.m16404a(new File(C3962t.m16522p(C3774m.m15609j()), "npth/configCrash/configFile"), C3842a.m15914c(), false);
            C3949m.m16403a(m16231h(), f12012f);
        } catch (Throwable unused) {
        }
        C3968x.m16530a((Object) "success saveApmConfig");
    }

    /* renamed from: a */
    public static byte[] m16224a() {
        try {
            return CrashUploader.m16095a(C3774m.m15611l().getApmConfigUrl(), C3850d.m15954a(C3774m.m15591a().mo15457b(), "aid", "4444", "crash", "1", "os", "Android", "update_version_code", "000000", "channel", "unknown", "app_version", "0.0.0"));
        } catch (Throwable th) {
            C3968x.m16534a(th);
            return null;
        }
    }

    /* renamed from: a */
    public static void m16220a(long j) {
        C3866n.m16016b().mo15509a(f12011e, j);
    }

    /* renamed from: a */
    public static void m16222a(boolean z) {
        if (z) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            RunnableC39201 r0 = new Runnable() {
                /* class com.bytedance.crash.upload.C3919m.RunnableC39201 */

                public void run() {
                    byte[] a = C3919m.m16224a();
                    if (a != null && a.length > 0) {
                        try {
                            C3840b.m15876a(C3886a.m16110a(C3774m.m15591a().mo15460e(), new JSONObject(new String(a)).optJSONObject("ret")), true);
                            C3968x.m16530a((Object) "success updateWhenCrash");
                            countDownLatch.countDown();
                        } catch (Throwable unused) {
                        }
                    }
                }
            };
            if (Looper.getMainLooper() == Looper.myLooper()) {
                try {
                    m16219a(new Thread(r0)).start();
                } catch (Throwable unused) {
                }
                try {
                    countDownLatch.await(3000, TimeUnit.MILLISECONDS);
                } catch (Throwable unused2) {
                }
            } else {
                r0.run();
            }
        } else {
            m16226c();
        }
    }

    /* renamed from: a */
    static boolean m16223a(String str) {
        File h = m16231h();
        try {
            Map<String, String> map = f12012f;
            if (map == null) {
                map = C3949m.m16427f(h);
            }
            f12012f = map;
            return C3851e.m15964a(map, str);
        } catch (Throwable th) {
            C3968x.m16533a("npth", "err", th);
            return true;
        }
    }

    /* renamed from: a */
    public static void m16221a(String str, boolean z) {
        if (f12012f == null) {
            f12012f = new HashMap();
        }
        m16227d();
        if (z || !f12012f.containsKey(str)) {
            f12012f.put(str, String.valueOf(System.currentTimeMillis()));
            C3968x.m16530a((Object) ("udpate config time for aid " + str));
        }
    }
}
