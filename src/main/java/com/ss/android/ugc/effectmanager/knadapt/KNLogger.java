package com.ss.android.ugc.effectmanager.knadapt;

import bytekn.foundation.logger.ILogger;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J \u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/effectmanager/knadapt/KNLogger;", "Lbytekn/foundation/logger/ILogger;", "()V", "value", "", "enabled", "getEnabled", "()Z", "setEnabled", "(Z)V", "logDebug", "", "tag", "", "message", "logError", ApiHandler.API_CALLBACK_EXCEPTION, "", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.e.e */
public final class KNLogger implements ILogger {

    /* renamed from: a */
    public static final KNLogger f151439a = new KNLogger();

    private KNLogger() {
    }

    @Override // bytekn.foundation.logger.ILogger
    /* renamed from: a */
    public boolean mo8659a() {
        return EPLog.f151297a.mo207194a();
    }

    @Override // bytekn.foundation.logger.ILogger
    /* renamed from: a */
    public void mo8657a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "message");
        EPLog.m235179b(str, str2);
    }

    @Override // bytekn.foundation.logger.ILogger
    /* renamed from: b */
    public void mo8660b(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "message");
        EPLog.m235180c(str, str2);
    }

    @Override // bytekn.foundation.logger.ILogger
    /* renamed from: a */
    public void mo8658a(String str, String str2, Throwable th) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "message");
        Intrinsics.checkParameterIsNotNull(th, ApiHandler.API_CALLBACK_EXCEPTION);
        EPLog.m235177a(str, str2, th);
    }
}
