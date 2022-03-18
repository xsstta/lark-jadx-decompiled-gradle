package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69373by;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/LifecycleCoroutineScope;", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroidx/lifecycle/Lifecycle;Lkotlin/coroutines/CoroutineContext;)V", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getLifecycle$lifecycle_runtime_ktx_release", "()Landroidx/lifecycle/Lifecycle;", "onStateChanged", "", ShareHitPoint.f121868c, "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "register", "lifecycle-runtime-ktx_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements AbstractC1168n {

    /* renamed from: a */
    private final Lifecycle f4183a;

    /* renamed from: b */
    private final CoroutineContext f4184b;

    @Override // androidx.lifecycle.LifecycleCoroutineScope
    /* renamed from: a */
    public Lifecycle mo5906a() {
        return this.f4183a;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f4184b;
    }

    /* renamed from: b */
    public final void mo5907b() {
        Job unused = C69553g.m266944a(this, Dispatchers.m266324b().mo242660a(), null, new C1118a(this, null), 2, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 15})
    @DebugMetadata(mo239172c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", mo239173f = "Lifecycle.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl$a */
    static final class C1118a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        private CoroutineScope p$;
        final /* synthetic */ LifecycleCoroutineScopeImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1118a(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, Continuation cVar) {
            super(2, cVar);
            this.this$0 = lifecycleCoroutineScopeImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C1118a aVar = new C1118a(this.this$0, cVar);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C1118a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                if (this.this$0.mo5906a().getCurrentState().compareTo((Enum) Lifecycle.State.INITIALIZED) >= 0) {
                    this.this$0.mo5906a().addObserver(this.this$0);
                } else {
                    C69373by.m266419a(ahVar.getCoroutineContext(), null, 1, null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, CoroutineContext fVar) {
        Intrinsics.checkParameterIsNotNull(lifecycle, "lifecycle");
        Intrinsics.checkParameterIsNotNull(fVar, "coroutineContext");
        this.f4183a = lifecycle;
        this.f4184b = fVar;
        if (mo5906a().getCurrentState() == Lifecycle.State.DESTROYED) {
            C69373by.m266419a(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(event, "event");
        if (mo5906a().getCurrentState().compareTo((Enum) Lifecycle.State.DESTROYED) <= 0) {
            mo5906a().removeObserver(this);
            C69373by.m266419a(getCoroutineContext(), null, 1, null);
        }
    }
}
