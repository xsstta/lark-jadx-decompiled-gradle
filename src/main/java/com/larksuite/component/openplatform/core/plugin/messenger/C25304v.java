package com.larksuite.component.openplatform.core.plugin.messenger;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.utils.C13351i;
import com.larksuite.suite.R;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.common.util.C67866g;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.v */
public class C25304v extends AbstractC25161i {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "showPrompt";
    }

    public C25304v() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.larksuite.component.openplatform.core.plugin.messenger.AbstractC25161i
    /* renamed from: a */
    public void mo88252a(JSONObject jSONObject) {
        final String optString = jSONObject.optString("title");
        final String optString2 = jSONObject.optString("placeholder", getAppContext().getApplicationContext().getString(R.string.lark_brand_prompt_hint));
        final int optInt = jSONObject.optInt("maxLength", 140);
        final String optString3 = jSONObject.optString("confirmText", getAppContext().getApplicationContext().getString(R.string.lark_brand_dialog_ok));
        final String optString4 = jSONObject.optString("cancelText", getAppContext().getApplicationContext().getString(R.string.lark_brand_dialog_cancel));
        AppBrandLogger.m52830i("LarkApiPromptCtrl", "handler data, title: " + optString + "max length:" + optInt);
        C67866g.m264027a(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.C25304v.RunnableC253051 */

            public void run() {
                C13351i.m54346a(C25304v.this.getAppContext().getCurrentActivity(), optString, optString2, optInt, optString3, optString4, new C13351i.AbstractC13358b() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.C25304v.RunnableC253051.C253061 */

                    @Override // com.bytedance.ee.larkbrand.utils.C13351i.AbstractC13358b
                    /* renamed from: a */
                    public void mo49660a(boolean z, String str) {
                        AppBrandLogger.m52830i("LarkApiPromptCtrl", "handler data done, is cancel: " + z + "prompt Text:" + str);
                        HashMap<String, Object> hashMap = new HashMap<>();
                        hashMap.put("confirm", Boolean.valueOf(z ^ true));
                        hashMap.put("cancel", Boolean.valueOf(z));
                        hashMap.put("inputValue", str);
                        C25304v.this.callbackOtherExtraMsg(true, hashMap);
                    }
                });
            }
        });
    }

    public C25304v(String str, int i, AbstractC67619e eVar, AbstractC25162j jVar) {
        super(str, i, eVar, jVar);
    }
}
