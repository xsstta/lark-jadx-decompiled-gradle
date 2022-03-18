package com.bytedance.ee.lark.infra.network.ref.p635a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;

/* renamed from: com.bytedance.ee.lark.infra.network.ref.a.m */
public class C12863m implements AbstractC12853e {
    @Override // com.bytedance.ee.lark.infra.network.ref.p635a.AbstractC12853e
    /* renamed from: a */
    public AbstractC12855g mo48488a(C12856h hVar) {
        if (!C12859i.m53079b()) {
            AppBrandLogger.m52829e("RustClientCreator", " rust not init ");
            return null;
        } else if (hVar == null) {
            return new C12864n();
        } else {
            return new C12864n(hVar);
        }
    }
}
