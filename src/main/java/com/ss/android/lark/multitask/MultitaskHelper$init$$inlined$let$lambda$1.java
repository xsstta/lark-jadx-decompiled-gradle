package com.ss.android.lark.multitask;

import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.multitask.task.AbstractC48377r;
import com.ss.android.lark.multitask.task.C48376q;
import com.ss.android.lark.multitask.task.TaskFinishHandler;
import com.ss.android.lark.slideback.SlideHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/multitask/MultitaskHelper$init$2$1", "Landroidx/lifecycle/LifecycleEventObserver;", "onStateChanged", "", ShareHitPoint.f121868c, "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "features_multitask_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class MultitaskHelper$init$$inlined$let$lambda$1 implements AbstractC1168n {

    /* renamed from: a */
    final /* synthetic */ MultitaskHelper f121535a;

    MultitaskHelper$init$$inlined$let$lambda$1(MultitaskHelper hVar) {
        this.f121535a = hVar;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        TaskFinishHandler oVar;
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(event, "event");
        if (C48334i.f121725a[event.ordinal()] == 1) {
            this.f121535a.mo169046b().mo23786e().mo169153a(this.f121535a.mo169046b().mo23782a(), new AbstractC48377r(this) {
                /* class com.ss.android.lark.multitask.MultitaskHelper$init$$inlined$let$lambda$1.C482661 */

                /* renamed from: a */
                final /* synthetic */ MultitaskHelper$init$$inlined$let$lambda$1 f121536a;

                {
                    this.f121536a = r1;
                }

                @Override // com.ss.android.lark.multitask.task.AbstractC48377r
                /* renamed from: a */
                public final void mo168851a(C48376q qVar) {
                    if (qVar != null) {
                        this.f121536a.f121535a.mo169044a(this.f121536a.f121535a.mo169046b(), qVar);
                    }
                }
            });
            SlideHelper a = this.f121535a.mo169043a();
            MultitaskHelper hVar = this.f121535a;
            if (a != null) {
                oVar = TaskBasketManagerHolder.f121740a.mo169071a(a.mo187297c(), this.f121535a.mo169046b(), this.f121535a.f121714b);
            } else {
                oVar = TaskBasketManagerHolder.f121740a.mo169072a(this.f121535a.mo169046b(), this.f121535a.f121714b);
            }
            hVar.f121716d = oVar;
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
    }
}
