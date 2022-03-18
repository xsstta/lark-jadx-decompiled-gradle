package com.bytedance.lynx.webview.glue.sdk112;

public interface IPerformanceTimingListenersdk112 {
    void onCustomTagNotify(String str);

    void onFirstScreenPaint();

    void onReceivedResponse(String str);

    void onReceivedSpecialEvent(String str);
}
