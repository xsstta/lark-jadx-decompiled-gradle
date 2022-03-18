package com.bytedance.apm.util;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.C3013j;
import com.bytedance.apm.internal.C3010b;
import com.bytedance.apm.p153n.C3047b;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.util.c */
public class C3113c {

    /* renamed from: a */
    private boolean f10018a;

    /* renamed from: b */
    private boolean f10019b;

    /* renamed from: c */
    private boolean f10020c;

    /* renamed from: d */
    private String f10021d;

    /* renamed from: e */
    private int f10022e;

    /* renamed from: f */
    private int f10023f;

    /* renamed from: g */
    private long f10024g;

    /* renamed from: h */
    private boolean f10025h;

    /* renamed from: i */
    private long f10026i;

    /* renamed from: j */
    private long f10027j;

    /* renamed from: k */
    private String f10028k;

    /* renamed from: l */
    private boolean f10029l;

    /* renamed from: m */
    private long f10030m;

    /* renamed from: n */
    private long f10031n;

    /* renamed from: o */
    private double f10032o;

    /* renamed from: p */
    private long f10033p;

    /* renamed from: q */
    private long f10034q;

    /* renamed from: r */
    private double f10035r;

    /* renamed from: s */
    private long f10036s;

    /* renamed from: t */
    private long f10037t;

    /* renamed from: u */
    private double f10038u;

    /* renamed from: v */
    private boolean f10039v;

    /* renamed from: w */
    private boolean f10040w;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.util.c$a */
    public static class C3115a {

        /* renamed from: a */
        static final C3113c f10043a = new C3113c();
    }

    /* renamed from: a */
    public static C3113c m12960a() {
        return C3115a.f10043a;
    }

    private C3113c() {
        m12961b();
        this.f10018a = C2785b.m11782w();
        m12962c();
    }

