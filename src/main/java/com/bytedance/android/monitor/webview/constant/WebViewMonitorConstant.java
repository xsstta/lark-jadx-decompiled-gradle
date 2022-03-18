package com.bytedance.android.monitor.webview.constant;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface WebViewMonitorConstant {

    @Retention(RetentionPolicy.SOURCE)
    public @interface EventType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LocType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ReportType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }
}
