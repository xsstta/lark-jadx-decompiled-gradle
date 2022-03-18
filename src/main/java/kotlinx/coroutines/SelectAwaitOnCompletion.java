package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.selects.SelectInstance;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003BB\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R/\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tX\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/SelectAwaitOnCompletion;", "T", "R", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/JobSupport;", "job", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.co */
final class SelectAwaitOnCompletion<T, R> extends JobNode<JobSupport> {

    /* renamed from: a */
    private final SelectInstance<R> f173535a;

    /* renamed from: c */
    private final Function2<T, Continuation<? super R>, Object> f173536c;

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public String toString() {
        return "SelectAwaitOnCompletion[" + this.f173535a + ']';
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
        if (this.f173535a.mo243123g()) {
            ((JobSupport) this.f173463b).mo242752c(this.f173535a, this.f173536c);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.selects.d<? super R> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.k<? super T, ? super kotlin.coroutines.c<? super R>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectAwaitOnCompletion(JobSupport caVar, SelectInstance<? super R> dVar, Function2<? super T, ? super Continuation<? super R>, ? extends Object> kVar) {
        super(caVar);
        this.f173535a = dVar;
        this.f173536c = kVar;
    }
}
