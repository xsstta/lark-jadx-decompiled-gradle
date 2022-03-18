package com.bytedance.crash.ensure;

import com.bytedance.crash.C3691b;
import com.bytedance.crash.upload.C3906h;
import com.bytedance.services.apm.api.IEnsure;
import java.util.Collection;
import java.util.Map;

/* access modifiers changed from: package-private */
public class EnsureInitInner$1 implements IEnsure {
    EnsureInitInner$1() {
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public void ensureNotReachHere() {
        C3691b.m15203a().mo15176a((String) null, "EnsureNotReachHere", (Map<String, String>) null);
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public void reportLogException(Throwable th) {
        ensureNotReachHere(th);
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public boolean ensureFalse(boolean z) {
        if (z) {
            C3691b.m15203a().mo15176a((String) null, "EnsureFalse", (Map<String, String>) null);
        }
        return z;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public boolean ensureTrue(boolean z) {
        if (!z) {
            C3691b.m15203a().mo15176a((String) null, "EnsureTrue", (Map<String, String>) null);
        }
        return z;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public boolean ensureNotEmpty(Collection collection) {
        boolean z;
        if (collection == null || collection.size() == 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            C3691b.m15203a().mo15176a((String) null, "EnsureNotEmpty", (Map<String, String>) null);
        }
        return z;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public boolean ensureNotNull(Object obj) {
        boolean z;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C3691b.m15203a().mo15176a((String) null, "EnsureNotNull", (Map<String, String>) null);
        }
        return z;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public void ensureNotReachHere(String str) {
        C3691b.m15203a().mo15176a(str, "EnsureNotReachHere", (Map<String, String>) null);
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public void ensureNotReachHere(Throwable th) {
        if (C3691b.m15203a().mo15179a(th)) {
            C3906h.m16183a(th, null, true);
        }
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public void reportLogException(Throwable th, String str) {
        ensureNotReachHere(th, str);
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public boolean ensureFalse(boolean z, String str) {
        if (z) {
            C3691b.m15203a().mo15176a(str, "EnsureFalse", (Map<String, String>) null);
        }
        return z;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public boolean ensureTrue(boolean z, String str) {
        if (!z) {
            C3691b.m15203a().mo15176a(str, "EnsureTrue", (Map<String, String>) null);
        }
        return z;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public boolean ensureNotNull(Object obj, String str) {
        boolean z;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C3691b.m15203a().mo15176a(str, "EnsureNotNull", (Map<String, String>) null);
        }
        return z;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public void ensureNotReachHere(String str, Map<String, String> map) {
        C3691b.m15203a().mo15176a(str, "EnsureNotReachHere", map);
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public void ensureNotReachHere(Throwable th, String str) {
        if (C3691b.m15203a().mo15179a(th)) {
            C3906h.m16183a(th, str, true);
        }
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public void reportLogException(int i, Throwable th, String str) {
        C3691b.m15203a().mo15174a(i, th, str);
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public boolean ensureFalse(boolean z, String str, Map<String, String> map) {
        if (z) {
            C3691b.m15203a().mo15176a(str, "EnsureFalse", map);
        }
        return z;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public boolean ensureTrue(boolean z, String str, Map<String, String> map) {
        if (!z) {
            C3691b.m15203a().mo15176a(str, "EnsureTrue", map);
        }
        return z;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public void ensureNotReachHere(Throwable th, String str, Map<String, String> map) {
        if (C3691b.m15203a().mo15179a(th)) {
            C3906h.m16185a(th, str, true, map, "core_exception_monitor");
        }
    }
}
