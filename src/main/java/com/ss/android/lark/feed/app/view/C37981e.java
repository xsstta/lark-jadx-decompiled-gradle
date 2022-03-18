package com.ss.android.lark.feed.app.view;

import com.ss.android.lark.feed.app.shortcut.ShortCutStausManager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.view.e */
public final /* synthetic */ class C37981e {

    /* renamed from: a */
    public static final /* synthetic */ int[] f97513a;

    static {
        int[] iArr = new int[ShortCutStausManager.ShortCutStatus.values().length];
        f97513a = iArr;
        iArr[ShortCutStausManager.ShortCutStatus.OPENDING.ordinal()] = 1;
        iArr[ShortCutStausManager.ShortCutStatus.OPEN.ordinal()] = 2;
        iArr[ShortCutStausManager.ShortCutStatus.CLOSE.ordinal()] = 3;
    }
}
