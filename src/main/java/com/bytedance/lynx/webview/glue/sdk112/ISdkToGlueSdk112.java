package com.bytedance.lynx.webview.glue.sdk112;

import java.util.Map;

public interface ISdkToGlueSdk112 {
    boolean CheckGlueVersion(String str);

    boolean CheckSdkVersion(String str);

    void onCallMS(String str);

    void preconnectUrl(String str, int i);

    boolean setCustomedHeaders(Map<String, String> map);
}
