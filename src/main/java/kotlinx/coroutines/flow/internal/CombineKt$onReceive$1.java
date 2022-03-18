package kotlinx.coroutines.flow.internal;

import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C69117h;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
@DebugMetadata(mo239172c = "kotlinx.coroutines.flow.internal.CombineKt$onReceive$1", mo239173f = "Combine.kt", mo239174i = {0}, mo239175l = {89}, mo239176m = "invokeSuspend", mo239177n = {"it"}, mo239178s = {"L$0"})
public final class CombineKt$onReceive$1 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0 $onClosed;
    final /* synthetic */ Function2 $onReceive;
    Object L$0;
    int label;
    private Object p$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombineKt$onReceive$1(Function0 function0, Function2 kVar, Continuation cVar) {
        super(2, cVar);
        this.$onClosed = function0;
        this.$onReceive = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
        CombineKt$onReceive$1 combineKt$onReceive$1 = new CombineKt$onReceive$1(this.$onClosed, this.$onReceive, cVar);
        combineKt$onReceive$1.p$0 = obj;
        return combineKt$onReceive$1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Unit> cVar) {
        return ((CombineKt$onReceive$1) create(obj, cVar)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        Object obj2 = this.p$0;
        if (obj2 == null) {
            this.$onClosed.invoke();
        } else {
            Function2 kVar = this.$onReceive;
            C69117h.m265970a(0);
            kVar.invoke(obj2, this);
            C69117h.m265970a(2);
            C69117h.m265970a(1);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a = C69086a.m265828a();
        int i = this.label;
        if (i == 0) {
            C69097g.m265891a(obj);
            Object obj2 = this.p$0;
            if (obj2 == null) {
                this.$onClosed.invoke();
            } else {
                Function2 kVar = this.$onReceive;
                this.L$0 = obj2;
                this.label = 1;
                if (kVar.invoke(obj2, this) == a) {
                    return a;
                }
            }
        } else if (i == 1) {
            C69097g.m265891a(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
