package com.tt.miniapp.falcon.snapshot;

import android.text.TextUtils;
import com.tt.miniapp.BridgeUniteHelper;
import com.tt.miniapphost.p3370d.C67479c;

/* access modifiers changed from: package-private */
/* renamed from: com.tt.miniapp.falcon.snapshot.k */
public class C66085k {

    /* renamed from: a */
    private final String f166813a = C67479c.m262467a().mo234231d();

    /* renamed from: b */
    private final boolean f166814b = BridgeUniteHelper.f166701a.mo231125a();

    C66085k() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f166813a)) {
            sb.append("_language_");
            sb.append(this.f166813a);
        }
        sb.append("_new_bridge_");
        sb.append(this.f166814b);
        return sb.toString();
    }
}
