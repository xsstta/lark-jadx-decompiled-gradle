package com.bytedance.lynx.webview.glue.sdk113;

public interface IPerformanceTimingListenersdk113 {

    /* renamed from: com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onGetJavaScriptStackTrace(IPerformanceTimingListenersdk113 iPerformanceTimingListenersdk113, String str) {
        }
    }

    void onBodyParsing();

    void onFirstImagePaint();

    void onGetJavaScriptStackTrace(String str);

    void onIframeLoaded(String str);

    void onJSError(String str);

    void onNetFinish();
}
