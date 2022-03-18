package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00058\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/ChildContinuation;", "Lkotlinx/coroutines/JobCancellingNode;", "Lkotlinx/coroutines/Job;", "parent", "child", "Lkotlinx/coroutines/CancellableContinuationImpl;", "(Lkotlinx/coroutines/Job;Lkotlinx/coroutines/CancellableContinuationImpl;)V", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.p */
public final class ChildContinuation extends JobCancellingNode<Job> {

    /* renamed from: a */
    public final CancellableContinuationImpl<?> f173874a;

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public String toString() {
        return "ChildContinuation[" + this.f173874a + ']';
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Unit invoke(Throwable th) {
        mo242730a(th);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* renamed from: a */
    public void mo242730a(Throwable th) {
        CancellableContinuationImpl<?> lVar = this.f173874a;
        lVar.mo243069c(lVar.mo242767a(this.f173463b));
    }

    public ChildContinuation(Job btVar, CancellableContinuationImpl<?> lVar) {
        super(btVar);
        this.f173874a = lVar;
    }
}
