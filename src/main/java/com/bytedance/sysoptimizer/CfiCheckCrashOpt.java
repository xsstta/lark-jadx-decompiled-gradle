package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.bytedance.android.bytehook.ByteHook;

public class CfiCheckCrashOpt {
    private static boolean mInit;

    private static native void fixCfiCheckCrash();

    private static boolean inAndroid10and11() {
        if (Build.VERSION.SDK_INT < 29 || Build.VERSION.SDK_INT > 30) {
            return false;
        }
        return true;
    }

    public static synchronized void fixAudioTrack(Context context) {
        synchronized (CfiCheckCrashOpt.class) {
            if (!mInit) {
                if (inAndroid10and11() && SysOptimizer.loadOptimizerLibrary(context)) {
                    Log.i("AudioTrackOpt", "handlerAcodecMessage");
                    ByteHook.init();
                    fixCfiCheckCrash();
                    mInit = true;
                }
            }
        }
    }
}
