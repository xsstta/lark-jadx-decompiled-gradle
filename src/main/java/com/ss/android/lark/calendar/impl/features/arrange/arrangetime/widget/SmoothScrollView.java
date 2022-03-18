package com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import android.widget.Scroller;
import com.larksuite.framework.utils.UIUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0012J\u001e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tJ\u0016\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tJ\u001e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tJ\u0016\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tR\u000e\u0010\u000b\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/SmoothScrollView;", "Landroid/widget/ScrollView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defaultDuration", "mIsEnableScroll", "", "mNeedScrollHeight", "mScroller", "Landroid/widget/Scroller;", "computeScroll", "", "disableScroll", "enableScroll", "init", "slowSmoothScrollBy", "dx", "dy", "duration", "slowSmoothScrollTo", "fx", "fy", "slowSmoothScrollToCenter", "clickScrollY", "bottomHeight", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SmoothScrollView extends ScrollView {

    /* renamed from: a */
    public boolean f75531a = true;

    /* renamed from: b */
    private final int f75532b = 800;

    /* renamed from: c */
    private int f75533c;

    /* renamed from: d */
    private Scroller f75534d;

    /* renamed from: b */
    public final void mo109086b() {
        this.f75531a = true;
    }

    /* renamed from: c */
    public final void mo109089c() {
        this.f75531a = false;
    }

    /* renamed from: a */
    public final void mo109083a() {
        setOnTouchListener(new View$OnTouchListenerC30225a(this));
        this.f75533c = UIUtils.dp2px(getContext(), 40.0f);
    }

    public void computeScroll() {
        if (this.f75534d.computeScrollOffset()) {
            scrollTo(this.f75534d.getCurrX(), this.f75534d.getCurrY());
            postInvalidate();
        }
        super.computeScroll();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SmoothScrollView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f75534d = new Scroller(context);
        mo109083a();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.SmoothScrollView$a */
    public static final class View$OnTouchListenerC30225a implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ SmoothScrollView f75535a;

        View$OnTouchListenerC30225a(SmoothScrollView smoothScrollView) {
            this.f75535a = smoothScrollView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return !this.f75535a.f75531a;
        }
    }

    /* renamed from: b */
    public final void mo109087b(int i, int i2) {
        mo109085a(i, i2, this.f75532b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SmoothScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        this.f75534d = new Scroller(context);
        mo109083a();
    }

    /* renamed from: a */
    public final void mo109084a(int i, int i2) {
        int dp2px = UIUtils.dp2px(getContext(), 60.0f);
        if (i - getScrollY() < this.f75533c) {
            mo109087b(getScrollX(), (getScrollY() - (getHeight() / 2)) + dp2px);
        } else if ((getScrollY() + getHeight()) - i < this.f75533c + i2) {
            mo109087b(getScrollX(), (getScrollY() + (getHeight() / 2)) - dp2px);
        }
    }

    /* renamed from: a */
    public final void mo109085a(int i, int i2, int i3) {
        mo109088b(i - getScrollX(), i2 - getScrollY(), i3);
    }

    /* renamed from: b */
    public final void mo109088b(int i, int i2, int i3) {
        this.f75534d.startScroll(getScrollX(), getScrollY(), i, i2, i3);
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SmoothScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        this.f75534d = new Scroller(context);
        mo109083a();
    }
}
