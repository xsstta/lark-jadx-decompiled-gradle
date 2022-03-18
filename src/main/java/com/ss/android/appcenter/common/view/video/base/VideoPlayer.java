package com.ss.android.appcenter.common.view.video.base;

import android.content.Context;
import android.os.Bundle;
import android.view.Surface;
import com.ss.android.appcenter.common.view.video.base.misc.BundlePool;
import com.ss.android.appcenter.common.view.video.base.misc.PlayerTimerCounterProxy;
import com.ss.android.appcenter.common.view.video.base.player.EnginePlayer;
import com.ss.android.appcenter.common.view.video.base.player.IPlayer;
import com.ss.android.appcenter.common.view.video.data.DataSource;
import com.ss.android.appcenter.common.view.video.listener.OnBufferingListener;
import com.ss.android.appcenter.common.view.video.listener.OnErrorEventListener;
import com.ss.android.appcenter.common.view.video.listener.OnPlayerEventListener;
import com.ss.android.appcenter.common.view.video.listener.OnVideoSizeChangedListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007*\u0001\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\u001a\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\b\u0010!\u001a\u00020\u001bH\u0016J\b\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u001dH\u0016J\b\u0010$\u001a\u00020\u001dH\u0016J\b\u0010%\u001a\u00020\u001dH\u0016J\b\u0010&\u001a\u00020\u001dH\u0016J\b\u0010'\u001a\u00020\u001dH\u0016J\b\u0010(\u001a\u00020\u001bH\u0002J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u001dH\u0002J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020-H\u0016J\b\u0010/\u001a\u00020-H\u0016J\u001a\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u00102\u001a\u00020\u001bH\u0016J\b\u00103\u001a\u00020\u001bH\u0016J\u000e\u00104\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u001dJ\b\u00105\u001a\u00020\u001bH\u0016J\b\u00106\u001a\u00020\u001bH\u0002J\b\u00107\u001a\u00020\u001bH\u0016J\u0010\u00108\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u001dH\u0016J\u0010\u00109\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010:\u001a\u00020\u001b2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0010\u0010=\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020-H\u0016J\u0012\u0010?\u001a\u00020\u001b2\b\u0010@\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010A\u001a\u00020\u001b2\b\u0010B\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010C\u001a\u00020\u001b2\b\u0010D\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010E\u001a\u00020\u001b2\b\u0010F\u001a\u0004\u0018\u00010\u0013J\u0010\u0010G\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020IH\u0016J\u0012\u0010J\u001a\u00020\u001b2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0012\u0010K\u001a\u00020\u001b2\b\u0010\n\u001a\u0004\u0018\u00010LH\u0016J\u000e\u0010M\u001a\u00020\u001b2\u0006\u0010N\u001a\u00020-J\u0012\u0010O\u001a\u00020\u001b2\b\u0010P\u001a\u0004\u0018\u00010QH\u0016J\u0018\u0010R\u001a\u00020\u001b2\u0006\u0010S\u001a\u00020I2\u0006\u0010T\u001a\u00020IH\u0016J\b\u0010U\u001a\u00020\u001bH\u0016J\u0010\u0010U\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u001dH\u0016J\b\u0010V\u001a\u00020\u001bH\u0016J\u0010\u0010W\u001a\u00020\u001b2\u0006\u0010W\u001a\u00020-H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006X"}, d2 = {"Lcom/ss/android/appcenter/common/view/video/base/VideoPlayer;", "Lcom/ss/android/appcenter/common/view/video/base/player/IPlayer;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bufferingListener", "Lcom/ss/android/appcenter/common/view/video/listener/OnBufferingListener;", "counterUpdateListener", "com/ss/android/appcenter/common/view/video/base/VideoPlayer$counterUpdateListener$1", "Lcom/ss/android/appcenter/common/view/video/base/VideoPlayer$counterUpdateListener$1;", "dataSource", "Lcom/ss/android/appcenter/common/view/video/data/DataSource;", "errorEventListener", "Lcom/ss/android/appcenter/common/view/video/listener/OnErrorEventListener;", "internalPlayer", "Lcom/ss/android/appcenter/common/view/video/base/player/EnginePlayer;", "mInternalBufferingListener", "mInternalErrorEventListener", "mInternalOnVideoSizeChangedListener", "Lcom/ss/android/appcenter/common/view/video/listener/OnVideoSizeChangedListener;", "mInternalPlayerEventListener", "Lcom/ss/android/appcenter/common/view/video/listener/OnPlayerEventListener;", "playerEventListener", "timerCounterProxy", "Lcom/ss/android/appcenter/common/view/video/base/misc/PlayerTimerCounterProxy;", "videoSizeChangedListener", "callBackErrorEventListener", "", "eventCode", "", "bundle", "Landroid/os/Bundle;", "callBackPlayEventListener", "destroy", "getBufferPercentage", "getCurrentPosition", "getDuration", "getState", "getVideoHeight", "getVideoWidth", "initListener", "interPlayerSetDataSource", "internalPlayerStart", "msc", "isMute", "", "isPlaying", "isSystemPlayer", "option", "code", "pause", "prepare", "replay", "reset", "resetListener", "resume", "seekTo", "setDataSource", "setDisplay", "surface", "Landroid/view/Surface;", "setMute", "mute", "setOnBufferingListener", "onBufferingListener", "setOnErrorEventListener", "onErrorEventListener", "setOnPlayerEventListener", "onPlayerEventListener", "setOnVideoSizeChangedListener", "listener", "setSpeed", "speed", "", "setSurface", "setTTDataSource", "Lcom/ss/ttvideoengine/DataSource;", "setUseTimerProxy", "useTimerProxy", "setVideoID", "videoID", "", "setVolume", "left", "right", "start", "stop", "useCache", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.common.view.video.a.a */
public final class VideoPlayer implements IPlayer {

