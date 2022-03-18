package com.ss.android.lark.calendar.impl.features.search.time;

import android.content.Context;
import android.view.MotionEvent;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31174d;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.C31184e;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.viewdata.C31185a;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.viewdata.C31186b;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.viewdata.CalendarAttr;
import com.ss.android.lark.calendar.impl.features.search.time.TimeFilterAttr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0006\u0010\u0013\u001a\u00020\nJ \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J0\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011H\u0014J0\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011H\u0014J\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J.\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\bJ\u0018\u0010&\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020'2\u0006\u0010(\u001a\u00020\nH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/time/TimeFilterMonthView;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/month/MonthView;", "context", "Landroid/content/Context;", "dayRender", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/base/IDayRender;", "(Landroid/content/Context;Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/base/IDayRender;)V", "mCurrSelectTimeType", "Lcom/ss/android/lark/calendar/impl/features/search/time/TimeFilterAttr$SelectTimeType;", "mEndTime", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "mEndTimeNoLimit", "", "mStartTime", "mStartTimeNoLimit", "checkDateClickable", "col", "", "row", "getSelectDate", "initCurrentMonthDate", "", "day", "initLastMonth", "lastMonthDays", "firstDayPosition", "position", "initNextMonth", "currentMonthDays", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "refreshOptionalTimeView", "startTime", "startTimeNoLimit", "endTime", "endTimeNoLimit", "selectTimeType", "setDateOptional", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/viewdata/Day;", "date", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.time.c */
public final class TimeFilterMonthView extends C31184e {

    /* renamed from: o */
    private CalendarDate f82918o = new CalendarDate();

    /* renamed from: p */
    private boolean f82919p = true;

    /* renamed from: q */
    private CalendarDate f82920q = new CalendarDate();

    /* renamed from: r */
    private boolean f82921r = true;

    /* renamed from: s */
    private TimeFilterAttr.SelectTimeType f82922s = TimeFilterAttr.SelectTimeType.START_TIME;

