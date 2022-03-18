package com.ss.android.lark.calendar.impl.features.messagecard.share;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.TimeShowTextView;
import com.ss.android.lark.calendar.impl.features.messagecard.widget.MessageCardReplyContainer;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import java.util.concurrent.ConcurrentHashMap;

public class ShareCalendarMessageDetailBinder {

    /* renamed from: a */
    static AbstractC32594f f82369a = C32533b.m124620a();

    /* renamed from: b */
    public static final ConcurrentHashMap<ShareCalendarEventContentHolder, Boolean> f82370b = new ConcurrentHashMap<>();

    public static class ShareCalendarEventContentHolder extends RecyclerView.ViewHolder {
        @BindView(10971)
        public View holderView;
        @BindView(9454)
        public UDButton mEventAction;
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
    }

    public class ShareCalendarEventContentHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ShareCalendarEventContentHolder f82371a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ShareCalendarEventContentHolder shareCalendarEventContentHolder = this.f82371a;
            if (shareCalendarEventContentHolder != null) {
                this.f82371a = null;
                shareCalendarEventContentHolder.mExternalEventLabel = null;
                shareCalendarEventContentHolder.mEventSummaryBg = null;
                shareCalendarEventContentHolder.mEventSummary = null;
                shareCalendarEventContentHolder.mTime = null;
                shareCalendarEventContentHolder.mTimeConflict = null;
                shareCalendarEventContentHolder.mMeetingRoomContainer = null;
                shareCalendarEventContentHolder.mMeetingRoom = null;
                shareCalendarEventContentHolder.mLocationContainer = null;
                shareCalendarEventContentHolder.mLocation = null;
                shareCalendarEventContentHolder.mRepeatContainer = null;
                shareCalendarEventContentHolder.mRepeat = null;
                shareCalendarEventContentHolder.mEventAction = null;
                shareCalendarEventContentHolder.mReplyContainer = null;
                shareCalendarEventContentHolder.holderView = null;
                shareCalendarEventContentHolder.mTimeIv = null;
                shareCalendarEventContentHolder.mRepeatIv = null;
                shareCalendarEventContentHolder.mLocationIv = null;
                shareCalendarEventContentHolder.mMeetingRoomIv = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ShareCalendarEventContentHolder_ViewBinding(ShareCalendarEventContentHolder shareCalendarEventContentHolder, View view) {
            this.f82371a = shareCalendarEventContentHolder;
            shareCalendarEventContentHolder.mExternalEventLabel = (TextView) Utils.findRequiredViewAsType(view, R.id.share_external_label, "field 'mExternalEventLabel'", TextView.class);
            shareCalendarEventContentHolder.mEventSummaryBg = Utils.findRequiredView(view, R.id.bot_head_container, "field 'mEventSummaryBg'");
            shareCalendarEventContentHolder.mEventSummary = (TextView) Utils.findRequiredViewAsType(view, R.id.event_share_summary, "field 'mEventSummary'", TextView.class);
            shareCalendarEventContentHolder.mTime = (TimeShowTextView) Utils.findRequiredViewAsType(view, R.id.value_share_event_time, "field 'mTime'", TimeShowTextView.class);
            shareCalendarEventContentHolder.mTimeConflict = (TextView) Utils.findRequiredViewAsType(view, R.id.share_event_time_conflict, "field 'mTimeConflict'", TextView.class);
            shareCalendarEventContentHolder.mMeetingRoomContainer = Utils.findRequiredView(view, R.id.share_event_meeting_room, "field 'mMeetingRoomContainer'");
            shareCalendarEventContentHolder.mMeetingRoom = (TextView) Utils.findRequiredViewAsType(view, R.id.value_share_event_meeting_room, "field 'mMeetingRoom'", TextView.class);
            shareCalendarEventContentHolder.mLocationContainer = Utils.findRequiredView(view, R.id.share_event_location, "field 'mLocationContainer'");
            shareCalendarEventContentHolder.mLocation = (TextView) Utils.findRequiredViewAsType(view, R.id.value_share_event_location, "field 'mLocation'", TextView.class);
            shareCalendarEventContentHolder.mRepeatContainer = Utils.findRequiredView(view, R.id.share_event_repeat, "field 'mRepeatContainer'");
            shareCalendarEventContentHolder.mRepeat = (TextView) Utils.findRequiredViewAsType(view, R.id.value_share_event_repeat, "field 'mRepeat'", TextView.class);
            shareCalendarEventContentHolder.mEventAction = (UDButton) Utils.findRequiredViewAsType(view, R.id.event_share_actions, "field 'mEventAction'", UDButton.class);
            shareCalendarEventContentHolder.mReplyContainer = (MessageCardReplyContainer) Utils.findRequiredViewAsType(view, R.id.reply_container, "field 'mReplyContainer'", MessageCardReplyContainer.class);
            shareCalendarEventContentHolder.holderView = Utils.findRequiredView(view, R.id.share_calendar_event_card_holder, "field 'holderView'");
            shareCalendarEventContentHolder.mTimeIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.key_time, "field 'mTimeIv'", ImageView.class);
            shareCalendarEventContentHolder.mRepeatIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.key_repeat, "field 'mRepeatIv'", ImageView.class);
            shareCalendarEventContentHolder.mLocationIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.key_location, "field 'mLocationIv'", ImageView.class);
            shareCalendarEventContentHolder.mMeetingRoomIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.key_meeting_room, "field 'mMeetingRoomIv'", ImageView.class);
        }
    }
}
