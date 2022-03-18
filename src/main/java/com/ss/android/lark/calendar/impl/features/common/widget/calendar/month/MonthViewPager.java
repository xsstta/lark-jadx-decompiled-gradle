package com.ss.android.lark.calendar.impl.features.common.widget.calendar.month;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31109e;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31110f;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.AbstractC31169a;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitepager.InfiniteViewPager;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.utils.C32647d;

public class MonthViewPager extends InfiniteViewPager {

    /* renamed from: a */
    public AbstractC31169a f78804a;

    public C31184e getCenterView() {
        return (C31184e) ((C31181c) getAdapter()).mo113215d(1);
    }

    public C31184e getLeftView() {
        return (C31184e) ((C31181c) getAdapter()).mo113215d(0);
    }

    public C31184e getRightView() {
        return (C31184e) ((C31181c) getAdapter()).mo113215d(2);
    }

    public int getRowIndex() {
        return getCenterView().getSelectRowIndex();
    }

    public int getRowNum() {
        return getCenterView().getRowNum();
    }

    /* renamed from: a */
    private void m116390a() {
        setWillNotDraw(false);
        setOffscreenPageLimit(3);
        mo113204a(new AbstractC31110f() {
            /* class com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.MonthViewPager.C311771 */

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
            private void m116393a(String str) {
                GeneralHitPoint.m124209a("cal_widget", str, "list");
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31110f
            /* renamed from: a */
            public void mo108577a(int i) {
                C31181c cVar = (C31181c) MonthViewPager.this.getAdapter();
                C31184e eVar = (C31184e) cVar.mo113215d(0);
                C31184e eVar2 = (C31184e) cVar.mo113215d(2);
                if (i == 0) {
                    m116393a("cal_widget_next");
                    CalendarDate d = cVar.mo112964d();
                    if (MonthViewPager.this.f78804a != null) {
                        MonthViewPager.this.f78804a.mo111725a(d);
                        MonthViewPager.this.f78804a.mo111726b();
                    }
                    CalendarDate d2 = cVar.mo112964d();
                    if (eVar2 != null) {
                        eVar2.setSeedDate(d2);
                        eVar2.setStartDate(C32647d.m125279b(d2));
                        eVar2.setEndDate(C32647d.m125281c(d2));
                    }
                    cVar.mo112965e();
                } else if (i == 1) {
                    m116393a("cal_widget_prev");
                    CalendarDate c = cVar.mo112962c();
                    if (MonthViewPager.this.f78804a != null) {
                        MonthViewPager.this.f78804a.mo111725a(c);
                        MonthViewPager.this.f78804a.mo111724a();
                    }
                    CalendarDate c2 = cVar.mo112962c();
                    if (eVar != null) {
                        eVar.setSeedDate(c2);
                        eVar.setStartDate(C32647d.m125279b(c2));
                        eVar.setEndDate(C32647d.m125281c(c2));
                    }
                    cVar.mo112965e();
                }
            }
        });
        setTabMoveDistance(30);
        setUpDownArrow(true);
    }

    public void setViewPageListener(AbstractC31169a aVar) {
        this.f78804a = aVar;
    }

    public MonthViewPager(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public void mo112950b(int i) {
        C31181c cVar = (C31181c) getAdapter();
        if (cVar != null) {
            cVar.mo112963c(i);
        }
    }

    /* renamed from: a */
    public void mo112949a(final int i) {
        int i2;
        if (i > 0) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        mo113203a(i2, false);
        setOnSmoothScrollFinishListener(new AbstractC31109e() {
            /* class com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.MonthViewPager.C311782 */

            @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31109e
            /* renamed from: a */
            public void mo111736a() {
                MonthViewPager.this.mo112950b(0);
                MonthViewPager.this.mo112950b(2);
                if (MonthViewPager.this.f78804a != null) {
                    int i = i;
                    if (i < 0) {
                        MonthViewPager.this.f78804a.mo111724a();
                    } else if (i > 0) {
                        MonthViewPager.this.f78804a.mo111726b();
                    }
                }
            }
        });
    }

    public MonthViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m116390a();
    }
}
