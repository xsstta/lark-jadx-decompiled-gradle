package com.ss.android.lark.mine.impl.custom_status.setting;

import com.bytedance.lark.pb.contact.v1.CustomStatusSyncField;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.c */
public final /* synthetic */ class C45641c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f115271a;

    static {
        int[] iArr = new int[CustomStatusSyncField.values().length];
        f115271a = iArr;
        iArr[CustomStatusSyncField.IS_SYN_ON_LEAVE.ordinal()] = 1;
        iArr[CustomStatusSyncField.IS_SYN_MEETING.ordinal()] = 2;
        iArr[CustomStatusSyncField.IS_SYN_SCHEDULE.ordinal()] = 3;
    }
}
