package com.ss.lark.android.passport.biz.account;

import com.ss.android.lark.passport.infra.service.IUserListStorageService;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.account.f */
public final /* synthetic */ class C64316f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f162538a;

    static {
        int[] iArr = new int[IUserListStorageService.BlockListOp.values().length];
        f162538a = iArr;
        iArr[IUserListStorageService.BlockListOp.Filter.ordinal()] = 1;
        iArr[IUserListStorageService.BlockListOp.RemoveFromBlockList.ordinal()] = 2;
        iArr[IUserListStorageService.BlockListOp.AddIntoBlockList.ordinal()] = 3;
        iArr[IUserListStorageService.BlockListOp.Noop.ordinal()] = 4;
    }
}
