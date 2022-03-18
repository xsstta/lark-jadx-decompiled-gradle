package com.google.android.play.core.splitcompat;

import android.app.Application;
import android.content.Context;

public class SplitCompatApplication extends Application {
    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C22662a.m82489a(this);
    }
}
