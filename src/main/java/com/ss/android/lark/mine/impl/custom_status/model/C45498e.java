package com.ss.android.lark.mine.impl.custom_status.model;

import com.bytedance.lark.pb.contact.v1.UserCustomStatus;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.model.e */
public final /* synthetic */ class C45498e {

    /* renamed from: a */
    public static final /* synthetic */ int[] f115119a;

    static {
        int[] iArr = new int[UserCustomStatus.Type.values().length];
        f115119a = iArr;
        iArr[UserCustomStatus.Type.NO_DISTURB.ordinal()] = 1;
        iArr[UserCustomStatus.Type.NOT_CUSTOM.ordinal()] = 2;
        iArr[UserCustomStatus.Type.ON_LEAVE.ordinal()] = 3;
        iArr[UserCustomStatus.Type.IN_MEETING.ordinal()] = 4;
    }
}