    /* renamed from: a */
    public final PlayerTimerCounterProxy f70787a = new PlayerTimerCounterProxy(1000);

    /* renamed from: b */
    public OnBufferingListener f70788b;

    /* renamed from: c */
    public OnVideoSizeChangedListener f70789c;

    /* renamed from: d */
    private final EnginePlayer f70790d;

    /* renamed from: e */
    private DataSource f70791e;

    /* renamed from: f */
    private OnPlayerEventListener f70792f;

    /* renamed from: g */
    private OnErrorEventListener f70793g;

    /* renamed from: h */
    private final C28225a f70794h = new C28225a(this);

    /* renamed from: i */
    private final OnPlayerEventListener f70795i = new C28229e(this);

    /* renamed from: j */
    private final OnErrorEventListener f70796j = new C28227c(this);

    /* renamed from: k */
    private final OnBufferingListener f70797k = new C28226b(this);

    /* renamed from: l */
    private final OnVideoSizeChangedListener f70798l;

    /* renamed from: a */
    public void mo100485a() {
        m103360c(0);
    }

    /* renamed from: d */
    public int mo100502d() {
        return this.f70790d.mo100540f();
    }

    /* renamed from: e */
    public int mo100503e() {
        return this.f70790d.mo100541g();
    }

    /* renamed from: f */
    public int mo100504f() {
        return this.f70790d.mo100528b();
    }

    /* renamed from: g */
    public void mo100505g() {
        this.f70790d.mo100542h();
    }

    /* renamed from: h */
    public int mo100506h() {
        return this.f70790d.mo100530c();
    }

    /* renamed from: i */
    public void mo100507i() {
        this.f70790d.mo100544j();
    }

    /* renamed from: j */
    public void mo100508j() {
        this.f70790d.mo100545k();
    }

    /* renamed from: l */
    public boolean mo100510l() {
        return this.f70790d.mo100549o();
    }

    /* renamed from: c */
    public boolean mo100501c() {
        return this.f70790d.mo100539e();
    }

    /* renamed from: k */
    public void mo100509k() {
        this.f70790d.mo100548n();
        m103362n();
    }

