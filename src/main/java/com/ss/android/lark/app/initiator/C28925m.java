package com.ss.android.lark.app.initiator;

import android.content.Context;
import android.content.res.Configuration;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.ss.android.lark.app.task.InitBaseComponentTask;
import com.ss.android.lark.app.task.InitImSdkSimpleTask;
import com.ss.android.lark.app.task.InitProcessTerminatorTask;
import com.ss.android.lark.app.task.SpInitorTask;
import com.ss.android.lark.app.task.WaitNecessaryTask;
import com.ss.android.lark.app.task.base.AppLauncherTaskScheduler;
import com.ss.android.lark.app.taskv2.central.InitFeatureGatingTask;
import com.ss.android.lark.app.taskv2.central.InitLanguageTaskForSimple;
import com.ss.android.lark.app.taskv2.central.InitRustSdkTaskForSimple;
import com.ss.android.lark.app.taskv2.central.InitTTNetTaskForSimple;
import com.ss.android.lark.app.taskv2.central.InitUIComponentTaskForSimple;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.sdk.C53254m;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57765ac;

/* renamed from: com.ss.android.lark.app.initiator.m */
public class C28925m implements AbstractC28914d {

    /* renamed from: a */
    final AppLauncherTaskScheduler f72541a = new AppLauncherTaskScheduler();

    @Override // com.ss.android.lark.app.initiator.AbstractC28914d
    /* renamed from: a */
    public void mo102660a(Configuration configuration) {
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28914d
    /* renamed from: b */
    public void mo102662b(Configuration configuration) {
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28914d
    /* renamed from: d */
    public void mo102664d(Context context) {
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28914d
    /* renamed from: b */
    public void mo102661b(Context context) {
        C53254m.m205920a(context);
        WaitNecessaryTask waitNecessaryTask = new WaitNecessaryTask();
        waitNecessaryTask.mo102766b(SpInitorTask.class);
        this.f72541a.mo102769a(waitNecessaryTask).mo102769a(new InitTTNetTaskForSimple()).mo102769a(new InitUIComponentTaskForSimple()).mo102770a(context);
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28914d
    /* renamed from: c */
    public void mo102663c(Context context) {
        this.f72541a.mo102769a(new InitImSdkSimpleTask());
        ILaunchTask initOPMonitorTaskForSimple = ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).getInitOPMonitorTaskForSimple();
        if (initOPMonitorTaskForSimple != null) {
            this.f72541a.mo102769a(initOPMonitorTaskForSimple);
        }
        this.f72541a.mo102770a(context);
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28914d
    /* renamed from: a */
    public void mo102659a(Context context) {
        if (C57765ac.m224192f(context) || C57765ac.m224188b(context)) {
            this.f72541a.mo102769a(new InitProcessTerminatorTask()).mo102769a(new InitBaseComponentTask()).mo102769a(new InitFeatureGatingTask()).mo102769a(new SpInitorTask()).mo102769a(new InitRustSdkTaskForSimple()).mo102769a(new InitLanguageTaskForSimple()).mo102770a(context);
        } else {
            System.exit(0);
        }
    }
}
