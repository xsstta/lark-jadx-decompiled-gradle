package com.ss.android.lark.widget.timepicker.monthview;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import com.ss.android.lark.widget.timepicker.monthview.data.CalendarDate;
import com.ss.android.lark.widget.timepicker.monthview.p2980a.AbstractC59230a;
import com.ss.android.lark.widget.timepicker.monthview.p2980a.AbstractC59232c;
import com.ss.android.lark.widget.timepicker.monthview.p2981b.C59235a;

/* renamed from: com.ss.android.lark.widget.timepicker.monthview.g */
public class C59247g extends AbstractC59242d {

    /* renamed from: b */
    public AbstractC59230a f147134b;

    /* renamed from: c */
    private Context f147135c;

    /* renamed from: d */
    private AbstractC59234b f147136d;

    /* renamed from: e */
    private AbstractC59229a f147137e;

    @Override // com.ss.android.lark.widget.timepicker.monthview.AbstractC59242d
    /* renamed from: c */
    public void mo201397c(int i) {
    }

    /* renamed from: f */
    public CalendarDate mo201464f() {
        return this.f147136d.mo201330b();
    }

    /* renamed from: e */
    public void mo201463e() {
        for (int i = 0; i < getCount(); i++) {
            ((C59249h) mo201392a(i)).mo201470b();
        }
    }

    /* renamed from: g */
    public CalendarDate mo201465g() {
        CalendarDate modifyMonth = mo201464f().modifyMonth(-1);
        modifyMonth.setMonthDay(1);
        return modifyMonth.moveToDayStart();
    }

    /* renamed from: h */
    public CalendarDate mo201466h() {
        CalendarDate modifyMonth = mo201464f().modifyMonth(1);
        modifyMonth.setMonthDay(1);
        return modifyMonth.moveToDayStart();
    }

    /* renamed from: i */
    public void mo201467i() {
        if (mo201395b()) {
            for (int i = 0; i < getCount(); i++) {
                C59249h hVar = (C59249h) mo201392a(i);
                hVar.setSelectDate(mo201464f());
                hVar.mo201468a();
            }
        }
    }

    /* renamed from: a */
    public void mo201461a(AbstractC59230a aVar) {
        this.f147134b = aVar;
    }

    @Override // com.ss.android.lark.widget.timepicker.monthview.AbstractC59242d
    /* renamed from: b */
    public View mo201394b(int i) {
        C59249h hVar = new C59249h(this.f147135c, this.f147137e);
        m230110a(hVar, i);
        return hVar;
    }

    /* renamed from: d */
    public void mo201462d(int i) {
        if (i == 0) {
            C59249h hVar = (C59249h) mo201392a(0);
            CalendarDate f = mo201464f();
            CalendarDate g = mo201465g();
            if (hVar != null) {
                hVar.setSeedDate(g);
                hVar.setStartDate(C59235a.m230062a(g));
                hVar.setEndDate(C59235a.m230064b(g));
                hVar.setSelectDate(f);
                hVar.mo201468a();
            }
        } else if (i == 2) {
            C59249h hVar2 = (C59249h) mo201392a(2);
            CalendarDate f2 = mo201464f();
            CalendarDate h = mo201466h();
            if (hVar2 != null) {
                hVar2.setSeedDate(h);
                hVar2.setStartDate(C59235a.m230062a(h));
                hVar2.setEndDate(C59235a.m230064b(h));
                hVar2.setSelectDate(f2);
                hVar2.mo201468a();
            }
        }
    }

    public C59247g(Context context, AbstractC59234b bVar) {
        super(context);
        this.f147135c = context;
        C59246f fVar = new C59246f(context);
        this.f147137e = fVar;
        fVar.setTypeFace(Typeface.createFromAsset(this.f147135c.getAssets(), "fonts/DINAlternateBold.ttf"));
        this.f147136d = bVar;
        mo201393a();
    }

    /* renamed from: a */
    private void m230110a(C59249h hVar, int i) {
        int i2;
        CalendarDate b = this.f147136d.mo201330b();
        if (i > 0) {
            i2 = i - 1;
        } else {
            i2 = -1;
        }
        CalendarDate modifyMonth = b.modifyMonth(i2);
        modifyMonth.setMonthDay(1);
        hVar.setSeedDate(modifyMonth);
        hVar.setStartDate(C59235a.m230062a(modifyMonth));
        hVar.setEndDate(C59235a.m230064b(modifyMonth));
        hVar.setSelectDate(mo201464f());
        hVar.setCurrentDate(this.f147136d.mo201329a());
        hVar.setOnMonthDayViewSelectListener(new AbstractC59232c() {
            /* class com.ss.android.lark.widget.timepicker.monthview.C59247g.C592481 */

            @Override // com.ss.android.lark.widget.timepicker.monthview.p2980a.AbstractC59232c
            /* renamed from: a */
            public void mo201365a() {
                C59247g.this.mo201463e();
            }

            @Override // com.ss.android.lark.widget.timepicker.monthview.p2980a.AbstractC59232c
            /* renamed from: b */
            public void mo201368b() {
                C59247g.this.mo201467i();
            }

            @Override // com.ss.android.lark.widget.timepicker.monthview.p2980a.AbstractC59232c
            /* renamed from: a */
            public void mo201366a(int i) {
                C59247g.this.f147134b.mo201331a(i);
            }

            @Override // com.ss.android.lark.widget.timepicker.monthview.p2980a.AbstractC59232c
            /* renamed from: a */
            public void mo201367a(CalendarDate calendarDate) {
                C59247g.this.f147134b.mo201332a(calendarDate);
            }
        });
        hVar.mo201468a();
    }
}
