package com.ttnet.org.chromium.base;

import com.ttnet.org.chromium.base.annotations.JNINamespace;

@JNINamespace("base::android")
public class TimeUtils {
    public static native long nativeGetTimeTicksNowUs();

    private TimeUtils() {
    }
}
