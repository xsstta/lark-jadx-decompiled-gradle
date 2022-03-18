package com.bytedance.ies.bullet.service.base.impl;

import com.bytedance.ies.bullet.service.base.api.IBulletService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0000J\u0016\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\nR\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/impl/ServiceMap;", "", "builder", "Lcom/bytedance/ies/bullet/service/base/impl/ServiceMap$Builder;", "(Lcom/bytedance/ies/bullet/service/base/impl/ServiceMap$Builder;)V", "()V", "bid", "", "serviceMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/bytedance/ies/bullet/service/base/api/IBulletService;", "get", "clazzName", "merge", "", "other", "put", "serviceInst", "Builder", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.a.f */
public final class ServiceMap {

    /* renamed from: a */
    private final ConcurrentHashMap<String, IBulletService> f37852a;

    /* renamed from: b */
    private String f37853b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ-\u0010\u0010\u001a\u00020\u0000\"\b\b\u0000\u0010\u0011*\u00020\u000b2\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00110\u00132\u0006\u0010\u0014\u001a\u0002H\u0011¢\u0006\u0002\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/impl/ServiceMap$Builder;", "", "()V", "bid", "", "getBid", "()Ljava/lang/String;", "setBid", "(Ljava/lang/String;)V", "serviceMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/bytedance/ies/bullet/service/base/api/IBulletService;", "getServiceMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "build", "Lcom/bytedance/ies/bullet/service/base/impl/ServiceMap;", "register", "T", "clazz", "Ljava/lang/Class;", "serviceInst", "(Ljava/lang/Class;Lcom/bytedance/ies/bullet/service/base/api/IBulletService;)Lcom/bytedance/ies/bullet/service/base/impl/ServiceMap$Builder;", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.service.base.a.f$a */
    public static final class Builder {

        /* renamed from: a */
        private final ConcurrentHashMap<String, IBulletService> f37854a = new ConcurrentHashMap<>();

        /* renamed from: b */
        private String f37855b = "default_bid";

        /* renamed from: a */
        public final ConcurrentHashMap<String, IBulletService> mo52649a() {
            return this.f37854a;
        }

        /* renamed from: b */
        public final String mo52650b() {
            return this.f37855b;
        }

        /* renamed from: c */
        public final ServiceMap mo52651c() {
            return new ServiceMap(this, null);
        }

        /* renamed from: a */
        public final Builder mo52648a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "bid");
            Builder aVar = this;
            aVar.f37855b = str;
            return aVar;
        }

        /* renamed from: a */
        public final <T extends IBulletService> Builder mo52647a(Class<? extends T> cls, T t) {
            Intrinsics.checkParameterIsNotNull(cls, "clazz");
            Intrinsics.checkParameterIsNotNull(t, "serviceInst");
            Builder aVar = this;
            String name = cls.getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "clazz.name");
            aVar.f37854a.put(name, t);
            return aVar;
        }
    }

    private ServiceMap() {
        this.f37852a = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public final IBulletService mo52644a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "clazzName");
        return this.f37852a.get(str);
    }

    private ServiceMap(Builder aVar) {
        this();
        this.f37853b = aVar.mo52650b();
        this.f37852a.putAll(aVar.mo52649a());
    }

    /* renamed from: a */
    public final void mo52645a(ServiceMap fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "other");
        for (Map.Entry<String, IBulletService> entry : fVar.f37852a.entrySet()) {
            mo52646a(entry.getKey(), entry.getValue());
        }
    }

    public /* synthetic */ ServiceMap(Builder aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    /* renamed from: a */
    public final void mo52646a(String str, IBulletService cVar) {
        Intrinsics.checkParameterIsNotNull(str, "clazzName");
        Intrinsics.checkParameterIsNotNull(cVar, "serviceInst");
        IBulletService cVar2 = this.f37852a.get(str);
        if (cVar2 != null) {
            cVar2.mo52581a();
        }
        String str2 = this.f37853b;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bid");
        }
        cVar.mo52613a(str2);
        this.f37852a.put(str, cVar);
    }
}
