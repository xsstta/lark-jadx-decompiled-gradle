package com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.timelayout;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/timelayout/TimeLineLayoutManager;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView$LayoutManager;", "parent", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;", "layoutParam", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/timelayout/ITimeLayoutParam;", "(Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/timelayout/ITimeLayoutParam;)V", "mTimeLinesLayer", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/timelayout/TimeLinesLayer;", "getParent", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;", "timeLineShelterLayer", "Landroid/widget/FrameLayout;", "addTimeLines", "", "timeLines", "drawChild", "canvas", "Landroid/graphics/Canvas;", "drawTime", "", "layoutChild", "offsetX", "", "offsetY", "reLayoutChild", "scrollDx", "dx", "scrollDy", "dy", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.b.b */
public final class TimeLineLayoutManager extends SnapScrollView.LayoutManager {

    /* renamed from: a */
    private TimeLinesLayer f79014a;

    /* renamed from: b */
    private FrameLayout f79015b;

    /* renamed from: c */
    private final SnapScrollView f79016c;

    /* renamed from: d */
    private final ITimeLayoutParam f79017d;

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
    public SnapScrollView mo113302a() {
        return this.f79016c;
    }

    /* renamed from: a */
    public final void mo113303a(TimeLinesLayer cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "timeLines");
        this.f79014a = cVar;
    }

    public TimeLineLayoutManager(SnapScrollView snapScrollView, ITimeLayoutParam aVar) {
        Intrinsics.checkParameterIsNotNull(snapScrollView, "parent");
        Intrinsics.checkParameterIsNotNull(aVar, "layoutParam");
        this.f79016c = snapScrollView;
        this.f79017d = aVar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: b */
    public void mo111064b(int i, int i2) {
        FrameLayout frameLayout = this.f79015b;
        if (frameLayout != null) {
            frameLayout.layout(0, 0, this.f79017d.mo113298b(), this.f79017d.mo113300d());
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: a */
    public void mo111054a(Canvas canvas, long j) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        int a = mo113302a().getCoordinateApi().mo113242a();
        int b = mo113302a().getCoordinateApi().mo113243b();
        Rect e = this.f79017d.mo113301e();
        if (e != null) {
            canvas.save();
            canvas.clipRect(e);
            TimeLinesLayer cVar = this.f79014a;
            if (cVar != null) {
                cVar.mo113306a(canvas, a, b + e.top, this.f79017d.mo113299c());
            }
            canvas.restore();
        }
    }
}
