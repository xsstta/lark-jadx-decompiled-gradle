package com.ss.lark.android.passport.biz.feature.sso;

import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginSourceInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginSourceService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ClaymoreImpl(ILoginSourceService.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/sso/LoginSourceService;", "Lcom/ss/android/lark/passport/signinsdk_api/interfaces/ILoginSourceService;", "()V", "sLoginSourceInfo", "Lcom/ss/android/lark/passport/signinsdk_api/entity/LoginSourceInfo;", "getLoginSource", "resetLoginSource", "", "setLoginSource", "info", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LoginSourceService implements ILoginSourceService {
    private LoginSourceInfo sLoginSourceInfo = new LoginSourceInfo();

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginSourceService
    public LoginSourceInfo getLoginSource() {
        return this.sLoginSourceInfo;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginSourceService
    public void resetLoginSource() {
        this.sLoginSourceInfo = new LoginSourceInfo();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginSourceService
    public void setLoginSource(LoginSourceInfo loginSourceInfo) {
        Intrinsics.checkParameterIsNotNull(loginSourceInfo, "info");
        this.sLoginSourceInfo.setLoginSource(loginSourceInfo.getLoginSource());
        this.sLoginSourceInfo.setUrl(loginSourceInfo.getUrl());
    }
}
