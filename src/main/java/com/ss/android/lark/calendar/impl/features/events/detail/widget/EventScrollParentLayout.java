package com.ss.android.lark.calendar.impl.features.events.detail.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import androidx.core.view.NestedScrollingParent;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.C26326z;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.view.EventBodyView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0017\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00029:B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J(\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0017H\u0016J \u0010 \u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J(\u0010!\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020$H\u0016J0\u0010%\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0016J \u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\nH\u0016J \u0010-\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\nH\u0016J\u0010\u0010/\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u001dH\u0016J\b\u00100\u001a\u00020\u0014H\u0002J\u0018\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\nH\u0016J\u0006\u00104\u001a\u00020\u0014J\u000e\u00105\u001a\u00020\u00142\u0006\u00106\u001a\u00020\u000fJ\u000e\u00107\u001a\u00020\u00142\u0006\u00108\u001a\u00020\nR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/EventScrollParentLayout;", "Landroid/widget/LinearLayout;", "Landroidx/core/view/NestedScrollingParent;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mOffsetAnimator", "Landroid/animation/ValueAnimator;", "mOnScrollListener", "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/EventScrollParentLayout$OnScrollListener;", "mScrollThreshold", "mVelocityY", "", "animateScroll", "", "velocityY", "isScrollToUp", "", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "onNestedFling", "target", "Landroid/view/View;", "velocityX", "consumed", "onNestedPreFling", "onNestedPreScroll", "dx", "dy", "", "onNestedScroll", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "onNestedScrollAccepted", "child", "axes", "onStartNestedScroll", "nestedScrollAxes", "onStopNestedScroll", "roundScrollThreshold", "scrollTo", "x", "y", "scrollToInitialPosition", "setOnScrollListener", "onScrollListener", "updateScrollThreshold", "scrollThreshold", "Companion", "OnScrollListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EventScrollParentLayout extends LinearLayout implements NestedScrollingParent {

    /* renamed from: c */
    public static final Companion f79719c = new Companion(null);

    /* renamed from: a */
    public int f79720a;

    /* renamed from: b */
    public OnScrollListener f79721b;

    /* renamed from: d */
    private ValueAnimator f79722d;

    /* renamed from: e */
    private float f79723e;

    /* renamed from: f */
    private HashMap f79724f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/EventScrollParentLayout$OnScrollListener;", "", "onScrollChanged", "", "dy", "", "scrollY", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.EventScrollParentLayout$b */
    public interface OnScrollListener {
        /* renamed from: a */
        void mo114123a(int i, int i2);
    }

    /* renamed from: b */
    public View mo114155b(int i) {
        if (this.f79724f == null) {
            this.f79724f = new HashMap();
        }
        View view = (View) this.f79724f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f79724f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        Intrinsics.checkParameterIsNotNull(view, "child");
        Intrinsics.checkParameterIsNotNull(view2, "target");
        return (i & 2) != 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/EventScrollParentLayout$Companion;", "", "()V", "MAX_AUTO_SCROLL_TIME", "", "MIN_AUTO_SCROLL_TIME", "MIN_FLING_VELOCITY", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.EventScrollParentLayout$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo114153a() {
        OnScrollListener bVar;
        scrollTo(0, 0);
        invalidate();
        if (this.f79720a > 0 && (bVar = this.f79721b) != null) {
            bVar.mo114123a(0, 0);
        }
    }

    /* renamed from: b */
    private final void m118380b() {
        int scrollY = getScrollY();
        if (!(scrollY == 0 || scrollY == this.f79720a)) {
            boolean z = true;
            if (Math.abs(this.f79723e) > ((float) LocationRequest.PRIORITY_HD_ACCURACY)) {
                float f = this.f79723e;
                if (f <= ((float) 0)) {
                    z = false;
                }
                m118379a(f, z);
            } else if (scrollY <= 0 || scrollY >= this.f79720a / 2) {
                m118379a(BitmapDescriptorFactory.HUE_RED, true);
            } else {
                m118379a(BitmapDescriptorFactory.HUE_RED, false);
            }
        }
        this.f79723e = BitmapDescriptorFactory.HUE_RED;
    }

    public final void setOnScrollListener(OnScrollListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "onScrollListener");
        this.f79721b = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EventScrollParentLayout(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        Intrinsics.checkParameterIsNotNull(view, "child");
        if (C26326z.m95339c()) {
            super.onStopNestedScroll(view);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            m118380b();
        }
        return dispatchTouchEvent;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.EventScrollParentLayout$c */
    public static final class C31459c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ EventScrollParentLayout f79725a;

        C31459c(EventScrollParentLayout eventScrollParentLayout) {
            this.f79725a = eventScrollParentLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            OnScrollListener bVar;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            if (valueAnimator.getAnimatedValue() instanceof Integer) {
                EventScrollParentLayout eventScrollParentLayout = this.f79725a;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    eventScrollParentLayout.scrollTo(0, ((Integer) animatedValue).intValue());
                    if (this.f79725a.f79720a > 0 && (bVar = this.f79725a.f79721b) != null) {
                        bVar.mo114123a(0, this.f79725a.getScrollY());
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
        }
    }

    /* renamed from: a */
    public final void mo114154a(int i) {
        EventBodyView eventBodyView = (EventBodyView) mo114155b(R.id.bodyView);
        Intrinsics.checkExpressionValueIsNotNull(eventBodyView, "bodyView");
        ViewGroup.LayoutParams layoutParams = eventBodyView.getLayoutParams();
        EventBodyView eventBodyView2 = (EventBodyView) mo114155b(R.id.bodyView);
        Intrinsics.checkExpressionValueIsNotNull(eventBodyView2, "bodyView");
        layoutParams.height = (eventBodyView2.getMeasuredHeight() - this.f79720a) + i;
        EventBodyView eventBodyView3 = (EventBodyView) mo114155b(R.id.bodyView);
        Intrinsics.checkExpressionValueIsNotNull(eventBodyView3, "bodyView");
        eventBodyView3.setLayoutParams(layoutParams);
        this.f79720a = i;
        scrollTo(0, getScrollY());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EventScrollParentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public void scrollTo(int i, int i2) {
        int min = Math.min(Math.max(0, i2), this.f79720a);
        if (min != getScrollY()) {
            super.scrollTo(i, min);
        }
    }

    /* renamed from: a */
    private final void m118379a(float f, boolean z) {
        int scrollY = getScrollY();
        int i = this.f79720a;
        ValueAnimator valueAnimator = this.f79722d;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f79722d = valueAnimator2;
            if (valueAnimator2 != null) {
                valueAnimator2.addUpdateListener(new C31459c(this));
            }
        } else if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            i = 0;
        }
        long j = 300;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            j = (long) ((((float) Math.abs(i - scrollY)) / Math.abs(f)) * ((float) 1000));
        }
        long max = Math.max(Math.min(j, (long) 2000), (long) 100);
        ValueAnimator valueAnimator3 = this.f79722d;
        if (valueAnimator3 != null) {
            valueAnimator3.setInterpolator(new DecelerateInterpolator());
        }
        ValueAnimator valueAnimator4 = this.f79722d;
        if (valueAnimator4 != null) {
            valueAnimator4.setDuration(max);
        }
        ValueAnimator valueAnimator5 = this.f79722d;
        if (valueAnimator5 != null) {
            valueAnimator5.setIntValues(scrollY, i);
        }
        ValueAnimator valueAnimator6 = this.f79722d;
        if (valueAnimator6 != null) {
            valueAnimator6.start();
        }
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        Intrinsics.checkParameterIsNotNull(view, "target");
        this.f79723e = f2;
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        Intrinsics.checkParameterIsNotNull(view, "child");
        Intrinsics.checkParameterIsNotNull(view2, "target");
        if (C26326z.m95339c()) {
            super.onNestedScrollAccepted(view, view2, i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventScrollParentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "target");
        this.f79723e = f2;
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        boolean z;
        boolean z2;
        OnScrollListener bVar;
        Intrinsics.checkParameterIsNotNull(view, "target");
        Intrinsics.checkParameterIsNotNull(iArr, "consumed");
        int scrollY = getScrollY();
        if (i2 <= 0 || scrollY >= this.f79720a) {
            z = false;
        } else {
            z = true;
        }
        if (i2 >= 0 || scrollY < 0 || view.canScrollVertically(-1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            scrollBy(0, i2);
            iArr[1] = i2;
            if (this.f79720a > 0 && (bVar = this.f79721b) != null) {
                bVar.mo114123a(i2, getScrollY());
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        Intrinsics.checkParameterIsNotNull(view, "target");
        if (C26326z.m95339c()) {
            super.onNestedScroll(view, i, i2, i3, i4);
        }
    }
}
