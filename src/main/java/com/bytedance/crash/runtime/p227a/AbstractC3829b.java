package com.bytedance.crash.runtime.p227a;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICommonParams;
import com.bytedance.crash.entity.C3742b;
import com.bytedance.crash.p217a.C3687a;
import com.bytedance.crash.util.C3931ae;
import com.bytedance.crash.util.C3933b;
import com.bytedance.crash.util.C3955q;
import com.bytedance.crash.util.NativeTools;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.runtime.a.b */
public abstract class AbstractC3829b {

    /* renamed from: a */
    protected CrashType f11781a;

    /* renamed from: b */
    protected Context f11782b;

    /* renamed from: c */
    protected ICommonParams f11783c = C3774m.m15591a().mo15458c();

    /* renamed from: d */
    protected C3824a f11784d;

    /* renamed from: e */
    protected C3832d f11785e;

    /* renamed from: com.bytedance.crash.runtime.a.b$a */
    public interface AbstractC3830a {
        /* renamed from: a */
        C3742b mo15199a(int i, C3742b bVar);

        /* renamed from: a */
        C3742b mo15200a(int i, C3742b bVar, boolean z);

        /* renamed from: a */
        void mo15201a(Throwable th);
    }

    /* renamed from: f */
    private void m15836f(C3742b bVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo15417a() {
        return 6;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3742b mo15419a(C3742b bVar) {
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo15422b() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo15423c() {
        return true;
    }

    /* renamed from: e */
    private void m15835e(C3742b bVar) {
        if (mo15423c()) {
            bVar.mo15244b(C3931ae.m16319a(this.f11782b));
        }
    }

    /* renamed from: c */
    private void m15833c(C3742b bVar) {
        bVar.mo15228a(C3774m.m15618s(), C3774m.m15619t());
        if (C3774m.m15615p()) {
            bVar.mo15241a("is_mp", (Object) 1);
        }
        bVar.mo15230a(this.f11783c);
        bVar.mo15238a(C3774m.m15616q());
        bVar.mo15241a("inner_sdk", C3774m.m15617r());
        bVar.mo15241a("process_name", (Object) C3933b.m16337c(C3774m.m15609j()));
    }

    /* renamed from: b */
    public C3742b mo15421b(C3742b bVar) {
        int i;
        bVar.mo15249d(C3774m.m15591a().mo15461f());
        C3832d dVar = this.f11785e;
        if (dVar == null) {
            i = 0;
        } else {
            i = dVar.mo15424a();
        }
        bVar.mo15241a("battery", Integer.valueOf(i));
        bVar.mo15243b(C3774m.m15602c().getTagMap());
        bVar.mo15235a("alog_inited", String.valueOf(C3687a.m15191a().mo15099b()));
        return bVar;
    }

    /* renamed from: d */
    private void m15834d(C3742b bVar) {
        C3824a aVar;
        if (!C3933b.m16336b(C3774m.m15609j())) {
            bVar.mo15241a("remote_process", (Object) 1);
        }
        bVar.mo15241a("pid", Integer.valueOf(Process.myPid()));
        bVar.mo15229a(C3774m.m15612m(), C3774m.m15613n());
        if (mo15422b() && (aVar = this.f11784d) != null) {
            bVar.mo15232a(aVar);
        }
        try {
            bVar.mo15237a(this.f11783c.getPatchInfo());
        } catch (Throwable unused) {
        }
        String o = C3774m.m15614o();
        if (o != null) {
            bVar.mo15241a("business", (Object) o);
        }
        bVar.mo15241a("is_background", Boolean.valueOf(C3933b.m16332a(this.f11782b)));
    }

    /* renamed from: g */
    private void m15837g(C3742b bVar) {
        List<AttachUserData> attachUserData = C3774m.m15602c().getAttachUserData(this.f11781a);
        HashMap hashMap = new HashMap();
        JSONObject optJSONObject = bVar.mo15252e().optJSONObject("custom");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            bVar.mo15241a("custom", optJSONObject);
        }
        if (attachUserData != null) {
            for (int i = 0; i < attachUserData.size(); i++) {
                try {
                    AttachUserData attachUserData2 = attachUserData.get(i);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    C3742b.m15434a(optJSONObject, attachUserData2.getUserData(this.f11781a));
                    hashMap.put("custom_cost_" + attachUserData2.getClass().getName() + "_" + hashMap.size(), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                } catch (Throwable th) {
                    C3742b.m15433a(optJSONObject, th);
                }
            }
        }
        C3955q.m16447a(optJSONObject, "fd_count", Integer.valueOf(NativeTools.m16236b().mo15607d()));
        for (Map.Entry entry : hashMap.entrySet()) {
            C3955q.m16447a(optJSONObject, (String) entry.getKey(), entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3742b mo15418a(int i, C3742b bVar) {
        if (bVar == null) {
            bVar = new C3742b();
        }
        if (i == 0) {
            m15833c(bVar);
        } else if (i == 1) {
            m15834d(bVar);
            m15837g(bVar);
        } else if (i == 2) {
            mo15421b(bVar);
        } else if (i == 4) {
            m15836f(bVar);
        } else if (i == 5) {
            m15835e(bVar);
        }
        return bVar;
    }

    /* renamed from: a */
    public C3742b mo15420a(C3742b bVar, AbstractC3830a aVar, boolean z) {
        if (bVar == null) {
            bVar = new C3742b();
        }
        C3742b bVar2 = bVar;
        for (int i = 0; i < mo15417a(); i++) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (aVar != null) {
                try {
                    bVar2 = aVar.mo15199a(i, bVar2);
                } catch (Throwable th) {
                    aVar.mo15201a(th);
                }
            }
            try {
                bVar2 = mo15418a(i, bVar2);
            } catch (Throwable th2) {
                if (aVar != null) {
                    aVar.mo15201a(th2);
                }
            }
            if (aVar != null) {
                try {
                    boolean z2 = true;
                    if (i != mo15417a() - 1) {
                        z2 = false;
                    }
                    bVar2 = aVar.mo15200a(i, bVar2, z2);
                } catch (Throwable th3) {
                    aVar.mo15201a(th3);
                }
                if (z) {
                    if (i != 0) {
                        bVar.mo15247c(bVar2.mo15252e());
                    } else {
                        bVar = bVar2;
                    }
                    bVar2 = new C3742b();
                }
            }
            bVar.mo15246c("step_cost_" + i, String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
        }
        return mo15419a(bVar);
    }

    AbstractC3829b(CrashType crashType, Context context, C3824a aVar, C3832d dVar) {
        this.f11781a = crashType;
        this.f11782b = context;
        this.f11784d = aVar;
        this.f11785e = dVar;
    }
}
