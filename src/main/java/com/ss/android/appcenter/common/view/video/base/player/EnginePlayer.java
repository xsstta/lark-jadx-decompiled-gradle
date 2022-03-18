package com.ss.android.appcenter.common.view.video.base.player;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.Surface;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.view.video.base.misc.BundlePool;
import com.ss.android.appcenter.common.view.video.data.DataSource;
import com.ss.android.appcenter.common.view.video.listener.OnVideoSizeChangedListener;
import com.ss.android.appcenter.common.view.video.listener.VideoDataLoaderListener;
import com.ss.android.appcenter.common.view.video.listener.VideoEngineInfoListener;
import com.ss.android.appcenter.common.view.video.listener.VideoEventListener;
import com.ss.android.appcenter.common.view.video.listener.VideoSeekCompletionListener;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttm.player.PlaybackParams;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.VideoEngineSimpleCallback;
import com.ss.ttvideoengine.log.VideoEventManager;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.FileDescriptor;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001JB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0016J\b\u0010\u001f\u001a\u00020\u000fH\u0016J\b\u0010 \u001a\u00020\u000fH\u0016J\u0018\u0010!\u001a\u00020\u001c2\u000e\u0010\"\u001a\n\u0018\u00010#j\u0004\u0018\u0001`$H\u0002J\b\u0010%\u001a\u00020\u001cH\u0002J\b\u0010&\u001a\u00020\u001cH\u0002J\b\u0010'\u001a\u00020\u001cH\u0002J\b\u0010(\u001a\u00020\tH\u0016J\b\u0010)\u001a\u00020\tH\u0016J\b\u0010*\u001a\u00020\tH\u0016J\b\u0010+\u001a\u00020\u001cH\u0016J\b\u0010,\u001a\u00020\u001cH\u0016J\b\u0010-\u001a\u00020\u001cH\u0016J\b\u0010.\u001a\u00020\u001cH\u0002J\b\u0010/\u001a\u00020\u001cH\u0016J\u0010\u00100\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u000fH\u0016J\u0010\u00102\u001a\u00020\u001c2\u0006\u00103\u001a\u000204H\u0016J\u0012\u00105\u001a\u00020\u001c2\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0018\u00108\u001a\u00020\u001c2\u0006\u00103\u001a\u0002042\u0006\u00109\u001a\u00020\u0011H\u0002J\u0010\u0010:\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\tH\u0016J\u0010\u0010<\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020>H\u0016J\u0012\u0010?\u001a\u00020\u001c2\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0012\u0010@\u001a\u00020\u001c2\b\u00103\u001a\u0004\u0018\u00010AH\u0016J\u0012\u0010B\u001a\u00020\u001c2\b\u0010C\u001a\u0004\u0018\u00010\u0011H\u0016J\u0018\u0010D\u001a\u00020\u001c2\u0006\u0010E\u001a\u00020>2\u0006\u0010F\u001a\u00020>H\u0016J\b\u0010G\u001a\u00020\u001cH\u0016J\u0010\u0010G\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u000fH\u0016J\b\u0010H\u001a\u00020\u001cH\u0016J\u0010\u0010I\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lcom/ss/android/appcenter/common/view/video/base/player/EnginePlayer;", "Lcom/ss/android/appcenter/common/view/video/base/player/BasePlayer;", "cxt", "Landroid/content/Context;", "(Landroid/content/Context;)V", "appContext", "dataLoaderListener", "Lcom/ss/android/appcenter/common/view/video/listener/VideoDataLoaderListener;", "isUseCacheFromBiz", "", "isUseCacheFromRemote", "sHasInitDataLoader", "seekCompletionListener", "Lcom/ss/android/appcenter/common/view/video/listener/VideoSeekCompletionListener;", "startSeekPos", "", "tag", "", "targetState", "ttVideoEventListener", "Lcom/ss/android/appcenter/common/view/video/listener/VideoEventListener;", "videoEngine", "Lcom/ss/ttvideoengine/TTVideoEngine;", "videoEngineInfoListener", "Lcom/ss/android/appcenter/common/view/video/listener/VideoEngineInfoListener;", "videoHeight", "videoWidth", "destroy", "", "getCurrentPosition", "getDuration", "getVideoHeight", "getVideoWidth", "handleException", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "initDataLoader", "initEngine", "initSetting", "isMute", "isPlaying", "isSystemPlayer", "pause", "prepare", "reset", "resetListener", "resume", "seekTo", "msc", "setDataSource", "dataSource", "Lcom/ss/android/appcenter/common/view/video/data/DataSource;", "setDisplay", "surface", "Landroid/view/Surface;", "setEngineUrl", "url", "setMute", "mute", "setSpeed", "speed", "", "setSurface", "setTTDataSource", "Lcom/ss/ttvideoengine/DataSource;", "setVideoID", "videoID", "setVolume", "left", "right", "start", "stop", "useCache", "VideoEngineCallback", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.common.view.video.a.b.b */
public final class EnginePlayer extends BasePlayer {

