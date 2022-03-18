package com.ss.android.lark.player.player;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C1177w;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.player.entity.DataSource;
import com.ss.android.lark.statistics.Statistics;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.VideoEngineCallback;
import com.ss.ttvideoengine.utils.Error;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\t\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fH\u0016J\u001a\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\nH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/player/player/LarkVideoEngineCallback;", "Lcom/ss/ttvideoengine/VideoEngineCallback;", "player", "Lcom/ss/android/lark/player/player/TTEnginePlayer;", "(Lcom/ss/android/lark/player/player/TTEnginePlayer;)V", "handler", "Landroid/os/Handler;", "getPlayer", "()Lcom/ss/android/lark/player/player/TTEnginePlayer;", "onAVBadInterlaced", "", "map", "", "", "onLoadStateChanged", "engine", "Lcom/ss/ttvideoengine/TTVideoEngine;", "loadState", "", "onPlayStateChanged", "playState", "removeTask", "Companion", "videoview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.player.c.h */
public final class LarkVideoEngineCallback implements VideoEngineCallback {

    /* renamed from: a */
    public static long f129284a = 5000;

    /* renamed from: b */
    public static final Companion f129285b = new Companion(null);

    /* renamed from: c */
    private final Handler f129286c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private final C52114o f129287d;

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public /* synthetic */ void onABRPredictBitrate(int i, int i2) {
        VideoEngineCallback.CC.$default$onABRPredictBitrate(this, i, i2);
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public /* synthetic */ void onBufferEnd(int i) {
        VideoEngineCallback.CC.$default$onBufferEnd(this, i);
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public /* synthetic */ void onBufferStart(int i, int i2, int i3) {
        VideoEngineCallback.CC.$default$onBufferStart(this, i, i2, i3);
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public /* synthetic */ void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
        VideoEngineCallback.CC.$default$onBufferingUpdate(this, tTVideoEngine, i);
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public /* synthetic */ void onCompletion(TTVideoEngine tTVideoEngine) {
        VideoEngineCallback.CC.$default$onCompletion(this, tTVideoEngine);
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public /* synthetic */ void onError(Error error) {
        VideoEngineCallback.CC.$default$onError(this, error);
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public /* synthetic */ void onFrameDraw(int i, Map map) {
        VideoEngineCallback.CC.$default$onFrameDraw(this, i, map);
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public /* synthetic */ void onInfoIdChanged(int i) {
        VideoEngineCallback.CC.$default$onInfoIdChanged(this, i);
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public /* synthetic */ void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
        VideoEngineCallback.CC.$default$onPlaybackStateChanged(this, tTVideoEngine, i);
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public /* synthetic */ void onPrepare(TTVideoEngine tTVideoEngine) {
        VideoEngineCallback.CC.$default$onPrepare(this, tTVideoEngine);
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public /* synthetic */ void onPrepared(TTVideoEngine tTVideoEngine) {
        VideoEngineCallback.CC.$default$onPrepared(this, tTVideoEngine);
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public /* synthetic */ void onReadyForDisplay(TTVideoEngine tTVideoEngine) {
        VideoEngineCallback.CC.$default$onReadyForDisplay(this, tTVideoEngine);
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public /* synthetic */ void onRenderStart(TTVideoEngine tTVideoEngine) {
        VideoEngineCallback.CC.$default$onRenderStart(this, tTVideoEngine);
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public /* synthetic */ void onSARChanged(int i, int i2) {
        VideoEngineCallback.CC.$default$onSARChanged(this, i, i2);
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public /* synthetic */ void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
        VideoEngineCallback.CC.$default$onStreamChanged(this, tTVideoEngine, i);
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public /* synthetic */ void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
        VideoEngineCallback.CC.$default$onVideoSizeChanged(this, tTVideoEngine, i, i2);
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public /* synthetic */ void onVideoStatusException(int i) {
        VideoEngineCallback.CC.$default$onVideoStatusException(this, i);
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public /* synthetic */ void onVideoStreamBitrateChanged(Resolution resolution, int i) {
        VideoEngineCallback.CC.$default$onVideoStreamBitrateChanged(this, resolution, i);
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public /* synthetic */ void onVideoURLRouteFailed(Error error, String str) {
        VideoEngineCallback.CC.$default$onVideoURLRouteFailed(this, error, str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/player/player/LarkVideoEngineCallback$Companion;", "", "()V", "BAD_AV_WAIT_TIME", "", "getBAD_AV_WAIT_TIME", "()J", "setBAD_AV_WAIT_TIME", "(J)V", "REPORT_KEY_PRELOAD_VIDEO", "", "videoview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.player.c.h$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo178513a(long j) {
            LarkVideoEngineCallback.f129284a = j;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final C52114o mo178509a() {
        return this.f129287d;
    }

    /* renamed from: b */
    private final void m202133b() {
        Log.m165389i("TTEnginePlayerListeners", "remove task");
        this.f129286c.removeCallbacksAndMessages(null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.player.c.h$b */
    static final class RunnableC52108b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LarkVideoEngineCallback f129288a;

        /* renamed from: b */
        final /* synthetic */ String f129289b;

        /* renamed from: c */
        final /* synthetic */ int f129290c;

        RunnableC52108b(LarkVideoEngineCallback hVar, String str, int i) {
            this.f129288a = hVar;
            this.f129289b = str;
            this.f129290c = i;
        }

        public final void run() {
            Statistics.sendEvent("download_interlaced_video_dev");
            this.f129288a.mo178509a().mo178504h();
            DataSource l = this.f129288a.mo178509a().mo178520l();
            Intrinsics.checkExpressionValueIsNotNull(l, "currentDataSource");
            C1177w<Boolean> showPreloading = l.getShowPreloading();
            Intrinsics.checkExpressionValueIsNotNull(showPreloading, "currentDataSource.showPreloading");
            showPreloading.mo5929b((Boolean) true);
            String str = this.f129289b;
            Intrinsics.checkExpressionValueIsNotNull(str, "currentUrl");
            LarkPlayerUtils.m202130a(str, l.getSize(), l.getExtra(), new PreloadCallBack(this.f129288a.mo178509a(), l, this.f129290c));
        }
    }

    public LarkVideoEngineCallback(C52114o oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "player");
        this.f129287d = oVar;
    }

    /* renamed from: a */
    public final void mo178510a(int i) {
        if (i == -2 || i == -1 || i == 5 || i == 6) {
            m202133b();
        }
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public void onAVBadInterlaced(Map<Object, Object> map) {
        Object obj;
        if (map != null && (obj = map.get("diff")) != null) {
            String m = this.f129287d.mo178521m();
            int d = this.f129287d.mo178500d();
            Log.m165383e("TTEnginePlayerListeners", "onAVBadInterlaced, diff: " + obj + ", currentPosition: " + d);
            this.f129286c.postDelayed(new RunnableC52108b(this, m, d), f129284a);
        }
    }

    @Override // com.ss.ttvideoengine.VideoEngineCallback
    public void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
        if (i != 2) {
            m202133b();
        }
    }
}
