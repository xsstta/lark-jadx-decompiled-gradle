package com.ss.ttvideoengine.log;

import android.content.Context;
import org.json.JSONObject;

public class AppLogTOBVer2 implements IVideoEventUploader {
    public static String getDeviceID() {
        return "";
    }

    public static void init(Context context, String str, String str2, String str3) {
    }

    public static boolean isAppLogVer2Exist() {
        return false;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventUploader
    public void onUplaod(String str, JSONObject jSONObject) {
    }
}
