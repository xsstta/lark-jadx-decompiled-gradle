package com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.AbstractC31910b;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.WheelView;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.adapter.TwelveHourWheelAdapter;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.C31901a;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.C31903c;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.C31904d;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.c */
public class C31912c extends AbstractC31910b {

    /* renamed from: a */
    private WheelView f81508a;

    /* renamed from: b */
    private WheelView f81509b;

    /* renamed from: c */
    private WheelView f81510c;

    /* renamed from: d */
    private WheelView f81511d;

    /* renamed from: e */
    private C31903c f81512e;

    /* renamed from: f */
    private C31901a f81513f;

    /* renamed from: g */
    private CalendarDate f81514g;

    /* renamed from: h */
    private View f81515h;

    /* renamed from: i */
    private Context f81516i;

    /* renamed from: j */
    private AbstractC31910b.AbstractC31911a f81517j;

    /* renamed from: k */
    private String[] f81518k;

    /* renamed from: l */
    private Boolean f81519l;

    /* renamed from: m */
    private Boolean f81520m;

    /* renamed from: n */
    private C31904d f81521n;

    /* renamed from: o */
    private CalendarDate f81522o;

    /* renamed from: e */
    public View mo116528e() {
        return this.f81515h;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m121428i() {
        int i;
        WheelView wheelView = this.f81511d;
        if (wheelView != null) {
            if (wheelView.getCurrentItem() == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f81511d.setCurrentItem(i);
        }
    }

    /* renamed from: a */
    public void mo116522a() {
        this.f81510c.mo116466b();
        this.f81509b.mo116466b();
        this.f81508a.mo116466b();
    }

    /* renamed from: g */
    private void m121426g() {
        C319131 r0 = new AbstractC31917h() {
            /* class com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.C31912c.C319131 */

            @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.AbstractC31917h
            /* renamed from: a */
            public void mo115161a(int i) {
                C31912c.this.mo116525b();
            }
        };
        this.f81510c.setOnItemSelectedListener(r0);
        this.f81509b.setOnItemSelectedListener(r0);
        this.f81508a.setOnItemSelectedListener(r0);
        if (!this.f81519l.booleanValue()) {
            this.f81511d.setOnItemSelectedListener(r0);
            this.f81509b.setLoopChangeListener(new ILoopChangeListener() {
                /* class com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.$$Lambda$c$wd4Rfj4xVSUvazu1crnW56K5Xw */

                @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.ILoopChangeListener
                public final void onChangeLoop() {
                    C31912c.this.m121428i();
                }
            });
        }
    }

    /* renamed from: h */
    private boolean m121427h() {
        if (C30022a.f74882a.languageDependency().mo108249b() || C30022a.f74882a.languageDependency().mo108251d() || C30022a.f74882a.languageDependency().mo108261n()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo116525b() {
        CalendarDate calendarDate = new CalendarDate(this.f81522o);
        calendarDate.setMonthDay(calendarDate.getMonthDay() + this.f81508a.getCurrentItem());
        if (this.f81519l.booleanValue()) {
            calendarDate.setHour(calendarDate.getHour() + this.f81509b.getCurrentItem());
        } else {
            calendarDate.setHour(calendarDate.getHour() + (this.f81511d.getCurrentItem() * 12) + this.f81509b.getCurrentItem());
        }
        calendarDate.setMinute(calendarDate.getMinute() + (this.f81510c.getCurrentItem() * this.f81512e.mo116511c()));
        this.f81517j.mo115475a(calendarDate);
        this.f81514g = calendarDate;
    }

    /* renamed from: c */
    public void mo116526c() {
        this.f81510c.setTextColorCenter(this.f81516i.getResources().getColor(R.color.function_danger_500));
        this.f81509b.setTextColorCenter(this.f81516i.getResources().getColor(R.color.function_danger_500));
        this.f81508a.setTextColorCenter(this.f81516i.getResources().getColor(R.color.function_danger_500));
        if (!this.f81519l.booleanValue()) {
            this.f81511d.setTextColorCenter(this.f81516i.getResources().getColor(R.color.function_danger_500));
            this.f81511d.invalidate();
        }
        this.f81510c.invalidate();
        this.f81509b.invalidate();
        this.f81508a.invalidate();
    }

    /* renamed from: d */
    public void mo116527d() {
        this.f81510c.setTextColorCenter(this.f81516i.getResources().getColor(R.color.text_title));
        this.f81509b.setTextColorCenter(this.f81516i.getResources().getColor(R.color.text_title));
        this.f81508a.setTextColorCenter(this.f81516i.getResources().getColor(R.color.text_title));
        if (!this.f81519l.booleanValue()) {
            this.f81511d.setTextColorCenter(this.f81516i.getResources().getColor(R.color.text_title));
            this.f81511d.invalidate();
        }
        this.f81510c.invalidate();
        this.f81509b.invalidate();
        this.f81508a.invalidate();
    }

    /* renamed from: f */
    private void m121425f() {
        this.f81518k = this.f81516i.getResources().getStringArray(R.array.weeks_short);
        this.f81522o = new CalendarDate(2010, 1, 1, 0, 0, 0);
        if (!this.f81520m.booleanValue()) {
            this.f81521n = new C31904d(this.f81522o, 0, 22000, this.f81518k);
        } else {
            this.f81521n = new C31904d(this.f81522o, 0, 0, this.f81518k, true, "");
        }
        this.f81508a.setDividerType(WheelView.DividerType.FILL);
        this.f81508a.setDividerColor(UDColorUtils.getColor(this.f81516i, R.color.line_divider_default));
        this.f81508a.setAdapter(this.f81521n);
        this.f81509b.setShowTwoFigure(true);
        this.f81509b.setDividerType(WheelView.DividerType.FILL);
        this.f81509b.setDividerColor(UDColorUtils.getColor(this.f81516i, R.color.line_divider_default));
        if (!this.f81519l.booleanValue()) {
            this.f81513f = new C31901a();
            this.f81511d.setDividerType(WheelView.DividerType.FILL);
            this.f81511d.setDividerColor(UDColorUtils.getColor(this.f81516i, R.color.line_divider_default));
            this.f81511d.setAdapter(this.f81513f);
            this.f81509b.setAdapter(new TwelveHourWheelAdapter());
        } else {
            this.f81509b.setAdapter(new C31903c(0, 23));
        }
        this.f81510c.setShowTwoFigure(true);
        this.f81510c.setDividerType(WheelView.DividerType.FILL);
        this.f81510c.setDividerColor(UDColorUtils.getColor(this.f81516i, R.color.line_divider_default));
        C31903c cVar = new C31903c(0, 55, 5);
        this.f81512e = cVar;
        this.f81510c.setAdapter(cVar);
    }

    /* renamed from: a */
    public void mo116523a(int i) {
        WheelView wheelView;
        this.f81508a.setItemVisible(i);
        this.f81509b.setItemVisible(i);
        this.f81510c.setItemVisible(i);
        if (!this.f81519l.booleanValue() && (wheelView = this.f81511d) != null) {
            wheelView.setItemVisible(i);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.AbstractC31910b
    /* renamed from: a */
    public void mo116498a(CalendarDate calendarDate) {
        this.f81514g = calendarDate;
        this.f81508a.setCurrentItem(mo116521a(this.f81522o, calendarDate));
        if (this.f81519l.booleanValue()) {
            this.f81509b.setCurrentItem(this.f81514g.getHour());
        } else {
            this.f81509b.setCurrentItem(this.f81514g.getHourForTwelve());
            this.f81511d.setCurrentItem(this.f81514g.getAMPM());
        }
        int minute = this.f81514g.getMinute() / this.f81512e.mo116511c();
        if (this.f81514g.getMinute() % this.f81512e.mo116511c() != 0) {
            minute++;
        }
        this.f81510c.setCurrentItem(minute);
    }

    /* renamed from: a */
    public void mo116524a(String str) {
        if (this.f81508a != null) {
            C31904d dVar = new C31904d(this.f81522o, 0, 0, this.f81518k, true, str);
            this.f81521n = dVar;
            this.f81508a.setAdapter(dVar);
        }
    }

    /* renamed from: a */
    public int mo116521a(CalendarDate calendarDate, CalendarDate calendarDate2) {
        return calendarDate2.getJulianDay() - calendarDate.getJulianDay();
    }

    /* renamed from: a */
    private void m121424a(Context context, ViewGroup viewGroup) {
        this.f81516i = context;
        Boolean valueOf = Boolean.valueOf(C30022a.f74882a.timeFormatDependency().mo108189a());
        this.f81519l = valueOf;
        if (valueOf.booleanValue()) {
            if (this.f81520m.booleanValue()) {
                this.f81515h = LayoutInflater.from(context).inflate(R.layout.view_wheels_work_hour_twentyfour, viewGroup, false);
            } else {
                this.f81515h = LayoutInflater.from(context).inflate(R.layout.view_wheels_date_hour_min_twentyfour, viewGroup, false);
            }
            this.f81508a = (WheelView) this.f81515h.findViewById(R.id.wheel_left);
            this.f81509b = (WheelView) this.f81515h.findViewById(R.id.wheel_middle);
            this.f81510c = (WheelView) this.f81515h.findViewById(R.id.wheel_right);
            if (!this.f81520m.booleanValue()) {
                UIUtils.setMargins(this.f81508a, UIHelper.dp2px(16.0f), 0, 0, 0);
                UIUtils.setMargins(this.f81510c, 0, 0, UIHelper.dp2px(16.0f), 0);
            }
        } else {
            if (!this.f81520m.booleanValue()) {
                this.f81515h = LayoutInflater.from(context).inflate(R.layout.view_wheels_date_hour_min_twelve, viewGroup, false);
            } else if (m121427h()) {
                this.f81515h = LayoutInflater.from(context).inflate(R.layout.view_wheels_work_hour_twelve_front, viewGroup, false);
            } else {
                this.f81515h = LayoutInflater.from(context).inflate(R.layout.view_wheels_work_hour_twelve_end, viewGroup, false);
            }
            this.f81508a = (WheelView) this.f81515h.findViewById(R.id.wheel_twelve_date);
            if (m121427h()) {
                this.f81511d = (WheelView) this.f81515h.findViewById(R.id.wheel_twelve_left);
                this.f81509b = (WheelView) this.f81515h.findViewById(R.id.wheel_twelve_middle);
                this.f81510c = (WheelView) this.f81515h.findViewById(R.id.wheel_twelve_right);
            } else {
                this.f81509b = (WheelView) this.f81515h.findViewById(R.id.wheel_twelve_left);
                this.f81510c = (WheelView) this.f81515h.findViewById(R.id.wheel_twelve_middle);
                this.f81511d = (WheelView) this.f81515h.findViewById(R.id.wheel_twelve_right);
            }
            this.f81511d.setTextColorCenter(this.f81516i.getResources().getColor(R.color.text_title));
            this.f81511d.setCyclic(false);
        }
        if (this.f81520m.booleanValue()) {
            this.f81508a.setCyclic(false);
        } else {
            this.f81508a.setCyclic(true);
        }
        this.f81510c.setTextColorCenter(this.f81516i.getResources().getColor(R.color.text_title));
        this.f81509b.setTextColorCenter(this.f81516i.getResources().getColor(R.color.text_title));
        this.f81508a.setTextColorCenter(this.f81516i.getResources().getColor(R.color.text_title));
    }

    public C31912c(Context context, ViewGroup viewGroup, AbstractC31910b.AbstractC31911a aVar) {
        this(context, viewGroup, aVar, false);
    }

    public C31912c(Context context, ViewGroup viewGroup, AbstractC31910b.AbstractC31911a aVar, boolean z) {
        this.f81517j = aVar;
        this.f81520m = Boolean.valueOf(z);
        m121424a(context, viewGroup);
        m121426g();
        m121425f();
    }
}
