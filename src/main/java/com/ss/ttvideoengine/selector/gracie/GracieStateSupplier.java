package com.ss.ttvideoengine.selector.gracie;

import com.bytedance.vcloud.abrmodule.C20872b;
import com.bytedance.vcloud.abrmodule.IPlayStateSupplier;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.model.IVideoModel;
import com.ss.ttvideoengine.model.MediaBitrateFitterInfo;
import com.ss.ttvideoengine.model.VideoInfo;
import com.ss.ttvideoengine.model.VideoRef;
import com.ss.ttvideoengine.strategrycenter.StrategyCenter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class GracieStateSupplier implements IPlayStateSupplier {
    IVideoModel mVideoModel;

    public int getCurrentDownloadAudioBitrate() {
        return -1;
    }

    public int getCurrentDownloadAudioSegmentIndex() {
        return -1;
    }

    public int getCurrentDownloadVideoBitrate() {
        return -1;
    }

    public int getCurrentDownloadVideoSegmentIndex() {
        return -1;
    }

    public int getCurrentPlaybackTime() {
        return -1;
    }

    public int getLoaderType() {
        return -1;
    }

    public int getMaxCacheAudioTime() {
        return -1;
    }

    public int getMaxCacheVideoTime() {
        return -1;
    }

    public float getPlaySpeed() {
        return 1.0f;
    }

    public int getPlayerAudioCacheTime() {
        return -1;
    }

    public int getPlayerVideoCacheTime() {
        return 0;
    }

    public List<? extends Object> getSegmentInfoList(int i, int i2) {
        return null;
    }

    public Queue<Object> getTimelineNetworkSpeed() {
        return null;
    }

    public float getNetworkSpeed() {
        if (StrategyCenter.sNetAbrSpeedPredictor != null) {
            return StrategyCenter.sNetAbrSpeedPredictor.mo70582a(0);
        }
        return -1.0f;
    }

    public int getNetworkState() {
        return DataLoaderHelper.getDataLoader().getIntValue(1008);
    }

    public float getSpeedConfidence() {
        if (StrategyCenter.sNetAbrSpeedPredictor != null) {
            return StrategyCenter.sNetAbrSpeedPredictor.mo70591c();
        }
        return -1.0f;
    }

    public float getDownloadSpeed() {
        Map<String, String> b;
        if (StrategyCenter.sNetAbrSpeedPredictor == null || (b = StrategyCenter.sNetAbrSpeedPredictor.mo70590b(VideoRef.TYPE_VIDEO)) == null || b.get("download_speed") == null) {
            return -1.0f;
        }
        return Float.parseFloat(b.get("download_speed"));
    }

    public Map<String, Object> getAudioBufferInfo() {
        HashMap hashMap = new HashMap();
        List<VideoInfo> videoInfoList = this.mVideoModel.getVideoInfoList();
        if (!(videoInfoList == null || videoInfoList.size() == 0)) {
            for (VideoInfo videoInfo : videoInfoList) {
                if (videoInfo != null && videoInfo.getMediatype() == VideoRef.TYPE_AUDIO) {
                    C20872b bVar = new C20872b();
                    String valueStr = videoInfo.getValueStr(15);
                    bVar.mo70560a(valueStr);
                    bVar.mo70559a(TTVideoEngine.getCacheFileSize(valueStr));
                    MediaBitrateFitterInfo bitrateFitterInfo = videoInfo.getBitrateFitterInfo();
                    if (bitrateFitterInfo != null) {
                        bVar.mo70561b((long) bitrateFitterInfo.getHeaderSize());
                    }
                    hashMap.put("" + videoInfo.getValueInt(3), bVar);
                }
            }
        }
        return hashMap;
    }

    public Map<String, Object> getVideoBufferInfo() {
        HashMap hashMap = new HashMap();
        List<VideoInfo> videoInfoList = this.mVideoModel.getVideoInfoList();
        if (!(videoInfoList == null || videoInfoList.size() == 0)) {
            for (VideoInfo videoInfo : videoInfoList) {
                if (videoInfo != null && videoInfo.getMediatype() == VideoRef.TYPE_VIDEO) {
                    C20872b bVar = new C20872b();
                    String valueStr = videoInfo.getValueStr(15);
                    bVar.mo70560a(valueStr);
                    bVar.mo70559a(TTVideoEngine.getCacheFileSize(valueStr));
                    MediaBitrateFitterInfo bitrateFitterInfo = videoInfo.getBitrateFitterInfo();
                    if (bitrateFitterInfo != null) {
                        bVar.mo70561b((long) bitrateFitterInfo.getHeaderSize());
                    }
                    hashMap.put("" + videoInfo.getValueInt(3), bVar);
                }
            }
        }
        return hashMap;
    }

    private GracieStateSupplier(IVideoModel iVideoModel) {
        this.mVideoModel = iVideoModel;
    }

    public float getAverageDownloadSpeed(int i, int i2, boolean z) {
        if (StrategyCenter.sNetAbrSpeedPredictor != null) {
            return StrategyCenter.sNetAbrSpeedPredictor.mo70583a(i, i2, z);
        }
        return -1.0f;
    }
}
