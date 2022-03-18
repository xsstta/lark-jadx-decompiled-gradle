package com.ss.android.lark.calendar.impl.features.events.edit.p1521c;

import com.bytedance.lark.pb.calendar.v1.EventVideoMeetingConfig;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.VideoType;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.f */
public final /* synthetic */ class C31583f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f80076a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f80077b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f80078c;

    static {
        int[] iArr = new int[EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType.values().length];
        f80076a = iArr;
        iArr[EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType.LIVE.ordinal()] = 1;
        iArr[EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType.VIDEO_MEETING.ordinal()] = 2;
        int[] iArr2 = new int[VideoType.values().length];
        f80077b = iArr2;
        iArr2[VideoType.VCHAT.ordinal()] = 1;
        iArr2[VideoType.LARK_LIVE_HOST.ordinal()] = 2;
        iArr2[VideoType.OTHER.ordinal()] = 3;
        iArr2[VideoType.NO_VIDEO_MEETING.ordinal()] = 4;
        int[] iArr3 = new int[CalendarEvent.Span.values().length];
        f80078c = iArr3;
        iArr3[CalendarEvent.Span.THIS_EVENT.ordinal()] = 1;
        iArr3[CalendarEvent.Span.ALL_EVENTS.ordinal()] = 2;
    }
}
