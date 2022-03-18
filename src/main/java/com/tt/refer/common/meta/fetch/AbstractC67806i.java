package com.tt.refer.common.meta.fetch;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.manager.appinfo.C66411c;

/* renamed from: com.tt.refer.common.meta.fetch.i */
public abstract class AbstractC67806i<T> implements AbstractC67802f<T> {
    @Override // com.tt.refer.common.meta.fetch.AbstractC67802f
    /* renamed from: a */
    public void mo235305a(T t) {
    }

    @Override // com.tt.refer.common.meta.fetch.AbstractC67802f
    public String b_(String str) throws MetaException {
        return str;
    }

    @Override // com.tt.refer.common.meta.fetch.AbstractC67802f
    /* renamed from: a */
    public void mo235304a(C66411c cVar) {
        AppBrandLogger.m52830i("SimpleAppMetaParser", "setTTCode ...");
    }
}
