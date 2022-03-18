package com.ss.android.lark.search.p2584b.p2589d;

import com.bytedance.lark.pb.search.recommend.v1.RecommendSection;
import com.ss.android.lark.pb.urecommend.LayoutStyle;
import com.ss.android.lark.pb.urecommend.RecommendSection;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.b.d.c */
public final /* synthetic */ class C53309c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f131810a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f131811b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f131812c;

    static {
        int[] iArr = new int[RecommendSection.RecommendType.values().length];
        f131810a = iArr;
        iArr[RecommendSection.RecommendType.ENTITY_RECOMMEND.ordinal()] = 1;
        iArr[RecommendSection.RecommendType.SEARCH_HISTORY.ordinal()] = 2;
        iArr[RecommendSection.RecommendType.ACTION_RECOMMEND.ordinal()] = 3;
        int[] iArr2 = new int[LayoutStyle.Style.values().length];
        f131811b = iArr2;
        iArr2[LayoutStyle.Style.CARD_STYLE.ordinal()] = 1;
        iArr2[LayoutStyle.Style.LIST_STYLE.ordinal()] = 2;
        int[] iArr3 = new int[RecommendSection.SectionType.values().length];
        f131812c = iArr3;
        iArr3[RecommendSection.SectionType.RECOMMEND_ENTITY.ordinal()] = 1;
        iArr3[RecommendSection.SectionType.SEARCH_HISTORY.ordinal()] = 2;
        iArr3[RecommendSection.SectionType.ACTION_RECOMMEND.ordinal()] = 3;
    }
}
