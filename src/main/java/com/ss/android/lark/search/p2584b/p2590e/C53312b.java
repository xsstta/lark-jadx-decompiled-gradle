package com.ss.android.lark.search.p2584b.p2590e;

import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import com.ss.android.lark.searchcommon.service.entity.ChatType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.b.e.b */
public final /* synthetic */ class C53312b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f131822a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f131823b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f131824c;

    static {
        int[] iArr = new int[ChatType.values().length];
        f131822a = iArr;
        iArr[ChatType.PRIVATE.ordinal()] = 1;
        iArr[ChatType.OUTER.ordinal()] = 2;
        iArr[ChatType.PUBLIC_JOIN.ordinal()] = 3;
        iArr[ChatType.PUBLIC_ABSENT.ordinal()] = 4;
        int[] iArr2 = new int[SearchContext.DocSearchContentType.values().length];
        f131823b = iArr2;
        iArr2[SearchContext.DocSearchContentType.ONLY_MATCH_TITLE.ordinal()] = 1;
        iArr2[SearchContext.DocSearchContentType.ONLY_MATCH_COMMENT.ordinal()] = 2;
        iArr2[SearchContext.DocSearchContentType.ALL.ordinal()] = 3;
        int[] iArr3 = new int[SearchContext.DocSearchContentType.values().length];
        f131824c = iArr3;
        iArr3[SearchContext.DocSearchContentType.ONLY_MATCH_TITLE.ordinal()] = 1;
        iArr3[SearchContext.DocSearchContentType.ONLY_MATCH_COMMENT.ordinal()] = 2;
        iArr3[SearchContext.DocSearchContentType.ALL.ordinal()] = 3;
    }
}
