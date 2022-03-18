package com.ss.android.lark.passport.device.manage;

import android.text.TextUtils;
import android.view.View;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.device.manage.IDevicesManageContract;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.entity.Devices;
import java.util.List;

/* renamed from: com.ss.android.lark.passport.device.manage.c */
public class C48971c extends BasePresenter<IDevicesManageContract.AbstractC48962a, IDevicesManageContract.AbstractC48964b, IDevicesManageContract.AbstractC48964b.AbstractC48965a> {

    /* renamed from: a */
    public static final PassportLog f122985a = PassportLog.f123351c.mo171474a();

    /* renamed from: b */
    private void m192879b() {
        m192880c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IDevicesManageContract.AbstractC48964b.AbstractC48965a createViewDelegate() {
        return new C48974b();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m192879b();
    }

    /* renamed from: c */
    private void m192880c() {
        ((IDevicesManageContract.AbstractC48962a) getModel()).mo170986a(new UIGetDataCallback(new IGetDataCallback<List<Devices.Device>>() {
            /* class com.ss.android.lark.passport.device.manage.C48971c.C489721 */

            /* renamed from: a */
            public void onSuccess(List<Devices.Device> list) {
                if (list == null || list.size() <= 0) {
                    ((IDevicesManageContract.AbstractC48964b) C48971c.this.getView()).mo170973a(R.string.Lark_Legacy_SyncOnlineDeviceInfoFail);
                }
                ((IDevicesManageContract.AbstractC48964b) C48971c.this.getView()).mo170977a(list, ((IDevicesManageContract.AbstractC48962a) C48971c.this.getModel()).mo170985a());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                String str;
                if (TextUtils.isEmpty(errorResult.getDebugMsg())) {
                    str = "fetchDevices error";
                } else {
                    str = errorResult.getDebugMsg();
                }
                PassportLog passportLog = C48971c.f122985a;
                passportLog.mo171471d("DevicesManage", "fetchDevices failed: " + str);
            }
        }));
    }

    /* renamed from: com.ss.android.lark.passport.device.manage.c$a */
    private class C48973a implements IDevicesManageContract.AbstractC48962a.AbstractC48963a {
        private C48973a() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.passport.device.manage.c$b */
    public class C48974b implements IDevicesManageContract.AbstractC48964b.AbstractC48965a {
        private C48974b() {
        }

        @Override // com.ss.android.lark.passport.device.manage.IDevicesManageContract.AbstractC48964b.AbstractC48965a
        /* renamed from: a */
        public void mo170989a(final View view, String str) {
            ((IDevicesManageContract.AbstractC48962a) C48971c.this.getModel()).mo170988a(str, new UIGetDataCallback(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.passport.device.manage.C48971c.C48974b.C489751 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((IDevicesManageContract.AbstractC48964b) C48971c.this.getView()).mo170973a(R.string.Lark_Legacy_LogoutFail);
                }

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    if (bool.booleanValue()) {
                        ((IDevicesManageContract.AbstractC48964b) C48971c.this.getView()).mo170974a(view);
                    } else {
                        ((IDevicesManageContract.AbstractC48964b) C48971c.this.getView()).mo170973a(R.string.Lark_Legacy_LogoutFail);
                    }
                }
            }));
        }
    }

    public C48971c(IDevicesManageContract.AbstractC48962a aVar, IDevicesManageContract.AbstractC48964b bVar) {
        super(aVar, bVar);
        aVar.mo170987a(new C48973a());
    }
}