    /* renamed from: m */
    private final void m103361m() {
        this.f70787a.mo100515a(this.f70794h);
        this.f70790d.mo100526a(this.f70795i);
        this.f70790d.mo100525a(this.f70796j);
        this.f70790d.mo100524a(this.f70797k);
    }

    /* renamed from: n */
    private final void m103362n() {
        this.f70787a.mo100515a((PlayerTimerCounterProxy.OnCounterUpdateListener) null);
        this.f70790d.mo100526a((OnPlayerEventListener) null);
        this.f70790d.mo100525a((OnErrorEventListener) null);
        this.f70790d.mo100524a((OnBufferingListener) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/appcenter/common/view/video/base/VideoPlayer$counterUpdateListener$1", "Lcom/ss/android/appcenter/common/view/video/base/misc/PlayerTimerCounterProxy$OnCounterUpdateListener;", "onTimerCounter", "", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.common.view.video.a.a$a */
    public static final class C28225a implements PlayerTimerCounterProxy.OnCounterUpdateListener {

        /* renamed from: a */
        final /* synthetic */ VideoPlayer f70799a;

        @Override // com.ss.android.appcenter.common.view.video.base.misc.PlayerTimerCounterProxy.OnCounterUpdateListener
        /* renamed from: a */
        public void mo100511a() {
            int d = this.f70799a.mo100502d();
            int e = this.f70799a.mo100503e();
            int h = this.f70799a.mo100506h();
            if (e > 0 && d >= 0) {
                Bundle a = BundlePool.f70804a.mo100512a();
                a.putInt("int_arg1", d);
                a.putInt("int_arg2", e);
                a.putInt("int_arg3", h);
                this.f70799a.mo100488a(-99019, a);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C28225a(VideoPlayer aVar) {
            this.f70799a = aVar;
        }
    }

    /* renamed from: b */
    public boolean mo100500b() {
        return this.f70790d.mo100538d();
    }

    /* renamed from: a */
    public void mo100490a(OnBufferingListener aVar) {
        this.f70788b = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/appcenter/common/view/video/base/VideoPlayer$mInternalBufferingListener$1", "Lcom/ss/android/appcenter/common/view/video/listener/OnBufferingListener;", "onBufferingUpdate", "", "bufferPercentage", "", "extra", "Landroid/os/Bundle;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.common.view.video.a.a$b */
    public static final class C28226b implements OnBufferingListener {

        /* renamed from: a */
        final /* synthetic */ VideoPlayer f70800a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C28226b(VideoPlayer aVar) {
            this.f70800a = aVar;
        }

        @Override // com.ss.android.appcenter.common.view.video.listener.OnBufferingListener
        /* renamed from: b */
        public void mo99388b(int i, Bundle bundle) {
            OnBufferingListener aVar = this.f70800a.f70788b;
            if (aVar != null) {
                aVar.mo99388b(i, bundle);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/appcenter/common/view/video/base/VideoPlayer$mInternalErrorEventListener$1", "Lcom/ss/android/appcenter/common/view/video/listener/OnErrorEventListener;", "onErrorEvent", "", "eventCode", "", "bundle", "Landroid/os/Bundle;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.common.view.video.a.a$c */
    public static final class C28227c implements OnErrorEventListener {

        /* renamed from: a */
        final /* synthetic */ VideoPlayer f70801a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C28227c(VideoPlayer aVar) {
            this.f70801a = aVar;
        }

        @Override // com.ss.android.appcenter.common.view.video.listener.OnErrorEventListener
        /* renamed from: c */
        public void mo99390c(int i, Bundle bundle) {
            this.f70801a.f70787a.mo100518b(i, bundle);
            this.f70801a.mo100497b(i, bundle);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/appcenter/common/view/video/base/VideoPlayer$mInternalOnVideoSizeChangedListener$1", "Lcom/ss/android/appcenter/common/view/video/listener/OnVideoSizeChangedListener;", "onVideoSizeChanged", "", "videoWidth", "", "videoHeight", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.common.view.video.a.a$d */
    public static final class C28228d implements OnVideoSizeChangedListener {

        /* renamed from: a */
        final /* synthetic */ VideoPlayer f70802a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C28228d(VideoPlayer aVar) {
            this.f70802a = aVar;
        }

        @Override // com.ss.android.appcenter.common.view.video.listener.OnVideoSizeChangedListener
        /* renamed from: a */
        public void mo100457a(int i, int i2) {
            OnVideoSizeChangedListener dVar = this.f70802a.f70789c;
            if (dVar != null) {
                dVar.mo100457a(i, i2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/appcenter/common/view/video/base/VideoPlayer$mInternalPlayerEventListener$1", "Lcom/ss/android/appcenter/common/view/video/listener/OnPlayerEventListener;", "onPlayerEvent", "", "eventCode", "", "bundle", "Landroid/os/Bundle;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.common.view.video.a.a$e */
    public static final class C28229e implements OnPlayerEventListener {

        /* renamed from: a */
        final /* synthetic */ VideoPlayer f70803a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C28229e(VideoPlayer aVar) {
            this.f70803a = aVar;
        }

        @Override // com.ss.android.appcenter.common.view.video.listener.OnPlayerEventListener
        /* renamed from: a */
        public void mo99385a(int i, Bundle bundle) {
            this.f70803a.f70787a.mo100514a(i, bundle);
            this.f70803a.mo100488a(i, bundle);
        }
    }

    /* renamed from: b */
    private final void m103359b(DataSource dataSource) {
        this.f70790d.mo100533a(dataSource);
    }

    /* renamed from: c */
    private final void m103360c(int i) {
        this.f70790d.mo100535b(i);
    }

    /* renamed from: a */
    public void mo100486a(float f) {
        this.f70790d.mo100532a(f);
    }

    /* renamed from: b */
    public void mo100496b(int i) {
        this.f70790d.mo100537c(i);
    }

    /* renamed from: a */
    public final void mo100487a(int i) {
        DataSource dataSource = this.f70791e;
        if (dataSource != null) {
            m103359b(dataSource);
            m103360c(i);
        }
    }

    /* renamed from: b */
    public void mo100498b(Surface surface) {
        this.f70790d.mo100536b(surface);
    }

    public VideoPlayer(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkExpressionValueIsNotNull(applicationContext, "context.applicationContext");
        EnginePlayer bVar = new EnginePlayer(applicationContext);
        this.f70790d = bVar;
        C28228d dVar = new C28228d(this);
        this.f70798l = dVar;
        bVar.mo100527a(dVar);
    }

    @Override // com.ss.android.appcenter.common.view.video.base.player.IPlayer
    /* renamed from: a */
    public void mo100489a(Surface surface) {
        this.f70790d.mo100489a(surface);
    }

    /* renamed from: b */
    public void mo100499b(boolean z) {
        this.f70790d.mo100534a(z);
    }

    /* renamed from: a */
    public void mo100491a(OnErrorEventListener bVar) {
        this.f70793g = bVar;
    }

    /* renamed from: a */
    public void mo100492a(OnPlayerEventListener cVar) {
        this.f70792f = cVar;
    }

    /* renamed from: a */
    public final void mo100493a(OnVideoSizeChangedListener dVar) {
        this.f70789c = dVar;
    }

    /* renamed from: a */
    public void mo100494a(DataSource dataSource) {
        Intrinsics.checkParameterIsNotNull(dataSource, "dataSource");
        this.f70791e = dataSource;
        m103361m();
        m103359b(dataSource);
    }

    /* renamed from: a */
    public final void mo100495a(boolean z) {
        this.f70787a.mo100516a(z);
    }

    /* renamed from: b */
    public final void mo100497b(int i, Bundle bundle) {
        OnErrorEventListener bVar = this.f70793g;
        if (bVar != null) {
            bVar.mo99390c(i, bundle);
        }
    }

    /* renamed from: a */
    public final void mo100488a(int i, Bundle bundle) {
        OnPlayerEventListener cVar = this.f70792f;
        if (cVar != null) {
            cVar.mo99385a(i, bundle);
        }
    }
}
