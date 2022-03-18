package com.ss.android.lark.app.p1358d;

import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.app.d.b */
public class C28879b {
    /* renamed from: a */
    private boolean m105697a() {
        boolean syncUpdateDevice = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).syncUpdateDevice(RomUtils.m94957l(), RomUtils.m94959n(), RomUtils.m94958m());
        if (!syncUpdateDevice) {
            Log.m165383e("MainInit", "updateDevice failed: ");
        }
        return syncUpdateDevice;
    }

    /* renamed from: a */
    public void mo102535a(int i) {
        if ((i & 1) == 1) {
            m105697a();
        }
    }
}
