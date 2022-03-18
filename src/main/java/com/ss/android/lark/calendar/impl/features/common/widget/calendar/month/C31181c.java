package com.ss.android.lark.calendar.impl.features.common.widget.calendar.month;

import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.view.View;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31174d;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31175e;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitepager.AbstractC31218b;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.C32647d;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.ContainerType;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.c */
public class C31181c extends AbstractC31218b {

    /* renamed from: a */
    public AbstractC31179a f78808a;

    /* renamed from: d */
    private Context f78809d;

    /* renamed from: e */
    private AbstractC31180b f78810e;

    /* renamed from: f */
    private AbstractC31174d f78811f;

    /* renamed from: g */
    private CalendarSetting.DayOfWeek f78812g = CalendarSetting.DayOfWeek.SUNDAY;

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitepager.AbstractC31218b
    /* renamed from: b */
    public void mo108831b(int i) {
    }

    /* renamed from: b */
    public CalendarDate mo112961b() {
        return this.f78810e.mo111731b();
    }

    /* renamed from: c */
    public CalendarDate mo112962c() {
        CalendarDate modifyMonth = mo112961b().modifyMonth(-1);
        modifyMonth.setMonthDay(1);
        return modifyMonth.moveToDayStart();
    }

    /* renamed from: d */
    public CalendarDate mo112964d() {
        CalendarDate modifyMonth = mo112961b().modifyMonth(1);
        modifyMonth.setMonthDay(1);
        return modifyMonth.moveToDayStart();
    }

    /* renamed from: g */
    public void mo112967g() {
        if (mo113217i()) {
            for (int i = 0; i < getCount(); i++) {
                ((C31184e) mo113215d(i)).invalidate();
            }
        }
    }

    /* renamed from: e */
    public void mo112965e() {
        if (mo113217i()) {
            for (int i = 0; i < getCount(); i++) {
                C31184e eVar = (C31184e) mo113215d(i);
                eVar.setSelectDate(mo112961b());
                eVar.mo112973b();
            }
        }
    }

    /* renamed from: f */
    public void mo112966f() {
        if (mo113217i()) {
            for (int i = 0; i < getCount(); i++) {
                C31184e eVar = (C31184e) mo113215d(i);
                CalendarDate modifyMonth = this.f78810e.mo111731b().modifyMonth(i > 0 ? i - 1 : -1);
                modifyMonth.setMonthDay(1);
                eVar.setSeedDate(modifyMonth);
                eVar.setStartDate(C32647d.m125279b(modifyMonth));
                eVar.setEndDate(C32647d.m125281c(modifyMonth));
                eVar.setSelectDate(mo112961b());
                eVar.mo112973b();
            }
        }
    }

    /* renamed from: a */
    public void mo112957a() {
        for (int i = 0; i < getCount(); i++) {
            ((C31184e) mo113215d(i)).mo112975c();
        }
    }

