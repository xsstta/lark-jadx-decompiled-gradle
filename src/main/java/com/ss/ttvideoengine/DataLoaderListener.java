package com.ss.ttvideoengine;

import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.utils.DataLoaderCDNLog;
import com.ss.ttvideoengine.utils.Error;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public interface DataLoaderListener {
    String apiStringForFetchVideoModel(Map<String, String> map, String str, Resolution resolution);

    String authStringForFetchVideoModel(String str, Resolution resolution);

    void dataLoaderError(String str, int i, Error error);

    String getCheckSumInfo(String str);

    HashMap<String, String> getCustomHttpHeaders(String str);

    boolean loadLibrary(String str);

    void onLoadProgress(DataLoaderHelper.DataLoaderTaskLoadProgress dataLoaderTaskLoadProgress);

    void onLogInfo(int i, String str, JSONObject jSONObject);

    void onLogInfoToMonitor(int i, String str, JSONObject jSONObject);

    void onNotify(int i, long j, long j2, String str);

    void onNotifyCDNLog(DataLoaderCDNLog dataLoaderCDNLog);

    void onNotifyCDNLog(JSONObject jSONObject);

    void onTaskProgress(DataLoaderHelper.DataLoaderTaskProgressInfo dataLoaderTaskProgressInfo);
}
