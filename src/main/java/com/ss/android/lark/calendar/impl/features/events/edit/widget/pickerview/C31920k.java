package com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IRepeatEndChosenListener;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.C31903c;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.C31906e;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.C31909g;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.k */
public class C31920k {

    /* renamed from: a */
    public int f81534a = 1900;

    /* renamed from: b */
    public int f81535b = 1;

    /* renamed from: c */
    public WheelView f81536c;

    /* renamed from: d */
    public WheelView f81537d;

    /* renamed from: e */
    private int f81538e = 2100;

    /* renamed from: f */
    private int f81539f = 12;

    /* renamed from: g */
    private int f81540g = 1;

    /* renamed from: h */
    private int f81541h = 31;

    /* renamed from: i */
    private int f81542i;

    /* renamed from: j */
    private int f81543j;

    /* renamed from: k */
    private int f81544k;

    /* renamed from: l */
    private String[] f81545l;

    /* renamed from: m */
    private String[] f81546m;

    /* renamed from: n */
    private WheelView f81547n;

    /* renamed from: o */
    private View f81548o;

    /* renamed from: p */
    private Context f81549p;

    /* renamed from: q */
    private CalendarDate f81550q;

    /* renamed from: r */
    private String[] f81551r;

    /* renamed from: s */
    private String[] f81552s;

    /* renamed from: t */
    private List<String> f81553t;

    /* renamed from: u */
    private List<String> f81554u;

    /* renamed from: v */
    private IRepeatEndChosenListener f81555v;

    /* renamed from: c */
    public View mo116538c() {
        return this.f81548o;
    }

    /* renamed from: g */
    private void m121442g() {
        C319211 r0 = new AbstractC31917h() {
            /* class com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.C31920k.C319211 */

            @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.AbstractC31917h
            /* renamed from: a */
            public void mo115161a(int i) {
                int i2 = i + C31920k.this.f81534a;
                C31920k kVar = C31920k.this;
                kVar.mo116535a(i2, kVar.f81537d.getCurrentItem() + C31920k.this.f81535b);
                C31920k.this.mo116534a();
            }
        };
        C319222 r1 = new AbstractC31917h() {
            /* class com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.C31920k.C319222 */

            @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.AbstractC31917h
            /* renamed from: a */
            public void mo115161a(int i) {
                int i2 = i + C31920k.this.f81535b;
                C31920k kVar = C31920k.this;
                kVar.mo116535a(kVar.f81536c.getCurrentItem() + C31920k.this.f81534a, i2);
                C31920k.this.mo116534a();
            }
        };
        C319233 r2 = new AbstractC31917h() {
            /* class com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.C31920k.C319233 */

            @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.AbstractC31917h
            /* renamed from: a */
            public void mo115161a(int i) {
                C31920k.this.mo116534a();
            }
        };
        this.f81536c.setOnItemSelectedListener(r0);
        this.f81537d.setOnItemSelectedListener(r1);
        this.f81547n.setOnItemSelectedListener(r2);
    }

    /* renamed from: a */
    public void mo116534a() {
        this.f81542i = this.f81534a + this.f81536c.getCurrentItem();
        this.f81543j = this.f81535b + this.f81537d.getCurrentItem();
        this.f81544k = this.f81540g + this.f81547n.getCurrentItem();
        CalendarDate calendarDate = new CalendarDate();
        CalendarDate.roundSecond(calendarDate);
        calendarDate.setYear(this.f81542i);
        calendarDate.setMonth(this.f81543j);
        calendarDate.setMonthDay(this.f81544k);
        this.f81555v.mo114658a(calendarDate);
    }

    /* renamed from: b */
    public String mo116537b() {
        int currentItem = this.f81536c.getCurrentItem() + this.f81534a;
        int currentItem2 = this.f81537d.getCurrentItem() + this.f81535b;
        int currentItem3 = this.f81547n.getCurrentItem() + this.f81540g;
        CalendarDate calendarDate = new CalendarDate();
        calendarDate.setYear(currentItem);
        calendarDate.setMonth(currentItem2);
        calendarDate.setMonthDay(currentItem3);
        return C32646c.m125258a(calendarDate, calendarDate.getTimeZone(), true);
    }