    /* renamed from: a */
    public void mo112960a(AbstractC31179a aVar) {
        this.f78808a = aVar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitepager.AbstractC31218b
    /* renamed from: a */
    public View mo108825a(int i) {
        C31184e eVar = new C31184e(this.f78809d, this.f78811f);
        m116404a(eVar, i);
        return eVar;
    }

    /* renamed from: c */
    public void mo112963c(int i) {
        if (i == 0) {
            C31184e eVar = (C31184e) mo113215d(0);
            CalendarDate b = mo112961b();
            CalendarDate c = mo112962c();
            if (eVar != null) {
                eVar.setSeedDate(c);
                eVar.setStartDate(C32647d.m125279b(c));
                eVar.setEndDate(C32647d.m125281c(c));
                eVar.setSelectDate(b);
                eVar.mo112973b();
            }
        } else if (i == 2) {
            C31184e eVar2 = (C31184e) mo113215d(2);
            CalendarDate b2 = mo112961b();
            CalendarDate d = mo112964d();
            if (eVar2 != null) {
                eVar2.setSeedDate(d);
                eVar2.setStartDate(C32647d.m125279b(d));
                eVar2.setEndDate(C32647d.m125281c(d));
                eVar2.setSelectDate(b2);
                eVar2.mo112973b();
            }
        }
    }

    /* renamed from: a */
    public void mo112959a(CalendarDate calendarDate) {
        if (mo113217i()) {
            for (int i = 0; i < getCount(); i++) {
                C31184e eVar = (C31184e) mo113215d(i);
                eVar.setCurrentDate(calendarDate);
                eVar.mo112973b();
            }
        }
    }

    /* renamed from: a */
    private void m116404a(C31184e eVar, int i) {
        CalendarSetting.DayOfWeek weekStartDay = C30022a.f74884c.mo108456c().getWeekStartDay();
        m116405a(eVar, i, weekStartDay);
        C30022a.f74884c.mo108450a(new C30086b.AbstractC30090a(weekStartDay, eVar, i) {
            /* class com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.$$Lambda$c$yEd2axU3lGGNsQ6FmKpquW21XI */
            public final /* synthetic */ CalendarSetting.DayOfWeek f$1;
            public final /* synthetic */ C31184e f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
            public final void onGetSucceed(CalendarSetting calendarSetting) {
                C31181c.this.m116406a(this.f$1, this.f$2, this.f$3, calendarSetting);
            }
        });
    }

    public C31181c(Context context, AbstractC31180b bVar) {
        super(context);
        this.f78809d = context;
        C31183d dVar = new C31183d(context, true);
        this.f78811f = dVar;
        dVar.setDesktopWidth(C36512a.m144041a().mo134753a(ContainerType.Right).width());
        this.f78811f.setTypeFace(Typeface.createFromAsset(this.f78809d.getAssets(), "fonts/DINPro-Bold.ttf"));
        this.f78810e = bVar;
        mo113216h();
    }

    /* renamed from: a */
    private void m116405a(C31184e eVar, int i, CalendarSetting.DayOfWeek dayOfWeek) {
        int i2;
        CalendarDate b = this.f78810e.mo111731b();
        if (i > 0) {
            i2 = i - 1;
        } else {
            i2 = -1;
        }
        CalendarDate modifyMonth = b.modifyMonth(i2);
        modifyMonth.setMonthDay(1);
        eVar.setSeedDate(modifyMonth);
        eVar.setStartDate(C32647d.m125280b(modifyMonth, dayOfWeek));
        eVar.setEndDate(C32647d.m125282c(modifyMonth, dayOfWeek));
        eVar.setSelectDate(mo112961b());
        eVar.setCurrentDate(this.f78810e.mo111730a());
        eVar.setOnMonthDayViewSelectListener(new AbstractC31175e() {
            /* class com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.C31181c.C311821 */

            @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31175e
            /* renamed from: a */
            public void mo112939a() {
                C31181c.this.mo112957a();
            }

            @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31175e
            /* renamed from: b */
            public void mo112942b() {
                C31181c.this.mo112965e();
            }

            @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31175e
            /* renamed from: a */
            public void mo112940a(int i) {
                C31181c.this.f78808a.mo111732a(i);
            }

            @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31175e
            /* renamed from: a */
            public void mo112941a(CalendarDate calendarDate) {
                C31181c.this.f78808a.mo111733a(calendarDate);
            }
        });
        eVar.mo112973b();
    }

    /* renamed from: a */
    public void mo112958a(SparseArray<List<Integer>> sparseArray, int i, int i2) {
        if (mo113217i()) {
            for (int i3 = 0; i3 < getCount(); i3++) {
                C31184e eVar = (C31184e) mo113215d(i3);
                if (eVar.getStartDate().getJulianDay() == i && eVar.getEndDate().getJulianDay() == i2) {
                    eVar.setDayEventColors(sparseArray);
                    eVar.mo112973b();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m116406a(CalendarSetting.DayOfWeek dayOfWeek, C31184e eVar, int i, CalendarSetting calendarSetting) {
        if (dayOfWeek != calendarSetting.getWeekStartDay()) {
            m116405a(eVar, i, calendarSetting.getWeekStartDay());
        }
    }
}
