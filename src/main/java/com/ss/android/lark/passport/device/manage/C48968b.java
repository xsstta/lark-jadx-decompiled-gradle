package com.ss.android.lark.passport.device.manage;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.passport.device.manage.IDevicesManageContract;
import com.ss.android.lark.passport.device.service.impl.C48987c;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.entity.Devices;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceManager;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService;
import java.util.List;

/* renamed from: com.ss.android.lark.passport.device.manage.b */
public class C48968b extends BaseModel implements IDevicesManageContract.AbstractC48962a {

    /* renamed from: a */
    public static final PassportLog f122977a = PassportLog.f123351c.mo171474a();

    /* renamed from: b */
    private IDevicesManageContract.AbstractC48962a.AbstractC48963a f122978b;

    /* renamed from: c */
    private final IDeviceService f122979c = ServiceFinder.m193761p();

    /* renamed from: d */
    private final IDeviceManager f122980d = C48987c.m192916a();

    @Override // com.ss.android.lark.passport.device.manage.IDevicesManageContract.AbstractC48962a
    /* renamed from: a */
    public int mo170985a() {
        return 0;
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f122978b = null;
    }

    @Override // com.ss.android.lark.passport.device.manage.IDevicesManageContract.AbstractC48962a
    /* renamed from: a */
    public void mo170987a(IDevicesManageContract.AbstractC48962a.AbstractC48963a aVar) {
        this.f122978b = aVar;
    }

    @Override // com.ss.android.lark.passport.device.manage.IDevicesManageContract.AbstractC48962a
    /* renamed from: a */
    public void mo170986a(final IGetDataCallback<List<Devices.Device>> iGetDataCallback) {
        this.f122980d.mo171023a((IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Devices>() {
            /* class com.ss.android.lark.passport.device.manage.C48968b.C489691 */

            /* renamed from: a */
            public void onSuccess(Devices devices) {
                if (iGetDataCallback != null) {
                    C48968b.f122977a.mo171465b("n_action_device_list_request_succ", "callback in DevicesManageModel");
                    iGetDataCallback.onSuccess(devices.getSessions());
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                String str;
                if (TextUtils.isEmpty(errorResult.getDebugMsg())) {
                    str = "errCode= " + errorResult.getErrorCode();
                } else {
                    str = errorResult.getDebugMsg();
                }
                C48968b.f122977a.mo171471d("n_action_device_list_request_fail", "callback in DevicesManageModel, errMsg=" + str);
            }
        }));
    }

    @Override // com.ss.android.lark.passport.device.manage.IDevicesManageContract.AbstractC48962a
    /* renamed from: a */
    public void mo170988a(String str, final IGetDataCallback<Boolean> iGetDataCallback) {
        this.f122979c.deleteDevice(str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.passport.device.manage.C48968b.C489702 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(bool);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        }));
    }
}
