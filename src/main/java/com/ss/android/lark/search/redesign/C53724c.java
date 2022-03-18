package com.ss.android.lark.search.redesign;

import com.ss.android.lark.searchcommon.constant.SearchCommonConstants;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.c */
public final /* synthetic */ class C53724c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f132597a;

    static {
        int[] iArr = new int[SearchCommonConstants.SearchHistorySource.values().length];
        f132597a = iArr;
        iArr[SearchCommonConstants.SearchHistorySource.MAIN.ordinal()] = 1;
        iArr[SearchCommonConstants.SearchHistorySource.MESSAGE.ordinal()] = 2;
        iArr[SearchCommonConstants.SearchHistorySource.SPACE.ordinal()] = 3;
        iArr[SearchCommonConstants.SearchHistorySource.WIKI.ordinal()] = 4;
        iArr[SearchCommonConstants.SearchHistorySource.CHAT.ordinal()] = 5;
        iArr[SearchCommonConstants.SearchHistorySource.USER.ordinal()] = 6;
    }
}
