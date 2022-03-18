package kotlin.coroutines.intrinsics;

import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014ø\u0001\u0000¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "label", "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
public final class IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2 extends ContinuationImpl {
    final /* synthetic */ Function1 $block;
    final /* synthetic */ Continuation $completion;
    final /* synthetic */ CoroutineContext $context;
    private int label;

    /* access modifiers changed from: protected */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            this.label = 1;
            C69097g.m265891a(obj);
            return this.$block.invoke(this);
        } else if (i == 1) {
            this.label = 2;
            C69097g.m265891a(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2(Function1 function1, Continuation cVar, CoroutineContext fVar, Continuation cVar2, CoroutineContext fVar2) {
        super(cVar2, fVar2);
        this.$block = function1;
        this.$completion = cVar;
        this.$context = fVar;
    }
}
