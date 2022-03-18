package com.bytedance.lynx.webview.glue.sdk113;

import android.content.Context;
import android.webkit.WebSettings;

public interface ISdkToGlueSdk113 {
    void cancelAllPreload();

    void cancelPreload(String str);

    boolean checkSoRuntimeEnvironment(Context context);

    void clearAllPreloadCache();

    void clearPreloadCache(String str);

    void clearPrerenderQueue();

    WebSettings getPrerenderSettings(Context context);

    String getUserAgentString();

    long[] getV8PipeInterfaces();

    boolean isDarkModeSupported();

    boolean isDarkStrategySupported();

    boolean isFeatureSupport(String str, int i);

    boolean isPrerenderExist(String str);

    boolean isSupportAndroidX();

    void pausePreload();

    boolean preloadClasses();

    void preloadUrl(String str, long j, String str2, String str3, boolean z);

    boolean prerenderUrl(String str, int i, int i2, WebSettings webSettings);

    void preresolveHosts(String[] strArr);

    void removePrerender(String str);

    void resumePreload();

    void setForceDark(WebSettings webSettings, int i);

    void setForceDarkStrategy(WebSettings webSettings, int i);

    boolean setRustRulesPath(String[] strArr, String[] strArr2);

    void setV8InitCallback(long j);
}
