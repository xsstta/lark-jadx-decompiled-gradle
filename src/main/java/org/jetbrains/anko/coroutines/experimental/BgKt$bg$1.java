package org.jetbrains.anko.coroutines.experimental;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.experimental.Continuation;
import kotlin.coroutines.experimental.jvm.internal.CoroutineImpl;
import kotlin.coroutines.experimental.p3468a.C69079a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.experimental.CoroutineScope;

@Metadata(bv = {1, 0, 1}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/experimental/CoroutineScope;", "invoke", "(Lkotlinx/coroutines/experimental/CoroutineScope;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 5})
public final class BgKt$bg$1 extends CoroutineImpl implements Function2<CoroutineScope, Continuation<? super T>, Object> {
    final /* synthetic */ Function0 $block;
    private CoroutineScope p$;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BgKt$bg$1(Function0 function0, Continuation aVar) {
        super(2, aVar);
        this.$block = function0;
    }

    public final Continuation<Unit> create(CoroutineScope coroutineScope, Continuation<? super T> aVar) {
        Intrinsics.checkParameterIsNotNull(coroutineScope, "$receiver");
        Intrinsics.checkParameterIsNotNull(aVar, "$continuation");
        BgKt$bg$1 bgKt$bg$1 = new BgKt$bg$1(this.$block, aVar);
        bgKt$bg$1.p$ = coroutineScope;
        return bgKt$bg$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> aVar) {
        Intrinsics.checkParameterIsNotNull(coroutineScope, "$receiver");
        Intrinsics.checkParameterIsNotNull(aVar, "$continuation");
        return ((BgKt$bg$1) create(coroutineScope, (Continuation) aVar)).doResume(Unit.INSTANCE, null);
    }

    @Override // kotlin.coroutines.experimental.jvm.internal.CoroutineImpl
    public final Object doResume(Object obj, Throwable th) {
        C69079a.m265815a();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else if (th == null) {
            return this.$block.invoke();
        } else {
            throw th;
        }
    }
}