    /* renamed from: a */
    public final String f70821a = "AppCenterEnginePlayer";

    /* renamed from: b */
    public int f70822b;

    /* renamed from: c */
    public int f70823c;

    /* renamed from: d */
    public int f70824d;

    /* renamed from: e */
    public int f70825e;

    /* renamed from: f */
    private final Context f70826f;

    /* renamed from: g */
    private TTVideoEngine f70827g;

    /* renamed from: h */
    private boolean f70828h;

    /* renamed from: i */
    private boolean f70829i;

    /* renamed from: j */
    private volatile boolean f70830j;

    /* renamed from: k */
    private final VideoDataLoaderListener f70831k;

    /* renamed from: l */
    private final VideoEngineInfoListener f70832l;

    /* renamed from: m */
    private final VideoEventListener f70833m;

    /* renamed from: n */
    private final VideoSeekCompletionListener f70834n;

    /* renamed from: s */
    private final void m103420s() {
        this.f70827g.setVideoEngineSimpleCallback(null);
    }

    /* renamed from: d */
    public boolean mo100538d() {
        return this.f70827g.isMute();
    }

    /* renamed from: o */
    public boolean mo100549o() {
        return this.f70827g.isSystemPlayer();
    }

    /* renamed from: m */
    public void mo100547m() {
        mo100522a(0);
        mo100523a(-99008, (Bundle) null);
        this.f70822b = 0;
    }

    /* renamed from: r */
    private final void m103419r() {
        TTVideoEngine.setStringValue(0, C57881t.m224646r(this.f70826f));
        TTVideoEngine.setIntValue(1, 40960);
    }

