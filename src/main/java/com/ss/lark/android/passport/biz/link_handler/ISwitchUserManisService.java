package com.ss.lark.android.passport.biz.link_handler;

import com.ss.android.lark.manis.annotation.RemoteCallback;
import com.ss.android.lark.manis.annotation.RemoteService;
import com.ss.android.lark.passport.signinsdk_api.entity.SessionResult;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface ISwitchUserManisService extends IHookInterface {

    @RemoteCallback
    /* renamed from: com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService$a */
    public interface AbstractC65155a {
        void onError(int i, String str);

        void onSuccess(SessionResult sessionResult);
    }

    void switchUser(String str, String str2, String str3, AbstractC65155a aVar);
}
