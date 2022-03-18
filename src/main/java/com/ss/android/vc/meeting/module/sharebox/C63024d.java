package com.ss.android.vc.meeting.module.sharebox;

import com.ss.android.vc.meeting.module.sharebox.LocalShareCodeInputView2;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.sharebox.d */
public final /* synthetic */ class C63024d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f158833a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f158834b;

    static {
        int[] iArr = new int[LocalShareCodeInputView2.InputType.values().length];
        f158833a = iArr;
        iArr[LocalShareCodeInputView2.InputType.MEETING_NUMBER.ordinal()] = 1;
        iArr[LocalShareCodeInputView2.InputType.SHARE_CODE.ordinal()] = 2;
        int[] iArr2 = new int[LocalShareCodeInputView2.CodeFailReason.values().length];
        f158834b = iArr2;
        iArr2[LocalShareCodeInputView2.CodeFailReason.UNABLE_SHARE_TO_ROOM.ordinal()] = 1;
        iArr2[LocalShareCodeInputView2.CodeFailReason.INVALID_SHARE_CODE.ordinal()] = 2;
        iArr2[LocalShareCodeInputView2.CodeFailReason.NO_ROOM_IN_MEETING.ordinal()] = 3;
        iArr2[LocalShareCodeInputView2.CodeFailReason.UNKNOWN.ordinal()] = 4;
    }
}
