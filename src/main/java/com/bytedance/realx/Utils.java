package com.bytedance.realx;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.realx.base.RXLogging;
import dalvik.system.PathClassLoader;
import org.webrtc.ContextUtils;

public class Utils {
    private static Context mContext;

    public static String getAppPath() {
        RXLogging.enableLogToDebugOutput(RXLogging.Severity.LS_INFO);
        RXLogging.m74903d("Utils", "this is jni logging test");
        if (mContext == null) {
            mContext = ContextUtils.getApplicationContext();
        }
        return mContext.getExternalFilesDir("").toString();
    }

    public static void SetContext(Context context) {
        mContext = context;
    }

    public static String getAppLibPath(String str) {
        if (mContext == null) {
            mContext = ContextUtils.getApplicationContext();
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String findLibrary = ((PathClassLoader) mContext.getClassLoader()).findLibrary(str);
            if (findLibrary == null) {
                return "";
            }
            return findLibrary;
        } catch (Exception e) {
            RXLogging.m74904e("realx Utils", "getAppLibPath Exception : " + e.getMessage());
            Log.e("realx Utils", "getAppLibPath Exception : " + e.getMessage());
            throw e;
        }
    }
}
