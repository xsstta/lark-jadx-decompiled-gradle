package com.bytedance.crash.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.crash.C3774m;

/* renamed from: com.bytedance.crash.runtime.r */
public final class C3878r {

    /* renamed from: a */
    private String f11877a;

    /* renamed from: b */
    private final int f11878b = -1;

    /* renamed from: b */
    public boolean mo15506b() {
        if (TextUtils.isEmpty(this.f11877a) || "0".equals(this.f11877a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public String mo15504a() {
        if (!TextUtils.isEmpty(this.f11877a) && !"0".equals(this.f11877a)) {
            return this.f11877a;
        }
        String d = C3774m.m15591a().mo15459d();
        this.f11877a = d;
        if (TextUtils.isEmpty(d) || "0".equals(this.f11877a)) {
            String c = C3873q.m16033a().mo15493c();
            this.f11877a = c;
            return c;
        }
        mo15505a(this.f11877a);
        return this.f11877a;
    }

    public C3878r(Context context) {
    }

    /* renamed from: a */
    public void mo15505a(String str) {
        this.f11877a = str;
        C3873q.m16033a().mo15494c(str);
    }
}
