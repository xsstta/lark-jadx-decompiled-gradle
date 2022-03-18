package com.ss.android.lark.widget.timepicker.monthview;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import com.larksuite.framework.utils.C26279i;
import com.ss.android.lark.widget.timepicker.monthview.constants.MonthViewAttr;
import com.ss.android.lark.widget.timepicker.monthview.data.C59243a;
import com.ss.android.lark.widget.timepicker.monthview.data.C59244b;
import com.ss.android.lark.widget.timepicker.monthview.data.CalendarDate;
import com.ss.android.lark.widget.timepicker.monthview.p2980a.AbstractC59232c;
import com.ss.android.lark.widget.timepicker.monthview.p2981b.C59235a;
import com.ss.android.lark.widget.timepicker.monthview.p2982c.C59240a;
import java.util.Date;

/* renamed from: com.ss.android.lark.widget.timepicker.monthview.h */
public class C59249h extends C59240a {

    /* renamed from: l */
    private C59244b[] f147139l = new C59244b[6];

    /* renamed from: m */
    private double f147140m;

    /* renamed from: n */
    private int f147141n;

    /* renamed from: o */
    private AbstractC59232c f147142o;

    /* renamed from: p */
    private CalendarDate f147143p = new CalendarDate(new Date(0));

    /* renamed from: q */
    private CalendarDate f147144q = new CalendarDate();

    /* renamed from: r */
    private MonthViewAttr.SelectTimeType f147145r = MonthViewAttr.SelectTimeType.START_TIME;

    /* renamed from: s */
    private CalendarDate f147146s = new CalendarDate();

    public int getRowNum() {
        return (int) this.f147140m;
    }

    public CalendarDate getSelectDate() {
        return this.f147110i;
    }

    /* renamed from: a */
    public void mo201468a() {
        m230131c();
        invalidate();
    }

