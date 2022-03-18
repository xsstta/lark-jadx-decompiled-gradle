package com.bytedance.ies.bullet.service.base.impl;

import com.bytedance.ies.bullet.service.base.api.IInstanceProvider;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\r\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/impl/DefaultInstanceProvider;", "T", "Lcom/bytedance/ies/bullet/service/base/api/IInstanceProvider;", "instance", "(Ljava/lang/Object;)V", "getInstance", "()Ljava/lang/Object;", "Ljava/lang/Object;", "provideInstance", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.a.c */
public final class DefaultInstanceProvider<T> implements IInstanceProvider<T> {

    /* renamed from: a */
    private final T f37848a;

    @Override // com.bytedance.ies.bullet.service.base.api.IInstanceProvider
    /* renamed from: a */
    public T mo52634a() {
        return this.f37848a;
    }

    public DefaultInstanceProvider(T t) {
        this.f37848a = t;
    }
}
