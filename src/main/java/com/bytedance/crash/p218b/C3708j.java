package com.bytedance.crash.p218b;

import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.crash.C3691b;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.C3775n;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.C3742b;
import com.bytedance.crash.entity.C3746e;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.nativecrash.C3794e;
import com.bytedance.crash.nativecrash.C3809i;
import com.bytedance.crash.p217a.C3687a;
import com.bytedance.crash.runtime.C3840b;
import com.bytedance.crash.runtime.C3859j;
import com.bytedance.crash.runtime.C3866n;
import com.bytedance.crash.runtime.C3867o;
import com.bytedance.crash.runtime.C3869p;
import com.bytedance.crash.runtime.p227a.C3824a;
import com.bytedance.crash.runtime.p227a.C3835e;
import com.bytedance.crash.upload.C3919m;
import com.bytedance.crash.upload.CrashUploader;
import com.bytedance.crash.util.C3927aa;
import com.bytedance.crash.util.C3930ad;
import com.bytedance.crash.util.C3933b;
import com.bytedance.crash.util.C3937e;
import com.bytedance.crash.util.C3945i;
import com.bytedance.crash.util.C3949m;
import com.bytedance.crash.util.C3953o;
import com.bytedance.crash.util.C3955q;
import com.bytedance.crash.util.C3962t;
import com.bytedance.crash.util.C3968x;
import com.bytedance.crash.util.C3969y;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.b.j */
public class C3708j {

    /* renamed from: a */
    public static File f11440a = null;

    /* renamed from: b */
    private static File f11441b = null;

    /* renamed from: c */
    private static FileObserver f11442c = null;

    /* renamed from: d */
    private static volatile AbstractRunnableC3714a f11443d = null;

    /* renamed from: e */
    private static File f11444e = null;

    /* renamed from: f */
    private static boolean f11445f = false;

    /* renamed from: g */
    private static long f11446g = -1;

    /* renamed from: h */
    private static long f11447h = -1;

    /* renamed from: i */
    private static File f11448i = null;

    /* renamed from: j */
    private static volatile boolean f11449j = false;

    /* renamed from: k */
    private static File f11450k = null;

    /* renamed from: l */
    private static int f11451l = 0;

    /* renamed from: m */
    private static C3742b f11452m = null;

    /* renamed from: n */
    private static long f11453n = -1;

    /* renamed from: o */
    private static Runnable f11454o = new Runnable() {
        /* class com.bytedance.crash.p218b.C3708j.RunnableC37123 */

        public void run() {
            File file = C3708j.f11440a;
            synchronized (C3708j.class) {
                C3708j.m15318d();
            }
            C3949m.m16412a(file);
        }
    };

    /* renamed from: a */
    public static Thread m15297a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.b.j$a */
    public static abstract class AbstractRunnableC3714a implements Runnable {

        /* renamed from: b */
        protected boolean f11459b;

        AbstractRunnableC3714a() {
        }
    }

    /* renamed from: a */
    public static void m15304a(File file) {
        if (!f11445f) {
            C3968x.m16530a((Object) "newAnr start");
            f11445f = true;
            final File file2 = new File(file, "proc/" + Process.myPid());
            file2.mkdirs();
            FileObserverC37091 r3 = new FileObserver(file2.getAbsolutePath(), 4095) {
                /* class com.bytedance.crash.p218b.C3708j.FileObserverC37091 */

                public void onEvent(int i, final String str) {
                    if (!TextUtils.isEmpty(str) && (i & 8) != 0 && str.startsWith("anr_info_")) {
                        C3866n.m16016b().mo15509a(new Runnable() {
                            /* class com.bytedance.crash.p218b.C3708j.FileObserverC37091.RunnableC37101 */

                            public void run() {
                                long j;
                                if (!C3809i.m15791e()) {
                                    String[] split = str.substring(9).split("_");
                                    if (split.length >= 1) {
                                        try {
                                            j = Long.decode(split[0]).longValue();
                                        } catch (Throwable unused) {
                                            j = System.currentTimeMillis();
                                        }
                                    } else {
                                        j = System.currentTimeMillis();
                                    }
                                    try {
                                        C3968x.m16531a("find anr by fileObserver");
                                        File file = new File(file2, str);
                                        C3708j.m15306a(file, C3949m.m16426e(file), j, false);
                                    } catch (IOException unused2) {
                                    }
                                }
                            }
                        }, 500);
                    }
                }
            };
            f11442c = r3;
            r3.startWatching();
        }
    }

