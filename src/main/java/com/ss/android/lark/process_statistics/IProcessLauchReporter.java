package com.ss.android.lark.process_statistics;

public interface IProcessLauchReporter {

    public enum BusinessType {
        MINI_APP,
        DOC,
        WEBVIEW
    }

    public enum LaunchReason {
        PRELOAD_LAUNCH,
        PRELOAD_DOC_TAB,
        OPEN_DOC,
        OPEN_MINI_APP,
        APP_CENTER_PRELOAD_MINI_APP,
        MSG_CARD_PRELOAD_MINI_APP,
        INNER_PRELOAD_MINI_APP
    }
}
