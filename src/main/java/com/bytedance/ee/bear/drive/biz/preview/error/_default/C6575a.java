package com.bytedance.ee.bear.drive.biz.preview.error._default;

import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.preview.error._default.a */
public final /* synthetic */ class C6575a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f18064a;

    static {
        int[] iArr = new int[ErrCode.values().length];
        f18064a = iArr;
        iArr[ErrCode.DEFAULT.ordinal()] = 1;
        iArr[ErrCode.REQUEST_TRANSFORM_SERVER_EXP.ordinal()] = 2;
        iArr[ErrCode.REQUEST_FILE_INFO_EXP.ordinal()] = 3;
        iArr[ErrCode.RUST_SUBMIT_ERROR.ordinal()] = 4;
        iArr[ErrCode.NO_NETWORK.ordinal()] = 5;
        iArr[ErrCode.RUST_NOT_LOGIN.ordinal()] = 6;
        iArr[ErrCode.COPY_FAILED.ordinal()] = 7;
    }
}
