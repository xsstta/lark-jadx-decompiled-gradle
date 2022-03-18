package com.ss.android.lark.calendar.impl.features.events.edit.fragment.p1530e;

import com.bytedance.lark.pb.calendar.v1.EventVideoMeetingConfig;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.VideoType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e.c */
public final /* synthetic */ class C31712c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f80603a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f80604b;

    static {
        int[] iArr = new int[VideoType.values().length];
        f80603a = iArr;
        iArr[VideoType.VCHAT.ordinal()] = 1;
        iArr[VideoType.OTHER.ordinal()] = 2;
        int[] iArr2 = new int[EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType.values().length];
        f80604b = iArr2;
        iArr2[EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType.LIVE.ordinal()] = 1;
    }
}
