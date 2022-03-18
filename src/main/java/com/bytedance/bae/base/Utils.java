package com.bytedance.bae.base;

import android.content.Context;
import com.bytedance.bae.base.RXLogging;

public class Utils {
    private static Context mContext;

    public static String getAppPath() {
        RXLogging.enableLogToDebugOutput(RXLogging.Severity.LS_INFO);
        RXLogging.m14761d("Utils", "this is jni logging test");
        if (mContext == null) {
            mContext = ContextUtils.getApplicationContext();
        }
        return mContext.getExternalFilesDir("").toString();
    }

    public static void SetContext(Context context) {
        mContext = context;
    }
}
