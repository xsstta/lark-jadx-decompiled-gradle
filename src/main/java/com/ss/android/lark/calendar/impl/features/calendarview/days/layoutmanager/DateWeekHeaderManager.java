package com.ss.android.lark.calendar.impl.features.calendarview.days.layoutmanager;

import android.graphics.Canvas;
import android.graphics.Rect;
import com.ss.android.lark.calendar.impl.features.calendarview.days.DaysLayoutParam;
import com.ss.android.lark.calendar.impl.features.calendarview.days.widget.DateWeekView;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.TimeZoneEnterView;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u0000 &2\u00020\u0001:\u0001&B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u000eJ\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010H\u0016J\u0018\u0010!\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010H\u0016J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0010H\u0016J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u0010H\u0016R\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006'"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/DateWeekHeaderManager;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView$LayoutManager;", "parent", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;", "mDaysLayoutParam", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysLayoutParam;", "(Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysLayoutParam;)V", "mDateWeekViews", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/DateWeekView;", "[Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/DateWeekView;", "mIsLayoutFinished", "", "mTimeZoneView", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/TimeZoneEnterView;", "mTzViewPaddingTop", "", "getParent", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;", "addDateWeekView", "", "dateWeekViews", "([Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/DateWeekView;)V", "addTimeZoneView", "timeZoneView", "drawChild", "canvas", "Landroid/graphics/Canvas;", "drawTime", "", "layoutChild", "offsetX", "offsetY", "reLayoutChild", "scrollDx", "dx", "scrollDy", "dy", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c.b */
public final class DateWeekHeaderManager extends SnapScrollView.LayoutManager {

    /* renamed from: a */
    public static final Companion f77107a = new Companion(null);

    /* renamed from: b */
    private boolean f77108b;

    /* renamed from: c */
    private int f77109c = UIHelper.dp2px(6.0f);

    /* renamed from: d */
    private TimeZoneEnterView f77110d;

    /* renamed from: e */
    private DateWeekView[] f77111e;

    /* renamed from: f */
    private final SnapScrollView f77112f;

    /* renamed from: g */
    private final DaysLayoutParam f77113g;

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: c */
    public void mo111067c(int i) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/DateWeekHeaderManager$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public SnapScrollView mo111076a() {
        return this.f77112f;
    }

    /* renamed from: a */
    public final void mo111077a(TimeZoneEnterView timeZoneEnterView) {
        Intrinsics.checkParameterIsNotNull(timeZoneEnterView, "timeZoneView");
        this.f77110d = timeZoneEnterView;
        mo111076a().mo113223a(timeZoneEnterView);
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: b */
    public void mo111063b(int i) {
        int a = this.f77113g.mo110870a();
        int c = this.f77113g.mo110876c();
        int g = this.f77113g.mo110880g();
        DaysLayoutParam.LayersInfo i2 = this.f77113g.mo110882i();
        int a2 = i2.mo110899a();
        int c2 = i2.mo110901c();
        DateWeekView[] dateWeekViewArr = this.f77111e;
        if (dateWeekViewArr != null) {
            for (DateWeekView dateWeekView : dateWeekViewArr) {
                if (i > 0) {
                    if (dateWeekView.getLeft() + i >= (c * c2) + a) {
                        dateWeekView.mo111367a(-a2);
                        dateWeekView.offsetLeftAndRight(i - (c * a2));
                    }
                } else if (dateWeekView.getRight() + i <= g - (c * c2)) {
                    dateWeekView.mo111367a(i2.mo110899a());
                    dateWeekView.offsetLeftAndRight((c * a2) + i);
                }
                dateWeekView.offsetLeftAndRight(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo111078a(DateWeekView[] dateWeekViewArr) {
        if (dateWeekViewArr != null) {
            int length = dateWeekViewArr.length;
            DateWeekView[] dateWeekViewArr2 = new DateWeekView[length];
            for (int i = 0; i < length; i++) {
                dateWeekViewArr2[i] = dateWeekViewArr[i];
            }
            this.f77111e = dateWeekViewArr2;
            for (DateWeekView dateWeekView : dateWeekViewArr) {
                mo111076a().mo113223a(dateWeekView);
            }
        }
    }

    public DateWeekHeaderManager(SnapScrollView snapScrollView, DaysLayoutParam daysLayoutParam) {
        Intrinsics.checkParameterIsNotNull(snapScrollView, "parent");
        Intrinsics.checkParameterIsNotNull(daysLayoutParam, "mDaysLayoutParam");
        this.f77112f = snapScrollView;
        this.f77113g = daysLayoutParam;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: a */
    public void mo111053a(int i, int i2) {
        Log.m165389i("DateWeekHeaderManager", C32673y.m125378d("reLayoutChild " + this.f77108b));
        if (this.f77108b) {
            this.f77108b = false;
            mo111064b(i, i2);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: a */
    public void mo111054a(Canvas canvas, long j) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Rect m = this.f77113g.mo110886m();
        if (m != null) {
            canvas.save();
            canvas.clipRect(m);
            DateWeekView[] dateWeekViewArr = this.f77111e;
            if (dateWeekViewArr != null) {
                for (DateWeekView dateWeekView : dateWeekViewArr) {
                    mo111076a().mo113225a(canvas, dateWeekView, j);
                }
            }
            canvas.restore();
        }
        Rect o = this.f77113g.mo110888o();
        if (o != null) {
            canvas.save();
            canvas.clipRect(o);
            mo111076a().mo113225a(canvas, this.f77110d, j);
            canvas.restore();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: b */
    public void mo111064b(int i, int i2) {
        int i3;
        int c = this.f77113g.mo110876c();
        int g = this.f77113g.mo110880g();
        int e = this.f77113g.mo110878e();
        int c2 = this.f77113g.mo110882i().mo110901c();
        if (c > 0) {
            int i4 = (-i) / c;
            int i5 = i % c;
            if (i > 0 && i5 != 0) {
                i4--;
            }
            if (i5 < 0) {
                i5 += c;
            }
            if (i5 > 0) {
                i3 = i5 - (c2 * c);
            } else {
                i3 = c - (c2 * c);
            }
            int i6 = i3 + g;
            int i7 = (i6 - c) + 0;
            int i8 = i4 - c2;
            DateWeekView[] dateWeekViewArr = this.f77111e;
            if (dateWeekViewArr != null) {
                if (!this.f77108b) {
                    int length = dateWeekViewArr.length;
                    for (int i9 = 0; i9 < length; i9++) {
                        DateWeekView dateWeekView = dateWeekViewArr[i9];
                        dateWeekView.mo111370b(i8);
                        int i10 = i9 * c;
                        dateWeekView.layout(i7 + i10, 0, i10 + i6, e);
                        i8++;
                        dateWeekView.requestLayout();
                    }
                    this.f77108b = true;
                } else {
                    for (DateWeekView dateWeekView2 : dateWeekViewArr) {
                        dateWeekView2.layout(dateWeekView2.getLeft(), dateWeekView2.getTop(), dateWeekView2.getRight(), dateWeekView2.getBottom());
                    }
                }
                TimeZoneEnterView timeZoneEnterView = this.f77110d;
                if (timeZoneEnterView != null) {
                    timeZoneEnterView.setPadding(0, 0, 0, this.f77109c);
                }
                TimeZoneEnterView timeZoneEnterView2 = this.f77110d;
                if (timeZoneEnterView2 != null) {
                    timeZoneEnterView2.layout(0, 0, g, e);
                }
            }
        }
    }
}
