package com.ss.android.lark.mail.impl.widget.time;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.utils.C43785p;
import com.ss.android.lark.mail.impl.widget.time.AbstractC44081c;
import com.ss.android.lark.widget.wheelpicker.AbstractC59262g;
import com.ss.android.lark.widget.wheelpicker.C59261f;
import com.ss.android.lark.widget.wheelpicker.WheelView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: com.ss.android.lark.mail.impl.widget.time.i */
public class C44093i extends AbstractC44081c {

    /* renamed from: a */
    public AbstractC44081c.AbstractC44082a f111953a;

    /* renamed from: b */
    public AbstractC44096a f111954b;

    /* renamed from: c */
    private WheelView f111955c;

    /* renamed from: d */
    private WheelView f111956d;

    /* renamed from: e */
    private WheelView f111957e;

    /* renamed from: f */
    private WheelView f111958f;

    /* renamed from: g */
    private C44086e f111959g;

    /* renamed from: h */
    private AMPMWheelAdapter f111960h;

    /* renamed from: i */
    private CalendarDate f111961i;

    /* renamed from: j */
    private Date f111962j;

    /* renamed from: k */
    private SimpleDateFormat f111963k;

    /* renamed from: l */
    private View f111964l;

    /* renamed from: m */
    private Context f111965m;

    /* renamed from: n */
    private long f111966n;

    /* renamed from: o */
    private AbstractC44081c.AbstractC44083b f111967o;

    /* renamed from: p */
    private String[] f111968p;

    /* renamed from: q */
    private Boolean f111969q;

    /* renamed from: r */
    private Boolean f111970r;

    /* renamed from: s */
    private TimeZone f111971s;

    /* renamed from: t */
    private C44087f f111972t;

    /* renamed from: u */
    private int f111973u;

    /* renamed from: com.ss.android.lark.mail.impl.widget.time.i$a */
    public interface AbstractC44096a {
        /* renamed from: a */
        CalendarDate mo156909a();
    }

    /* renamed from: a */
    public void mo156898a() {
    }

    /* renamed from: g */
    public View mo156908g() {
        return this.f111964l;
    }

    /* renamed from: c */
    public void mo156904c() {
        CalendarDate b = mo156903b();
        this.f111967o.mo156877a(b);
        this.f111961i = b;
    }

