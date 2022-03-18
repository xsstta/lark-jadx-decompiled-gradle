package com.bytedance.crash.p217a;

import android.text.TextUtils;
import com.bytedance.crash.C3691b;
import com.bytedance.crash.C3767j;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.entity.C3748g;
import com.bytedance.crash.runtime.C3869p;
import com.bytedance.crash.upload.C3903f;
import com.bytedance.crash.util.C3968x;
import java.io.File;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.crash.a.a */
public class C3687a {

    /* renamed from: d */
    private static volatile C3687a f11344d;

    /* renamed from: a */
    private volatile String f11345a;

    /* renamed from: b */
    private volatile AbstractC3689c f11346b;

    /* renamed from: c */
    private volatile AbstractC3690d f11347c;

    /* renamed from: e */
    private volatile boolean f11348e;

    private C3687a() {
    }

    /* renamed from: b */
    public boolean mo15099b() {
        if (this.f11345a != null || C3767j.m15579d()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C3687a m15191a() {
        if (f11344d == null) {
            synchronized (C3687a.class) {
                if (f11344d == null) {
                    f11344d = new C3687a();
                }
            }
        }
        return f11344d;
    }

    /* renamed from: c */
    public void mo15100c() {
        if (C3767j.m15576a()) {
            C3968x.m16536b("npth", "use AlogApi: flushAlogSync");
            try {
                C3767j.m15577b();
            } catch (Throwable unused) {
            }
        } else if (this.f11346b != null) {
            try {
                this.f11346b.mo15102a();
            } catch (Throwable th) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            }
        }
    }

    /* renamed from: a */
    private static String m15192a(C3748g gVar) {
        if (TextUtils.isEmpty(gVar.mo15267d())) {
            return "no_aid";
        }
        if (TextUtils.isEmpty(gVar.mo15265c())) {
            return "no_did";
        }
        if (TextUtils.isEmpty(gVar.mo15269e())) {
            return "no_process";
        }
        if (gVar.mo15271f() == null || gVar.mo15271f().size() == 0) {
            return "no_files";
        }
        return "normal";
    }

    /* renamed from: b */
    public static C3748g m15194b(List<String> list, String str) {
        C3748g gVar = new C3748g();
        Map<String, Object> a = C3774m.m15591a().mo15456a();
        if (a != null) {
            gVar.mo15268d(String.valueOf(a.get("aid")));
        }
        gVar.mo15266c(C3774m.m15603d().mo15504a());
        gVar.mo15270e(str);
        gVar.mo15260a(list);
        return gVar;
    }

    /* renamed from: a */
    public static String m15193a(List<String> list, String str) {
        C3968x.m16536b("npth", "upload alog " + str + ": " + list);
        try {
            C3748g b = m15194b(list, str);
            String a = m15192a(b);
            if (!a.equals("normal")) {
                return a;
            }
            return C3903f.m16169a().mo15551a(b.mo15267d(), b.mo15265c(), b.mo15269e(), b.mo15271f()) ? "unknown" : "unknown";
        } catch (Throwable th) {
            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
        }
    }

    /* renamed from: a */
    public List<String> mo15096a(long j, String str) {
        AbstractC3690d dVar;
        if (C3767j.m15578c()) {
            C3968x.m16536b("npth", "use AlogApi: getAlogFiles");
            try {
                return C3767j.m15575a(j, str);
            } catch (Throwable unused) {
            }
        }
        if (TextUtils.isEmpty(this.f11345a) || !new File(this.f11345a).exists()) {
            return null;
        }
        String str2 = this.f11345a;
        if (this.f11347c instanceof C3688b) {
            dVar = new C3688b(str);
        } else {
            dVar = this.f11347c;
        }
        return mo15097a(str2, j, str, dVar);
    }

    /* renamed from: a */
    public void mo15098a(String str, AbstractC3689c cVar, AbstractC3690d dVar) {
        this.f11345a = str;
        this.f11346b = cVar;
        this.f11347c = dVar;
        if (!this.f11348e) {
            this.f11348e = true;
        }
    }

    /* renamed from: a */
    public List<String> mo15097a(String str, long j, String str2, AbstractC3690d dVar) {
        if (TextUtils.isEmpty(str) || !new File(str).exists() || dVar == null) {
            return null;
        }
        List<String> a = dVar.mo15101a(str, j);
        if (!(a == null || a.isEmpty() || str2 == null)) {
            for (String str3 : a) {
                C3968x.m16536b("collect alog: ", str3);
                C3869p.m16026a("collectAlog", str3);
            }
        }
        return a;
    }
}
