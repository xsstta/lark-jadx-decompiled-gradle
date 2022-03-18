package com.ss.android.lark.mail.impl.widget.time;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.widget.time.AbstractC44081c;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.wheelpicker.AbstractC59262g;
import com.ss.android.lark.widget.wheelpicker.C59256a;
import com.ss.android.lark.widget.wheelpicker.C59261f;
import com.ss.android.lark.widget.wheelpicker.WheelView;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.widget.time.b */
public class C44076b extends AbstractC44081c {

    /* renamed from: h */
    private static final float f111888h = ((float) UIHelper.dp2px(0.5f));

    /* renamed from: a */
    public int f111889a = 1900;

    /* renamed from: b */
    public int f111890b = 1;

    /* renamed from: c */
    public int f111891c = 1;

    /* renamed from: d */
    public WheelView f111892d;

    /* renamed from: e */
    public WheelView f111893e;

    /* renamed from: f */
    public WheelView f111894f;

    /* renamed from: g */
    public AbstractC44081c.AbstractC44082a f111895g;

    /* renamed from: i */
    private int f111896i = 2100;

    /* renamed from: j */
    private int f111897j = 12;

    /* renamed from: k */
    private int f111898k = 31;

    /* renamed from: l */
    private View f111899l;

    /* renamed from: m */
    private Context f111900m;

    /* renamed from: n */
    private CalendarDate f111901n;

    /* renamed from: o */
    private String[] f111902o;

    /* renamed from: p */
    private String[] f111903p;

    /* renamed from: q */
    private List<String> f111904q;

    /* renamed from: r */
    private List<String> f111905r;

    /* renamed from: s */
    private String[] f111906s;

    /* renamed from: t */
    private AbstractC44081c.AbstractC44083b f111907t;

    /* renamed from: u */
    private String[] f111908u;

    /* renamed from: v */
    private int f111909v;

    /* renamed from: h */
    public void mo156871h() {
    }

    /* renamed from: b */
    public View mo156864b() {
        return this.f111899l;
    }

    /* renamed from: g */
    public void mo156870g() {
        this.f111892d.mo201488d();
        this.f111893e.mo201488d();
        this.f111894f.mo201488d();
    }

    /* renamed from: j */
    private void m174593j() {
        C440771 r0 = new AbstractC59262g() {
            /* class com.ss.android.lark.mail.impl.widget.time.C44076b.C440771 */

            @Override // com.ss.android.lark.widget.wheelpicker.AbstractC59262g
            /* renamed from: a */
            public void mo156872a(int i) {
                int i2 = i + C44076b.this.f111889a;
                C44076b bVar = C44076b.this;
                bVar.mo156861a(i2, bVar.f111893e.getCurrentItem() + C44076b.this.f111890b);
                C44076b.this.mo156859a();
            }
        };
        C440782 r1 = new AbstractC59262g() {
            /* class com.ss.android.lark.mail.impl.widget.time.C44076b.C440782 */

            @Override // com.ss.android.lark.widget.wheelpicker.AbstractC59262g
            /* renamed from: a */
            public void mo156872a(int i) {
                int i2 = i + C44076b.this.f111890b;
                C44076b bVar = C44076b.this;
                bVar.mo156861a(bVar.f111892d.getCurrentItem() + C44076b.this.f111889a, i2);
                C44076b.this.mo156859a();
            }
        };
        C440793 r2 = new AbstractC59262g() {
            /* class com.ss.android.lark.mail.impl.widget.time.C44076b.C440793 */

            @Override // com.ss.android.lark.widget.wheelpicker.AbstractC59262g
            /* renamed from: a */
            public void mo156872a(int i) {
                C44076b.this.mo156859a();
            }
        };
        this.f111892d.setOnItemSelectedListener(r0);
        this.f111893e.setOnItemSelectedListener(r1);
        this.f111894f.setOnItemSelectedListener(r2);
        C440804 r02 = new AbstractC44098k() {
            /* class com.ss.android.lark.mail.impl.widget.time.C44076b.C440804 */

            @Override // com.ss.android.lark.mail.impl.widget.time.AbstractC44098k
            /* renamed from: a */
            public void mo156873a() {
                if (C44076b.this.f111895g != null) {
                    C44076b.this.f111895g.mo156875a();
                }
            }

            @Override // com.ss.android.lark.mail.impl.widget.time.AbstractC44098k
            /* renamed from: a */
            public void mo156874a(int i) {
                CalendarDate calendarDate = new CalendarDate();
                CalendarDate.roundSecond(calendarDate);
                calendarDate.setYear(C44076b.this.f111889a + C44076b.this.f111892d.getCurrentItem());
                calendarDate.setMonth(C44076b.this.f111890b + C44076b.this.f111893e.getCurrentItem());
                calendarDate.setMonthDay(C44076b.this.f111891c + C44076b.this.f111894f.getCurrentItem());
                if (C44076b.this.f111895g != null) {
                    C44076b.this.f111895g.mo156876a(calendarDate);
                }
            }
        };
        this.f111892d.f111883b = r02;
        this.f111893e.f111883b = r02;
        this.f111894f.f111883b = r02;
    }

