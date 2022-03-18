package com.bytedance.ee.lark.infra.network.ref.p635a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.ref.entity.C12878e;
import com.bytedance.ee.lark.infra.network.ref.entity.C12880g;
import com.bytedance.ee.lark.infra.network.ref.entity.C12883i;
import okhttp3.Call;
import okhttp3.Response;

/* renamed from: com.bytedance.ee.lark.infra.network.ref.a.d */
public class C12852d implements AbstractC12860j {

    /* renamed from: a */
    public C12878e f34312a;

    /* renamed from: b */
    public C12880g f34313b;

    /* renamed from: c */
    private Call f34314c;

    @Override // com.bytedance.ee.lark.infra.network.ref.p635a.AbstractC12860j
    /* renamed from: b */
    public C12880g mo48487b() {
        return this.f34313b;
    }

    @Override // com.bytedance.ee.lark.infra.network.ref.p635a.AbstractC12860j
    /* renamed from: a */
    public C12883i mo48486a() throws Exception {
        try {
            C12847a.m53053a(this.f34312a, this.f34313b.mo48564c(), "type_sync");
            Response execute = this.f34314c.execute();
            C12847a.m53054a(this.f34312a, "type_sync", true, this.f34313b.mo48564c(), execute.code(), "", execute.header("EENet-XRequest-Id"));
            return C12850c.m53060a(this, execute);
        } catch (Exception e) {
            AppBrandLogger.m52829e("EENetworkTask", " excute  network task fail ", e);
            C12847a.m53054a(this.f34312a, "type_sync", false, this.f34313b.mo48564c(), -1, e.getMessage(), "");
            throw e;
        }
    }

    public C12852d(C12878e eVar, C12880g gVar, Call call) {
        this.f34312a = eVar;
        this.f34313b = gVar;
        this.f34314c = call;
    }
}
