package com.ss.android.appcenter.common.view.video.listener;

import com.ss.android.lark.log.Log;
import com.ss.ttvideoengine.VideoEngineInfos;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/appcenter/common/view/video/listener/VideoEngineInfoListener;", "Lcom/ss/ttvideoengine/VideoEngineInfoListener;", "()V", "tag", "", "onVideoEngineInfos", "", "videoEngineInfos", "Lcom/ss/ttvideoengine/VideoEngineInfos;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.common.view.video.b.f */
public final class VideoEngineInfoListener implements com.ss.ttvideoengine.VideoEngineInfoListener {

    /* renamed from: a */
    private final String f70842a = "TTVideoEngineInfoListener";

    @Override // com.ss.ttvideoengine.VideoEngineInfoListener
    public void onVideoEngineInfos(VideoEngineInfos videoEngineInfos) {
        if (videoEngineInfos != null && Intrinsics.areEqual(videoEngineInfos.getKey(), "mdlhitcachesize")) {
            String usingMDLPlayTaskKey = videoEngineInfos.getUsingMDLPlayTaskKey();
            long usingMDLHitCacheSize = videoEngineInfos.getUsingMDLHitCacheSize();
            String str = this.f70842a;
            Log.m165389i(str, "usingKey: " + usingMDLPlayTaskKey + ", hitCacheSize: " + usingMDLHitCacheSize);
        }
    }
}
