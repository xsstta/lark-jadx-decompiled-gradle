package com.bytedance.ee.bear.task;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p701d.C13629i;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Map;
import org.json.JSONObject;

public class ReportLaunchTask extends BaseAsyncLaunchTask {

    /* renamed from: c */
    private Map<String, String> f30750c;

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: b */
    public int mo43824b() {
        return 5;
    }

    /* renamed from: g */
    private void m47592g() {
        try {
            String c = C13629i.m55307c(C13615c.f35773a);
            if (TextUtils.isEmpty(c)) {
                c = "main";
            }
            Map<String, String> map = this.f30750c;
            if (map != null) {
                String remove = map.remove("is_main_thread");
                C13479a.m54764b("ReportLaunchTask", "report launch time = " + this.f30750c.toString() + " for " + c + "   is_main_thread: " + remove);
                for (Map.Entry<String, String> entry : this.f30750c.entrySet()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("process", c);
                    if (!TextUtils.isEmpty(remove)) {
                        jSONObject.put("is_main_thread", remove);
                    }
                    jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(entry.getValue()));
                    jSONObject.put("docs_task", String.valueOf(entry.getKey()));
                    C5234y.m21391b().mo21080a("dev_performance_lark_launch", jSONObject);
                }
            }
        } catch (Throwable th) {
            C13479a.m54766b("ReportLaunchTask", th);
        }
    }

    public ReportLaunchTask(Map<String, String> map) {
        this.f30750c = map;
    }

    @Override // com.bytedance.ee.bear.task.BaseAsyncLaunchTask, com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        m47592g();
    }
}
