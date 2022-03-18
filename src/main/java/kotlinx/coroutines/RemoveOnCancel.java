package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/RemoveOnCancel;", "Lkotlinx/coroutines/CancelHandler;", "node", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.ck */
public final class RemoveOnCancel extends CancelHandler {

    /* renamed from: a */
    private final LockFreeLinkedListNode f173530a;

    public String toString() {
        return "RemoveOnCancel[" + this.f173530a + ']';
    }

    public RemoveOnCancel(LockFreeLinkedListNode oVar) {
        this.f173530a = oVar;
    }

    @Override // kotlinx.coroutines.CancelHandlerBase
    /* renamed from: a */
    public void mo242689a(Throwable th) {
        this.f173530a.cL_();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Unit invoke(Throwable th) {
        mo242689a(th);
        return Unit.INSTANCE;
    }
}
