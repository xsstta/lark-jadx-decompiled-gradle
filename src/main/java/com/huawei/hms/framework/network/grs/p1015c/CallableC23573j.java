package com.huawei.hms.framework.network.grs.p1015c;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.huawei.hms.framework.network.grs.c.j */
public class CallableC23573j implements Callable<C23568e> {

    /* renamed from: a */
    final /* synthetic */ GrsBaseInfo f58121a;

    /* renamed from: b */
    final /* synthetic */ Context f58122b;

    /* renamed from: c */
    final /* synthetic */ String f58123c;

    /* renamed from: d */
    final /* synthetic */ C23575l f58124d;

    CallableC23573j(C23575l lVar, GrsBaseInfo grsBaseInfo, Context context, String str) {
        this.f58124d = lVar;
        this.f58121a = grsBaseInfo;
        this.f58122b = context;
        this.f58123c = str;
    }

    @Override // java.util.concurrent.Callable
    public C23568e call() {
        return new C23567d(this.f58121a, this.f58122b, this.f58124d.f58133d).mo82891a(this.f58124d.f58130a, this.f58123c);
    }
}
