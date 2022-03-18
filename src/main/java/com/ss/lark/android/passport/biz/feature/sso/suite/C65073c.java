package com.ss.lark.android.passport.biz.feature.sso.suite;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.log.MonitorUtil;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.entity.NotifySettings;
import com.ss.android.lark.passport.signinsdk_api.entity.SuiteInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IQRLoginService;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.lark.android.passport.biz.feature.sso.suite.C65066a;
import java.util.HashMap;

/* renamed from: com.ss.lark.android.passport.biz.feature.sso.suite.c */
public class C65073c extends C49020a implements C65066a.AbstractC65067a {

    /* renamed from: c */
    private C65066a.AbstractC65067a.AbstractC65068a f163877c;

    /* renamed from: d */
    private final String f163878d;

    /* renamed from: e */
    private final SuiteInfo f163879e;

    /* renamed from: f */
    private final boolean f163880f;

    /* renamed from: g */
    private final int f163881g;

    /* renamed from: h */
    private final IQRLoginService f163882h = ((IQRLoginService) ServiceFinder.m193746a(IQRLoginService.class));

    @Override // com.ss.lark.android.passport.biz.feature.sso.suite.C65066a.AbstractC65067a
    /* renamed from: c */
    public String mo224199c() {
        return this.f163878d;
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.suite.C65066a.AbstractC65067a
    public SuiteInfo cx_() {
        return this.f163879e;
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.suite.C65066a.AbstractC65067a
    public boolean cy_() {
        return this.f163880f;
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.suite.C65066a.AbstractC65067a
    /* renamed from: e */
    public int mo224202e() {
        return this.f163881g;
    }

    /* renamed from: a */
    public void mo224207a(C65066a.AbstractC65067a.AbstractC65068a aVar) {
        this.f163877c = aVar;
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.suite.C65066a.AbstractC65067a
    /* renamed from: b */
    public void mo224197b(final IGetDataCallback<Boolean> iGetDataCallback) {
        ServiceFinder.m193761p().pullDeviceNotifySetting(mo171176d().wrapAndAddGetDataCallback(new IGetDataCallback<NotifySettings>() {
            /* class com.ss.lark.android.passport.biz.feature.sso.suite.C65073c.C650752 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("SuiteConfirmModel", errorResult.toString());
                iGetDataCallback.onSuccess(Boolean.valueOf(ServiceFinder.m193761p().getDeviceManager().mo171040h()));
            }

            /* renamed from: a */
            public void onSuccess(NotifySettings notifySettings) {
                ServiceFinder.m193761p().getDeviceManager().mo171031b(notifySettings.isDisableMobileNotify());
                ServiceFinder.m193761p().getDeviceManager().mo171035c(!notifySettings.isStillNotifyAt());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(Boolean.valueOf(notifySettings.isDisableMobileNotify()));
                }
            }
        }));
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.suite.C65066a.AbstractC65067a
    /* renamed from: a */
    public void mo224195a(IGetDataCallback<BaseStepData> iGetDataCallback) {
        if (TextUtils.isEmpty(this.f163878d)) {
            this.f163877c.mo224203a();
        } else if (this.f163882h != null) {
            if (this.f123074a != null) {
                this.f123074a.appendOneSceneMonitorParam("template", "suite");
            }
            HashMap hashMap = new HashMap(2);
            hashMap.put("template", "suite");
            hashMap.put("token", MonitorUtil.m193717b(this.f163878d));
            this.f123075b.mo171467b("n_action_auth_login_cancel_request", "suite qrCancel", hashMap);
            mo171171a(this.f163882h.qrLoginCancel(this.f123074a, this.f163878d, iGetDataCallback));
        } else {
            this.f123075b.mo171471d("SuiteConfirmModel", "cancelQRLogin find IQRLoginService fail and service is null");
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.suite.C65066a.AbstractC65067a
    /* renamed from: b */
    public void mo224198b(final boolean z, final IGetDataCallback<Boolean> iGetDataCallback) {
        ServiceFinder.m193761p().putDeviceNotifySetting(z, mo171176d().wrapAndAddGetDataCallback(new IGetDataCallback<String>() {
            /* class com.ss.lark.android.passport.biz.feature.sso.suite.C65073c.C650741 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                UserSP.getInstance().putBoolean("closeAfterDesk", z);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(Boolean.valueOf(z));
                }
            }
        }));
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.suite.C65066a.AbstractC65067a
    /* renamed from: a */
    public void mo224196a(boolean z, IGetDataCallback<BaseStepData> iGetDataCallback) {
        String str;
        if (TextUtils.isEmpty(this.f163878d)) {
            this.f163877c.mo224203a();
        } else if (this.f163882h != null) {
            if (this.f123074a != null) {
                this.f123074a.appendOneSceneMonitorParam("template", "suite");
                UniContext uniContext = this.f123074a;
                if (z) {
                    str = "all";
                } else {
                    str = "single";
                }
                uniContext.appendOneSceneMonitorParam("auth_type", str);
            }
            HashMap hashMap = new HashMap(3);
            hashMap.put("isMultiLogin", Boolean.valueOf(z));
            hashMap.put("template", "suite");
            hashMap.put("token", MonitorUtil.m193717b(this.f163878d));
            this.f123075b.mo171467b("n_action_auth_login_confirm_request", "suite qrConfirm", hashMap);
            mo171171a(this.f163882h.qrLoginConfirm(this.f123074a, this.f163878d, null, z, iGetDataCallback));
        } else {
            this.f123075b.mo171471d("SuiteConfirmModel", "confirmQRLogin find IQRLoginService fail and service is null");
        }
    }

    public C65073c(int i, String str, SuiteInfo suiteInfo) {
        this.f163878d = str;
        this.f163879e = suiteInfo;
        this.f163881g = i;
        this.f163880f = suiteInfo.showSubTitleOption;
    }
}
