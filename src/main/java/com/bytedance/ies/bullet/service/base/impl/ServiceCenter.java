package com.bytedance.ies.bullet.service.base.impl;

import com.bytedance.ies.bullet.service.base.api.IBulletService;
import com.bytedance.ies.bullet.service.base.api.IServiceCenter;
import com.bytedance.ies.bullet.service.base.impl.ServiceMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0006H\u0016J5\u0010\u0007\u001a\u00020\u0001\"\b\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\r2\u0006\u0010\u000e\u001a\u0002H\nH\u0016¢\u0006\u0002\u0010\u000fJ/\u0010\u0010\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0016¢\u0006\u0002\u0010\u0011R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/impl/ServiceCenter;", "Lcom/bytedance/ies/bullet/service/base/api/IServiceCenter;", "()V", "bidServiceMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/bytedance/ies/bullet/service/base/impl/ServiceMap;", "bind", "bid", "serviceMap", "T", "Lcom/bytedance/ies/bullet/service/base/api/IBulletService;", "clazz", "Ljava/lang/Class;", "serviceInst", "(Ljava/lang/String;Ljava/lang/Class;Lcom/bytedance/ies/bullet/service/base/api/IBulletService;)Lcom/bytedance/ies/bullet/service/base/api/IServiceCenter;", "get", "(Ljava/lang/String;Ljava/lang/Class;)Lcom/bytedance/ies/bullet/service/base/api/IBulletService;", "Companion", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.a.e */
public final class ServiceCenter implements IServiceCenter {

    /* renamed from: a */
    public static volatile IServiceCenter f37849a = new EmptyServiceCenter();

    /* renamed from: b */
    public static final Companion f37850b = new Companion(null);

    /* renamed from: c */
    private final ConcurrentHashMap<String, ServiceMap> f37851c;

    @JvmStatic
    /* renamed from: a */
    public static final IServiceCenter m57996a() {
        return f37850b.mo52643a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\nH\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/impl/ServiceCenter$Companion;", "", "()V", "sServiceCenter", "Lcom/bytedance/ies/bullet/service/base/api/IServiceCenter;", "createOrGetBy", "Lcom/bytedance/ies/bullet/service/base/impl/ServiceMap;", "bid", "", "bidServiceMap", "Ljava/util/concurrent/ConcurrentHashMap;", "instance", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.service.base.a.e$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final IServiceCenter mo52643a() {
            ServiceCenter eVar;
            synchronized (ServiceCenter.f37849a) {
                eVar = ServiceCenter.f37849a;
                if (eVar instanceof EmptyServiceCenter) {
                    ServiceCenter eVar2 = new ServiceCenter(null);
                    ServiceCenter.f37849a = eVar2;
                    eVar = eVar2;
                }
            }
            return eVar;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ServiceMap mo52642a(String str, ConcurrentHashMap<String, ServiceMap> concurrentHashMap) {
            ServiceMap fVar = concurrentHashMap.get(str);
            if (fVar != null) {
                return fVar;
            }
            ServiceMap c = new ServiceMap.Builder().mo52648a(str).mo52651c();
            concurrentHashMap.put(str, c);
            return c;
        }
    }

    private ServiceCenter() {
        this.f37851c = new ConcurrentHashMap<>();
    }

    public /* synthetic */ ServiceCenter(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.bytedance.ies.bullet.service.base.api.IServiceCenter
    /* renamed from: a */
    public <T extends IBulletService> IServiceCenter mo52636a(Class<T> cls, T t) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        Intrinsics.checkParameterIsNotNull(t, "serviceInst");
        return IServiceCenter.C14413a.m58032a(this, cls, t);
    }

    @Override // com.bytedance.ies.bullet.service.base.api.IServiceCenter
    /* renamed from: a */
    public IServiceCenter mo52637a(String str, ServiceMap fVar) {
        Intrinsics.checkParameterIsNotNull(str, "bid");
        Intrinsics.checkParameterIsNotNull(fVar, "serviceMap");
        f37850b.mo52642a(str, this.f37851c).mo52645a(fVar);
        return this;
    }

    @Override // com.bytedance.ies.bullet.service.base.api.IServiceCenter
    /* renamed from: a */
    public <T extends IBulletService> T mo52635a(String str, Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(str, "bid");
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        ServiceMap a = f37850b.mo52642a(str, this.f37851c);
        String name = cls.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "clazz.name");
        T t = (T) a.mo52644a(name);
        if (t != null) {
            return t;
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.service.base.api.IServiceCenter
    /* renamed from: a */
    public <T extends IBulletService> IServiceCenter mo52638a(String str, Class<T> cls, T t) {
        Intrinsics.checkParameterIsNotNull(str, "bid");
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        Intrinsics.checkParameterIsNotNull(t, "serviceInst");
        ServiceMap a = f37850b.mo52642a(str, this.f37851c);
        String name = cls.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "clazz.name");
        a.mo52646a(name, t);
        return this;
    }
}
