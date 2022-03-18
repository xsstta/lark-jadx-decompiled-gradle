package com.ss.android.lark.calendar.impl.features.common.widget.calendar.week;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31110f;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.AbstractC31169a;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitepager.InfiniteViewPager;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.utils.C32647d;

public class WeekViewPager extends InfiniteViewPager {

    /* renamed from: a */
    public AbstractC31169a f78840a;

    public C31192c getCenterView() {
        return (C31192c) ((C31189a) getAdapter()).mo113215d(1);
    }

    /* renamed from: a */
    private void m116462a() {
        setOffscreenPageLimit(3);
        mo113204a(new AbstractC31110f() {
            /* class com.ss.android.lark.calendar.impl.features.common.widget.calendar.week.WeekViewPager.C311881 */

            @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31110f
            /* renamed from: a */
            public void mo108576a() {
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31110f
            /* renamed from: a */
            public void mo108578a(View view, View view2) {
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31110f
            /* renamed from: b */
            public void mo112084b(int i) {
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31110f
            /* renamed from: b */
            public void mo108581b(View view, View view2) {
            }

            /* renamed from: a */
            private void m116463a(String str) {
                GeneralHitPoint.m124209a("cal_widget", str, "list");
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31110f
            /* renamed from: a */
            public void mo108577a(int i) {
                C31189a aVar = (C31189a) WeekViewPager.this.getAdapter();
                if (i == 0) {
                    m116463a("cal_widget_next");
                    C31192c cVar = (C31192c) aVar.mo113215d(2);
                    CalendarDate c = aVar.mo113010c();
                    if (WeekViewPager.this.f78840a != null) {
                        WeekViewPager.this.f78840a.mo111725a(c);
                        WeekViewPager.this.f78840a.mo111726b();
                    }
                    CalendarDate c2 = aVar.mo113010c();
                    if (cVar != null) {
                        cVar.setSeedDate(c2);
                        cVar.setStartDate(C32647d.m125283d(c2));
                        cVar.setEndDate(C32647d.m125285e(c2));
                    }
                    aVar.mo113012e();
                } else if (i == 1) {
                    m116463a("cal_widget_prev");
                    C31192c cVar2 = (C31192c) aVar.mo113215d(0);
                    CalendarDate b = aVar.mo113009b();
                    if (WeekViewPager.this.f78840a != null) {
                        WeekViewPager.this.f78840a.mo111725a(b);
                        WeekViewPager.this.f78840a.mo111724a();
                    }
                    CalendarDate b2 = aVar.mo113009b();
                    if (cVar2 != null) {
                        cVar2.setSeedDate(b2);
                        cVar2.setStartDate(C32647d.m125283d(b2));
                        cVar2.setEndDate(C32647d.m125285e(b2));
                    }
                    aVar.mo113012e();
                }
            }
        });
        setTabMoveDistance(7);
        setUpDownArrow(true);
    }

    public void setViewPageListener(AbstractC31169a aVar) {
        this.f78840a = aVar;
    }

    public WeekViewPager(Context context) {
        this(context, null);
    }

    public WeekViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m116462a();
    }
}
