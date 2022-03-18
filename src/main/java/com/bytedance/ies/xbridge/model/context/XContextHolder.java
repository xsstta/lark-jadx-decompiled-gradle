package com.bytedance.ies.xbridge.model.context;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0004J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ies/xbridge/model/context/XContextHolder;", "T", "Lcom/bytedance/ies/xbridge/model/context/IXContextProvider;", "t", "(Ljava/lang/Object;)V", "ref", "Ljava/lang/Object;", "provideInstance", "()Ljava/lang/Object;", "release", "", "x-bridge-core-api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.d.b.b */
public final class XContextHolder<T> implements IXContextProvider<T> {

    /* renamed from: a */
    private T f38027a;

    @Override // com.bytedance.ies.xbridge.api.IReleasable
    /* renamed from: a */
    public void mo52927a() {
        this.f38027a = null;
    }

    @Override // com.bytedance.ies.xbridge.model.context.IXContextProvider
    /* renamed from: b */
    public T mo53114b() {
        return this.f38027a;
    }

    public XContextHolder(T t) {
        this.f38027a = t;
    }
}
