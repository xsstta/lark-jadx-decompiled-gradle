package com.bytedance.ies.bullet.service.base.impl;

import com.bytedance.ies.bullet.service.base.api.IBulletService;
import com.bytedance.ies.bullet.service.base.api.IServiceCenter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J5\u0010\u0003\u001a\u00020\u0000\"\b\b\u0000\u0010\b*\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0006\u0010\f\u001a\u0002H\bH\u0016¢\u0006\u0002\u0010\rJ*\u0010\u000e\u001a\u0004\u0018\u00010\u000f\"\b\b\u0000\u0010\b*\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/impl/EmptyServiceCenter;", "Lcom/bytedance/ies/bullet/service/base/api/IServiceCenter;", "()V", "bind", "bid", "", "serviceMap", "Lcom/bytedance/ies/bullet/service/base/impl/ServiceMap;", "T", "Lcom/bytedance/ies/bullet/service/base/api/IBulletService;", "clazz", "Ljava/lang/Class;", "serviceInst", "(Ljava/lang/String;Ljava/lang/Class;Lcom/bytedance/ies/bullet/service/base/api/IBulletService;)Lcom/bytedance/ies/bullet/service/base/impl/EmptyServiceCenter;", "get", "", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.a.d */
public final class EmptyServiceCenter implements IServiceCenter {
    /* renamed from: b */
    public EmptyServiceCenter mo52637a(String str, ServiceMap fVar) {
        Intrinsics.checkParameterIsNotNull(str, "bid");
        Intrinsics.checkParameterIsNotNull(fVar, "serviceMap");
        return this;
    }

    /* renamed from: b */
    public <T extends IBulletService> EmptyServiceCenter mo52638a(String str, Class<T> cls, T t) {
        Intrinsics.checkParameterIsNotNull(str, "bid");
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        Intrinsics.checkParameterIsNotNull(t, "serviceInst");
        return this;
    }

    /* renamed from: b */
    public <T extends IBulletService> Void mo52641b(String str, Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(str, "bid");
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        return null;
    }

    @Override // com.bytedance.ies.bullet.service.base.api.IServiceCenter
    /* renamed from: a */
    public /* synthetic */ IBulletService mo52635a(String str, Class cls) {
        return (IBulletService) mo52641b(str, cls);
    }

    @Override // com.bytedance.ies.bullet.service.base.api.IServiceCenter
    /* renamed from: a */
    public <T extends IBulletService> IServiceCenter mo52636a(Class<T> cls, T t) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        Intrinsics.checkParameterIsNotNull(t, "serviceInst");
        return IServiceCenter.C14413a.m58032a(this, cls, t);
    }
}
