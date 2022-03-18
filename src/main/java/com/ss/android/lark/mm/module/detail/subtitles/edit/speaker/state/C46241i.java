package com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.i */
public final /* synthetic */ class C46241i {

    /* renamed from: a */
    public static final /* synthetic */ int[] f116520a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f116521b;

    static {
        int[] iArr = new int[MmEditState.values().length];
        f116520a = iArr;
        iArr[MmEditState.INIT.ordinal()] = 1;
        iArr[MmEditState.REFRESH_DATA.ordinal()] = 2;
        iArr[MmEditState.ENTERING.ordinal()] = 3;
        iArr[MmEditState.EDITING.ordinal()] = 4;
        iArr[MmEditState.IDLE.ordinal()] = 5;
        iArr[MmEditState.ERROR.ordinal()] = 6;
        int[] iArr2 = new int[MmEditState.values().length];
        f116521b = iArr2;
        iArr2[MmEditState.INIT.ordinal()] = 1;
        iArr2[MmEditState.EDITING.ordinal()] = 2;
        iArr2[MmEditState.IDLE.ordinal()] = 3;
        iArr2[MmEditState.ERROR.ordinal()] = 4;
    }
}
