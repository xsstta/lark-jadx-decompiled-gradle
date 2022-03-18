package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0007H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/ResumeUndispatchedRunnable;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CancellableContinuation;)V", "run", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.cn */
final class ResumeUndispatchedRunnable implements Runnable {

    /* renamed from: a */
    private final CoroutineDispatcher f173533a;

    /* renamed from: b */
    private final CancellableContinuation<Unit> f173534b;

    public void run() {
        this.f173534b.mo243065a(this.f173533a, Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.k<? super kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ResumeUndispatchedRunnable(CoroutineDispatcher acVar, CancellableContinuation<? super Unit> kVar) {
        this.f173533a = acVar;
        this.f173534b = kVar;
    }
}
