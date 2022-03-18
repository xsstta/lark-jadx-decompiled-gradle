package com.bytedance.push.p884f;

import com.bytedance.framwork.core.sdkmonitor.SDKMonitor;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.push.C20386c;
import com.bytedance.push.PushSupporter;
import com.bytedance.push.interfaze.AbstractC20449l;
import com.bytedance.push.utils.AbstractC20557g;
import com.bytedance.push.utils.C20552c;
import com.ss.android.message.AppProvider;
import com.ss.android.pushmanager.p3019a.C59959a;
import com.ss.android.pushmanager.setting.C59970a;
import com.ss.android.ug.bus.C60442b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.f.g */
public final class C20425g implements AbstractC20449l {

    /* renamed from: a */
    private final AbstractC20557g<SDKMonitor> f49918a = new AbstractC20557g<SDKMonitor>() {
        /* class com.bytedance.push.p884f.C20425g.C204261 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public SDKMonitor mo68870b(Object... objArr) {
            C20386c configuration = PushSupporter.get().getConfiguration();
            JSONObject jSONObject = new JSONObject();
            try {
                HashMap hashMap = new HashMap();
                C59970a.m232723a().mo204200b(hashMap);
                jSONObject.put("device_id", hashMap.get("device_id"));
                jSONObject.put("host_aid", configuration.f49780b);
                jSONObject.put("sdk_version", "3.4.6-lark");
                jSONObject.put("channel", configuration.f49786h);
                jSONObject.put("app_version", configuration.f49783e);
                jSONObject.put("update_version_code", configuration.f49782d);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            SDKMonitorUtils.setDefaultReportUrl("3405", Collections.singletonList("https://mon.snssdk.com/monitor/collect/"));
            SDKMonitorUtils.setConfigUrl("3405", Collections.singletonList("https://mon.snssdk.com/monitor/appmonitor/v2/settings"));
            SDKMonitorUtils.initMonitor(AppProvider.getApp(), "3405", jSONObject, new SDKMonitor.IGetExtendParams() {
                /* class com.bytedance.push.p884f.C20425g.C204261.C204271 */

                @Override // com.bytedance.framwork.core.sdkmonitor.SDKMonitor.IGetExtendParams
                public String getSessionId() {
                    return null;
                }

                @Override // com.bytedance.framwork.core.sdkmonitor.SDKMonitor.IGetExtendParams
                public Map<String, String> getCommonParams() {
                    Map<String, String> a = ((C59959a.AbstractC59961b) C60442b.m234863a(C59959a.AbstractC59961b.class)).mo68797a();
                    a.put("oversea", "0");
                    a.remove("aid");
                    return a;
                }
            });
            return SDKMonitorUtils.getInstance("3405");
        }
    };

    @Override // com.bytedance.push.interfaze.AbstractC20449l
    /* renamed from: a */
    public void mo68868a(Throwable th) {
    }

    @Override // com.bytedance.push.interfaze.AbstractC20449l
    /* renamed from: a */
    public void mo68866a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f49918a.mo69198c(new Object[0]).monitorStatusAndDuration(str, i, jSONObject, jSONObject2);
    }

    @Override // com.bytedance.push.interfaze.AbstractC20449l
    /* renamed from: a */
    public void mo68867a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C20552c.m74853d("sdk_monitor", str + ", " + jSONObject + ", " + jSONObject2 + ", " + jSONObject3);
        this.f49918a.mo69198c(new Object[0]).monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
    }
}
