package com.ss.android.lark.calendar.impl.features.events.detail.videoUrl;

import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.VideoType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.a */
public final /* synthetic */ class C31407a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f79584a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f79585b;

    static {
        int[] iArr = new int[VideoType.values().length];
        f79584a = iArr;
        iArr[VideoType.LARK_LIVE_HOST.ordinal()] = 1;
        iArr[VideoType.OTHER.ordinal()] = 2;
        int[] iArr2 = new int[VideoType.values().length];
        f79585b = iArr2;
        iArr2[VideoType.LARK_LIVE_HOST.ordinal()] = 1;
        iArr2[VideoType.OTHER.ordinal()] = 2;
        iArr2[VideoType.GOOGLE_VIDEO_CONFERENCE.ordinal()] = 3;
    }
}
