package com.tt.miniapp.p3266c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.c.b */
public class C65810b extends AbstractC67550j {
    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public String mo49103a() {
        return "makePhoneCall";
    }

    public C65810b(AppbrandContext appbrandContext) {
        super(appbrandContext);
    }

    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public String mo49104a(String str, final AbstractC67550j.AbstractC67551a aVar) throws Exception {
        try {
            final String optString = new JSONObject(str).optString("phoneNumber");
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.tt.miniapp.p3266c.C65810b.RunnableC658111 */

                public void run() {
                    Context e = C65810b.this.mo234577e();
                    if (e == null) {
                        e = AppbrandContext.getInst().getApplicationContext();
                    }
                    boolean z = false;
                    String str = " ";
                    if (!TextUtils.isEmpty(optString)) {
                        try {
                            C65809a.m257938a(e, optString);
                            z = true;
                        } catch (Exception e2) {
                            str = str + ApiCallResultHelper.generateThrowableExtraInfo(e2);
                        }
                    } else {
                        str = str + ApiCallResultHelper.generateDataNullExtraInfo("phoneNumber");
                    }
                    AbstractC67550j.AbstractC67551a aVar = aVar;
                    if (aVar == null) {
                        return;
                    }
                    if (z) {
                        aVar.onNativeModuleCall("ok");
                        return;
                    }
                    aVar.onNativeModuleCall("fail" + str);
                }
            });
            return null;
        } catch (JSONException e) {
            AppBrandLogger.m52829e("PhoneCallImpl", "invoke", e.getStackTrace());
            if (aVar == null) {
                return null;
            }
            aVar.onNativeModuleCall("fail " + ApiCallResultHelper.generateThrowableExtraInfo(e));
            return null;
        }
    }
}
