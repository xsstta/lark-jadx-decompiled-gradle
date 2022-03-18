package com.ss.android.lark.calendar.impl.features.messagecard.general;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import java.util.concurrent.ConcurrentHashMap;

public class CalendarGeneraMessageDetailBinder {

    /* renamed from: a */
    static AbstractC32594f f82337a = C32533b.m124620a();

    /* renamed from: b */
    public static final ConcurrentHashMap<CalendarGeneralViewHolder, Boolean> f82338b = new ConcurrentHashMap<>();

    public static class CalendarGeneralViewHolder extends RecyclerView.ViewHolder {
        @BindView(8710)
        public View mAttendeeContainer;
        @BindView(9892)
        public ImageView mAttendeeIv;
        @BindView(11660)
        public LinkEmojiTextView mAttendees;
        @BindView(11661)
        public TextView mDescription;
        @BindView(9222)
        public View mDescriptionContainer;
        @BindView(9893)
        public ImageView mDescriptionIv;
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
        @BindView(9894)
        public ImageView mLocationIv;
        @BindView(11669)
        public TextView mMeetingRoom;
        @BindView(10267)
        public View mMeetingRoomContainer;
        @BindView(9895)
        public ImageView mMeetingRoomIv;
        @BindView(10459)
        public TextView mOptionalAttendee;
        @BindView(11672)
        public TextView mRepeat;
        @BindView(10669)
        public View mRepeatContainer;
        @BindView(9896)
        public ImageView mRepeatIv;
        @BindView(ConnectionResult.NETWORK_ERROR)
        public MessageCardReplyContainer mReplyContainer;
        @BindView(10679)
        public View mReplyLayout;
        @BindView(10677)
        public View mReplyStateContainer;
        @BindView(10680)
        public TextView mReplyStatus;
        @BindView(10756)
        public LinearLayout mRootView;
        @BindView(11684)
        public TimeShowTextView mTime;
        @BindView(11265)
        public TextView mTimeConflict;
        @BindView(9897)
        public ImageView mTimeIv;
    }

    public class CalendarGeneralViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private CalendarGeneralViewHolder f82339a;

        @Override // butterknife.Unbinder
        public void unbind() {
            CalendarGeneralViewHolder calendarGeneralViewHolder = this.f82339a;
            if (calendarGeneralViewHolder != null) {
                this.f82339a = null;
                calendarGeneralViewHolder.mEventTitle = null;
                calendarGeneralViewHolder.mExternalLabel = null;
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
                calendarGeneralViewHolder.mReplyLayout = null;
                calendarGeneralViewHolder.mReplyStatus = null;
                calendarGeneralViewHolder.mRootView = null;
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
            this.f82339a = calendarGeneralViewHolder;
            calendarGeneralViewHolder.mEventTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.event_title, "field 'mEventTitle'", TextView.class);
            calendarGeneralViewHolder.mExternalLabel = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_bot_external_event_label, "field 'mExternalLabel'", TextView.class);
            calendarGeneralViewHolder.mEventSummary = (TextView) Utils.findRequiredViewAsType(view, R.id.value_summary, "field 'mEventSummary'", TextView.class);
            calendarGeneralViewHolder.mOptionalAttendee = (TextView) Utils.findRequiredViewAsType(view, R.id.optional_attendee, "field 'mOptionalAttendee'", TextView.class);
            calendarGeneralViewHolder.mTime = (TimeShowTextView) Utils.findRequiredViewAsType(view, R.id.value_time, "field 'mTime'", TimeShowTextView.class);
            calendarGeneralViewHolder.mTimeConflict = (TextView) Utils.findRequiredViewAsType(view, R.id.time_conflict, "field 'mTimeConflict'", TextView.class);
            calendarGeneralViewHolder.mMeetingRoomContainer = Utils.findRequiredView(view, R.id.meeting_room, "field 'mMeetingRoomContainer'");
            calendarGeneralViewHolder.mMeetingRoom = (TextView) Utils.findRequiredViewAsType(view, R.id.value_meeting_room, "field 'mMeetingRoom'", TextView.class);
            calendarGeneralViewHolder.mLocationContainer = Utils.findRequiredView(view, R.id.location, "field 'mLocationContainer'");
            calendarGeneralViewHolder.mLocation = (TextView) Utils.findRequiredViewAsType(view, R.id.value_location, "field 'mLocation'", TextView.class);
            calendarGeneralViewHolder.mAttendeeContainer = Utils.findRequiredView(view, R.id.attendee, "field 'mAttendeeContainer'");
            calendarGeneralViewHolder.mAttendees = (LinkEmojiTextView) Utils.findRequiredViewAsType(view, R.id.value_attendee, "field 'mAttendees'", LinkEmojiTextView.class);
            calendarGeneralViewHolder.mDescriptionContainer = Utils.findRequiredView(view, R.id.description, "field 'mDescriptionContainer'");
            calendarGeneralViewHolder.mDescription = (TextView) Utils.findRequiredViewAsType(view, R.id.value_description, "field 'mDescription'", TextView.class);
            calendarGeneralViewHolder.mRepeatContainer = Utils.findRequiredView(view, R.id.repeat, "field 'mRepeatContainer'");
            calendarGeneralViewHolder.mRepeat = (TextView) Utils.findRequiredViewAsType(view, R.id.value_repeat, "field 'mRepeat'", TextView.class);
            calendarGeneralViewHolder.mReplyStateContainer = Utils.findRequiredView(view, R.id.reply_container, "field 'mReplyStateContainer'");
            calendarGeneralViewHolder.mReplyLayout = Utils.findRequiredView(view, R.id.reply_status_layout, "field 'mReplyLayout'");
            calendarGeneralViewHolder.mReplyStatus = (TextView) Utils.findRequiredViewAsType(view, R.id.reply_status_text, "field 'mReplyStatus'", TextView.class);
            calendarGeneralViewHolder.mRootView = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.root_view, "field 'mRootView'", LinearLayout.class);
            calendarGeneralViewHolder.mReplyContainer = (MessageCardReplyContainer) Utils.findRequiredViewAsType(view, R.id.card_reply_container, "field 'mReplyContainer'", MessageCardReplyContainer.class);
            calendarGeneralViewHolder.mTimeIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.key_time, "field 'mTimeIv'", ImageView.class);
            calendarGeneralViewHolder.mRepeatIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.key_repeat, "field 'mRepeatIv'", ImageView.class);
            calendarGeneralViewHolder.mLocationIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.key_location, "field 'mLocationIv'", ImageView.class);
            calendarGeneralViewHolder.mMeetingRoomIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.key_meeting_room, "field 'mMeetingRoomIv'", ImageView.class);
            calendarGeneralViewHolder.mAttendeeIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.key_attendee, "field 'mAttendeeIv'", ImageView.class);
            calendarGeneralViewHolder.mDescriptionIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.key_description, "field 'mDescriptionIv'", ImageView.class);
        }
    }
}
