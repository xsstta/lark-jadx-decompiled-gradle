package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007HH\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001"}, d2 = {"withPermit", "", "T", "Lkotlinx/coroutines/sync/Semaphore;", "action", "Lkotlin/Function0;", "continuation", "Lkotlin/coroutines/Continuation;"}, mo238835k = 3, mv = {1, 1, 16})
@DebugMetadata(mo239172c = "kotlinx.coroutines.sync.SemaphoreKt", mo239173f = "Semaphore.kt", mo239174i = {0, 0}, mo239175l = {84}, mo239176m = "withPermit", mo239177n = {"$this$withPermit", "action"}, mo239178s = {"L$0", "L$1"})
public final class SemaphoreKt$withPermit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public SemaphoreKt$withPermit$1(Continuation cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C69581g.m267305a(null, null, this);
    }
}
