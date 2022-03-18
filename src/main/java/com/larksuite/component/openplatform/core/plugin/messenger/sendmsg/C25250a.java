package com.larksuite.component.openplatform.core.plugin.messenger.sendmsg;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.utils.C13362n;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.littleapp.entity.ChatModel;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"getTriggerContext"}, support = {AppType.WebAPP, AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.a */
public class C25250a extends AbstractC65797c {
    public C25250a() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("getTriggerContext");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        AppBrandLogger.m52830i("GetTriggerContextHandle", "invoke api");
        String str = (String) this.f165820j.mo234984a("triggerCode");
        if (TextUtils.isEmpty(str)) {
            mo230481a(ApiCode.GENERAL_PARAM);
            AppBrandLogger.m52829e("GetTriggerContextHandle", "triggerCode is null");
            return;
        }
        final ChatModel a = mo230475h().mo235014a().mo235063a(str);
        if (TextUtils.isEmpty(a.mo148774a())) {
            mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
            AppBrandLogger.m52829e("GetTriggerContextHandle", "chatId is null");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(new JSONObject().put("id", a.mo148774a()));
            C13362n.m54361a(jSONArray.toString(), new C13362n.AbstractC13365a() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.C25250a.C252511 */

                @Override // com.bytedance.ee.larkbrand.utils.C13362n.AbstractC13365a
                /* renamed from: a */
                public void mo49668a(HashMap<String, Object> hashMap) {
                    if (hashMap.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) == null) {
                        C25250a.this.mo230493c("get openChatId error");
                        AppBrandLogger.m52829e("GetTriggerContextHandle", "get openChatId is null");
                    }
                    try {
                        JSONArray jSONArray = (JSONArray) hashMap.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                        AppBrandLogger.m52830i("GetTriggerContextHandle", jSONArray.toString());
                        if (jSONArray.length() == 1) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("openChatId", jSONArray.getJSONObject(0).opt("id"));
                            jSONObject.put("bizType", a.mo148776c());
                            AppBrandLogger.m52830i("GetTriggerContextHandle", "success. bizType:" + a.mo148776c());
                            C25250a.this.mo230492b(jSONObject);
                            return;
                        }
                        C25250a.this.mo230493c("get openChatId error");
                    } catch (JSONException e) {
                        e.printStackTrace();
                        AppBrandLogger.m52829e("GetTriggerContextHandle", "json error", e);
                        C25250a.this.mo230493c("get openChatId error");
                    }
                }

                @Override // com.bytedance.ee.larkbrand.utils.C13362n.AbstractC13365a
                /* renamed from: a */
                public void mo49667a(String str, Throwable th) {
                    C25250a.this.mo230493c("get openChatId error");
                    AppBrandLogger.m52829e("GetTriggerContextHandle", "get openChatId error", th);
                }
            }, false, mo230473f());
        } catch (Exception e) {
            e.printStackTrace();
            AppBrandLogger.m52829e("GetTriggerContextHandle", "json error: ", e);
            mo230493c("get openChatId error");
        }
    }

    public C25250a(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
