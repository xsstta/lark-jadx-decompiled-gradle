package com.facebook.react.bridge;

import android.content.Context;

public class BridgeUtil {
    public static void loadScriptFromFile(String str, CatalystInstance catalystInstance, String str2, boolean z) {
        ((CatalystInstanceImpl) catalystInstance).loadScriptFromFile(str, str2, z);
    }

    public static void loadScriptFromAsset(Context context, CatalystInstance catalystInstance, String str, boolean z) {
        if (!str.startsWith("assets://")) {
            str = "assets://" + str;
        }
        ((CatalystInstanceImpl) catalystInstance).loadScriptFromAssets(context.getAssets(), str, z);
    }
}
