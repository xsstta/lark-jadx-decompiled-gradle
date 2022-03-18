package com.ss.android.lark.passport.infra.service;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49405t;
import java.util.List;

/* renamed from: com.ss.android.lark.passport.infra.service.o */
public interface AbstractC49129o {
    int getLocalAccountUserCount();

    List<TenantInfo.PendingUser> getPendingUsers();

    List<TenantInfo> getTenantData();

    void init();

    void refreshTenantData(String str, String str2, IGetDataCallback<TenantInfo> iGetDataCallback);

    void registerTenantInfoListener(AbstractC49405t tVar);

    void unInit();

    void unRegisterTenantInfoListener(AbstractC49405t tVar);
}
