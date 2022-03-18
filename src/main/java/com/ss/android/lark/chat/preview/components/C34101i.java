package com.ss.android.lark.chat.preview.components;

import com.larksuite.component.ui.display.manager.ZoomLevel;
import com.ss.android.lark.chat.preview.entity.component.Tag;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.components.i */
public final /* synthetic */ class C34101i {

    /* renamed from: a */
    public static final /* synthetic */ int[] f88169a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f88170b;

    static {
        int[] iArr = new int[Tag.values().length];
        f88169a = iArr;
        iArr[Tag.APPROVAL.ordinal()] = 1;
        iArr[Tag.OFFICIAL.ordinal()] = 2;
        iArr[Tag.ONCALL.ordinal()] = 3;
        iArr[Tag.ONCALL_OFFLINE.ordinal()] = 4;
        iArr[Tag.EXTERNAL.ordinal()] = 5;
        int[] iArr2 = new int[ZoomLevel.values().length];
        f88170b = iArr2;
        iArr2[ZoomLevel.SMALL.ordinal()] = 1;
        iArr2[ZoomLevel.NORMAL.ordinal()] = 2;
        iArr2[ZoomLevel.LARGE1.ordinal()] = 3;
        iArr2[ZoomLevel.LARGE2.ordinal()] = 4;
        iArr2[ZoomLevel.LARGE3.ordinal()] = 5;
        iArr2[ZoomLevel.LARGE4.ordinal()] = 6;
    }
}
