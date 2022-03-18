package com.bytedance.ee.bear.net;

import io.reactivex.functions.Function;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.net.q */
public class C10296q implements Function<AbstractC10289j, C10288i> {

    /* renamed from: a */
    private boolean f27784a;

    /* renamed from: b */
    private final Map<String, String> f27785b;

    /* renamed from: a */
    public C10288i apply(AbstractC10289j jVar) throws Exception {
        C10288i iVar = new C10288i();
        iVar.mo39299a(jVar);
        iVar.mo39302a(this.f27784a);
        iVar.mo39301a(this.f27785b);
        return iVar;
    }

    public C10296q(boolean z, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        this.f27785b = hashMap;
        this.f27784a = z;
        hashMap.putAll(map);
    }
}
