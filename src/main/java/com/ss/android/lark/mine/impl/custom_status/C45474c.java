package com.ss.android.lark.mine.impl.custom_status;

import com.bytedance.lark.pb.contact.v1.UserCustomStatus;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.c */
public final /* synthetic */ class C45474c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f115070a;

    static {
        int[] iArr = new int[UserCustomStatus.Type.values().length];
        f115070a = iArr;
        iArr[UserCustomStatus.Type.IN_MEETING.ordinal()] = 1;
        iArr[UserCustomStatus.Type.ON_LEAVE.ordinal()] = 2;
    }
}
