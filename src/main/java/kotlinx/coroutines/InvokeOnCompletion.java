package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B6\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012'\u0010\u0004\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005j\u0002`\u000b¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R/\u0010\u0004\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005j\u0002`\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/InvokeOnCompletion;", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/Job;", "job", "handler", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "(Lkotlinx/coroutines/Job;Lkotlin/jvm/functions/Function1;)V", "invoke", "toString", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.bs */
final class InvokeOnCompletion extends JobNode<Job> {

    /* renamed from: a */
    private final Function1<Throwable, Unit> f173459a;

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public String toString() {
        return "InvokeOnCompletion[" + al.m266275b(this) + '@' + al.m266273a(this) + ']';
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* renamed from: a */
    public void mo242730a(Throwable th) {
        this.f173459a.invoke(th);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Unit invoke(Throwable th) {
        mo242730a(th);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public InvokeOnCompletion(Job btVar, Function1<? super Throwable, Unit> function1) {
        super(btVar);
        this.f173459a = function1;
    }
}
