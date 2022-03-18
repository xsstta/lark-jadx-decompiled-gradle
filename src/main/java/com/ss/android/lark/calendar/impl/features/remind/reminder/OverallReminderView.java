package com.ss.android.lark.calendar.impl.features.remind.reminder;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarNotificationHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.OverallReminderData;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.ding.helper.C36644b;
import com.ss.android.lark.log.Log;
import java.util.List;

public class OverallReminderView extends LinearLayout {

    /* renamed from: a */
    public AbstractC32265a f82537a;

    /* renamed from: b */
    public OverallReminderData f82538b;

    /* renamed from: c */
    private final String f82539c;
    @BindView(9934)
    View mDisplayLayout;
    @BindView(10049)
    ViewGroup mLlLocation;
    @BindView(10050)
    ViewGroup mLlMeetingRoom;
    @BindView(11454)
    UDButton mTvCloseReminder;
    @BindView(11463)
    UDButton mTvDetailReminder;
    @BindView(11481)
    TextView mTvEventLocation;
    @BindView(11482)
    TextView mTvEventMeetingRoom;
    @BindView(11486)
    TextView mTvEventTime;
    @BindView(11487)
    TextView mTvEventTitle;

    /* renamed from: com.ss.android.lark.calendar.impl.features.remind.reminder.OverallReminderView$a */
    public interface AbstractC32265a {
        /* renamed from: a */
        void mo117920a(OverallReminderData overallReminderData);

        /* renamed from: b */
        void mo117921b(OverallReminderData overallReminderData);
    }

    /* renamed from: a */
    private void m123034a() {
        ButterKnife.bind(LayoutInflater.from(getContext()).inflate(R.layout.view_overall_reminder, this), this);
    }

    /* renamed from: b */
    private void m123035b() {
        this.mTvCloseReminder.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.remind.reminder.OverallReminderView.View$OnClickListenerC322621 */

            public void onClick(View view) {
                CalendarNotificationHitPoint.m124366a(OverallReminderView.this.f82538b.getEventId(), Long.valueOf(OverallReminderView.this.f82538b.getStartTime()), "close");
                Log.m165389i("OverallReminderView", C32673y.m125369a("rmdClose"));
                OverallReminderView.this.f82537a.mo117920a(OverallReminderView.this.f82538b);
                C36644b.m144618a().mo135220c();
                GeneralHitPoint.m124194a(OverallReminderView.this.f82538b.getEventId(), OverallReminderView.this.f82538b.getMinutes(), "card", "close");
            }
        });
        this.mTvDetailReminder.setOnClickListener(new AbstractView$OnClickListenerC32626b() {
            /* class com.ss.android.lark.calendar.impl.features.remind.reminder.OverallReminderView.C322632 */

            @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
            /* renamed from: a */
            public void mo108751a(View view) {
                CalendarNotificationHitPoint.m124366a(OverallReminderView.this.f82538b.getEventId(), Long.valueOf(OverallReminderView.this.f82538b.getStartTime()), "check_more_detail");
                Log.m165389i("OverallReminderView", C32673y.m125369a("rmdDetail"));
                OverallReminderView.this.f82537a.mo117921b(OverallReminderView.this.f82538b);
                C36644b.m144618a().mo135220c();
                GeneralHitPoint.m124194a(OverallReminderView.this.f82538b.getEventId(), OverallReminderView.this.f82538b.getMinutes(), "card", "detail");
            }
        });
        this.mDisplayLayout.setOnClickListener(new AbstractView$OnClickListenerC32626b() {
            /* class com.ss.android.lark.calendar.impl.features.remind.reminder.OverallReminderView.C322643 */

            @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
            /* renamed from: a */
            public void mo108751a(View view) {
                Log.m165389i("OverallReminderView", C32673y.m125369a("rmdCard"));
                OverallReminderView.this.f82537a.mo117921b(OverallReminderView.this.f82538b);
                C36644b.m144618a().mo135220c();
                GeneralHitPoint.m124194a(OverallReminderView.this.f82538b.getEventId(), OverallReminderView.this.f82538b.getMinutes(), "card", "card");
            }
        });
    }

    public void setReminderClickListener(AbstractC32265a aVar) {
        this.f82537a = aVar;
    }

    public OverallReminderView(Context context) {
        this(context, null);
    }

    public void setData(OverallReminderData overallReminderData) {
        String str;
        CalendarNotificationHitPoint.m124365a(overallReminderData.getEventId(), Long.valueOf(overallReminderData.getStartTime()));
        this.f82538b = overallReminderData;
        if (TextUtils.isEmpty(overallReminderData.getTitle())) {
            str = getContext().getString(R.string.Calendar_Common_NoTitle);
        } else {
            str = overallReminderData.getTitle();
        }
        this.mTvEventTitle.setText(str);
        C32646c.m125267a(this.mTvEventTime, overallReminderData);
        List<String> meetingRooms = overallReminderData.getMeetingRooms();
        List<Boolean> meetingRoomsDisabled = overallReminderData.getMeetingRoomsDisabled();
        if (CollectionUtils.isNotEmpty(meetingRooms)) {
            StringBuilder sb = new StringBuilder(50);
            for (int i = 0; i < meetingRooms.size(); i++) {
                if (!meetingRoomsDisabled.get(i).booleanValue() && !TextUtils.isEmpty(meetingRooms.get(i))) {
                    sb.append(meetingRooms.get(i));
                    sb.append("  ");
                }
            }
            if (!TextUtils.isEmpty(sb.toString())) {
                this.mLlMeetingRoom.setVisibility(0);
                this.mTvEventMeetingRoom.setText(sb.toString());
            }
        }
        if (!TextUtils.isEmpty(overallReminderData.getLocation())) {
            this.mLlLocation.setVisibility(0);
            this.mTvEventLocation.setText(overallReminderData.getLocation());
        }
    }

    public OverallReminderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82539c = "OverallReminderView";
        m123034a();
        m123035b();
    }
}
