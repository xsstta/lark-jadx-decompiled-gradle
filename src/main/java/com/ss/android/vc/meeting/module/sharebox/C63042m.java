package com.ss.android.vc.meeting.module.sharebox;

import com.ss.android.vc.entity.request.ShareScreenToRoomEntityRequest;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.sharebox.m */
public final /* synthetic */ class C63042m {

    /* renamed from: a */
    public static final /* synthetic */ int[] f158890a;

    static {
        int[] iArr = new int[ShareScreenToRoomEntityRequest.JoinPath.values().length];
        f158890a = iArr;
        iArr[ShareScreenToRoomEntityRequest.JoinPath.JOIN_BY_SHARE_CODE.ordinal()] = 1;
        iArr[ShareScreenToRoomEntityRequest.JoinPath.JOIN_BY_MEETING_NUMBER.ordinal()] = 2;
    }
}
