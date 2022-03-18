package com.bytedance.crash.util;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.apm.block.C2871i;
import com.bytedance.crash.C3691b;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.nativecrash.C3809i;
import com.bytedance.crash.nativecrash.C3818j;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.p218b.C3697d;
import com.bytedance.crash.p218b.C3708j;
import com.bytedance.crash.p218b.C3715k;
import com.bytedance.crash.runtime.C3840b;
import com.bytedance.crash.runtime.C3866n;
import com.bytedance.crash.runtime.C3869p;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class NativeTools {

    /* renamed from: a */
    private static NativeTools f12018a;

    /* renamed from: c */
    private static HashMap<String, String> f12019c = new HashMap<>();

    /* renamed from: b */
    private volatile boolean f12020b;

    private static native int doCheckSoLoad(String str);

    private static native int doCheckVirtual();

    private static native int doCommonLogPath(int i, String str);

    private static native long doDumpEnvInfo();

    private static native void doEnvMonitorInit(int i);

    private static native void doSetNpthCatchAddr(long j);

    private static native int nativeAnrDump(String str);

    private static native int nativeAnrMonitorInit();

    private static native int nativeAnrMonitorLoop();

    private static native int nativeCloseFile(int i);

    private static native int nativeDumpCrashInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z);

    private static native int nativeDumpLogcat(String str, String str2);

    private static native int nativeDumpPthreadList(String str, String str2);

    private static native int nativeDumpThrowable(String str, Throwable th);

    private static native int nativeFillNativeHeapSize(NativeHeapSize nativeHeapSize);

    private static native String nativeGetBuildID(String str);

    private static native int nativeGetFDCount();

    private static native String[] nativeGetFdListForAPM();

    private static native int nativeGetMapsSize(String str);

    private static native String nativeGetOOMReason(String str, String str2);

    private static native long nativeGetPathSize(String str, int i);

    private static native int nativeGetResendSigquit();

    private static native long nativeGetSymbolAddress(String str, String str2, int i);

    private static native long nativeGetThreadCpuTimeMills(int i);

    private static native int nativeGetThreadInfoFromTombStone(String str, String str2);

    private static native boolean nativeIs64BitLibrary();

    private static native int nativeLockFile(String str);

    private static native int nativeOpenFile(String str);

    private static native boolean nativePidExists(int i);

    private static native void nativeSetFdLimit();

    private static native void nativeSetMallocInfoFunctionAddress(long j);

    private static native void nativeSetResendSigquit(int i);

    private static native int nativeTerminateMonitorWait(long j, String str, String str2, String str3, boolean z, boolean z2, boolean z3);

    private static native int nativeToolsInit(int i, String str);

    private static native int nativeUnlockFile(int i);

    private static native int nativeUpdateEspInfoFromTombStone(String str, String str2);

    private static native int nativeWriteFile(int i, String str, int i2);

    private static void onClearExcept(int[] iArr) {
    }

    /* renamed from: c */
    public void mo15606c() {
    }

    private static void onStartAllClear() {
        C3809i.m15790d();
    }

    /* renamed from: a */
    public boolean mo15598a() {
        return this.f12020b;
    }

    /* renamed from: m */
    public static boolean m16239m() {
        if (Build.VERSION.SDK_INT < 21 || Header.m15404b()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public int mo15607d() {
        if (!this.f12020b) {
            return -1;
        }
        try {
            return nativeGetFDCount();
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: g */
    public int mo15616g() {
        if (!this.f12020b) {
            return -1;
        }
        try {
            return nativeAnrMonitorInit();
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: h */
    public int mo15619h() {
        if (!this.f12020b) {
            return -1;
        }
        try {
            return nativeAnrMonitorLoop();
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: i */
    public boolean mo15621i() {
        if (!this.f12020b) {
            return false;
        }
        try {
            if (nativeGetResendSigquit() != 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: k */
    public long mo15623k() {
        if (!this.f12020b) {
            return 0;
        }
        try {
            return doDumpEnvInfo();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: l */
    public void mo15625l() {
        if (this.f12020b) {
            try {
                nativeSetFdLimit();
            } catch (Throwable th) {
                C3968x.m16534a(th);
            }
        }
    }

    /* renamed from: n */
    public int mo15626n() {
        if (!this.f12020b) {
            return 0;
        }
        try {
            return doCheckVirtual();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: f */
    public List<String> mo15615f() {
        if (!this.f12020b) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String[] nativeGetFdListForAPM = nativeGetFdListForAPM();
            if (nativeGetFdListForAPM != null) {
                arrayList.addAll(Arrays.asList(nativeGetFdListForAPM));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private NativeTools() {
        /*
            r3 = this;
            java.lang.String r0 = "npth_tools"
            r3.<init>()
            boolean r1 = r3.f12020b
            if (r1 != 0) goto L_0x0027
            r1 = 1
            com.C1711a.m7628a(r0)     // Catch:{ all -> 0x0010 }
            r3.f12020b = r1     // Catch:{ all -> 0x0010 }
            goto L_0x001b
        L_0x0010:
            android.content.Context r2 = com.bytedance.crash.C3774m.m15609j()     // Catch:{ all -> 0x001a }
            com.bytedance.p203b.C3481a.m14718a(r0, r2)     // Catch:{ all -> 0x001a }
            r3.f12020b = r1     // Catch:{ all -> 0x001a }
            goto L_0x001b
        L_0x001a:
        L_0x001b:
            boolean r0 = r3.f12020b
            if (r0 == 0) goto L_0x0027
            com.bytedance.crash.util.NativeTools$1 r0 = new com.bytedance.crash.util.NativeTools$1
            r0.<init>()
            com.bytedance.crash.util.C3963u.m16523a(r0)
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.NativeTools.<init>():void");
    }

    /* renamed from: b */
    public static NativeTools m16236b() {
        if (f12018a == null) {
            synchronized (NativeTools.class) {
                if (f12018a == null) {
                    NativeTools nativeTools = new NativeTools();
                    f12018a = nativeTools;
                    try {
                        if (nativeTools.f12020b) {
                            nativeToolsInit(Build.VERSION.SDK_INT, NativeImpl.m15688b(C3774m.m15609j()));
                            doSetNpthCatchAddr(NativeImpl.m15697h());
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return f12018a;
    }

    /* renamed from: j */
    public static String m16238j() {
        File k = C3962t.m16516k(C3774m.m15609j());
        if (!k.exists()) {
            k.mkdirs();
        }
        return k.getAbsolutePath() + '/' + C3774m.m15606g();
    }

    private static void onProcessBeWorker() {
        C3968x.m16532a("TermianteMonitor", "current be worker " + C3933b.m16337c(C3774m.m15609j()));
        C3866n.m16016b().mo15508a(new Runnable() {
            /* class com.bytedance.crash.util.NativeTools.RunnableC39252 */

            public void run() {
                C3809i.m15789c();
            }
        });
    }

    /* renamed from: e */
    public boolean mo15613e() {
        if (!this.f12020b) {
            return false;
        }
        try {
            return nativeIs64BitLibrary();
        } catch (Throwable unused) {
            return false;
        }
    }

    public class NativeHeapSize {
        public long allocate;
        public long free;
        public long total;

        public void print() {
            C3968x.m16530a((Object) ("NativeHeapSize.total = " + this.total));
            C3968x.m16530a((Object) ("NativeHeapSize.allocate = " + this.allocate));
            C3968x.m16530a((Object) ("NativeHeapSize.free = " + this.free));
        }

        public NativeHeapSize() {
        }
    }

    private static void reportEventForAnrMonitor() {
        long j;
        JSONArray jSONArray;
        if (C3697d.m15235a()) {
            C3708j.m15320e();
            return;
        }
        try {
            C3715k.m15322a(C3774m.m15609j()).mo15165a().mo15108d();
            try {
                C2871i.m12080b();
            } catch (Throwable th) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            }
            if (m16239m()) {
                File b = C3962t.m16486b();
                C3869p.m16026a("anr_signal_trace", b.getParentFile().getName());
                long uptimeMillis = SystemClock.uptimeMillis();
                nativeAnrDump(b.getAbsolutePath());
                j = SystemClock.uptimeMillis() - uptimeMillis;
                C3869p.m16026a("after_signal_trace", b.getParentFile().getName());
                try {
                    C2871i.m12081c();
                } catch (Throwable th2) {
                    C3691b.m15203a().mo15177a("NPTH_CATCH", th2);
                }
                try {
                    jSONArray = C3949m.m16418b(b.getAbsolutePath());
                } catch (Throwable unused) {
                    jSONArray = new JSONArray();
                }
            } else {
                jSONArray = new JSONArray();
                j = -1;
            }
            try {
                C3715k.m15322a(C3774m.m15609j()).mo15165a().mo15104a(jSONArray, j);
            } catch (Throwable th3) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", th3);
            }
        } catch (Throwable th4) {
            C3968x.m16534a(th4);
        }
    }

    /* renamed from: c */
    public long mo15604c(String str) {
        return nativeGetPathSize(str, 1);
    }

    /* renamed from: f */
    public long mo15614f(String str) {
        return nativeGetPathSize(str, 0);
    }

    /* renamed from: j */
    public String mo15622j(String str) {
        try {
            return nativeGetBuildID(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public int mo15590a(int i) {
        if (!this.f12020b) {
            return -1;
        }
        try {
            return nativeCloseFile(i);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public int mo15599b(int i) {
        if (!this.f12020b) {
            return -1;
        }
        try {
            return nativeUnlockFile(i);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public long mo15603c(int i) {
        if (!this.f12020b) {
            return -1;
        }
        try {
            return nativeGetThreadCpuTimeMills(i);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: e */
    public int mo15611e(String str) {
        if (!this.f12020b) {
            return -1;
        }
        try {
            return nativeLockFile(str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public void setMallocInfoFunc(long j) {
        if (this.f12020b) {
            try {
                nativeSetMallocInfoFunctionAddress(j);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public int mo15600b(String str) {
        if (!this.f12020b) {
            return -1;
        }
        try {
            return nativeDumpCrashInfo(null, null, null, null, null, str, null, false);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public int mo15608d(String str) {
        if (!this.f12020b) {
            return -1;
        }
        try {
            return nativeOpenFile(str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: g */
    public boolean mo15617g(String str) {
        if (!this.f12020b) {
            return false;
        }
        try {
            nativeAnrDump(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: h */
    public String mo15620h(String str) {
        String str2 = f12019c.get(str);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        String i = m16237i(m16236b().mo15622j(str));
        f12019c.put(str, i);
        return i;
    }

    /* renamed from: a */
    public int mo15593a(String str) {
        if (!this.f12020b) {
            return -1;
        }
        try {
            return nativeDumpCrashInfo(null, null, null, null, null, null, str, false);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public boolean mo15610d(int i) {
        if (!this.f12020b) {
            return false;
        }
        try {
            return nativePidExists(i);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: k */
    public JSONArray mo15624k(String str) {
        JSONArray jSONArray = new JSONArray();
        HashSet hashSet = new HashSet();
        for (String str2 : str.split("\n")) {
            String[] a = C3818j.m15797a(str2);
            if (a != null) {
                String h = m16236b().mo15620h(a[1]);
                if (!TextUtils.isEmpty(h) && !hashSet.contains(a[0])) {
                    hashSet.add(a[0]);
                    JSONObject jSONObject = new JSONObject();
                    C3955q.m16447a(jSONObject, "lib_name", a[0]);
                    C3955q.m16447a(jSONObject, "lib_uuid", h);
                    jSONArray.put(jSONObject);
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: i */
    public static String m16237i(String str) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            return sb.toString();
        }
        try {
            if (str.length() < 16) {
                sb.append(str);
            } else {
                sb.append(str.charAt(6));
                sb.append(str.charAt(7));
                sb.append(str.charAt(4));
                sb.append(str.charAt(5));
                sb.append(str.charAt(2));
                sb.append(str.charAt(3));
                sb.append(str.charAt(0));
                sb.append(str.charAt(1));
                sb.append(str.charAt(10));
                sb.append(str.charAt(11));
                sb.append(str.charAt(8));
                sb.append(str.charAt(9));
                sb.append(str.charAt(14));
                sb.append(str.charAt(15));
                sb.append(str.charAt(12));
                sb.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb.append((CharSequence) str, 16, 32);
                    sb.append('0');
                }
            }
        } catch (Throwable unused) {
        }
        return sb.toString().toUpperCase();
    }

    /* renamed from: a */
    public void mo15596a(boolean z) {
        int i;
        if (this.f12020b) {
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            try {
                nativeSetResendSigquit(i);
            } catch (Throwable unused) {
            }
        }
    }

    private static void onFindOneDied(int i, String str) {
        C3809i.m15783a(i, str);
    }

    /* renamed from: a */
    public int mo15591a(int i, String str) {
        if (!this.f12020b) {
            return -1;
        }
        try {
            return nativeWriteFile(i, str, str.length());
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public String mo15605c(String str, String str2) {
        if (!this.f12020b) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        try {
            String nativeGetOOMReason = nativeGetOOMReason(str, str2);
            if (nativeGetOOMReason == null) {
                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
            }
            return nativeGetOOMReason;
        } catch (Throwable unused) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }

    /* renamed from: e */
    public int mo15612e(String str, String str2) {
        if (!this.f12020b) {
            return -1;
        }
        try {
            return nativeUpdateEspInfoFromTombStone(str, str2);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public int mo15609d(String str, String str2) {
        if (!this.f12020b) {
            return -1;
        }
        try {
            return nativeGetThreadInfoFromTombStone(str, str2);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public void mo15601b(int i, String str) {
        if (this.f12020b) {
            try {
                doCommonLogPath(i, str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public int mo15594a(String str, String str2) {
        if (!this.f12020b) {
            return -1;
        }
        try {
            return nativeDumpLogcat(str, str2);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public void mo15602b(String str, String str2) {
        if (this.f12020b) {
            try {
                nativeDumpPthreadList(str, str2);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo15597a(boolean z, int i) {
        if (this.f12020b) {
            try {
                if (ByteHook.init() == 0) {
                    if (z) {
                        mo15601b(1, m16238j());
                    } else {
                        mo15601b(0, m16238j());
                    }
                    doEnvMonitorInit(i);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public long getSymbolAddress(String str, String str2, boolean z) {
        int i;
        if (!this.f12020b) {
            return -1;
        }
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            return nativeGetSymbolAddress(str, str2, i);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public int mo15592a(long j, String str, String str2) {
        boolean z;
        boolean z2;
        if (!this.f12020b) {
            return -1;
        }
        try {
            String c = C3933b.m16337c(C3774m.m15609j());
            boolean b = C3933b.m16336b(C3774m.m15609j());
            if (C3840b.m15865E() || (!C3933b.m16336b(C3774m.m15609j()) && !C3840b.m15866F())) {
                z = false;
            } else {
                z = true;
            }
            if (!C3840b.m15868H()) {
                z2 = true;
            } else {
                z2 = false;
            }
            return nativeTerminateMonitorWait(j, str, str2, c, b, z, z2);
        } catch (Throwable th) {
            C3968x.m16534a(th);
            return -1;
        }
    }

    /* renamed from: a */
    public void mo15595a(String str, String str2, String str3, String str4, String str5) {
        nativeDumpCrashInfo(str, str2, str3, str4, str5, null, null, false);
    }
}
