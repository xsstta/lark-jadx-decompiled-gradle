package bytekn.foundation.logger;

import android.util.Log;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lbytekn/foundation/logger/PlatformLogger;", "Lbytekn/foundation/logger/ILogger;", "()V", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "logDebug", "", "tag", "", "message", "logError", ApiHandler.API_CALLBACK_EXCEPTION, "", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.c.c */
public final class PlatformLogger implements ILogger {

    /* renamed from: a */
    private boolean f5762a;

    @Override // bytekn.foundation.logger.ILogger
    /* renamed from: a */
    public boolean mo8659a() {
        return this.f5762a;
    }

    @Override // bytekn.foundation.logger.ILogger
    /* renamed from: b */
    public void mo8660b(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "message");
        Log.e(str, str2);
    }

    @Override // bytekn.foundation.logger.ILogger
    /* renamed from: a */
    public void mo8657a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "message");
        if (mo8659a()) {
            Log.d(str, str2);
        }
    }

    @Override // bytekn.foundation.logger.ILogger
    /* renamed from: a */
    public void mo8658a(String str, String str2, Throwable th) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "message");
        Intrinsics.checkParameterIsNotNull(th, ApiHandler.API_CALLBACK_EXCEPTION);
        Log.e(str, str2, th);
    }
}
