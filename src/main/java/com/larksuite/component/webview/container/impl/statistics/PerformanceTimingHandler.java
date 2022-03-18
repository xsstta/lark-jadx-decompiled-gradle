package com.larksuite.component.webview.container.impl.statistics;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.ss.android.lark.log.Log;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class PerformanceTimingHandler implements Serializable {
    public static void enableTTPerformanceTiming(WebView webView) {
        if (webView != null) {
            webView.evaluateJavascript("ttwebview:/*enableTTLogEvent*/;", null);
        }
    }

    @JavascriptInterface
    public void report(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                WebContainerReporter.m93651a().mo92047a("performance_timing", new JSONObject(str));
            } catch (JSONException e) {
                Log.m165399w("PerformanceTimingH", e);
            }
            Log.m165389i("PerformanceTimingH", str);
        }
    }
}
