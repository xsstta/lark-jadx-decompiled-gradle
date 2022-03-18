package com.bytedance.crash.runtime;

import android.os.Build;
import android.os.SystemClock;
import com.bytedance.crash.C3691b;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.util.C3935d;
import com.bytedance.crash.util.C3945i;
import com.bytedance.crash.util.C3949m;
import com.bytedance.crash.util.C3962t;
import com.bytedance.crash.util.C3968x;
import com.bytedance.crash.util.C3969y;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* renamed from: com.bytedance.crash.runtime.j */
public class C3859j {

    /* renamed from: a */
    private static AbstractC3858i f11836a;

    /* renamed from: a */
    public static Thread m15987a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* renamed from: a */
    public static void m15990a(AbstractC3858i iVar) {
        f11836a = iVar;
    }

    /* renamed from: a */
    public static JSONArray m15988a(File file) {
        try {
            File file2 = new File(file, "logcat.txt");
            File file3 = new File(file, "logerr.txt");
            if (file3.exists()) {
                if (C3969y.m16551a(file2)) {
                    C3935d.m16347a("single_logcat", 2, 1);
                } else {
                    C3935d.m16350b("single_logcat", 2, 3);
                }
            }
            return m15992b(C3945i.m16373a(file2, file3, true).getAbsolutePath());
        } catch (Throwable th) {
            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            return null;
        }
    }

    /* renamed from: b */
    private static JSONArray m15992b(String str) {
        try {
            File file = new File(str);
            if (file.length() > 512000) {
                return C3949m.m16397a(file, file.length() - 512000);
            }
            return C3949m.m16418b(str);
        } catch (IOException unused) {
            return null;
        } catch (Throwable th) {
            C3968x.m16534a(th);
            return null;
        }
    }

    /* renamed from: a */
    public static JSONArray m15989a(String str) {
        if (f11836a != null && C3774m.m15606g().equals(str)) {
            try {
                return m15992b(f11836a.mo15472a());
            } catch (Throwable th) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            }
        }
        return m15988a(C3962t.m16488b(C3774m.m15609j(), str));
    }

    /* renamed from: a */
    public static void m15991a(final String str, String str2, boolean z) {
        if (!NativeTools.m16236b().mo15598a() || !C3935d.m16349a("single_logcat", 2)) {
            C3968x.m16531a("use java logcat cause native logcat error");
            final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            RunnableC38601 r4 = new Runnable() {
                /* class com.bytedance.crash.runtime.C3859j.RunnableC38601 */

                public void run() {
                    C3968x.m16530a((Object) "dumpLogcat use java");
                    Process process = null;
                    try {
                        process = Runtime.getRuntime().exec(new String[]{"logcat", "-b", "main,system,crash,events", "-f", str});
                        if (Build.VERSION.SDK_INT >= 26) {
                            process.waitFor(3000, TimeUnit.MILLISECONDS);
                        } else if (atomicBoolean.get()) {
                            process.waitFor();
                        } else {
                            SystemClock.sleep(1000);
                        }
                        if (process == null) {
                            return;
                        }
                    } catch (Throwable unused) {
                        if (0 == 0) {
                            return;
                        }
                    }
                    process.destroy();
                }
            };
            try {
                m15987a(new Thread(r4)).start();
            } catch (Throwable unused) {
                atomicBoolean.set(false);
                r4.run();
            }
        } else {
            C3968x.m16530a((Object) "use native single logcat");
            NativeTools.m16236b().mo15594a(str, str2);
            if (z) {
                SystemClock.sleep(3000);
            }
        }
    }
}
