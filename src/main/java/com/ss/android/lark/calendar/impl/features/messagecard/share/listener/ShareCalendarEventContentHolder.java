package com.ss.android.lark.calendar.impl.features.messagecard.share.listener;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.universe_design.button.UDButton;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.TimeShowTextView;
import com.ss.android.lark.calendar.impl.features.messagecard.share.helper.CalendarShareCardSizeHelper;
import com.ss.android.lark.calendar.impl.features.messagecard.widget.MessageCardReplyContainer;

public class ShareCalendarEventContentHolder {

    /* renamed from: a */
    public View f82381a;

    /* renamed from: b */
    public Long f82382b = 0L;

    /* renamed from: c */
    public String f82383c = "";
    @BindView(10971)
    public View holderView;
    @BindView(9454)
    public UDButton mEventAction;
    @BindView(10972)
    public ImageView mEventHeaderIcon;
    @BindView(9455)
    public TextView mEventSummary;
    @BindView(8825)
    public View mEventSummaryBg;
    @BindView(10981)
    public TextView mExternalEventLabel;
    @BindView(11674)
    public TextView mLocation;
    @BindView(10976)
    public View mLocationContainer;
    @BindView(9894)
    public ImageView mLocationIv;
    @BindView(11675)
    public TextView mMeetingRoom;
    @BindView(10977)
    public View mMeetingRoomContainer;
    @BindView(9895)
    public ImageView mMeetingRoomIv;
    @BindView(11676)
    public TextView mRepeat;
    @BindView(10978)
    public View mRepeatContainer;
    @BindView(9896)
    public ImageView mRepeatIv;
    @BindView(10677)
    public MessageCardReplyContainer mReplyContainer;
    @BindView(11677)
    public TimeShowTextView mTime;
    @BindView(10980)
    public TextView mTimeConflict;
    @BindView(9897)
    public ImageView mTimeIv;

    public ShareCalendarEventContentHolder(View view) {
        this.f82381a = view;
        ButterKnife.bind(this, view);
        CalendarShareCardSizeHelper.m122785a(this.mReplyContainer);
    }
}
