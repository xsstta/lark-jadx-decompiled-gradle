package kotlinx.coroutines;

import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/ResumeAwaitOnCompletion;", "T", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/JobSupport;", "job", "continuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/CancellableContinuationImpl;)V", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.cl */
public final class ResumeAwaitOnCompletion<T> extends JobNode<JobSupport> {

    /* renamed from: a */
    private final CancellableContinuationImpl<T> f173531a;

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public String toString() {
        return "ResumeAwaitOnCompletion[" + this.f173531a + ']';
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
        Object m = ((JobSupport) this.f173463b).mo242762m();
        if (ak.m266269a() && !(!(m instanceof Incomplete))) {
            throw new AssertionError();
        } else if (m instanceof CompletedExceptionally) {
            Throwable th2 = ((CompletedExceptionally) m).f173971a;
            Result.Companion aVar = Result.Companion;
            this.f173531a.resumeWith(Result.m271569constructorimpl(C69097g.m265890a(th2)));
        } else {
            Object b = cb.m266512b(m);
            Result.Companion aVar2 = Result.Companion;
            this.f173531a.resumeWith(Result.m271569constructorimpl(b));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.l<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public ResumeAwaitOnCompletion(JobSupport caVar, CancellableContinuationImpl<? super T> lVar) {
        super(caVar);
        this.f173531a = lVar;
    }
}
