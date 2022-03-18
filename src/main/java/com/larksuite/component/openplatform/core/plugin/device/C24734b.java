package com.larksuite.component.openplatform.core.plugin.device;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.b */
public class C24734b extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "mailto";
    }

    public C24734b() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            Activity currentActivity = getAppContext().getCurrentActivity();
            if (currentActivity == null) {
                callbackDefaultMsg(false);
                AppBrandLogger.m52831w("ApiMailToCtrl", "activity is null");
                return;
            }
            try {
                currentActivity.startActivity(m89781a(jSONObject));
                callbackDefaultMsg(true);
            } catch (Exception e) {
                AppBrandLogger.m52829e("ApiMailToCtrl", e.getMessage());
                callbackDefaultMsg(false);
            }
        } catch (JSONException e2) {
            callbackDefaultMsg(false);
            AppBrandLogger.m52831w("ApiMailToCtrl", e2.getMessage());
        }
    }

    /* renamed from: a */
    private Intent m89781a(JSONObject jSONObject) {
        String[] a = m89782a("to", jSONObject);
        String[] a2 = m89782a("cc", jSONObject);
        String[] a3 = m89782a("bcc", jSONObject);
        String optString = jSONObject.optString("subject");
        String optString2 = jSONObject.optString("body");
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", a);
        intent.putExtra("android.intent.extra.CC", a2);
        intent.putExtra("android.intent.extra.BCC", a3);
        intent.putExtra("android.intent.extra.SUBJECT", optString);
        intent.putExtra("android.intent.extra.TEXT", optString2);
        return intent;
    }

    /* renamed from: a */
    private String[] m89782a(String str, JSONObject jSONObject) {
        int length;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null || (length = optJSONArray.length()) == 0) {
            return null;
        }
        String[] strArr = new String[optJSONArray.length()];
        for (int i = 0; i < length; i++) {
            strArr[i] = optJSONArray.optString(i);
        }
        return strArr;
    }

    public C24734b(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
