package com.ss.android.vc.meeting.module.gallery;

import com.ss.android.vc.meeting.utils.ParticipantUtil;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.gallery.d */
public final /* synthetic */ class C61906d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f155463a;

    static {
        int[] iArr = new int[ParticipantUtil.DIFF_TYPE.values().length];
        f155463a = iArr;
        iArr[ParticipantUtil.DIFF_TYPE.ALL_DIFF.ordinal()] = 1;
        iArr[ParticipantUtil.DIFF_TYPE.STATIC_VIEW_DIFF.ordinal()] = 2;
    }
}
