package com.bytedance.ies.bullet.service.base.impl;

import com.bytedance.ies.bullet.service.base.api.IDependencyProvider;
import com.bytedance.ies.bullet.service.base.api.IInstanceProvider;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J#\u0010\u0007\u001a\u0004\u0018\u0001H\b\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u0005H\u0016¢\u0006\u0002\u0010\nJ+\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u00052\b\u0010\r\u001a\u0004\u0018\u0001H\bH\u0016¢\u0006\u0002\u0010\u000eR\"\u0010\u0003\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/impl/DefaultDependencyProvider;", "Lcom/bytedance/ies/bullet/service/base/api/IDependencyProvider;", "()V", "providers", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "Lcom/bytedance/ies/bullet/service/base/api/IInstanceProvider;", "get", "T", "clazz", "(Ljava/lang/Class;)Ljava/lang/Object;", "put", "", "instance", "(Ljava/lang/Class;Ljava/lang/Object;)V", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.a.b */
public final class DefaultDependencyProvider implements IDependencyProvider {

    /* renamed from: a */
    private final ConcurrentHashMap<Class<?>, IInstanceProvider<?>> f37847a = new ConcurrentHashMap<>();

    @Override // com.bytedance.ies.bullet.service.base.api.IDependencyProvider
    /* renamed from: a */
    public <T> T mo52632a(Class<T> cls) {
        T t;
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        IInstanceProvider<?> eVar = this.f37847a.get(cls);
        if (eVar == null || (t = (T) eVar.mo52634a()) == null) {
            return null;
        }
        if (!cls.isAssignableFrom(t.getClass())) {
            t = null;
        }
        if (t != null) {
            return t;
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.service.base.api.IDependencyProvider
    /* renamed from: a */
    public <T> void mo52633a(Class<T> cls, T t) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        if (t != null) {
            this.f37847a.put(cls, new DefaultInstanceProvider(t));
        }
    }
}
