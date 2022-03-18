package com.ss.android.lark.passport.infra.util;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceId;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.passport.infra.util.j */
public class C49194j {
    /* renamed from: a */
    public static void m193951a(final boolean z, final AbstractC49392e eVar) {
        ServiceFinder.m193762q().getDeviceId(ServiceFinder.m193748c().getApplicationContext(), new IGetDataCallback<DeviceId>() {
            /* class com.ss.android.lark.passport.infra.util.C49194j.C491951 */

            /* renamed from: a */
            public void onSuccess(DeviceId deviceId) {
                String deviceId2 = deviceId.getDeviceId();
                if (deviceId != null && z) {
                    deviceId2 = C57859q.m224566b(deviceId2);
                }
                eVar.mo171341a(deviceId2);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                String displayMsg = errorResult.getDisplayMsg();
                if (TextUtils.isEmpty(displayMsg)) {
                    displayMsg = errorResult.getDebugMsg();
                }
                if (TextUtils.isEmpty(displayMsg)) {
                    displayMsg = errorResult.getMessage();
                }
                if (TextUtils.isEmpty(displayMsg)) {
                    displayMsg = LarkContext.getApplication().getString(R.string.Lark_Login_ErrorMessageOfOtherStatus);
                }
                eVar.mo171342b(displayMsg);
            }
        }, 5000);
    }
}
