package com.ss.android.lark.utils;

import android.app.Application;

public class LarkContext {
    private static Application sApplicationInstance;

    public static Application getApplication() {
        return sApplicationInstance;
    }

    public static void setApplication(Application application) {
        sApplicationInstance = application;
    }
}
