package com.ss.ttvideoengine;

import com.ss.ttvideoengine.model.VideoModel;

public interface VideoInfoListener {
    boolean onFetchedVideoInfo(VideoModel videoModel);
}
