package com.ss.android.lark.mine.impl.custom_status.model;

import com.bytedance.lark.pb.contact.v1.UserCustomStatus;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.model.k */
public final /* synthetic */ class C45528k {

    /* renamed from: a */
    public static final /* synthetic */ int[] f115131a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f115132b;

    static {
        int[] iArr = new int[UserCustomStatus.Type.values().length];
        f115131a = iArr;
        iArr[UserCustomStatus.Type.UNKNOWN.ordinal()] = 1;
        iArr[UserCustomStatus.Type.CUSTOM.ordinal()] = 2;
        int[] iArr2 = new int[UserCustomStatus.Type.values().length];
        f115132b = iArr2;
        iArr2[UserCustomStatus.Type.CUSTOM.ordinal()] = 1;
    }
}
