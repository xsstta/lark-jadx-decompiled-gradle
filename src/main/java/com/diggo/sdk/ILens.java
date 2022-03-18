package com.diggo.sdk;

import android.content.Context;

public interface ILens {
    int getDiggoVersion();

    void showLens(Context context);

    void watchLifecycle();

    void watchObject(String str, Object obj);
}
