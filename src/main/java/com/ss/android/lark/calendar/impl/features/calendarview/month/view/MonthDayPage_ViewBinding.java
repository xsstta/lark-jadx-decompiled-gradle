package com.ss.android.lark.calendar.impl.features.calendarview.month.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class MonthDayPage_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MonthDayPage f77994a;

    /* renamed from: b */
    private View f77995b;

    @Override // butterknife.Unbinder
    public void unbind() {
        MonthDayPage monthDayPage = this.f77994a;
        if (monthDayPage != null) {
            this.f77994a = null;
            monthDayPage.mRecyclerView = null;
            monthDayPage.mNoEventZone = null;
            monthDayPage.mAppendEvent = null;
            this.f77995b.setOnClickListener(null);
            this.f77995b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MonthDayPage_ViewBinding(final MonthDayPage monthDayPage, View view) {
        this.f77994a = monthDayPage;
        monthDayPage.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.month_day_list, "field 'mRecyclerView'", RecyclerView.class);
        monthDayPage.mNoEventZone = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ll_month_day_no_event, "field 'mNoEventZone'", ViewGroup.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.tv_append_event, "field 'mAppendEvent' and method 'openAppendEvent'");
        monthDayPage.mAppendEvent = (TextView) Utils.castView(findRequiredView, R.id.tv_append_event, "field 'mAppendEvent'", TextView.class);
        this.f77995b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.month.view.MonthDayPage_ViewBinding.C309631 */

            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View view) {
                monthDayPage.openAppendEvent();
            }
        });
    }
}
