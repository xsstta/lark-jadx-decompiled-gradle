package com.ss.android.lark.calendar.impl.features.messagecard.general.listener;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.TimeShowTextView;
import com.ss.android.lark.calendar.impl.features.messagecard.widget.MessageCardReplyContainer;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;

public class CalendarGeneralViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CalendarGeneralViewHolder f82368a;

    @Override // butterknife.Unbinder
    public void unbind() {
        CalendarGeneralViewHolder calendarGeneralViewHolder = this.f82368a;
        if (calendarGeneralViewHolder != null) {
            this.f82368a = null;
            calendarGeneralViewHolder.mEventTitle = null;
            calendarGeneralViewHolder.mExternalLabel = null;
            calendarGeneralViewHolder.mBotHeadIcon = null;
            calendarGeneralViewHolder.mEventSummary = null;
            calendarGeneralViewHolder.mOptionalAttendee = null;
            calendarGeneralViewHolder.mTime = null;
            calendarGeneralViewHolder.mTimeConflict = null;
            calendarGeneralViewHolder.mMeetingRoomContainer = null;
            calendarGeneralViewHolder.mMeetingRoom = null;
            calendarGeneralViewHolder.mLocationContainer = null;
            calendarGeneralViewHolder.mLocation = null;
            calendarGeneralViewHolder.mAttendeeContainer = null;
            calendarGeneralViewHolder.mAttendees = null;
            calendarGeneralViewHolder.mDescriptionContainer = null;
            calendarGeneralViewHolder.mDescription = null;
            calendarGeneralViewHolder.mRepeatContainer = null;
            calendarGeneralViewHolder.mRepeat = null;
            calendarGeneralViewHolder.mReplyStateContainer = null;
            calendarGeneralViewHolder.mReplyStatus = null;
            calendarGeneralViewHolder.mReplyContainer = null;
            calendarGeneralViewHolder.mTimeIv = null;
            calendarGeneralViewHolder.mRepeatIv = null;
            calendarGeneralViewHolder.mLocationIv = null;
            calendarGeneralViewHolder.mMeetingRoomIv = null;
            calendarGeneralViewHolder.mAttendeeIv = null;
            calendarGeneralViewHolder.mDescriptionIv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CalendarGeneralViewHolder_ViewBinding(CalendarGeneralViewHolder calendarGeneralViewHolder, View view) {
        this.f82368a = calendarGeneralViewHolder;
        calendarGeneralViewHolder.mEventTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.event_title, "field 'mEventTitle'", TextView.class);
        calendarGeneralViewHolder.mExternalLabel = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_bot_external_event_label, "field 'mExternalLabel'", TextView.class);
        calendarGeneralViewHolder.mBotHeadIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.bot_head_icon, "field 'mBotHeadIcon'", ImageView.class);
        calendarGeneralViewHolder.mEventSummary = (TextView) Utils.findRequiredViewAsType(view, R.id.value_summary, "field 'mEventSummary'", TextView.class);
        calendarGeneralViewHolder.mOptionalAttendee = (TextView) Utils.findRequiredViewAsType(view, R.id.optional_attendee, "field 'mOptionalAttendee'", TextView.class);
        calendarGeneralViewHolder.mTime = (TimeShowTextView) Utils.findRequiredViewAsType(view, R.id.value_time, "field 'mTime'", TimeShowTextView.class);
        calendarGeneralViewHolder.mTimeConflict = (TextView) Utils.findRequiredViewAsType(view, R.id.time_conflict, "field 'mTimeConflict'", TextView.class);
        calendarGeneralViewHolder.mMeetingRoomContainer = Utils.findRequiredView(view, R.id.meeting_room, "field 'mMeetingRoomContainer'");
        calendarGeneralViewHolder.mMeetingRoom = (TextView) Utils.findRequiredViewAsType(view, R.id.value_meeting_room, "field 'mMeetingRoom'", TextView.class);
        calendarGeneralViewHolder.mLocationContainer = Utils.findRequiredView(view, R.id.location, "field 'mLocationContainer'");
        calendarGeneralViewHolder.mLocation = (TextView) Utils.findRequiredViewAsType(view, R.id.value_location, "field 'mLocation'", TextView.class);
        calendarGeneralViewHolder.mAttendeeContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.attendee, "field 'mAttendeeContainer'", ViewGroup.class);
        calendarGeneralViewHolder.mAttendees = (LinkEmojiTextView) Utils.findRequiredViewAsType(view, R.id.value_attendee, "field 'mAttendees'", LinkEmojiTextView.class);
        calendarGeneralViewHolder.mDescriptionContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.description, "field 'mDescriptionContainer'", ViewGroup.class);
        calendarGeneralViewHolder.mDescription = (TextView) Utils.findRequiredViewAsType(view, R.id.value_description, "field 'mDescription'", TextView.class);
        calendarGeneralViewHolder.mRepeatContainer = Utils.findRequiredView(view, R.id.repeat, "field 'mRepeatContainer'");
        calendarGeneralViewHolder.mRepeat = (TextView) Utils.findRequiredViewAsType(view, R.id.value_repeat, "field 'mRepeat'", TextView.class);
        calendarGeneralViewHolder.mReplyStateContainer = Utils.findRequiredView(view, R.id.reply_container, "field 'mReplyStateContainer'");
        calendarGeneralViewHolder.mReplyStatus = (TextView) Utils.findRequiredViewAsType(view, R.id.reply_status_text, "field 'mReplyStatus'", TextView.class);
        calendarGeneralViewHolder.mReplyContainer = (MessageCardReplyContainer) Utils.findRequiredViewAsType(view, R.id.card_reply_container, "field 'mReplyContainer'", MessageCardReplyContainer.class);
        calendarGeneralViewHolder.mTimeIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.key_time, "field 'mTimeIv'", ImageView.class);
        calendarGeneralViewHolder.mRepeatIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.key_repeat, "field 'mRepeatIv'", ImageView.class);
        calendarGeneralViewHolder.mLocationIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.key_location, "field 'mLocationIv'", ImageView.class);
        calendarGeneralViewHolder.mMeetingRoomIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.key_meeting_room, "field 'mMeetingRoomIv'", ImageView.class);
        calendarGeneralViewHolder.mAttendeeIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.key_attendee, "field 'mAttendeeIv'", ImageView.class);
        calendarGeneralViewHolder.mDescriptionIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.key_description, "field 'mDescriptionIv'", ImageView.class);
    }
}
