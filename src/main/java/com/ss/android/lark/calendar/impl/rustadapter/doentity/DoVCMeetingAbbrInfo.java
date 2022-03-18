package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.AssociatedMeetingStatus;
import com.ss.android.lark.pb.videoconference.v1.VCMeetingAbbrInfo;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVCMeetingAbbrInfo;", "Ljava/io/Serializable;", "vcMeetingAbbrInfo", "Lcom/ss/android/lark/pb/videoconference/v1/VCMeetingAbbrInfo;", "(Lcom/ss/android/lark/pb/videoconference/v1/VCMeetingAbbrInfo;)V", "getMeetingStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/AssociatedMeetingStatus;", "getStartTime", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DoVCMeetingAbbrInfo implements Serializable {
    private final VCMeetingAbbrInfo vcMeetingAbbrInfo;

    public final long getStartTime() {
        Long l = this.vcMeetingAbbrInfo.start_time;
        Intrinsics.checkExpressionValueIsNotNull(l, "vcMeetingAbbrInfo.start_time");
        return l.longValue();
    }

    public final AssociatedMeetingStatus getMeetingStatus() {
        AssociatedMeetingStatus.Companion aVar = AssociatedMeetingStatus.Companion;
        VCMeetingAbbrInfo.MeetingStatus meetingStatus = this.vcMeetingAbbrInfo.meeting_status;
        Intrinsics.checkExpressionValueIsNotNull(meetingStatus, "vcMeetingAbbrInfo.meeting_status");
        return aVar.mo114035b(meetingStatus.getValue());
    }

    public DoVCMeetingAbbrInfo(VCMeetingAbbrInfo vCMeetingAbbrInfo) {
        Intrinsics.checkParameterIsNotNull(vCMeetingAbbrInfo, "vcMeetingAbbrInfo");
        this.vcMeetingAbbrInfo = vCMeetingAbbrInfo;
    }
}
