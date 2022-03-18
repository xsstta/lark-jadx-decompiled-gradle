package com.ss.android.lark.passport.infra.service;

import com.ss.android.lark.manis.annotation.RemoteCallback;
import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;
import kotlin.Metadata;

@RemoteService
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/passport/infra/service/ILogoutUserServiceRemote;", "Lee/android/framework/manis/interfaces/IHookInterface;", "logout", "", "callback", "Lcom/ss/android/lark/passport/infra/service/ILogoutUserServiceRemote$ILogoutCallBack;", "ILogoutCallBack", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface ILogoutUserServiceRemote extends IHookInterface {

    @RemoteCallback
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/passport/infra/service/ILogoutUserServiceRemote$ILogoutCallBack;", "", "onResult", "", "success", "", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote$a */
    public interface ILogoutCallBack {
        void onResult(boolean z);
    }

    void logout(ILogoutCallBack aVar);
}
