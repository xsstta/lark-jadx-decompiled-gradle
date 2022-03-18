package com.bytedance.memory.heap;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.core.SharedPreferencesC2910d;
import com.bytedance.memory.p845a.C20055a;
import com.bytedance.memory.p846b.C20060b;
import com.bytedance.memory.p846b.C20063c;
import com.bytedance.memory.p846b.C20066d;
import com.bytedance.memory.p846b.C20070h;
import com.bytedance.memory.p847c.C20073b;
import com.bytedance.memory.p848d.C20076a;
import com.bytedance.memory.p850f.C20083a;
import com.bytedance.memory.shrink.C20108i;
import com.bytedance.services.apm.api.EnsureManager;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.memory.heap.a */
public class C20092a {

    /* renamed from: e */
    private static volatile C20092a f49063e;

    /* renamed from: a */
    public volatile boolean f49064a;

    /* renamed from: b */
    public volatile HeapDump f49065b;

    /* renamed from: c */
    private Context f49066c;

    /* renamed from: d */
    private volatile SharedPreferences f49067d;

    /* renamed from: f */
    private boolean f49068f;

    /* renamed from: c */
    public HeapDump mo68093c() {
        return this.f49065b;
    }

    /* renamed from: a */
    public void mo68090a(boolean z) {
        mo68101k().edit().putBoolean("hasShrink", z).commit();
    }

