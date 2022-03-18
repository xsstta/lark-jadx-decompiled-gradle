package com.ss.video.rtc.engine.utils;

import java.nio.ByteBuffer;

public class ByteBufferUtils {
    public static native ByteBuffer nativeAllocateBuffer(int i);

    public static native void nativeReleaseBuffer(ByteBuffer byteBuffer);
}
