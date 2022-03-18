package com.ss.android.lark.app.task;

import android.content.Context;
import com.facebook.soloader.SoLoader;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.core.C39350a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.platform.p2476b.C51714a;
import com.ss.android.lark.platform.p2484e.C51798a;
import com.ss.android.lark.platform.p2486g.C51808a;
import com.ss.android.lark.utils.ApiUtils;

public class InitAsyncMiscTask extends AsyncLaunchTask {
    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m106075h() {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).initBrowserModule();
    }

    /* renamed from: g */
    private void m106074g() {
        if (C37239a.m146648b().mo136952a("lark.browser.sync.session.launch", false)) {
            CoreThreadPool.getSerialTaskHandler().postDelayed($$Lambda$InitAsyncMiscTask$Y2JRzOxsTCw4kjZy_XAFSdmFf0.INSTANCE, 4);
        } else {
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getBrowserModule();
        }
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        SoLoader.init(context, false);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).notifySettingModulehandleLoginStatusChangedEvent(((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isLogin());
        DynamicConfigModule.m145552b().mo136170b();
        if (!"SSO".equals(C39350a.f100658a)) {
            Log.m165379d("InitAsyncMiscTask", "current buildType =" + C39350a.f100658a);
            m106074g();
        }
        C51808a.m200830a().mo177931c();
        C51798a.m200809a().mo177926a();
        C51714a.m200518a(true);
    }
}
