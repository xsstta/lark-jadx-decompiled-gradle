package com.ss.ttvideoengine.fetcher.mdlfethcer;

import android.content.Context;
import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.utils.Error;

public interface MDLFetcherListener {
    Context getContext();

    String getFallbackApi();

    String getId();

    void onCompletion(VideoModel videoModel, boolean z, String str);

    void onError(Error error, String str);

    void onLog(String str);

    void onRetry(Error error);
}
