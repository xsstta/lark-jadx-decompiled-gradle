package com.bytedance.memory.p849e;

import android.os.Debug;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.IOOMCallback;
import com.bytedance.crash.Npth;
import com.bytedance.memory.model.MemoryWidgetConfig;
import com.bytedance.memory.p845a.C20055a;
import com.bytedance.memory.p846b.C20060b;
import com.bytedance.memory.p846b.C20063c;
import com.bytedance.memory.p847c.C20071a;
import com.bytedance.memory.p847c.C20073b;
import com.bytedance.memory.p847c.C20074c;
import com.bytedance.memory.p848d.C20076a;
import java.io.File;

/* renamed from: com.bytedance.memory.e.b */
public class C20078b {

    /* renamed from: a */
    private long f49030a;

    /* renamed from: b */
    private volatile boolean f49031b;

    /* renamed from: com.bytedance.memory.e.b$a */
    private static class C20082a {

        /* renamed from: a */
        public static final C20078b f49035a = new C20078b();
    }

    private C20078b() {
    }

    /* renamed from: a */
    public static C20078b m73270a() {
        return C20082a.f49035a;
    }

    /* renamed from: e */
    private void m73271e() {
        Npth.registerHprofCallback(new IOOMCallback() {
            /* class com.bytedance.memory.p849e.C20078b.C200802 */

            @Override // com.bytedance.crash.IOOMCallback
            public void onCrash(CrashType crashType, Throwable th, Thread thread, long j) {
                C20063c.m73220a("onCrash callback", new Object[0]);
                if (th != null && !(th instanceof OutOfMemoryError) && C20074c.m73254a().mo68053c()) {
                    C20078b.this.mo68056c();
                }
            }
        });
    }

    /* renamed from: d */
    public void mo68057d() {
        if (!C20076a.m73268d("npth_hprof_close_expired")) {
            C20060b.f49007b.mo68035a(new Runnable() {
                /* class com.bytedance.memory.p849e.C20078b.RunnableC200813 */

                public void run() {
                    try {
                        File b = C20073b.m73242i().mo68043b();
                        if (b != null && b.exists() && b.isDirectory()) {
                            C20071a.m73238a().mo68039a(b);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }, "checkFileExpired");
        }
    }

    /* renamed from: b */
    public void mo68055b() {
        try {
            if (!this.f49031b) {
                this.f49031b = true;
                m73271e();
                C3047b.m12756a().mo12887a(new Runnable() {
                    /* class com.bytedance.memory.p849e.C20078b.RunnableC200791 */

                    public void run() {
                        try {
                            C20078b.this.mo68057d();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }, 10000);
                C20063c.m73220a("registerCrashCallBack", new Object[0]);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: c */
    public void mo68056c() {
        File file;
        try {
            if (System.currentTimeMillis() - this.f49030a >= 60000) {
                this.f49030a = System.currentTimeMillis();
                C20076a.m73266b("npth_dump_begin");
                MemoryWidgetConfig.AbstractC20095a dumpAndShrinkConfig = C20055a.m73200c().mo68028g().getDumpAndShrinkConfig();
                File b = C20073b.m73242i().mo68043b();
                if (dumpAndShrinkConfig == null || C20076a.m73269e("close_native_dump_and_shrink")) {
                    file = new File(b, "npth.jpg");
                    if (file.exists()) {
                        file.delete();
                    }
                    Debug.dumpHprofData(file.getAbsolutePath());
                } else {
                    file = new File(b, "npth_mini.jpg");
                    if (file.exists()) {
                        file.delete();
                    }
                    if (!dumpAndShrinkConfig.mo68135a(file)) {
                        file = new File(b, "npth.jpg");
                        if (file.exists()) {
                            file.delete();
                        }
                        Debug.dumpHprofData(file.getAbsolutePath());
                    }
                }
                C20076a.m73266b("npth_dump_end");
                C20063c.m73220a("onCrash dump finish:" + file.getAbsolutePath(), new Object[0]);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
