package com.ss.android.lark.calendar.impl.features.common.widget.calendar.month;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import com.larksuite.framework.utils.C26279i;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31174d;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31175e;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.C31171a;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.viewdata.C31185a;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.viewdata.C31186b;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.viewdata.CalendarAttr;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.utils.C32647d;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.e */
public class C31184e extends C31171a {

    /* renamed from: m */
    protected C31186b[] f78814m = new C31186b[6];

    /* renamed from: n */
    protected AbstractC31175e f78815n;

    /* renamed from: o */
    private final String f78816o = "MonthView";

    /* renamed from: p */
    private double f78817p;

    /* renamed from: q */
    private int f78818q;

    public int getRowNum() {
        return (int) this.f78817p;
    }

    public CalendarDate getMonthStartDate() {
        return this.f78779g;
    }

    public int getSelectRowIndex() {
        return this.f78818q;
    }

    /* renamed from: b */
    public void mo112973b() {
        mo112968a();
        invalidate();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo112968a() {
        int a = C26279i.m95146a(this.f78779g.getYear(), this.f78779g.getMonth() - 1);
        int a2 = C26279i.m95146a(this.f78779g.getYear(), this.f78779g.getMonth());
        int a3 = C32647d.m125272a(this.f78779g.getYear(), this.f78779g.getMonth());
        this.f78817p = Math.ceil((double) (((float) (a3 + a2)) / 7.0f));
        int i = 0;
        for (int i2 = 0; ((double) i2) < this.f78817p; i2++) {
            i = m116429c(a, a2, a3, i, i2);
        }
    }

    /* renamed from: c */
    public void mo112975c() {
        for (int i = 0; ((double) i) < this.f78817p; i++) {
            if (this.f78814m[i] != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= 7) {
                        break;
                    } else if (this.f78814m[i].mo112996a()[i2].mo112982a() == CalendarAttr.SelectState.SELECT) {
                        this.f78814m[i].mo112996a()[i2].mo112987a(CalendarAttr.SelectState.UN_SELECT);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
    }

    public void setOnMonthDayViewSelectListener(AbstractC31175e eVar) {
        this.f78815n = eVar;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m116428a(canvas);
    }

    /* renamed from: a */
    private void m116428a(Canvas canvas) {
        for (int i = 0; ((double) i) < this.f78817p; i++) {
            if (this.f78814m[i] != null) {
                for (int i2 = 0; i2 < 7; i2++) {
                    if (this.f78814m[i].mo112996a()[i2] != null) {
                        this.f78773a.mo112925a(canvas, this.f78814m[i].mo112996a()[i2]);
                    }
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f78777e = motionEvent.getX();
            this.f78778f = motionEvent.getY();
        } else if (action == 1) {
            float x = motionEvent.getX() - this.f78777e;
            float y = motionEvent.getY() - this.f78778f;
            if (Math.abs(x) < this.f78774b && Math.abs(y) < this.f78774b) {
                this.f78815n.mo112939a();
                mo112969a((int) (this.f78777e / ((float) this.f78773a.getCellViewWidth())), (int) (this.f78778f / ((float) this.f78773a.getCellViewHeight())));
                this.f78815n.mo112942b();
            }
        }
        return true;
    }

    public C31184e(Context context, AbstractC31174d dVar) {
        super(context, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo112972a(int i, CalendarDate calendarDate) {
        if (calendarDate.sameDay(this.f78781i)) {
            this.f78818q = i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo112969a(int i, int i2) {
        if (i < 7 && ((double) i2) < this.f78817p) {
            Log.m165389i("MonthView", C32673y.m125369a("listClickTime"));
            C31186b[] bVarArr = this.f78814m;
            if (bVarArr[i2] != null) {
                C31185a aVar = bVarArr[i2].mo112996a()[i];
                this.f78781i = aVar.mo112992e();
                this.f78815n.mo112941a(this.f78781i);
                if (aVar.mo112990c() == CalendarAttr.MonthState.LAST_MONTH) {
                    this.f78815n.mo112940a(-1);
                } else if (aVar.mo112990c() == CalendarAttr.MonthState.NEXT_MONTH) {
                    this.f78815n.mo112940a(1);
                }
            }
            GeneralHitPoint.m124209a("cal_widget", "by_date", "list");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo112970a(int i, int i2, int i3) {
        CalendarDate modifyDay = this.f78779g.modifyDay(i);
        C31186b[] bVarArr = this.f78814m;
        if (bVarArr[i2] == null) {
            bVarArr[i2] = new C31186b(i2);
        }
        if (this.f78814m[i2].mo112996a()[i3] == null) {
            this.f78814m[i2].mo112996a()[i3] = new C31185a(CalendarAttr.SelectState.UN_SELECT, CalendarAttr.DateState.CURRENT_DATE, CalendarAttr.MonthState.CURRENT_MONTH, modifyDay, i2, i3);
        }
        mo112911a(this.f78814m[i2].mo112996a()[i3], modifyDay);
        mo112913b(this.f78814m[i2].mo112996a()[i3], modifyDay);
        mo112914c(this.f78814m[i2].mo112996a()[i3], modifyDay);
        mo112912a(this.f78814m[i2].mo112996a()[i3], CalendarAttr.MonthState.CURRENT_MONTH);
        mo112972a(i2, modifyDay);
        mo112915d(this.f78814m[i2].mo112996a()[i3], modifyDay);
    }

    /* renamed from: c */
    private int m116429c(int i, int i2, int i3, int i4, int i5) {
        for (int i6 = 0; i6 < 7; i6++) {
            int i7 = i6 + (i5 * 7);
            if (i7 >= i3 && i7 < i3 + i2) {
                i4++;
                mo112970a(i4, i5, i6);
            } else if (i7 < i3) {
                mo112974b(i, i3, i5, i6, i7);
            } else if (i7 >= i3 + i2) {
                mo112971a(i2, i3, i5, i6, i7);
            }
        }
        return i4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo112974b(int i, int i2, int i3, int i4, int i5) {
        CalendarDate calendarDate = new CalendarDate(this.f78779g.getYear(), this.f78779g.getMonth() - 1, i - ((i2 - i5) - 1), 0, 0, 0);
        C31186b[] bVarArr = this.f78814m;
        if (bVarArr[i3] == null) {
            bVarArr[i3] = new C31186b(i3);
        }
        if (this.f78814m[i3].mo112996a()[i4] == null) {
            this.f78814m[i3].mo112996a()[i4] = new C31185a(CalendarAttr.SelectState.UN_SELECT, CalendarAttr.DateState.PAST_DATE, CalendarAttr.MonthState.LAST_MONTH, calendarDate, i3, i4);
        }
        mo112911a(this.f78814m[i3].mo112996a()[i4], calendarDate);
        mo112913b(this.f78814m[i3].mo112996a()[i4], calendarDate);
        mo112914c(this.f78814m[i3].mo112996a()[i4], calendarDate);
        mo112912a(this.f78814m[i3].mo112996a()[i4], CalendarAttr.MonthState.LAST_MONTH);
        mo112915d(this.f78814m[i3].mo112996a()[i4], calendarDate);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo112971a(int i, int i2, int i3, int i4, int i5) {
        CalendarDate calendarDate = new CalendarDate(this.f78779g.getYear(), this.f78779g.getMonth() + 1, ((i5 - i2) - i) + 1, 0, 0, 0);
        C31186b[] bVarArr = this.f78814m;
        if (bVarArr[i3] == null) {
            bVarArr[i3] = new C31186b(i3);
        }
        if (this.f78814m[i3].mo112996a()[i4] == null) {
            this.f78814m[i3].mo112996a()[i4] = new C31185a(CalendarAttr.SelectState.UN_SELECT, CalendarAttr.DateState.FUTURE_DATE, CalendarAttr.MonthState.NEXT_MONTH, calendarDate, i3, i4);
        }
        mo112911a(this.f78814m[i3].mo112996a()[i4], calendarDate);
        mo112913b(this.f78814m[i3].mo112996a()[i4], calendarDate);
        mo112914c(this.f78814m[i3].mo112996a()[i4], calendarDate);
        mo112912a(this.f78814m[i3].mo112996a()[i4], CalendarAttr.MonthState.NEXT_MONTH);
        mo112915d(this.f78814m[i3].mo112996a()[i4], calendarDate);
    }
}
