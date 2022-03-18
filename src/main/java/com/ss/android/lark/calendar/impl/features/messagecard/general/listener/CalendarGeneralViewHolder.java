package com.ss.android.lark.calendar.impl.features.messagecard.general.listener;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.huawei.hms.api.ConnectionResult;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.TimeShowTextView;
import com.ss.android.lark.calendar.impl.features.messagecard.widget.MessageCardReplyContainer;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;

public class CalendarGeneralViewHolder {

    /* renamed from: a */
    public View f82367a;
    @BindView(8710)
    public ViewGroup mAttendeeContainer;
    @BindView(9892)
    public ImageView mAttendeeIv;
    @BindView(11660)
    public LinkEmojiTextView mAttendees;
    @BindView(8826)
    public ImageView mBotHeadIcon;
    @BindView(11661)
    public TextView mDescription;
    @BindView(9222)
    public ViewGroup mDescriptionContainer;
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
    @BindView(10677)
    public View mReplyStateContainer;
    @BindView(10680)
    public TextView mReplyStatus;
    @BindView(11684)
    public TimeShowTextView mTime;
    @BindView(11265)
    public TextView mTimeConflict;
    @BindView(9897)
    public ImageView mTimeIv;

    public CalendarGeneralViewHolder(View view) {
        this.f82367a = view;
        ButterKnife.bind(this, view);
        this.mReplyContainer.setVisibility(8);
    }
}
