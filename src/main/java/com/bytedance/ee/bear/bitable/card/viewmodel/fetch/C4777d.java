package com.bytedance.ee.bear.bitable.card.viewmodel.fetch;

import com.bytedance.ee.bear.bitable.card.model.enums.EFieldType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.viewmodel.fetch.d */
public final /* synthetic */ class C4777d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f14040a;

    static {
        int[] iArr = new int[EFieldType.values().length];
        f14040a = iArr;
        iArr[EFieldType.DATE_TIME.ordinal()] = 1;
        iArr[EFieldType.CREATE_TIME.ordinal()] = 2;
        iArr[EFieldType.MODIFY_TIME.ordinal()] = 3;
        iArr[EFieldType.SINGLE_LINK.ordinal()] = 4;
        iArr[EFieldType.DUPLEX_LINK.ordinal()] = 5;
        iArr[EFieldType.NUMBER.ordinal()] = 6;
        iArr[EFieldType.SINGLE_SELECT.ordinal()] = 7;
        iArr[EFieldType.MULTI_SELECT.ordinal()] = 8;
        iArr[EFieldType.USER.ordinal()] = 9;
        iArr[EFieldType.CREATE_USER.ordinal()] = 10;
        iArr[EFieldType.MODIFY_USER.ordinal()] = 11;
        iArr[EFieldType.FORMULA.ordinal()] = 12;
        iArr[EFieldType.LOOKUP.ordinal()] = 13;
        iArr[EFieldType.ATTACHMENT.ordinal()] = 14;
    }
}
