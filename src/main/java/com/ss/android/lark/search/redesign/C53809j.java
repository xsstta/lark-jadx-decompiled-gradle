package com.ss.android.lark.search.redesign;

import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.service.entity.history.SearchInfoHistory;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.j */
public final /* synthetic */ class C53809j {

    /* renamed from: a */
    public static final /* synthetic */ int[] f132834a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f132835b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f132836c;

    static {
        int[] iArr = new int[Scene.Type.values().length];
        f132834a = iArr;
        iArr[Scene.Type.SEARCH_MESSAGES.ordinal()] = 1;
        iArr[Scene.Type.SEARCH_FILE.ordinal()] = 2;
        iArr[Scene.Type.SEARCH_LINK.ordinal()] = 3;
        int[] iArr2 = new int[Scene.Type.values().length];
        f132835b = iArr2;
        iArr2[Scene.Type.SEARCH_MESSAGES.ordinal()] = 1;
        iArr2[Scene.Type.SEARCH_FILE.ordinal()] = 2;
        iArr2[Scene.Type.SEARCH_LINK.ordinal()] = 3;
        int[] iArr3 = new int[SearchInfoHistory.MessageSubSource.Type.values().length];
        f132836c = iArr3;
        iArr3[SearchInfoHistory.MessageSubSource.Type.ALL.ordinal()] = 1;
        iArr3[SearchInfoHistory.MessageSubSource.Type.FILE.ordinal()] = 2;
        iArr3[SearchInfoHistory.MessageSubSource.Type.LINK.ordinal()] = 3;
    }
}