    /* renamed from: a */
    public void mo156859a() {
        CalendarDate calendarDate = new CalendarDate();
        CalendarDate.roundSecond(calendarDate);
        calendarDate.setYear(this.f111889a + this.f111892d.getCurrentItem());
        calendarDate.setMonth(this.f111890b + this.f111893e.getCurrentItem());
        calendarDate.setMonthDay(this.f111891c + this.f111894f.getCurrentItem());
        this.f111907t.mo156877a(calendarDate);
    }

    /* renamed from: c */
    public void mo156866c() {
        this.f111892d.setTextColorCenter(this.f111900m.getResources().getColor(R.color.function_danger_500));
        this.f111893e.setTextColorCenter(this.f111900m.getResources().getColor(R.color.function_danger_500));
        this.f111894f.setTextColorCenter(this.f111900m.getResources().getColor(R.color.function_danger_500));
        this.f111892d.invalidate();
        this.f111893e.invalidate();
        this.f111894f.invalidate();
    }

    /* renamed from: d */
    public void mo156867d() {
        this.f111892d.setTextColorCenter(this.f111900m.getResources().getColor(R.color.text_disable));
        this.f111893e.setTextColorCenter(this.f111900m.getResources().getColor(R.color.text_disable));
        this.f111894f.setTextColorCenter(this.f111900m.getResources().getColor(R.color.text_disable));
        this.f111892d.invalidate();
        this.f111893e.invalidate();
        this.f111894f.invalidate();
    }

    /* renamed from: f */
    public void mo156869f() {
        this.f111892d.setTextColorCenter(this.f111900m.getResources().getColor(R.color.text_title));
        this.f111893e.setTextColorCenter(this.f111900m.getResources().getColor(R.color.text_title));
        this.f111894f.setTextColorCenter(this.f111900m.getResources().getColor(R.color.text_title));
        this.f111892d.invalidate();
        this.f111893e.invalidate();
        this.f111894f.invalidate();
    }

    /* renamed from: i */
    private void m174592i() {
        this.f111902o = this.f111900m.getResources().getStringArray(R.array.mail_month_big);
        this.f111903p = this.f111900m.getResources().getStringArray(R.array.mail_month_little);
        this.f111904q = Arrays.asList(this.f111902o);
        this.f111905r = Arrays.asList(this.f111903p);
        this.f111906s = this.f111900m.getResources().getStringArray(R.array.mail_weeks);
        this.f111892d.setLabel(this.f111900m.getResources().getString(R.string.Calendar_TimeFormat_Year));
        this.f111892d.mo201485a((Boolean) false);
        this.f111892d.setAdapter(new C59261f(this.f111889a, this.f111896i));
        this.f111893e.setAdapter(new C59256a(Arrays.asList(this.f111908u)));
        this.f111893e.mo201485a((Boolean) false);
        this.f111894f.setAdapter(new C44089g(this.f111889a, this.f111890b, this.f111906s, this.f111904q, this.f111905r));
    }

    /* renamed from: e */
    public void mo156868e() {
        CalendarDate calendarDate = new CalendarDate();
        CalendarDate calendarDate2 = new CalendarDate();
        int i = -this.f111909v;
        int i2 = 0;
        while (true) {
            int i3 = this.f111909v;
            if (i2 >= i3) {
                break;
            }
            int i4 = i2 - (i3 / 2);
            int currentItem = ((this.f111893e.getCurrentItem() + i4) + this.f111893e.getItemsCount()) % this.f111893e.getItemsCount();
            int currentItem2 = ((this.f111894f.getCurrentItem() + i4) + this.f111894f.getItemsCount()) % this.f111894f.getItemsCount();
            calendarDate2.setYear(this.f111889a + this.f111892d.getCurrentItem() + i4);
            calendarDate2.setMonth(this.f111890b + currentItem);
            calendarDate2.setMonthDay(this.f111891c + currentItem2);
            if (calendarDate2.getJulianDay() >= calendarDate.getJulianDay()) {
                break;
            }
            i2++;
            i = i2 - (this.f111909v / 2);
        }
        this.f111892d.mo156842a(i);
        this.f111893e.mo156842a(i);
        this.f111894f.mo156842a(i);
        this.f111892d.invalidate();
        this.f111893e.invalidate();
        this.f111894f.invalidate();
    }