    /* renamed from: a */
    public static synchronized void m15307a(boolean z) {
        File file;
        synchronized (C3708j.class) {
            if (C3809i.m15791e()) {
                if (z) {
                    if (f11443d == null && (file = f11444e) != null) {
                        m15314b(file);
                    }
                } else if (f11443d != null) {
                    f11443d.f11459b = true;
                    f11443d = null;
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m15309a(File file, File file2, long j, String str) {
        try {
            JSONObject jSONObject = new JSONObject(C3949m.m16426e(file2));
            C3969y.m16546a(jSONObject, file);
            List<String> a = C3687a.m15191a().mo15096a(j, str);
            if (CrashUploader.m16082a(CrashType.ANR.getName(), CrashUploader.m16088a(CrashUploader.m16100b(), jSONObject.optJSONObject("header")), jSONObject.toString(), new C3949m.C3951b(file, true), new C3949m.C3951b(C3919m.m16230g(), false), C3869p.m16028b(j), C3809i.m15778a(jSONObject.optJSONArray("alive_pids"))).mo15579a()) {
                C3687a.m15193a(a, str);
                C3949m.m16412a(file);
                if (!C3775n.m15660k()) {
                    C3949m.m16412a(C3962t.m16514j(C3774m.m15609j()));
                }
            }
            return true;
        } catch (IOException | JSONException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m15306a(File file, String str, long j, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = f11447h;
        if (j2 <= 0 || currentTimeMillis - j2 >= 120000) {
            f11448i = file;
            f11447h = currentTimeMillis;
            m15300a(j);
            C3866n.m16016b().mo15511b(f11454o);
            JSONArray jSONArray = null;
            try {
                File file2 = f11441b;
                if (file2 != null) {
                    jSONArray = C3949m.m16418b(file2.getAbsolutePath());
                }
            } catch (IOException unused) {
            }
            try {
                C3742b.m15432a(f11452m.mo15252e(), "filters", "anr_step", "complete");
                m15305a(null, f11440a, C3933b.m16337c(C3774m.m15609j()), C3775n.m15660k(), f11453n, C3774m.m15612m(), j, f11452m.mo15252e(), str, jSONArray, z);
            } catch (Throwable th) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            }
        }
    }

    /* renamed from: a */
    private static void m15308a(boolean z, long j, long j2) {
        long currentTimeMillis = System.currentTimeMillis();
        f11453n = currentTimeMillis;
        Context j3 = C3774m.m15609j();
        JSONObject jSONObject = new JSONObject();
        C3955q.m16447a(jSONObject, "current_message", C3716l.m15342k());
        C3955q.m16447a(jSONObject, "history_message", C3716l.m15336e());
        C3955q.m16447a(jSONObject, "pending_messages", C3716l.m15328a(100, SystemClock.uptimeMillis()));
        long currentTimeMillis2 = System.currentTimeMillis();
        String a = C3930ad.m16301a(Looper.getMainLooper().getThread().getStackTrace());
        long currentTimeMillis3 = System.currentTimeMillis();
        String p = C3962t.m16522p(C3774m.m15609j());
        File file = new File(p, "npth/killHistory/proc/" + Process.myPid() + "/trace_" + currentTimeMillis + "/");
        f11440a = file;
        file.mkdirs();
        long currentTimeMillis4 = System.currentTimeMillis();
        C3949m.m16405a(new File(f11440a, "looper_message.txt"), jSONObject, false);
        long currentTimeMillis5 = System.currentTimeMillis();
        File file2 = new File(f11440a, "main_stack.txt");
        try {
            file2.createNewFile();
        } catch (IOException unused) {
        }
        try {
            C3949m.m16402a(file2, a, false);
        } catch (IOException unused2) {
        }
        long currentTimeMillis6 = System.currentTimeMillis();
        File file3 = new File(f11440a, "trace.txt");
        f11441b = file3;
        C3869p.m16026a("anr_trace", file3.getAbsolutePath());
        if (NativeTools.m16239m()) {
            NativeTools.m16236b().mo15617g(file3.getAbsolutePath());
        }
        long currentTimeMillis7 = System.currentTimeMillis();
        C3869p.m16026a("after_trace", file3.getAbsolutePath());
        C3945i.m16375a(f11440a);
        long currentTimeMillis8 = System.currentTimeMillis();
        try {
            C3742b f = m15321f();
            C3955q.m16449a(f.mo15252e(), jSONObject);
            C3933b.m16328a(j3, f.mo15252e());
            f.mo15241a("is_background", Boolean.valueOf(C3693b.m15221e()));
            f.mo15246c("npth_trace_cost", String.valueOf(currentTimeMillis7 - currentTimeMillis));
            JSONObject a2 = C3700e.m15243a(a);
            JSONObject jSONObject2 = null;
            m15299a(a2, (String) null, true);
            if (file3.length() < 500) {
                jSONObject2 = C3930ad.m16310b((String) null);
            }
            f.mo15241a("all_thread_stacks", jSONObject2);
            f.mo15241a("crash_time", Long.valueOf(currentTimeMillis));
            if (z) {
                f.mo15250d("anr_sig_time", C3937e.m16354b().format(new Date(j)));
                f.mo15250d("sig_to_begin_dump_cost", String.valueOf(currentTimeMillis - j));
            } else {
                f.mo15250d("anr_info_time", C3937e.m16354b().format(new Date(j2)));
                f.mo15250d("anrinfo_to_begin_dump_cost", String.valueOf(currentTimeMillis - j2));
            }
            f.mo15250d("crash_time", C3937e.m16354b().format(new Date(currentTimeMillis)));
            f.mo15250d("dump_loop_msg_cost", String.valueOf(currentTimeMillis2 - currentTimeMillis));
            f.mo15250d("dump_main_stack_cost", String.valueOf(currentTimeMillis3 - currentTimeMillis2));
            f.mo15250d("make_trace_dir_cost", String.valueOf(currentTimeMillis4 - currentTimeMillis3));
            f.mo15250d("write_loop_msg_cost", String.valueOf(currentTimeMillis5 - currentTimeMillis4));
            f.mo15250d("write_main_stack_cost", String.valueOf(currentTimeMillis6 - currentTimeMillis5));
            f.mo15250d("dump_trace_cost", String.valueOf(currentTimeMillis7 - currentTimeMillis6));
            f.mo15250d("dump_native_files_cost", String.valueOf(currentTimeMillis8 - currentTimeMillis7));
            f.mo15241a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (Object) a2.toString());
            C3742b a3 = C3835e.m15853a().mo15428a(CrashType.ANR, f);
            a3.mo15241a("logcat", (Object) C3859j.m15988a(f11440a));
            long j4 = f11447h;
            if (j4 > 0) {
                a3.mo15246c("last_anr_interval", String.valueOf(currentTimeMillis - j4));
            } else {
                a3.mo15246c("last_anr_interval", "none");
            }
            a3.mo15241a("alive_pids", (Object) C3809i.m15793g());
            a3.mo15241a("crash_uuid", (Object) C3774m.m15592a(currentTimeMillis, CrashType.ANR, false, false));
            JSONObject optJSONObject = a3.mo15252e().optJSONObject("filters");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
                a3.mo15241a("filters", optJSONObject);
            }
            try {
                optJSONObject.put("crash_length", C3693b.m15208a(currentTimeMillis));
                optJSONObject.put("disable_looper_monitor", String.valueOf(C3840b.m15890h()));
                optJSONObject.put("memory_leak", String.valueOf(a3.mo15251d()));
                optJSONObject.put("fd_leak", String.valueOf(a3.mo15245b()));
                optJSONObject.put("threads_leak", String.valueOf(a3.mo15248c()));
                optJSONObject.put("is_64_runtime", String.valueOf(NativeTools.m16236b().mo15613e()));
                optJSONObject.put("crash_after_crash", C3775n.m15660k() ? "true" : "false");
                optJSONObject.put("from_file", String.valueOf(C3700e.m15245b()));
                optJSONObject.put("last_resume_activity", C3824a.m15819d().mo15404i());
                optJSONObject.put("start_uuid", C3774m.m15606g());
                optJSONObject.put("has_signal", String.valueOf(z));
            } catch (Throwable unused3) {
            }
            f11452m = a3;
            C3949m.m16405a(new File(f11440a, "origin_json.txt"), a3.mo15252e(), false);
        } catch (Throwable th) {
            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
        }
    }

    /* renamed from: a */
    public static boolean m15310a(JSONObject jSONObject) {
        boolean z;
        String str = "";
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE));
            str = jSONObject2.optString("mainStackFromTrace");
            z = !jSONObject2.optBoolean("invalid", false);
        } catch (JSONException unused) {
            z = false;
        }
        if (TextUtils.isEmpty(str) || str.contains("at InvalidStack.NoStackAvailable(Invalid.java:1).\n")) {
            return false;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042 A[Catch:{ Exception -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m15303a(com.bytedance.crash.entity.C3742b r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, boolean r10) {
        /*
            java.lang.String r0 = "data"
            r1 = 0
            org.json.JSONObject r2 = r5.mo15252e()     // Catch:{ JSONException -> 0x0011 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0012 }
            java.lang.String r4 = r2.optString(r0)     // Catch:{ JSONException -> 0x0012 }
            r3.<init>(r4)     // Catch:{ JSONException -> 0x0012 }
            goto L_0x0016
        L_0x0011:
            r2 = r1
        L_0x0012:
            org.json.JSONObject r3 = m15298a(r1, r1)
        L_0x0016:
            if (r9 == 0) goto L_0x0031
            java.lang.String r9 = "mainStackFromTrace"
            r3.put(r9, r6)     // Catch:{ Exception -> 0x0047 }
            java.lang.String r9 = "crash_lib_uuid"
            com.bytedance.crash.util.NativeTools r1 = com.bytedance.crash.util.NativeTools.m16236b()     // Catch:{ Exception -> 0x0047 }
            org.json.JSONArray r6 = r1.mo15624k(r6)     // Catch:{ Exception -> 0x0047 }
            r2.put(r9, r6)     // Catch:{ Exception -> 0x0047 }
            java.lang.String r6 = r3.toString()     // Catch:{ Exception -> 0x0047 }
            r2.put(r0, r6)     // Catch:{ Exception -> 0x0047 }
        L_0x0031:
            java.lang.String r6 = "main_stack_2nd"
            java.lang.String r9 = "\n"
            java.lang.String[] r7 = r7.split(r9)     // Catch:{ Exception -> 0x0047 }
            java.util.List r7 = java.util.Arrays.asList(r7)     // Catch:{ Exception -> 0x0047 }
            r5.mo15236a(r6, r7)     // Catch:{ Exception -> 0x0047 }
            if (r10 == 0) goto L_0x0047
            java.lang.String r6 = "anr_replace_mainstack"
            r5.mo15235a(r6, r8)     // Catch:{ Exception -> 0x0047 }
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p218b.C3708j.m15303a(com.bytedance.crash.entity.b, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    /* renamed from: a */
    public static void m15305a(File file, File file2, String str, boolean z, long j, long j2, long j3, JSONObject jSONObject, String str2, JSONArray jSONArray, boolean z2) {
        String str3;
        boolean z3;
        long currentTimeMillis = System.currentTimeMillis();
        C3869p.m16026a("pack_upload_anr", "0");
        C3742b bVar = new C3742b(jSONObject);
        bVar.mo15241a("crash_time", Long.valueOf(j));
        bVar.mo15241a("app_start_time", Long.valueOf(j2));
        bVar.mo15241a("anr_time", Long.valueOf(j3));
        bVar.mo15241a("is_current_process", Boolean.valueOf(z2));
        bVar.mo15241a("process_name", (Object) str);
        bVar.mo15250d("crash_time", C3937e.m16354b().format(new Date(j)));
        bVar.mo15250d("anr_info_time", C3937e.m16354b().format(new Date(j3)));
        bVar.mo15250d("anr_upload_time", C3937e.m16354b().format(new Date(currentTimeMillis)));
        try {
            str3 = jSONObject.optJSONObject("filters").optString("has_signal", "");
        } catch (Throwable unused) {
            str3 = "";
        }
        if (str3 == "") {
            int i = (j > j3 ? 1 : (j == j3 ? 0 : -1));
            if (i > 0) {
                bVar.mo15235a("has_signal", String.valueOf(false));
            } else if (i < 0) {
                bVar.mo15235a("has_signal", String.valueOf(true));
            } else {
                bVar.mo15235a("has_signal", "unknow");
            }
        }
        C3705h hVar = new C3705h();
        hVar.mo15140a(str, C3774m.m15609j().getPackageName());
        boolean z4 = !m15310a(jSONObject);
        if (jSONArray == null || C3955q.m16451a(jSONArray)) {
            bVar.mo15235a("anr_replace_mainstack", "OnlyJavaStack");
        } else {
            Pair<JSONObject, JSONObject> a = C3693b.m15207a(jSONArray, hVar, true);
            JSONObject jSONObject2 = (JSONObject) a.second;
            String a2 = m15296a(bVar, (JSONObject) a.first);
            if (z4 && a2 != "") {
                z4 = false;
            }
            if (jSONObject2 != null) {
                C3955q.m16447a(jSONObject, "all_thread_stacks", jSONObject2);
            }
        }
        m15301a(bVar);
        C3955q.m16447a(jSONObject, "anr_info", TextUtils.isEmpty(str2) ? "invalid" : str2);
        if (!TextUtils.isEmpty(str2)) {
            try {
                C3693b.m15213a(str2, hVar);
            } catch (Throwable th) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            }
        }
        if (C3693b.f11353d > 0) {
            bVar.mo15250d("anr_time_from_info", C3937e.m16354b().format(new Date(C3693b.f11353d)));
            if (f11446g > C3693b.f11353d) {
                bVar.mo15250d("anr_to_sig_cost", String.valueOf(f11446g - C3693b.f11353d));
            }
        }
        m15302a(bVar, j);
        m15313b(bVar);
        if (TextUtils.isEmpty(str2) || z || z4) {
            C3742b.m15432a(jSONObject, "filters", "aid", String.valueOf(jSONObject.optJSONObject("header").opt("aid")));
            C3955q.m16447a(jSONObject.optJSONObject("header"), "aid", (Object) 2010);
        }
        bVar.mo15235a("is_current_process", String.valueOf(z2));
        bVar.mo15235a("crash_after_crash", String.valueOf(z));
        hVar.mo15151c();
        bVar.mo15242b("top_cpu_process_name", hVar.mo15158e());
        C3955q.m16447a(jSONObject, "anr_atribute", hVar.mo15159f());
        hVar.mo15144a(jSONObject.optJSONObject("filters"));
        hVar.mo15157d(jSONObject);
        bVar.mo15234a("use_time", (j - C3774m.m15612m()) / 1000);
        bVar.mo15234a("dstate_count", C3693b.f11352c);
        bVar.mo15234a("thread_all_count", C3693b.f11351b);
        JSONArray optJSONArray = jSONObject.optJSONArray("history_message");
        if (optJSONArray != null) {
            long[] a3 = C3693b.m15215a(optJSONArray);
            bVar.mo15234a("history_message_cpu_avg", a3[0]);
            bVar.mo15234a("history_message_wall_avg", a3[1]);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("features_num");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("features_str");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            bVar.mo15241a("features_num", optJSONObject);
        }
        if (optJSONObject2 == null) {
            optJSONObject2 = new JSONObject();
            bVar.mo15241a("features_str", optJSONObject2);
        }
        hVar.mo15155c(optJSONObject);
        hVar.mo15150b(optJSONObject2);
        C3687a.m15191a().mo15100c();
        List<String> a4 = C3687a.m15191a().mo15096a(j, str);
        bVar.mo15236a("alogFiles", a4);
        C3949m.m16405a(new File(file2, "result_body.json"), jSONObject, false);
        File file3 = f11448i;
        if (file3 != null) {
            C3949m.m16412a(file3);
            f11448i = null;
            f11452m = null;
            f11441b = null;
        }
        C3969y.m16546a(jSONObject, file2);
        if (file == null) {
            z3 = CrashUploader.m16082a(CrashType.ANR.getName(), CrashUploader.m16088a(CrashUploader.m16100b(), jSONObject.optJSONObject("header")), jSONObject.toString(), new C3949m.C3951b(file2, true), new C3949m.C3951b(C3919m.m16230g(), false), C3869p.m16028b(j), C3809i.m15778a(jSONObject.optJSONArray("alive_pids"))).mo15579a();
        } else {
            z3 = CrashUploader.m16082a(CrashType.ANR.getName(), CrashUploader.m16088a(CrashUploader.m16100b(), jSONObject.optJSONObject("header")), jSONObject.toString(), new C3949m.C3951b(file2, true), new C3949m.C3951b(C3919m.m16230g(), false), new C3949m.C3951b(file.listFiles(new C3949m.C3950a(file2.getName())), false), C3869p.m16028b(j), C3809i.m15778a(jSONObject.optJSONArray("alive_pids"))).mo15579a();
        }
        if (z3) {
            C3687a.m15193a(a4, str);
            C3949m.m16412a(file2);
            if (!C3775n.m15660k()) {
                C3949m.m16412a(C3962t.m16514j(C3774m.m15609j()));
            }
        }
        C3869p.m16026a("upload_anr", z3 ? "success" : "failed");
    }

    /* renamed from: d */
    public static void m15318d() {
        f11440a = null;
        f11452m = null;
        f11441b = null;
    }

    /* renamed from: a */
    public static File m15295a() {
        if (f11450k == null) {
            File filesDir = C3774m.m15609j().getFilesDir();
            f11450k = new File(filesDir, "npth/has_anr_signal_" + C3933b.m16337c(C3774m.m15609j()).replaceAll(":", "_"));
        }
        return f11450k;
    }

    /* renamed from: b */
    public static void m15312b() {
        File a = m15295a();
        try {
            int intValue = Integer.decode(C3949m.m16421c(a.getAbsolutePath())).intValue();
            f11451l = intValue;
            if (intValue >= 2) {
                NativeTools.m16236b().mo15596a(false);
            } else {
                NativeTools.m16236b().mo15596a(true);
            }
        } catch (IOException unused) {
            NativeTools.m16236b().mo15596a(true);
        } catch (Throwable unused2) {
            C3949m.m16412a(a);
        }
    }

    /* renamed from: c */
    public static void m15316c() {
        File[] listFiles;
        File file = new File(C3962t.m16522p(C3774m.m15609j()), "npth/procanr/");
        if (!(!file.exists() || (listFiles = file.listFiles()) == null || listFiles.length == 0)) {
            for (File file2 : listFiles) {
                m15319d(file2);
                C3949m.m16412a(file2);
            }
        }
    }

    /* renamed from: e */
    public static void m15320e() {
        String str;
        String str2;
        String str3;
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        if (f11449j) {
            str = "doingTrace";
        } else {
            str = "noDoTrace";
        }
        sb.append(str);
        if (f11452m != null) {
            str2 = "_HasTraced";
        } else {
            str2 = "_NoTraced";
        }
        sb.append(str2);
        if (f11448i != null) {
            str3 = "_HasANRInfo";
        } else {
            str3 = "_NoANRInfo";
        }
        sb.append(str3);
        C3869p.m16026a("anr_sigquit", sb.toString());
        if (!f11449j && f11452m == null) {
            if (f11447h <= 0 || System.currentTimeMillis() - f11447h >= 100000) {
                if (NativeTools.m16236b().mo15621i()) {
                    try {
                        C3949m.m16402a(m15295a(), String.valueOf(f11451l + 1), false);
                    } catch (Throwable unused) {
                    }
                }
                synchronized (C3708j.class) {
                    if (!f11449j) {
                        if (f11452m == null) {
                            f11449j = true;
                            f11446g = currentTimeMillis;
                            C3866n.m16016b().mo15511b(f11454o);
                            m15308a(true, currentTimeMillis, 0L);
                            synchronized (C3708j.class) {
                                f11449j = false;
                                C3708j.class.notifyAll();
                            }
                            C3866n.m16016b().mo15509a(f11454o, 35000);
                            C3866n.m16016b().mo15509a(new Runnable() {
                                /* class com.bytedance.crash.p218b.C3708j.RunnableC37134 */

                                public void run() {
                                    if (NativeTools.m16236b().mo15621i()) {
                                        C3949m.m16412a(C3708j.m15295a());
                                    }
                                }
                            }, 2000);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: f */
    private static C3742b m15321f() {
        String str;
        C3742b bVar = new C3742b(new JSONObject());
        bVar.mo15241a("is_anr", (Object) 1);
        bVar.mo15241a("has_dump", (Object) "true");
        bVar.mo15241a("jiffy", Long.valueOf(C3867o.C3868a.m16017a()));
        C3746e.m15487b(bVar.mo15252e());
        bVar.mo15235a("sdk_version", "3.1.6-rc.53-lark");
        bVar.mo15235a("is_64_devices", String.valueOf(Header.m15401a()));
        bVar.mo15235a("is_64_runtime", String.valueOf(NativeTools.m16236b().mo15613e()));
        bVar.mo15235a("is_x86_devices", String.valueOf(Header.m15404b()));
        if (C3794e.m15733i()) {
            str = "true";
        } else {
            str = "false";
        }
        bVar.mo15235a("is_root", str);
        bVar.mo15235a("kernel_version", C3953o.m16435b());
        bVar.mo15235a("is_hm_os", String.valueOf(C3927aa.m16281c()));
        bVar.mo15235a("has_dump", "true");
        return bVar;
    }

    /* renamed from: c */
    public static String m15315c(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optString("mainStackFromTrace", "");
        }
        return "";
    }

    /* renamed from: b */
    public static String m15311b(JSONObject jSONObject) {
        if (!m15310a(jSONObject)) {
            return "";
        }
        try {
            return new JSONObject(jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)).optString("mainStackFromTrace", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static void m15313b(C3742b bVar) {
        JSONObject e = bVar.mo15252e();
        JSONObject optJSONObject = e.optJSONObject("app_memory_info");
        JSONObject optJSONObject2 = e.optJSONObject("memory_info");
        if (optJSONObject != null) {
            long optLong = optJSONObject.optLong("max_memory");
            long optLong2 = optJSONObject.optLong("free_memory");
            long optLong3 = optJSONObject.optLong("total_memory");
            if (optLong > 0) {
                bVar.mo15233a("java_heap_usage", (float) (((optLong3 - optLong2) * 100) / optLong));
            }
        }
        if (optJSONObject2 != null) {
            bVar.mo15234a("total_pss", optJSONObject2.optLong("totalPss") / 1048576);
        }
    }

    /* renamed from: c */
    public static void m15317c(File file) {
        String[] list = file.list();
        if (list != null) {
            for (String str : list) {
                if (str.startsWith("anr_info_") || str.startsWith("trace_")) {
                    File file2 = new File(C3962t.m16522p(C3774m.m15609j()), "npth/procanr/" + file.getName());
                    file2.mkdirs();
                    C3949m.m16420b(file, file2);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m15314b(final File file) {
        synchronized (C3708j.class) {
            C3968x.m16530a((Object) "start new anrInfo Monitor");
            f11444e = file;
            f11443d = new AbstractRunnableC3714a() {
                /* class com.bytedance.crash.p218b.C3708j.C37112 */

                public void run() {
                    String str;
                    C3869p.m16026a("startAnrInfoMonitor", "currentProcess");
                    while (!this.f11459b) {
                        SystemClock.sleep(C3774m.m15611l().getDefaultAnrCheckInterval());
                        try {
                            int[] iArr = new int[1];
                            String a = C3700e.m15241a(C3774m.m15609j(), 1, iArr);
                            if (!TextUtils.isEmpty(a)) {
                                int i = iArr[0];
                                long currentTimeMillis = System.currentTimeMillis();
                                File file = file;
                                StringBuilder sb = new StringBuilder();
                                sb.append("proc/");
                                sb.append(i);
                                sb.append("/");
                                sb.append("anr_info_");
                                sb.append(currentTimeMillis);
                                if (i == Process.myPid()) {
                                    str = "_current";
                                } else {
                                    str = "_other";
                                }
                                sb.append(str);
                                File file2 = new File(file, sb.toString());
                                if (i == Process.myPid()) {
                                    try {
                                        C3949m.m16402a(file2, a, false);
                                    } catch (IOException unused) {
                                    }
                                    C3869p.m16026a("anrInfo", "currentProcess");
                                    C3968x.m16531a("find anr with process current " + i);
                                    C3708j.m15306a(file2, a, currentTimeMillis, true);
                                } else if (!C3809i.m15792f()) {
                                    try {
                                        C3949m.m16402a(file2, a, false);
                                    } catch (IOException unused2) {
                                    }
                                    C3869p.m16026a("anrInfo", "otherProcess_" + i);
                                    C3968x.m16531a("find anr with process " + i);
                                }
                                SystemClock.sleep(C3774m.m15611l().getDefaultAnrCheckInterval() * 20);
                            }
                        } catch (Throwable unused3) {
                        }
                    }
                }
            };
            m15297a(new Thread(f11443d, "worker_anr_monitor")).start();
        }
    }

    /* renamed from: a */
    private static void m15300a(long j) {
        if (f11452m == null) {
            synchronized (C3708j.class) {
                if (f11452m != null || f11449j) {
                    while (f11449j) {
                        try {
                            C3708j.class.wait();
                        } catch (Throwable unused) {
                        }
                    }
                    if (f11452m != null) {
                        return;
                    }
                } else {
                    f11449j = true;
                }
                m15308a(false, 0L, j);
                synchronized (C3708j.class) {
                    f11449j = false;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m15301a(C3742b bVar) {
        float f;
        Exception e;
        float parseFloat;
        JSONObject e2 = bVar.mo15252e();
        JSONArray optJSONArray = e2.optJSONArray("logcat");
        if (optJSONArray != null && optJSONArray.length() != 0) {
            int i = 1;
            int length = optJSONArray.length() - 1;
            float f2 = BitmapDescriptorFactory.HUE_RED;
            long j = 0;
            while (true) {
                if (length <= 0) {
                    break;
                }
                try {
                    String string = optJSONArray.getString(length);
                    if (!TextUtils.isEmpty(string)) {
                        if (string.contains("GC freed")) {
                            Matcher matcher = Pattern.compile("(\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}.\\d{3})\\s+(\\d+)\\s+(\\d+) ([IWDE])\\s+([\\s\\S]*):([\\s\\S]*)").matcher(string);
                            if (matcher.find()) {
                                String group = matcher.group(i);
                                matcher.group(2);
                                matcher.group(3);
                                matcher.group(4);
                                matcher.group(5);
                                String group2 = matcher.group(6);
                                Date date = new Date(e2.optLong("crash_time"));
                                long time = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").parse(String.format("%tY", date) + "-" + group).getTime() - date.getTime()) / 1000;
                                if (!group2.contains(" total ") || Math.abs(time) > 30 || time >= 0) {
                                    if (Math.abs(time) > 30 && time < 0) {
                                        break;
                                    }
                                } else {
                                    j++;
                                    String[] split = group2.split(" total ");
                                    if (split.length == 2) {
                                        try {
                                            String str = split[1];
                                            if (str.contains("ms")) {
                                                parseFloat = Float.parseFloat(str.split("ms")[0]);
                                            } else if (str.contains("us")) {
                                                parseFloat = Float.parseFloat(str.split("us")[0]) / 1000000.0f;
                                            } else if (str.contains("s")) {
                                                parseFloat = Float.parseFloat(str.split("s")[0]) * 1000.0f;
                                            }
                                            f2 += parseFloat;
                                        } catch (Exception e3) {
                                            e = e3;
                                            C3968x.m16534a((Throwable) new RuntimeException(e));
                                            length--;
                                            i = 1;
                                        }
                                    }
                                }
                            } else {
                                C3968x.m16535b("NO MATCH");
                            }
                            length--;
                            i = 1;
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    C3968x.m16534a((Throwable) new RuntimeException(e));
                    length--;
                    i = 1;
                }
                length--;
                i = 1;
            }
            if (j > 0) {
                f = f2 / ((float) j);
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            bVar.mo15233a("gc_time", f2);
            bVar.mo15234a("gc_count", j);
            bVar.mo15233a("gc_time_avg", f);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x02a9 A[SYNTHETIC, Splitter:B:124:0x02a9] */
    /* JADX WARNING: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c5  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m15319d(java.io.File r42) {
        /*
        // Method dump skipped, instructions count: 812
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p218b.C3708j.m15319d(java.io.File):void");
    }

    /* renamed from: a */
    private static JSONObject m15298a(JSONObject jSONObject, String str) {
        return m15299a(jSONObject, str, false);
    }

    /* renamed from: a */
    public static String m15296a(C3742b bVar, JSONObject jSONObject) {
        String b = m15311b(bVar.mo15252e());
        String c = m15315c(jSONObject);
        boolean z = true;
        if (!(b == "" || c == "" || C3930ad.m16309a(c, b))) {
            m15303a(bVar, C3693b.f11355f + b, c, "JavaStack", false, true);
            z = false;
        }
        if (c != "") {
            m15303a(bVar, c, "", "NativeStack", true, z);
            return c;
        }
        bVar.mo15235a("anr_replace_mainstack", "OnlyJavaStack");
        return b;
    }

    /* renamed from: a */
    public static void m15302a(C3742b bVar, long j) {
        long j2 = C3693b.f11353d;
        JSONObject e = bVar.mo15252e();
        JSONObject optJSONObject = e.optJSONObject("current_message");
        if (optJSONObject == null) {
            C3742b.m15432a(e, "filters", "anr_cmsg_wall", "no_cmsg");
            return;
        }
        if (j2 <= 0) {
            j2 = j;
        }
        if (j <= 0) {
            C3742b.m15432a(e, "filters", "anr_cmsg_wall", "no_crash_time");
            return;
        }
        long j3 = j - j2;
        long optLong = optJSONObject.optLong("currentMessageCost") - j3;
        if (optLong >= 60000) {
            C3742b.m15432a(e, "filters", "anr_cmsg_wall", ">=60s");
        } else if (optLong >= 10000) {
            C3742b.m15432a(e, "filters", "anr_cmsg_wall", ">=10s");
        } else if (optLong >= 5000) {
            C3742b.m15432a(e, "filters", "anr_cmsg_wall", ">=5s");
        } else {
            int i = (optLong > 0 ? 1 : (optLong == 0 ? 0 : -1));
            if (i > 0) {
                C3742b.m15432a(e, "filters", "anr_cmsg_wall", ">0");
            } else if (i <= 0) {
                C3742b.m15432a(e, "filters", "anr_cmsg_wall", "<=0");
            }
        }
        bVar.mo15250d("anr_to_dump_cost", String.valueOf(j3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068 A[Catch:{ JSONException -> 0x0072 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.json.JSONObject m15299a(org.json.JSONObject r5, java.lang.String r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p218b.C3708j.m15299a(org.json.JSONObject, java.lang.String, boolean):org.json.JSONObject");
    }
}
