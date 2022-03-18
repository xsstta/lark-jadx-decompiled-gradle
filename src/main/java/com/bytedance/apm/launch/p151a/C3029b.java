package com.bytedance.apm.launch.p151a;

import android.os.Handler;
import com.bytedance.apm.PerfConfig;
import com.bytedance.apm.block.evil.EvilMethodSwitcher;
import com.bytedance.apm.block.p136a.C2848f;
import com.bytedance.apm.block.p136a.C2854g;
import com.bytedance.apm.trace.p155a.C3069b;
import com.bytedance.monitor.collector.C20146h;
import com.bytedance.p230d.p232b.C3975a;

/* renamed from: com.bytedance.apm.launch.a.b */
public class C3029b {

    /* renamed from: a */
    private static boolean f9752a;

    /* renamed from: b */
    private static boolean f9753b;

    /* renamed from: c */
    private static C3975a f9754c;

    /* renamed from: c */
    public static synchronized void m12709c() {
        C3975a aVar;
        synchronized (C3029b.class) {
            if (EvilMethodSwitcher.isOpenLaunchEvilMethod() && (aVar = f9754c) != null) {
                aVar.mo15650c();
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m12708b() {
        synchronized (C3029b.class) {
            if (f9752a) {
                f9752a = false;
                f9754c.mo15649b(EvilMethodSwitcher.isLimitEvilMethodDepth());
                C3975a.m16580a(EvilMethodSwitcher.getEvilThresholdMs());
                C3069b.m12809b("app_launch_evil_method_scene_apm_2");
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m12707a() {
        synchronized (C3029b.class) {
            if (!f9752a) {
                f9752a = true;
                if (!f9753b) {
                    f9753b = true;
                    C3975a.m16580a(EvilMethodSwitcher.getLaunchEvilThresholdMs());
                    C3975a.m16582a(true);
                    if (EvilMethodSwitcher.isMessageKeyEnable()) {
                        PerfConfig.setReportMessage();
                    }
                    C2848f.m12008a().mo12248b();
                    C2854g.m12031a().mo12268b();
                    C3975a.f12073a = true;
                    C3975a aVar = new C3975a(EvilMethodSwitcher.isLaunchLimitEvilMethodDepth(), true);
                    f9754c = aVar;
                    aVar.mo15648b();
                    C20146h.m73516a(true, "launch");
                    new Handler().postDelayed(new Runnable() {
                        /* class com.bytedance.apm.launch.p151a.C3029b.RunnableC30301 */

                        public void run() {
                            C3029b.m12708b();
                        }
                    }, 10000);
                }
                C3069b.m12807a("app_launch_evil_method_scene_apm_2");
            }
        }
    }
}
