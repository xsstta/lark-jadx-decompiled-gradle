package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import com.bytedance.lark.pb.calendar.v1.EventVideoMeetingConfig;
import com.bytedance.lark.pb.calendar.v1.VideoMeeting;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.VideoType;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006J\u000e\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006J\u000e\u0010\t\u001a\n \u0007*\u0004\u0018\u00010\n0\nJ\u000e\u0010\u000b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006J\u000e\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u00110\u0011J\u0006\u0010\u0012\u001a\u00020\u0003J\u0013\u0010\u0013\u001a\n \u0007*\u0004\u0018\u00010\u00140\u0014¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVideoMeeting;", "Ljava/io/Serializable;", "videoMeeting", "Lcom/bytedance/lark/pb/calendar/v1/VideoMeeting;", "(Lcom/bytedance/lark/pb/calendar/v1/VideoMeeting;)V", "getGoogleMorePhoneNumberUrl", "", "kotlin.jvm.PlatformType", "getGooglePhoneNumber", "getGoogleVideoConfigs", "Lcom/bytedance/lark/pb/calendar/v1/EventVideoMeetingConfig$GoogleVideoMeetingConfigs;", "getId", "getMeetingType", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/VideoType;", "getMeetingUrl", "getNumber", "getOtherVideoConfigs", "Lcom/bytedance/lark/pb/calendar/v1/EventVideoMeetingConfig$OtherVideoMeetingConfigs;", "getVchat", "isExpired", "", "()Ljava/lang/Boolean;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DoVideoMeeting implements Serializable {
    private final VideoMeeting videoMeeting;

    public final VideoMeeting getVchat() {
        return this.videoMeeting;
    }

    public final String getGoogleMorePhoneNumberUrl() {
        return this.videoMeeting.google_configs.more_phone_number_url;
    }

    public final String getGooglePhoneNumber() {
        return this.videoMeeting.google_configs.phone_number;
    }

    public final EventVideoMeetingConfig.GoogleVideoMeetingConfigs getGoogleVideoConfigs() {
        return this.videoMeeting.google_configs;
    }

    public final String getId() {
        return this.videoMeeting.unique_id;
    }

    public final String getNumber() {
        return this.videoMeeting.meeting_number;
    }

    public final EventVideoMeetingConfig.OtherVideoMeetingConfigs getOtherVideoConfigs() {
        return this.videoMeeting.other_configs;
    }

    public final Boolean isExpired() {
        return this.videoMeeting.is_expired;
    }

    public final String getMeetingUrl() {
        String str = this.videoMeeting.meeting_url;
        if (str != null) {
            return str;
        }
        return "";
    }

    public final VideoType getMeetingType() {
        VideoType.Companion aVar = VideoType.Companion;
        VideoMeeting.VideoMeetingType videoMeetingType = this.videoMeeting.video_meeting_type;
        Intrinsics.checkExpressionValueIsNotNull(videoMeetingType, "videoMeeting.video_meeting_type");
        return aVar.mo114049a(videoMeetingType.getValue());
    }

    public DoVideoMeeting(VideoMeeting videoMeeting2) {
        Intrinsics.checkParameterIsNotNull(videoMeeting2, "videoMeeting");
        this.videoMeeting = videoMeeting2;
    }
}
