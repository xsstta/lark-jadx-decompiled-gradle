package com.ss.android.lark.passport.infra.util;

import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/passport/infra/util/ImeObserver$3", "Landroidx/lifecycle/LifecycleEventObserver;", "onStateChanged", "", ShareHitPoint.f121868c, "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ImeObserver$3 implements AbstractC1168n {

    /* renamed from: a */
    final /* synthetic */ ImeObserver f123397a;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    ImeObserver$3(ImeObserver nVar) {
        this.f123397a = nVar;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(event, "event");
        if (event == Lifecycle.Event.ON_PAUSE) {
            this.f123397a.f123493a = false;
            this.f123397a.f123494b = 0;
            ImeObserver nVar = this.f123397a;
            nVar.mo171698a(nVar.mo171699a(), this.f123397a.mo171700b());
        }
    }
}
