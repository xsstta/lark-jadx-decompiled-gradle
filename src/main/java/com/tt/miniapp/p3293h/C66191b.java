package com.tt.miniapp.p3293h;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.view.dialog.C67179c;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.h.b */
public class C66191b extends AbstractC67550j {
    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public String mo49103a() {
        return "showModal";
    }

    public C66191b(AppbrandContext appbrandContext) {
        super(appbrandContext);
    }

    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public String mo49104a(String str, final AbstractC67550j.AbstractC67551a aVar) {
        final String str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            final String optString = jSONObject.optString("title");
            final String optString2 = jSONObject.optString("content");
            final String optString3 = jSONObject.optString("confirmText");
            String optString4 = jSONObject.optString("cancelText");
            final boolean optBoolean = jSONObject.optBoolean("showCancel");
            final String optString5 = jSONObject.optString("confirmColor");
            final String optString6 = jSONObject.optString("cancelColor");
            if (!TextUtils.isEmpty(optString2) || !TextUtils.isEmpty(optString)) {
                if (!optBoolean) {
                    str2 = "";
                } else {
                    str2 = optString4;
                }
                AppbrandContext.getMainHandler().post(new Runnable() {
                    /* class com.tt.miniapp.p3293h.C66191b.RunnableC661921 */

                    public void run() {
                        C66191b.this.mo231529a(optString, optString2, optBoolean, str2, optString6, optString3, optString5, aVar);
                    }
                });
                return null;
            }
            AppBrandLogger.m52829e("tma_DialogImpl", "empty");
            return null;
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_DialogImpl", "", e);
        }
    }

    /* renamed from: a */
    public void mo231529a(String str, String str2, boolean z, String str3, String str4, String str5, String str6, final AbstractC67550j.AbstractC67551a aVar) {
        Activity e = mo234577e();
        if (e != null) {
            C67179c.m261835a(e, new C67179c.AbstractC67190b() {
                /* class com.tt.miniapp.p3293h.C66191b.C661932 */

                @Override // com.tt.miniapp.view.dialog.C67179c.AbstractC67190b
                /* renamed from: c */
                public void mo231533c() {
                }

                @Override // com.tt.miniapp.view.dialog.C67179c.AbstractC67190b
                /* renamed from: a */
                public void mo231531a() {
                    AbstractC67550j.AbstractC67551a aVar = aVar;
                    if (aVar != null) {
                        aVar.onNativeModuleCall(String.valueOf(1));
                    }
                }

                @Override // com.tt.miniapp.view.dialog.C67179c.AbstractC67190b
                /* renamed from: b */
                public void mo231532b() {
                    AbstractC67550j.AbstractC67551a aVar = aVar;
                    if (aVar != null) {
                        aVar.onNativeModuleCall(String.valueOf(0));
                    }
                }
            }, str, str2, str5, str3);
        }
    }
}
