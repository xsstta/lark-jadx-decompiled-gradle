package com.bytedance.ies.bullet.service.base.api;

import com.bytedance.ies.bullet.service.base.ILoggerService;
import com.bytedance.ies.bullet.service.base.api.IServiceToken;
import com.bytedance.ies.bullet.service.base.impl.ServiceCenter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/api/BaseServiceToken;", "Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;", "bid", "", "serviceContext", "Lcom/bytedance/ies/bullet/service/base/api/IServiceContext;", "(Ljava/lang/String;Lcom/bytedance/ies/bullet/service/base/api/IServiceContext;)V", "getBid", "()Ljava/lang/String;", "loggerWrapper", "Lcom/bytedance/ies/bullet/service/base/api/LoggerWrapper;", "getLoggerWrapper", "()Lcom/bytedance/ies/bullet/service/base/api/LoggerWrapper;", "getServiceContext", "()Lcom/bytedance/ies/bullet/service/base/api/IServiceContext;", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.api.b */
public final class BaseServiceToken implements IServiceToken {

    /* renamed from: a */
    private final LoggerWrapper f37864a = new LoggerWrapper((ILoggerService) ServiceCenter.f37850b.mo52643a().mo52635a(mo52658a(), ILoggerService.class), "Token");

    /* renamed from: b */
    private final String f37865b;

    /* renamed from: d */
    private final IServiceContext f37866d;

    @Override // com.bytedance.ies.bullet.service.base.api.IServiceToken
    /* renamed from: a */
    public String mo52658a() {
        return this.f37865b;
    }

    @Override // com.bytedance.ies.bullet.service.base.api.IServiceToken
    /* renamed from: b */
    public IServiceContext mo52659b() {
        return this.f37866d;
    }

    @Override // com.bytedance.ies.bullet.service.base.api.ILoggable
    public LoggerWrapper getLoggerWrapper() {
        return this.f37864a;
    }

    @Override // com.bytedance.ies.bullet.service.base.api.IServiceToken
    /* renamed from: a */
    public <T extends IBulletService> T mo52657a(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        return (T) IServiceToken.C14415a.m58041a(this, cls);
    }

    @Override // com.bytedance.ies.bullet.service.base.api.ILoggable
    public void printReject(Throwable th, String str) {
        Intrinsics.checkParameterIsNotNull(th, "e");
        Intrinsics.checkParameterIsNotNull(str, "extraMsg");
        IServiceToken.C14415a.m58043a(this, th, str);
    }

    public BaseServiceToken(String str, IServiceContext iVar) {
        Intrinsics.checkParameterIsNotNull(str, "bid");
        Intrinsics.checkParameterIsNotNull(iVar, "serviceContext");
        this.f37865b = str;
        this.f37866d = iVar;
    }

    @Override // com.bytedance.ies.bullet.service.base.api.ILoggable
    public void printLog(String str, LogLevel logLevel, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        Intrinsics.checkParameterIsNotNull(logLevel, "logLevel");
        Intrinsics.checkParameterIsNotNull(str2, "subModule");
        IServiceToken.C14415a.m58042a(this, str, logLevel, str2);
    }
}
