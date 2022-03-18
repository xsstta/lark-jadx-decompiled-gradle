package com.huawei.hms.framework.network.grs.p1015c;

import android.content.Context;
import com.huawei.hms.framework.network.grs.AbstractC23551b;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* access modifiers changed from: package-private */
/* renamed from: com.huawei.hms.framework.network.grs.c.k */
public class RunnableC23574k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ GrsBaseInfo f58125a;

    /* renamed from: b */
    final /* synthetic */ Context f58126b;

    /* renamed from: c */
    final /* synthetic */ String f58127c;

    /* renamed from: d */
    final /* synthetic */ AbstractC23551b f58128d;

    /* renamed from: e */
    final /* synthetic */ C23575l f58129e;

    RunnableC23574k(C23575l lVar, GrsBaseInfo grsBaseInfo, Context context, String str, AbstractC23551b bVar) {
        this.f58129e = lVar;
        this.f58125a = grsBaseInfo;
        this.f58126b = context;
        this.f58127c = str;
        this.f58128d = bVar;
    }

    public void run() {
        C23575l lVar = this.f58129e;
        lVar.m85512a(lVar.mo82915a(this.f58125a, this.f58126b, this.f58127c), this.f58128d);
    }
}
