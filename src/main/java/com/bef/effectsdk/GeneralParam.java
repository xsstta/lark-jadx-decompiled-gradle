package com.bef.effectsdk;

import java.util.HashMap;

public class GeneralParam {
    private static native String nativeGetParamByKey(String str);

    private static native void nativeSetParamWithKey(String str, String str2);

    private static native void nativeSetParams(HashMap<String, String> hashMap);
}
