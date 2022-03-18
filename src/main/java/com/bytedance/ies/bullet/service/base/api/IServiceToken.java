package com.bytedance.ies.bullet.service.base.api;

import com.bytedance.ies.bullet.service.base.api.ILoggable;
import com.bytedance.ies.bullet.service.base.impl.ServiceCenter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\n\u001a\u0004\u0018\u0001H\u000b\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\rH\u0016¢\u0006\u0002\u0010\u000eJ'\u0010\u000f\u001a\u0004\u0018\u0001H\u000b\"\b\b\u0000\u0010\u000b*\u00020\u00102\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\rH\u0016¢\u0006\u0002\u0010\u0011R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;", "Lcom/bytedance/ies/bullet/service/base/api/ILoggable;", "bid", "", "getBid", "()Ljava/lang/String;", "serviceContext", "Lcom/bytedance/ies/bullet/service/base/api/IServiceContext;", "getServiceContext", "()Lcom/bytedance/ies/bullet/service/base/api/IServiceContext;", "getDependency", "T", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "getService", "Lcom/bytedance/ies/bullet/service/base/api/IBulletService;", "(Ljava/lang/Class;)Lcom/bytedance/ies/bullet/service/base/api/IBulletService;", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.api.j */
public interface IServiceToken extends ILoggable {
    /* renamed from: a */
    <T extends IBulletService> T mo52657a(Class<T> cls);

    /* renamed from: a */
    String mo52658a();

    /* renamed from: b */
    IServiceContext mo52659b();

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.service.base.api.j$a */
    public static final class C14415a {
        /* renamed from: a */
        public static void m58042a(IServiceToken jVar, String str, LogLevel logLevel, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "msg");
            Intrinsics.checkParameterIsNotNull(logLevel, "logLevel");
            Intrinsics.checkParameterIsNotNull(str2, "subModule");
            ILoggable.C14411b.m58024a(jVar, str, logLevel, str2);
        }

        /* renamed from: a */
        public static void m58043a(IServiceToken jVar, Throwable th, String str) {
            Intrinsics.checkParameterIsNotNull(th, "e");
            Intrinsics.checkParameterIsNotNull(str, "extraMsg");
            ILoggable.C14411b.m58026a(jVar, th, str);
        }

        /* renamed from: a */
        public static <T extends IBulletService> T m58041a(IServiceToken jVar, Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "clazz");
            return (T) ServiceCenter.f37850b.mo52643a().mo52635a(jVar.mo52658a(), cls);
        }
    }
}
