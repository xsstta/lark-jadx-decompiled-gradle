package com.ss.android.lark.passport.signinsdk_api.interfaces;

import com.ss.android.lark.manis.annotation.RemoteCallback;
import com.ss.android.lark.manis.annotation.RemoteService;
import com.ss.android.lark.passport.signinsdk_api.entity.SessionResult;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface ILoginManisService extends IHookInterface {

    @RemoteCallback
    /* renamed from: com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginManisService$a */
    public interface AbstractC49387a {
        void onError(int i, String str);

        void onSuccess(SessionResult sessionResult);
    }

    void switchLoginTenantUser(String str, AbstractC49387a aVar);
}
