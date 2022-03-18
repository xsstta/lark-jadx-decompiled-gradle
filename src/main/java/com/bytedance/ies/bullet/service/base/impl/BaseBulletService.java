package com.bytedance.ies.bullet.service.base.impl;

import com.bytedance.ies.bullet.service.base.ILoggerService;
import com.bytedance.ies.bullet.service.base.api.IBulletService;
import com.bytedance.ies.bullet.service.base.api.ILoggable;
import com.bytedance.ies.bullet.service.base.api.IServiceToken;
import com.bytedance.ies.bullet.service.base.api.LogLevel;
import com.bytedance.ies.bullet.service.base.api.LoggerWrapper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\u0005H\u0016J)\u0010\r\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0012¢\u0006\u0002\u0010\u0013J%\u0010\u0014\u001a\u0004\u0018\u0001H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0012¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078VX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/impl/BaseBulletService;", "Lcom/bytedance/ies/bullet/service/base/api/IBulletService;", "Lcom/bytedance/ies/bullet/service/base/api/ILoggable;", "()V", "bid", "", "loggerWrapper", "Lcom/bytedance/ies/bullet/service/base/api/LoggerWrapper;", "getLoggerWrapper", "()Lcom/bytedance/ies/bullet/service/base/api/LoggerWrapper;", "loggerWrapper$delegate", "Lkotlin/Lazy;", "getBid", "getDependency", "T", "token", "Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;", "clazz", "Ljava/lang/Class;", "(Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;Ljava/lang/Class;)Ljava/lang/Object;", "getService", "(Ljava/lang/Class;)Lcom/bytedance/ies/bullet/service/base/api/IBulletService;", "onRegister", "", "onUnRegister", "Companion", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.a.a */
public class BaseBulletService implements IBulletService, ILoggable {

    /* renamed from: e */
    public static final Companion f37844e = new Companion(null);

    /* renamed from: a */
    private final Lazy f37845a = LazyKt.lazy(new C14410b(this));

    /* renamed from: d */
    public String f37846d = "default_bid";

    @Override // com.bytedance.ies.bullet.service.base.api.IBulletService
    /* renamed from: a */
    public void mo52581a() {
    }

    @Override // com.bytedance.ies.bullet.service.base.api.ILoggable
    public LoggerWrapper getLoggerWrapper() {
        return (LoggerWrapper) this.f37845a.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/impl/BaseBulletService$Companion;", "", "()V", "TAG", "", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.service.base.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public String mo52631c() {
        return this.f37846d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/bullet/service/base/api/LoggerWrapper;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.service.base.a.a$b */
    static final class C14410b extends Lambda implements Function0<LoggerWrapper> {
        final /* synthetic */ BaseBulletService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14410b(BaseBulletService aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LoggerWrapper invoke() {
            return new LoggerWrapper((ILoggerService) ServiceCenter.f37850b.mo52643a().mo52635a(this.this$0.f37846d, ILoggerService.class), "Service");
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.api.IBulletService
    /* renamed from: a */
    public void mo52613a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "bid");
        this.f37846d = str;
    }

    /* renamed from: a */
    public final <T extends IBulletService> T mo52629a(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        return (T) ServiceCenter.f37850b.mo52643a().mo52635a(this.f37846d, cls);
    }

    @Override // com.bytedance.ies.bullet.service.base.api.ILoggable
    public void printReject(Throwable th, String str) {
        Intrinsics.checkParameterIsNotNull(th, "e");
        Intrinsics.checkParameterIsNotNull(str, "extraMsg");
        ILoggable.C14411b.m58026a(this, th, str);
    }

    /* renamed from: a */
    public final <T> T mo52630a(IServiceToken jVar, Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(jVar, "token");
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        return (T) jVar.mo52659b().mo52653a(cls);
    }

    @Override // com.bytedance.ies.bullet.service.base.api.ILoggable
    public void printLog(String str, LogLevel logLevel, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        Intrinsics.checkParameterIsNotNull(logLevel, "logLevel");
        Intrinsics.checkParameterIsNotNull(str2, "subModule");
        ILoggable.C14411b.m58024a(this, str, logLevel, str2);
    }
}
