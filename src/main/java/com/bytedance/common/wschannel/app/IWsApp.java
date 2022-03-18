package com.bytedance.common.wschannel.app;

import android.os.Parcelable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public interface IWsApp extends Parcelable {
    int getAppId();

    String getAppKey();

    int getAppVersion();

    int getChannelId();

    List<String> getConnectUrls();

    String getDeviceId();

    String getExtra();

    int getFPID();

    String getInstallId();

    int getPlatform();

    JSONObject toJson() throws JSONException;
}