    public final CalendarDate getSelectDate() {
        CalendarDate calendarDate = this.f78781i;
        Intrinsics.checkExpressionValueIsNotNull(calendarDate, "mSelectDate");
        return calendarDate;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.C31184e
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f78777e = motionEvent.getX();
            this.f78778f = motionEvent.getY();
        } else if (action == 1) {
            float x = motionEvent.getX() - this.f78777e;
            float y = motionEvent.getY() - this.f78778f;
            if (Math.abs(x) < this.f78774b && Math.abs(y) < this.f78774b) {
                int i = (int) (this.f78777e / ((float) this.f78776d));
                int i2 = (int) (this.f78778f / ((float) this.f78775c));
                if (!m123538b(i, i2)) {
                    return true;
                }
                this.f78815n.mo112939a();
                mo112969a(i, i2);
                this.f78815n.mo112942b();
            }
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeFilterMonthView(Context context, AbstractC31174d dVar) {
        super(context, dVar);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(dVar, "dayRender");
    }

    /* renamed from: b */
    private final boolean m123538b(int i, int i2) {
        if (this.f78814m[i2] == null || i >= 7) {
            return false;
        }
        C31186b bVar = this.f78814m[i2];
        Intrinsics.checkExpressionValueIsNotNull(bVar, "mWeeks[row]");
        C31185a aVar = bVar.mo112996a()[i];
        Intrinsics.checkExpressionValueIsNotNull(aVar, "day");
        if (aVar.mo112991d() != CalendarAttr.OptionalState.NOT_OPTIONAL) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private final void m123539e(C31185a aVar, CalendarDate calendarDate) {
        if (this.f82922s == TimeFilterAttr.SelectTimeType.START_TIME) {
            if (this.f82921r) {
                aVar.mo112986a(CalendarAttr.OptionalState.OPTIONAL);
            } else if (calendarDate.getJulianDay() > this.f82920q.getJulianDay()) {
                aVar.mo112986a(CalendarAttr.OptionalState.NOT_OPTIONAL);
            } else {
                aVar.mo112986a(CalendarAttr.OptionalState.OPTIONAL);
            }
        } else if (this.f82922s != TimeFilterAttr.SelectTimeType.END_TIME) {
        } else {
            if (this.f82919p) {
                aVar.mo112986a(CalendarAttr.OptionalState.OPTIONAL);
            } else if (calendarDate.getJulianDay() < this.f82918o.getJulianDay()) {
                aVar.mo112986a(CalendarAttr.OptionalState.NOT_OPTIONAL);
            } else {
                aVar.mo112986a(CalendarAttr.OptionalState.OPTIONAL);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.C31184e
    /* renamed from: a */
    public void mo112970a(int i, int i2, int i3) {
        super.mo112970a(i, i2, i3);
        CalendarDate modifyDay = this.f78779g.modifyDay(i);
        C31186b bVar = this.f78814m[i2];
        Intrinsics.checkExpressionValueIsNotNull(bVar, "mWeeks[row]");
        C31185a aVar = bVar.mo112996a()[i3];
        Intrinsics.checkExpressionValueIsNotNull(aVar, "mWeeks[row].days[col]");
        Intrinsics.checkExpressionValueIsNotNull(modifyDay, "date");
        m123539e(aVar, modifyDay);
    }

    /* renamed from: a */
    public final void mo118232a(CalendarDate calendarDate, boolean z, CalendarDate calendarDate2, boolean z2, TimeFilterAttr.SelectTimeType selectTimeType) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "startTime");
        Intrinsics.checkParameterIsNotNull(calendarDate2, "endTime");
        Intrinsics.checkParameterIsNotNull(selectTimeType, "selectTimeType");
        this.f82918o = calendarDate;
        this.f82919p = z;
        this.f82920q = calendarDate2;
        this.f82921r = z2;
        this.f82922s = selectTimeType;
        mo112968a();
        invalidate();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.C31184e
    /* renamed from: a */
    public void mo112971a(int i, int i2, int i3, int i4, int i5) {
        super.mo112971a(i, i2, i3, i4, i5);
        CalendarDate calendarDate = this.f78779g;
        Intrinsics.checkExpressionValueIsNotNull(calendarDate, "mSeedDate");
        int year = calendarDate.getYear();
        CalendarDate calendarDate2 = this.f78779g;
        Intrinsics.checkExpressionValueIsNotNull(calendarDate2, "mSeedDate");
        CalendarDate calendarDate3 = new CalendarDate(year, calendarDate2.getMonth() + 1, ((i5 - i2) - i) + 1, 0, 0, 0);
        C31186b bVar = this.f78814m[i3];
        Intrinsics.checkExpressionValueIsNotNull(bVar, "mWeeks[row]");
        C31185a aVar = bVar.mo112996a()[i4];
        Intrinsics.checkExpressionValueIsNotNull(aVar, "mWeeks[row].days[col]");
        m123539e(aVar, calendarDate3);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.C31184e
    /* renamed from: b */
    public void mo112974b(int i, int i2, int i3, int i4, int i5) {
        super.mo112974b(i, i2, i3, i4, i5);
        CalendarDate calendarDate = this.f78779g;
        Intrinsics.checkExpressionValueIsNotNull(calendarDate, "mSeedDate");
        int year = calendarDate.getYear();
        CalendarDate calendarDate2 = this.f78779g;
        Intrinsics.checkExpressionValueIsNotNull(calendarDate2, "mSeedDate");
        CalendarDate calendarDate3 = new CalendarDate(year, calendarDate2.getMonth() - 1, i - ((i2 - i5) - 1), 0, 0, 0);
        C31186b bVar = this.f78814m[i3];
        Intrinsics.checkExpressionValueIsNotNull(bVar, "mWeeks[row]");
        C31185a aVar = bVar.mo112996a()[i4];
        Intrinsics.checkExpressionValueIsNotNull(aVar, "mWeeks[row].days[col]");
        m123539e(aVar, calendarDate3);
    }
}
