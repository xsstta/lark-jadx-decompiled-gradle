package com.bytedance.crash.p218b;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.crash.C3691b;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.C3775n;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.runtime.C3840b;
import com.bytedance.crash.runtime.p227a.C3824a;
import com.bytedance.crash.util.C3933b;
import com.bytedance.crash.util.C3949m;
import com.bytedance.crash.util.C3955q;
import com.bytedance.crash.util.NativeTools;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.b.b */
public class C3693b {

    /* renamed from: b */
    public static long f11351b = 0;

    /* renamed from: c */
    public static long f11352c = 0;

    /* renamed from: d */
    public static long f11353d = 0;

    /* renamed from: e */
    static Pattern f11354e = null;

    /* renamed from: f */
    static String f11355f = "";

    /* renamed from: r */
    private static volatile boolean f11356r;

    /* renamed from: a */
    public boolean f11357a = true;

    /* renamed from: g */
    private C3697d f11358g;

    /* renamed from: h */
    private final Context f11359h;

    /* renamed from: i */
    private volatile boolean f11360i;

    /* renamed from: j */
    private long f11361j = -1;

    /* renamed from: k */
    private File f11362k;

    /* renamed from: l */
    private final Object f11363l = new Object();

    /* renamed from: m */
    private final C3705h f11364m;

    /* renamed from: n */
    private long f11365n;

    /* renamed from: o */
    private C3695a f11366o;

    /* renamed from: p */
    private int f11367p;

    /* renamed from: q */
    private File f11368q;

    /* renamed from: d */
    private String m15220d(long j) {
        return j < 100 ? "0 - 100ms" : j < 500 ? "100mss - 500ms" : j < 1000 ? "500ms - 1s" : j < 5000 ? "1s - 5s" : j < 10000 ? "5s - 10s" : j < 20000 ? "10s - 20s" : "20s - ";
    }

