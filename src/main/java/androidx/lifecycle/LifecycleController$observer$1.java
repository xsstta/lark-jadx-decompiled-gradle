package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", ShareHitPoint.f121868c, "Landroidx/lifecycle/LifecycleOwner;", "<anonymous parameter 1>", "Landroidx/lifecycle/Lifecycle$Event;", "onStateChanged"}, mo238835k = 3, mv = {1, 1, 15})
public final class LifecycleController$observer$1 implements AbstractC1168n {

    /* renamed from: a */
    final /* synthetic */ LifecycleController f4181a;

    /* renamed from: b */
    final /* synthetic */ Job f4182b;

    LifecycleController$observer$1(LifecycleController kVar, Job btVar) {
        this.f4181a = kVar;
        this.f4182b = btVar;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(event, "<anonymous parameter 1>");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Intrinsics.checkExpressionValueIsNotNull(lifecycle, "source.lifecycle");
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            LifecycleController kVar = this.f4181a;
            Job.C69372a.m266400a(this.f4182b, null, 1, null);
            kVar.mo6037a();
            return;
        }
        Lifecycle lifecycle2 = lifecycleOwner.getLifecycle();
        Intrinsics.checkExpressionValueIsNotNull(lifecycle2, "source.lifecycle");
        if (lifecycle2.getCurrentState().compareTo((Enum) this.f4181a.f4290a) < 0) {
            this.f4181a.f4291b.mo6024a();
        } else {
            this.f4181a.f4291b.mo6026b();
        }
    }
}
