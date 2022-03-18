package com.appsflyer;

import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyer2dXConversionCallback implements AppsFlyerConversionListener {
    public native void onAppOpenAttributionNative(Object obj);

    public native void onAttributionFailureNative(Object obj);

    public native void onInstallConversionDataLoadedNative(Object obj);

    public native void onInstallConversionFailureNative(Object obj);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map<String, String> map) {
        onAppOpenAttributionNative(map);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(Map<String, Object> map) {
        onInstallConversionDataLoadedNative(map);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
        m8747("onInstallConversionFailure", str);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
        m8747("onAttributionFailure", str);
    }

    /* renamed from: ı */
    private void m8747(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(UpdateKey.STATUS, "failure");
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str2);
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1390007222) {
                if (hashCode == 1050716216) {
                    if (str.equals("onInstallConversionFailure")) {
                        c = 0;
                    }
                }
            } else if (str.equals("onAttributionFailure")) {
                c = 1;
            }
            if (c == 0) {
                onInstallConversionFailureNative(jSONObject);
            } else if (c == 1) {
                onAttributionFailureNative(jSONObject);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
