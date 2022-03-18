package com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.helper;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.lark.calendar.impl.features.events.detail.C31238b;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.RSVPStatus;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\u000b¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/calendarbot/helper/CalendarBotMessageHelper;", "", "()V", "convertToAttendeeStatus", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;", "replyStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "convertToRsvpStatus", "getCalendarContentTime", "", "calendarContent", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalContent;", "getMessageCardStatus", "", "startEventDetailActivity", "", "startActivity", "Landroid/app/Activity;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.a.b */
public final class CalendarBotMessageHelper {

    /* renamed from: a */
    public static final CalendarBotMessageHelper f82307a = new CalendarBotMessageHelper();

    private CalendarBotMessageHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m122704a(CalendarInternalContent calendarInternalContent) {
        Intrinsics.checkParameterIsNotNull(calendarInternalContent, "calendarContent");
        return C32646c.m125249a(calendarInternalContent.getStartTime(), calendarInternalContent.getEndTime(), calendarInternalContent.isAllDay());
    }

    /* renamed from: b */
    private final int m122705b(CalendarInternalContent calendarInternalContent) {
        if (calendarInternalContent.getEventCardStatus() == CalendarInternalContent.CalendarEventCardStatus.INVALID) {
            return 3;
        }
        if (calendarInternalContent.getEventCardDiffInfo() != null) {
            return 2;
        }
        return 1;
    }

    /* renamed from: a */
    public final RSVPStatus mo117528a(CalendarEventAttendee.Status status) {
        if (status != null) {
            int i = C32190c.f82309b[status.ordinal()];
            if (i == 1) {
                return RSVPStatus.NEEDS_ACTION;
            }
            if (i == 2) {
                return RSVPStatus.ACCEPT;
            }
            if (i == 3) {
                return RSVPStatus.TENTATIVE;
            }
        }
        return RSVPStatus.DECLINE;
    }

    /* renamed from: a */
    public final CalendarEventAttendee.Status mo117529a(RSVPStatus rSVPStatus) {
        if (rSVPStatus != null) {
            int i = C32190c.f82308a[rSVPStatus.ordinal()];
            if (i == 1) {
                return CalendarEventAttendee.Status.NEEDS_ACTION;
            }
            if (i == 2) {
                return CalendarEventAttendee.Status.ACCEPT;
            }
            if (i == 3) {
                return CalendarEventAttendee.Status.TENTATIVE;
            }
        }
        return CalendarEventAttendee.Status.DECLINE;
    }

    /* renamed from: a */
    public final void mo117530a(Activity activity, CalendarInternalContent calendarInternalContent) {
        Intrinsics.checkParameterIsNotNull(calendarInternalContent, "calendarContent");
        if (activity != null) {
            Bundle bundle = new Bundle();
            bundle.putString("key", calendarInternalContent.getEventKey());
            bundle.putString("calendar_id", calendarInternalContent.getCalendarId());
            bundle.putLong("origin_time", calendarInternalContent.getOriginalTime());
            bundle.putString("calendar_meeting_title", calendarInternalContent.getSummary());
            bundle.putInt("calendar_message_card_status", m122705b(calendarInternalContent));
            C31238b.m116863a(activity, bundle);
        }
    }
}
