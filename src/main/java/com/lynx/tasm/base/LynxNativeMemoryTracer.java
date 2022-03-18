package com.lynx.tasm.base;

public class LynxNativeMemoryTracer {

    /* renamed from: a */
    private static int f65867a = 1;

    private static native void nativeStartTracing(int i);

    private static native void nativeStopTracing();

    private static native void nativeWriteRecordsToFile(String str);
}
