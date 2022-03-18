package com.ss.texturerender;

import android.util.Log;

public class TextureRenderLog {
    private static OnLogListener mLogListener;

    public interface OnLogListener {
        int log(String str, String str2);
    }

    public static synchronized void setOnLogListener(OnLogListener onLogListener) {
        synchronized (TextureRenderLog.class) {
            mLogListener = onLogListener;
        }
    }

    /* renamed from: d */
    public static int m256492d(String str, String str2) {
        OnLogListener onLogListener = mLogListener;
        if (onLogListener == null) {
            return Log.d(str, str2);
        }
        return onLogListener.log(str, str2);
    }
}
