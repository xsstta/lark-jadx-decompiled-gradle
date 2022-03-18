package com.ss.android.lark.app.taskv2.preload;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.integrator.VPNSDKModuleProvider;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountChangeObserver;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.platform.lifecycle.AppLifecycle;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;

public class initVPNSDKTask extends AsyncLaunchTask {

    /* renamed from: a */
    public Context f72861a;

    /* renamed from: b */
    private C28513a.AbstractC28514a f72862b = new C28513a.AbstractC28514a() {
        /* class com.ss.android.lark.app.taskv2.preload.initVPNSDKTask.C290761 */

        @Override // com.ss.android.lark.account_provider.integrator.C28513a.AbstractC28514a
        public void onLoginStatusChanged(int i) {
            Log.m165389i("initVPNSDKTask", "onLoginStatusChanged called. current loginType:" + i);
            if (i == 0) {
                VPNSDKModuleProvider.m154355a().getVPNSDKService().mo197207a();
            }
        }
    };

    /* renamed from: c */
    private AbstractC29586u f72863c = new AbstractC29586u() {
        /* class com.ss.android.lark.app.taskv2.preload.initVPNSDKTask.C290772 */

        @Override // com.ss.android.lark.biz.core.api.AbstractC29586u
        public void onAppLifecycleChanged(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
            boolean c;
            Log.m165389i("initVPNSDKTask", "onAppLifecycleChanged called");
            if (aVar != null && aVar2 != null && aVar.mo105887c() != (c = aVar2.mo105887c()) && c && ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isLogin()) {
                VPNSDKModuleProvider.m154355a().getVPNSDKService().mo197212c(initVPNSDKTask.this.f72861a);
            }
        }
    };

    /* renamed from: g */
    private IAccountChangeObserver.AbstractC49385a f72864g = new IAccountChangeObserver.AbstractC49385a() {
        /* class com.ss.android.lark.app.taskv2.preload.initVPNSDKTask.C290783 */

        @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountChangeObserver.AbstractC49385a
        public void onAccountChange(LoginInfo loginInfo) {
            Log.m165389i("initVPNSDKTask", "AccountChanged and logoutAll called");
            VPNSDKModuleProvider.m154355a().getVPNSDKService().mo197210b();
        }
    };

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        Log.m165389i("initVPNSDKTask", "executed called");
        this.f72861a = context;
        VPNSDKModuleProvider.m154355a().getVPNSDKService().mo197211b(LarkContext.getApplication());
        if (((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isLogin()) {
            VPNSDKModuleProvider.m154355a().getVPNSDKService().mo197208a(this.f72861a);
        }
        C28513a.m104512a(this.f72862b);
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getAccountObserver().mo172398a(this.f72864g);
        AppLifecycle.m200904a().mo177967a(this.f72863c);
    }
}
