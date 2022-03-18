package com.ss.ttvideoengine;

import com.ss.ttvideoengine.model.VideoInfo;

public interface PreloaderFilePathListener {
    String cacheFilePath(String str, VideoInfo videoInfo);
}
