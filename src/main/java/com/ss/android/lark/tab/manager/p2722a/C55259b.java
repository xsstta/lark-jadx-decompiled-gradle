package com.ss.android.lark.tab.manager.p2722a;

import com.ss.android.lark.tab.service.entity.ChatTab;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.manager.a.b */
public final /* synthetic */ class C55259b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f136368a;

    static {
        int[] iArr = new int[ChatTab.ChatTabType.values().length];
        f136368a = iArr;
        iArr[ChatTab.ChatTabType.UNKNOWN.ordinal()] = 1;
        iArr[ChatTab.ChatTabType.MESSAGE.ordinal()] = 2;
        iArr[ChatTab.ChatTabType.DOC_SPACE.ordinal()] = 3;
        iArr[ChatTab.ChatTabType.DOC.ordinal()] = 4;
    }
}
