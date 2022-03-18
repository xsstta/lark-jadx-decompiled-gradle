package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0013\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/ResumeOnCompletion;", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/Job;", "job", "continuation", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)V", "invoke", "cause", "", "toString", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.cm */
public final class ResumeOnCompletion extends JobNode<Job> {

    /* renamed from: a */
    private final Continuation<Unit> f173532a;

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public String toString() {
        return "ResumeOnCompletion[" + this.f173532a + ']';
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
        Continuation<Unit> cVar = this.f173532a;
        Unit unit = Unit.INSTANCE;
        Result.Companion aVar = Result.Companion;
        cVar.resumeWith(Result.m271569constructorimpl(unit));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.coroutines.c<? super kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ResumeOnCompletion(Job btVar, Continuation<? super Unit> cVar) {
        super(btVar);
        this.f173532a = cVar;
    }
}
