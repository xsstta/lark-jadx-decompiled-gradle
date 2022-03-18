package com.bytedance.lynx.webview.internal;

public enum ProcessFeatureIndex {
    ENABLE_RENDER_PROCESS(1),
    ENABLE_WARMUP(2),
    ENABLE_RENDER_IN_BROWSER(3),
    ENABLE_SELECT_MENU(4),
    ENABLE_WARMUP_RENDERPROCESSHOST(5),
    ENABLE_CLAMP_JVM_HEAP(6),
    ENABLE_UNMAP_WEBVIEW_RESERVED(7),
    ENABLE_MEDIA_TTMP(8),
    ENABLE_USE_TTWEBVIEW(9),
    ENABLE_UPLOAD_EVENT(10),
    ENABLE_UPLOAD_DATA(11);
    
    private int index;

    public int value() {
        return this.index;
    }

    private ProcessFeatureIndex(int i) {
        this.index = i;
    }
}
