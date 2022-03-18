package com.ss.android.lark.app.task;

import android.app.Application;
import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.ss.android.lark.app.util.C29082b;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceId;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import java.util.Map;

public class InitAttributionTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        if (context instanceof Application) {
            try {
                C29082b.m106938a((Application) context);
            } catch (Exception e) {
                Log.m165398w("InitUGTask", "AppsFlyerInitor init", e);
            }
        }
        if (((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isLogin()) {
            Log.m165389i("InitUGTask", "account is login; cancel ug task");
        } else if (((ICoreApi) ApiUtils.getApi(ICoreApi.class)).hadGotInstallAttribution().booleanValue()) {
            Log.m165389i("InitUGTask", "user install attribution already got; cancel ug task");
        } else {
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).loadAttribution();
            C29082b.m106939a(new C29082b.AbstractC29085a() {
                /* class com.ss.android.lark.app.task.InitAttributionTask.C289341 */

                @Override // com.ss.android.lark.app.util.C29082b.AbstractC29085a
                /* renamed from: a */
                public void mo102685a(String str) {
                    C29082b.m106941b(this);
                    ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).onAFConversionDataFail(str);
                }

                @Override // com.ss.android.lark.app.util.C29082b.AbstractC29085a
                /* renamed from: a */
                public void mo102686a(Map<String, Object> map) {
                    C29082b.m106941b(this);
                    ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).onAFConversionDataSuccess(map);
                }
            });
            ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceId(context, new IGetDataCallback<DeviceId>() {
                /* class com.ss.android.lark.app.task.InitAttributionTask.C289352 */

                /* renamed from: a */
                public void onSuccess(DeviceId deviceId) {
                    ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).onGotDeviceID(deviceId.getDeviceId());
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).onGotDeviceID("");
                }
            });
        }
    }
}
