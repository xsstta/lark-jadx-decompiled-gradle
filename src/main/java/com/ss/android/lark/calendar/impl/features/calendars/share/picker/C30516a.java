package com.ss.android.lark.calendar.impl.features.calendars.share.picker;

import com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.ShareState;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.a */
public final /* synthetic */ class C30516a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f76340a;

    static {
        int[] iArr = new int[ShareState.STATE.values().length];
        f76340a = iArr;
        iArr[ShareState.STATE.LOADING.ordinal()] = 1;
        iArr[ShareState.STATE.SUCCESS.ordinal()] = 2;
        iArr[ShareState.STATE.FAILED.ordinal()] = 3;
    }
}