    /* renamed from: e */
    public boolean mo100539e() {
        if (mo100528b() == -1 || this.f70827g.getPlaybackState() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public int mo100541g() {
        if (mo100528b() == -1 || mo100528b() == 1 || mo100528b() == 0) {
            return 0;
        }
        return this.f70827g.getDuration();
    }

    /* renamed from: h */
    public void mo100542h() {
        try {
            if (mo100528b() == 4 || mo100528b() == 1) {
                this.f70827g.prepare();
            }
        } catch (Exception e) {
            m103416a(e);
        }
    }

    /* renamed from: j */
    public void mo100544j() {
        try {
            this.f70827g.pause();
            mo100522a(4);
            mo100523a(-99005, (Bundle) null);
        } catch (Exception e) {
            m103416a(e);
        }
        this.f70822b = 4;
    }

    /* renamed from: n */
    public void mo100548n() {
        mo100522a(-2);
        m103420s();
        this.f70827g.release();
        mo100523a(-99009, (Bundle) null);
    }

    /* renamed from: p */
    private final void m103417p() {
        if (!this.f70830j) {
            this.f70830j = true;
            try {
                TTVideoEngine.setDataLoaderListener(this.f70831k);
                TTVideoEngine.startDataLoader(this.f70826f);
            } catch (Exception e) {
                String str = this.f70821a;
                C28184h.m103248b(str, "start data load error: " + e.getMessage());
            }
        }
    }

    /* renamed from: f */
    public int mo100540f() {
        boolean z;
        if (mo100528b() == 2 || mo100528b() == 3 || mo100528b() == 4 || mo100528b() == 6) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.f70827g.getCurrentPlaybackTime();
        }
        return 0;
    }

    /* renamed from: i */
    public void mo100543i() {
        try {
            if (mo100528b() == 2 || mo100528b() == 4 || mo100528b() == 1 || mo100528b() == 6 || mo100528b() == 5) {
                this.f70827g.play();
                mo100522a(3);
                mo100523a(-99004, (Bundle) null);
            }
        } catch (Exception e) {
            m103416a(e);
        }
        this.f70822b = 3;
    }

    /* renamed from: k */
    public void mo100545k() {
        try {
            if (mo100528b() == 4 || mo100528b() == 1 || mo100528b() == 2) {
                this.f70827g.play();
                mo100522a(3);
                mo100523a(-99006, (Bundle) null);
            }
        } catch (Exception e) {
            m103416a(e);
        }
        this.f70822b = 3;
    }

    /* renamed from: l */
    public void mo100546l() {
        boolean z;
        if (mo100528b() == 2 || mo100528b() == 3 || mo100528b() == 4 || mo100528b() == 6) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f70827g.stop();
            mo100522a(5);
            mo100523a(-99007, (Bundle) null);
        }
        this.f70822b = 5;
    }

    /* renamed from: q */
    private final void m103418q() {
        if (C26284k.m95185a(this.f70826f)) {
            TTVideoEngineLog.turnOn(1, 1);
        }
        this.f70827g.setIntOption(SmEvents.EVENT_HBRESET, 1);
        this.f70827g.setIntOption(4, 0);
        this.f70827g.setIntOption(6, 1);
        this.f70827g.setIntOption(160, 1);
        this.f70827g.setIntOption(21, 1);
        this.f70827g.setVideoEngineInfoListener(this.f70832l);
        VideoEventManager.instance.setListener(this.f70833m);
        VideoEventManager.instance.setLoggerVersion(2);
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\bH\u0016J \u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\bH\u0016¨\u0006\u001b"}, d2 = {"Lcom/ss/android/appcenter/common/view/video/base/player/EnginePlayer$VideoEngineCallback;", "Lcom/ss/ttvideoengine/VideoEngineSimpleCallback;", "(Lcom/ss/android/appcenter/common/view/video/base/player/EnginePlayer;)V", "onBufferingUpdate", "", "engine", "Lcom/ss/ttvideoengine/TTVideoEngine;", "percent", "", "onCompletion", "onError", "error", "Lcom/ss/ttvideoengine/utils/Error;", "onLoadStateChanged", "loadState", "onPlaybackStateChanged", "playbackState", "onPrepare", "onPrepared", "onRenderStart", "onStreamChanged", ShareHitPoint.f121869d, "onVideoSizeChanged", "width", "height", "onVideoStatusException", UpdateKey.STATUS, "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.common.view.video.a.b.b$a */
    public final class VideoEngineCallback extends VideoEngineSimpleCallback {
        @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
        public void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
            Intrinsics.checkParameterIsNotNull(tTVideoEngine, "engine");
        }

        @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
        public void onVideoStatusException(int i) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public VideoEngineCallback() {
        }

        @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
        public void onCompletion(TTVideoEngine tTVideoEngine) {
            Intrinsics.checkParameterIsNotNull(tTVideoEngine, "engine");
            EnginePlayer.this.mo100522a(6);
            EnginePlayer.this.f70822b = 6;
            EnginePlayer.this.mo100523a(-99016, (Bundle) null);
        }

        @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
        public void onPrepare(TTVideoEngine tTVideoEngine) {
            Intrinsics.checkParameterIsNotNull(tTVideoEngine, "engine");
            C28184h.m103250d(EnginePlayer.this.f70821a, "onPrepare");
            EnginePlayer.this.mo100523a(-99053, (Bundle) null);
        }

        @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
        public void onRenderStart(TTVideoEngine tTVideoEngine) {
            Intrinsics.checkParameterIsNotNull(tTVideoEngine, "engine");
            EnginePlayer.this.f70823c = 0;
            EnginePlayer.this.mo100523a(-99015, (Bundle) null);
        }

        @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
        public void onError(Error error) {
            int i;
            Intrinsics.checkParameterIsNotNull(error, "error");
            String str = EnginePlayer.this.f70821a;
            C28184h.m103250d(str, "Error: " + error);
            EnginePlayer.this.mo100522a(-1);
            EnginePlayer.this.f70822b = -1;
            int i2 = error.code;
            if (i2 == -499896) {
                i = -88015;
            } else if (i2 != -499894) {
                i = -88011;
            } else {
                i = -88019;
            }
            Bundle a = BundlePool.f70804a.mo100512a();
            a.putInt("int_arg1", error.code);
            a.putString("string_data", error.description);
            EnginePlayer.this.mo100529b(i, a);
        }

        @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
        public void onPrepared(TTVideoEngine tTVideoEngine) {
            Intrinsics.checkParameterIsNotNull(tTVideoEngine, "engine");
            C28184h.m103250d(EnginePlayer.this.f70821a, "onPrepared...");
            EnginePlayer.this.mo100522a(2);
            EnginePlayer.this.f70824d = tTVideoEngine.getVideoWidth();
            EnginePlayer.this.f70825e = tTVideoEngine.getVideoHeight();
            Bundle a = BundlePool.f70804a.mo100512a();
            a.putInt("int_arg1", EnginePlayer.this.f70824d);
            a.putInt("int_arg2", EnginePlayer.this.f70825e);
            a.putInt("int_arg3", EnginePlayer.this.mo100541g());
            a.putInt("int_arg4", EnginePlayer.this.mo100540f());
            EnginePlayer.this.mo100523a(-99018, a);
            String str = EnginePlayer.this.f70821a;
            C28184h.m103250d(str, "onPrepared: targetState=" + EnginePlayer.this.f70822b);
        }

        @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
        public void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
            Intrinsics.checkParameterIsNotNull(tTVideoEngine, "engine");
            EnginePlayer.this.mo100531c(i, null);
        }

