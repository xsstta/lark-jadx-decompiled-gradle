package com.larksuite.component.openplatform.infra.network.base;

import com.bytedance.ee.lark.infra.network.ref.entity.C12874a;
import com.bytedance.ee.lark.infra.network.ref.entity.C12878e;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12867c;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12872h;

/* renamed from: com.larksuite.component.openplatform.infra.network.base.a */
public class C25540a extends C12872h {
    @Override // com.bytedance.ee.lark.infra.network.ref.p636b.C12872h
    /* renamed from: a */
    public C12874a<C12867c> mo48533a(C12878e eVar, C12867c cVar) {
        cVar.mo48504a("EENet-Request-Enable-Complex-Connect", Boolean.TRUE.toString());
        cVar.mo48504a("called_from", "miniapp");
        cVar.mo48504a("EENet-Rust-Request-Timeout", String.valueOf(60000L));
        return new C12874a<>(cVar);
    }
}
