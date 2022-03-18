package com.bytedance.crash;

import com.bytedance.crash.ensure.C3739a;
import com.bytedance.crash.runtime.C3864m;
import com.bytedance.crash.upload.C3906h;
import com.bytedance.crash.util.C3952n;
import com.bytedance.crash.util.C3968x;
import java.util.Map;

/* renamed from: com.bytedance.crash.c */
public class C3722c {
    public C3722c() {
        C3739a.m15397a();
    }

    /* renamed from: a */
    public void mo15175a(String str) {
        mo15176a(str, "EnsureNotReachHere", (Map<String, String>) null);
    }

    /* renamed from: a */
    public boolean mo15179a(Throwable th) {
        if (!C3774m.m15611l().isEnsureEnable() || C3952n.m16433a(th)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo15180b(Throwable th, String str) {
        mo15178a(th, str);
    }

    /* renamed from: a */
    public void mo15177a(String str, Throwable th) {
        C3968x.m16534a(th);
        C3864m.m16009a(th, str);
    }

    /* renamed from: a */
    public void mo15178a(Throwable th, String str) {
        if (mo15179a(th)) {
            C3906h.m16183a(th, str, true);
        }
    }

    /* renamed from: a */
    public void mo15174a(int i, Throwable th, String str) {
        if (mo15179a(th)) {
            C3906h.m16183a(th, str, false);
        }
    }

    /* renamed from: a */
    public void mo15176a(String str, String str2, Map<String, String> map) {
        if (C3774m.m15611l().isEnsureEnable()) {
            C3906h.m16188a(Thread.currentThread().getStackTrace(), 5, str, str2, map);
        }
    }
}