    /* renamed from: c */
    private void m12962c() {
        if (this.f10018a) {
            try {
                m12963d();
                m12966g();
                m12969j();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private void m12961b() {
        if (C3139v.m13080a()) {
            final Throwable th = new Throwable("Don't use DeviceInfoUtil on main thread.");
            C3047b.m12756a().mo12886a(new Runnable() {
                /* class com.bytedance.apm.util.C3113c.RunnableC31141 */

                public void run() {
                    C3013j.m12658a().mo12828b(th, "apm_error");
                }
            });
        }
    }

    /* renamed from: h */
    private String m12967h() {
        File file = new File("/system/lib/libc.so");
        if (!file.exists()) {
            return "unknown";
        }
        try {
            if (C3134r.m13037a(file, "je_malloc")) {
                return "jemalloc";
            }
            return "dlmalloc";
        } catch (IOException unused) {
            return "unknown";
        }
    }

    /* renamed from: e */
    private void m12964e() {
        C3010b a = C3010b.m12651a();
        String a2 = a.mo12819a("sp_cpu_model");
        int b = a.mo12823b("sp_cpu_core_num");
        if (!TextUtils.isEmpty(a2)) {
            this.f10021d = a2;
            this.f10022e = b;
            return;
        }
        m12965f();
        if (TextUtils.isEmpty(this.f10021d)) {
            this.f10021d = "unknown";
        }
        a.mo12822a("sp_cpu_model", this.f10021d);
        a.mo12820a("sp_cpu_core_num", this.f10022e);
    }

    /* renamed from: i */
    private void m12968i() {
        boolean z;
        this.f10024g = Debug.getNativeHeapAllocatedSize() / 1048576;
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long freeMemory = runtime.freeMemory();
        long j = runtime.totalMemory();
        this.f10026i = maxMemory / 1048576;
        long j2 = j - freeMemory;
        this.f10027j = j2 / 1048576;
        if (((float) j2) > ((float) maxMemory) * 0.95f) {
            z = true;
        } else {
            z = false;
        }
        this.f10025h = z;
    }

    /* renamed from: d */
    private void m12963d() {
        String str = C2785b.m11735a().getApplicationInfo().nativeLibraryDir;
        if (!TextUtils.isEmpty(str) && str.endsWith("arm64")) {
            this.f10019b = true;
        }
        StringBuilder sb = new StringBuilder();
        if (Build.VERSION.SDK_INT < 21 || Build.SUPPORTED_ABIS.length <= 0) {
            sb = new StringBuilder(Build.CPU_ABI);
        } else {
            for (int i = 0; i < Build.SUPPORTED_ABIS.length; i++) {
                sb.append(Build.SUPPORTED_ABIS[i]);
                if (i != Build.SUPPORTED_ABIS.length - 1) {
                    sb.append(", ");
                }
            }
        }
        String sb2 = sb.toString();
        if (sb2 != null && sb2.contains("64")) {
            this.f10020c = true;
        }
        m12964e();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x000f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:18:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x000f */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.String] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f A[SYNTHETIC, Splitter:B:25:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0057 A[SYNTHETIC, Splitter:B:32:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12965f() {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.util.C3113c.m12965f():void");
    }

    /* renamed from: g */
    private void m12966g() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) C2785b.m11735a().getSystemService("activity")).getMemoryInfo(memoryInfo);
        if (Build.VERSION.SDK_INT < 16) {
            this.f10023f = -1;
        } else {
            this.f10023f = (int) (memoryInfo.totalMem / 536870912);
        }
        if (Build.VERSION.SDK_INT < 21) {
            this.f10028k = "dlmalloc";
        } else if (Build.VERSION.SDK_INT >= 24) {
            this.f10028k = "jemalloc";
        } else {
            String a = C3010b.m12651a().mo12819a("sp_malloc_impl");
            if (a == null) {
                a = m12967h();
                C3010b.m12651a().mo12822a("sp_malloc_impl", a);
            }
            this.f10028k = a;
        }
    }

    /* renamed from: j */
    private void m12969j() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 18) {
            z = true;
        } else {
            z = false;
        }
        this.f10029l = z;
        StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
        if (this.f10029l) {
            this.f10031n = statFs.getAvailableBytes();
            this.f10030m = statFs.getBlockSizeLong() * statFs.getBlockCountLong();
        } else {
            this.f10031n = ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
            this.f10030m = ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
        }
        this.f10032o = m12958a(this.f10031n, this.f10030m);
        try {
            StatFs statFs2 = new StatFs(C2785b.m11735a().getFilesDir().getAbsolutePath());
            if (this.f10029l) {
                this.f10034q = statFs2.getAvailableBytes();
                this.f10033p = statFs2.getBlockSizeLong() * statFs2.getBlockCountLong();
            } else {
                this.f10034q = ((long) statFs2.getBlockSize()) * ((long) statFs2.getAvailableBlocks());
                this.f10033p = ((long) statFs2.getBlockSize()) * ((long) statFs2.getBlockCount());
            }
            this.f10035r = m12958a(this.f10034q, this.f10033p);
        } catch (Throwable unused) {
        }
        String str = null;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception unused2) {
        }
        boolean equals = TextUtils.equals(str, "mounted");
        this.f10039v = equals;
        if (equals) {
            try {
                StatFs statFs3 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
                if (this.f10029l) {
                    this.f10037t = statFs3.getAvailableBytes();
                    this.f10036s = statFs3.getBlockSizeLong() * statFs3.getBlockCountLong();
                } else {
                    this.f10037t = ((long) statFs3.getBlockSize()) * ((long) statFs3.getAvailableBlocks());
                    this.f10036s = ((long) statFs3.getBlockSize()) * ((long) statFs3.getBlockCount());
                }
                this.f10038u = m12958a(this.f10037t, this.f10036s);
            } catch (Throwable unused3) {
            }
        } else {
            this.f10036s = 0;
        }
        this.f10040w = Environment.isExternalStorageRemovable();
    }

    /* renamed from: a */
    private long m12959a(long j) {
        return j / 1073741824;
    }

    /* renamed from: e */
    public void mo13050e(JSONObject jSONObject) {
        mo13045a(jSONObject, false);
    }

    /* renamed from: f */
    public void mo13051f(JSONObject jSONObject) {
        mo13047b(jSONObject, false);
    }

    /* renamed from: a */
    public void mo13044a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null && this.f10018a) {
            jSONObject.put("apm_is_app_64", this.f10019b);
            jSONObject.put("apm_is_device_64", this.f10020c);
            jSONObject.put("apm_cpu_model", this.f10021d);
            int i = this.f10022e;
            if (i > 0) {
                jSONObject.put("apm_cpu_core_num", i);
            }
        }
    }

    /* renamed from: b */
    public void mo13046b(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null && this.f10018a) {
            jSONObject.put("apm_physical_mem", this.f10023f);
            jSONObject.put("apm_malloc_impl", this.f10028k);
        }
    }

    /* renamed from: c */
    public void mo13048c(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null && this.f10018a) {
            m12968i();
            jSONObject.put("apm_native_heap_size", this.f10024g);
            jSONObject.put("apm_java_heap_leak", this.f10025h);
            jSONObject.put("apm_java_heap_used", this.f10027j);
            jSONObject.put("apm_java_heap_max", this.f10026i);
        }
    }

    /* renamed from: d */
    public void mo13049d(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null && this.f10018a) {
            if (this.f10030m != 0) {
                jSONObject.put("apm_sys_avail_size", this.f10031n / 1048576);
                jSONObject.put("apm_sys_avail_ratio", this.f10032o);
            }
            if (this.f10033p != 0) {
                jSONObject.put("apm_data_avail_size", m12959a(this.f10034q));
                jSONObject.put("apm_data_avail_ratio", this.f10035r);
            }
            if (this.f10036s != 0) {
                jSONObject.put("apm_sd_avail_size", m12959a(this.f10037t));
                jSONObject.put("apm_sd_avail_ratio", this.f10038u);
            }
            if (this.f10039v) {
                jSONObject.put("apm_external_removable", this.f10040w);
            }
        }
    }

    /* renamed from: a */
    public void mo13045a(JSONObject jSONObject, boolean z) {
        if (this.f10018a || z) {
            try {
                m12960a().mo13048c(jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    private double m12958a(long j, long j2) {
        if (j2 == 0) {
            return 0.0d;
        }
        return ((double) Math.round((((double) j) / ((double) j2)) * 100.0d)) / 100.0d;
    }

    /* renamed from: b */
    public void mo13047b(JSONObject jSONObject, boolean z) {
        if (this.f10018a || z) {
            try {
                m12960a().mo13044a(jSONObject);
                m12960a().mo13046b(jSONObject);
                m12960a().mo13049d(jSONObject);
            } catch (JSONException unused) {
            }
        }
    }
}
