package com.ss.android.lark.calendar.impl.features.common.widget.calendar.week;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
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

/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.calendar.week.c */
public class C31192c extends C31171a {

    /* renamed from: m */
    private final String f78847m = "WeekView";

    /* renamed from: n */
    private C31186b[] f78848n = new C31186b[1];

    /* renamed from: o */
    private double f78849o = 1.0d;

    /* renamed from: p */
    private int f78850p;

    /* renamed from: q */
    private AbstractC31175e f78851q;

    /* renamed from: a */
    public void mo113015a() {
        m116492c();
        invalidate();
    }

    /* renamed from: b */
    public void mo113016b() {
        for (int i = 0; ((double) i) < this.f78849o; i++) {
            if (this.f78848n[i] != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= 7) {
                        break;
                    } else if (this.f78848n[i].mo112996a()[i2].mo112982a() == CalendarAttr.SelectState.SELECT) {
                        this.f78848n[i].mo112996a()[i2].mo112987a(CalendarAttr.SelectState.UN_SELECT);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private void m116492c() {
        CalendarAttr.MonthState monthState;
        CalendarDate a = C32647d.m125274a(this.f78779g);
        for (int i = 6; i >= 0; i--) {
            C31186b[] bVarArr = this.f78848n;
            int i2 = this.f78850p;
            if (bVarArr[i2] == null) {
                bVarArr[i2] = new C31186b(i2);
            }
            if (this.f78848n[this.f78850p].mo112996a()[i] == null) {
                this.f78848n[this.f78850p].mo112996a()[i] = new C31185a(CalendarAttr.SelectState.UN_SELECT, CalendarAttr.DateState.CURRENT_DATE, CalendarAttr.MonthState.CURRENT_MONTH, a, this.f78850p, i);
            }
            mo112911a(this.f78848n[this.f78850p].mo112996a()[i], a);
            mo112913b(this.f78848n[this.f78850p].mo112996a()[i], a);
            mo112914c(this.f78848n[this.f78850p].mo112996a()[i], a);
            if (a.getMonth() < this.f78781i.getMonth()) {
                monthState = CalendarAttr.MonthState.LAST_MONTH;
            } else if (a.getMonth() == this.f78781i.getMonth()) {
                monthState = CalendarAttr.MonthState.CURRENT_MONTH;
            } else {
                monthState = CalendarAttr.MonthState.NEXT_MONTH;
            }
            mo112912a(this.f78848n[this.f78850p].mo112996a()[i], monthState);
            mo112915d(this.f78848n[this.f78850p].mo112996a()[i], a);
            a = a.addDay(-1);
        }
    }

    public void setOnMonthDayViewSelectListener(AbstractC31175e eVar) {
        this.f78851q = eVar;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m116491a(canvas);
    }

    /* renamed from: a */
    private void m116491a(Canvas canvas) {
        for (int i = 0; ((double) i) < this.f78849o; i++) {
            if (this.f78848n[i] != null) {
                for (int i2 = 0; i2 < 7; i2++) {
                    if (this.f78848n[i].mo112996a()[i2] != null) {
                        this.f78773a.mo112925a(canvas, this.f78848n[i].mo112996a()[i2]);
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
                this.f78851q.mo112939a();
                m116490a((int) (this.f78777e / ((float) this.f78773a.getCellViewWidth())), (int) (this.f78778f / ((float) this.f78773a.getCellViewHeight())));
                this.f78851q.mo112942b();
            }
        }
        return true;
    }

    public C31192c(Context context, AbstractC31174d dVar) {
        super(context, dVar);
    }

    /* renamed from: a */
    private void m116490a(int i, int i2) {
        if (i < 7 && ((double) i2) < this.f78849o) {
            Log.m165389i("WeekView", C32673y.m125369a("listClickTime"));
            C31186b[] bVarArr = this.f78848n;
            if (bVarArr[i2] != null) {
                C31185a aVar = bVarArr[i2].mo112996a()[i];
                this.f78781i = aVar.mo112992e();
                this.f78851q.mo112941a(this.f78781i);
                if (aVar.mo112990c() == CalendarAttr.MonthState.LAST_MONTH) {
                    this.f78851q.mo112940a(-1);
                } else if (aVar.mo112990c() == CalendarAttr.MonthState.NEXT_MONTH) {
                    this.f78851q.mo112940a(1);
                }
            }
            GeneralHitPoint.m124209a("cal_widget", "by_date", "list");
        }
    }
}
