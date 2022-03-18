package com.ss.ttvideoengine;

import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.model.VideoInfo;
import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.utils.Error;
import java.util.List;

public class PreLoaderItemCallBackInfo {
    public long audioPreloadSize;
    public VideoModel fetchVideoModel;
    public DataLoaderHelper.DataLoaderTaskLoadProgress loadProgress;
    private int mKey;
    public DataLoaderHelper.DataLoaderTaskProgressInfo preloadDataInfo;
    public Error preloadError;
    public int preloadType;
    public List<VideoInfo> usingUrlInfos;
    public long videoPreloadSize;

    public int getKey() {
        return this.mKey;
    }

    public PreLoaderItemCallBackInfo(int i) {
        this.mKey = i;
    }
}
