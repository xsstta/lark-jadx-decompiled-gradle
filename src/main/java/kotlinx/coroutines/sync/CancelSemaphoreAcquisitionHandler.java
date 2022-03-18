package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.CancelHandler;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/sync/CancelSemaphoreAcquisitionHandler;", "Lkotlinx/coroutines/CancelHandler;", "segment", "Lkotlinx/coroutines/sync/SemaphoreSegment;", "index", "", "(Lkotlinx/coroutines/sync/SemaphoreSegment;I)V", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.sync.a */
final class CancelSemaphoreAcquisitionHandler extends CancelHandler {

    /* renamed from: a */
    private final SemaphoreSegment f173941a;

    /* renamed from: b */
    private final int f173942b;

    public String toString() {
        return "CancelSemaphoreAcquisitionHandler[" + this.f173941a + ", " + this.f173942b + ']';
    }

    @Override // kotlinx.coroutines.CancelHandlerBase
    /* renamed from: a */
    public void mo242689a(Throwable th) {
        this.f173941a.mo243133a(this.f173942b);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Unit invoke(Throwable th) {
        mo242689a(th);
        return Unit.INSTANCE;
    }

    public CancelSemaphoreAcquisitionHandler(SemaphoreSegment hVar, int i) {
        this.f173941a = hVar;
        this.f173942b = i;
    }
}
