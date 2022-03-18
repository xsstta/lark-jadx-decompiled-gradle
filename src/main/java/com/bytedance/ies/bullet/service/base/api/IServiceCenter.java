package com.bytedance.ies.bullet.service.base.api;

import com.bytedance.ies.bullet.service.base.impl.ServiceMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J5\u0010\u0002\u001a\u00020\u0000\"\b\b\u0000\u0010\u0007*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0006\u0010\u000b\u001a\u0002H\u0007H&¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J-\u0010\r\u001a\u00020\u0000\"\b\b\u0000\u0010\u0007*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0006\u0010\u000b\u001a\u0002H\u0007H\u0016¢\u0006\u0002\u0010\u000eJ'\u0010\u000f\u001a\u0004\u0018\u0001H\u0007\"\b\b\u0000\u0010\u0007*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0016¢\u0006\u0002\u0010\u0010J/\u0010\u000f\u001a\u0004\u0018\u0001H\u0007\"\b\b\u0000\u0010\u0007*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH&¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/api/IServiceCenter;", "", "bind", "bid", "", "serviceMap", "Lcom/bytedance/ies/bullet/service/base/impl/ServiceMap;", "T", "Lcom/bytedance/ies/bullet/service/base/api/IBulletService;", "clazz", "Ljava/lang/Class;", "serviceInst", "(Ljava/lang/String;Ljava/lang/Class;Lcom/bytedance/ies/bullet/service/base/api/IBulletService;)Lcom/bytedance/ies/bullet/service/base/api/IServiceCenter;", "bindDefault", "(Ljava/lang/Class;Lcom/bytedance/ies/bullet/service/base/api/IBulletService;)Lcom/bytedance/ies/bullet/service/base/api/IServiceCenter;", "get", "(Ljava/lang/Class;)Lcom/bytedance/ies/bullet/service/base/api/IBulletService;", "(Ljava/lang/String;Ljava/lang/Class;)Lcom/bytedance/ies/bullet/service/base/api/IBulletService;", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.api.h */
public interface IServiceCenter {
    /* renamed from: a */
    <T extends IBulletService> T mo52635a(String str, Class<T> cls);

    /* renamed from: a */
    <T extends IBulletService> IServiceCenter mo52636a(Class<T> cls, T t);

    /* renamed from: a */
    IServiceCenter mo52637a(String str, ServiceMap fVar);

    /* renamed from: a */
    <T extends IBulletService> IServiceCenter mo52638a(String str, Class<T> cls, T t);

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.service.base.api.h$a */
    public static final class C14413a {
        /* renamed from: a */
        public static <T extends IBulletService> IServiceCenter m58032a(IServiceCenter hVar, Class<T> cls, T t) {
            Intrinsics.checkParameterIsNotNull(cls, "clazz");
            Intrinsics.checkParameterIsNotNull(t, "serviceInst");
            return hVar.mo52638a("default_bid", cls, t);
        }
    }
}
