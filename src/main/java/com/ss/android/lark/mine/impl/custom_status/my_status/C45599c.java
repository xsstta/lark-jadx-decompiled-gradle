package com.ss.android.lark.mine.impl.custom_status.my_status;

import com.bytedance.lark.pb.contact.v1.UserCustomStatusDuration;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.c */
public final /* synthetic */ class C45599c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f115230a;

    static {
        int[] iArr = new int[UserCustomStatusDuration.values().length];
        f115230a = iArr;
        iArr[UserCustomStatusDuration.MINUTES_30.ordinal()] = 1;
        iArr[UserCustomStatusDuration.HOUR_1.ordinal()] = 2;
        iArr[UserCustomStatusDuration.HOUR_2.ordinal()] = 3;
        iArr[UserCustomStatusDuration.HOUR_4.ordinal()] = 4;
        iArr[UserCustomStatusDuration.UNTIL_TONIGHT.ordinal()] = 5;
    }
}
