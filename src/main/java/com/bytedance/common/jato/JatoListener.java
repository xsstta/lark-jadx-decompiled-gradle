package com.bytedance.common.jato;

public interface JatoListener {
    void onDebugInfo(String str);

    void onErrorInfo(String str, Throwable th);
}
