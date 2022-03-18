package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69388e;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aD\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022'\u0010\u0003\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001aD\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\n2'\u0010\u0003\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001aD\u0010\f\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022'\u0010\u0003\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001aD\u0010\f\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\n2'\u0010\u0003\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001aD\u0010\r\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022'\u0010\u0003\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001aD\u0010\r\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\n2'\u0010\u0003\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001aL\u0010\u000e\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102'\u0010\u0003\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"whenCreated", "T", "Landroidx/lifecycle/Lifecycle;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/lifecycle/Lifecycle;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "whenResumed", "whenStarted", "whenStateAtLeast", "minState", "Landroidx/lifecycle/Lifecycle$State;", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-runtime-ktx_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: androidx.lifecycle.z */
public final class C1179z {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 15})
    @DebugMetadata(mo239172c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", mo239173f = "PausingDispatcher.kt", mo239174i = {0, 0, 0, 0}, mo239175l = {163}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "job", "dispatcher", "controller"}, mo239178s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: androidx.lifecycle.z$a */
    public static final class C1180a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function2 $block;
        final /* synthetic */ Lifecycle.State $minState;
        final /* synthetic */ Lifecycle $this_whenStateAtLeast;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1180a(Lifecycle lifecycle, Lifecycle.State state, Function2 kVar, Continuation cVar) {
            super(2, cVar);
            this.$this_whenStateAtLeast = lifecycle;
            this.$minState = state;
            this.$block = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C1180a aVar = new C1180a(this.$this_whenStateAtLeast, this.$minState, this.$block, cVar);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Object obj) {
            return ((C1180a) create(ahVar, (Continuation) obj)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            LifecycleController kVar;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                Job btVar = (Job) ahVar.getCoroutineContext().get(Job.f173460b);
                if (btVar != null) {
                    PausingDispatcher yVar = new PausingDispatcher();
                    LifecycleController kVar2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, yVar.f4302a, btVar);
                    try {
                        Function2 kVar3 = this.$block;
                        this.L$0 = ahVar;
                        this.L$1 = btVar;
                        this.L$2 = yVar;
                        this.L$3 = kVar2;
                        this.label = 1;
                        obj = C69388e.m266829a(yVar, kVar3, this);
                        if (obj == a) {
                            return a;
                        }
                        kVar = kVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        kVar = kVar2;
                        kVar.mo6037a();
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("when[State] methods should have a parent job".toString());
                }
            } else if (i == 1) {
                kVar = (LifecycleController) this.L$3;
                PausingDispatcher yVar2 = (PausingDispatcher) this.L$2;
                Job btVar2 = (Job) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                try {
                    C69097g.m265891a(obj);
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar.mo6037a();
            return obj;
        }
    }

    /* renamed from: a */
    public static final <T> Object m5420a(Lifecycle lifecycle, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> kVar, Continuation<? super T> cVar) {
        return m5419a(lifecycle, Lifecycle.State.RESUMED, kVar, cVar);
    }

    /* renamed from: a */
    public static final <T> Object m5419a(Lifecycle lifecycle, Lifecycle.State state, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> kVar, Continuation<? super T> cVar) {
        return C69388e.m266829a(Dispatchers.m266324b().mo242660a(), new C1180a(lifecycle, state, kVar, null), cVar);
    }
}
