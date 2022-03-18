package com.ss.android.lark.calendar.impl.features.search.calendar.vh;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class CalendarListShowMoreViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CalendarListShowMoreViewHolder f82809a;

    @Override // butterknife.Unbinder
    public void unbind() {
        CalendarListShowMoreViewHolder calendarListShowMoreViewHolder = this.f82809a;
        if (calendarListShowMoreViewHolder != null) {
            this.f82809a = null;
            calendarListShowMoreViewHolder.mIvShowMore = null;
            calendarListShowMoreViewHolder.mTvShowMore = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CalendarListShowMoreViewHolder_ViewBinding(CalendarListShowMoreViewHolder calendarListShowMoreViewHolder, View view) {
        this.f82809a = calendarListShowMoreViewHolder;
        calendarListShowMoreViewHolder.mIvShowMore = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_calendar_show_more, "field 'mIvShowMore'", ImageView.class);
        calendarListShowMoreViewHolder.mTvShowMore = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_calendar_show_more, "field 'mTvShowMore'", TextView.class);
    }
}
