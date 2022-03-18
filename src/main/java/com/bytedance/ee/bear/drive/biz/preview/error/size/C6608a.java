package com.bytedance.ee.bear.drive.biz.preview.error.size;

import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.size.a */
public final /* synthetic */ class C6608a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f18105a;

    static {
        int[] iArr = new int[ErrCode.values().length];
        f18105a = iArr;
        iArr[ErrCode.DRIVE_FILE_OVER_SIZE.ordinal()] = 1;
        iArr[ErrCode.DRIVE_FILE_ZERO_SIZE.ordinal()] = 2;
    }
}
