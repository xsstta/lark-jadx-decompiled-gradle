package com.ss.android.lark.integrator.littleapp.manis;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.integrator.littleapp.C39824h;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import org.json.JSONException;
import org.json.JSONObject;

@RemoteServiceImpl(service = GadgetProxy.class)
public class GadgetProxyImpl implements GadgetProxy {
    public GadgetProxyImpl(Context context) {
    }

    @Override // com.ss.android.lark.integrator.littleapp.manis.GadgetProxy
    public void monitorEvent(String str, String str2, String str3, String str4) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            JSONObject jSONObject3 = null;
            if (!TextUtils.isEmpty(str2)) {
                jSONObject = new JSONObject(str2);
            } else {
                jSONObject = null;
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject2 = new JSONObject(str3);
            } else {
                jSONObject2 = null;
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject3 = new JSONObject(str4);
            }
            C39824h.m158095a().mo144325a(str, jSONObject, jSONObject2, jSONObject3);
        } catch (JSONException unused) {
            Log.m165383e("GadgetProxyImpl", "monitorEvent build json error serviceName:" + str);
        }
    }
}
