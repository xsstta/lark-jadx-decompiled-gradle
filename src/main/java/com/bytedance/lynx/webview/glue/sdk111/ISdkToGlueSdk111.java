package com.bytedance.lynx.webview.glue.sdk111;

import android.webkit.WebViewFactoryProvider;
import java.util.Map;
import org.json.JSONObject;

public interface ISdkToGlueSdk111 {
    Map<String, String> getCrashInfo();

    String getLatestUrl();

    WebViewFactoryProvider getProviderInstance(String str);

    int getWebViewCount();

    boolean isAdblockEnable();

    void loadLibrary(String str);

    void notifyAppInfoGetterAvailable();

    boolean setAdblockDeserializeFile(String str, String str2);

    boolean setAdblockEnable(boolean z);

    boolean setAdblockRulesPath(String[] strArr, String[] strArr2);

    void setJsonObject(JSONObject jSONObject);

    void setPreconnectUrl(String str, int i);
}
