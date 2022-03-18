package kotlinx.coroutines;

import com.tt.frontendapiinterface.ApiHandler;
import kotlin.C69026a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a%\u0010\u0000\u001a\u00020\u00012\u001a\b\u0004\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\b\u001a\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0000¨\u0006\r"}, d2 = {"CoroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handler", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext;", "", "", "handleCoroutineException", "context", ApiHandler.API_CALLBACK_EXCEPTION, "handlerException", "originalException", "thrownException", "kotlinx-coroutines-core"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.ae */
public final class C69363ae {
    /* renamed from: a */
    public static final Throwable m266256a(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C69026a.m265651a(runtimeException, th);
        return runtimeException;
    }

    /* renamed from: a */
    public static final void m266257a(CoroutineContext fVar, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) fVar.get(CoroutineExceptionHandler.f173393a);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(fVar, th);
            } else {
                C69362ad.m266255a(fVar, th);
            }
        } catch (Throwable th2) {
            C69362ad.m266255a(fVar, m266256a(th, th2));
        }
    }
}
