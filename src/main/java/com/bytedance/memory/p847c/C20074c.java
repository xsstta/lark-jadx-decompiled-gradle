package com.bytedance.memory.p847c;

import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.util.C3112b;
import com.bytedance.apm.util.C3117e;
import com.bytedance.crash.Npth;
import com.bytedance.memory.heap.C20092a;
import com.bytedance.memory.heap.HeapDump;
import com.bytedance.memory.model.MemoryWidgetConfig;
import com.bytedance.memory.p845a.C20055a;
import com.bytedance.memory.p846b.C20060b;
import com.bytedance.memory.p846b.C20063c;
import com.bytedance.memory.p846b.C20067e;
import com.bytedance.memory.p846b.C20070h;
import com.bytedance.memory.p848d.C20076a;
import com.bytedance.memory.p851g.C20087a;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.memory.c.c */
public class C20074c {

    /* renamed from: a */
    private static final File f49024a = null;

    /* renamed from: c */
    private static volatile C20074c f49025c;

    /* renamed from: d */
    private static C20073b f49026d;

    /* renamed from: b */
    private Context f49027b = C20055a.m73200c().mo68027f();

    /* renamed from: e */
    private long f49028e = System.currentTimeMillis();

    private C20074c() {
    }

    /* renamed from: a */
    public static C20074c m73254a() {
        if (f49025c == null) {
            synchronized (C20074c.class) {
                if (f49025c == null) {
                    f49025c = new C20074c();
                    f49026d = C20073b.m73242i();
                }
            }
        }
        return f49025c;
    }

    /* renamed from: b */
    public void mo68052b() {
        try {
            if (mo68053c()) {
                m73259e();
                C20087a.m73278a().mo68068d();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    private long m73258d() {
        try {
            if (!TextUtils.isEmpty(C20055a.m73200c().mo68020a())) {
                return m73253a(new File(C20055a.m73200c().mo68020a()));
            }
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return m73253a(C3117e.m12979a(C2785b.m11735a()));
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public boolean mo68053c() {
        try {
            long d = m73258d();
            long i = C3112b.m12955i();
            if (d <= 0 || i <= 0 || ((float) d) <= ((float) i) * 1.5f) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: e */
    private void m73259e() {
        File file;
        long nanoTime = System.nanoTime();
        File j = f49026d.mo68050j();
        File file2 = f49024a;
        if (j != file2) {
            File parentFile = j.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            long currentTimeMillis = System.currentTimeMillis();
            C20076a.m73266b("dump_begin");
            MemoryWidgetConfig.AbstractC20095a dumpAndShrinkConfig = C20055a.m73200c().mo68028g().getDumpAndShrinkConfig();
            if (dumpAndShrinkConfig == null || C20076a.m73269e("close_native_dump_and_shrink")) {
                file = m73256b(j);
                C20092a.m73301a().mo68090a(false);
            } else {
                File file3 = new File(C20073b.m73242i().mo68042a(), ".mini.hprof");
                if (dumpAndShrinkConfig.mo68135a(file3)) {
                    file = m73257c(file3);
                } else {
                    file = m73256b(j);
                    C20092a.m73301a().mo68090a(false);
                }
            }
            C20076a.m73266b("dump_end");
            C20076a.m73264a("dump_time", System.currentTimeMillis() - currentTimeMillis);
            if (file != file2) {
                m73255a(file, TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime));
                C20092a.m73301a().mo68086a(System.currentTimeMillis());
            }
        }
    }

    /* renamed from: a */
    public static long m73253a(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                return statFs.getAvailableBytes();
            }
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: b */
    private File m73256b(File file) {
        try {
            if (C20055a.m73200c().mo68028g().getRunStrategy() == 2) {
                C20063c.m73220a("Native dump", new Object[0]);
                Npth.dumpHprof(file.getAbsolutePath());
                Thread.sleep(30000);
                C20063c.m73220a("Native dump exist ? " + new File(file.getAbsolutePath()).exists(), new Object[0]);
            } else {
                Debug.dumpHprofData(file.getAbsolutePath());
            }
            C20092a.m73301a().mo68091b(C2785b.m11774o().optString("update_version_code"));
            return file;
        } catch (Exception e) {
            C20063c.m73221a(e, "Could not realDump heap", new Object[0]);
            return f49024a;
        }
    }

    /* renamed from: c */
    private File m73257c(File file) {
        String optString = C2785b.m11774o().optString("device_id");
        String optString2 = C2785b.m11774o().optString("update_version_code");
        C20092a.m73301a().mo68091b(optString2);
        String parent = file.getParent();
        File file2 = new File(parent, optString + "_" + optString2 + "_shrink.zip");
        C20070h.m73235a(file, file2);
        if (file.exists()) {
            file.delete();
        }
        C20092a.m73301a().mo68090a(true);
        C20092a.m73301a().mo68087a(file2.getAbsolutePath());
        C20092a.m73301a().mo68085a(4);
        return file2;
    }

    /* renamed from: a */
    public void mo68051a(long j) {
        this.f49028e = j;
        C20092a.m73301a().mo68101k();
        if (C20055a.m73200c().mo68028g().getRunStrategy() == 2) {
            C20060b.f49007b.mo68035a(new Runnable() {
                /* class com.bytedance.memory.p847c.C20074c.RunnableC200751 */

                public void run() {
                    C20074c.this.mo68052b();
                }
            }, "HeapDumper-dumpHeap");
        } else {
            mo68052b();
        }
    }

    /* renamed from: a */
    private HeapDump m73255a(File file, long j) {
        HeapDump a = HeapDump.newBuilder().mo68072a(file).mo68082d(0).mo68071a(this.f49028e).mo68076b(file.length()).mo68074a(C20067e.f49011a).mo68083e(j).mo68075a();
        C20063c.m73220a(a.toString(), new Object[0]);
        C20092a.m73301a().mo68084a(a);
        return a;
    }
}
