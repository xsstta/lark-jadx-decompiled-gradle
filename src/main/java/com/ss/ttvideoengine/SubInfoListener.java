package com.ss.ttvideoengine;

import com.ss.ttvideoengine.utils.Error;

public interface SubInfoListener {
    void onSubInfoCallback(int i, int i2, String str);

    void onSubPathInfo(String str, Error error);
}
