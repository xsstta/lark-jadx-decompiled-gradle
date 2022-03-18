package com.ttnet.org.chromium.net;

import android.util.Log;

class NetworkSettings {
    private static final String TAG = "NetworkSettings";
    private static volatile boolean sPrivateApiAccessEnabled;

    NetworkSettings() {
    }

    static boolean isPrivateApiAccessEnabled() {
        if (sPrivateApiAccessEnabled) {
            return true;
        }
        try {
            sPrivateApiAccessEnabled = ((Boolean) Class.forName("com.bytedance.ttnet.TTNetInit").getMethod("isPrivateApiAccessEnabled", new Class[0]).invoke(null, new Object[0])).booleanValue();
            String str = TAG;
            Log.i(str, "Private Api access enabled: " + sPrivateApiAccessEnabled);
            return sPrivateApiAccessEnabled;
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }
}
