package com.he.loader;

import java.nio.ByteBuffer;

public class Stats {
    public static native boolean getFileStatsInfo(String str, ByteBuffer byteBuffer);
}
