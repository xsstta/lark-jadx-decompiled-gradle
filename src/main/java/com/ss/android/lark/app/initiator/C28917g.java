package com.ss.android.lark.app.initiator;

import android.content.Context;
import com.ss.android.lark.app.task.InitBaseComponentTask;
import com.ss.android.lark.app.task.InitCrashMonitorTask;
import com.ss.android.lark.app.task.InitTTWebViewBasicTask;
import com.ss.android.lark.app.task.SpInitorTask;
import com.ss.android.lark.app.task.WaitNecessaryTask;
import com.ss.android.lark.app.task.base.AppLauncherTaskScheduler;
import com.ss.android.lark.app.task.initor.BaseModuleDependencyInitor;
import com.ss.android.lark.app.task.initor.WidgetModuleDependencyInitor;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.mail_api.IMailApi;
import com.ss.android.lark.platform.lifecycle.AppLifecycle;
import com.ss.android.lark.platform.p2493n.C51854a;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.app.initiator.g */
public class C28917g implements AbstractC28915e {

    /* renamed from: a */
    final AppLauncherTaskScheduler f72534a = new AppLauncherTaskScheduler();

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: d */
    public void mo102529d(Context context) {
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: a */
    public void mo102526a(Context context) {
        this.f72534a.mo102769a(new InitBaseComponentTask()).mo102769a(new SpInitorTask()).mo102769a(new InitTTWebViewBasicTask()).mo102770a(context);
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: b */
    public void mo102527b(Context context) {
        ((IMailApi) ApiUtils.getApi(IMailApi.class)).beforeAppOnCreate(context);
        WaitNecessaryTask waitNecessaryTask = new WaitNecessaryTask();
        waitNecessaryTask.mo102766b(SpInitorTask.class);
        this.f72534a.mo102769a(waitNecessaryTask).mo102770a(context);
        AppLifecycle.m200904a().mo177963a(new AppLifecycle.C51827a.C51828a(context).mo178000a($$Lambda$L43QGf0R05A90UtGJTKZpOLcXSM.INSTANCE).mo178002a());
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: c */
    public void mo102528c(Context context) {
        this.f72534a.mo102769a(new InitCrashMonitorTask()).mo102770a(context);
        BaseModuleDependencyInitor.m106344a(context);
        WidgetModuleDependencyInitor.m106670a(context);
        C51854a.m201096a(false);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).syncMainDomainSessionCookie();
        ((IMailApi) ApiUtils.getApi(IMailApi.class)).afterAppOnCreate(context);
    }
}
