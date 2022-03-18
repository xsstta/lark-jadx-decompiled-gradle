package com.ss.android.lark.live.render;

import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.inno.network.model.LivePlaybackInfoData;
import com.ss.android.lark.inno.network.model.LiveStreamInfoData;
import com.ss.android.lark.inno.network.model.VCLiveModel;
import com.ss.android.lark.inno.utils.C39092b;
import java.io.Serializable;

public class LiveVideoComponentModel implements Serializable {
    public VCLiveModel liveInfo;
    public LivePlaybackInfoData playbackInfo;
    public LiveStreamInfoData streamInfo;

    public static LiveVideoComponentModel toLiveVideoComponentModel(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        LiveVideoComponentModel liveVideoComponentModel = new LiveVideoComponentModel();
        liveVideoComponentModel.liveInfo = (VCLiveModel) C39092b.m154342a(jSONObject.getString("live_info"), VCLiveModel.class);
        liveVideoComponentModel.playbackInfo = (LivePlaybackInfoData) C39092b.m154342a(jSONObject.getString("playback_info"), LivePlaybackInfoData.class);
        liveVideoComponentModel.streamInfo = (LiveStreamInfoData) C39092b.m154342a(jSONObject.getString("stream_info"), LiveStreamInfoData.class);
        return liveVideoComponentModel;
    }
}
