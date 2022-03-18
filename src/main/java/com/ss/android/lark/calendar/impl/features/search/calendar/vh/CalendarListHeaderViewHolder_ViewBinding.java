package com.ss.android.lark.calendar.impl.features.search.calendar.vh;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class CalendarListHeaderViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CalendarListHeaderViewHolder f82805a;

    @Override // butterknife.Unbinder
    public void unbind() {
        CalendarListHeaderViewHolder calendarListHeaderViewHolder = this.f82805a;
        if (calendarListHeaderViewHolder != null) {
            this.f82805a = null;
            calendarListHeaderViewHolder.mTvName = null;
            calendarListHeaderViewHolder.mAvatarIV = null;
            calendarListHeaderViewHolder.mDivider = null;
            calendarListHeaderViewHolder.mMarginTopSpace = null;
            calendarListHeaderViewHolder.mCalendarKindIv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CalendarListHeaderViewHolder_ViewBinding(CalendarListHeaderViewHolder calendarListHeaderViewHolder, View view) {
        this.f82805a = calendarListHeaderViewHolder;
        calendarListHeaderViewHolder.mTvName = (TextView) Utils.findRequiredViewAsType(view, R.id.name, "field 'mTvName'", TextView.class);
        calendarListHeaderViewHolder.mAvatarIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.avatar, "field 'mAvatarIV'", ImageView.class);
        calendarListHeaderViewHolder.mDivider = Utils.findRequiredView(view, R.id.view_divider, "field 'mDivider'");
        calendarListHeaderViewHolder.mMarginTopSpace = Utils.findRequiredView(view, R.id.margin_top_space, "field 'mMarginTopSpace'");
        calendarListHeaderViewHolder.mCalendarKindIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.calendar_kind_iv, "field 'mCalendarKindIv'", ImageView.class);
    }
}
