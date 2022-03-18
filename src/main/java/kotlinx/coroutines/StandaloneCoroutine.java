package kotlinx.coroutines;

import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\b\u0012\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0014¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/StandaloneCoroutine;", "Lkotlinx/coroutines/AbstractCoroutine;", "", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "active", "", "(Lkotlin/coroutines/CoroutineContext;Z)V", "handleJobException", ApiHandler.API_CALLBACK_EXCEPTION, "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.cp */
public class StandaloneCoroutine extends AbstractCoroutine<Unit> {
    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: f */
    public boolean mo242760f(Throwable th) {
        C69363ae.m266257a(getContext(), th);
        return true;
    }

    public StandaloneCoroutine(CoroutineContext fVar, boolean z) {
        super(fVar, z);
    }
}
