package com.ss.android.lark.calendar.impl.features.events.detail.idata;

import com.bytedance.lark.pb.calendar.v1.CalendarEventDisplayInfo;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0012\u001a\u00020\rH&J\b\u0010\u0013\u001a\u00020\rH&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IHeaderData;", "", "getEventServerId", "", "getEventStartTime", "getEventSummary", "getHeaderColor", "", "getRuleText", "getTimeText", "getVideoMeetingVisibility", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/VideoMeetingVisibility;", "isHasChatGroup", "", "isHasMeetingMinute", "isShowChatGroupIcon", "Lcom/bytedance/lark/pb/calendar/v1/CalendarEventDisplayInfo$ButtonDisplayType;", "isShowMeetingMinuteIcon", "isShowRule", "isStartAndEndSameDay", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.idata.c */
public interface IHeaderData {
    /* renamed from: a */
    int[] mo113680a();

    /* renamed from: b */
    String mo113681b();

    /* renamed from: c */
    String mo113682c();

    /* renamed from: d */
    boolean mo113683d();

    /* renamed from: e */
    boolean mo113684e();

    /* renamed from: f */
    String mo113685f();

    /* renamed from: g */
    boolean mo113686g();

    /* renamed from: h */
    boolean mo113687h();

    /* renamed from: i */
    CalendarEventDisplayInfo.ButtonDisplayType mo113688i();

    /* renamed from: j */
    CalendarEventDisplayInfo.ButtonDisplayType mo113689j();
}
