package com.ss.android.lark.calendar.impl.features.events.detail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.lark.pb.calendar.v1.RoomViewInstance;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.features.events.detail.presenter.AuthorizedDetailPresenter;
import com.ss.android.lark.calendar.impl.features.events.detail.presenter.EventDetailPresenter;
import com.ss.android.lark.calendar.impl.features.events.detail.presenter.LocalDetailPresenter;
import com.ss.android.lark.calendar.impl.features.events.detail.presenter.RSVPCommentPresenter;
import com.ss.android.lark.calendar.impl.features.events.detail.presenter.ReminderDetailPresenter;
import com.ss.android.lark.calendar.impl.features.events.detail.presenter.RoomInstanceDetailPresenter;
import com.ss.android.lark.calendar.impl.features.events.detail.presenter.ShareDetailPresenter;
import com.ss.android.lark.calendar.impl.features.events.detail.presenter.TriplesDetailPresenter;
import com.ss.android.lark.calendar.impl.features.events.detail.presenter.VchatDetailPresenter;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarMainHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.OverallReminderData;

/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.b */
public class C31238b {
    /* renamed from: a */
    public static void m116874a(Context context, String str, String str2, long j) {
        TriplesDetailPresenter.m118047a(context, str, str2, j);
    }

    /* renamed from: a */
    public static void m116875a(Context context, String str, String str2, long j, long j2) {
        ReminderDetailPresenter.m118015a(context, j, str, str2, j2);
    }

    /* renamed from: a */
    public static void m116876a(Context context, String str, String str2, long j, long j2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("calendar_id", str);
        bundle.putString("key", str2);
        bundle.putLong("origin_time", j);
        bundle.putLong("calendar_event_start_time", j2);
        bundle.putInt("enterDetailSource", EventDetailSource.FROM_SHARE_APP_LINK.getValue());
        bundle.putString("key_params_share_user_token", str3);
        ShareDetailPresenter.m118036a(context, bundle);
    }

    /* renamed from: a */
    public static void m116863a(Activity activity, Bundle bundle) {
        TriplesDetailPresenter.m118048b(activity, bundle);
    }

    /* renamed from: b */
    public static void m116878b(Activity activity, Bundle bundle) {
        TriplesDetailPresenter.m118044a(activity, bundle);
    }

    /* renamed from: c */
    public static void m116880c(Activity activity, Bundle bundle) {
        RSVPCommentPresenter.m118010a(activity, bundle);
    }

    /* renamed from: d */
    public static void m116881d(Activity activity, Bundle bundle) {
        ReminderDetailPresenter.m118014a(activity, bundle);
    }

    /* renamed from: a */
    public static void m116865a(Activity activity, CalendarEvent calendarEvent) {
        TriplesDetailPresenter.m118045a(activity, calendarEvent);
    }

    /* renamed from: a */
    public static void m116867a(Activity activity, CalendarEventInstance calendarEventInstance) {
        EventDetailPresenter.m117987a(activity, calendarEventInstance);
    }

    /* renamed from: a */
    public static void m116870a(Context context, EventChipViewData eventChipViewData) {
        if (eventChipViewData.getCalendarEventInstance().getSource() == CalendarEvent.Source.ANDROID) {
            LocalDetailPresenter.m118001a(context, eventChipViewData, false);
        } else {
            EventDetailPresenter.m117988a(context, eventChipViewData, false);
        }
    }

    /* renamed from: a */
    public static void m116871a(Context context, CalendarEvent calendarEvent) {
        TriplesDetailPresenter.m118046a(context, calendarEvent);
    }

    /* renamed from: a */
    public static void m116872a(Context context, OverallReminderData overallReminderData) {
        ReminderDetailPresenter.m118017a(context, overallReminderData);
    }

    /* renamed from: b */
    public static Intent m116877b(Context context, String str, long j) {
        return VchatDetailPresenter.m118061b(context, str, j);
    }

    /* renamed from: a */
    public static void m116866a(Activity activity, CalendarEvent calendarEvent, String str) {
        ShareDetailPresenter.m118035a(activity, calendarEvent, str);
    }

    /* renamed from: a */
    public static void m116864a(Activity activity, EventChipViewData eventChipViewData, Boolean bool) {
        if (eventChipViewData.getCalendarEventInstance().getSource() == CalendarEvent.Source.ANDROID) {
            LocalDetailPresenter.m118000a(activity, eventChipViewData);
        } else {
            EventDetailPresenter.m117986a(activity, eventChipViewData);
        }
        CalendarMainHitPoint.m124363a("event_details", eventChipViewData.getCalendarEventInstance().getEventServerId(), Long.valueOf(eventChipViewData.getCalendarEventInstance().getStartTime()));
    }

    /* renamed from: a */
    public static void m116869a(Context context, RoomViewInstance roomViewInstance, EventMeetingRoomData eventMeetingRoomData) {
        RoomInstanceDetailPresenter.m118027a(context, roomViewInstance, eventMeetingRoomData);
    }

    /* renamed from: a */
    public static void m116873a(Context context, String str, long j) {
        VchatDetailPresenter.m118060a(context, str, j);
    }

    /* renamed from: b */
    public static void m116879b(Context context, String str, String str2, long j, long j2) {
        AuthorizedDetailPresenter.m117976a(context, str, str2, j, j2);
    }

    /* renamed from: a */
    public static void m116868a(Context context, long j, String str, String str2, long j2, long j3) {
        ReminderDetailPresenter.m118016a(context, j, str, str2, j2, j3);
    }
}
