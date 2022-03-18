package com.ss.video.rtc.engine.loader;

import org.webrtc.NativeLibraryLoader;

public interface RtcNativeLibraryLoader extends NativeLibraryLoader {
    @Override // org.webrtc.NativeLibraryLoader
    boolean load(String str);
}
