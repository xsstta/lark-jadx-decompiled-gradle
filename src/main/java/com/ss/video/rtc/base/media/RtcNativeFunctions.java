package com.ss.video.rtc.base.media;

public final class RtcNativeFunctions {
    public static native void nativeNotifySurfaceAvailable(long j, Object obj, boolean z);

    public static native void nativeNotifySurfaceDestroyed(long j, Object obj, boolean z);

    public static native void nativeNotifySurfaceSizeChanged(long j);
}
