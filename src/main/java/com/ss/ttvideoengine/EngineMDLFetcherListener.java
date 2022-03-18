package com.ss.ttvideoengine;

import android.content.Context;
import com.ss.ttvideoengine.fetcher.mdlfethcer.MDLFetcherListener;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import com.ss.ttvideoengine.utils.TTVideoEngineUtils;
import java.lang.ref.WeakReference;

public class EngineMDLFetcherListener implements MDLFetcherListener {
    private final WeakReference<TTVideoEngine> mVideoEngineRef;

    @Override // com.ss.ttvideoengine.fetcher.mdlfethcer.MDLFetcherListener
    public Context getContext() {
        TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
        if (tTVideoEngine == null) {
            return null;
        }
        return tTVideoEngine.getContext();
    }

    @Override // com.ss.ttvideoengine.fetcher.mdlfethcer.MDLFetcherListener
    public String getFallbackApi() {
        TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
        if (tTVideoEngine == null) {
            return null;
        }
        return TTVideoEngineUtils.BuildHttpsApi(tTVideoEngine._getAPIString());
    }

    @Override // com.ss.ttvideoengine.fetcher.mdlfethcer.MDLFetcherListener
    public String getId() {
        TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
        if (tTVideoEngine == null) {
            return null;
        }
        return tTVideoEngine.getHash();
    }

    public EngineMDLFetcherListener(TTVideoEngine tTVideoEngine) {
        this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
    }

    @Override // com.ss.ttvideoengine.fetcher.mdlfethcer.MDLFetcherListener
    public void onLog(String str) {
        TTVideoEngineLog.m256505i("EngineMDLFetcherListener", "fetcher cancelled");
        TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
        if (tTVideoEngine != null && tTVideoEngine.getLogger() != null) {
            tTVideoEngine.getLogger().logMessage(str);
        }
    }

    @Override // com.ss.ttvideoengine.fetcher.mdlfethcer.MDLFetcherListener
    public void onRetry(Error error) {
        TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
        if (error != null && tTVideoEngine != null && tTVideoEngine.getLogger() != null) {
            TTVideoEngineLog.m256503e("EngineMDLFetcherListener", "fetcher should retry error " + error.toString());
            tTVideoEngine.getLogger().needRetryToFetch(error, tTVideoEngine.getPlayAPIVersion());
        }
    }

    @Override // com.ss.ttvideoengine.fetcher.mdlfethcer.MDLFetcherListener
    public void onError(Error error, String str) {
        IVideoEventLogger logger;
        TTVideoEngineLog.m256505i("EngineMDLFetcherListener", "videoEngine mdl fetch failed " + error.toString());
        TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
        if (tTVideoEngine != null && (logger = tTVideoEngine.getLogger()) != null) {
            logger.mdlRetryResult(0, str, error);
        }
    }

    @Override // com.ss.ttvideoengine.fetcher.mdlfethcer.MDLFetcherListener
    public void onCompletion(VideoModel videoModel, boolean z, String str) {
        int i;
        TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
        if (tTVideoEngine != null) {
            TTVideoEngineLog.m256505i("EngineMDLFetcherListener", "fetch info success");
            IVideoEventLogger logger = tTVideoEngine.getLogger();
            if (logger != null) {
                if (z) {
                    i = 1;
                } else {
                    i = 2;
                }
                logger.mdlRetryResult(i, str, null);
            }
            if (logger != null && z) {
                logger.fetchInfoComplete(videoModel, (Error) null);
            }
        }
    }
}