    /* renamed from: d */
    public void mo116539d() {
        this.f81536c.setTextColorCenter(this.f81549p.getResources().getColor(R.color.lkui_N300));
        this.f81536c.setTextColorOut(this.f81549p.getResources().getColor(R.color.lkui_N300));
        this.f81537d.setTextColorCenter(this.f81549p.getResources().getColor(R.color.lkui_N300));
        this.f81537d.setTextColorOut(this.f81549p.getResources().getColor(R.color.lkui_N300));
        this.f81547n.setTextColorCenter(this.f81549p.getResources().getColor(R.color.lkui_N300));
        this.f81547n.setTextColorOut(this.f81549p.getResources().getColor(R.color.lkui_N300));
        this.f81536c.invalidate();
        this.f81537d.invalidate();
        this.f81547n.invalidate();
    }

    /* renamed from: e */
    public void mo116540e() {
        this.f81536c.setTextColorCenter(this.f81549p.getResources().getColor(R.color.text_title));
        this.f81536c.setTextColorOut(this.f81549p.getResources().getColor(R.color.text_placeholder));
        this.f81537d.setTextColorCenter(this.f81549p.getResources().getColor(R.color.text_title));
        this.f81537d.setTextColorOut(this.f81549p.getResources().getColor(R.color.text_placeholder));
        this.f81547n.setTextColorCenter(this.f81549p.getResources().getColor(R.color.text_title));
        this.f81547n.setTextColorOut(this.f81549p.getResources().getColor(R.color.text_placeholder));
        this.f81536c.invalidate();
        this.f81537d.invalidate();
        this.f81547n.invalidate();
    }

    /* renamed from: f */
    private void m121441f() {
        this.f81551r = this.f81549p.getResources().getStringArray(R.array.month_big);
        this.f81552s = this.f81549p.getResources().getStringArray(R.array.month_little);
        this.f81553t = Arrays.asList(this.f81551r);
        this.f81554u = Arrays.asList(this.f81552s);
        this.f81536c.setLabel(C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_StandardTime_YearOnlyString, "year", ""));
        this.f81536c.mo116465a((Boolean) false);
        this.f81536c.setAdapter(new C31903c(this.f81534a, this.f81538e));
        this.f81537d.setAdapter(new C31909g(Arrays.asList(this.f81545l)));
        this.f81537d.mo116465a((Boolean) false);
        this.f81547n.setAdapter(new C31906e(this.f81534a, this.f81535b, this.f81546m, this.f81553t, this.f81554u));
        this.f81547n.mo116465a((Boolean) false);
    }

    /* renamed from: a */
    public void mo116536a(CalendarDate calendarDate) {
        this.f81550q = calendarDate;
        int year = calendarDate.getYear();
        int month = this.f81550q.getMonth();
        int monthDay = this.f81550q.getMonthDay();
        this.f81536c.setCurrentItem(year - this.f81534a);
        this.f81537d.setCurrentItem(month - this.f81535b);
        this.f81547n.setCurrentItem(monthDay - this.f81540g);
        mo116535a(year, month);
    }

    /* renamed from: a */
    private void m121440a(Context context, ViewGroup viewGroup) {
        this.f81549p = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_wheels_year_month_day, viewGroup, false);
        this.f81548o = inflate;
        this.f81536c = (WheelView) inflate.findViewById(R.id.wheel_left);
        this.f81537d = (WheelView) this.f81548o.findViewById(R.id.wheel_middle);
        this.f81547n = (WheelView) this.f81548o.findViewById(R.id.wheel_right);
        this.f81536c.setTextColorCenter(this.f81549p.getResources().getColor(R.color.text_title));
        this.f81537d.setTextColorCenter(this.f81549p.getResources().getColor(R.color.text_title));
        this.f81547n.setTextColorCenter(this.f81549p.getResources().getColor(R.color.text_title));
    }

    /* renamed from: a */
    public void mo116535a(int i, int i2) {
        int currentItem = this.f81547n.getCurrentItem();
        this.f81547n.setAdapter(new C31906e(i, i2, this.f81546m, this.f81553t, this.f81554u));
        if (currentItem > this.f81547n.getAdapter().mo116503a() - 1) {
            currentItem = this.f81547n.getAdapter().mo116503a() - 1;
        }
        this.f81547n.setCurrentItem(currentItem);
    }

    public C31920k(Context context, ViewGroup viewGroup, IRepeatEndChosenListener dVar) {
        this.f81555v = dVar;
        this.f81545l = C32634ae.m125183c(R.array.month);
        this.f81546m = C32634ae.m125183c(R.array.weeks_short);
        m121440a(context, viewGroup);
        m121442g();
        m121441f();
    }
}
