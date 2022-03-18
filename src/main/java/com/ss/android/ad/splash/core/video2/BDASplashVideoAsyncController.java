package com.ss.android.ad.splash.core.video2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.ad.splash.utils.HandlerC27486n;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.VideoEngineListener;
import com.ss.ttvideoengine.VideoInfoListener;
import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.utils.Error;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 [2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001[B\u0011\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020#H\u0016J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020'H\u0016J\u001a\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010*H\u0002J\b\u0010,\u001a\u00020\nH\u0016J\b\u0010-\u001a\u00020\nH\u0016J\b\u0010.\u001a\u00020\nH\u0016J\b\u0010/\u001a\u00020\u0011H\u0002J\u0018\u00100\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u001b2\u0006\u00102\u001a\u00020 H\u0016J\u0010\u00103\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u001bH\u0016J\u0010\u00104\u001a\u00020\u00112\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020\n2\u0006\u00108\u001a\u000209H\u0016J\u0018\u0010:\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020 H\u0016J\b\u0010<\u001a\u00020\u0011H\u0002J\u0018\u0010=\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020 H\u0016J\u0010\u0010?\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u001bH\u0016J\u0010\u0010@\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u001bH\u0016J\u0010\u0010A\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u001bH\u0016J\u0018\u0010B\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020 H\u0016J \u0010D\u001a\u00020\u00112\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020 2\u0006\u0010H\u001a\u00020 H\u0016J\u0010\u0010I\u001a\u00020\n2\u0006\u0010E\u001a\u00020FH\u0016J \u0010J\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u001b2\u0006\u0010G\u001a\u00020 2\u0006\u0010H\u001a\u00020 H\u0016J\u0010\u0010K\u001a\u00020\u00112\u0006\u0010L\u001a\u00020 H\u0016J\b\u0010M\u001a\u00020\u0011H\u0016J\u001a\u0010N\u001a\u00020\n2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016J\b\u0010O\u001a\u00020\u0011H\u0002J\b\u0010P\u001a\u00020\u0011H\u0016J\b\u0010Q\u001a\u00020\u0011H\u0016J\u0010\u0010R\u001a\u00020\u00112\u0006\u0010S\u001a\u00020\nH\u0016J\u0010\u0010T\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\u001dH\u0016J\u000e\u0010V\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010W\u001a\u00020\u00112\u0006\u0010X\u001a\u00020#2\u0006\u0010Y\u001a\u00020#H\u0016J\b\u0010Z\u001a\u00020\u0011H\u0016R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\\"}, d2 = {"Lcom/ss/android/ad/splash/core/video2/BDASplashVideoAsyncController;", "Lcom/ss/android/ad/splash/utils/WeakHandler$IHandler;", "Lcom/ss/android/ad/splash/core/video2/IBDASplashVideoController;", "Lcom/ss/ttvideoengine/VideoEngineListener;", "Lcom/ss/ttvideoengine/VideoInfoListener;", "Lcom/ss/android/ad/splash/core/video2/IBDASplashVideoViewCallback;", "videoView", "Lcom/ss/android/ad/splash/core/video2/IBDASplashVideoView;", "(Lcom/ss/android/ad/splash/core/video2/IBDASplashVideoView;)V", "isSurfaceValid", "", "mContext", "Landroid/content/Context;", "mLastProgressUpdateTime", "", "mLaterInvokePlayVideo", "Lkotlin/Function0;", "", "mMainHandler", "Lcom/ss/android/ad/splash/utils/WeakHandler;", "mPlayerHandler", "Landroid/os/Handler;", "mPlayerThread", "Landroid/os/HandlerThread;", "mStartIndicator", "mStopIndicator", "mVideoEngine", "Lcom/ss/ttvideoengine/TTVideoEngine;", "mVideoStatusListener", "Lcom/ss/android/ad/splash/core/video2/BDASplashVideoStatusListener;", "mVideoView", "getCurrentPosition", "", "getDuration", "getMaxVolume", "", "getVolume", "handleMsg", "msg", "Landroid/os/Message;", "initVideoEngine", "videoUrl", "", "decryptKey", "isVideoComplete", "isVideoPause", "isVideoPlaying", "laterInvokePlayVideo", "onBufferingUpdate", "engine", "percent", "onCompletion", "onError", "error", "Lcom/ss/ttvideoengine/utils/Error;", "onFetchedVideoInfo", "model", "Lcom/ss/ttvideoengine/model/VideoModel;", "onLoadStateChanged", "loadState", "onPlaybackProgressUpdate", "onPlaybackStateChanged", "playbackState", "onPrepare", "onPrepared", "onRenderStart", "onStreamChanged", ShareHitPoint.f121869d, "onSurfaceTextureAvailable", "surface", "Landroid/graphics/SurfaceTexture;", "width", "height", "onSurfaceTextureDestroyed", "onVideoSizeChanged", "onVideoStatusException", UpdateKey.STATUS, "pause", "play", "playVideo", "release", "resume", "setMute", "isMute", "setSplashVideoStatusListener", "listener", "setVideoView", "setVolume", "leftVol", "rightVol", "stop", "Companion", "SplashAd_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ad.splash.core.video2.a */
public final class BDASplashVideoAsyncController implements AbstractC27436f, AbstractC27438h, HandlerC27486n.AbstractC27487a, VideoEngineListener, VideoInfoListener {

    /* renamed from: g */
    public static final Companion f68524g = new Companion(null);

    /* renamed from: a */
    public AbstractC27437g f68525a;

    /* renamed from: b */
    public TTVideoEngine f68526b;

    /* renamed from: c */
    public AbstractC27429b f68527c;

    /* renamed from: d */
    public Function0<Unit> f68528d;

    /* renamed from: e */
    public HandlerC27486n f68529e;

    /* renamed from: f */
    public HandlerThread f68530f;

    /* renamed from: h */
    private Context f68531h;

    /* renamed from: i */
    private boolean f68532i;

    /* renamed from: j */
    private boolean f68533j;

    /* renamed from: k */
    private boolean f68534k;

    /* renamed from: l */
    private long f68535l;

    /* renamed from: m */
    private Handler f68536m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ad.splash.core.video2.a$c */
    static final class C27411c extends Lambda implements Function0<Unit> {
        public static final C27411c INSTANCE = new C27411c();

        C27411c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
        }
    }

    public BDASplashVideoAsyncController() {
        this(null, 1, null);
    }

    /* renamed from: a */
    public static HandlerThread m100047a(String str, int i) {
        return C20341a.m74147a() ? C20339a.m74145a(str, i, C20341a.f49621b) : new HandlerThread(str, i);
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27438h
    /* renamed from: a */
    public boolean mo97922a(SurfaceTexture surfaceTexture) {
        Intrinsics.checkParameterIsNotNull(surfaceTexture, "surface");
        return false;
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
        Intrinsics.checkParameterIsNotNull(tTVideoEngine, "engine");
    }

    @Override // com.ss.ttvideoengine.VideoInfoListener
    public boolean onFetchedVideoInfo(VideoModel videoModel) {
        Intrinsics.checkParameterIsNotNull(videoModel, "model");
        return false;
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
        Intrinsics.checkParameterIsNotNull(tTVideoEngine, "engine");
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onPrepare(TTVideoEngine tTVideoEngine) {
        Intrinsics.checkParameterIsNotNull(tTVideoEngine, "engine");
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onPrepared(TTVideoEngine tTVideoEngine) {
        Intrinsics.checkParameterIsNotNull(tTVideoEngine, "engine");
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
        Intrinsics.checkParameterIsNotNull(tTVideoEngine, "engine");
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(tTVideoEngine, "engine");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ad/splash/core/video2/BDASplashVideoAsyncController$Companion;", "", "()V", "MSG_UPDATE_PLAYING_PROGRESS", "", "UPDATE_PROGRESS_INTERVAL", "", "SplashAd_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ad.splash.core.video2.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ad.splash.core.video2.a$b */
    public static final class C27410b extends Lambda implements Function0<Unit> {
        final /* synthetic */ BDASplashVideoAsyncController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27410b(BDASplashVideoAsyncController aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo97915a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ad.splash.core.video2.a$d */
    static final class RunnableC27412d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BDASplashVideoAsyncController f68537a;

        /* renamed from: b */
        final /* synthetic */ TTVideoEngine f68538b;

        RunnableC27412d(BDASplashVideoAsyncController aVar, TTVideoEngine tTVideoEngine) {
            this.f68537a = aVar;
            this.f68538b = tTVideoEngine;
        }

        public final void run() {
            AbstractC27429b bVar = this.f68537a.f68527c;
            if (bVar != null) {
                bVar.mo97175a(this.f68538b.getDuration());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ad.splash.core.video2.a$e */
    static final class RunnableC27413e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BDASplashVideoAsyncController f68539a;

        RunnableC27413e(BDASplashVideoAsyncController aVar) {
            this.f68539a = aVar;
        }

        public final void run() {
            AbstractC27429b bVar = this.f68539a.f68527c;
            if (bVar != null) {
                bVar.mo97177b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ad.splash.core.video2.a$g */
    static final class RunnableC27415g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BDASplashVideoAsyncController f68541a;

        RunnableC27415g(BDASplashVideoAsyncController aVar) {
            this.f68541a = aVar;
        }

        public final void run() {
            AbstractC27429b bVar = this.f68541a.f68527c;
            if (bVar != null) {
                bVar.mo97174a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ad.splash.core.video2.a$h */
    static final class RunnableC27416h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BDASplashVideoAsyncController f68542a;

        /* renamed from: b */
        final /* synthetic */ TTVideoEngine f68543b;

        RunnableC27416h(BDASplashVideoAsyncController aVar, TTVideoEngine tTVideoEngine) {
            this.f68542a = aVar;
            this.f68543b = tTVideoEngine;
        }

        public final void run() {
            AbstractC27429b bVar = this.f68542a.f68527c;
            if (bVar != null) {
                bVar.mo97225b(this.f68543b.getDuration());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ad.splash.core.video2.a$j */
    static final class RunnableC27418j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BDASplashVideoAsyncController f68546a;

        RunnableC27418j(BDASplashVideoAsyncController aVar) {
            this.f68546a = aVar;
        }

        public final void run() {
            AbstractC27429b bVar = this.f68546a.f68527c;
            if (bVar != null) {
                bVar.mo97177b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ad.splash.core.video2.a$k */
    static final class RunnableC27419k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BDASplashVideoAsyncController f68547a;

        RunnableC27419k(BDASplashVideoAsyncController aVar) {
            this.f68547a = aVar;
        }

        public final void run() {
            TTVideoEngine tTVideoEngine = this.f68547a.f68526b;
            if (tTVideoEngine != null) {
                tTVideoEngine.pause();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ad.splash.core.video2.a$o */
    static final class RunnableC27424o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BDASplashVideoAsyncController f68554a;

        RunnableC27424o(BDASplashVideoAsyncController aVar) {
            this.f68554a = aVar;
        }

        public final void run() {
            TTVideoEngine tTVideoEngine = this.f68554a.f68526b;
            if (tTVideoEngine != null) {
                tTVideoEngine.play();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ad.splash.core.video2.a$p */
    static final class RunnableC27425p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BDASplashVideoAsyncController f68555a;

        /* renamed from: b */
        final /* synthetic */ boolean f68556b;

        RunnableC27425p(BDASplashVideoAsyncController aVar, boolean z) {
            this.f68555a = aVar;
            this.f68556b = z;
        }

        public final void run() {
            TTVideoEngine tTVideoEngine = this.f68555a.f68526b;
            if (tTVideoEngine != null) {
                tTVideoEngine.setIsMute(this.f68556b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ad.splash.core.video2.a$q */
    static final class RunnableC27426q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BDASplashVideoAsyncController f68557a;

        /* renamed from: b */
        final /* synthetic */ float f68558b;

        /* renamed from: c */
        final /* synthetic */ float f68559c;

        RunnableC27426q(BDASplashVideoAsyncController aVar, float f, float f2) {
            this.f68557a = aVar;
            this.f68558b = f;
            this.f68559c = f2;
        }

        public final void run() {
            TTVideoEngine tTVideoEngine = this.f68557a.f68526b;
            if (tTVideoEngine != null) {
                tTVideoEngine.setVolume(this.f68558b, this.f68559c);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ad.splash.core.video2.a$s */
    static final class RunnableC27428s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BDASplashVideoAsyncController f68561a;

        RunnableC27428s(BDASplashVideoAsyncController aVar) {
            this.f68561a = aVar;
        }

        public final void run() {
            TTVideoEngine tTVideoEngine = this.f68561a.f68526b;
            if (tTVideoEngine != null) {
                tTVideoEngine.stop();
            }
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27436f
    /* renamed from: c */
    public float mo97925c() {
        TTVideoEngine tTVideoEngine = this.f68526b;
        if (tTVideoEngine != null) {
            return tTVideoEngine.getVolume();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27436f
    /* renamed from: d */
    public float mo97926d() {
        TTVideoEngine tTVideoEngine = this.f68526b;
        if (tTVideoEngine != null) {
            return tTVideoEngine.getMaxVolume();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: e */
    public boolean mo97927e() {
        TTVideoEngine tTVideoEngine = this.f68526b;
        if (tTVideoEngine == null || tTVideoEngine.getPlaybackState() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo97928f() {
        TTVideoEngine tTVideoEngine = this.f68526b;
        if (tTVideoEngine == null || tTVideoEngine.getPlaybackState() != 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27436f
    /* renamed from: g */
    public int mo97929g() {
        TTVideoEngine tTVideoEngine = this.f68526b;
        if (tTVideoEngine != null) {
            return tTVideoEngine.getCurrentPlaybackTime();
        }
        return 0;
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27436f
    /* renamed from: h */
    public int mo97930h() {
        TTVideoEngine tTVideoEngine = this.f68526b;
        if (tTVideoEngine != null) {
            return tTVideoEngine.getDuration();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ad.splash.core.video2.a$f */
    public static final class RunnableC27414f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BDASplashVideoAsyncController f68540a;

        RunnableC27414f(BDASplashVideoAsyncController aVar) {
            this.f68540a = aVar;
        }

        public final void run() {
            AbstractC27429b bVar = this.f68540a.f68527c;
            if (bVar != null) {
                bVar.mo97954g(this.f68540a.mo97929g(), this.f68540a.mo97930h());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ad.splash.core.video2.a$i */
    static final class RunnableC27417i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BDASplashVideoAsyncController f68544a;

        /* renamed from: b */
        final /* synthetic */ Surface f68545b;

        RunnableC27417i(BDASplashVideoAsyncController aVar, Surface surface) {
            this.f68544a = aVar;
            this.f68545b = surface;
        }

        public final void run() {
            TTVideoEngine tTVideoEngine = this.f68544a.f68526b;
            if (tTVideoEngine != null) {
                tTVideoEngine.setSurface(this.f68545b);
            }
            this.f68544a.f68528d.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ad.splash.core.video2.a$m */
    public static final class RunnableC27422m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TTVideoEngine f68552a;

        RunnableC27422m(TTVideoEngine tTVideoEngine) {
            this.f68552a = tTVideoEngine;
        }

        public final void run() {
            try {
                Result.Companion aVar = Result.Companion;
                this.f68552a.setLooping(false);
                this.f68552a.play();
                Result.m271569constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion aVar2 = Result.Companion;
                Result.m271569constructorimpl(C69097g.m265890a(th));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ad.splash.core.video2.a$r */
    static final class RunnableC27427r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BDASplashVideoAsyncController f68560a;

        RunnableC27427r(BDASplashVideoAsyncController aVar) {
            this.f68560a = aVar;
        }

        public final void run() {
            AbstractC27429b bVar = this.f68560a.f68527c;
            if (bVar != null) {
                bVar.mo97176a(this.f68560a.mo97929g(), this.f68560a.mo97930h());
            }
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27436f
    /* renamed from: b */
    public void mo97923b() {
        if (!this.f68533j) {
            this.f68529e.post(new RunnableC27427r(this));
            this.f68536m.post(new RunnableC27428s(this));
            this.f68533j = true;
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27436f
    /* renamed from: i */
    public void mo97931i() {
        if (mo97927e()) {
            this.f68536m.post(new RunnableC27419k(this));
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27436f
    /* renamed from: j */
    public void mo97932j() {
        if (mo97928f()) {
            this.f68536m.post(new RunnableC27424o(this));
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27436f
    /* renamed from: k */
    public void mo97933k() {
        AbstractC27437g gVar = this.f68525a;
        if (gVar != null) {
            gVar.mo97904a(false);
        }
        this.f68536m.post(new RunnableC27423n(this));
    }

    /* renamed from: l */
    public final void mo97934l() {
        if (this.f68532i) {
            mo97915a();
        } else {
            this.f68528d = new C27410b(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ad.splash.core.video2.a$n */
    static final class RunnableC27423n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BDASplashVideoAsyncController f68553a;

        RunnableC27423n(BDASplashVideoAsyncController aVar) {
            this.f68553a = aVar;
        }

        public final void run() {
            TTVideoEngine tTVideoEngine = this.f68553a.f68526b;
            if (tTVideoEngine != null) {
                tTVideoEngine.setListener(null);
                tTVideoEngine.setVideoInfoListener(null);
                tTVideoEngine.release();
            }
            this.f68553a.f68526b = null;
            this.f68553a.f68527c = null;
            if (Build.VERSION.SDK_INT >= 18) {
                this.f68553a.f68530f.quitSafely();
            } else {
                this.f68553a.f68530f.quit();
            }
        }
    }

    /* renamed from: a */
    public final void mo97915a() {
        TTVideoEngine tTVideoEngine = this.f68526b;
        if (tTVideoEngine != null) {
            this.f68536m.post(new RunnableC27422m(tTVideoEngine));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ad.splash.core.video2.a$l */
    static final class RunnableC27420l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BDASplashVideoAsyncController f68548a;

        /* renamed from: b */
        final /* synthetic */ String f68549b;

        /* renamed from: c */
        final /* synthetic */ String f68550c;

        RunnableC27420l(BDASplashVideoAsyncController aVar, String str, String str2) {
            this.f68548a = aVar;
            this.f68549b = str;
            this.f68550c = str2;
        }

        public final void run() {
            Surface surface;
            this.f68548a.mo97920a(this.f68549b, this.f68550c);
            AbstractC27437g gVar = this.f68548a.f68525a;
            if (gVar != null) {
                surface = gVar.getSurface();
            } else {
                surface = null;
            }
            if (surface == null || !surface.isValid()) {
                this.f68548a.f68529e.post(new Runnable(this) {
                    /* class com.ss.android.ad.splash.core.video2.BDASplashVideoAsyncController.RunnableC27420l.RunnableC274211 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC27420l f68551a;

                    {
                        this.f68551a = r1;
                    }

                    public final void run() {
                        AbstractC27437g gVar = this.f68551a.f68548a.f68525a;
                        if (gVar != null) {
                            gVar.setSurfaceViewVisibility(0);
                        }
                    }
                });
                this.f68548a.mo97934l();
                return;
            }
            TTVideoEngine tTVideoEngine = this.f68548a.f68526b;
            if (tTVideoEngine != null) {
                tTVideoEngine.setSurface(surface);
            }
            this.f68548a.mo97915a();
        }
    }

    /* renamed from: m */
    private final void m100048m() {
        if (this.f68526b != null) {
            if (mo97927e()) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long j = this.f68535l;
                long j2 = uptimeMillis - j;
                long j3 = 100;
                if (j != 0 && j2 > 100) {
                    j3 = 100 - (j2 % 100);
                }
                this.f68529e.sendMessageDelayed(this.f68529e.obtainMessage(1000), j3);
                this.f68535l = uptimeMillis;
            } else {
                this.f68535l = 0;
            }
            if (mo97930h() > 0) {
                this.f68529e.post(new RunnableC27414f(this));
            }
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27436f
    /* renamed from: a */
    public void mo97918a(AbstractC27429b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f68527c = bVar;
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onVideoStatusException(int i) {
        this.f68529e.post(new RunnableC27418j(this));
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onCompletion(TTVideoEngine tTVideoEngine) {
        Intrinsics.checkParameterIsNotNull(tTVideoEngine, "engine");
        this.f68529e.post(new RunnableC27412d(this, tTVideoEngine));
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onError(Error error) {
        Intrinsics.checkParameterIsNotNull(error, "error");
        this.f68529e.post(new RunnableC27413e(this));
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onRenderStart(TTVideoEngine tTVideoEngine) {
        Intrinsics.checkParameterIsNotNull(tTVideoEngine, "engine");
        this.f68529e.post(new RunnableC27416h(this, tTVideoEngine));
    }

    public BDASplashVideoAsyncController(AbstractC27437g gVar) {
        this.f68528d = C27411c.INSTANCE;
        this.f68529e = new HandlerC27486n(this);
        this.f68530f = m100047a("player_thread", 0);
        try {
            Result.Companion aVar = Result.Companion;
            this.f68530f.start();
            Result.m271569constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion aVar2 = Result.Companion;
            Result.m271569constructorimpl(C69097g.m265890a(th));
        }
        this.f68536m = new Handler(this.f68530f.getLooper());
        if (gVar != null) {
            mo97919a(gVar);
        }
    }

    @Override // com.ss.android.ad.splash.utils.HandlerC27486n.AbstractC27487a
    /* renamed from: a */
    public void mo97152a(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "msg");
        if (message.what == 1000) {
            m100048m();
        }
    }

    /* renamed from: a */
    public final void mo97919a(AbstractC27437g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "videoView");
        this.f68531h = gVar.getApplicationContext();
        gVar.setVideoViewCallback(this);
        this.f68525a = gVar;
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27436f
    /* renamed from: a */
    public void mo97921a(boolean z) {
        this.f68536m.post(new RunnableC27425p(this, z));
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27436f
    /* renamed from: a */
    public void mo97916a(float f, float f2) {
        this.f68536m.post(new RunnableC27426q(this, f, f2));
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27436f
    /* renamed from: b */
    public boolean mo97924b(String str, String str2) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "videoUrl");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || this.f68525a == null) {
            return false;
        }
        this.f68536m.post(new RunnableC27420l(this, str, str2));
        this.f68533j = false;
        return true;
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
        Intrinsics.checkParameterIsNotNull(tTVideoEngine, "engine");
        if (mo97927e()) {
            if (!this.f68534k) {
                this.f68534k = true;
                this.f68529e.post(new RunnableC27415g(this));
            }
            this.f68529e.removeMessages(1000);
            this.f68529e.sendEmptyMessage(1000);
        }
        AbstractC27429b bVar = this.f68527c;
        if (bVar == null) {
            return;
        }
        if (i == 1) {
            bVar.mo97955h();
        } else if (i == 2) {
            bVar.mo97953f(mo97929g());
        }
    }

    /* renamed from: a */
    public final void mo97920a(String str, String str2) {
        TTVideoEngine tTVideoEngine = this.f68526b;
        if (tTVideoEngine != null) {
            tTVideoEngine.release();
        }
        TTVideoEngine tTVideoEngine2 = new TTVideoEngine(this.f68531h, 0);
        boolean z = true;
        tTVideoEngine2.setIsMute(true);
        tTVideoEngine2.setTag("splash_ad");
        tTVideoEngine2.setListener(this);
        tTVideoEngine2.setVideoInfoListener(this);
        tTVideoEngine2.setIntOption(4, 2);
        tTVideoEngine2.setLocalURL(str);
        String str3 = str2;
        if (!(str3 == null || str3.length() == 0)) {
            z = false;
        }
        if (z) {
            str2 = null;
        }
        if (str2 != null) {
            tTVideoEngine2.setDecryptionKey(str2);
        }
        tTVideoEngine2.setStartTime(0);
        this.f68526b = tTVideoEngine2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BDASplashVideoAsyncController(AbstractC27437g gVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : gVar);
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27438h
    /* renamed from: a */
    public void mo97917a(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface;
        Intrinsics.checkParameterIsNotNull(surfaceTexture, "surface");
        this.f68532i = true;
        AbstractC27437g gVar = this.f68525a;
        if (gVar == null || (surface = gVar.getSurface()) == null) {
            surface = new Surface(surfaceTexture);
        }
        this.f68536m.post(new RunnableC27417i(this, surface));
    }
}
