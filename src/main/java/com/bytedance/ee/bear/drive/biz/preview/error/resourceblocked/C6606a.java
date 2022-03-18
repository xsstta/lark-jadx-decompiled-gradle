package com.bytedance.ee.bear.drive.biz.preview.error.resourceblocked;

import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.resourceblocked.a */
public final /* synthetic */ class C6606a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f18102a;

    static {
        int[] iArr = new int[ErrCode.values().length];
        f18102a = iArr;
        iArr[ErrCode.STATIC_RESOURCE_FROZEN_BY_ADMIN.ordinal()] = 1;
        iArr[ErrCode.STATIC_RESOURCE_SHREDDED_BY_ADMIN.ordinal()] = 2;
    }
}
