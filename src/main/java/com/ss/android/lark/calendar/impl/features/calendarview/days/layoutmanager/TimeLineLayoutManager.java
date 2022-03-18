package com.ss.android.lark.calendar.impl.features.calendarview.days.layoutmanager;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
import com.ss.android.lark.calendar.impl.features.calendarview.days.DaysLayoutParam;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.TimeLinesLayer;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/TimeLineLayoutManager;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView$LayoutManager;", "parent", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;", "daysLayoutParam", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysLayoutParam;", "(Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysLayoutParam;)V", "mTimeLinesLayer", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/TimeLinesLayer;", "getParent", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;", "timeLineShelterLayer", "Landroid/widget/FrameLayout;", "addTimeLines", "", "timeLines", "addTimeLinesShelter", "drawChild", "canvas", "Landroid/graphics/Canvas;", "drawTime", "", "layoutChild", "offsetX", "", "offsetY", "reLayoutChild", "scrollDx", "dx", "scrollDy", "dy", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c.d */
public final class TimeLineLayoutManager extends SnapScrollView.LayoutManager {

    /* renamed from: a */
    private TimeLinesLayer f77123a;

    /* renamed from: b */
    private FrameLayout f77124b;

    /* renamed from: c */
    private final SnapScrollView f77125c;

    /* renamed from: d */
    private final DaysLayoutParam f77126d;

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

    /* renamed from: a */
    public SnapScrollView mo111087a() {
        return this.f77125c;
    }

    /* renamed from: a */
    public final void mo111089a(TimeLinesLayer aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "timeLines");
        this.f77123a = aVar;
    }

    /* renamed from: a */
    public final void mo111088a(FrameLayout frameLayout) {
        Intrinsics.checkParameterIsNotNull(frameLayout, "timeLineShelterLayer");
        this.f77124b = frameLayout;
        mo111087a().mo113223a(frameLayout);
    }

    public TimeLineLayoutManager(SnapScrollView snapScrollView, DaysLayoutParam daysLayoutParam) {
        Intrinsics.checkParameterIsNotNull(snapScrollView, "parent");
        Intrinsics.checkParameterIsNotNull(daysLayoutParam, "daysLayoutParam");
        this.f77125c = snapScrollView;
        this.f77126d = daysLayoutParam;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: b */
    public void mo111064b(int i, int i2) {
        FrameLayout frameLayout = this.f77124b;
        if (frameLayout != null) {
            frameLayout.layout(0, this.f77126d.mo110878e(), this.f77126d.mo110880g(), this.f77126d.mo110874b());
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: a */
    public void mo111054a(Canvas canvas, long j) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        int a = mo111087a().getCoordinateApi().mo113242a();
        int b = mo111087a().getCoordinateApi().mo113243b();
        Rect n = this.f77126d.mo110887n();
        if (n != null) {
            canvas.save();
            canvas.clipRect(n);
            TimeLinesLayer aVar = this.f77123a;
            if (aVar != null) {
                aVar.mo111335a(canvas, a, b + n.top, this.f77126d.mo110870a());
            }
            canvas.restore();
        }
    }
}
