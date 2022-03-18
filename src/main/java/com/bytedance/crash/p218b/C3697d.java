package com.bytedance.crash.p218b;

import android.os.SystemClock;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.runtime.C3840b;
import com.bytedance.crash.runtime.C3866n;
import com.bytedance.crash.util.C3968x;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import org.json.JSONArray;

/* renamed from: com.bytedance.crash.b.d */
public class C3697d {

    /* renamed from: b */
    public static long f11385b = 0;

    /* renamed from: e */
    private static boolean f11386e = true;

    /* renamed from: a */
    public final C3693b f11387a;

    /* renamed from: c */
    public boolean f11388c;

    /* renamed from: d */
    private final Runnable f11389d;

    /* renamed from: c */
    public void mo15112c() {
        this.f11388c = true;
    }

    /* renamed from: a */
    public static boolean m15235a() {
        return f11386e;
    }

    /* renamed from: b */
    public void mo15111b() {
        if (this.f11388c) {
        }
    }

    /* renamed from: d */
    public static boolean m15236d() {
        if (SystemClock.uptimeMillis() - f11385b <= 15000) {
            return true;
        }
        return false;
    }

    C3697d(C3693b bVar) {
        RunnableC36981 r0 = new Runnable() {
            /* class com.bytedance.crash.p218b.C3697d.RunnableC36981 */

            /* renamed from: a */
            public static Thread m15239a(Thread thread) {
                return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
            }

            public void run() {
                if (!C3697d.this.f11388c) {
                    C3968x.m16530a((Object) "oldAnr start");
                    m15239a(new Thread("anr_monitor_new") {
                        /* class com.bytedance.crash.p218b.C3697d.RunnableC36981.C36991 */

                        public void run() {
                            super.run();
                            while (true) {
                                SystemClock.sleep(C3774m.m15611l().getDefaultAnrCheckInterval());
                                if (!C3697d.this.f11388c) {
                                    C3697d.this.f11387a.mo15104a((JSONArray) null, -1);
                                    C3697d.f11385b = SystemClock.uptimeMillis();
                                } else {
                                    return;
                                }
                            }
                        }
                    }).start();
                }
            }
        };
        this.f11389d = r0;
        this.f11387a = bVar;
        if (C3840b.m15863C()) {
            f11386e = false;
            C3866n.m16016b().mo15509a(r0, 5000);
        }
    }
}
