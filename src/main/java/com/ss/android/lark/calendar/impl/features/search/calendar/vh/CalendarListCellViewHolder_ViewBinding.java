package com.ss.android.lark.calendar.impl.features.search.calendar.vh;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;

public class CalendarListCellViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CalendarListCellViewHolder f82803a;

    @Override // butterknife.Unbinder
    public void unbind() {
        CalendarListCellViewHolder calendarListCellViewHolder = this.f82803a;
        if (calendarListCellViewHolder != null) {
            this.f82803a = null;
            calendarListCellViewHolder.mCheckBox = null;
            calendarListCellViewHolder.mTvCalendarSummary = null;
            calendarListCellViewHolder.mIvGoogleMark = null;
            calendarListCellViewHolder.mIvLoadingCalendar = null;
            calendarListCellViewHolder.mInactiveIcon = null;
            calendarListCellViewHolder.mManagerIcon = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CalendarListCellViewHolder_ViewBinding(CalendarListCellViewHolder calendarListCellViewHolder, View view) {
        this.f82803a = calendarListCellViewHolder;
        calendarListCellViewHolder.mCheckBox = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.cb_owner_calendar, "field 'mCheckBox'", UDCheckBox.class);
        calendarListCellViewHolder.mTvCalendarSummary = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_calendar_summary, "field 'mTvCalendarSummary'", TextView.class);
        calendarListCellViewHolder.mIvGoogleMark = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_google_mark, "field 'mIvGoogleMark'", ImageView.class);
        calendarListCellViewHolder.mIvLoadingCalendar = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_loading_calendar, "field 'mIvLoadingCalendar'", ImageView.class);
        calendarListCellViewHolder.mInactiveIcon = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_disabled_icon, "field 'mInactiveIcon'", TextView.class);
        calendarListCellViewHolder.mManagerIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.manager_icon, "field 'mManagerIcon'", ImageView.class);
    }
}
