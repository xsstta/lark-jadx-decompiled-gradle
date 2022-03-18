package com.ss.lark.android.passport.biz.feature.session;

import com.ss.lark.android.passport.biz.feature.constants.LogoutReason;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.session.d */
public final /* synthetic */ class C64964d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f163694a;

    static {
        int[] iArr = new int[LogoutReason.values().length];
        f163694a = iArr;
        iArr[LogoutReason.QUIT_TEAM.ordinal()] = 1;
        iArr[LogoutReason.UNREGISTER.ordinal()] = 2;
        iArr[LogoutReason.TENANT_DELETE.ordinal()] = 3;
        iArr[LogoutReason.RESIGN.ordinal()] = 4;
    }
}
