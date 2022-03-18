package com.bytedance.common.jato.boost;

public interface BoostListener {
    void onDebug(String str);

    void onError(String str, Throwable th);
}
