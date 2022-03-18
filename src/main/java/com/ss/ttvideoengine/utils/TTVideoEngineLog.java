package com.ss.ttvideoengine.utils;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.vcloud.abrmodule.C20873c;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.setting.SettingsHelper;

public class TTVideoEngineLog {
    public static int LogNotifyLevel = 116;
    public static int LogTurnOn = 112;
    public static TTVideoEngineLogListener mListener;

    /* renamed from: d */
    public static boolean m256502d() {
        if (((LogTurnOn >> 1) & 1) == 1 || ((LogNotifyLevel >> 1) & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m256504e() {
        if (((LogTurnOn >> 6) & 1) == 1 || ((LogNotifyLevel >> 6) & 1) == 1) {
            return true;
        }
        return false;
    }

    public static final void setListener(TTVideoEngineLogListener tTVideoEngineLogListener) {
        mListener = tTVideoEngineLogListener;
    }

    /* renamed from: d */
    public static void m256501d(Throwable th) {
        if (((LogTurnOn >> 1) & 1) == 1) {
            th.printStackTrace();
        }
    }

    public static final void setLogNotifyLevel(int i, int i2) {
        int i3 = (~(1 << i)) & LogNotifyLevel;
        LogNotifyLevel = i3;
        LogNotifyLevel = (i2 << i) | i3;
    }

    private static void _notifyListener(String str, String str2) {
        if (mListener != null && !TextUtils.isEmpty(str2)) {
            TTVideoEngineLogListener tTVideoEngineLogListener = mListener;
            if (!TextUtils.isEmpty(str)) {
                str2 = "TTVideoEngine: tag = " + str + ";  " + str2 + "\n";
            }
            tTVideoEngineLogListener.consoleLog(str2);
        }
    }

    /* renamed from: d */
    public static final void m256500d(String str, String str2) {
        if (((LogNotifyLevel >> 1) & 1) == 1) {
            _notifyListener(str, str2);
        }
        if (((LogTurnOn >> 1) & 1) == 1) {
            Log.d("TTVideoEngineLog", String.format("<%s>%s", str, str2));
        }
    }

    /* renamed from: e */
    public static void m256503e(String str, String str2) {
        if (((LogNotifyLevel >> 6) & 1) == 1) {
            _notifyListener(str, str2);
        }
        if (((LogTurnOn >> 6) & 1) == 1) {
            Log.e("TTVideoEngineLog", String.format("<%s>%s", str, str2));
        }
    }

    /* renamed from: i */
    public static final void m256505i(String str, String str2) {
        if (((LogNotifyLevel >> 2) & 1) == 1) {
            _notifyListener(str, str2);
        }
        if (((LogTurnOn >> 2) & 1) == 1) {
            Log.i("TTVideoEngineLog", String.format("<%s>%s", str, str2));
        }
    }

    /* renamed from: k */
    public static final void m256506k(String str, String str2) {
        if (((LogNotifyLevel >> 4) & 1) == 1) {
            _notifyListener(str, str2);
        }
        if (((LogTurnOn >> 4) & 1) == 1) {
            Log.i("TTVideoEngineLog", String.format("<%s>%s", str, str2));
        }
    }

    /* renamed from: t */
    public static final void m256507t(String str, String str2) {
        if (((LogNotifyLevel >> 3) & 1) == 1) {
            _notifyListener(str, str2);
        }
        if (((LogTurnOn >> 3) & 1) == 1) {
            Log.i("TTVideoEngineLog", String.format("<%s>%s", str, str2));
        }
    }

    public static final void turnOn(int i, int i2) {
        int i3 = (~(1 << i)) & LogTurnOn;
        LogTurnOn = i3;
        int i4 = i3 | (i2 << i);
        LogTurnOn = i4;
        if (i == 1 && i2 == 1) {
            int i5 = i4 & -5;
            LogTurnOn = i5;
            LogTurnOn = (i2 << 2) | i5;
            C20873c.m75965a(1);
            SettingsHelper.helper().setDebug(true);
        } else {
            SettingsHelper.helper().setDebug(false);
        }
        DataLoaderHelper.getDataLoader().setPreloadLogLevel(i);
    }

    /* renamed from: w */
    public static final void m256508w(String str, String str2) {
        if (((LogNotifyLevel >> 5) & 1) == 1) {
            _notifyListener(str, str2);
        }
        if (((LogTurnOn >> 5) & 1) == 1) {
            Log.w("TTVideoEngineLog", String.format("<%s>%s", str, str2));
        }
    }
}
