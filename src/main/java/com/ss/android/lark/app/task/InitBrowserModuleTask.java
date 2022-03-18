package com.ss.android.lark.app.task;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.core.C39350a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;

public class InitBrowserModuleTask extends AsyncLaunchTask {

    /* renamed from: a */
    private final String f72568a = "InitBrowserModuleTask";

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m106131g() {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).initBrowserModule();
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        if (!"SSO".equals(C39350a.f100658a)) {
            Log.m165379d("InitBrowserModuleTask", "current buildType =" + C39350a.f100658a);
        } else if (C37239a.m146648b().mo136952a("lark.browser.sync.session.launch", false)) {
            CoreThreadPool.getSerialTaskHandler().postDelayed($$Lambda$InitBrowserModuleTask$_gIeleFfLsaVjP5efg_ugsi68t4.INSTANCE, 4);
        } else {
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getBrowserModule();
        }
    }
}
