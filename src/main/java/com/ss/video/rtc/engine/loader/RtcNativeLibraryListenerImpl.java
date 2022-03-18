package com.ss.video.rtc.engine.loader;

import com.ss.video.rtc.engine.utils.LogUtil;

public class RtcNativeLibraryListenerImpl implements RtcNativeLibraryLoaderListener {
    @Override // com.ss.video.rtc.engine.loader.RtcNativeLibraryLoaderListener, org.webrtc.NativeLibraryLoadListener
    public void onLoadAlready(String str) {
        LogUtil.m257132i("RtcNativeLibraryLoaderListener", "onLoadAlready : " + str);
    }

    @Override // com.ss.video.rtc.engine.loader.RtcNativeLibraryLoaderListener, org.webrtc.NativeLibraryLoadListener
    public void onLoadError(String str) {
        LogUtil.m257132i("RtcNativeLibraryLoaderListener", "onLoadError : " + str);
    }

    @Override // com.ss.video.rtc.engine.loader.RtcNativeLibraryLoaderListener, org.webrtc.NativeLibraryLoadListener
    public void onLoadSuccess(String str) {
        LogUtil.m257132i("RtcNativeLibraryLoaderListener", "onLoadSuccess : " + str);
    }
}
