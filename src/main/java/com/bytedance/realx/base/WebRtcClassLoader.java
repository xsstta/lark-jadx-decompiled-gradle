package com.bytedance.realx.base;

class WebRtcClassLoader {
    WebRtcClassLoader() {
    }

    static Object getClassLoader() {
        return WebRtcClassLoader.class.getClassLoader();
    }
}
