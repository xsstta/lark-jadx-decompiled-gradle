package com.ss.lark.android.passport.biz.service.impl;

import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.lark.android.passport.biz.account.UserInfoKeys;
import com.ss.lark.android.passport.biz.account.migration.LegacyDataManager;
import com.ss.lark.android.passport.biz.account.migration.UserInfoMigration;
import com.ss.lark.android.passport.biz.account.migration.bean.LegacyUser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/lark/android/passport/biz/service/impl/LegacyUserStorageService;", "Lcom/ss/android/lark/passport/infra/service/ILegacyUserStorageService;", "legacyUser", "Lcom/ss/lark/android/passport/biz/account/migration/bean/LegacyUser;", "legacyLoginInfo", "Lcom/ss/android/lark/passport/signinsdk_api/entity/LoginInfo;", "(Lcom/ss/lark/android/passport/biz/account/migration/bean/LegacyUser;Lcom/ss/android/lark/passport/signinsdk_api/entity/LoginInfo;)V", "newVersionUser", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "clear", "", "getLoginInfo", "getSession", "", "readUserFromDisk", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.service.impl.a */
public final class LegacyUserStorageService {

    /* renamed from: a */
    private final User f164264a;

    /* renamed from: a */
    public User mo224464a() {
        return this.f164264a;
    }

    /* renamed from: b */
    public final LoginInfo mo224465b() {
        return (LoginInfo) LegacyDataManager.f162572a.mo222847a(UserInfoKeys.f162530c, (Object) null);
    }

    public LegacyUserStorageService(LegacyUser legacyUser, LoginInfo loginInfo) {
        Intrinsics.checkParameterIsNotNull(legacyUser, "legacyUser");
        this.f164264a = UserInfoMigration.f162580a.mo222857a(legacyUser, loginInfo);
    }
}
