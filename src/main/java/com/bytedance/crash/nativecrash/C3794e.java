package com.bytedance.crash.nativecrash;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.crash.C3691b;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashFilter;
import com.bytedance.crash.entity.C3742b;
import com.bytedance.crash.entity.C3746e;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.runtime.C3859j;
import com.bytedance.crash.runtime.C3867o;
import com.bytedance.crash.util.C3931ae;
import com.bytedance.crash.util.C3949m;
import com.bytedance.crash.util.C3954p;
import com.bytedance.crash.util.C3955q;
import com.bytedance.crash.util.C3962t;
import com.bytedance.crash.util.C3970z;
import com.bytedance.crash.util.NativeTools;
import com.google.firebase.messaging.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.nativecrash.e */
public final class C3794e {

    /* renamed from: e */
    private static Boolean f11669e;

    /* renamed from: a */
    private final Context f11670a;

    /* renamed from: b */
    private C3796b f11671b;

    /* renamed from: c */
    private String f11672c;

    /* renamed from: d */
    private C3787a f11673d;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.crash.nativecrash.e$b */
    public class C3796b {

        /* renamed from: a */
        public final C3818j f11674a;

        /* renamed from: b */
        public final C3788b f11675b;

        /* renamed from: d */
        private final File f11677d;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public File mo15325a() {
            return this.f11677d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo15326b() {
            return this.f11675b.mo15308a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo15327c() {
            try {
                if (this.f11674a.mo15340a() == null || this.f11674a.mo15345d() == null || !this.f11674a.mo15340a().contains("XAsanTracker") || !this.f11674a.mo15345d().contains("libnpth_xasan")) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                return false;
            }
        }

        public C3796b(File file) {
            this.f11677d = file;
            C3788b bVar = new C3788b(file);
            this.f11675b = bVar;
            C3818j jVar = new C3818j(file);
            this.f11674a = jVar;
            if (bVar.mo15308a() && jVar.mo15345d() == null) {
                jVar.mo15341a(file);
            }
        }
    }

    /* renamed from: a */
    public Map<String, String> mo15315a() {
        C3796b bVar = this.f11671b;
        if (bVar != null) {
            return bVar.f11675b.mo15310c();
        }
        return null;
    }

    /* renamed from: h */
    public boolean mo15324h() {
        return C3949m.m16412a(this.f11671b.mo15325a());
    }

    /* renamed from: e */
    public static long m15727e() {
        if (NativeTools.m16236b().mo15613e()) {
            return Long.MAX_VALUE;
        }
        if (Header.m15401a()) {
            return 3891200;
        }
        return 2867200;
    }

    /* renamed from: b */
    public String mo15319b() {
        C3796b bVar = this.f11671b;
        if (bVar == null) {
            return null;
        }
        String g = bVar.f11674a.mo15348g();
        if (g == null || g.isEmpty()) {
            return this.f11671b.f11675b.mo15309b();
        }
        return g;
    }

    /* renamed from: c */
    public boolean mo15320c() {
        C3796b bVar = this.f11671b;
        if (bVar != null) {
            return bVar.mo15326b();
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo15321d() {
        ICrashFilter crashFilter = C3774m.m15602c().getCrashFilter();
        if (crashFilter == null) {
            return true;
        }
        try {
            if (!crashFilter.onNativeCrashFilter(mo15319b(), "")) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            return true;
        }
    }

    /* renamed from: g */
    public JSONObject mo15323g() {
        try {
            C3742b bVar = new C3742b();
            m15735k(bVar);
            m15719a(bVar);
            m15734j(bVar);
            m15725c(bVar);
            m15728e(bVar);
            m15729f(bVar);
            m15731h(bVar);
            m15730g(bVar);
            m15723b(bVar);
            String str = mo15315a().get("update_version_code");
            if (!TextUtils.isEmpty(str)) {
                try {
                    long longValue = Long.decode(str).longValue();
                    if (longValue > 0) {
                        bVar.mo15252e().optJSONObject("header").put("update_version_code", longValue);
                        bVar.mo15252e().optJSONObject("header").put("version_get_time", 0);
                    }
                } catch (Throwable unused) {
                }
            }
            return bVar.mo15252e();
        } catch (Throwable th) {
            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m15733i() {
        Boolean bool = f11669e;
        if (bool != null) {
            return bool.booleanValue();
        }
        String[] strArr = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};
        for (int i = 0; i < 11; i++) {
            try {
                if (new File(strArr[i]).exists()) {
                    Boolean bool2 = true;
                    f11669e = bool2;
                    return bool2.booleanValue();
                }
            } catch (Throwable th) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            }
        }
        Boolean bool3 = false;
        f11669e = bool3;
        return bool3.booleanValue();
    }

    /* renamed from: f */
    public JSONObject mo15322f() {
        try {
            C3742b bVar = new C3742b();
            m15719a(bVar);
            m15732i(bVar);
            m15726d(bVar);
            m15723b(bVar);
            File g = C3962t.m16506g(this.f11671b.mo15325a());
            JSONObject e = bVar.mo15252e();
            Header header = new Header(this.f11670a);
            header.mo15223a(bVar.mo15252e().optJSONObject("header"));
            bVar.mo15231a(header);
            Header.m15403b(header);
            C3742b a = Header.m15399a(bVar.mo15252e().optString("process_name"), C3774m.m15609j(), bVar.mo15252e().optLong("app_start_time", 0), bVar.mo15252e().optLong("crash_time", 0));
            if (C3955q.m16453a(header.mo15227f())) {
                bVar.mo15239a(a.mo15253f().mo15227f());
            } else {
                C3955q.m16449a(header.mo15227f(), a.mo15253f().mo15227f());
            }
            C3955q.m16449a(bVar.mo15254g(), a.mo15254g());
            if (Header.m15405b(header.mo15227f())) {
                C3742b.m15432a(bVar.mo15252e(), "filters", "params_err", header.mo15227f().optString("params_err"));
            }
            C3949m.m16405a(g, e, false);
            return e;
        } catch (Throwable th) {
            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            return null;
        }
    }

    public C3794e(Context context) {
        this.f11670a = context;
    }

    /* renamed from: a */
    public void mo15318a(JSONObject jSONObject) {
        C3797f.m15751a(this.f11671b.f11674a, jSONObject);
    }

    /* renamed from: c */
    private void m15725c(C3742b bVar) {
        m15720a(bVar, this.f11671b.f11674a.mo15347f());
    }

    /* renamed from: d */
    private void m15726d(C3742b bVar) {
        m15720a(bVar, this.f11673d.mo15307f());
    }

    /* renamed from: h */
    private void m15731h(C3742b bVar) {
        bVar.mo15241a("logcat", (Object) C3859j.m15989a(this.f11671b.mo15325a().getName()));
    }

    /* renamed from: a */
    public void mo15316a(File file) {
        this.f11671b = new C3796b(file);
        this.f11672c = file.getName();
    }

    /* renamed from: a */
    private void m15719a(C3742b bVar) {
        bVar.mo15241a("is_native_crash", (Object) 1);
        bVar.mo15241a("repack_time", Long.valueOf(System.currentTimeMillis()));
        bVar.mo15241a("crash_uuid", (Object) this.f11671b.mo15325a().getName());
        bVar.mo15241a("jiffy", Long.valueOf(C3867o.C3868a.m16017a()));
    }

    /* renamed from: b */
    public static boolean m15724b(JSONObject jSONObject) {
        boolean z;
        int optInt = jSONObject.optInt("pid", -1);
        int optInt2 = jSONObject.optInt("start_pid", -1);
        if (optInt == -1 || optInt2 == -1) {
            C3742b.m15432a(jSONObject, "filters", "fork_crash", "false");
            return false;
        }
        if (optInt != optInt2) {
            z = true;
        } else {
            z = false;
        }
        C3742b.m15432a(jSONObject, "filters", "fork_crash", String.valueOf(z));
        if (optInt != optInt2) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m15730g(C3742b bVar) {
        File b = C3962t.m16489b(this.f11671b.mo15325a());
        if (b.exists()) {
            try {
                bVar.mo15241a("native_log", (Object) C3949m.m16419b(C3949m.m16396a(b.getAbsolutePath(), "\n"), "\n"));
            } catch (Throwable th) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.crash.nativecrash.e$a */
    public static class C3795a {
        /* renamed from: a */
        public static String m15746a(File file) {
            Throwable th;
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        C3954p.m16437a(bufferedReader2);
                        return "";
                    } else if (!readLine.startsWith("[FATAL:") || !readLine.contains("Please include Java exception stack in crash report ttwebview:")) {
                        C3954p.m16437a(bufferedReader2);
                        return "";
                    } else {
                        StringBuilder sb = new StringBuilder();
                        int indexOf = readLine.indexOf(" ttwebview:");
                        sb.append("Caused by: ");
                        sb.append("Please include Java exception stack in crash report");
                        sb.append("\n");
                        sb.append(readLine.substring(indexOf + 11));
                        sb.append("\n");
                        while (true) {
                            String readLine2 = bufferedReader2.readLine();
                            if (readLine2 != null) {
                                sb.append(readLine2);
                                sb.append("\n");
                            } else {
                                String sb2 = sb.toString();
                                C3954p.m16437a(bufferedReader2);
                                return sb2;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    try {
                        C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                        return "";
                    } finally {
                        C3954p.m16437a(bufferedReader);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                return "";
            }
        }
    }

    /* renamed from: b */
    private void m15723b(C3742b bVar) {
        boolean z;
        C3746e.m15487b(bVar.mo15252e());
        HashMap hashMap = new HashMap();
        if (m15733i()) {
            hashMap.put("is_root", "true");
            bVar.mo15241a("is_root", "true");
        } else {
            hashMap.put("is_root", "false");
            bVar.mo15241a("is_root", "false");
        }
        m15721a(hashMap);
        hashMap.put("sdk_version", "3.1.6-rc.53-lark.oversea");
        if (bVar.mo15252e().opt("java_data") != null) {
            z = true;
        } else {
            z = false;
        }
        hashMap.put("has_java_stack", String.valueOf(z));
        bVar.mo15240a();
        bVar.mo15243b(hashMap);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b A[Catch:{ all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0035  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m15729f(com.bytedance.crash.entity.C3742b r5) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.C3794e.m15729f(com.bytedance.crash.entity.b):void");
    }

    /* renamed from: i */
    private void m15732i(C3742b bVar) {
        C3787a aVar = this.f11673d;
        if (aVar != null) {
            try {
                String a = aVar.mo15302a();
                if (a != null) {
                    bVar.mo15241a("pid", (Object) a);
                }
                String b = this.f11673d.mo15303b();
                if (b != null) {
                    bVar.mo15241a("crash_thread_name", (Object) b);
                }
                long d = this.f11673d.mo15305d();
                if (d != 0) {
                    bVar.mo15241a("crash_time", Long.valueOf(d));
                }
                if (this.f11673d.mo15306e() != null) {
                    bVar.mo15241a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (Object) this.f11673d.mo15306e());
                } else {
                    Log.e("NATIVE", "AsanReport is Null\n");
                    bVar.mo15241a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "AsanReport is Null\n");
                }
                bVar.mo15241a("crash_type", (Object) CrashType.ASAN.toString());
                bVar.mo15241a("commit_id", "1");
                bVar.mo15241a("jenkins_job_id", "1");
            } catch (Throwable th) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            }
        }
    }

    /* renamed from: j */
    private void m15734j(C3742b bVar) {
        try {
            C3796b bVar2 = this.f11671b;
            if (bVar2 != null && bVar2.mo15327c()) {
                File file = new File(C3962t.m16522p(C3774m.m15609j()), "npth/configCrash/configFile");
                File file2 = new File(C3962t.m16522p(C3774m.m15609j()), "npth/configCrash/configInvalid");
                bVar.mo15241a("config_crash", "gwp_asan");
                file.renameTo(new File(C3962t.m16522p(C3774m.m15609j()), "npth/configCrash/oldConfigFile"));
                C3949m.m16430i(file);
                C3949m.m16412a(file2);
            }
        } catch (Throwable th) {
            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
        }
    }

    /* renamed from: a */
    private void m15721a(Map<String, String> map) {
        String str;
        boolean a = m15722a(this.f11671b.mo15325a(), "asan_report");
        if (a) {
            String str2 = "true";
            if (a) {
                str = str2;
            } else {
                str = "false";
            }
            map.put("has_asan", str);
            C3787a aVar = this.f11673d;
            if (aVar != null) {
                if (!aVar.mo15304c()) {
                    str2 = "false";
                }
                map.put("has_asan_file", str2);
            }
        }
    }

    /* renamed from: e */
    private void m15728e(C3742b bVar) {
        if (!C3949m.m16411a(bVar, this.f11671b.mo15325a())) {
            bVar.mo15244b(C3931ae.m16319a(C3774m.m15609j()));
            bVar.mo15235a("has_callback", "false");
        } else {
            bVar.mo15235a("has_callback", "true");
        }
        if (bVar.mo15252e().opt("storage") == null) {
            bVar.mo15244b(C3931ae.m16319a(C3774m.m15609j()));
        }
        Header header = new Header(this.f11670a);
        header.mo15223a(bVar.mo15252e().optJSONObject("header"));
        bVar.mo15231a(header);
        Header.m15403b(header);
        C3742b a = Header.m15399a(bVar.mo15252e().optString("process_name"), C3774m.m15609j(), bVar.mo15252e().optLong("app_start_time", 0), bVar.mo15252e().optLong("crash_time", 0));
        if (C3955q.m16453a(header.mo15227f())) {
            bVar.mo15239a(a.mo15253f().mo15227f());
        } else {
            C3955q.m16449a(header.mo15227f(), a.mo15253f().mo15227f());
        }
        C3955q.m16449a(bVar.mo15254g(), a.mo15254g());
        if (Header.m15405b(header.mo15227f())) {
            C3742b.m15432a(bVar.mo15252e(), "filters", "params_err", header.mo15227f().optString("params_err"));
        }
        C3970z.m16559a(bVar, header, CrashType.NATIVE);
    }

    /* renamed from: k */
    private void m15735k(C3742b bVar) {
        Map<String, String> a = mo15315a();
        if (a != null && bVar != null) {
            String str = a.get("process_name");
            if (str != null) {
                bVar.mo15241a("process_name", (Object) str);
            }
            String str2 = a.get("start_time");
            if (str2 != null) {
                try {
                    bVar.mo15229a(Long.decode(str2).longValue(), 0);
                } catch (Throwable th) {
                    C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                }
            }
            String str3 = a.get("pid");
            if (str3 != null) {
                try {
                    bVar.mo15241a("pid", Long.decode(str3));
                } catch (Throwable th2) {
                    C3691b.m15203a().mo15177a("NPTH_CATCH", th2);
                }
            }
            String str4 = a.get("start_pid");
            if (str4 != null) {
                try {
                    bVar.mo15241a("start_pid", Long.decode(str4));
                } catch (Throwable th3) {
                    C3691b.m15203a().mo15177a("NPTH_CATCH", th3);
                }
            }
            String str5 = a.get("crash_thread_name");
            if (str5 != null) {
                bVar.mo15241a("crash_thread_name", (Object) str5);
            }
            String str6 = a.get("crash_time");
            if (str6 != null) {
                try {
                    bVar.mo15241a("crash_time", Long.decode(str6));
                } catch (Throwable th4) {
                    C3691b.m15203a().mo15177a("NPTH_CATCH", th4);
                }
            }
            bVar.mo15241a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (Object) mo15319b());
        }
    }

    /* renamed from: a */
    public void mo15317a(String str) {
        this.f11673d = new C3787a(str);
        this.f11672c = str;
    }

    /* renamed from: a */
    private void m15720a(C3742b bVar, Map<String, String> map) {
        if (!map.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (String str : map.keySet()) {
                String i = NativeTools.m16237i(map.get(str));
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("lib_name", str);
                    jSONObject.put("lib_uuid", i);
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    C3691b.m15203a().mo15177a("NPTH_CATCH", e);
                }
            }
            bVar.mo15241a("crash_lib_uuid", (Object) jSONArray);
        }
    }

    /* renamed from: a */
    private boolean m15722a(File file, String str) {
        File[] listFiles = file.listFiles();
        for (File file2 : listFiles) {
            try {
                if (!file2.isDirectory() && file2.getName().contains(str)) {
                    return true;
                }
            } catch (Throwable th) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                C3949m.m16412a(file2);
            }
        }
        return false;
    }
}
