package com.ss.android.lark.calendar.impl.features.search.time;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31174d;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31175e;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.AbstractC31179a;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.AbstractC31180b;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.C31184e;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitepager.AbstractC31218b;
import com.ss.android.lark.calendar.impl.utils.C32647d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u000e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0016J\u000e\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u000eJ\u0006\u0010!\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\n¨\u0006\""}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/time/TimeFilterMonthViewAdapter;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitepager/InfinitePagerAdapter;", "context", "Landroid/content/Context;", "monthViewModelFetcher", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/month/IMonthDateFetcher;", "(Landroid/content/Context;Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/month/IMonthDateFetcher;)V", "followingStartDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "getFollowingStartDate", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "mDayRender", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/base/IDayRender;", "mMonthViewStateChangeListener", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/month/IDateSelectListener;", "previousStartDate", "getPreviousStartDate", "selectedDate", "getSelectedDate", "afterInstantiateItem", "", "position", "", "cancelSelectState", "onInstantiateItem", "Landroid/view/View;", "refreshMonthView", "monthView", "Lcom/ss/android/lark/calendar/impl/features/search/time/TimeFilterMonthView;", "refreshPage", "pageIndex", "setMonthViewStateChangeListener", "monthViewStateChangeListener", "updateSelectState", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.time.d */
public final class TimeFilterMonthViewAdapter extends AbstractC31218b {

    /* renamed from: a */
    public AbstractC31179a f82923a;

    /* renamed from: d */
    private final AbstractC31174d f82924d;

    /* renamed from: e */
    private final Context f82925e;

    /* renamed from: f */
    private final AbstractC31180b f82926f;

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitepager.AbstractC31218b
    /* renamed from: b */
    public void mo108831b(int i) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/time/TimeFilterMonthViewAdapter$refreshMonthView$1", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/base/IOnSelectChangeListener;", "onCancelSelectState", "", "onSelectDateChanged", "selectDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "onSelectOtherMonth", "offset", "", "onUpdateSelectState", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.time.d$a */
    public static final class C32362a implements AbstractC31175e {

        /* renamed from: a */
        final /* synthetic */ TimeFilterMonthViewAdapter f82927a;

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31175e
        /* renamed from: a */
        public void mo112939a() {
            this.f82927a.mo118239d();
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31175e
        /* renamed from: b */
        public void mo112942b() {
            this.f82927a.mo118240e();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32362a(TimeFilterMonthViewAdapter dVar) {
            this.f82927a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31175e
        /* renamed from: a */
        public void mo112940a(int i) {
            AbstractC31179a aVar = this.f82927a.f82923a;
            if (aVar != null) {
                aVar.mo111732a(i);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31175e
        /* renamed from: a */
        public void mo112941a(CalendarDate calendarDate) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
            AbstractC31179a aVar = this.f82927a.f82923a;
            if (aVar != null) {
                aVar.mo111733a(calendarDate);
            }
        }
    }

    /* renamed from: a */
    public final CalendarDate mo118234a() {
        CalendarDate b = this.f82926f.mo111731b();
        Intrinsics.checkExpressionValueIsNotNull(b, "monthViewModelFetcher.fetchSelectedDate()");
        return b;
    }

    /* renamed from: b */
    public final CalendarDate mo118236b() {
        CalendarDate modifyMonth = mo118234a().modifyMonth(-1);
        Intrinsics.checkExpressionValueIsNotNull(modifyMonth, "calendarDate");
        modifyMonth.setMonthDay(1);
        CalendarDate moveToDayStart = modifyMonth.moveToDayStart();
        Intrinsics.checkExpressionValueIsNotNull(moveToDayStart, "calendarDate.moveToDayStart()");
        return moveToDayStart;
    }

    /* renamed from: c */
    public final CalendarDate mo118237c() {
        CalendarDate modifyMonth = mo118234a().modifyMonth(1);
        Intrinsics.checkExpressionValueIsNotNull(modifyMonth, "calendarDate");
        modifyMonth.setMonthDay(1);
        CalendarDate moveToDayStart = modifyMonth.moveToDayStart();
        Intrinsics.checkExpressionValueIsNotNull(moveToDayStart, "calendarDate.moveToDayStart()");
        return moveToDayStart;
    }

    /* renamed from: d */
    public final void mo118239d() {
        int count = getCount();
        for (int i = 0; i < count; i++) {
            C31184e eVar = (C31184e) mo113215d(i);
            if (eVar != null) {
                eVar.mo112975c();
            }
        }
    }

    /* renamed from: e */
    public final void mo118240e() {
        if (mo113217i()) {
            int count = getCount();
            for (int i = 0; i < count; i++) {
                C31184e eVar = (C31184e) mo113215d(i);
                if (eVar != null) {
                    eVar.setSelectDate(mo118234a());
                }
                eVar.mo112973b();
            }
        }
    }

    /* renamed from: a */
    public final void mo118235a(AbstractC31179a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "monthViewStateChangeListener");
        this.f82923a = aVar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitepager.AbstractC31218b
    /* renamed from: a */
    public View mo108825a(int i) {
        TimeFilterMonthView cVar = new TimeFilterMonthView(this.f82925e, this.f82924d);
        m123544a(cVar, i);
        return cVar;
    }

    /* renamed from: c */
    public final void mo118238c(int i) {
        if (i == 0) {
            C31184e eVar = (C31184e) mo113215d(0);
            CalendarDate a = mo118234a();
            CalendarDate b = mo118236b();
            if (eVar != null) {
                eVar.setSeedDate(b);
                eVar.setStartDate(C32647d.m125279b(b));
                eVar.setEndDate(C32647d.m125281c(b));
                eVar.setSelectDate(a);
                eVar.mo112973b();
            }
        } else if (i == 2) {
            C31184e eVar2 = (C31184e) mo113215d(2);
            CalendarDate a2 = mo118234a();
            CalendarDate c = mo118237c();
            if (eVar2 != null) {
                eVar2.setSeedDate(c);
                eVar2.setStartDate(C32647d.m125279b(c));
                eVar2.setEndDate(C32647d.m125281c(c));
                eVar2.setSelectDate(a2);
                eVar2.mo112973b();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeFilterMonthViewAdapter(Context context, AbstractC31180b bVar) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "monthViewModelFetcher");
        this.f82925e = context;
        this.f82926f = bVar;
        TimeFilterListMonthDayView bVar2 = new TimeFilterListMonthDayView(context);
        this.f82924d = bVar2;
        bVar2.setTypeFace(Typeface.createFromAsset(context.getAssets(), "fonts/DINPro-Bold.ttf"));
        mo113216h();
    }

    /* renamed from: a */
    private final void m123544a(TimeFilterMonthView cVar, int i) {
        int i2;
        CalendarDate b = this.f82926f.mo111731b();
        if (i > 0) {
            i2 = i - 1;
        } else {
            i2 = -1;
        }
        CalendarDate modifyMonth = b.modifyMonth(i2);
        Intrinsics.checkExpressionValueIsNotNull(modifyMonth, "monthStartDate");
        modifyMonth.setMonthDay(1);
        cVar.setSeedDate(modifyMonth);
        cVar.setStartDate(C32647d.m125279b(modifyMonth));
        cVar.setEndDate(C32647d.m125281c(modifyMonth));
        cVar.setSelectDate(mo118234a());
        cVar.setCurrentDate(this.f82926f.mo111730a());
        cVar.setOnMonthDayViewSelectListener(new C32362a(this));
        cVar.mo112973b();
    }
}
