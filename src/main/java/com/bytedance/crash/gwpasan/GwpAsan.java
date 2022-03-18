package com.bytedance.crash.gwpasan;

import android.content.Context;
import android.os.Build;
import com.bytedance.crash.C3691b;
import com.bytedance.crash.C3722c;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.entity.C3742b;
import com.bytedance.crash.entity.C3743c;
import com.bytedance.crash.entity.C3744d;
import com.bytedance.crash.entity.C3746e;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.runtime.C3840b;
import com.bytedance.crash.upload.C3886a;
import com.bytedance.crash.upload.C3908i;
import com.bytedance.crash.upload.CrashUploader;
import com.bytedance.crash.util.C3949m;
import com.bytedance.crash.util.C3962t;
import com.bytedance.crash.util.C3968x;
import com.bytedance.p203b.C3481a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.google.firebase.messaging.Constants;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GwpAsan {

    /* renamed from: a */
    public static String[] f11565a;

    /* renamed from: b */
    public static boolean f11566b;

    /* renamed from: c */
    public static boolean f11567c;

    /* renamed from: d */
    public static File f11568d;

    /* renamed from: e */
    public static Context f11569e;

    /* renamed from: f */
    private static JSONArray f11570f;

    /* renamed from: g */
    private static String f11571g;

    /* renamed from: h */
    private static String f11572h;

    /* renamed from: i */
    private static String f11573i;

    /* renamed from: j */
    private static String f11574j;

    /* renamed from: k */
    private static boolean f11575k;

    /* renamed from: m */
    private static boolean f11576m;

    /* renamed from: n */
    private static boolean f11577n;

    /* renamed from: o */
    private static String f11578o;

    /* renamed from: p */
    private static File f11579p;

    /* renamed from: l */
    private boolean f11580l;

    /* renamed from: a */
    public static Thread m15525a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    public static native int gwpAsanNativeInit(int i, String[] strArr);

    /* renamed from: a */
    public boolean mo15274a() {
        C3968x.m16536b("XASAN", "loadLibrary...");
        if (!this.f11580l) {
            try {
                C3481a.m14718a("npth_xasan", f11569e);
                this.f11580l = true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return this.f11580l;
    }

    /* renamed from: b */
    public void mo15275b() {
        if (f11566b) {
            C3968x.m16536b("XASAN", "execute() Already running!");
            return;
        }
        File g = C3962t.m16505g(C3774m.m15609j());
        if (!g.exists() || !g.isDirectory() || !m15527a(g, "cfgclose")) {
            f11567c = false;
            if (C3774m.m15604e() || C3746e.m15488b()) {
                C3968x.m16536b("XASAN", "offline Test Mode");
                f11567c = true;
            } else if (!m15531c()) {
                C3968x.m16536b("XASAN", "xasan check time");
                return;
            }
            m15525a(new Thread("XAsanTracker") {
                /* class com.bytedance.crash.gwpasan.GwpAsan.C37551 */

                public void run() {
                    try {
                        if (!GwpAsan.this.mo15274a()) {
                            C3691b.m15203a().mo15175a("XAsanTracker Init Failed load Lib Fail");
                        } else if (GwpAsan.f11568d == null) {
                            C3968x.m16532a("XASAN", "mLogDirectory is null");
                        } else if (!GwpAsan.f11568d.exists() && !GwpAsan.f11568d.mkdir()) {
                            C3968x.m16532a("XASAN", "cannot create " + GwpAsan.f11568d);
                        } else if (!GwpAsan.m15528a(GwpAsan.f11567c)) {
                            C3968x.m16532a("XASAN", "init params failed");
                        } else {
                            String[] strArr = GwpAsan.f11565a;
                            strArr[5] = GwpAsan.f11568d.getAbsolutePath() + '/' + C3774m.m15606g();
                            GwpAsan.f11565a[6] = GwpAsan.f11568d.getAbsolutePath();
                            GwpAsan.f11565a[7] = GwpAsan.m15523a(GwpAsan.f11569e);
                            GwpAsan.f11566b = true;
                            int i = -1;
                            if (!(GwpAsan.f11565a == null || GwpAsan.f11565a[5] == null || GwpAsan.f11565a[6] == null || GwpAsan.f11565a[7] == null)) {
                                i = GwpAsan.gwpAsanNativeInit(Build.VERSION.SDK_INT, GwpAsan.f11565a);
                            }
                            if (1 != i) {
                                C3722c a = C3691b.m15203a();
                                a.mo15175a("XAsanTracker Init Failed code " + i);
                                return;
                            }
                            C3968x.m16536b("XASAN", "init end");
                        }
                    } catch (Throwable th) {
                        C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                    }
                }
            }).start();
        }
    }

    /* renamed from: c */
    private static boolean m15531c() {
        File c = C3962t.m16491c(C3774m.m15609j());
        if (!c.exists() || !c.isDirectory()) {
            c.mkdirs();
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (m15527a(c, "gwpfile")) {
            try {
                long parseLong = Long.parseLong(C3949m.m16426e(f11579p));
                int i = 7;
                int a = C3840b.m15871a(7);
                if (a <= 7) {
                    i = a;
                }
                int i2 = (currentTimeMillis > parseLong ? 1 : (currentTimeMillis == parseLong ? 0 : -1));
                if (i2 >= 0 && currentTimeMillis - parseLong < ((long) (i * 24 * 3600))) {
                    C3722c a2 = C3691b.m15203a();
                    a2.mo15175a("XAsanCheckTime Less than " + i + " days lastTime:" + parseLong + " currentTime:" + currentTimeMillis);
                    return false;
                } else if (i2 >= 0 && currentTimeMillis - parseLong >= ((long) (i * 24 * 3600))) {
                    C3949m.m16412a(f11579p);
                    return true;
                } else if (parseLong > currentTimeMillis) {
                    C3722c a3 = C3691b.m15203a();
                    a3.mo15175a("XAsanCheckTime lastTime:" + parseLong + " currentTime:" + currentTimeMillis);
                    return false;
                }
            } catch (Throwable th) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            }
        }
        return true;
    }

    /* renamed from: a */
    public static String m15523a(Context context) {
        String str = f11578o;
        if (str != null) {
            return str;
        }
        if (new File(context.getApplicationInfo().nativeLibraryDir, "libnpth_dumper.so").exists()) {
            f11578o = context.getApplicationInfo().nativeLibraryDir;
        }
        return f11578o;
    }

    /* renamed from: b */
    private static String m15529b(String str) {
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

    /* renamed from: a */
    public static void m15526a(String str) {
        File[] listFiles = C3962t.m16491c(f11569e).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!file.isFile()) {
                    try {
                        m15530b(file, str);
                    } catch (Throwable th) {
                        C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m15528a(boolean z) {
        try {
            String[] strArr = new String[8];
            f11565a = strArr;
            if (f11570f == null) {
                if (f11575k) {
                    if (z) {
                        strArr[0] = "0";
                        strArr[1] = "8192";
                        strArr[2] = "150";
                        strArr[3] = "0";
                        strArr[4] = "0";
                    } else {
                        strArr[0] = "0";
                        strArr[1] = "64";
                        strArr[2] = "5000";
                        strArr[3] = "0";
                        strArr[4] = "1";
                    }
                    C3968x.m16536b("XASAN", "Start Init Param");
                    return true;
                }
                Thread.sleep(15000);
                f11570f = C3840b.m15902t();
                C3968x.m16536b("XASAN", "Get Config Init Param again");
            }
            JSONArray jSONArray = f11570f;
            if (jSONArray != null && jSONArray.length() > 0) {
                if (z) {
                    f11565a[0] = f11570f.optString(0);
                    String[] strArr2 = f11565a;
                    strArr2[1] = "8192";
                    strArr2[2] = "150";
                    strArr2[3] = f11570f.optString(3);
                    f11565a[4] = "0";
                } else {
                    for (int i = 0; i < f11570f.length(); i++) {
                        f11565a[i] = f11570f.optString(i);
                    }
                }
                C3968x.m16536b("XASAN", "Conifig Init Param ok");
                return true;
            }
        } catch (Throwable th) {
            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m15527a(File file, String str) {
        File[] listFiles = file.listFiles();
        for (File file2 : listFiles) {
            try {
                if (!file2.getName().isEmpty() && !file2.isDirectory() && file2.getName().equals(str) && file2.length() >= 0) {
                    f11579p = file2.getAbsoluteFile();
                    return true;
                }
            } catch (Throwable th) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            }
        }
        return false;
    }

    /* renamed from: b */
    private static void m15530b(File file, String str) {
        String str2;
        IOException e;
        String str3;
        Throwable th;
        String str4;
        Object th2;
        File file2;
        String str5;
        Object th3;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12 = "gwp_asan_type";
        String str13 = "\\s";
        String str14 = "pid:";
        String str15 = "XASAN";
        File file3 = new File(file, "tombstone.txt");
        C3742b bVar = new C3742b();
        try {
            JSONArray b = C3949m.m16418b(file3.getAbsolutePath());
            if (b == null) {
                C3949m.m16412a(file);
                return;
            }
            int i = 0;
            int a = m15522a(b, 0, str14);
            if (a < 0) {
                C3949m.m16412a(file);
                return;
            }
            String[] split = b.optString(a, null).trim().split(str13);
            String str16 = null;
            while (i < split.length) {
                try {
                    try {
                        String str17 = split[i];
                        if (str14.equals(str17)) {
                            int i2 = i + 1;
                            String str18 = split[i2];
                            str10 = str14;
                            int length = split[i2].length() - 1;
                            str11 = str13;
                            bVar.mo15241a("pid", Long.decode(str18.substring(0, length)));
                        } else {
                            str11 = str13;
                            str10 = str14;
                            if ("tid:".equals(str17)) {
                                int i3 = i + 1;
                                bVar.mo15241a("tid", Long.decode(split[i3].substring(0, split[i3].length() - 1)));
                            } else if ("name:".equals(str17)) {
                                int i4 = i + 1;
                                str9 = str12;
                                bVar.mo15241a("crash_thread_name", (Object) split[i4].substring(0, split[i4].length() - 1));
                                str16 = split[i4].substring(0, split[i4].length() - 1);
                                i++;
                                str15 = str15;
                                str13 = str11;
                                str14 = str10;
                                str12 = str9;
                            }
                        }
                        str9 = str12;
                        i++;
                        str15 = str15;
                        str13 = str11;
                        str14 = str10;
                        str12 = str9;
                    } catch (IOException e2) {
                        e = e2;
                        str2 = str15;
                        C3968x.m16536b(str2, "upload IOException :" + e);
                        C3949m.m16412a(file);
                    } catch (Throwable th4) {
                        th = th4;
                        str3 = str15;
                        C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                        C3968x.m16536b(str3, "upload Throwable:" + th);
                        C3949m.m16412a(file);
                    }
                } catch (IOException e3) {
                    e = e3;
                    str2 = str15;
                    C3968x.m16536b(str2, "upload IOException :" + e);
                    C3949m.m16412a(file);
                } catch (Throwable th5) {
                    th = th5;
                    str3 = str15;
                    C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                    C3968x.m16536b(str3, "upload Throwable:" + th);
                    C3949m.m16412a(file);
                }
            }
            String str19 = str13;
            bVar.mo15241a("process_name", (Object) split[split.length - 2]);
            StringBuilder sb = new StringBuilder();
            int a2 = m15522a(b, a + 1, "Signal ");
            if (a2 < 0) {
                C3949m.m16412a(file);
                return;
            }
            sb.append(b.optString(a2, null));
            sb.append('\n');
            int a3 = m15522a(b, a2 + 1, "GWP-ASan message:");
            if (a3 < 0) {
                C3949m.m16412a(file);
                return;
            }
            String replace = b.optString(a3, null).replace("GWP-ASan message:", "abort message:");
            sb.append(replace);
            sb.append('\n');
            String str20 = "Double Free";
            if (replace.contains("Use After Free")) {
                f11571g = "Use After Free";
            } else if (replace.contains(str20)) {
                f11571g = str20;
            } else if (replace.contains("Buffer Overflow")) {
                f11571g = "Buffer Overflow";
            } else if (replace.contains("Buffer Underflow")) {
                f11571g = "Buffer Underflow";
            } else if (replace.contains("Invalid Free")) {
                f11571g = "Invalid Free";
            } else {
                f11571g = "Unknown";
            }
            bVar.mo15235a(str12, f11571g);
            int a4 = m15522a(b, a3 + 1, "backtrace:");
            if (a4 < 0) {
                C3949m.m16412a(file);
                return;
            }
            String str21 = "    #00";
            int i5 = a4 + 1;
            while (i5 < b.length()) {
                String optString = b.optString(i5, null);
                if (!optString.startsWith("    #")) {
                    break;
                }
                sb.append(optString.trim());
                sb.append('\n');
                if (str20.equals(f11571g)) {
                    str8 = "    #03";
                } else {
                    str8 = str21;
                }
                if (optString.endsWith("libc.so") || optString.endsWith("libc++_shared.so")) {
                    if (optString.startsWith("    #01")) {
                        String[] split2 = m15524a(optString, "==/lib/", ".so").trim().split("/");
                        String substring = split2[1].substring(split2[1].lastIndexOf(47) + 1);
                        f11572h = substring;
                        if (!substring.isEmpty()) {
                            bVar.mo15235a("gwp_asan_fatal_lib", f11572h);
                        }
                    }
                } else if (optString.startsWith(str8)) {
                    String[] split3 = m15524a(optString, "==/lib/", ".so").trim().split("/");
                    String substring2 = split3[1].substring(split3[1].lastIndexOf(47) + 1);
                    f11572h = substring2;
                    if (substring2.length() >= 1 && !f11572h.isEmpty()) {
                        bVar.mo15235a("gwp_asan_fatal_lib", f11572h);
                    }
                }
                if (str != null) {
                    if (optString.contains(str) || "all".equals(str)) {
                        f11577n = true;
                    }
                } else if (optString.contains(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                    f11577n = true;
                }
                i5++;
                str21 = str8;
                str20 = str20;
            }
            String sb2 = sb.toString();
            int a5 = m15522a(b, i5, "deallocated by thread") + 1;
            while (true) {
                if (a5 >= b.length()) {
                    break;
                }
                String optString2 = b.optString(a5, null);
                if ((optString2.startsWith("    #01") || optString2.startsWith("    #02")) && !optString2.endsWith("libnpth_xasan.so") && !optString2.endsWith("libc++_shared.so")) {
                    String[] split4 = m15524a(optString2, "==/lib/", ".so").trim().split("/");
                    String substring3 = split4[1].substring(split4[1].lastIndexOf(47) + 1);
                    f11573i = substring3;
                    if (substring3.length() >= 1 && !f11573i.isEmpty()) {
                        bVar.mo15235a("gwp_asan_deallocated_lib", f11573i);
                        break;
                    }
                }
                a5++;
            }
            int a6 = m15522a(b, a5, "allocated by thread") + 1;
            while (true) {
                if (a6 >= b.length()) {
                    break;
                }
                String optString3 = b.optString(a6, null);
                if ((optString3.startsWith("    #01") || optString3.startsWith("    #02")) && !optString3.endsWith("libnpth_xasan.so") && !optString3.endsWith("libc++_shared.so")) {
                    String[] split5 = m15524a(optString3, "==/lib/", ".so").trim().split("/");
                    String substring4 = split5[1].substring(split5[1].lastIndexOf(47) + 1);
                    f11574j = substring4;
                    if (substring4.length() >= 1 && !f11574j.isEmpty()) {
                        bVar.mo15235a("gwp_asan_allocated_lib", f11574j);
                        break;
                    }
                }
                a6++;
            }
            int a7 = m15522a(b, a6, "build id:");
            if (a7 > 0) {
                JSONArray jSONArray = new JSONArray();
                int i6 = a7 + 1;
                while (i6 < b.length()) {
                    String optString4 = b.optString(i6, null);
                    if (optString4.startsWith("    /")) {
                        String trim = optString4.trim();
                        str7 = str19;
                        String[] split6 = trim.split(str7);
                        if (split6.length >= 3) {
                            jSONArray.put(new JSONObject().put("lib_name", split6[0].substring(split6[0].lastIndexOf(47) + 1)).put("lib_uuid", m15529b(split6[split6.length - 1].substring(0, split6[split6.length - 1].length() - 1))));
                            i6++;
                            str19 = str7;
                        }
                    } else {
                        str7 = str19;
                    }
                    i6++;
                    str19 = str7;
                }
                bVar.mo15241a("crash_lib_uuid", (Object) jSONArray);
            }
            bVar.mo15241a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (Object) sb.toString());
            try {
                if (f11569e == null) {
                    f11569e = C3774m.m15609j();
                }
                Header b2 = Header.m15402b(f11569e);
                try {
                    b2.mo15227f().put("aid", 1314);
                    str4 = str15;
                } catch (JSONException e4) {
                    str4 = str15;
                    C3968x.m16536b(str4, "upload KEY_AID JSONException:" + e4);
                } catch (Throwable th6) {
                    th2 = th6;
                    C3968x.m16536b(str4, "upload body Throwable:" + th2);
                    C3949m.m16412a(file);
                }
                bVar.mo15231a(b2);
                bVar.mo15241a("is_native_crash", (Object) 1);
                bVar.mo15241a("crash_time", Long.valueOf(System.currentTimeMillis()));
                bVar.mo15235a("gwp_asan_app", f11569e.getPackageName());
                if (f11577n) {
                    f11576m = true;
                    if (sb2 == null || str16 == null || replace == null) {
                        file2 = file;
                    } else {
                        try {
                            C3744d a8 = C3744d.m15482a(null, sb2, replace, str16, "1");
                            a8.mo15235a(str12, f11571g);
                            a8.mo15235a("gwp_asan_allocated_lib", f11574j);
                            a8.mo15235a("gwp_asan_deallocated_lib", f11573i);
                            a8.mo15235a("gwp_asan_fatal_lib", f11572h);
                            if (f11576m) {
                                str6 = "true";
                            } else {
                                str6 = "false";
                            }
                            a8.mo15235a("has_gwp_asan", str6);
                            file2 = file;
                            C3908i.m16190a(a8, C3743c.f11533a, System.currentTimeMillis(), file2);
                        } catch (Throwable th7) {
                            th3 = th7;
                            C3968x.m16536b(str4, "upload exception:" + th3);
                            C3949m.m16412a(file);
                            return;
                        }
                    }
                    if (CrashUploader.m16085a(C3774m.m15611l().getNativeCrashUploadUrl(), bVar.mo15252e().toString(), file2, null).mo15579a()) {
                        if (f11576m) {
                            str5 = "true";
                        } else {
                            str5 = "false";
                        }
                        bVar.mo15235a("has_gwp_asan", str5);
                        C3886a.m16117e();
                        C3949m.m16412a(file);
                    }
                }
            } catch (Throwable th8) {
                th2 = th8;
                str4 = str15;
                C3968x.m16536b(str4, "upload body Throwable:" + th2);
                C3949m.m16412a(file);
            }
        } catch (IOException e5) {
            e = e5;
            str2 = str15;
            C3968x.m16536b(str2, "upload IOException :" + e);
            C3949m.m16412a(file);
        } catch (Throwable th9) {
            th = th9;
            str3 = str15;
            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            C3968x.m16536b(str3, "upload Throwable:" + th);
            C3949m.m16412a(file);
        }
    }

    /* renamed from: a */
    private static int m15522a(JSONArray jSONArray, int i, String str) {
        while (i < jSONArray.length()) {
            String optString = jSONArray.optString(i, null);
            if (optString != null && optString.startsWith(str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    private static String m15524a(String str, String str2, String str3) {
        int indexOf = str.indexOf(str2);
        int indexOf2 = str.indexOf(str3);
        if (indexOf >= 0 && indexOf2 >= 0) {
            return str.substring(indexOf, indexOf2).substring(str2.length());
        }
        return "null";
    }

    public GwpAsan(boolean z, Context context, File file, JSONArray jSONArray) {
        context = context == null ? C3774m.m15609j() : context;
        f11575k = z;
        f11569e = context;
        f11568d = file;
        f11570f = jSONArray;
        f11576m = false;
        f11577n = false;
    }
}
