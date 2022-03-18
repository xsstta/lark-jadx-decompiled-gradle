package com.ss.android.lark.widget.timepicker.monthview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.lark.widget.timepicker.monthview.constants.MonthViewAttr;
import com.ss.android.lark.widget.timepicker.monthview.data.CalendarDate;
import com.ss.android.lark.widget.timepicker.monthview.p2980a.AbstractC59231b;
import com.ss.android.lark.widget.timepicker.monthview.p2980a.AbstractC59233d;
import com.ss.android.lark.widget.timepicker.monthview.p2981b.C59235a;

public class MonthViewPager extends InfiniteViewPager {

    /* renamed from: g */
    public AbstractC59231b f147096g;

    public C59249h getCenterView() {
        return (C59249h) ((C59247g) getAdapter()).mo201392a(1);
    }

    public C59249h getLeftView() {
        return (C59249h) ((C59247g) getAdapter()).mo201392a(0);
    }

    public C59249h getRightView() {
        return (C59249h) ((C59247g) getAdapter()).mo201392a(2);
    }

    public int getRowNum() {
        return getCenterView().getRowNum();
    }

    /* renamed from: a */
    private void m230037a() {
        setWillNotDraw(false);
        setOffscreenPageLimit(3);
        mo201313a(new AbstractC59250j() {
            /* class com.ss.android.lark.widget.timepicker.monthview.MonthViewPager.C592271 */

            @Override // com.ss.android.lark.widget.timepicker.monthview.AbstractC59250j
            /* renamed from: a */
            public void mo201355a() {
            }

            @Override // com.ss.android.lark.widget.timepicker.monthview.AbstractC59250j
            /* renamed from: a */
            public void mo201357a(View view, View view2) {
            }

            @Override // com.ss.android.lark.widget.timepicker.monthview.AbstractC59250j
            /* renamed from: b */
            public void mo201358b(int i) {
            }

            @Override // com.ss.android.lark.widget.timepicker.monthview.AbstractC59250j
            /* renamed from: b */
            public void mo201359b(View view, View view2) {
            }

            @Override // com.ss.android.lark.widget.timepicker.monthview.AbstractC59250j
            /* renamed from: a */
            public void mo201356a(int i) {
                C59247g gVar = (C59247g) MonthViewPager.this.getAdapter();
                C59249h hVar = (C59249h) gVar.mo201392a(0);
                C59249h hVar2 = (C59249h) gVar.mo201392a(2);
                if (i == 0) {
                    CalendarDate h = gVar.mo201466h();
                    if (MonthViewPager.this.f147096g != null) {
                        MonthViewPager.this.f147096g.mo201334a(h);
                        MonthViewPager.this.f147096g.mo201335b();
                    }
                    CalendarDate h2 = gVar.mo201466h();
                    if (hVar2 != null) {
                        hVar2.setSeedDate(h2);
                        hVar2.setStartDate(C59235a.m230062a(h2));
                        hVar2.setEndDate(C59235a.m230064b(h2));
                    }
                    gVar.mo201467i();
                } else if (i == 1) {
                    CalendarDate g = gVar.mo201465g();
                    if (MonthViewPager.this.f147096g != null) {
                        MonthViewPager.this.f147096g.mo201334a(g);
                        MonthViewPager.this.f147096g.mo201333a();
                    }
                    CalendarDate g2 = gVar.mo201465g();
                    if (hVar != null) {
                        hVar.setSeedDate(g2);
                        hVar.setStartDate(C59235a.m230062a(g2));
                        hVar.setEndDate(C59235a.m230064b(g2));
                    }
                    gVar.mo201467i();
                }
            }
        });
    }

    public void setViewPageListener(AbstractC59231b bVar) {
        this.f147096g = bVar;
    }

    public MonthViewPager(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public void mo201349b(int i) {
        C59247g gVar = (C59247g) getAdapter();
        if (gVar != null) {
            gVar.mo201462d(i);
        }
    }

    /* renamed from: a */
    public void mo201346a(final int i) {
        int i2;
        if (i > 0) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        mo201312a(i2, false);
        setOnSmoothScrollFinishListener(new AbstractC59233d() {
            /* class com.ss.android.lark.widget.timepicker.monthview.MonthViewPager.C592282 */

            @Override // com.ss.android.lark.widget.timepicker.monthview.p2980a.AbstractC59233d
            /* renamed from: a */
            public void mo201360a() {
                MonthViewPager.this.mo201349b(0);
                MonthViewPager.this.mo201349b(2);
                int i = i;
                if (i < 0) {
                    MonthViewPager.this.f147096g.mo201333a();
                } else if (i > 0) {
                    MonthViewPager.this.f147096g.mo201335b();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo201347a(CalendarDate calendarDate) {
        int monthDiff = calendarDate.monthDiff(getCenterView().getSelectDate());
        if (monthDiff > 0) {
            getRightView().setSelectDate(calendarDate);
            getRightView().mo201468a();
            mo201346a(monthDiff);
        } else if (monthDiff < 0) {
            getLeftView().setSelectDate(calendarDate);
            getLeftView().mo201468a();
            mo201346a(monthDiff);
        } else {
            getCenterView().setSelectDate(calendarDate);
            getCenterView().mo201468a();
        }
    }

    public MonthViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m230037a();
    }

    /* renamed from: a */
    public void mo201348a(CalendarDate calendarDate, CalendarDate calendarDate2, CalendarDate calendarDate3, MonthViewAttr.SelectTimeType selectTimeType) {
        getRightView().setSelectDate(calendarDate3);
        getLeftView().setSelectDate(calendarDate3);
        getCenterView().setSelectDate(calendarDate3);
        getRightView().mo201469a(calendarDate, calendarDate2, selectTimeType);
        getLeftView().mo201469a(calendarDate, calendarDate2, selectTimeType);
        getCenterView().mo201469a(calendarDate, calendarDate2, selectTimeType);
    }
}
