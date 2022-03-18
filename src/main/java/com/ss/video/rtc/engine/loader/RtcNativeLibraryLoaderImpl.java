package com.ss.video.rtc.engine.loader;

import android.util.Log;
import com.C1711a;

public class RtcNativeLibraryLoaderImpl implements RtcNativeLibraryLoader {
    @Override // org.webrtc.NativeLibraryLoader, com.ss.video.rtc.engine.loader.RtcNativeLibraryLoader
    public boolean load(String str) {
        Log.i("RtcNativeLibraryLoaderImpl", "Loading library: " + str);
        try {
            C1711a.m7628a(str);
            return true;
        } catch (UnsatisfiedLinkError e) {
            Log.e("RtcNativeLibraryLoaderImpl", "Failed to load native library: " + str, e);
            return false;
        }
    }
}
