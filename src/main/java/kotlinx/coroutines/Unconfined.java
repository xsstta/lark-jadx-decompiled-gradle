package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/Unconfined;", "Lkotlinx/coroutines/CoroutineDispatcher;", "()V", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "isDispatchNeeded", "", "toString", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.cy */
public final class Unconfined extends CoroutineDispatcher {

    /* renamed from: a */
    public static final Unconfined f173545a = new Unconfined();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: a */
    public boolean mo242639a(CoroutineContext fVar) {
        return false;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "Unconfined";
    }

    private Unconfined() {
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: a */
    public void mo6045a(CoroutineContext fVar, Runnable runnable) {
        YieldContext daVar = (YieldContext) fVar.get(YieldContext.f173547b);
        if (daVar != null) {
            daVar.f173548a = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }
}