    /* renamed from: a */
    public void mo156863a(AbstractC44081c.AbstractC44082a aVar) {
        this.f111895g = aVar;
    }

    /* renamed from: a */
    public void mo156860a(int i) {
        this.f111909v = i;
        this.f111892d.setItemVisible(i);
        this.f111893e.setItemVisible(i);
        this.f111894f.setItemVisible(i);
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.AbstractC44081c
    /* renamed from: b */
    public void mo156865b(CalendarDate calendarDate) {
        this.f111901n = calendarDate;
        int year = calendarDate.getYear();
        int month = this.f111901n.getMonth();
        int monthDay = this.f111901n.getMonthDay();
        this.f111892d.setCurrentItem(year - this.f111889a);
        this.f111893e.setCurrentItem(month - this.f111890b);
        this.f111894f.setAdapter(new C44089g(year, month, this.f111906s, this.f111904q, this.f111905r));
        this.f111894f.setCurrentItem(monthDay - this.f111891c);
    }

    /* renamed from: a */
    public void mo156862a(CalendarDate calendarDate) {
        if (calendarDate != null && this.f111901n != null) {
            int currentItem = this.f111889a + this.f111892d.getCurrentItem();
            int currentItem2 = this.f111890b + this.f111893e.getCurrentItem();
            int currentItem3 = this.f111891c + this.f111894f.getCurrentItem();
            this.f111892d.mo156844b(calendarDate.getYear() - currentItem);
            this.f111893e.mo156844b(calendarDate.getMonth() - currentItem2);
            this.f111894f.mo156844b(calendarDate.getMonthDay() - currentItem3);
        }
    }

    /* renamed from: a */
    public void mo156861a(int i, int i2) {
        int currentItem = this.f111894f.getCurrentItem();
        this.f111894f.setAdapter(new C44089g(i, i2, this.f111906s, this.f111904q, this.f111905r));
        if (currentItem > this.f111894f.getAdapter().mo156880a() - 1) {
            currentItem = this.f111894f.getAdapter().mo156880a() - 1;
        }
        this.f111894f.setCurrentItem(currentItem);
    }

    /* renamed from: a */
    private void m174591a(Context context, ViewGroup viewGroup) {
        this.f111900m = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.mail_multi_time_view_wheels_year_month_date, viewGroup, false);
        this.f111899l = inflate;
        this.f111892d = (WheelView) inflate.findViewById(R.id.wheel_left);
        this.f111893e = (WheelView) this.f111899l.findViewById(R.id.wheel_middle);
        this.f111894f = (WheelView) this.f111899l.findViewById(R.id.wheel_right);
        this.f111892d.setTextColorCenter(this.f111900m.getResources().getColor(R.color.text_title));
        this.f111893e.setTextColorCenter(this.f111900m.getResources().getColor(R.color.text_title));
        this.f111894f.setTextColorCenter(this.f111900m.getResources().getColor(R.color.text_title));
        this.f111892d.setDividerType(WheelView.DividerType.FILL);
        this.f111893e.setDividerType(WheelView.DividerType.FILL);
        this.f111894f.setDividerType(WheelView.DividerType.FILL);
        WheelView wheelView = this.f111892d;
        float f = f111888h;
        wheelView.setDividerWidth(f);
        this.f111893e.setDividerWidth(f);
        this.f111894f.setDividerWidth(f);
        mo156868e();
    }

    public C44076b(Context context, ViewGroup viewGroup, AbstractC44081c.AbstractC44083b bVar) {
        this.f111907t = bVar;
        this.f111908u = C41816b.m166115a().mo150132b().getResources().getStringArray(R.array.mail_Calendar_MonthAbbr);
        m174591a(context, viewGroup);
        m174593j();
        m174592i();
    }
}
