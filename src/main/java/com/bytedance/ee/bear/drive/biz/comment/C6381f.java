package com.bytedance.ee.bear.drive.biz.comment;

import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.comment.f */
public final /* synthetic */ class C6381f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f17663a;

    static {
        int[] iArr = new int[ErrCode.values().length];
        f17663a = iArr;
        iArr[ErrCode.OWNER_DELETED_FILE.ordinal()] = 1;
        iArr[ErrCode.FILE_NOT_FOUND.ordinal()] = 2;
    }
}
