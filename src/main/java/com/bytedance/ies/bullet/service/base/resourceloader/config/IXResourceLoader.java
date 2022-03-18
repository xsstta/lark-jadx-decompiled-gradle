package com.bytedance.ies.bullet.service.base.resourceloader.config;

import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.ResourceInfo;
import com.bytedance.ies.bullet.service.base.api.ILoggable;
import com.bytedance.ies.bullet.service.base.api.LogLevel;
import com.bytedance.ies.bullet.service.base.api.LoggerWrapper;
import com.bytedance.ies.bullet.service.base.impl.BaseBulletService;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H&J@\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00120\u0019H&J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/resourceloader/config/IXResourceLoader;", "Lcom/bytedance/ies/bullet/service/base/api/ILoggable;", "()V", "loaderLogger", "Lcom/bytedance/ies/bullet/service/base/api/LoggerWrapper;", "getLoaderLogger", "()Lcom/bytedance/ies/bullet/service/base/api/LoggerWrapper;", "setLoaderLogger", "(Lcom/bytedance/ies/bullet/service/base/api/LoggerWrapper;)V", "loggerWrapper", "getLoggerWrapper", "service", "Lcom/bytedance/ies/bullet/service/base/IResourceLoaderService;", "getService", "()Lcom/bytedance/ies/bullet/service/base/IResourceLoaderService;", "setService", "(Lcom/bytedance/ies/bullet/service/base/IResourceLoaderService;)V", "cancelLoad", "", "loadAsync", "input", "Lcom/bytedance/ies/bullet/service/base/ResourceInfo;", "config", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/TaskConfig;", "resolve", "Lkotlin/Function1;", "reject", "", "loadSync", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class IXResourceLoader implements ILoggable {
    private LoggerWrapper loaderLogger;
    public IResourceLoaderService service;

    public abstract void cancelLoad();

    public abstract void loadAsync(ResourceInfo mVar, TaskConfig jVar, Function1<? super ResourceInfo, Unit> function1, Function1<? super Throwable, Unit> function12);

    public abstract ResourceInfo loadSync(ResourceInfo mVar, TaskConfig jVar);

    public final LoggerWrapper getLoaderLogger() {
        return this.loaderLogger;
    }

    public final IResourceLoaderService getService() {
        IResourceLoaderService iResourceLoaderService = this.service;
        if (iResourceLoaderService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("service");
        }
        return iResourceLoaderService;
    }

    @Override // com.bytedance.ies.bullet.service.base.api.ILoggable
    public LoggerWrapper getLoggerWrapper() {
        LoggerWrapper kVar = this.loaderLogger;
        if (kVar != null) {
            return kVar;
        }
        IResourceLoaderService iResourceLoaderService = this.service;
        if (iResourceLoaderService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("service");
        }
        if (iResourceLoaderService != null) {
            return ((BaseBulletService) iResourceLoaderService).getLoggerWrapper();
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.service.base.impl.BaseBulletService");
    }

    public final void setLoaderLogger(LoggerWrapper kVar) {
        this.loaderLogger = kVar;
    }

    public final void setService(IResourceLoaderService iResourceLoaderService) {
        Intrinsics.checkParameterIsNotNull(iResourceLoaderService, "<set-?>");
        this.service = iResourceLoaderService;
    }

    @Override // com.bytedance.ies.bullet.service.base.api.ILoggable
    public void printReject(Throwable th, String str) {
        Intrinsics.checkParameterIsNotNull(th, "e");
        Intrinsics.checkParameterIsNotNull(str, "extraMsg");
        ILoggable.C14411b.m58026a(this, th, str);
    }

    @Override // com.bytedance.ies.bullet.service.base.api.ILoggable
    public void printLog(String str, LogLevel logLevel, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        Intrinsics.checkParameterIsNotNull(logLevel, "logLevel");
        Intrinsics.checkParameterIsNotNull(str2, "subModule");
        ILoggable.C14411b.m58024a(this, str, logLevel, str2);
    }
}
