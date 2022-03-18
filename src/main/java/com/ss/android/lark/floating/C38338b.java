package com.ss.android.lark.floating;

import com.ss.android.lark.floating.enums.ShowPattern;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.floating.b */
public final /* synthetic */ class C38338b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f98445a;

    static {
        int[] iArr = new int[ShowPattern.values().length];
        f98445a = iArr;
        iArr[ShowPattern.CURRENT_ACTIVITY.ordinal()] = 1;
        iArr[ShowPattern.FOREGROUND.ordinal()] = 2;
        iArr[ShowPattern.BACKGROUND.ordinal()] = 3;
        iArr[ShowPattern.ALL_TIME.ordinal()] = 4;
    }
}
