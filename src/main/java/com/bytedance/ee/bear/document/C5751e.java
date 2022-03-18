package com.bytedance.ee.bear.document;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.e */
public final /* synthetic */ class C5751e {

    /* renamed from: a */
    public static final /* synthetic */ int[] f16221a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f16222b;

    static {
        int[] iArr = new int[RenderStage.values().length];
        f16221a = iArr;
        iArr[RenderStage.RENDERING.ordinal()] = 1;
        iArr[RenderStage.RENDER_CACHE_START.ordinal()] = 2;
        iArr[RenderStage.RENDER_CACHE_END.ordinal()] = 3;
        iArr[RenderStage.PULL_DATA_START.ordinal()] = 4;
        iArr[RenderStage.PULL_DATA_END.ordinal()] = 5;
        iArr[RenderStage.RENDER_DOC_START.ordinal()] = 6;
        iArr[RenderStage.RENDER_DOC_END.ordinal()] = 7;
        int[] iArr2 = new int[RenderStage.values().length];
        f16222b = iArr2;
        iArr2[RenderStage.RENDERING.ordinal()] = 1;
        iArr2[RenderStage.RENDER_CACHE_START.ordinal()] = 2;
        iArr2[RenderStage.RENDER_CACHE_END.ordinal()] = 3;
        iArr2[RenderStage.PULL_DATA_START.ordinal()] = 4;
        iArr2[RenderStage.PULL_DATA_END.ordinal()] = 5;
        iArr2[RenderStage.RENDER_DOC_START.ordinal()] = 6;
        iArr2[RenderStage.RENDER_DOC_END.ordinal()] = 7;
    }
}
