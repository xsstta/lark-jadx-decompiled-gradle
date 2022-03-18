package com.ss.android.lark.multitask.floating;

import android.graphics.Rect;
import android.view.View;
import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.multitask.floating.AppFloat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", ShareHitPoint.f121868c, "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "onStateChanged"}, mo238835k = 3, mv = {1, 1, 16})
public final class AppFloat$setIdlePositionExclusionView$observer$1 implements AbstractC1168n {

    /* renamed from: a */
    final /* synthetic */ AppFloat f121596a;

    /* renamed from: b */
    final /* synthetic */ View f121597b;

    /* renamed from: c */
    final /* synthetic */ AppFloat.View$OnLayoutChangeListenerC48310m f121598c;

    /* renamed from: d */
    final /* synthetic */ AppFloat.ViewTreeObserver$OnGlobalLayoutListenerC48309l f121599d;

    AppFloat$setIdlePositionExclusionView$observer$1(AppFloat bVar, View view, AppFloat.View$OnLayoutChangeListenerC48310m mVar, AppFloat.ViewTreeObserver$OnGlobalLayoutListenerC48309l lVar) {
        this.f121596a = bVar;
        this.f121597b = view;
        this.f121598c = mVar;
        this.f121599d = lVar;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(event, "event");
        int i = C48314c.f121666a[event.ordinal()];
        if (i == 1) {
            this.f121597b.addOnLayoutChangeListener(this.f121598c);
            this.f121597b.getViewTreeObserver().addOnGlobalLayoutListener(this.f121599d);
            this.f121596a.mo168953e(this.f121597b);
            this.f121596a.mo168958j();
        } else if (i == 2) {
            this.f121597b.removeOnLayoutChangeListener(this.f121598c);
            this.f121597b.getViewTreeObserver().removeOnGlobalLayoutListener(this.f121599d);
            Rect remove = this.f121596a.f121617c.remove(this.f121597b);
            if (remove != null) {
                this.f121596a.f121616b.remove(remove);
                this.f121596a.mo168958j();
            }
        }
    }
}
