package com.bytedance.platform.godzilla.p860a.p870d;

import com.bytedance.platform.godzilla.plugin.AbstractC20331c;
import java.util.concurrent.TimeoutException;

/* renamed from: com.bytedance.platform.godzilla.a.d.c */
public class C20284c extends AbstractC20331c {
    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "LiteTimeoutException";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20331c
    /* renamed from: c */
    public boolean mo68569c() {
        return true;
    }

    @Override // com.bytedance.platform.godzilla.common.AbstractC20328h
    /* renamed from: a */
    public boolean mo68568a(Thread thread, Throwable th) throws Throwable {
        return th instanceof TimeoutException;
    }
}
