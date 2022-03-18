package com.huawei.hms.framework.network.grs;

import android.content.Context;
import com.huawei.hms.framework.network.grs.p1013a.C23548a;
import com.huawei.hms.framework.network.grs.p1013a.C23550c;
import com.huawei.hms.framework.network.grs.p1014b.C23553b;
import com.huawei.hms.framework.network.grs.p1015c.C23575l;
import java.util.Map;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.huawei.hms.framework.network.grs.c */
public class CallableC23558c implements Callable<Boolean> {

    /* renamed from: a */
    final /* synthetic */ Context f58060a;

    /* renamed from: b */
    final /* synthetic */ GrsBaseInfo f58061b;

    /* renamed from: c */
    final /* synthetic */ C23576d f58062c;

    CallableC23558c(C23576d dVar, Context context, GrsBaseInfo grsBaseInfo) {
        this.f58062c = dVar;
        this.f58060a = context;
        this.f58061b = grsBaseInfo;
    }

    @Override // java.util.concurrent.Callable
    public Boolean call() {
        this.f58062c.f58140g = new C23575l();
        this.f58062c.f58142i = new C23550c(this.f58060a);
        C23576d dVar = this.f58062c;
        dVar.f58141h = new C23548a(dVar.f58142i, this.f58062c.f58140g);
        C23576d dVar2 = this.f58062c;
        dVar2.f58143j = new C23545a(dVar2.f58136c, this.f58062c.f58141h, this.f58062c.f58140g);
        new C23553b(this.f58060a, this.f58061b).mo82870a(this.f58061b);
        C23576d dVar3 = this.f58062c;
        dVar3.m85526a((C23576d) ((Map<String, ?>) dVar3.f58142i.mo82848a()));
        this.f58062c.f58141h.mo82844b(this.f58061b, this.f58060a);
        return Boolean.valueOf(this.f58062c.f58137d = true);
    }
}
