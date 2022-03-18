package com.tt.miniapp.p3357x.p3359b;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapphost.util.C67586c;
import java.io.File;

/* renamed from: com.tt.miniapp.x.b.a */
public abstract class AbstractC67405a {

    /* renamed from: a */
    protected File f170004a;

    /* renamed from: a */
    public File mo234085a() {
        return this.f170004a;
    }

    /* renamed from: b */
    public long mo234086b() {
        File file = this.f170004a;
        if (file != null && file.exists()) {
            try {
                return C67586c.m263052c(this.f170004a);
            } catch (Exception e) {
                AppBrandLogger.stacktrace(6, "AbsAppbrandPath", e.getStackTrace());
            }
        }
        return 0;
    }
}
