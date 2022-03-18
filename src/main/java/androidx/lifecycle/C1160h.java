package androidx.lifecycle;

import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a0\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a2\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"asFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "Landroidx/lifecycle/LiveData;", "asLiveData", "context", "Lkotlin/coroutines/CoroutineContext;", "timeout", "Ljava/time/Duration;", "timeoutInMs", "", "lifecycle-livedata-ktx_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: androidx.lifecycle.h */
public final class C1160h {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "Landroidx/lifecycle/LiveDataScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 15})
    @DebugMetadata(mo239172c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", mo239173f = "FlowLiveData.kt", mo239174i = {0, 0}, mo239175l = {139}, mo239176m = "invokeSuspend", mo239177n = {"$this$liveData", "$this$collect$iv"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: androidx.lifecycle.h$a */
    static final class C1161a extends SuspendLambda implements Function2<LiveDataScope<T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow $this_asLiveData;
        Object L$0;
        Object L$1;
        int label;
        private LiveDataScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1161a(Flow aVar, Continuation cVar) {
            super(2, cVar);
            this.$this_asLiveData = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C1161a aVar = new C1161a(this.$this_asLiveData, cVar);
            aVar.p$ = (LiveDataScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> cVar) {
            return ((C1161a) create(obj, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: androidx.lifecycle.h$a$a */
        public static final class C1162a implements FlowCollector<T> {

            /* renamed from: a */
            final /* synthetic */ LiveDataScope f4289a;

            public C1162a(LiveDataScope sVar) {
                this.f4289a = sVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof androidx.lifecycle.FlowLiveDataConversions$asLiveData$1$invokeSuspend$$inlined$collect$1$1
                    if (r0 == 0) goto L_0x0014
                    r0 = r6
                    androidx.lifecycle.FlowLiveDataConversions$asLiveData$1$invokeSuspend$$inlined$collect$1$1 r0 = (androidx.lifecycle.FlowLiveDataConversions$asLiveData$1$invokeSuspend$$inlined$collect$1$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r1 = r1 & r2
                    if (r1 == 0) goto L_0x0014
                    int r6 = r0.label
                    int r6 = r6 - r2
                    r0.label = r6
                    goto L_0x0019
                L_0x0014:
                    androidx.lifecycle.FlowLiveDataConversions$asLiveData$1$invokeSuspend$$inlined$collect$1$1 r0 = new androidx.lifecycle.FlowLiveDataConversions$asLiveData$1$invokeSuspend$$inlined$collect$1$1
                    r0.<init>(r4, r6)
                L_0x0019:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C69086a.m265828a()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x003e
                    if (r2 != r3) goto L_0x0036
                    java.lang.Object r5 = r0.L$3
                    java.lang.Object r5 = r0.L$2
                    kotlin.coroutines.c r5 = (kotlin.coroutines.Continuation) r5
                    java.lang.Object r5 = r0.L$1
                    java.lang.Object r5 = r0.L$0
                    androidx.lifecycle.h$a$a r5 = (androidx.lifecycle.C1160h.C1161a.C1162a) r5
                    kotlin.C69097g.m265891a(r6)
                    goto L_0x0057
                L_0x0036:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x003e:
                    kotlin.C69097g.m265891a(r6)
                    r6 = r0
                    kotlin.coroutines.c r6 = (kotlin.coroutines.Continuation) r6
                    androidx.lifecycle.s r2 = r4.f4289a
                    r0.L$0 = r4
                    r0.L$1 = r5
                    r0.L$2 = r6
                    r0.L$3 = r5
                    r0.label = r3
                    java.lang.Object r5 = r2.mo6040a(r5, r0)
                    if (r5 != r1) goto L_0x0057
                    return r1
                L_0x0057:
                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1160h.C1161a.C1162a.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                LiveDataScope sVar = this.p$;
                Flow aVar = this.$this_asLiveData;
                this.L$0 = sVar;
                this.L$1 = aVar;
                this.label = 1;
                if (aVar.mo242938a(new C1162a(sVar), this) == a) {
                    return a;
                }
            } else if (i == 1) {
                Flow aVar2 = (Flow) this.L$1;
                LiveDataScope sVar2 = (LiveDataScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }
}
