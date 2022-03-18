package com.ss.android.lark.calendar.impl.features.search.calendar.vh;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class CalendarListSubHeaderViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CalendarListSubHeaderViewHolder f82810a;

    @Override // butterknife.Unbinder
    public void unbind() {
        CalendarListSubHeaderViewHolder calendarListSubHeaderViewHolder = this.f82810a;
        if (calendarListSubHeaderViewHolder != null) {
            this.f82810a = null;
            calendarListSubHeaderViewHolder.rootView = null;
            calendarListSubHeaderViewHolder.mTvTitle = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CalendarListSubHeaderViewHolder_ViewBinding(CalendarListSubHeaderViewHolder calendarListSubHeaderViewHolder, View view) {
        this.f82810a = calendarListSubHeaderViewHolder;
        calendarListSubHeaderViewHolder.rootView = Utils.findRequiredView(view, R.id.root_view, "field 'rootView'");
        calendarListSubHeaderViewHolder.mTvTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.sub_header_title, "field 'mTvTitle'", TextView.class);
    }
}
