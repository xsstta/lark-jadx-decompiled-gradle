package com.ss.android.lark.app.task;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.floating.LKUIFloat;
import com.ss.android.lark.floating.utils.AppStateHandler;
import com.ss.android.lark.platform.lifecycle.AppLifecycle;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InitFloatTask extends AbstractLaunchTask {

    /* renamed from: a */
    public final Map<AppStateHandler.AppStateObserver, AbstractC29586u> f72587a = new ConcurrentHashMap();

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        if (C26252ad.m94993b(context)) {
            LKUIFloat.m150802a((Application) context, new LKUIFloat.IFloatDependency() {
                /* class com.ss.android.lark.app.task.InitFloatTask.C289491 */

                @Override // com.ss.android.lark.floating.LKUIFloat.IFloatDependency
                /* renamed from: a */
                public Activity mo102716a() {
                    return AppLifecycle.m200904a().mo177978h();
                }

                @Override // com.ss.android.lark.floating.LKUIFloat.IFloatDependency
                /* renamed from: b */
                public boolean mo102718b() {
                    return AppLifecycle.m200904a().mo177975e();
                }

                @Override // com.ss.android.lark.floating.LKUIFloat.IFloatDependency
                /* renamed from: a */
                public void mo102717a(final AppStateHandler.AppStateObserver aVar) {
                    C289501 r0 = new AbstractC29586u() {
                        /* class com.ss.android.lark.app.task.InitFloatTask.C289491.C289501 */

                        @Override // com.ss.android.lark.biz.core.api.AbstractC29586u
                        public void onAppLifecycleChanged(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
                            aVar.mo140256a(aVar2.mo105887c(), aVar2.mo105886b());
                        }
                    };
                    AppLifecycle.m200904a().mo177967a(r0);
                    InitFloatTask.this.f72587a.put(aVar, r0);
                }
            });
        }
    }
}