        @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
        public void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
            Intrinsics.checkParameterIsNotNull(tTVideoEngine, "engine");
            if (i == 1) {
                EnginePlayer.this.mo100523a(-99011, (Bundle) null);
            } else if (i == 2) {
                EnginePlayer.this.mo100523a(-99010, (Bundle) null);
            }
        }

        @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
        public void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
            Intrinsics.checkParameterIsNotNull(tTVideoEngine, "engine");
            if (i == 0) {
                EnginePlayer.this.mo100522a(5);
            } else if (i == 1) {
                EnginePlayer.this.mo100522a(3);
            } else if (i == 2) {
                EnginePlayer.this.mo100522a(4);
            } else if (i == 3) {
                EnginePlayer.this.mo100522a(-1);
            }
        }

        @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
        public void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(tTVideoEngine, "engine");
            OnVideoSizeChangedListener a = EnginePlayer.this.mo100521a();
            if (a != null) {
                a.mo100457a(i, i2);
            }
            EnginePlayer.this.f70824d = i;
            EnginePlayer.this.f70825e = i2;
            Bundle a2 = BundlePool.f70804a.mo100512a();
            a2.putInt("int_arg1", EnginePlayer.this.f70824d);
            a2.putInt("int_arg2", EnginePlayer.this.f70825e);
            EnginePlayer.this.mo100523a(-99017, a2);
        }
    }

    /* renamed from: a */
    public void mo100534a(boolean z) {
        this.f70827g.setIsMute(z);
    }

    /* renamed from: b */
    public void mo100535b(int i) {
        if (i > 0) {
            this.f70823c = i;
        }
        mo100543i();
    }

    /* renamed from: a */
    public void mo100532a(float f) {
        PlaybackParams playbackParams = new PlaybackParams();
        playbackParams.setSpeed(f);
        this.f70827g.setPlaybackParams(playbackParams);
    }

    /* renamed from: a */
    private final void m103416a(Exception exc) {
        if (exc != null) {
            String str = this.f70821a;
            C28184h.m103248b(str, "exception in player:" + exc);
        }
        mo100547m();
    }

    /* renamed from: b */
    public void mo100536b(Surface surface) {
        try {
            this.f70827g.setSurface(surface);
            mo100523a(-99002, (Bundle) null);
        } catch (Exception e) {
            m103416a(e);
        }
    }

    @Override // com.ss.android.appcenter.common.view.video.base.player.IPlayer
    /* renamed from: a */
    public void mo100489a(Surface surface) {
        try {
            this.f70827g.setSurface(surface);
            mo100523a(-99002, (Bundle) null);
        } catch (Exception e) {
            m103416a(e);
        }
    }

    /* renamed from: c */
    public void mo100537c(int i) {
        boolean z;
        if (mo100528b() == 2 || mo100528b() == 3 || mo100528b() == 4 || mo100528b() == 6) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f70827g.seekTo(i, this.f70834n);
            Bundle a = BundlePool.f70804a.mo100512a();
            a.putInt("int_data", i);
            mo100523a(-99013, a);
        }
    }

    public EnginePlayer(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "cxt");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkExpressionValueIsNotNull(applicationContext, "cxt.applicationContext");
        this.f70826f = applicationContext;
        this.f70827g = new TTVideoEngine(applicationContext, 0);
        this.f70828h = true;
        this.f70829i = true;
        this.f70831k = new VideoDataLoaderListener();
        this.f70832l = new VideoEngineInfoListener();
        this.f70833m = new VideoEventListener();
        this.f70834n = new VideoSeekCompletionListener(this);
        m103419r();
        m103417p();
        m103418q();
    }

    /* renamed from: a */
    public void mo100533a(DataSource dataSource) {
        Intrinsics.checkParameterIsNotNull(dataSource, "dataSource");
        try {
            mo100546l();
            mo100547m();
            m103420s();
            this.f70827g.setVideoEngineSimpleCallback(new VideoEngineCallback());
            mo100522a(1);
            String data = dataSource.getData();
            Uri uri = dataSource.getUri();
            FileDescriptor fileDescriptor = dataSource.getFileDescriptor();
            if (data != null) {
                m103415a(dataSource, data);
            } else if (uri != null) {
                String uri2 = uri.toString();
                Intrinsics.checkExpressionValueIsNotNull(uri2, "uri.toString()");
                m103415a(dataSource, uri2);
            } else if (fileDescriptor != null) {
                this.f70827g.setDataSource(fileDescriptor, dataSource.getStartPos(), 0);
            }
            Bundle a = BundlePool.f70804a.mo100512a();
            a.putSerializable("serializable_data", dataSource);
            mo100523a(-99001, a);
        } catch (Exception e) {
            m103416a(e);
            mo100522a(-1);
            this.f70822b = -1;
        }
    }

    /* renamed from: a */
    private final void m103415a(DataSource dataSource, String str) {
        if (StringsKt.startsWith$default(str, "http", false, 2, (Object) null)) {
            if (!this.f70828h || !this.f70829i) {
                this.f70827g.setDirectURL(str);
            } else {
                TTVideoEngine tTVideoEngine = this.f70827g;
                tTVideoEngine.setDirectUrlUseDataLoader(str, String.valueOf(str.hashCode()) + "");
            }
            HashMap<String, String> extra = dataSource.getExtra();
            if (extra != null) {
                for (Map.Entry<String, String> entry : extra.entrySet()) {
                    this.f70827g.setCustomHeader(entry.getKey(), entry.getValue());
                }
                return;
            }
            return;
        }
        this.f70827g.setLocalURL(str);
    }
}
