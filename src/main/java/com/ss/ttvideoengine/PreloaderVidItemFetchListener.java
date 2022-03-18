package com.ss.ttvideoengine;

import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.utils.Error;

public interface PreloaderVidItemFetchListener {
    void fetchEnd(VideoModel videoModel, Error error);
}
