package com.ss.android.lark.calendar.impl.features.events.edit.container;

import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.VideoType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.a */
public final /* synthetic */ class C31613a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f80165a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f80166b;

    static {
        int[] iArr = new int[VideoType.values().length];
        f80165a = iArr;
        iArr[VideoType.VCHAT.ordinal()] = 1;
        iArr[VideoType.OTHER.ordinal()] = 2;
        iArr[VideoType.LARK_LIVE_HOST.ordinal()] = 3;
        iArr[VideoType.UNKNOWN_VIDEO_MEETING_TYPE.ordinal()] = 4;
        iArr[VideoType.GOOGLE_VIDEO_CONFERENCE.ordinal()] = 5;
        iArr[VideoType.NO_VIDEO_MEETING.ordinal()] = 6;
        int[] iArr2 = new int[VideoType.values().length];
        f80166b = iArr2;
        iArr2[VideoType.UNKNOWN_VIDEO_MEETING_TYPE.ordinal()] = 1;
        iArr2[VideoType.GOOGLE_VIDEO_CONFERENCE.ordinal()] = 2;
    }
}