    /* renamed from: a */
    public void mo15103a() {
        if (!this.f11360i) {
            this.f11358g = new C3697d(this);
            C3716l.m15330a();
            this.f11361j = C3774m.m15612m();
            this.f11360i = true;
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0004 */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0004 A[LOOP:0: B:3:0x0004->B:41:0x0004, LOOP_START, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15104a(org.json.JSONArray r4, long r5) {
        /*
            r3 = this;
            java.lang.Class<com.bytedance.crash.b.b> r0 = com.bytedance.crash.p218b.C3693b.class
            r1 = 0
            monitor-enter(r0)     // Catch:{ all -> 0x0021 }
        L_0x0004:
            boolean r2 = com.bytedance.crash.p218b.C3693b.f11356r     // Catch:{ all -> 0x001e }
            if (r2 == 0) goto L_0x000c
            r0.wait()     // Catch:{ all -> 0x0004 }
            goto L_0x0004
        L_0x000c:
            r2 = 1
            com.bytedance.crash.p218b.C3693b.f11356r = r2
            monitor-exit(r0)
            r3.mo15106b(r4, r5)
            monitor-enter(r0)
            com.bytedance.crash.p218b.C3693b.f11356r = r1     // Catch:{ all -> 0x001b }
            r0.notifyAll()     // Catch:{ all -> 0x001b }
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            goto L_0x0032
        L_0x001b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r4
        L_0x001e:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        L_0x0021:
            r4 = move-exception
            com.bytedance.crash.c r5 = com.bytedance.crash.C3691b.m15203a()     // Catch:{ all -> 0x0036 }
            java.lang.String r6 = "NPTH_CATCH"
            r5.mo15177a(r6, r4)     // Catch:{ all -> 0x0036 }
            monitor-enter(r0)
            com.bytedance.crash.p218b.C3693b.f11356r = r1     // Catch:{ all -> 0x0033 }
            r0.notifyAll()     // Catch:{ all -> 0x0033 }
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
        L_0x0032:
            return
        L_0x0033:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r4
        L_0x0036:
            r4 = move-exception
            monitor-enter(r0)
            com.bytedance.crash.p218b.C3693b.f11356r = r1     // Catch:{ all -> 0x003f }
            r0.notifyAll()     // Catch:{ all -> 0x003f }
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r4
        L_0x003f:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p218b.C3693b.mo15104a(org.json.JSONArray, long):void");
    }

    /* renamed from: a */
    private boolean m15214a(long j, JSONArray jSONArray, long j2) {
        if (jSONArray == null) {
            return false;
        }
        this.f11366o.f11383l = true;
        if (j2 >= 0) {
            this.f11366o.f11381j = j2;
        }
        m15211a(j, jSONArray);
        return !m15222f();
    }

    /* renamed from: a */
    public static long[] m15215a(JSONArray jSONArray) {
        long[] jArr = {0, 0};
        if (jSONArray == null) {
            return jArr;
        }
        long j = 0;
        long j2 = 0;
        int i = 0;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                if (jSONArray.getJSONObject(i2).getInt(ShareHitPoint.f121869d) == 8) {
                    j += (long) jSONArray.getJSONObject(i2).getInt("cpuDuration");
                    j2 += (long) jSONArray.getJSONObject(i2).getInt("duration");
                    i++;
                }
            } catch (Throwable unused) {
            }
        }
        if (i > 0) {
            long j3 = (long) i;
            jArr[0] = j / j3;
            jArr[1] = j2 / j3;
        }
        return jArr;
    }

    /* renamed from: i */
    private boolean m15225i() {
        return C3840b.m15895m();
    }

    /* renamed from: c */
    public void mo15107c() {
        C3697d dVar = this.f11358g;
        if (dVar != null) {
            dVar.mo15111b();
        }
    }

    /* renamed from: h */
    private void m15224h() {
        File file = this.f11362k;
        if (file != null) {
            C3949m.m16412a(file);
            this.f11362k = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.b.b$a */
    public class C3695a {

        /* renamed from: a */
        JSONObject f11372a;

        /* renamed from: b */
        JSONObject f11373b;

        /* renamed from: c */
        JSONArray f11374c;

        /* renamed from: d */
        JSONObject f11375d;

        /* renamed from: e */
        long f11376e = -1;

        /* renamed from: f */
        JSONArray f11377f;

        /* renamed from: g */
        JSONArray f11378g;

        /* renamed from: h */
        JSONObject f11379h;

        /* renamed from: i */
        boolean f11380i;

        /* renamed from: j */
        long f11381j = -1;

        /* renamed from: k */
        boolean f11382k;

        /* renamed from: l */
        boolean f11383l;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo15110a() {
            this.f11372a = null;
            this.f11373b = null;
            this.f11374c = null;
            this.f11375d = null;
            this.f11376e = -1;
            this.f11377f = null;
            this.f11378g = null;
            this.f11379h = null;
            this.f11382k = false;
        }

        C3695a() {
        }
    }

    /* renamed from: e */
    public static boolean m15221e() {
        boolean a = C3933b.m16332a(C3774m.m15609j());
        if (!a || C3824a.m15819d().mo15400e() > 2000) {
            return a;
        }
        return false;
    }

    /* renamed from: b */
    public void mo15105b() {
        if (this.f11360i) {
            this.f11360i = false;
            C3697d dVar = this.f11358g;
            if (dVar != null) {
                dVar.mo15112c();
            }
            C3716l.m15333b();
            this.f11358g = null;
        }
    }

    /* renamed from: f */
    private boolean m15222f() {
        if (C3840b.m15894l()) {
            return false;
        }
        boolean z = !C3824a.m15819d().mo15401f();
        if (!z || C3824a.m15819d().mo15400e() > 2000) {
            return z;
        }
        return false;
    }

    /* renamed from: g */
    private File m15223g() {
        if (this.f11368q == null) {
            File filesDir = this.f11359h.getFilesDir();
            this.f11368q = new File(filesDir, "npth/has_anr_signal_" + C3933b.m16337c(this.f11359h).replaceAll(":", "_"));
        }
        return this.f11368q;
    }

    /* renamed from: d */
    public void mo15108d() {
        C3700e.m15246c();
        if (NativeTools.m16236b().mo15621i()) {
            try {
                C3949m.m16402a(m15223g(), String.valueOf(this.f11367p + 1), false);
            } catch (Throwable th) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            }
        }
        this.f11366o.mo15110a();
        m15216b(SystemClock.uptimeMillis());
    }

    /* renamed from: c */
    private String m15218c(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(j));
    }

    public C3693b(Context context) {
        C3705h hVar = new C3705h();
        this.f11364m = hVar;
        this.f11365n = -1;
        this.f11366o = new C3695a();
        this.f11359h = context;
        hVar.mo15140a(C3933b.m16337c(context), context.getPackageName());
        C3716l.m15331a(100, (int) LocationRequest.PRIORITY_INDOOR);
    }

    /* renamed from: a */
    private static void m15212a(String str) {
        for (ICrashCallback iCrashCallback : C3775n.m15621a().mo15451f()) {
            try {
                iCrashCallback.onCrash(CrashType.ANR, str, null);
            } catch (Throwable th) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            }
        }
    }

    /* renamed from: b */
    private void m15216b(long j) {
        if (this.f11366o.f11378g == null) {
            this.f11366o.f11373b = C3716l.m15342k();
            this.f11366o.f11378g = C3716l.m15336e();
            this.f11366o.f11377f = C3716l.m15328a(100, j);
        }
    }

    /* renamed from: a */
    public static String m15208a(long j) {
        long m = j - C3774m.m15612m();
        if (m < 30000) {
            return "0 - 30s";
        }
        if (m < 60000) {
            return "30s - 1min";
        }
        if (m < 120000) {
            return "1min - 2min";
        }
        if (m < 300000) {
            return "2min - 5min";
        }
        if (m < 600000) {
            return "5min - 10min";
        }
        if (m < 1800000) {
            return "10min - 30min";
        }
        if (m < 3600000) {
            return "30min - 1h";
        }
        return "1h - ";
    }

    /* renamed from: b */
    private static int[] m15217b(JSONArray jSONArray) throws IllegalArgumentException {
        int i;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String optString = jSONArray.optString(i2);
            if (optString == null || optString.isEmpty()) {
                i = -1;
            } else {
                i = optString.indexOf("utm=");
            }
            if (i > 0) {
                if (f11354e == null) {
                    f11354e = Pattern.compile("[^0-9]+");
                }
                String[] split = f11354e.split(optString.substring(i));
                if (split == null || split.length < 2) {
                    return null;
                }
                try {
                    int intValue = Integer.decode(split[1]).intValue();
                    int intValue2 = Integer.decode(split[2]).intValue();
                    return new int[]{intValue, intValue2, intValue + intValue2};
                } catch (Throwable unused) {
                    throw new IllegalArgumentException("Err stack line: " + optString);
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private static JSONObject m15219c(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray a = C3955q.m16444a((int) DynamicModule.f58006b, (int) SmActions.ACTION_ONTHECALL_EXIT, jSONArray);
        C3955q.m16447a(jSONObject, "thread_number", (Object) 1);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        f11355f = "";
        for (int i = 0; i < a.length(); i++) {
            String optString = a.optString(i);
            sb.append(optString);
            sb.append('\n');
            if (optString.startsWith("  | ") || optString.startsWith("\"main\" ")) {
                sb2.append(optString);
                sb2.append('\n');
            }
        }
        f11355f = sb2.toString();
        C3955q.m16447a(jSONObject, "mainStackFromTrace", sb.toString());
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m15209a(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray a = C3955q.m16444a((int) DynamicModule.f58006b, (int) SmActions.ACTION_ONTHECALL_EXIT, jSONArray);
        C3955q.m16447a(jSONObject, "thread_name", str);
        C3955q.m16447a(jSONObject, "thread_stack", a);
        return jSONObject;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:18|19|(1:21)(1:22)|23|24|25|27|(1:29)|30|(1:32)|33|34) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00ad */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00dd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m15211a(long r5, org.json.JSONArray r7) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p218b.C3693b.m15211a(long, org.json.JSONArray):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:145:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0313 A[Catch:{ all -> 0x0310, all -> 0x030d }] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0557  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0570  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x05a9  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x061d  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x062b A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m15213a(java.lang.String r38, com.bytedance.crash.p218b.C3705h r39) {
        /*
        // Method dump skipped, instructions count: 1616
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p218b.C3693b.m15213a(java.lang.String, com.bytedance.crash.b.h):void");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:112:0x044d */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0474 A[Catch:{ all -> 0x047f }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0084  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo15106b(org.json.JSONArray r17, long r18) {
        /*
        // Method dump skipped, instructions count: 1215
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p218b.C3693b.mo15106b(org.json.JSONArray, long):boolean");
    }

    /* renamed from: a */
    public static Pair<JSONObject, JSONObject> m15207a(JSONArray jSONArray, C3705h hVar, boolean z) {
        JSONObject jSONObject = null;
        if (jSONArray == null) {
            return new Pair<>(null, null);
        }
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        String str = null;
        JSONObject jSONObject2 = null;
        boolean z2 = false;
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (TextUtils.isEmpty(optString)) {
                JSONObject a = m15210a(jSONArray4, str, jSONArray2, hVar, z);
                if (a != null) {
                    jSONObject2 = a;
                }
                if (jSONArray4.length() > 0) {
                    jSONArray4 = new JSONArray();
                }
                str = null;
            } else {
                if (z2) {
                    if (!z2) {
                    }
                } else if (optString.startsWith("DALVIK THREADS") || optString.startsWith("suspend") || optString.startsWith("\"")) {
                    z2 = true;
                } else {
                    jSONArray3.put(optString);
                }
                if (optString.contains(" prio=")) {
                    JSONObject a2 = m15210a(jSONArray4, str, jSONArray2, hVar, z);
                    if (a2 != null) {
                        jSONObject2 = a2;
                    }
                    String substring = optString.substring(1, optString.indexOf(34, 1));
                    str = (!z || !"main".equals(substring)) ? substring + "  (" + optString.substring(optString.indexOf(34, 2) + 1) + " )" : substring;
                    if (jSONArray4.length() > 0) {
                        jSONArray4 = new JSONArray();
                    }
                    jSONArray4.put(optString);
                } else if (TextUtils.isEmpty(str)) {
                    jSONArray3.put(optString);
                } else {
                    jSONArray4.put(optString);
                }
            }
        }
        if (hVar != null) {
            hVar.mo15156d();
        }
        if (jSONArray2.length() > 0) {
            jSONObject = new JSONObject();
            C3955q.m16447a(jSONObject, "thread_all_count", Integer.valueOf(jSONArray2.length()));
            C3955q.m16447a(jSONObject, "thread_stacks", jSONArray2);
            f11351b = (long) jSONArray2.length();
        }
        return new Pair<>(jSONObject2, jSONObject);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x013e A[Catch:{ all -> 0x0150 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00e2 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.json.JSONObject m15210a(org.json.JSONArray r21, java.lang.String r22, org.json.JSONArray r23, com.bytedance.crash.p218b.C3705h r24, boolean r25) {
        /*
        // Method dump skipped, instructions count: 400
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p218b.C3693b.m15210a(org.json.JSONArray, java.lang.String, org.json.JSONArray, com.bytedance.crash.b.h, boolean):org.json.JSONObject");
    }
}
