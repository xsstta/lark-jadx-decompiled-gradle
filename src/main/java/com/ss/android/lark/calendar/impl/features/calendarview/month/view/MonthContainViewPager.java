package com.ss.android.lark.calendar.impl.features.calendarview.month.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.lark.calendar.impl.features.calendarview.month.MonthDiagramModel;
import com.ss.android.lark.calendar.impl.features.calendarview.month.p1485a.AbstractC30947b;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31110f;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitepager.InfiniteViewPager;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;

public class MonthContainViewPager extends InfiniteViewPager {

    /* renamed from: a */
    public AbstractC30947b f77986a;

    /* renamed from: b */
    private final String f77987b;

    /* renamed from: k */
    private int f77988k;

    /* renamed from: a */
    public void mo112076a() {
        ((C30978e) getAdapter()).mo112169c();
    }

    public View$OnTouchListenerC30971c getCenterView() {
        return (View$OnTouchListenerC30971c) ((C30978e) getAdapter()).mo113215d(1);
    }

    public View$OnTouchListenerC30971c getLeftView() {
        return (View$OnTouchListenerC30971c) ((C30978e) getAdapter()).mo113215d(0);
    }

    public View$OnTouchListenerC30971c getRightView() {
        return (View$OnTouchListenerC30971c) ((C30978e) getAdapter()).mo113215d(2);
    }

    /* renamed from: b */
    private void m115558b() {
        setWillNotDraw(false);
        setOffscreenPageLimit(3);
        mo113204a(new AbstractC31110f() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.month.view.MonthContainViewPager.C309621 */

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
            private void m115563a(String str) {
                GeneralHitPoint.m124209a("default_view", str, "month");
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31110f
            /* renamed from: a */
            public void mo108577a(int i) {
                C30978e eVar = (C30978e) MonthContainViewPager.this.getAdapter();
                if (MonthContainViewPager.this.f77986a != null) {
                    if (i == 0) {
                        Log.m165389i("MonthContainViewPager", C32673y.m125369a("monthToRight"));
                        CalendarHitPoint.m124120a("prev");
                        m115563a("next");
                        MonthContainViewPager.this.f77986a.mo112052a(eVar.mo112171d());
                        eVar.mo112170c(0);
                        eVar.mo112161a(2, MonthContainViewPager.this.f77986a.mo112054c());
                        MonthContainViewPager.this.f77986a.mo112053b();
                    } else if (i == 1) {
                        Log.m165389i("MonthContainViewPager", C32673y.m125369a("monthToLeft"));
                        CalendarHitPoint.m124120a("next");
                        m115563a("prev");
                        MonthContainViewPager.this.f77986a.mo112052a(eVar.mo112171d());
                        eVar.mo112170c(2);
                        eVar.mo112161a(0, MonthContainViewPager.this.f77986a.mo112054c());
                        MonthContainViewPager.this.f77986a.mo112051a();
                    }
                }
            }
        });
        setTabMoveDistance(this.f77988k);
        setUpDownArrow(false);
    }

    public void setViewPagerListener(AbstractC30947b bVar) {
        this.f77986a = bVar;
    }

    public MonthContainViewPager(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public void mo112079b(MonthDiagramModel.SettingItemsData dVar) {
        ((C30978e) getAdapter()).mo112168b(dVar);
    }

    /* renamed from: a */
    public void mo112078a(MonthDiagramModel.SettingItemsData dVar) {
        ((C30978e) getAdapter()).mo112164a(dVar);
    }

    public MonthContainViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f77987b = "MonthContainViewPager";
        this.f77988k = 14;
        m115558b();
    }

    /* renamed from: a */
    public void mo112077a(int i, MonthDiagramModel.SettingItemsData dVar) {
        ((C30978e) getAdapter()).mo112162a(i, false, dVar);
    }
}
