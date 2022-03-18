package com.ss.lark.android.passport.biz.compat.login.serviceimpl;

import android.content.Context;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.SessionResult;
import com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginManisService;
import com.ss.lark.android.passport.biz.compat.tenant.C64471a;

@RemoteServiceImpl(service = ILoginManisService.class)
public class LoginManisServiceImpl implements ILoginManisService {
    public final PassportLog log = PassportLog.f123351c.mo171474a();
    public final Context mContext;

    public LoginManisServiceImpl(Context context) {
        this.mContext = context;
    }

    public void switchUser(TenantInfo tenantInfo, final ILoginManisService.AbstractC49387a aVar) {
        C64395b.m253103a().mo172413a(tenantInfo, new IGetDataCallback<SessionResult>() {
            /* class com.ss.lark.android.passport.biz.compat.login.serviceimpl.LoginManisServiceImpl.C643922 */

            /* renamed from: a */
            public void onSuccess(SessionResult sessionResult) {
                if (aVar != null) {
                    LoginManisServiceImpl.this.log.mo171465b("LoginManisServiceImpl", "switchLoginTenantUser success");
                    aVar.onSuccess(sessionResult);
                    return;
                }
                LoginManisServiceImpl.this.log.mo171471d("LoginManisServiceImpl", "callback is null");
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                LoginManisServiceImpl.this.log.mo171471d("LoginManisServiceImpl", "onError");
                ILoginManisService.AbstractC49387a aVar = aVar;
                if (aVar != null) {
                    aVar.onError(errorResult.getErrorCode(), errorResult.getDisplayMsg());
                }
                if (errorResult.getErrorCode() == 4401) {
                    UDToast.build(LoginManisServiceImpl.this.mContext).mo91643a(errorResult.getDebugMsg()).mo91640a(-2L).mo91655j().show();
                }
            }
        });
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginManisService
    public void switchLoginTenantUser(final String str, final ILoginManisService.AbstractC49387a aVar) {
        TenantInfo a = C64471a.f162788a.mo223057a(str);
        if (a != null) {
            switchUser(a, aVar);
            return;
        }
        C64471a.f162788a.mo223062a(ServiceFinder.m193752g().generateContextId(), str, new IGetDataCallback<TenantInfo>() {
            /* class com.ss.lark.android.passport.biz.compat.login.serviceimpl.LoginManisServiceImpl.C643911 */

            /* renamed from: a */
            public void onSuccess(TenantInfo tenantInfo) {
                LoginManisServiceImpl.this.log.mo171465b("LoginManisServiceImpl", "refreshTenantData success");
                LoginManisServiceImpl.this.switchUser(C64471a.f162788a.mo223057a(str), aVar);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ILoginManisService.AbstractC49387a aVar = aVar;
                if (aVar != null) {
                    aVar.onError(-101, "refreshTenantData onError");
                }
                LoginManisServiceImpl.this.log.mo171471d("LoginManisServiceImpl", "refreshTenantData error");
            }
        });
    }
}
