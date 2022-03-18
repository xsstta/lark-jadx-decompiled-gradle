package com.tt.miniapp.toast;

import android.content.Context;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.toast.b */
public class C66972b extends AbstractC67550j {
    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public String mo49103a() {
        return "showToast";
    }

    public C66972b(AppbrandContext appbrandContext) {
        super(appbrandContext);
    }

    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public String mo49104a(String str, final AbstractC67550j.AbstractC67551a aVar) throws Exception {
        JSONObject jSONObject = new JSONObject(str);
        final long optLong = jSONObject.optLong("duration");
        final String optString = jSONObject.optString("title");
        final String optString2 = jSONObject.optString("icon");
        AppbrandContext.getMainHandler().post(new Runnable() {
            /* class com.tt.miniapp.toast.C66972b.RunnableC669731 */

            public void run() {
                long j;
                Context e = C66972b.this.mo234577e();
                if (e == null) {
                    e = AppbrandContext.getInst().getApplicationContext();
                }
                long j2 = optLong;
                if (j2 > 0) {
                    j = j2;
                } else {
                    j = 1500;
                }
                HostDependManager.getInst().showToast(e, null, optString, j, optString2);
                AbstractC67550j.AbstractC67551a aVar = aVar;
                if (aVar != null) {
                    aVar.onNativeModuleCall("ok");
                }
            }
        });
        return null;
    }
}