    /* renamed from: b */
    public void mo201470b() {
        for (int i = 0; ((double) i) < this.f147140m; i++) {
            if (this.f147139l[i] != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= 7) {
                        break;
                    } else if (this.f147139l[i].mo201456a()[i2].mo201443a() == MonthViewAttr.SelectState.SELECT) {
                        this.f147139l[i].mo201456a()[i2].mo201447a(MonthViewAttr.SelectState.UN_SELECT);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private void m230131c() {
        int a = C26279i.m95146a(this.f147108g.getYear(), this.f147108g.getMonth() - 1);
        int a2 = C26279i.m95146a(this.f147108g.getYear(), this.f147108g.getMonth());
        int a3 = C59235a.m230061a(this.f147108g.getYear(), this.f147108g.getMonth());
        this.f147140m = Math.ceil((double) (((float) (a3 + a2)) / 7.0f));
        int i = 0;
        for (int i2 = 0; ((double) i2) < this.f147140m; i2++) {
            i = m230124a(a, a2, a3, i, i2);
        }
    }

    public void setOnMonthDayViewSelectListener(AbstractC59232c cVar) {
        this.f147142o = cVar;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m230127a(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f147106e = motionEvent.getX();
            this.f147107f = motionEvent.getY();
        } else if (action == 1) {
            float x = motionEvent.getX() - this.f147106e;
            float y = motionEvent.getY() - this.f147107f;
            if (Math.abs(x) < this.f147103b && Math.abs(y) < this.f147103b) {
                if (this.f147105d == 0 || this.f147104c == 0) {
                    this.f147104c = this.f147102a.getCellViewHeight();
                    this.f147105d = getWidth() / 7;
                }
                int i = (int) (this.f147106e / ((float) this.f147105d));
                int i2 = (int) (this.f147107f / ((float) this.f147104c));
                if (m230128a(i, i2)) {
                    this.f147142o.mo201365a();
                    m230129b(i, i2);
                    this.f147142o.mo201368b();
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    private void m230127a(Canvas canvas) {
        for (int i = 0; ((double) i) < this.f147140m; i++) {
            if (this.f147139l[i] != null) {
                for (int i2 = 0; i2 < 7; i2++) {
                    if (this.f147139l[i].mo201456a()[i2] != null) {
                        this.f147102a.mo201361a(canvas, this.f147139l[i].mo201456a()[i2]);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m230126a(int i, CalendarDate calendarDate) {
        if (calendarDate.sameDay(this.f147110i)) {
            this.f147141n = i;
        }
    }

    public C59249h(Context context, AbstractC59229a aVar) {
        super(context, aVar);
    }

    /* renamed from: b */
    private void m230129b(int i, int i2) {
        if (i < 7 && ((double) i2) < this.f147140m) {
            C59244b[] bVarArr = this.f147139l;
            if (bVarArr[i2] != null) {
                C59243a aVar = bVarArr[i2].mo201456a()[i];
                this.f147110i = aVar.mo201451d();
                this.f147142o.mo201367a(this.f147110i);
                if (aVar.mo201450c() == MonthViewAttr.MonthState.LAST_MONTH) {
                    this.f147142o.mo201366a(-1);
                } else if (aVar.mo201450c() == MonthViewAttr.MonthState.NEXT_MONTH) {
                    this.f147142o.mo201366a(1);
                }
            }
        }
    }

    /* renamed from: d */
    private void m230133d(C59243a aVar, CalendarDate calendarDate) {
        if (this.f147145r == MonthViewAttr.SelectTimeType.START_TIME) {
            if (calendarDate.getJulianDay() > this.f147144q.getJulianDay()) {
                aVar.mo201446a(MonthViewAttr.OptionalState.NOT_OPTIONAL);
            } else {
                aVar.mo201446a(MonthViewAttr.OptionalState.OPTIONAL);
            }
        } else if (this.f147145r != MonthViewAttr.SelectTimeType.END_TIME) {
        } else {
            if (calendarDate.getJulianDay() > this.f147146s.getJulianDay() || calendarDate.getJulianDay() < this.f147143p.getJulianDay()) {
                aVar.mo201446a(MonthViewAttr.OptionalState.NOT_OPTIONAL);
            } else {
                aVar.mo201446a(MonthViewAttr.OptionalState.OPTIONAL);
            }
        }
    }

    /* renamed from: a */
    private boolean m230128a(int i, int i2) {
        if (i >= 7 || ((double) i2) >= this.f147140m) {
            return false;
        }
        C59244b[] bVarArr = this.f147139l;
        if (bVarArr[i2] == null || bVarArr[i2].mo201456a()[i].mo201454g() == MonthViewAttr.OptionalState.NOT_OPTIONAL) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo201469a(CalendarDate calendarDate, CalendarDate calendarDate2, MonthViewAttr.SelectTimeType selectTimeType) {
        this.f147143p = calendarDate;
        this.f147144q = calendarDate2;
        this.f147145r = selectTimeType;
        m230131c();
        invalidate();
    }

    /* renamed from: a */
    private void m230125a(int i, int i2, int i3) {
        CalendarDate modifyDay = this.f147108g.modifyDay(i);
        C59244b[] bVarArr = this.f147139l;
        if (bVarArr[i2] == null) {
            bVarArr[i2] = new C59244b(i2);
        }
        if (this.f147139l[i2].mo201456a()[i3] == null) {
            this.f147139l[i2].mo201456a()[i3] = new C59243a(MonthViewAttr.SelectState.UN_SELECT, MonthViewAttr.DateState.CURRENT_DATE, MonthViewAttr.MonthState.CURRENT_MONTH, modifyDay, i2, i3);
        }
        m230133d(this.f147139l[i2].mo201456a()[i3], modifyDay);
        mo201379a(this.f147139l[i2].mo201456a()[i3], modifyDay);
        mo201380b(this.f147139l[i2].mo201456a()[i3], modifyDay);
        mo201381c(this.f147139l[i2].mo201456a()[i3], modifyDay);
        mo201378a(this.f147139l[i2].mo201456a()[i3], MonthViewAttr.MonthState.CURRENT_MONTH);
        m230126a(i2, modifyDay);
    }

    /* renamed from: a */
    private int m230124a(int i, int i2, int i3, int i4, int i5) {
        for (int i6 = 0; i6 < 7; i6++) {
            int i7 = i6 + (i5 * 7);
            if (i7 >= i3 && i7 < i3 + i2) {
                i4++;
                m230125a(i4, i5, i6);
            } else if (i7 < i3) {
                m230132c(i, i3, i5, i6, i7);
            } else if (i7 >= i3 + i2) {
                m230130b(i2, i3, i5, i6, i7);
            }
        }
        return i4;
    }

    /* renamed from: b */
    private void m230130b(int i, int i2, int i3, int i4, int i5) {
        CalendarDate calendarDate = new CalendarDate(this.f147108g.getYear(), this.f147108g.getMonth() + 1, ((i5 - i2) - i) + 1, 0, 0, 0);
        C59244b[] bVarArr = this.f147139l;
        if (bVarArr[i3] == null) {
            bVarArr[i3] = new C59244b(i3);
        }
        if (this.f147139l[i3].mo201456a()[i4] == null) {
            this.f147139l[i3].mo201456a()[i4] = new C59243a(MonthViewAttr.SelectState.UN_SELECT, MonthViewAttr.DateState.FUTURE_DATE, MonthViewAttr.MonthState.NEXT_MONTH, calendarDate, i3, i4);
        }
        m230133d(this.f147139l[i3].mo201456a()[i4], calendarDate);
        mo201379a(this.f147139l[i3].mo201456a()[i4], calendarDate);
        mo201380b(this.f147139l[i3].mo201456a()[i4], calendarDate);
        mo201381c(this.f147139l[i3].mo201456a()[i4], calendarDate);
        mo201378a(this.f147139l[i3].mo201456a()[i4], MonthViewAttr.MonthState.NEXT_MONTH);
    }

    /* renamed from: c */
    private void m230132c(int i, int i2, int i3, int i4, int i5) {
        CalendarDate calendarDate = new CalendarDate(this.f147108g.getYear(), this.f147108g.getMonth() - 1, i - ((i2 - i5) - 1), 0, 0, 0);
        C59244b[] bVarArr = this.f147139l;
        if (bVarArr[i3] == null) {
            bVarArr[i3] = new C59244b(i3);
        }
        if (this.f147139l[i3].mo201456a()[i4] == null) {
            this.f147139l[i3].mo201456a()[i4] = new C59243a(MonthViewAttr.SelectState.UN_SELECT, MonthViewAttr.DateState.PAST_DATE, MonthViewAttr.MonthState.LAST_MONTH, calendarDate, i3, i4);
        }
        m230133d(this.f147139l[i3].mo201456a()[i4], calendarDate);
        mo201379a(this.f147139l[i3].mo201456a()[i4], calendarDate);
        mo201380b(this.f147139l[i3].mo201456a()[i4], calendarDate);
        mo201381c(this.f147139l[i3].mo201456a()[i4], calendarDate);
        mo201378a(this.f147139l[i3].mo201456a()[i4], MonthViewAttr.MonthState.LAST_MONTH);
    }
}
