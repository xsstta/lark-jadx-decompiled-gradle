package com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state;

import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.data.MmKeepEditResponse;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.k */
public final /* synthetic */ class C46249k {

    /* renamed from: a */
    public static final /* synthetic */ int[] f116535a;

    static {
        int[] iArr = new int[MmKeepEditResponse.EditStatus.values().length];
        f116535a = iArr;
        iArr[MmKeepEditResponse.EditStatus.KEEP.ordinal()] = 1;
        iArr[MmKeepEditResponse.EditStatus.OCCUPIED.ordinal()] = 2;
        iArr[MmKeepEditResponse.EditStatus.HEARTBEAT_EXPIRED.ordinal()] = 3;
    }
}