    /* renamed from: a */
    public void mo68088a(String str, String str2, long j, File file) {
        C20063c.m73220a("shrink begin with path %s, length %s ", file.getPath(), Long.valueOf(file.length()));
        File a = m73302a(file);
        if (a == null || (a.length() < 31457280 && m73301a().mo68098h() == 2)) {
            C20063c.m73220a("shrink failed deleteCache", new Object[0]);
            m73301a().mo68104n();
            return;
        }
        C20063c.m73220a("shrink succeed", new Object[0]);
        C20076a.m73263a("shrink_compress_begin");
        long currentTimeMillis = System.currentTimeMillis();
        File a2 = C20070h.m73234a(a, true);
        C20076a.m73264a("shrink_compress_time", System.currentTimeMillis() - currentTimeMillis);
        C20076a.m73263a("shrink_compress_end");
        C20076a.m73264a("shrink_compress_size", a2.length() / 1024);
        String parent = a2.getParent();
        File file2 = new File(parent, new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date(j)) + "_" + str2 + "_" + str + "_shrink.zip");
        if (a2.exists()) {
            a2.renameTo(file2);
        }
        m73301a().mo68090a(true);
        m73301a().mo68087a(file2.getAbsolutePath());
    }

    /* renamed from: a */
    public void mo68089a(String str, String str2, long j, File file, String str3) {
        File file2 = new File(C20073b.m73242i().mo68045d(), "dump.hprof");
        if (file.getPath().contains("jpg")) {
            file.renameTo(file2);
        }
        File c = C20073b.m73242i().mo68044c();
        File file3 = new File(c, str3.replace("dump", new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date(j))) + "_" + str2 + "_" + str + "_origin.zip");
        C20076a.m73263a("origin_compress_begin");
        long currentTimeMillis = System.currentTimeMillis();
        C20070h.m73235a(file2, file3);
        C20063c.m73220a("compress origin file succeed", new Object[0]);
        C20076a.m73264a("origin_compress_time", System.currentTimeMillis() - currentTimeMillis);
        C20076a.m73263a("origin_compress_end");
        C20076a.m73264a("origin_compress_size", file3.length() / 1024);
        if (file2.exists()) {
            file2.delete();
        }
        m73301a().mo68085a(1);
        m73301a().mo68090a(true);
        m73301a().mo68087a(file3.getAbsolutePath());
    }

    /* renamed from: b */
    public boolean mo68092b() {
        return this.f49068f;
    }

    /* renamed from: l */
    public void mo68102l() {
        m73305c("");
    }

    /* renamed from: p */
    private String m73307p() {
        return mo68101k().getString("filePath", "");
    }

    /* renamed from: d */
    public long mo68094d() {
        return mo68101k().getLong("lastDumpTime", 0);
    }

    /* renamed from: e */
    public boolean mo68095e() {
        return mo68101k().getBoolean("hasShrink", false);
    }

    /* renamed from: f */
    public String mo68096f() {
        return mo68101k().getString("latestFilePath", "");
    }

    /* renamed from: g */
    public String mo68097g() {
        return mo68101k().getString("updateVersionCode", "");
    }

    /* renamed from: h */
    public int mo68098h() {
        return mo68101k().getInt("hprof_type", 1);
    }

    /* renamed from: n */
    public void mo68104n() {
        C20060b.f49007b.mo68035a(new Runnable() {
            /* class com.bytedance.memory.heap.C20092a.RunnableC200942 */

            public void run() {
                C20092a.this.f49065b = null;
                C20066d.m73228a(C20073b.m73242i().mo68045d());
                C20092a.this.mo68102l();
                C20092a.m73301a().mo68087a("");
                C20092a.m73301a().mo68091b("");
                C20092a.m73301a().mo68085a(0);
            }
        }, "HeapSaver-deleteCache");
    }

    /* renamed from: i */
    public long mo68099i() {
        if (m73301a().mo68093c() != null) {
            return m73301a().mo68093c().currentTime;
        }
        return System.currentTimeMillis();
    }

    /* renamed from: j */
    public boolean mo68100j() {
        if (System.currentTimeMillis() - mo68101k().getLong("lastDumpTime", 0) < 28800000) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C20092a m73301a() {
        if (f49063e == null) {
            synchronized (C20092a.class) {
                if (f49063e == null) {
                    f49063e = new C20092a(C20055a.m73200c().mo68027f());
                }
            }
        }
        return f49063e;
    }

    /* renamed from: k */
    public SharedPreferences mo68101k() {
        if (this.f49067d == null) {
            synchronized (this) {
                if (this.f49067d == null) {
                    Context context = this.f49066c;
                    this.f49067d = SharedPreferencesC2910d.m12319a(context, "MemoryWidgetSp" + C2785b.m11756d());
                }
            }
        }
        return this.f49067d;
    }

    /* renamed from: m */
    public void mo68103m() {
        if (!this.f49064a) {
            if (m73301a().mo68095e()) {
                C20063c.m73220a("HeapSaver shrink hasShrinked", new Object[0]);
                C20083a.m73275a();
                return;
            }
            C20060b.f49007b.mo68035a(new Runnable() {
                /* class com.bytedance.memory.heap.C20092a.RunnableC200931 */

                public void run() {
                    long j;
                    if (C20073b.m73242i().mo68046e()) {
                        String g = C20092a.m73301a().mo68097g();
                        if (C20073b.m73242i().mo68048g().length() <= 31457280 || TextUtils.isEmpty(g)) {
                            C20063c.m73220a("HeapSaver shrink return deleteCache. updateVersionCode:" + g, new Object[0]);
                            C20092a.m73301a().mo68104n();
                            return;
                        }
                        C20092a.this.f49064a = true;
                        Process.setThreadPriority(10);
                        String optString = C2785b.m11774o().optString("device_id");
                        if (C20092a.m73301a().mo68093c() != null) {
                            j = C20092a.m73301a().mo68093c().currentTime;
                        } else {
                            j = System.currentTimeMillis();
                        }
                        File g2 = C20073b.m73242i().mo68048g();
                        String substring = g2.getName().substring(0, g2.getName().lastIndexOf("."));
                        if (C20076a.m73268d("memory_upload_origin")) {
                            C20092a.this.mo68089a(g, optString, j, g2, substring);
                        } else {
                            C20092a.this.mo68088a(g, optString, j, g2);
                        }
                        C20073b.m73242i().mo68049h();
                        C20092a.this.f49064a = false;
                        Process.setThreadPriority(0);
                        C20083a.m73275a();
                    }
                }
            }, "HeapSaver-shrink");
        }
    }

    /* renamed from: o */
    public void mo68105o() {
        if (this.f49065b == null) {
            String p = m73307p();
            if (!TextUtils.isEmpty(p)) {
                HeapDump d = m73306d(p);
                C20063c.m73220a("cache heapdump %s", d);
                m73304b(d);
            }
        }
    }

    /* renamed from: b */
    private void m73304b(HeapDump heapDump) {
        this.f49065b = heapDump;
    }

    private C20092a(Context context) {
        this.f49066c = context.getApplicationContext();
    }

    /* renamed from: c */
    private void m73305c(String str) {
        mo68101k().edit().putString("filePath", str).commit();
    }

    /* renamed from: a */
    public void mo68085a(int i) {
        mo68101k().edit().putInt("hprof_type", i).commit();
    }

    /* renamed from: b */
    public void mo68091b(String str) {
        mo68101k().edit().putString("updateVersionCode", str).commit();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0052 A[Catch:{ all -> 0x006b }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c A[Catch:{ all -> 0x006b }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067 A[SYNTHETIC, Splitter:B:26:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006f A[SYNTHETIC, Splitter:B:33:0x006f] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bytedance.memory.heap.HeapDump m73306d(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.memory.heap.C20092a.m73306d(java.lang.String):com.bytedance.memory.heap.HeapDump");
    }

    /* renamed from: a */
    private File m73302a(File file) {
        try {
            if (file.exists()) {
                return C20108i.m73414a(file, new File(C20073b.m73242i().mo68042a(), "dump.hprof"));
            }
            return null;
        } catch (Throwable th) {
            EnsureManager.ensureNotReachHere(th, "realShrink failed");
            th.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056 A[SYNTHETIC, Splitter:B:20:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e A[SYNTHETIC, Splitter:B:27:0x005e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File mo68084a(com.bytedance.memory.heap.HeapDump r5) {
        /*
            r4 = this;
            r4.m73304b(r5)
            com.bytedance.memory.c.b r0 = com.bytedance.memory.p847c.C20073b.m73242i()
            java.io.File r0 = r0.mo68047f()
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x0014
            r0.delete()
        L_0x0014:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r0.getPath()
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "analyzedHeapFile.getHeapDumpFilePath() %s"
            com.bytedance.memory.p846b.C20063c.m73220a(r2, r1)
            java.lang.String r1 = r0.getPath()
            r4.m73305c(r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r2 = 0
            r4.m73303a(r5, r1)     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0047 }
            byte[] r1 = r1.getBytes()     // Catch:{ Exception -> 0x0047 }
            r5.write(r1)     // Catch:{ Exception -> 0x0047 }
            r5.close()     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            return r0
        L_0x0047:
            r0 = move-exception
            goto L_0x004d
        L_0x0049:
            r0 = move-exception
            goto L_0x005c
        L_0x004b:
            r0 = move-exception
            r5 = r2
        L_0x004d:
            java.lang.String r1 = "Could not save leak analysis result to disk."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x005a }
            com.bytedance.memory.p846b.C20063c.m73221a(r0, r1, r3)     // Catch:{ all -> 0x005a }
            if (r5 == 0) goto L_0x0059
            r5.close()     // Catch:{ IOException -> 0x0059 }
        L_0x0059:
            return r2
        L_0x005a:
            r0 = move-exception
            r2 = r5
        L_0x005c:
            if (r2 == 0) goto L_0x0061
            r2.close()     // Catch:{ IOException -> 0x0061 }
        L_0x0061:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.memory.heap.C20092a.mo68084a(com.bytedance.memory.heap.HeapDump):java.io.File");
    }

    /* renamed from: a */
    public void mo68086a(long j) {
        this.f49068f = true;
        mo68101k().edit().putLong("lastDumpTime", j).commit();
    }

    /* renamed from: a */
    public void mo68087a(String str) {
        mo68101k().edit().putString("latestFilePath", str).commit();
    }

    /* renamed from: a */
    private HeapDump m73300a(JSONObject jSONObject, File file) {
        return HeapDump.newBuilder().mo68072a(file).mo68071a(jSONObject.optLong("currentTime")).mo68076b(jSONObject.optLong("heapDumpFileSize")).mo68080c(jSONObject.optString("referenceName")).mo68078b(jSONObject.optBoolean("isDebug")).mo68082d(jSONObject.optLong("gcDurationMs")).mo68079c(jSONObject.optLong("watchDurationMs")).mo68083e(jSONObject.optLong("dumpDurationMs")).mo68073a(jSONObject.optString("shrinkFilePath")).mo68075a();
    }

    /* renamed from: a */
    private void m73303a(HeapDump heapDump, JSONObject jSONObject) throws JSONException {
        jSONObject.put("heapDumpFilePath", heapDump.heapDumpFile.getPath());
        jSONObject.put("shrinkFilePath", heapDump.shrinkFilePath);
        jSONObject.put("heapDumpFileSize", heapDump.heapDumpFile.length());
        jSONObject.put("referenceName", heapDump.referenceName);
        jSONObject.put("isDebug", heapDump.isDebug);
        jSONObject.put("gcDurationMs", heapDump.gcDurationMs);
        jSONObject.put("watchDurationMs", heapDump.watchDurationMs);
        jSONObject.put("dumpDurationMs", heapDump.heapDumpDurationMs);
        jSONObject.put("currentTime", heapDump.currentTime);
    }
}
