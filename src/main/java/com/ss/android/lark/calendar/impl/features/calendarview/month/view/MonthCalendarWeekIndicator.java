package com.ss.android.lark.calendar.impl.features.calendarview.month.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32670u;
import com.ss.android.lark.calendar.p1430a.C30022a;

public class MonthCalendarWeekIndicator extends LinearLayout {

    /* renamed from: a */
    private String[] f77984a = C32634ae.m125183c(R.array.weeks_abbr);

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.view.MonthCalendarWeekIndicator$1 */
    public static /* synthetic */ class C309611 {

        /* renamed from: a */
        static final /* synthetic */ int[] f77985a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting$DayOfWeek[] r0 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting.DayOfWeek.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.calendar.impl.features.calendarview.month.view.MonthCalendarWeekIndicator.C309611.f77985a = r0
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting$DayOfWeek r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting.DayOfWeek.MONDAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.calendar.impl.features.calendarview.month.view.MonthCalendarWeekIndicator.C309611.f77985a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting$DayOfWeek r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting.DayOfWeek.SATURDAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendarview.month.view.MonthCalendarWeekIndicator.C309611.<clinit>():void");
        }
    }

    public MonthCalendarWeekIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C32670u.m125363a(context, R.layout.month_calendar_week_indicator, this);
    }

    /* renamed from: a */
    public void mo112075a(CalendarDate calendarDate, CalendarDate calendarDate2, CalendarDate calendarDate3) {
        CalendarSetting c = C30022a.f74884c.mo108456c();
        m115555a(calendarDate, calendarDate2, calendarDate3, c);
        C30022a.f74884c.mo108450a(new C30086b.AbstractC30090a(c, calendarDate, calendarDate2, calendarDate3) {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.month.view.$$Lambda$MonthCalendarWeekIndicator$5We5Vg1qh_A3SG7MgDbWuKyFu0 */
            public final /* synthetic */ CalendarSetting f$1;
            public final /* synthetic */ CalendarDate f$2;
            public final /* synthetic */ CalendarDate f$3;
            public final /* synthetic */ CalendarDate f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
            public final void onGetSucceed(CalendarSetting calendarSetting) {
                MonthCalendarWeekIndicator.m270303lambda$5We5Vg1qh_A3SG7MgDbWuKyFu0(MonthCalendarWeekIndicator.this, this.f$1, this.f$2, this.f$3, this.f$4, calendarSetting);
            }
        });
    }

    /* renamed from: a */
    private void m115555a(CalendarDate calendarDate, CalendarDate calendarDate2, CalendarDate calendarDate3, CalendarSetting calendarSetting) {
        int i = C309611.f77985a[calendarSetting.getWeekStartDay().ordinal()];
        int i2 = 0;
        if (i == 1) {
            int i3 = 0;
            while (i3 < 7) {
                i3++;
                ((TextView) getChildAt(i3)).setText(this.f77984a[i3 % 7]);
            }
        } else if (i != 2) {
            for (int i4 = 0; i4 < 7; i4++) {
                ((TextView) getChildAt(i4)).setText(this.f77984a[i4]);
            }
        } else {
            for (int i5 = 0; i5 < 7; i5++) {
                ((TextView) getChildAt(i5)).setText(this.f77984a[(i5 + 6) % 7]);
            }
        }
        if (calendarDate2.getJulianDay() < calendarDate.getJulianDay() || calendarDate2.getJulianDay() > calendarDate3.getJulianDay()) {
            while (i2 < getChildCount()) {
                ((TextView) getChildAt(i2)).setTextColor(C32634ae.m125178a(R.color.text_title));
                i2++;
            }
            return;
        }
        while (i2 < getChildCount()) {
            if (i2 == calendarDate2.getWeeklyDayIndex()) {
                ((TextView) getChildAt(i2)).setTextColor(C32634ae.m125178a(R.color.primary_pri_500));
            } else {
                ((TextView) getChildAt(i2)).setTextColor(C32634ae.m125178a(R.color.text_title));
            }
            i2++;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m115556a(CalendarSetting calendarSetting, CalendarDate calendarDate, CalendarDate calendarDate2, CalendarDate calendarDate3, CalendarSetting calendarSetting2) {
        if (calendarSetting2.getWeekStartDay() != calendarSetting.getWeekStartDay()) {
            m115555a(calendarDate, calendarDate2, calendarDate3, calendarSetting2);
        }
    }
}
