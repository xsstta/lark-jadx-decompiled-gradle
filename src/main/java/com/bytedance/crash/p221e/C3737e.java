package com.bytedance.crash.p221e;

import android.os.Process;
import android.os.SystemClock;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.C3775n;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.C3742b;
import com.bytedance.crash.nativecrash.C3809i;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.p218b.C3693b;
import com.bytedance.crash.p218b.C3705h;
import com.bytedance.crash.p218b.C3716l;
import com.bytedance.crash.p223g.C3754a;
import com.bytedance.crash.runtime.C3840b;
import com.bytedance.crash.runtime.C3852f;
import com.bytedance.crash.runtime.p227a.AbstractC3829b;
import com.bytedance.crash.runtime.p227a.C3824a;
import com.bytedance.crash.util.C3930ad;
import com.bytedance.crash.util.C3933b;
import com.bytedance.crash.util.C3949m;
import com.bytedance.crash.util.C3962t;
import com.bytedance.crash.util.C3969y;
import com.bytedance.crash.util.NativeTools;
import com.google.firebase.messaging.Constants;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.e.e */
class C3737e implements AbstractC3829b.AbstractC3830a {

    /* renamed from: a */
    boolean f11513a;

    /* renamed from: b */
    Throwable f11514b;

    /* renamed from: c */
    long f11515c;

    /* renamed from: d */
    String f11516d;

    /* renamed from: e */
    boolean f11517e;

    /* renamed from: f */
    Thread f11518f;

    /* renamed from: g */
    String f11519g;

    /* renamed from: h */
    boolean f11520h;

    /* renamed from: i */
    File f11521i;

    @Override // com.bytedance.crash.runtime.p227a.AbstractC3829b.AbstractC3830a
    /* renamed from: a */
    public void mo15201a(Throwable th) {
    }

    @Override // com.bytedance.crash.runtime.p227a.AbstractC3829b.AbstractC3830a
    /* renamed from: a */
    public C3742b mo15199a(int i, C3742b bVar) {
        String str;
        String str2;
        CrashType crashType;
        JSONObject jSONObject;
        JSONArray jSONArray;
        if (i != 0) {
            String str3 = "true";
            if (i == 1) {
                if (this.f11520h) {
                    bVar.mo15241a("timestamp", Long.valueOf(this.f11515c));
                    bVar.mo15241a("main_process", Boolean.valueOf(C3933b.m16336b(C3774m.m15609j())));
                    bVar.mo15241a("crash_type", CrashType.JAVA);
                }
                Thread thread = this.f11518f;
                if (thread != null) {
                    str = thread.getName();
                } else {
                    str = "";
                }
                bVar.mo15241a("crash_thread_name", (Object) str);
                bVar.mo15241a("tid", Integer.valueOf(Process.myTid()));
                if (C3775n.m15661l()) {
                    str2 = str3;
                } else {
                    str2 = "false";
                }
                bVar.mo15235a("crash_after_crash", str2);
                if (!NativeImpl.m15694e()) {
                    str3 = "false";
                }
                bVar.mo15235a("crash_after_native", str3);
                C3729a.m15361a().mo15187a(this.f11518f, this.f11514b, this.f11520h, bVar);
                File j = C3962t.m16514j(C3774m.m15609j());
                if (this.f11520h) {
                    crashType = CrashType.LAUNCH;
                } else {
                    crashType = CrashType.JAVA;
                }
                C3852f.m15967a(j, crashType);
            } else if (i == 2) {
                if (this.f11513a) {
                    C3933b.m16328a(C3774m.m15609j(), bVar.mo15252e());
                }
                if (this.f11520h) {
                    bVar.mo15241a("launch_did", (Object) C3754a.m15520a(C3774m.m15609j()));
                }
                JSONArray e = C3716l.m15336e();
                long uptimeMillis = SystemClock.uptimeMillis();
                JSONObject k = C3716l.m15342k();
                JSONArray a = C3716l.m15328a(100, uptimeMillis);
                bVar.mo15241a("history_message", (Object) e);
                bVar.mo15241a("current_message", k);
                bVar.mo15241a("pending_messages", (Object) a);
                bVar.mo15235a("disable_looper_monitor", String.valueOf(C3840b.m15890h()));
                if (!this.f11513a && C3840b.m15903u()) {
                    bVar.mo15235a("may_have_hprof", str3);
                    C3729a.m15364a(this.f11518f, this.f11514b, this.f11520h, this.f11515c);
                }
                bVar.mo15241a("alive_pids", (Object) C3809i.m15793g());
            } else if (i == 3) {
                File file = new File(C3962t.m16488b(C3774m.m15609j(), C3774m.m15606g()), "trace.txt");
                if (!NativeTools.m16239m() || !C3840b.m15862B()) {
                    jSONObject = C3930ad.m16310b(Thread.currentThread().getName());
                } else {
                    NativeTools.m16236b().mo15617g(file.getAbsolutePath());
                    try {
                        jSONArray = C3949m.m16418b(file.getAbsolutePath());
                    } catch (Throwable unused) {
                        jSONArray = null;
                    }
                    jSONObject = (JSONObject) C3693b.m15207a(jSONArray, (C3705h) null, false).second;
                }
                if (jSONObject != null) {
                    bVar.mo15241a("all_thread_stacks", jSONObject);
                }
            } else if (i != 4) {
                if (i == 5) {
                    bVar.mo15241a("crash_uuid", (Object) this.f11519g);
                }
            } else if (!this.f11513a) {
                C3933b.m16328a(C3774m.m15609j(), bVar.mo15252e());
            }
        } else {
            bVar.mo15241a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (Object) C3930ad.m16298a(this.f11514b));
            bVar.mo15241a("isOOM", Boolean.valueOf(this.f11513a));
            if (this.f11520h) {
                bVar.mo15241a("event_type", "start_crash");
            } else {
                bVar.mo15241a("isJava", (Object) 1);
            }
            bVar.mo15241a("crash_time", Long.valueOf(this.f11515c));
            bVar.mo15241a("launch_mode", Integer.valueOf(C3824a.m15817b()));
            bVar.mo15241a("launch_time", Long.valueOf(C3824a.m15818c()));
            String str4 = this.f11516d;
            if (str4 != null) {
                bVar.mo15241a("crash_md5", (Object) str4);
                bVar.mo15235a("crash_md5", this.f11516d);
                boolean z = this.f11517e;
                if (z) {
                    bVar.mo15235a("has_ignore", String.valueOf(z));
                }
            }
        }
        return bVar;
    }

    @Override // com.bytedance.crash.runtime.p227a.AbstractC3829b.AbstractC3830a
    /* renamed from: a */
    public C3742b mo15200a(int i, C3742b bVar, boolean z) {
        if (C3969y.m16550a(C3969y.m16552b(i))) {
            return bVar;
        }
        try {
            File file = this.f11521i;
            C3949m.m16405a(new File(file, this.f11521i.getName() + "." + i), bVar.mo15252e(), false);
        } catch (Throwable unused) {
        }
        return bVar;
    }

    public C3737e(boolean z, Throwable th, long j, String str, boolean z2, Thread thread, String str2, File file, boolean z3) {
        this.f11513a = z;
        this.f11518f = thread;
        this.f11514b = th;
        this.f11515c = j;
        this.f11516d = str;
        this.f11517e = z2;
        this.f11519g = str2;
        this.f11521i = file;
        this.f11520h = z3;
    }
}
