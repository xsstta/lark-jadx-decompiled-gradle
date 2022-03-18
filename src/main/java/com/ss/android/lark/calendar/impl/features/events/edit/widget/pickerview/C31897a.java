package com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.AbstractC31910b;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.WheelView;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.C31903c;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.C31906e;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.C31909g;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.a */
public class C31897a extends AbstractC31910b {

    /* renamed from: a */
    public int f81460a = 1900;

    /* renamed from: b */
    public int f81461b = 1;

    /* renamed from: c */
    public WheelView f81462c;

    /* renamed from: d */
    public WheelView f81463d;

    /* renamed from: e */
    private int f81464e = 2100;

    /* renamed from: f */
    private int f81465f = 12;

    /* renamed from: g */
    private int f81466g = 1;

    /* renamed from: h */
    private int f81467h = 31;

    /* renamed from: i */
    private WheelView f81468i;

    /* renamed from: j */
    private View f81469j;

    /* renamed from: k */
    private Context f81470k;

    /* renamed from: l */
    private CalendarDate f81471l;

    /* renamed from: m */
    private String[] f81472m;

    /* renamed from: n */
    private String[] f81473n;

    /* renamed from: o */
    private List<String> f81474o;

    /* renamed from: p */
    private List<String> f81475p;

    /* renamed from: q */
    private String[] f81476q;

    /* renamed from: r */
    private AbstractC31910b.AbstractC31911a f81477r;

    /* renamed from: s */
    private String[] f81478s;

    /* renamed from: b */
    public View mo116499b() {
        return this.f81469j;
    }

    /* renamed from: e */
    public void mo116502e() {
        this.f81462c.mo116466b();
        this.f81463d.mo116466b();
        this.f81468i.mo116466b();
    }

    /* renamed from: g */
    private void m121366g() {
        C318981 r0 = new AbstractC31917h() {
            /* class com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.C31897a.C318981 */

            @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.AbstractC31917h
            /* renamed from: a */
            public void mo115161a(int i) {
                int i2 = i + C31897a.this.f81460a;
                C31897a aVar = C31897a.this;
                aVar.mo116497a(i2, aVar.f81463d.getCurrentItem() + C31897a.this.f81461b);
                C31897a.this.mo116495a();
            }
        };
        C318992 r1 = new AbstractC31917h() {
            /* class com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.C31897a.C318992 */

            @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.AbstractC31917h
            /* renamed from: a */
            public void mo115161a(int i) {
                int i2 = i + C31897a.this.f81461b;
                C31897a aVar = C31897a.this;
                aVar.mo116497a(aVar.f81462c.getCurrentItem() + C31897a.this.f81460a, i2);
                C31897a.this.mo116495a();
            }
        };
        C319003 r2 = new AbstractC31917h() {
            /* class com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.C31897a.C319003 */

            @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.AbstractC31917h
            /* renamed from: a */
            public void mo115161a(int i) {
                C31897a.this.mo116495a();
            }
        };
        this.f81462c.setOnItemSelectedListener(r0);
        this.f81463d.setOnItemSelectedListener(r1);
        this.f81468i.setOnItemSelectedListener(r2);
    }

    /* renamed from: a */
    public void mo116495a() {
        CalendarDate calendarDate = new CalendarDate();
        CalendarDate.roundSecond(calendarDate);
        calendarDate.setYear(this.f81460a + this.f81462c.getCurrentItem());
        calendarDate.setMonth(this.f81461b + this.f81463d.getCurrentItem());
        calendarDate.setMonthDay(this.f81466g + this.f81468i.getCurrentItem());
        this.f81477r.mo115475a(calendarDate);
    }

    /* renamed from: c */
    public void mo116500c() {
        this.f81462c.setTextColorCenter(this.f81470k.getResources().getColor(R.color.function_danger_500));
        this.f81463d.setTextColorCenter(this.f81470k.getResources().getColor(R.color.function_danger_500));
        this.f81468i.setTextColorCenter(this.f81470k.getResources().getColor(R.color.function_danger_500));
        this.f81462c.invalidate();
        this.f81463d.invalidate();
        this.f81468i.invalidate();
    }

