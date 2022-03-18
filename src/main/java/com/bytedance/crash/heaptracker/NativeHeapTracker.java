package com.bytedance.crash.heaptracker;

import android.content.Context;
import android.os.Build;
import com.bytedance.crash.C3691b;
import com.bytedance.crash.C3722c;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.entity.C3742b;
import com.bytedance.crash.entity.C3743c;
import com.bytedance.crash.entity.C3744d;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.upload.C3908i;
import com.bytedance.crash.upload.CrashUploader;
import com.bytedance.crash.util.C3949m;
import com.bytedance.crash.util.C3954p;
import com.bytedance.crash.util.C3962t;
import com.bytedance.p203b.C3481a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.google.firebase.messaging.Constants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NativeHeapTracker {

    /* renamed from: h */
    public static boolean f11586h;

    /* renamed from: l */
    private static boolean f11587l;

    /* renamed from: n */
    private static String f11588n;

    /* renamed from: o */
    private static String f11589o;

    /* renamed from: a */
    public int f11590a;

    /* renamed from: b */
    public boolean f11591b;

    /* renamed from: c */
    public int f11592c;

    /* renamed from: d */
    public int f11593d;

    /* renamed from: e */
    public int f11594e;

    /* renamed from: f */
    public File f11595f;

    /* renamed from: g */
    public String f11596g;

    /* renamed from: i */
    public boolean f11597i;

    /* renamed from: j */
    private boolean f11598j;

    /* renamed from: k */
    private boolean f11599k;

    /* renamed from: m */
    private Context f11600m;

    /* renamed from: a */
    public static Thread m15549a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    private static native int nativeDoCommnad(int i);

    public static native long nativeGetHeapLeakSize();

    public static native long nativeGetHeapSize();

    private static native int nativeInit(int i, String str);

    private static native void nativeMinSizeByte(long j);

    private static native void nativeNeedDumpMemInfo(int i);

    private static native void nativeSetDumpThreshold(long j);

    /* renamed from: i */
    private boolean m15555i() {
        C3760a.m15566b("NativeHeapTracker", "loadLibrary...");
        if (!this.f11598j) {
            try {
                C3481a.m14718a("npth_heap_tracker", this.f11600m);
                this.f11598j = true;
            } catch (Throwable unused) {
            }
        }
        return this.f11598j;
    }

    /* renamed from: h */
    public static void m15554h() {
        File[] listFiles = C3962t.m16487b(C3774m.m15609j()).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!file.isFile()) {
                    try {
                        m15551a(file);
                    } catch (Throwable th) {
                        C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    private int m15557k() {
        if (this.f11597i) {
            C3760a.m15566b("NativeHeapTracker", "initNative");
        }
        int nativeDoCommnad = nativeDoCommnad(0);
        if (nativeDoCommnad != 0) {
            C3760a.m15566b("NativeHeapTracker", "initNative ret=" + nativeDoCommnad);
            C3722c a = C3691b.m15203a();
            a.mo15175a("NativeHeapTrackerInitFailed initNative failed " + nativeDoCommnad);
        }
        return nativeDoCommnad;
    }

    /* renamed from: c */
    public void mo15286c() {
        File file = new File(this.f11595f.getAbsolutePath() + this.f11596g);
        if (file.exists() && !file.delete()) {
            C3760a.m15566b("NativeHeapTracker", "delete guard file faild!");
        }
    }

    /* renamed from: d */
    public void mo15287d() {
        if (this.f11597i) {
            C3760a.m15566b("NativeHeapTracker", "trackNative");
        }
        int nativeDoCommnad = nativeDoCommnad(1);
        if (nativeDoCommnad != 0) {
            C3760a.m15566b("NativeHeapTracker", "trackNative ret=" + nativeDoCommnad);
            this.f11591b = true;
        }
    }

    /* renamed from: e */
    public void mo15288e() {
        if (this.f11597i) {
            C3760a.m15566b("NativeHeapTracker", "waitNative");
        }
        int nativeDoCommnad = nativeDoCommnad(2);
        if (nativeDoCommnad != 0) {
            C3760a.m15566b("NativeHeapTracker", "waitNative ret=" + nativeDoCommnad);
            this.f11591b = true;
        }
    }

    /* renamed from: f */
    public void mo15289f() {
        if (this.f11597i) {
            C3760a.m15566b("NativeHeapTracker", "dumpNative");
        }
        int nativeDoCommnad = nativeDoCommnad(3);
        if (nativeDoCommnad != 0) {
            C3760a.m15566b("NativeHeapTracker", "dumpNative ret=" + nativeDoCommnad);
            this.f11591b = true;
        }
    }

    /* renamed from: g */
    public void mo15290g() {
        if (this.f11597i) {
            C3760a.m15566b("NativeHeapTracker", "exitNative");
        }
        int nativeDoCommnad = nativeDoCommnad(4);
        if (nativeDoCommnad != 0) {
            C3760a.m15566b("NativeHeapTracker", "exitNative ret=" + nativeDoCommnad);
            this.f11591b = true;
        }
    }

    /* renamed from: j */
    private boolean m15556j() {
        File file = this.f11595f;
        if (file == null) {
            C3760a.m15565a("NativeHeapTracker", "mRootDirectory is null");
            return false;
        } else if (file.exists() || this.f11595f.mkdir()) {
            File file2 = new File(this.f11595f.getAbsolutePath() + this.f11596g);
            if (file2.exists()) {
                try {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    long parseLong = Long.parseLong(C3949m.m16421c(file2.getAbsolutePath()));
                    int i = (currentTimeMillis > parseLong ? 1 : (currentTimeMillis == parseLong ? 0 : -1));
                    if (i >= 0 && currentTimeMillis - parseLong < 604800) {
                        if (this.f11597i) {
                            C3760a.m15566b("NativeHeapTracker", "NativeHeapCheckTime Less than 7 days lastTime:" + parseLong + " currentTime:" + currentTimeMillis);
                        }
                        return false;
                    } else if (i >= 0 && currentTimeMillis - parseLong >= 604800) {
                        C3949m.m16413a(file2.getAbsolutePath());
                        if (this.f11597i) {
                            C3760a.m15566b("NativeHeapTracker", "deleteFile guard file");
                        }
                        return true;
                    } else if (parseLong > currentTimeMillis) {
                        C3722c a = C3691b.m15203a();
                        a.mo15175a("NativeHeapCheckTime lastTime:" + parseLong + " currentTime:" + currentTimeMillis);
                        return false;
                    }
                } catch (IOException unused) {
                    C3760a.m15566b("NativeHeapTracker", "read guard file faild!");
                    return false;
                }
            }
            if (this.f11597i) {
                C3760a.m15566b("NativeHeapTracker", "check directory success!");
            }
            return true;
        } else {
            C3760a.m15565a("NativeHeapTracker", "cannot create " + this.f11595f);
            return false;
        }
    }

    /* renamed from: a */
    public String mo15284a() {
        int i = this.f11590a;
        if (i == 0) {
            return "[STATE_INIT]";
        }
        if (i == 1) {
            return "[STATE_PREPARE]";
        }
        if (i == 2) {
            return "[STATE_OBSERV]";
        }
        if (i == 3) {
            return "[STATE_TRACK]";
        }
        if (i == 4) {
            return "[STATE_WAIT]";
        }
        if (i != 5) {
            return "[STATEE_UNKNOWN]";
        }
        return "[STATE_EXIT]";
    }

    /* renamed from: b */
    public void mo15285b() {
        if (f11586h) {
            C3760a.m15566b("NativeHeapTracker", "execute() Already running!");
        } else if (!m15555i()) {
            C3760a.m15566b("NativeHeapTracker", "loadLibrary() failed!");
        } else {
            int nativeInit = nativeInit(Build.VERSION.SDK_INT, this.f11595f.getAbsolutePath() + '/' + C3774m.m15606g());
            if (nativeInit != 0) {
                C3760a.m15565a("NativeHeapTracker", "init err ret = " + nativeInit);
                return;
            }
            f11586h = true;
            if (this.f11590a != 0) {
                C3760a.m15565a("NativeHeapTracker", "execute() Invalide state " + mo15284a());
            } else if (!m15556j()) {
                C3760a.m15565a("NativeHeapTracker", "NativeHeapTrackerInitFailed found guard");
            } else if (m15557k() == 0) {
                this.f11590a = 1;
                if (this.f11599k) {
                    nativeNeedDumpMemInfo(1);
                }
                m15549a(new Thread("NativeHeapTracker") {
                    /* class com.bytedance.crash.heaptracker.NativeHeapTracker.C37591 */

                    /* JADX WARNING: Removed duplicated region for block: B:40:0x0101  */
                    /* JADX WARNING: Removed duplicated region for block: B:56:0x0000 A[SYNTHETIC] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void run() {
                        /*
                        // Method dump skipped, instructions count: 397
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.heaptracker.NativeHeapTracker.C37591.run():void");
                    }
                }).start();
            }
        }
    }

    /* renamed from: b */
    private static void m15553b(File file) {
        try {
            C3954p.m16437a(new BufferedWriter(new FileWriter(new File(file, "tombstone.txt").getAbsolutePath(), true)));
        } catch (IOException e) {
            e.printStackTrace();
            C3954p.m16437a((Closeable) null);
        } catch (Throwable th) {
            C3954p.m16437a((Closeable) null);
            C3954p.m16437a((Closeable) null);
            throw th;
        }
        C3954p.m16437a((Closeable) null);
    }

    /* renamed from: a */
    private static String m15548a(String str) {
        StringBuilder sb = new StringBuilder();
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

    /* renamed from: b */
    private static String m15552b(String str) {
        long longValue = Long.decode(str.substring(0, str.indexOf("MB"))).longValue();
        if (longValue >= 1 && longValue <= 100) {
            return "1MB~100MB";
        }
        if (longValue > 100 && longValue <= 250) {
            return "100MB~250MB";
        }
        if (longValue > 250 && longValue <= 350) {
            return "250MB~350MB";
        }
        if (longValue > 350 && longValue <= 450) {
            return "350MB~450MB";
        }
        if (longValue > 450 && longValue <= 550) {
            return "450MB~550MB";
        }
        if (longValue > 550 && longValue <= 650) {
            return "550MB~650MB";
        }
        if (longValue > 650 && longValue <= 750) {
            return "650MB~750MB";
        }
        if (longValue > 750 && longValue <= 850) {
            return "750MB~850MB";
        }
        if (longValue > 850 && longValue <= 950) {
            return "850MB~950MB";
        }
        if (longValue > 950 && longValue <= 1050) {
            return "950MB~1050MB";
        }
        if (longValue > 1050 && longValue <= 1250) {
            return "1050MB~1250MB";
        }
        if (longValue > 1250 && longValue <= 1450) {
            return "1250MB~1450MB";
        }
        if (longValue > 1450 && longValue <= 1650) {
            return "1450MB~1650MB";
        }
        if (longValue > 1650 && longValue <= 1850) {
            return "1650MB~1850MB";
        }
        if (longValue <= 1850 || longValue > 2050) {
            return ">2.3G";
        }
        return "1850MB~2050MB";
    }

    /* renamed from: a */
    private static void m15551a(File file) {
        File file2 = new File(file, "tombstone.txt");
        C3742b bVar = new C3742b();
        try {
            JSONArray b = C3949m.m16418b(file2.getAbsolutePath());
            if (b == null) {
                C3949m.m16412a(file);
                return;
            }
            int i = 0;
            int a = m15547a(b, 0, "pid:");
            if (a < 0) {
                C3949m.m16412a(file);
                return;
            }
            String[] split = b.optString(a, null).trim().split("\\s");
            String str = null;
            int i2 = 0;
            while (i2 < split.length) {
                String str2 = split[i2];
                if ("pid:".equals(str2)) {
                    int i3 = i2 + 1;
                    bVar.mo15241a("pid", Long.decode(split[i3].substring(i, split[i3].length() - 1)));
                } else if ("tid:".equals(str2)) {
                    int i4 = i2 + 1;
                    bVar.mo15241a("tid", Long.decode(split[i4].substring(0, split[i4].length() - 1)));
                } else if ("name:".equals(str2)) {
                    int i5 = i2 + 1;
                    bVar.mo15241a("crash_thread_name", (Object) split[i5].substring(0, split[i5].length() - 1));
                    str = split[i5].substring(0, split[i5].length() - 1);
                }
                i2++;
                i = 0;
            }
            bVar.mo15241a("process_name", (Object) split[split.length - 2]);
            StringBuilder sb = new StringBuilder();
            int a2 = m15547a(b, a + 1, "Signal ");
            if (a2 < 0) {
                C3949m.m16412a(file);
                return;
            }
            sb.append(b.optString(a2, null));
            sb.append('\n');
            int a3 = m15547a(b, a2 + 1, "Abort message:");
            if (a3 < 0) {
                C3949m.m16412a(file);
                return;
            }
            String replace = b.optString(a3, null).replace("Abort message:", "abort message:");
            sb.append(replace);
            sb.append('\n');
            try {
                if (f11588n == null && f11589o == null && replace.startsWith("abort message:")) {
                    String[] split2 = replace.trim().split(":");
                    String[] split3 = split2[2].trim().split(",");
                    if (split2.length >= 4) {
                        f11588n = split2[1];
                        f11589o = m15552b(split3[0]);
                    }
                }
            } catch (Throwable th) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            }
            int a4 = m15547a(b, a3 + 1, "backtrace:");
            if (a4 < 0) {
                C3949m.m16412a(file);
                return;
            }
            int i6 = a4 + 1;
            while (i6 < b.length()) {
                String optString = b.optString(i6, null);
                if (!optString.startsWith("    #")) {
                    break;
                }
                sb.append(optString.trim());
                sb.append('\n');
                i6++;
            }
            String sb2 = sb.toString();
            int a5 = m15547a(b, i6, "build id:");
            if (a5 > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i7 = a5 + 1; i7 < b.length(); i7++) {
                    String optString2 = b.optString(i7, null);
                    if (optString2.startsWith("    /")) {
                        String[] split4 = optString2.trim().split("\\s");
                        if (split4.length >= 3) {
                            jSONArray.put(new JSONObject().put("lib_name", split4[0].substring(split4[0].lastIndexOf(47) + 1)).put("lib_uuid", m15548a(split4[split4.length - 1].substring(0, split4[split4.length - 1].length() - 1))));
                        }
                    }
                }
                bVar.mo15241a("crash_lib_uuid", (Object) jSONArray);
            }
            bVar.mo15241a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (Object) sb.toString());
            Header b2 = Header.m15402b(C3774m.m15609j());
            try {
                b2.mo15227f().put("aid", 4444);
            } catch (JSONException unused) {
            }
            bVar.mo15231a(b2);
            bVar.mo15241a("is_native_crash", (Object) 1);
            bVar.mo15241a("crash_time", Long.valueOf(System.currentTimeMillis()));
            bVar.mo15235a("native_oom_app", C3774m.m15609j().getPackageName());
            String str3 = "true";
            bVar.mo15235a("has_native_oom", str3);
            String str4 = f11588n;
            if (!(str4 == null || f11589o == null)) {
                bVar.mo15235a("native_oom_lib", str4);
                bVar.mo15235a("native_oom_size", f11589o);
                f11587l = true;
            }
            try {
                m15553b(file);
                m15550a(bVar, file);
            } catch (Throwable unused2) {
            }
            if (!(sb2 == null || str == null || replace == null)) {
                try {
                    if (!(f11588n == null || f11589o == null)) {
                        C3744d a6 = C3744d.m15482a(null, sb2, replace, str, "1");
                        a6.mo15235a("native_oom_size", f11589o);
                        a6.mo15235a("native_oom_lib", f11588n);
                        if (!f11587l) {
                            str3 = "false";
                        }
                        a6.mo15235a("has_native_oom", str3);
                        C3908i.m16190a(a6, C3743c.f11533a, System.currentTimeMillis(), file);
                    }
                } catch (Throwable unused3) {
                    C3949m.m16412a(file);
                    return;
                }
            }
            if (CrashUploader.m16085a(C3774m.m15611l().getNativeCrashUploadUrl(), bVar.mo15252e().toString(), file, null).mo15579a()) {
                C3949m.m16412a(file);
            }
        } catch (IOException unused4) {
            C3949m.m16412a(file);
        } catch (Throwable th2) {
            C3691b.m15203a().mo15177a("NPTH_CATCH", th2);
            C3949m.m16412a(file);
        }
    }

    /* renamed from: a */
    private static void m15550a(C3742b bVar, File file) {
        BufferedReader bufferedReader;
        Throwable th;
        File file2 = new File(file, "logcat.txt");
        if (file2.exists()) {
            JSONArray jSONArray = new JSONArray();
            try {
                bufferedReader = new BufferedReader(new FileReader(file2));
                try {
                    if (file2.length() > 512000) {
                        bufferedReader.skip(file2.length() - 512000);
                    }
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        jSONArray.put(readLine);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                        C3954p.m16437a(bufferedReader);
                        bVar.mo15241a("logcat", (Object) jSONArray);
                    } catch (Throwable th3) {
                        C3954p.m16437a(bufferedReader);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                bufferedReader = null;
                th = th4;
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                C3954p.m16437a(bufferedReader);
                bVar.mo15241a("logcat", (Object) jSONArray);
            }
            C3954p.m16437a(bufferedReader);
            bVar.mo15241a("logcat", (Object) jSONArray);
        }
    }

    /* renamed from: a */
    private static int m15547a(JSONArray jSONArray, int i, String str) {
        while (i < jSONArray.length()) {
            String optString = jSONArray.optString(i, null);
            if (optString != null && optString.startsWith(str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public NativeHeapTracker(JSONArray jSONArray, String str, File file, Context context) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            this.f11592c = 350;
            this.f11593d = 650;
            this.f11594e = 60;
            this.f11599k = false;
            this.f11597i = true;
        } else {
            this.f11594e = jSONArray.optInt(0);
            this.f11592c = jSONArray.optInt(1);
            this.f11593d = jSONArray.optInt(2);
            this.f11599k = jSONArray.optBoolean(3);
            this.f11597i = jSONArray.optBoolean(4);
        }
        this.f11590a = 0;
        this.f11591b = false;
        f11587l = false;
        this.f11600m = context;
        this.f11595f = file;
        this.f11596g = "/" + str + ".guard";
    }
}
