package bytekn.foundation.logger;

import bytekn.foundation.concurrent.SharedReference;
import bytekn.foundation.p054b.C1686c;
import com.ss.android.vc.statistics.p3180a.C63690d;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004J\"\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lbytekn/foundation/logger/Logger;", "", "()V", "SDK_TAG", "", "value", "", "enabled", "getEnabled", "()Z", "setEnabled", "(Z)V", "platformLogger", "Lbytekn/foundation/concurrent/SharedReference;", "Lbytekn/foundation/logger/ILogger;", C63690d.f160779a, "", "tag", "message", "e", ApiHandler.API_CALLBACK_EXCEPTION, "", "getTagWithSDK", "setLogger", "logger", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.c.b */
public final class Logger {

    /* renamed from: a */
    public static final Logger f5760a = new Logger();

    /* renamed from: b */
    private static SharedReference<ILogger> f5761b = new SharedReference<>(new PlatformLogger());

    private Logger() {
    }

    /* renamed from: a */
    public final boolean mo8664a() {
        return f5761b.mo8625a().mo8659a();
    }

    /* renamed from: a */
    private final String m7507a(String str) {
        return "EPKN.-" + str;
    }

    /* renamed from: a */
    public final void mo8661a(ILogger aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "logger");
        C1686c.m7469a(f5761b, aVar);
    }

    /* renamed from: a */
    public final void mo8662a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "message");
        if (mo8664a()) {
            f5761b.mo8625a().mo8657a(m7507a(str), str2);
        }
    }

    /* renamed from: a */
    public final void mo8663a(String str, String str2, Throwable th) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "message");
        if (th != null) {
            f5761b.mo8625a().mo8658a(f5760a.m7507a(str), str2, th);
        } else {
            f5761b.mo8625a().mo8660b(m7507a(str), str2);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m7508a(Logger bVar, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        bVar.mo8663a(str, str2, th);
    }
}
