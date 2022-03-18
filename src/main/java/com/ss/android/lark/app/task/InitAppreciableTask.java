package com.ss.android.lark.app.task;

import android.content.Context;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.larksuite.framework.thread.ThreadFactoryC26153m;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Configuration;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.platform.lifecycle.AppLifecycle;
import com.ss.android.lark.platform.statistics.p2502b.C51973e;
import com.ss.android.lark.utils.LarkContext;
import java.util.concurrent.Executors;

public class InitAppreciableTask extends AbstractLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        AppreciableKit.m107394b().mo103513a(LarkContext.getApplication(), new Configuration(C51973e.m201592j(), C37239a.m146648b().mo136951a("lark.appreciable_sdk.event_send_to_tea")), Executors.newSingleThreadExecutor(new ThreadFactoryC26153m("InitAppreciableTask")));
        AppLifecycle.m200904a().mo177967a($$Lambda$InitAppreciableTask$jQ4xQ2x7owHdPOSmzhjXXjcTcQE.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m106071a(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
        if (aVar2.mo105887c() != aVar.mo105887c()) {
            AppreciableKit.m107394b().mo103520a(aVar2.mo105887c(), System.currentTimeMillis());
        }
    }
}
