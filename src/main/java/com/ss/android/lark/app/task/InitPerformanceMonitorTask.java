package com.ss.android.lark.app.task;

import android.content.Context;
import com.bytedance.apm.ApmAgent;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.app.monitor.filedeletion.C28931a;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.diskmanage.monitor.C36819a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.p1998a.C39098a;
import com.ss.android.lark.monitor.C48246q;
import com.ss.android.lark.platform.lifecycle.AppLifecycle;
import com.ss.android.lark.platform.p2494o.C51886a;
import com.ss.android.lark.platform.statistics.perf.C51995b;
import com.ss.android.lark.platform.statistics.perf.C52000d;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57881t;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class InitPerformanceMonitorTask extends AsyncLaunchTask {
    /* renamed from: g */
    private static void m106256g() {
        C39098a.m154357a();
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask
    /* renamed from: a */
    public List<Class<? extends ILaunchTask>> mo43818a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(InitCrashMonitorTask.class);
        return arrayList;
    }

    public static class CoreThreadPoolDep implements CoreThreadPool.AbstractC26132a {

        /* renamed from: a */
        private String f72622a = "coreThreadPoolMonitor";

        @Override // com.larksuite.framework.thread.CoreThreadPool.AbstractC26132a
        /* renamed from: a */
        public void mo93030a(JSONObject jSONObject) {
            if (jSONObject != null) {
                ApmAgent.monitorEvent(this.f72622a, null, jSONObject, null);
            }
        }

        @Override // com.larksuite.framework.thread.CoreThreadPool.AbstractC26132a
        /* renamed from: a */
        public boolean mo93031a(String str) {
            return C37239a.m146648b().mo136952a(str, false);
        }
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        C51995b.m201718a("init_battery_metrics", null, 1);
        CoreThreadPool.setDenpency(new CoreThreadPoolDep());
        m106255b(context);
        C52000d.m201770a().mo178242a(context);
        if (C37239a.m146648b().mo136951a("lark.setting.enable_storage_monitor")) {
            C36819a.m145272a(context, new C28931a());
        }
        C51995b.m201714a();
    }

    /* renamed from: b */
    public static void m106255b(Context context) {
        C48246q a = C51886a.m201246a();
        a.mo168808a(a.mo168806a(context).mo168789a(false).mo168788a(C57881t.m224639k(context)).mo168792b(C26246a.m94977a(context)).mo168787a($$Lambda$InitPerformanceMonitorTask$syc3YuqcTmYdZJARAeeFNkjGpnw.INSTANCE).mo168793b(C26252ad.m94993b(context)).mo168794c(C26252ad.m94992a(context)).mo168795c(false).mo168785a(6).mo168784a(2.0f).mo168791b(1.0f).mo168786a(a.mo168805a()).mo168797d(AppLifecycle.m200904a().mo177975e()).mo168790a());
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).setMonitorInited(true);
        m106256g();
    }
}
