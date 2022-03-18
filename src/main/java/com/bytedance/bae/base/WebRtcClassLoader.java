package com.bytedance.bae.base;

class WebRtcClassLoader {
    WebRtcClassLoader() {
    }

    static Object getClassLoader() {
        return WebRtcClassLoader.class.getClassLoader();
    }
}
