package com.ss.android.lark.search.redesign;

import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.h */
public final /* synthetic */ class C53787h {

    /* renamed from: a */
    public static final /* synthetic */ int[] f132794a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f132795b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f132796c;

    static {
        int[] iArr = new int[SearchContext.DocCategory.values().length];
        f132794a = iArr;
        iArr[SearchContext.DocCategory.DOC.ordinal()] = 1;
        iArr[SearchContext.DocCategory.WIKI.ordinal()] = 2;
        iArr[SearchContext.DocCategory.ALL.ordinal()] = 3;
        int[] iArr2 = new int[SearchContext.DocSearchContentType.values().length];
        f132795b = iArr2;
        iArr2[SearchContext.DocSearchContentType.ALL.ordinal()] = 1;
        iArr2[SearchContext.DocSearchContentType.ONLY_MATCH_TITLE.ordinal()] = 2;
        iArr2[SearchContext.DocSearchContentType.ONLY_MATCH_COMMENT.ordinal()] = 3;
        int[] iArr3 = new int[SearchContext.DocCategory.values().length];
        f132796c = iArr3;
        iArr3[SearchContext.DocCategory.DOC.ordinal()] = 1;
        iArr3[SearchContext.DocCategory.WIKI.ordinal()] = 2;
    }
}
