package com.ss.android.vc.meeting.module.sharebox;

import com.ss.android.vc.entity.request.ShareScreenToRoomEntityRequest;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.sharebox.j */
public final /* synthetic */ class C63032j {

    /* renamed from: a */
    public static final /* synthetic */ int[] f158866a;

    static {
        int[] iArr = new int[ShareScreenToRoomEntityRequest.ShareType.values().length];
        f158866a = iArr;
        iArr[ShareScreenToRoomEntityRequest.ShareType.SCREEN.ordinal()] = 1;
        iArr[ShareScreenToRoomEntityRequest.ShareType.MAGIC_SHARE.ordinal()] = 2;
    }
}
