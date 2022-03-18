package com.ss.android.lark.app.taskv2.preload;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.integrator.EMMModuleProvider;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.platform.lifecycle.AppLifecycle;
import com.ss.android.lark.utils.ApiUtils;

/* access modifiers changed from: package-private */
public class InitEMMTask extends AsyncLaunchTask {

    /* renamed from: a */
    public Context f72776a;

    /* renamed from: b */
    private AbstractC29586u f72777b = new AbstractC29586u() {
        /* class com.ss.android.lark.app.taskv2.preload.InitEMMTask.C290401 */

        @Override // com.ss.android.lark.biz.core.api.AbstractC29586u
        public void onAppLifecycleChanged(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
            boolean c;
            if (aVar != null && aVar2 != null && aVar.mo105887c() != (c = aVar2.mo105887c()) && c && ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isLogin()) {
                EMMModuleProvider.m154351a().getEMMService().mo136533c(InitEMMTask.this.f72776a);
            }
        }
    };

    /* renamed from: c */
    private C28513a.AbstractC28514a f72778c = new C28513a.AbstractC28514a() {
        /* class com.ss.android.lark.app.taskv2.preload.InitEMMTask.C290412 */

        @Override // com.ss.android.lark.account_provider.integrator.C28513a.AbstractC28514a
        public void onLoginStatusChanged(int i) {
            Log.m165389i("InitEMMTask", "onLoginStatusChanged called. current loginType:" + i);
            if (i == 0) {
                EMMModuleProvider.m154351a().getEMMService().mo136532b(InitEMMTask.this.f72776a);
            } else {
                EMMModuleProvider.m154351a().getEMMService().mo136531a(InitEMMTask.this.f72776a);
            }
        }
    };

    InitEMMTask() {
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        this.f72776a = context;
        Log.m165389i("InitEMMTask", "InitEMMTask execute called.");
        EMMModuleProvider.m154351a().getEMMService().mo136531a(this.f72776a);
        C28513a.m104512a(this.f72778c);
        AppLifecycle.m200904a().mo177967a(this.f72777b);
    }
}
