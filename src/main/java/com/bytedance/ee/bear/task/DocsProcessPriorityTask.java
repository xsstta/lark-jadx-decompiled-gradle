package com.bytedance.ee.bear.task;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.ee.bear.basesdk.keeplive.C4489a;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13608f;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p716r.C13721c;
import com.ss.android.lark.util.share_preference.UserSP;
import org.json.JSONException;
import org.json.JSONObject;

public class DocsProcessPriorityTask extends BaseAsyncLaunchTask {
    /* renamed from: a */
    private void m47575a(Throwable th) {
        C13608f.m55249a(new Runnable(th) {
            /* class com.bytedance.ee.bear.task.$$Lambda$DocsProcessPriorityTask$PusTVeR3Z5v12lYDMWMbXv90Y */
            public final /* synthetic */ Throwable f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                DocsProcessPriorityTask.m47576b(this.f$0);
            }
        });
    }

    @Override // com.bytedance.ee.bear.task.BaseAsyncLaunchTask, com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        UserSP.getInstance().putLong("cost_time_app_launch_to_doc_init", C4511g.m18587a() - C4511g.m18592b());
        UserSP.getInstance().putLong("cost_time_start_p0_to_p0_launch", SystemClock.uptimeMillis());
        new C4489a(C13615c.f35773a, this.f30742a).mo17261a();
        m47575a(new Throwable());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m47576b(Throwable th) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("doc_from", "LaunchDocProcessStack");
            jSONObject.put("file_type", "LaunchDocProcessStack");
            String a = C13721c.m55644a("com.ss.android.lark", th);
            jSONObject.put("error_msg", a);
            C13479a.m54764b("DocsProcessPriorityTask", "reportLaunchDocStack(): " + a);
            C5234y.m21391b().mo21080a("docs_open_doc_stacktrace", jSONObject);
        } catch (JSONException e) {
            C13479a.m54759a("DocsProcessPriorityTask", "reportLaunchDocStack(): ", e);
        }
    }
}
