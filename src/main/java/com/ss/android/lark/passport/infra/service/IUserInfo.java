package com.ss.android.lark.passport.infra.service;

import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/passport/infra/service/IUserInfo;", "", "Getter", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.service.p */
public interface IUserInfo {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\r\u001a\u00020\u0003H&J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/passport/infra/service/IUserInfo$Getter;", "", "env", "", "getEnv", "()Ljava/lang/String;", "isAnonymousSession", "", "()Z", "lastUseTimestamp", "", "getLastUseTimestamp", "()J", "getLoginDeviceId", "getLoginInfo", "Lcom/ss/android/lark/passport/signinsdk_api/entity/LoginInfo;", "getLogoutToken", "getSession", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.service.p$a */
    public interface Getter {
        /* renamed from: a */
        String mo171591a();

        /* renamed from: b */
        String mo171592b();

        /* renamed from: c */
        String mo171593c();

        /* renamed from: d */
        LoginInfo mo171594d();
    }
}
