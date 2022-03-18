package com.larksuite.component.openplatform.core.plugin.applink;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.applink.b */
public class C24581b extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "openOuterURL";
    }

    public C24581b() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            String optString = new JSONObject(this.mArgs).optString("url");
            if (TextUtils.isEmpty(optString)) {
                this.mApiHandlerCallback.callback(this.mCallBackId, m89617a(false));
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("schema", optString);
            C24579a aVar = new C24579a(jSONObject.toString(), this.mCallBackId, this.mApiHandlerCallback);
            aVar.setAppContext(getAppContext());
            aVar.doAct();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private String m89617a(boolean z) {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "ok";
        } else {
            str = "fail";
        }
        try {
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, buildErrorMsg("openOuterURL", str));
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return CharacterUtils.empty();
        }
    }

    public C24581b(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
