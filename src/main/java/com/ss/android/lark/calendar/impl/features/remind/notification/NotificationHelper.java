package com.ss.android.lark.calendar.impl.features.remind.notification;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.ss.android.lark.calendar.api.entity.CalendarNotice;
import com.ss.android.lark.calendar.impl.features.events.detail.EventDetailActivity;
import com.ss.android.lark.calendar.impl.features.events.detail.EventDetailSource;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.OverallReminderData;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30034ad;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/remind/notification/NotificationHelper;", "", "()V", "getCalendarNoticeFromReminder", "Lcom/ss/android/lark/calendar/api/entity/CalendarNotice;", "overallReminder", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/OverallReminderData;", "getEventDetailIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "getIntentForWsChannelOfflinePush", "bizExtra", "", "getPendingIntentForReminder", "Landroid/app/PendingIntent;", "calendarNotice", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.remind.a.b */
public final class NotificationHelper {

    /* renamed from: a */
    public static final NotificationHelper f82536a = new NotificationHelper();

    private NotificationHelper() {
    }

    /* renamed from: a */
    private final Intent m123031a(Context context) {
        return new Intent(context, EventDetailActivity.class);
    }

    @JvmStatic
    /* renamed from: a */
    public static final CalendarNotice m123033a(OverallReminderData overallReminderData) {
        String str;
        String str2;
        Intrinsics.checkParameterIsNotNull(overallReminderData, "overallReminder");
        String calendarId = overallReminderData.getCalendarId();
        if (calendarId != null) {
            str = calendarId;
        } else {
            str = "";
        }
        String key = overallReminderData.getKey();
        if (key != null) {
            str2 = key;
        } else {
            str2 = "";
        }
        long originalTime = overallReminderData.getOriginalTime();
        long startTime = overallReminderData.getStartTime();
        long endTime = overallReminderData.getEndTime();
        int minutes = overallReminderData.getMinutes();
        String eventId = overallReminderData.getEventId();
        if (eventId == null) {
            eventId = "";
        }
        return new CalendarNotice(str, str2, originalTime, startTime, endTime, minutes, eventId);
    }

    @JvmStatic
    /* renamed from: a */
    public static final PendingIntent m123030a(CalendarNotice calendarNotice) {
        Intrinsics.checkParameterIsNotNull(calendarNotice, "calendarNotice");
        GeneralHitPoint.m124194a(calendarNotice.getEventId(), calendarNotice.getMinuts(), "notification", "card");
        AbstractC30034ad adVar = C30022a.f74882a.settingDependency();
        Intrinsics.checkExpressionValueIsNotNull(adVar, "CalendarDependencyHolder…dency.settingDependency()");
        Context a = adVar.mo108177a();
        if (a == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("calendar_id", calendarNotice.getCalendarId());
        bundle.putString("key", calendarNotice.getCalendarKey());
        bundle.putLong("origin_time", calendarNotice.getCalendarOriginTime());
        bundle.putLong("calendar_event_start_time", calendarNotice.getCalendarStartTime());
        bundle.putLong("calendar_event_end_time", calendarNotice.getCalendarEndTime());
        bundle.putInt("enterDetailSource", EventDetailSource.FROM_CALENDAR_NOTIFICATION.getValue());
        Intent a2 = f82536a.m123031a(a);
        a2.addFlags(335544320);
        a2.putExtras(bundle);
        return PendingIntent.getActivity(a, (int) SystemClock.uptimeMillis(), a2, 134217728);
    }

    @JvmStatic
    /* renamed from: a */
    public static final Intent m123032a(String str) {
        boolean z;
        AbstractC30034ad adVar = C30022a.f74882a.settingDependency();
        Intrinsics.checkExpressionValueIsNotNull(adVar, "CalendarDependencyHolder…dency.settingDependency()");
        Context a = adVar.mo108177a();
        if (a != null) {
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            Intent a2 = f82536a.m123031a(a);
            a2.addFlags(335544320);
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("CalendarId");
                String string2 = jSONObject.getString("Uid");
                long a3 = CalendarNotificationUtil.m123029a(jSONObject.getString("OriginalTime"), 0);
                long a4 = CalendarNotificationUtil.m123029a(jSONObject.getString("StartTime"), -1);
                Bundle bundle = new Bundle();
                bundle.putString("calendar_id", string);
                bundle.putString("key", string2);
                bundle.putLong("origin_time", a3);
                bundle.putLong("calendar_event_start_time", a4);
                bundle.putInt("enterDetailSource", EventDetailSource.FROM_CALENDAR_NOTIFICATION.getValue());
                a2.putExtras(bundle);
                return a2;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
