package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import com.bytedance.lark.pb.calendar.v1.PushCalendarEventVideoMeetingChange;
import com.bytedance.lark.pb.calendar.v1.VideoMeeting;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoEventVideoMeetingInfo;", "Ljava/io/Serializable;", "meetingInfo", "Lcom/bytedance/lark/pb/calendar/v1/PushCalendarEventVideoMeetingChange$EventVideoMeetingInfo;", "(Lcom/bytedance/lark/pb/calendar/v1/PushCalendarEventVideoMeetingChange$EventVideoMeetingInfo;)V", "getCalendarId", "", "getKey", "getOriginalTime", "", "getVideoMeeting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVideoMeeting;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DoEventVideoMeetingInfo implements Serializable {
    private final PushCalendarEventVideoMeetingChange.EventVideoMeetingInfo meetingInfo;

    public final String getCalendarId() {
        String str = this.meetingInfo.calendar_id;
        if (str != null) {
            return str;
        }
        return "";
    }

    public final String getKey() {
        String str = this.meetingInfo.key;
        if (str != null) {
            return str;
        }
        return "";
    }

    public final long getOriginalTime() {
        Long l = this.meetingInfo.original_time;
        if (l != null) {
            return l.longValue();
        }
        return 0;
    }

    public final DoVideoMeeting getVideoMeeting() {
        VideoMeeting videoMeeting = this.meetingInfo.video_meeting;
        if (videoMeeting == null) {
            return null;
        }
        Intrinsics.checkExpressionValueIsNotNull(videoMeeting, "it");
        return new DoVideoMeeting(videoMeeting);
    }

    public DoEventVideoMeetingInfo(PushCalendarEventVideoMeetingChange.EventVideoMeetingInfo eventVideoMeetingInfo) {
        Intrinsics.checkParameterIsNotNull(eventVideoMeetingInfo, "meetingInfo");
        this.meetingInfo = eventVideoMeetingInfo;
    }
}
