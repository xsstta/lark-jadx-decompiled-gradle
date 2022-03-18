package com.ss.android.vc.meeting.module.follow.share;

import com.ss.android.vc.meeting.module.follow.share.LocalShareCodeInputView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.follow.share.e */
public final /* synthetic */ class C61840e {

    /* renamed from: a */
    public static final /* synthetic */ int[] f155256a;

    static {
        int[] iArr = new int[LocalShareCodeInputView.CodeFailReason.values().length];
        f155256a = iArr;
        iArr[LocalShareCodeInputView.CodeFailReason.UNABLE_SHARE_TO_ROOM.ordinal()] = 1;
        iArr[LocalShareCodeInputView.CodeFailReason.INVALID_SHARE_CODE.ordinal()] = 2;
        iArr[LocalShareCodeInputView.CodeFailReason.UNKNOWN.ordinal()] = 3;
    }
}
