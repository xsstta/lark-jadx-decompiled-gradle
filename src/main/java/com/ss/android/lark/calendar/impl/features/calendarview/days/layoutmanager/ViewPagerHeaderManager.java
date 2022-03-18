package com.ss.android.lark.calendar.impl.features.calendarview.days.layoutmanager;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.lark.calendar.impl.features.calendarview.days.DaysLayoutParam;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.TimeZoneEnterView;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0001%B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\nJ\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\fH\u0016J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006&"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/ViewPagerHeaderManager;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView$LayoutManager;", "parent", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;", "mDaysLayoutParam", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysLayoutParam;", "(Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysLayoutParam;)V", "mHeaderDayViewPager", "Landroid/view/View;", "mTimeZoneView", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/TimeZoneEnterView;", "mTzViewPaddingTop", "", "getParent", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;", "addDateViewPager", "", "dayViewPager", "addTimeZoneView", "timeZoneView", "drawChild", "canvas", "Landroid/graphics/Canvas;", "drawTime", "", "layoutChild", "offsetX", "offsetY", "reLayoutChild", "requestDisallowedIntercept", "", "ev", "Landroid/view/MotionEvent;", "scrollDx", "dx", "scrollDy", "dy", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c.e */
public final class ViewPagerHeaderManager extends SnapScrollView.LayoutManager {

    /* renamed from: a */
    public static final Companion f77127a = new Companion(null);

    /* renamed from: b */
    private int f77128b = UIHelper.dp2px(12.0f);

    /* renamed from: c */
    private TimeZoneEnterView f77129c;

    /* renamed from: d */
    private View f77130d;

    /* renamed from: e */
    private final SnapScrollView f77131e;

    /* renamed from: f */
    private final DaysLayoutParam f77132f;

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: a */
    public void mo111053a(int i, int i2) {
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: b */
    public void mo111063b(int i) {
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: c */
    public void mo111067c(int i) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/ViewPagerHeaderManager$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public SnapScrollView mo111090a() {
        return this.f77131e;
    }

    /* renamed from: a */
    public final void mo111092a(TimeZoneEnterView timeZoneEnterView) {
        Intrinsics.checkParameterIsNotNull(timeZoneEnterView, "timeZoneView");
        this.f77129c = timeZoneEnterView;
        mo111090a().mo113223a(timeZoneEnterView);
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: c */
    public boolean mo111093c(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        int a = this.f77132f.mo110870a();
        int e = this.f77132f.mo110878e();
        float f = (float) 0;
        if (motionEvent.getX() <= f || motionEvent.getX() >= ((float) a) || motionEvent.getY() <= f || motionEvent.getY() >= ((float) e)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo111091a(View view) {
        if (view != null) {
            this.f77130d = view;
            mo111090a().mo113223a(view);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = this.f77132f.mo110880g();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public ViewPagerHeaderManager(SnapScrollView snapScrollView, DaysLayoutParam daysLayoutParam) {
        Intrinsics.checkParameterIsNotNull(snapScrollView, "parent");
        Intrinsics.checkParameterIsNotNull(daysLayoutParam, "mDaysLayoutParam");
        this.f77131e = snapScrollView;
        this.f77132f = daysLayoutParam;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: a */
    public void mo111054a(Canvas canvas, long j) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Rect m = this.f77132f.mo110886m();
        if (m != null) {
            canvas.save();
            canvas.clipRect(m);
            mo111090a().mo113225a(canvas, this.f77130d, j);
            canvas.restore();
        }
        Rect o = this.f77132f.mo110888o();
        if (o != null) {
            canvas.save();
            canvas.clipRect(o);
            mo111090a().mo113225a(canvas, this.f77129c, j);
            canvas.restore();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: b */
    public void mo111064b(int i, int i2) {
        int a = this.f77132f.mo110870a();
        int g = this.f77132f.mo110880g();
        int e = this.f77132f.mo110878e();
        View view = this.f77130d;
        if (view != null) {
            view.layout(g, 0, a, e);
        }
        TimeZoneEnterView timeZoneEnterView = this.f77129c;
        if (timeZoneEnterView != null) {
            timeZoneEnterView.setPadding(0, 0, 0, this.f77128b);
        }
        TimeZoneEnterView timeZoneEnterView2 = this.f77129c;
        if (timeZoneEnterView2 != null) {
            timeZoneEnterView2.layout(0, 0, g, e);
        }
    }
}
