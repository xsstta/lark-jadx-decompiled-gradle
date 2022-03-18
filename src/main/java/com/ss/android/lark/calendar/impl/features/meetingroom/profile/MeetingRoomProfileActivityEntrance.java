package com.ss.android.lark.calendar.impl.features.meetingroom.profile;

import android.content.Context;
import com.ss.android.lark.calendar.p1430a.C30022a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bJ\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileActivityEntrance;", "", "()V", "startMeetingRoomActivityNeedSubscription", "", "context", "Landroid/content/Context;", "calendarId", "", "startTime", "", "endTime", "timeZoneId", "repeatRule", "startMeetingRoomActivityNormal", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.a */
public final class MeetingRoomProfileActivityEntrance {

    /* renamed from: a */
    public static final MeetingRoomProfileActivityEntrance f82147a = new MeetingRoomProfileActivityEntrance();

    private MeetingRoomProfileActivityEntrance() {
    }

    /* renamed from: a */
    public final void mo117232a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        if (C30022a.f74883b.mo112709q()) {
            if (C30022a.f74883b.mo112716x()) {
                C30022a.f74882a.appRouter().mo108210a(MeetingRoomProfileActivityNew.class).mo108153a("meeting_room_calendar_id", str).mo108156b(context);
            } else {
                C30022a.f74882a.appRouter().mo108210a(MeetingRoomProfileActivity.class).mo108153a("meeting_room_calendar_id", str).mo108156b(context);
            }
        }
    }

    /* renamed from: a */
    public final void mo117233a(Context context, String str, long j, long j2, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        Intrinsics.checkParameterIsNotNull(str2, "timeZoneId");
        Intrinsics.checkParameterIsNotNull(str3, "repeatRule");
        if (C30022a.f74883b.mo112709q()) {
            if (C30022a.f74883b.mo112716x()) {
                C30022a.f74882a.appRouter().mo108210a(MeetingRoomProfileActivityNew.class).mo108153a("meeting_room_calendar_id", str).mo108152a("meeting_event_start_time", Long.valueOf(j)).mo108152a("meeting_event_end_time", Long.valueOf(j2)).mo108153a("event_rule", str3).mo108153a("time_zone_id", str2).mo108154a("need_subscriber_info", true).mo108156b(context);
            } else {
                C30022a.f74882a.appRouter().mo108210a(MeetingRoomProfileActivity.class).mo108153a("meeting_room_calendar_id", str).mo108152a("meeting_event_start_time", Long.valueOf(j)).mo108152a("meeting_event_end_time", Long.valueOf(j2)).mo108153a("event_rule", str3).mo108153a("time_zone_id", str2).mo108154a("need_subscriber_info", true).mo108156b(context);
            }
        }
    }
}
