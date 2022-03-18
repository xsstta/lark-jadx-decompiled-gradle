package com.bytedance.ies.bullet.service.base.api;

import com.bytedance.ies.bullet.service.base.ILoggerService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/api/LoggerWrapper;", "", "logger", "Lcom/bytedance/ies/bullet/service/base/ILoggerService;", "subModule", "", "(Lcom/bytedance/ies/bullet/service/base/ILoggerService;Ljava/lang/String;)V", "getLogger", "()Lcom/bytedance/ies/bullet/service/base/ILoggerService;", "getSubModule", "()Ljava/lang/String;", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.api.k */
public final class LoggerWrapper {

    /* renamed from: a */
    private final ILoggerService f37870a;

    /* renamed from: b */
    private final String f37871b;

    /* renamed from: a */
    public final ILoggerService mo52660a() {
        return this.f37870a;
    }

    /* renamed from: b */
    public final String mo52661b() {
        return this.f37871b;
    }

    public LoggerWrapper(ILoggerService dVar, String str) {
        Intrinsics.checkParameterIsNotNull(str, "subModule");
        this.f37870a = dVar;
        this.f37871b = str;
    }
}
