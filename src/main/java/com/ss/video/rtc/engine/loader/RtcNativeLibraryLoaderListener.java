package com.ss.video.rtc.engine.loader;

import org.webrtc.NativeLibraryLoadListener;

public interface RtcNativeLibraryLoaderListener extends NativeLibraryLoadListener {
    @Override // org.webrtc.NativeLibraryLoadListener
    void onLoadAlready(String str);

    @Override // org.webrtc.NativeLibraryLoadListener
    void onLoadError(String str);

    @Override // org.webrtc.NativeLibraryLoadListener
    void onLoadSuccess(String str);
}