    /* renamed from: j */
    private void m174653j() {
        TimeZone timeZone = this.f111971s;
        if (timeZone != null) {
            this.f111963k.setTimeZone(timeZone);
        }
        try {
            this.f111962j = this.f111963k.parse("2010-01-01");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: i */
    private void m174652i() {
        C440941 r0 = new AbstractC59262g() {
            /* class com.ss.android.lark.mail.impl.widget.time.C44093i.C440941 */

            @Override // com.ss.android.lark.widget.wheelpicker.AbstractC59262g
            /* renamed from: a */
            public void mo156872a(int i) {
                C44093i.this.mo156904c();
            }
        };
        this.f111957e.setOnItemSelectedListener(r0);
        this.f111956d.setOnItemSelectedListener(r0);
        this.f111955c.setOnItemSelectedListener(r0);
        if (!this.f111969q.booleanValue()) {
            this.f111958f.setOnItemSelectedListener(r0);
        }
        C440952 r02 = new AbstractC44098k() {
            /* class com.ss.android.lark.mail.impl.widget.time.C44093i.C440952 */

            @Override // com.ss.android.lark.mail.impl.widget.time.AbstractC44098k
            /* renamed from: a */
            public void mo156873a() {
                if (C44093i.this.f111953a != null) {
                    C44093i.this.f111953a.mo156875a();
                }
            }

            @Override // com.ss.android.lark.mail.impl.widget.time.AbstractC44098k
            /* renamed from: a */
            public void mo156874a(int i) {
                if (C44093i.this.f111953a != null) {
                    C44093i.this.f111953a.mo156876a(C44093i.this.mo156903b());
                }
            }
        };
        this.f111957e.f111883b = r02;
        this.f111956d.f111883b = r02;
        this.f111955c.f111883b = r02;
        if (!this.f111969q.booleanValue()) {
            this.f111958f.f111883b = r02;
        }
    }

    /* renamed from: h */
    private void m174651h() {
        C59261f fVar;
        this.f111968p = this.f111965m.getResources().getStringArray(R.array.mail_weeks);
        m174653j();
        if (!this.f111970r.booleanValue()) {
            this.f111972t = new C44087f(this.f111962j, 0, 22000, this.f111968p);
        } else {
            this.f111972t = new C44087f(this.f111962j, 0, 0, this.f111968p, true, "");
        }
        this.f111955c.setAdapter(this.f111972t);
        C44086e eVar = new C44086e(0, 55, 5);
        this.f111959g = eVar;
        this.f111957e.setAdapter(eVar);
        if (!this.f111969q.booleanValue()) {
            AMPMWheelAdapter aVar = new AMPMWheelAdapter();
            this.f111960h = aVar;
            this.f111958f.setAdapter(aVar);
            fVar = new C59261f(1, 12);
        } else {
            fVar = new C59261f(0, 23);
        }
        this.f111956d.setAdapter(fVar);
    }

    /* renamed from: b */
    public CalendarDate mo156903b() {
        CalendarDate calendarDate = new CalendarDate(this.f111962j);
        TimeZone timeZone = this.f111971s;
        if (timeZone != null) {
            calendarDate.setTimeZone(timeZone);
        }
        calendarDate.setMonthDay(calendarDate.getMonthDay() + this.f111955c.getCurrentItem());
        if (this.f111969q.booleanValue()) {
            calendarDate.setHour(calendarDate.getHour() + this.f111956d.getCurrentItem());
        } else {
            int i = 0;
            if (this.f111956d.getCurrentItem() != 11) {
                i = this.f111956d.getCurrentItem() + 1;
            }
            calendarDate.setHour(calendarDate.getHour() + (this.f111958f.getCurrentItem() * 12) + i);
        }
        calendarDate.setMinute(calendarDate.getMinute() + (this.f111957e.getCurrentItem() * this.f111959g.mo156884b()));
        return calendarDate;
    }

    /* renamed from: d */
    public void mo156905d() {
        this.f111957e.setTextColorCenter(this.f111965m.getResources().getColor(R.color.text_disable));
        this.f111956d.setTextColorCenter(this.f111965m.getResources().getColor(R.color.text_disable));
        this.f111955c.setTextColorCenter(this.f111965m.getResources().getColor(R.color.text_disable));
        if (!this.f111969q.booleanValue()) {
            this.f111958f.setTextColorCenter(this.f111965m.getResources().getColor(R.color.text_disable));
            this.f111958f.invalidate();
        }
        this.f111957e.invalidate();
        this.f111956d.invalidate();
        this.f111955c.invalidate();
    }

    /* renamed from: f */
    public void mo156907f() {
        this.f111957e.setTextColorCenter(this.f111965m.getResources().getColor(R.color.text_title));
        this.f111956d.setTextColorCenter(this.f111965m.getResources().getColor(R.color.text_title));
        this.f111955c.setTextColorCenter(this.f111965m.getResources().getColor(R.color.text_title));
        if (!this.f111969q.booleanValue()) {
            this.f111958f.setTextColorCenter(this.f111965m.getResources().getColor(R.color.text_title));
            this.f111958f.invalidate();
        }
        this.f111957e.invalidate();
        this.f111956d.invalidate();
        this.f111955c.invalidate();
    }

    /* renamed from: e */
    public void mo156906e() {
        CalendarDate calendarDate;
        AbstractC44096a aVar = this.f111954b;
        if (aVar != null) {
            calendarDate = aVar.mo156909a();
        } else {
            calendarDate = new CalendarDate(this.f111971s);
        }
        CalendarDate b = mo156903b();
        int julianDay = b.getJulianDay();
        int hour = b.getHour();
        int minute = b.getMinute();
        int i = -this.f111973u;
        int i2 = 0;
        while (true) {
            int i3 = this.f111973u;
            if (i2 >= i3) {
                break;
            }
            int i4 = i2 - (i3 / 2);
            b.setJulianDay(julianDay + i4);
            b.setHour(((hour + i4) + 24) % 24);
            b.setMinute((((i4 * this.f111959g.mo156884b()) + minute) + 60) % 60);
            if (b.getTimeInSeconds() / 60 >= calendarDate.getTimeInSeconds() / 60) {
                break;
            }
            i2++;
            i = i2 - (this.f111973u / 2);
        }
        this.f111957e.mo156842a(i);
        this.f111956d.mo156842a(i);
        this.f111955c.mo156842a(i);
        if (!this.f111969q.booleanValue()) {
            this.f111958f.mo156842a(i);
            this.f111958f.invalidate();
        }
        this.f111957e.invalidate();
        this.f111956d.invalidate();
        this.f111955c.invalidate();
    }

    /* renamed from: a */
    public void mo156901a(AbstractC44081c.AbstractC44082a aVar) {
        this.f111953a = aVar;
    }

    /* renamed from: a */
    public void mo156902a(TimeZone timeZone) {
        if (timeZone != null) {
            this.f111971s = timeZone;
            this.f111972t.mo156889a(timeZone);
            m174653j();
            this.f111972t.mo156888a(this.f111962j);
        }
    }

    /* renamed from: a */
    public void mo156899a(int i) {
        WheelView wheelView;
        this.f111973u = i;
        this.f111955c.setItemVisible(i);
        this.f111956d.setItemVisible(i);
        this.f111957e.setItemVisible(i);
        if (!this.f111969q.booleanValue() && (wheelView = this.f111958f) != null) {
            wheelView.setItemVisible(i);
        }
    }

    /* renamed from: a */
    public void mo156900a(CalendarDate calendarDate) {
        int i;
        if (calendarDate != null) {
            CalendarDate b = mo156903b();
            this.f111955c.mo156844b(mo156897a(this.f111962j, calendarDate.getDate()) - mo156897a(this.f111962j, b.getDate()));
            if (this.f111969q.booleanValue()) {
                this.f111956d.mo156844b(calendarDate.getHour() - b.getHour());
            } else {
                int hourForTwelve = b.getHourForTwelve();
                int hourForTwelve2 = calendarDate.getHourForTwelve();
                int i2 = 11;
                if (hourForTwelve == 0) {
                    i = 11;
                } else {
                    i = hourForTwelve - 1;
                }
                if (hourForTwelve2 != 0) {
                    i2 = hourForTwelve2 - 1;
                }
                this.f111956d.mo156844b(i2 - i);
                this.f111958f.mo156844b(calendarDate.getAMPM() - b.getAMPM());
            }
            this.f111957e.mo156844b((calendarDate.getMinute() - b.getMinute()) / this.f111959g.mo156884b());
        }
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.AbstractC44081c
    /* renamed from: b */
    public void mo156865b(CalendarDate calendarDate) {
        int i;
        this.f111961i = calendarDate;
        this.f111955c.setCurrentItem(mo156897a(this.f111962j, calendarDate.getDate()));
        if (this.f111969q.booleanValue()) {
            this.f111956d.setCurrentItem(this.f111961i.getHour());
        } else {
            int hourForTwelve = this.f111961i.getHourForTwelve();
            if (hourForTwelve == 0) {
                i = 11;
            } else {
                i = hourForTwelve - 1;
            }
            this.f111956d.setCurrentItem(i);
            this.f111958f.setCurrentItem(this.f111961i.getAMPM());
        }
        this.f111957e.setCurrentItem(this.f111961i.getMinute() / this.f111959g.mo156884b());
    }

    /* renamed from: a */
    public int mo156897a(Date date, Date date2) {
        long time = date2.getTime();
        TimeZone timeZone = this.f111971s;
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        if (timeZone.inDaylightTime(date2)) {
            time += (long) timeZone.getDSTSavings();
        }
        return (int) ((time - date.getTime()) / this.f111966n);
    }

    /* renamed from: a */
    private void m174650a(Context context, ViewGroup viewGroup) {
        this.f111965m = context;
        Boolean valueOf = Boolean.valueOf(C41816b.m166115a().mo150116F().mo150192b());
        this.f111969q = valueOf;
        if (valueOf.booleanValue()) {
            if (this.f111970r.booleanValue()) {
                this.f111964l = LayoutInflater.from(context).inflate(R.layout.mail_view_wheels_work_hour_twentyfour, viewGroup, false);
            } else {
                this.f111964l = LayoutInflater.from(context).inflate(R.layout.mail_view_wheels_date_hour_min_twentyfour, viewGroup, false);
            }
            this.f111955c = (WheelView) this.f111964l.findViewById(R.id.wheel_left);
            this.f111956d = (WheelView) this.f111964l.findViewById(R.id.wheel_middle);
            this.f111957e = (WheelView) this.f111964l.findViewById(R.id.wheel_right);
            this.f111970r.booleanValue();
        } else {
            if (!this.f111970r.booleanValue()) {
                this.f111964l = LayoutInflater.from(context).inflate(R.layout.mail_view_wheels_date_hour_min_twelve, viewGroup, false);
            } else if (C43785p.m173545b()) {
                this.f111964l = LayoutInflater.from(context).inflate(R.layout.mail_view_wheels_work_hour_twelve_eng, viewGroup, false);
            } else {
                this.f111964l = LayoutInflater.from(context).inflate(R.layout.mail_view_wheels_work_hour_twelve_other, viewGroup, false);
            }
            this.f111955c = (WheelView) this.f111964l.findViewById(R.id.wheel_twelve_date);
            if (C43785p.m173545b()) {
                this.f111956d = (WheelView) this.f111964l.findViewById(R.id.wheel_twelve_left);
                this.f111957e = (WheelView) this.f111964l.findViewById(R.id.wheel_twelve_middle);
                this.f111958f = (WheelView) this.f111964l.findViewById(R.id.wheel_twelve_right);
            } else {
                this.f111958f = (WheelView) this.f111964l.findViewById(R.id.wheel_twelve_left);
                this.f111956d = (WheelView) this.f111964l.findViewById(R.id.wheel_twelve_middle);
                this.f111957e = (WheelView) this.f111964l.findViewById(R.id.wheel_twelve_right);
            }
            this.f111958f.setTextColorCenter(this.f111965m.getResources().getColor(R.color.text_title));
            this.f111958f.setCyclic(false);
        }
        if (this.f111970r.booleanValue()) {
            this.f111955c.setCyclic(false);
        } else {
            this.f111955c.setCyclic(true);
        }
        this.f111957e.setTextColorCenter(this.f111965m.getResources().getColor(R.color.text_title));
        this.f111956d.setTextColorCenter(this.f111965m.getResources().getColor(R.color.text_title));
        this.f111955c.setTextColorCenter(this.f111965m.getResources().getColor(R.color.text_title));
        this.f111957e.setDividerType(WheelView.DividerType.FILL);
        this.f111956d.setDividerType(WheelView.DividerType.FILL);
        this.f111955c.setDividerType(WheelView.DividerType.FILL);
        if (!this.f111969q.booleanValue()) {
            this.f111958f.setDividerType(WheelView.DividerType.FILL);
        }
    }

    public C44093i(Context context, ViewGroup viewGroup, AbstractC44081c.AbstractC44083b bVar) {
        this(context, viewGroup, bVar, false);
    }

    public C44093i(Context context, ViewGroup viewGroup, AbstractC44081c.AbstractC44083b bVar, boolean z) {
        this.f111963k = new SimpleDateFormat("yyyy-MM-dd");
        this.f111966n = 86400000;
        this.f111967o = bVar;
        this.f111970r = Boolean.valueOf(z);
        m174650a(context, viewGroup);
        m174652i();
        m174651h();
    }
}
