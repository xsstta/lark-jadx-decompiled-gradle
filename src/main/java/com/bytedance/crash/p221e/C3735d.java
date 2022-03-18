package com.bytedance.crash.p221e;

import android.content.Context;
import android.os.Looper;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.C3742b;
import com.bytedance.crash.runtime.p227a.C3835e;
import com.bytedance.crash.upload.C3890c;
import com.bytedance.crash.upload.CrashUploader;
import com.bytedance.crash.util.C3930ad;
import com.bytedance.crash.util.C3949m;
import com.bytedance.crash.util.C3954p;
import com.bytedance.crash.util.C3962t;
import com.bytedance.crash.util.C3969y;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.e.d */
public class C3735d implements AbstractC3734c {

    /* renamed from: a */
    public final boolean f11506a;

    /* renamed from: b */
    private final Context f11507b;

    /* renamed from: a */
    public static int m15389a() {
        return 6;
    }

    /* renamed from: a */
    public static Thread m15390a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    @Override // com.bytedance.crash.p221e.AbstractC3734c
    /* renamed from: a */
    public boolean mo15197a(Throwable th) {
        return true;
    }

    public C3735d(Context context, boolean z) {
        this.f11507b = context;
        this.f11506a = z;
    }

    @Override // com.bytedance.crash.p221e.AbstractC3734c
    /* renamed from: a */
    public void mo15196a(long j, Thread thread, Throwable th, String str, File file, String str2, boolean z) {
        CrashType crashType;
        String str3;
        final File file2 = new File(C3962t.m16481a(this.f11507b), str);
        file2.mkdirs();
        int g = C3949m.m16428g(file2);
        C3742b a = C3835e.m15853a().mo15429a(CrashType.JAVA, null, new C3737e(C3930ad.m16312b(th), th, j, str2, z, thread, str, file2, this.f11506a), true);
        if (g > 0) {
            C3949m.m16398a(g);
        }
        if (C3954p.m16441b() || C3954p.m16442c()) {
            a.mo15235a("no_space", "direct");
            if (C3954p.m16442c()) {
                a.mo15235a("fd_leak", "true");
            }
            final JSONObject e = a.mo15252e();
            try {
                e = C3890c.m16123a(e, this.f11506a, str, C3774m.m15606g());
            } catch (JSONException unused) {
            }
            final File j2 = C3962t.m16514j(this.f11507b);
            C3969y.m16546a(e, j2);
            if (Looper.getMainLooper() == Looper.myLooper()) {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    m15390a(new Thread(new Runnable() {
                        /* class com.bytedance.crash.p221e.C3735d.RunnableC37361 */

                        public void run() {
                            CrashType crashType;
                            String str;
                            if (C3735d.this.f11506a) {
                                crashType = CrashType.LAUNCH;
                            } else {
                                crashType = CrashType.JAVA;
                            }
                            String name = crashType.getName();
                            if (C3735d.this.f11506a) {
                                str = CrashUploader.m16106d();
                            } else {
                                str = CrashUploader.m16100b();
                            }
                            if (CrashUploader.m16083a(name, CrashUploader.m16088a(str, e.optJSONObject("header")), e.toString(), j2).mo15579a()) {
                                C3949m.m16412a(file2);
                            }
                            countDownLatch.countDown();
                        }
                    })).start();
                    countDownLatch.await(5, TimeUnit.SECONDS);
                } catch (Throwable unused2) {
                }
            } else {
                if (this.f11506a) {
                    crashType = CrashType.LAUNCH;
                } else {
                    crashType = CrashType.JAVA;
                }
                String name = crashType.getName();
                if (this.f11506a) {
                    str3 = CrashUploader.m16106d();
                } else {
                    str3 = CrashUploader.m16100b();
                }
                if (CrashUploader.m16083a(name, CrashUploader.m16088a(str3, e.optJSONObject("header")), e.toString(), j2).mo15579a()) {
                    C3949m.m16412a(file2);
                }
            }
        }
    }
}
