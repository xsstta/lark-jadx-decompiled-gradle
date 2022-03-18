package com.ss.android.lark.player.player;

import com.huawei.hms.adapter.internal.CommonCode;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.DataLoaderListener;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.utils.DataLoaderCDNLog;
import com.ss.ttvideoengine.utils.Error;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0018\u0010\u0005\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001e\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0016J \u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0016J\u0016\u0010\u0019\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0018\u00010\u001bR\u00020\u001cH\u0016J \u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020!H\u0016J$\u0010\"\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J*\u0010#\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010(\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010)H\u0016J\u0012\u0010(\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0016\u0010*\u001a\u00020\f2\f\u0010+\u001a\b\u0018\u00010,R\u00020\u001cH\u0016¨\u0006-"}, d2 = {"Lcom/ss/android/lark/player/player/LarkDataLoaderListener;", "Lcom/ss/ttvideoengine/DataLoaderListener;", "()V", "apiStringForFetchVideoModel", "", "param", "", "videoId", CommonCode.MapKey.HAS_RESOLUTION, "Lcom/ss/ttvideoengine/Resolution;", "authStringForFetchVideoModel", "dataLoaderError", "", "errorType", "", "error", "Lcom/ss/ttvideoengine/utils/Error;", "getCheckSumInfo", "fileKey", "getCustomHttpHeaders", "Ljava/util/HashMap;", "url", "loadLibrary", "", "name", "onLoadProgress", "loadProgress", "Lcom/ss/ttvideoengine/DataLoaderHelper$DataLoaderTaskLoadProgress;", "Lcom/ss/ttvideoengine/DataLoaderHelper;", "onLogInfo", "what", "logType", "log", "Lorg/json/JSONObject;", "onLogInfoToMonitor", "onNotify", "code", "", "parameter", "info", "onNotifyCDNLog", "Lcom/ss/ttvideoengine/utils/DataLoaderCDNLog;", "onTaskProgress", "progressInfo", "Lcom/ss/ttvideoengine/DataLoaderHelper$DataLoaderTaskProgressInfo;", "videoview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.player.c.d */
public final class LarkDataLoaderListener implements DataLoaderListener {
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
        Intrinsics.checkParameterIsNotNull(str, "videoId");
        Intrinsics.checkParameterIsNotNull(error, "error");
        Log.m165383e("TTEnginePlayerListeners", "videoId: " + str + ", errorType: " + i + ", error: " + error);
    }

    @Override // com.ss.ttvideoengine.DataLoaderListener
    public void onLogInfo(int i, String str, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "logType");
        Intrinsics.checkParameterIsNotNull(jSONObject, "log");
        if (LarkPlayerUtils.m202131a()) {
            Log.m165389i("TTEnginePlayerListeners", "onLogInfo: what:" + i + ", logType:" + str + ", log:" + jSONObject);
            Statistics.recordMiscLog(str, jSONObject);
        }
    }
}
