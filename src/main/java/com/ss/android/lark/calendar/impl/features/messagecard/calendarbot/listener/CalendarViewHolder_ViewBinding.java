package com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.listener;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.TimeShowTextView;
import com.ss.android.lark.calendar.impl.features.messagecard.widget.MessageCardReplyContainer;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;

public class CalendarViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CalendarViewHolder f82314a;

    @Override // butterknife.Unbinder
    public void unbind() {
        CalendarViewHolder calendarViewHolder = this.f82314a;
        if (calendarViewHolder != null) {
            this.f82314a = null;
            calendarViewHolder.mEventTitle = null;
            calendarViewHolder.mExternalLabel = null;
            calendarViewHolder.mBotHeadIcon = null;
            calendarViewHolder.mEventSummary = null;
            calendarViewHolder.mOptionalAttendee = null;
            calendarViewHolder.mTimeContainer = null;
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
            calendarViewHolder.mTimeDiffLabel = null;
            calendarViewHolder.mRepeatDiffLabel = null;
            calendarViewHolder.mLocationDiffLabel = null;
            calendarViewHolder.mMeetingRoomDiffLabel = null;
            calendarViewHolder.mDescriptionDiffLabel = null;
            calendarViewHolder.mEventContent = null;
            calendarViewHolder.mTimeIv = null;
            calendarViewHolder.mRepeatIv = null;
            calendarViewHolder.mLocationIv = null;
            calendarViewHolder.mMeetingRoomIv = null;
            calendarViewHolder.mAttendeeIv = null;
            calendarViewHolder.mDescriptionIv = null;
            calendarViewHolder.mReplyContainer = null;
            calendarViewHolder.updateContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CalendarViewHolder_ViewBinding(CalendarViewHolder calendarViewHolder, View view) {
        this.f82314a = calendarViewHolder;
        calendarViewHolder.mEventTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.event_title, "field 'mEventTitle'", TextView.class);
        calendarViewHolder.mExternalLabel = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_bot_external_event_label, "field 'mExternalLabel'", TextView.class);
        calendarViewHolder.mBotHeadIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.bot_head_icon, "field 'mBotHeadIcon'", ImageView.class);
        calendarViewHolder.mEventSummary = (TextView) Utils.findRequiredViewAsType(view, R.id.value_summary, "field 'mEventSummary'", TextView.class);
        calendarViewHolder.mOptionalAttendee = (TextView) Utils.findRequiredViewAsType(view, R.id.optional_attendee, "field 'mOptionalAttendee'", TextView.class);
        calendarViewHolder.mTimeContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.value_time_container, "field 'mTimeContainer'", LinearLayout.class);
        calendarViewHolder.mTime = (TimeShowTextView) Utils.findRequiredViewAsType(view, R.id.value_time, "field 'mTime'", TimeShowTextView.class);
        calendarViewHolder.mTimeConflict = (TextView) Utils.findRequiredViewAsType(view, R.id.time_conflict, "field 'mTimeConflict'", TextView.class);
        calendarViewHolder.mMeetingRoomContainer = Utils.findRequiredView(view, R.id.meeting_room, "field 'mMeetingRoomContainer'");
        calendarViewHolder.mMeetingRoom = (TextView) Utils.findRequiredViewAsType(view, R.id.value_meeting_room, "field 'mMeetingRoom'", TextView.class);
        calendarViewHolder.mLocationContainer = Utils.findRequiredView(view, R.id.location, "field 'mLocationContainer'");
        calendarViewHolder.mLocation = (TextView) Utils.findRequiredViewAsType(view, R.id.value_location, "field 'mLocation'", TextView.class);
        calendarViewHolder.mAttendeeContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.attendee, "field 'mAttendeeContainer'", ViewGroup.class);
        calendarViewHolder.mAttendees = (LinkEmojiTextView) Utils.findRequiredViewAsType(view, R.id.value_attendee, "field 'mAttendees'", LinkEmojiTextView.class);
        calendarViewHolder.mDescriptionContainer = Utils.findRequiredView(view, R.id.description, "field 'mDescriptionContainer'");
        calendarViewHolder.mDescription = (TextView) Utils.findRequiredViewAsType(view, R.id.value_description, "field 'mDescription'", TextView.class);
        calendarViewHolder.mRepeatContainer = Utils.findRequiredView(view, R.id.repeat, "field 'mRepeatContainer'");
        calendarViewHolder.mRepeat = (TextView) Utils.findRequiredViewAsType(view, R.id.value_repeat, "field 'mRepeat'", TextView.class);
        calendarViewHolder.mBotHeadContainer = Utils.findRequiredView(view, R.id.bot_head_container, "field 'mBotHeadContainer'");
        calendarViewHolder.mTimeDiffLabel = (TextView) Utils.findRequiredViewAsType(view, R.id.time_diff_label, "field 'mTimeDiffLabel'", TextView.class);
        calendarViewHolder.mRepeatDiffLabel = (TextView) Utils.findRequiredViewAsType(view, R.id.repeat_diff_label, "field 'mRepeatDiffLabel'", TextView.class);
        calendarViewHolder.mLocationDiffLabel = (TextView) Utils.findRequiredViewAsType(view, R.id.location_diff_label, "field 'mLocationDiffLabel'", TextView.class);
        calendarViewHolder.mMeetingRoomDiffLabel = (TextView) Utils.findRequiredViewAsType(view, R.id.meeting_room_diff_label, "field 'mMeetingRoomDiffLabel'", TextView.class);
        calendarViewHolder.mDescriptionDiffLabel = (TextView) Utils.findRequiredViewAsType(view, R.id.description_diff_label, "field 'mDescriptionDiffLabel'", TextView.class);
        calendarViewHolder.mEventContent = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.event_content, "field 'mEventContent'", LinearLayout.class);
        calendarViewHolder.mTimeIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.key_time, "field 'mTimeIv'", ImageView.class);
        calendarViewHolder.mRepeatIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.key_repeat, "field 'mRepeatIv'", ImageView.class);
        calendarViewHolder.mLocationIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.key_location, "field 'mLocationIv'", ImageView.class);
        calendarViewHolder.mMeetingRoomIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.key_meeting_room, "field 'mMeetingRoomIv'", ImageView.class);
        calendarViewHolder.mAttendeeIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.key_attendee, "field 'mAttendeeIv'", ImageView.class);
        calendarViewHolder.mDescriptionIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.key_description, "field 'mDescriptionIv'", ImageView.class);
        calendarViewHolder.mReplyContainer = (MessageCardReplyContainer) Utils.findRequiredViewAsType(view, R.id.card_reply_container, "field 'mReplyContainer'", MessageCardReplyContainer.class);
        calendarViewHolder.updateContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.update_content, "field 'updateContainer'", LinearLayout.class);
    }
}
