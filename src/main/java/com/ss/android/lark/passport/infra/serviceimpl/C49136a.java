package com.ss.android.lark.passport.infra.serviceimpl;

import com.ss.android.lark.passport.infra.service.IUserListService;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.serviceimpl.a */
public final /* synthetic */ class C49136a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f123389a;

    static {
        int[] iArr = new int[IUserListService.UserLoginSource.values().length];
        f123389a = iArr;
        iArr[IUserListService.UserLoginSource.ByPull.ordinal()] = 1;
        iArr[IUserListService.UserLoginSource.ByOnPushFetch.ordinal()] = 2;
        iArr[IUserListService.UserLoginSource.ByLogin.ordinal()] = 3;
    }
}
