package com.ss.android.lark.calendar.impl.features.messagecard.calendarbot;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.huawei.hms.api.ConnectionResult;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.TimeShowTextView;
import com.ss.android.lark.calendar.impl.features.messagecard.widget.MessageCardReplyContainer;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;

public class CalendarMessageDetailCardBinder {

    /* renamed from: a */
    static AbstractC32594f f82300a = C32533b.m124620a();

    public static class CalendarViewHolder extends RecyclerView.ViewHolder {
        @BindView(8710)
        public View mAttendeeContainer;
        @BindView(11660)
        public LinkEmojiTextView mAttendees;
        @BindView(8825)
        public View mBotHeadContainer;
        @BindView(11661)
        public TextView mDescription;
        @BindView(9222)
        public View mDescriptionContainer;
        @BindView(11682)
        public TextView mEventSummary;
        @BindView(9466)
        public TextView mEventTitle;
        @BindView(11437)
        public TextView mExternalLabel;
        @BindView(11667)
        public TextView mLocation;
        @BindView(10126)
        public View mLocationContainer;
        @BindView(11669)
        public TextView mMeetingRoom;
        @BindView(10267)
        public View mMeetingRoomContainer;
        @BindView(10459)
        public TextView mOptionalAttendee;
        @BindView(11672)
        public TextView mRepeat;
        @BindView(10669)
        public View mRepeatContainer;
        @BindView(ConnectionResult.NETWORK_ERROR)
        public MessageCardReplyContainer mReplyContainer;
        @BindView(11684)
        public TimeShowTextView mTime;
        @BindView(11265)
        public TextView mTimeConflict;
    }

    public class CalendarViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private CalendarViewHolder f82301a;

        @Override // butterknife.Unbinder
        public void unbind() {
            CalendarViewHolder calendarViewHolder = this.f82301a;
            if (calendarViewHolder != null) {
                this.f82301a = null;
                calendarViewHolder.mEventTitle = null;
                calendarViewHolder.mExternalLabel = null;
                calendarViewHolder.mEventSummary = null;
                calendarViewHolder.mOptionalAttendee = null;
                calendarViewHolder.mTime = null;
                calendarViewHolder.mTimeConflict = null;
                calendarViewHolder.mMeetingRoomContainer = null;
                calendarViewHolder.mMeetingRoom = null;
                calendarViewHolder.mLocationContainer = null;
                calendarViewHolder.mLocation = null;
                calendarViewHolder.mAttendeeContainer = null;
                calendarViewHolder.mAttendees = null;
                calendarViewHolder.mDescriptionContainer = null;
                calendarViewHolder.mDescription = null;
                calendarViewHolder.mRepeatContainer = null;
                calendarViewHolder.mRepeat = null;
                calendarViewHolder.mBotHeadContainer = null;
                calendarViewHolder.mReplyContainer = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public CalendarViewHolder_ViewBinding(CalendarViewHolder calendarViewHolder, View view) {
            this.f82301a = calendarViewHolder;
            calendarViewHolder.mEventTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.event_title, "field 'mEventTitle'", TextView.class);
            calendarViewHolder.mExternalLabel = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_bot_external_event_label, "field 'mExternalLabel'", TextView.class);
            calendarViewHolder.mEventSummary = (TextView) Utils.findRequiredViewAsType(view, R.id.value_summary, "field 'mEventSummary'", TextView.class);
            calendarViewHolder.mOptionalAttendee = (TextView) Utils.findRequiredViewAsType(view, R.id.optional_attendee, "field 'mOptionalAttendee'", TextView.class);
            calendarViewHolder.mTime = (TimeShowTextView) Utils.findRequiredViewAsType(view, R.id.value_time, "field 'mTime'", TimeShowTextView.class);
            calendarViewHolder.mTimeConflict = (TextView) Utils.findRequiredViewAsType(view, R.id.time_conflict, "field 'mTimeConflict'", TextView.class);
            calendarViewHolder.mMeetingRoomContainer = Utils.findRequiredView(view, R.id.meeting_room, "field 'mMeetingRoomContainer'");
            calendarViewHolder.mMeetingRoom = (TextView) Utils.findRequiredViewAsType(view, R.id.value_meeting_room, "field 'mMeetingRoom'", TextView.class);
            calendarViewHolder.mLocationContainer = Utils.findRequiredView(view, R.id.location, "field 'mLocationContainer'");
            calendarViewHolder.mLocation = (TextView) Utils.findRequiredViewAsType(view, R.id.value_location, "field 'mLocation'", TextView.class);
            calendarViewHolder.mAttendeeContainer = Utils.findRequiredView(view, R.id.attendee, "field 'mAttendeeContainer'");
            calendarViewHolder.mAttendees = (LinkEmojiTextView) Utils.findRequiredViewAsType(view, R.id.value_attendee, "field 'mAttendees'", LinkEmojiTextView.class);
            calendarViewHolder.mDescriptionContainer = Utils.findRequiredView(view, R.id.description, "field 'mDescriptionContainer'");
            calendarViewHolder.mDescription = (TextView) Utils.findRequiredViewAsType(view, R.id.value_description, "field 'mDescription'", TextView.class);
            calendarViewHolder.mRepeatContainer = Utils.findRequiredView(view, R.id.repeat, "field 'mRepeatContainer'");
            calendarViewHolder.mRepeat = (TextView) Utils.findRequiredViewAsType(view, R.id.value_repeat, "field 'mRepeat'", TextView.class);
            calendarViewHolder.mBotHeadContainer = Utils.findRequiredView(view, R.id.bot_head_container, "field 'mBotHeadContainer'");
            calendarViewHolder.mReplyContainer = (MessageCardReplyContainer) Utils.findRequiredViewAsType(view, R.id.card_reply_container, "field 'mReplyContainer'", MessageCardReplyContainer.class);
        }
    }
}
