package com.bytedance.platform.godzilla.p860a.p862b.p866b.p868b;

import com.bytedance.platform.godzilla.p860a.p862b.p863a.p865b.AbstractC20262a;

/* renamed from: com.bytedance.platform.godzilla.a.b.b.b.b */
public class C20270b implements AbstractC20262a {
    @Override // com.bytedance.platform.godzilla.p860a.p862b.p863a.p865b.AbstractC20262a
    /* renamed from: a */
    public boolean mo68549a() {
        return true;
    }

    @Override // com.bytedance.platform.godzilla.p860a.p862b.p863a.p865b.AbstractC20262a
    /* renamed from: a */
    public boolean mo68550a(Object obj, Throwable th) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (th instanceof ClassNotFoundException) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (stackTraceElement.getMethodName().contains("installProvider")) {
                    return true;
                }
            }
        }
        return false;
    }
}
