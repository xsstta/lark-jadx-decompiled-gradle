package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0007J\u0011\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/LifecycleController;", "", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "minState", "Landroidx/lifecycle/Lifecycle$State;", "dispatchQueue", "Landroidx/lifecycle/DispatchQueue;", "parentJob", "Lkotlinx/coroutines/Job;", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/DispatchQueue;Lkotlinx/coroutines/Job;)V", "observer", "Landroidx/lifecycle/LifecycleEventObserver;", "finish", "", "handleDestroy", "lifecycle-runtime-ktx_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: androidx.lifecycle.k */
public final class LifecycleController {

    /* renamed from: a */
    public final Lifecycle.State f4290a;

    /* renamed from: b */
    public final DispatchQueue f4291b;

    /* renamed from: c */
    private final AbstractC1168n f4292c;

    /* renamed from: d */
    private final Lifecycle f4293d;

    /* renamed from: a */
    public final void mo6037a() {
        this.f4293d.removeObserver(this.f4292c);
        this.f4291b.mo6028c();
    }

    public LifecycleController(Lifecycle lifecycle, Lifecycle.State state, DispatchQueue fVar, Job btVar) {
        Intrinsics.checkParameterIsNotNull(lifecycle, "lifecycle");
        Intrinsics.checkParameterIsNotNull(state, "minState");
        Intrinsics.checkParameterIsNotNull(fVar, "dispatchQueue");
        Intrinsics.checkParameterIsNotNull(btVar, "parentJob");
        this.f4293d = lifecycle;
        this.f4290a = state;
        this.f4291b = fVar;
        LifecycleController$observer$1 lifecycleController$observer$1 = new LifecycleController$observer$1(this, btVar);
        this.f4292c = lifecycleController$observer$1;
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            Job.C69372a.m266400a(btVar, null, 1, null);
            mo6037a();
            return;
        }
        lifecycle.addObserver(lifecycleController$observer$1);
    }
}
