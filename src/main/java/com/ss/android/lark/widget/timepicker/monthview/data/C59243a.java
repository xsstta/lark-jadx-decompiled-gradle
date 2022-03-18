package com.ss.android.lark.widget.timepicker.monthview.data;

import com.ss.android.lark.widget.timepicker.monthview.constants.MonthViewAttr;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.timepicker.monthview.data.a */
public class C59243a {

    /* renamed from: a */
    private MonthViewAttr.SelectState f147120a;

    /* renamed from: b */
    private MonthViewAttr.DateState f147121b;

    /* renamed from: c */
    private MonthViewAttr.MonthState f147122c;

    /* renamed from: d */
    private MonthViewAttr.OptionalState f147123d;

    /* renamed from: e */
    private CalendarDate f147124e;

    /* renamed from: f */
    private int f147125f;

    /* renamed from: g */
    private int f147126g;

    /* renamed from: h */
    private List<Integer> f147127h;

    /* renamed from: a */
    public MonthViewAttr.SelectState mo201443a() {
        return this.f147120a;
    }

    /* renamed from: b */
    public MonthViewAttr.DateState mo201449b() {
        return this.f147121b;
    }

    /* renamed from: c */
    public MonthViewAttr.MonthState mo201450c() {
        return this.f147122c;
    }

    /* renamed from: d */
    public CalendarDate mo201451d() {
        return this.f147124e;
    }

    /* renamed from: e */
    public int mo201452e() {
        return this.f147125f;
    }

    /* renamed from: f */
    public int mo201453f() {
        return this.f147126g;
    }

    /* renamed from: g */
    public MonthViewAttr.OptionalState mo201454g() {
        return this.f147123d;
    }

    /* renamed from: h */
    public List<Integer> mo201455h() {
        return this.f147127h;
    }

    /* renamed from: a */
    public void mo201444a(MonthViewAttr.DateState dateState) {
        this.f147121b = dateState;
    }

    /* renamed from: a */
    public void mo201445a(MonthViewAttr.MonthState monthState) {
        this.f147122c = monthState;
    }

    /* renamed from: a */
    public void mo201446a(MonthViewAttr.OptionalState optionalState) {
        this.f147123d = optionalState;
    }

    /* renamed from: a */
    public void mo201447a(MonthViewAttr.SelectState selectState) {
        this.f147120a = selectState;
    }

    /* renamed from: a */
    public void mo201448a(CalendarDate calendarDate) {
        this.f147124e = calendarDate;
    }

    public C59243a(MonthViewAttr.SelectState selectState, MonthViewAttr.DateState dateState, MonthViewAttr.MonthState monthState, CalendarDate calendarDate, int i, int i2) {
        this.f147120a = selectState;
        this.f147121b = dateState;
        this.f147122c = monthState;
        this.f147124e = calendarDate;
        this.f147125f = i;
        this.f147126g = i2;
    }
}
