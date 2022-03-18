package com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.listener;

import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.VideoType;
import com.ss.android.lark.pb.videoconference.v1.GetAdminSettingsResponse;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0007H&J\"\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/listener/IVideoUrlListener;", "", "onClickEnterVideoMeeting", "", "videoType", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/VideoType;", "meetingId", "", "meetingUrl", "onClickPhoneNumber", "phoneNumber", "onClickPstnDetailPage", "adminSettingsResponse", "Lcom/ss/android/lark/pb/videoconference/v1/GetAdminSettingsResponse;", "onClickVideoMeetingSetting", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.a.a */
public interface IVideoUrlListener {
    /* renamed from: a */
    void mo114014a(VideoType videoType, String str, GetAdminSettingsResponse getAdminSettingsResponse);

    /* renamed from: a */
    void mo114015a(VideoType videoType, String str, String str2);

    /* renamed from: a */
    void mo114016a(String str);

    /* renamed from: b */
    void mo114017b(String str);
}
