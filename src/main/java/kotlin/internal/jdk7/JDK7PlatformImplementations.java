package kotlin.internal.jdk7;

import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;
import kotlin.internal.PlatformImplementations;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "Lkotlin/internal/PlatformImplementations;", "()V", "addSuppressed", "", "cause", "", ApiHandler.API_CALLBACK_EXCEPTION, "kotlin-stdlib-jdk7"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.internal.a.a */
public class JDK7PlatformImplementations extends PlatformImplementations {
    @Override // kotlin.internal.PlatformImplementations
    /* renamed from: a */
    public void mo239207a(Throwable th, Throwable th2) {
        Intrinsics.checkParameterIsNotNull(th, "cause");
        Intrinsics.checkParameterIsNotNull(th2, ApiHandler.API_CALLBACK_EXCEPTION);
        th.addSuppressed(th2);
    }
}
