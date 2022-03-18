package com.ss.android.lark.calendar.impl.features.remind.reminder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.suite.R;

public class OverallReminderView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private OverallReminderView f82543a;

    @Override // butterknife.Unbinder
    public void unbind() {
        OverallReminderView overallReminderView = this.f82543a;
        if (overallReminderView != null) {
            this.f82543a = null;
            overallReminderView.mTvEventTitle = null;
            overallReminderView.mTvEventTime = null;
            overallReminderView.mLlMeetingRoom = null;
            overallReminderView.mTvEventMeetingRoom = null;
            overallReminderView.mLlLocation = null;
            overallReminderView.mTvEventLocation = null;
            overallReminderView.mTvCloseReminder = null;
            overallReminderView.mTvDetailReminder = null;
            overallReminderView.mDisplayLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public OverallReminderView_ViewBinding(OverallReminderView overallReminderView, View view) {
        this.f82543a = overallReminderView;
        overallReminderView.mTvEventTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_event_title_content, "field 'mTvEventTitle'", TextView.class);
        overallReminderView.mTvEventTime = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_event_time, "field 'mTvEventTime'", TextView.class);
        overallReminderView.mLlMeetingRoom = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ll_event_meeting_room, "field 'mLlMeetingRoom'", ViewGroup.class);
        overallReminderView.mTvEventMeetingRoom = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_event_meeting_room, "field 'mTvEventMeetingRoom'", TextView.class);
        overallReminderView.mLlLocation = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ll_event_location, "field 'mLlLocation'", ViewGroup.class);
        overallReminderView.mTvEventLocation = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_event_location, "field 'mTvEventLocation'", TextView.class);
        overallReminderView.mTvCloseReminder = (UDButton) Utils.findRequiredViewAsType(view, R.id.tv_close_reminder, "field 'mTvCloseReminder'", UDButton.class);
        overallReminderView.mTvDetailReminder = (UDButton) Utils.findRequiredViewAsType(view, R.id.tv_detail_reminder, "field 'mTvDetailReminder'", UDButton.class);
        overallReminderView.mDisplayLayout = Utils.findRequiredView(view, R.id.layout_display, "field 'mDisplayLayout'");
    }
}
