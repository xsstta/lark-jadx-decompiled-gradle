package com.ss.android.lark.guide.landing.general.view;

import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/guide/landing/general/view/ViewPagerAutoScrollController$setupViewPager$2", "Landroidx/lifecycle/LifecycleEventObserver;", "onStateChanged", "", ShareHitPoint.f121868c, "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ViewPagerAutoScrollController$setupViewPager$2 implements AbstractC1168n {

    /* renamed from: a */
    final /* synthetic */ ViewPagerAutoScrollController f99344a;

    /* renamed from: b */
    final /* synthetic */ ViewPager f99345b;

    ViewPagerAutoScrollController$setupViewPager$2(ViewPagerAutoScrollController aVar, ViewPager viewPager) {
        this.f99344a = aVar;
        this.f99345b = viewPager;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(event, "event");
        if (event == Lifecycle.Event.ON_START) {
            this.f99345b.addOnPageChangeListener(this.f99344a.mo141565b());
            this.f99344a.mo141566c();
        } else if (event == Lifecycle.Event.ON_STOP) {
            this.f99345b.removeOnPageChangeListener(this.f99344a.mo141565b());
            this.f99344a.mo141567d();
        }
    }
}
