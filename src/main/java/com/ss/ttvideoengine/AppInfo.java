package com.ss.ttvideoengine;

import android.content.Context;
import com.ss.ttvideoengine.log.IVideoEventUploader;
import java.util.HashMap;
import org.json.JSONObject;

public class AppInfo {
    public static String mAppChannel = null;
    public static int mAppID = -1;
    public static String mAppName;
    public static String mAppVersion;
    public static Context mContext;
    public static String mDeviceId;
    public static String mOpenApiHostName;
    public static String mRegion;
    public static int mScreenHeight;
    public static int mScreenWidth;
    public static IVideoEventUploader mUploader;

    public static String getDefaultVodTopHost() {
        throw new UnsupportedOperationException("tob only");
    }

    public static String getDefaultVodTopHostV2() {
        throw new UnsupportedOperationException("tob only");
    }

    public static String toJsonString() {
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", Integer.valueOf(mAppID));
        hashMap.put("app_name", mAppName);
        hashMap.put("screen_width", Integer.valueOf(mScreenWidth));
        hashMap.put("screen_height", Integer.valueOf(mScreenHeight));
        return new JSONObject(hashMap).toString();
    }
}
