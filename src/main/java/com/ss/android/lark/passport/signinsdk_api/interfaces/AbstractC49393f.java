package com.ss.android.lark.passport.signinsdk_api.interfaces;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.signinsdk_api.entity.Tenant;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.passport.signinsdk_api.interfaces.f */
public interface AbstractC49393f {
    void asyncGetTenantsByIds(List<String> list, boolean z, IGetDataCallback<Map<String, String>> iGetDataCallback);

    Map<String, Tenant> getTenantsByIds(List<String> list);
}
