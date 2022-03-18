package com.ss.ttvideoengine;

import com.ss.ttvideoengine.model.VideoInfo;

public interface CacheFilePathListener {
    String cacheFilePath(String str, VideoInfo videoInfo);
}
