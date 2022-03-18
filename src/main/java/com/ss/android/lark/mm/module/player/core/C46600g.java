package com.ss.android.lark.mm.module.player.core;

import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.DataLoaderListener;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.utils.DataLoaderCDNLog;
import com.ss.ttvideoengine.utils.Error;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mm.module.player.core.g */
public class C46600g implements DataLoaderListener {
    @Override // com.ss.ttvideoengine.DataLoaderListener
    public String apiStringForFetchVideoModel(Map<String, String> map, String str, Resolution resolution) {
        return null;
    }

    @Override // com.ss.ttvideoengine.DataLoaderListener
    public String authStringForFetchVideoModel(String str, Resolution resolution) {
        return null;
    }

    @Override // com.ss.ttvideoengine.DataLoaderListener
    public String getCheckSumInfo(String str) {
        return null;
    }

    @Override // com.ss.ttvideoengine.DataLoaderListener
    public HashMap<String, String> getCustomHttpHeaders(String str) {
        return null;
    }

    @Override // com.ss.ttvideoengine.DataLoaderListener
    public boolean loadLibrary(String str) {
        return false;
    }

    @Override // com.ss.ttvideoengine.DataLoaderListener
    public void onLoadProgress(DataLoaderHelper.DataLoaderTaskLoadProgress dataLoaderTaskLoadProgress) {
    }

    @Override // com.ss.ttvideoengine.DataLoaderListener
    public void onLogInfoToMonitor(int i, String str, JSONObject jSONObject) {
    }

    @Override // com.ss.ttvideoengine.DataLoaderListener
    public void onNotify(int i, long j, long j2, String str) {
    }

    @Override // com.ss.ttvideoengine.DataLoaderListener
    public void onNotifyCDNLog(DataLoaderCDNLog dataLoaderCDNLog) {
    }

    @Override // com.ss.ttvideoengine.DataLoaderListener
    public void onNotifyCDNLog(JSONObject jSONObject) {
    }

    @Override // com.ss.ttvideoengine.DataLoaderListener
    public void onTaskProgress(DataLoaderHelper.DataLoaderTaskProgressInfo dataLoaderTaskProgressInfo) {
    }

    @Override // com.ss.ttvideoengine.DataLoaderListener
    public void dataLoaderError(String str, int i, Error error) {
        C45855f.m181666e("MmDataLoaderListener", "videoId: " + str + " errorType:" + i + " error:" + error);
    }

    @Override // com.ss.ttvideoengine.DataLoaderListener
    public void onLogInfo(int i, String str, JSONObject jSONObject) {
        C45855f.m181664c("MmDataLoaderListener", "what:" + i + " logType:" + str + " log:" + jSONObject);
    }
}