    /* renamed from: d */
    public void mo116501d() {
        this.f81462c.setTextColorCenter(this.f81470k.getResources().getColor(R.color.text_title));
        this.f81463d.setTextColorCenter(this.f81470k.getResources().getColor(R.color.text_title));
        this.f81468i.setTextColorCenter(this.f81470k.getResources().getColor(R.color.text_title));
        this.f81462c.invalidate();
        this.f81463d.invalidate();
        this.f81468i.invalidate();
    }

    /* renamed from: f */
    private void m121365f() {
        this.f81472m = this.f81470k.getResources().getStringArray(R.array.month_big);
        this.f81473n = this.f81470k.getResources().getStringArray(R.array.month_little);
        this.f81474o = Arrays.asList(this.f81472m);
        this.f81475p = Arrays.asList(this.f81473n);
        this.f81476q = this.f81470k.getResources().getStringArray(R.array.weeks_short);
        this.f81462c.setLabel(C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_StandardTime_YearOnlyString, "year", ""));
        this.f81462c.mo116465a((Boolean) false);
        this.f81462c.setDividerType(WheelView.DividerType.FILL);
        this.f81462c.setDividerColor(UDColorUtils.getColor(this.f81470k, R.color.line_divider_default));
        this.f81462c.setAdapter(new C31903c(this.f81460a, this.f81464e));
        this.f81463d.setDividerType(WheelView.DividerType.FILL);
        this.f81463d.setDividerColor(UDColorUtils.getColor(this.f81470k, R.color.line_divider_default));
        this.f81463d.setAdapter(new C31909g(Arrays.asList(this.f81478s)));
        this.f81463d.mo116465a((Boolean) false);
        this.f81468i.setDividerType(WheelView.DividerType.FILL);
        this.f81468i.setDividerColor(UDColorUtils.getColor(this.f81470k, R.color.line_divider_default));
        this.f81468i.setAdapter(new C31906e(this.f81460a, this.f81461b, this.f81476q, this.f81474o, this.f81475p));
    }

    /* renamed from: a */
    public void mo116496a(int i) {
        this.f81462c.setItemVisible(i);
        this.f81463d.setItemVisible(i);
        this.f81468i.setItemVisible(i);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.AbstractC31910b
    /* renamed from: a */
    public void mo116498a(CalendarDate calendarDate) {
        this.f81471l = calendarDate;
        int year = calendarDate.getYear();
        int month = this.f81471l.getMonth();
        int monthDay = this.f81471l.getMonthDay();
        this.f81462c.setCurrentItem(year - this.f81460a);
        this.f81463d.setCurrentItem(month - this.f81461b);
        this.f81468i.setAdapter(new C31906e(year, month, this.f81476q, this.f81474o, this.f81475p));
        this.f81468i.setCurrentItem(monthDay - this.f81466g);
    }

    /* renamed from: a */
    private void m121364a(Context context, ViewGroup viewGroup) {
        this.f81470k = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.multi_time_view_wheels_year_month_date, viewGroup, false);
        this.f81469j = inflate;
        this.f81462c = (WheelView) inflate.findViewById(R.id.wheel_left);
        this.f81463d = (WheelView) this.f81469j.findViewById(R.id.wheel_middle);
        this.f81468i = (WheelView) this.f81469j.findViewById(R.id.wheel_right);
        this.f81462c.setTextColorCenter(this.f81470k.getResources().getColor(R.color.text_title));
        this.f81463d.setTextColorCenter(this.f81470k.getResources().getColor(R.color.text_title));
        this.f81468i.setTextColorCenter(this.f81470k.getResources().getColor(R.color.text_title));
    }

    /* renamed from: a */
    public void mo116497a(int i, int i2) {
        int currentItem = this.f81468i.getCurrentItem();
        this.f81468i.setAdapter(new C31906e(i, i2, this.f81476q, this.f81474o, this.f81475p));
        if (currentItem > this.f81468i.getAdapter().mo116503a() - 1) {
            currentItem = this.f81468i.getAdapter().mo116503a() - 1;
        }
        this.f81468i.setCurrentItem(currentItem);
    }

    public C31897a(Context context, ViewGroup viewGroup, AbstractC31910b.AbstractC31911a aVar) {
        this.f81477r = aVar;
        this.f81478s = C32634ae.m125183c(R.array.Lark_Calendar_MonthAbbr);
        m121364a(context, viewGroup);
        m121366g();
        m121365f();
    }
}
