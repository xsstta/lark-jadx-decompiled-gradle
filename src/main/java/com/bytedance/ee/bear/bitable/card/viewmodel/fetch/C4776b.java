package com.bytedance.ee.bear.bitable.card.viewmodel.fetch;

import com.bytedance.ee.bear.bitable.card.model.enums.EFieldType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.viewmodel.fetch.b */
public final /* synthetic */ class C4776b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f14036a;

    static {
        int[] iArr = new int[EFieldType.values().length];
        f14036a = iArr;
        iArr[EFieldType.SINGLE_LINK.ordinal()] = 1;
        iArr[EFieldType.DUPLEX_LINK.ordinal()] = 2;
        iArr[EFieldType.URL.ordinal()] = 3;
        iArr[EFieldType.TEXT.ordinal()] = 4;
        iArr[EFieldType.USER.ordinal()] = 5;
        iArr[EFieldType.CREATE_USER.ordinal()] = 6;
        iArr[EFieldType.MODIFY_USER.ordinal()] = 7;
        iArr[EFieldType.LOOKUP.ordinal()] = 8;
        iArr[EFieldType.FORMULA.ordinal()] = 9;
    }
}
