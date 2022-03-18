package kotlin.coroutines.intrinsics;

import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C69121n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014ø\u0001\u0000¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "label", "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
public final class IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4 extends ContinuationImpl {
    final /* synthetic */ Continuation $completion;
    final /* synthetic */ CoroutineContext $context;
    final /* synthetic */ Object $receiver$inlined;
    final /* synthetic */ Function2 $this_createCoroutineUnintercepted$inlined;
    private int label;

    /* access modifiers changed from: protected */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            this.label = 1;
            C69097g.m265891a(obj);
            IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4 intrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4 = this;
            Function2 kVar = this.$this_createCoroutineUnintercepted$inlined;
            if (kVar != null) {
                return ((Function2) C69121n.m265985b(kVar, 2)).invoke(this.$receiver$inlined, intrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4);
            }
            throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        } else if (i == 1) {
            this.label = 2;
            C69097g.m265891a(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4(Continuation cVar, CoroutineContext fVar, Continuation cVar2, CoroutineContext fVar2, Function2 kVar, Object obj) {
        super(cVar2, fVar2);
        this.$completion = cVar;
        this.$context = fVar;
        this.$this_createCoroutineUnintercepted$inlined = kVar;
        this.$receiver$inlined = obj;
    }
}
