package com.ss.android.appcenter.common.view.video;

import android.content.Context;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.view.video.base.VideoPlayer;
import com.ss.android.appcenter.common.view.video.data.DataSource;
import com.ss.android.appcenter.common.view.video.listener.OnBufferingListener;
import com.ss.android.appcenter.common.view.video.listener.OnErrorEventListener;
import com.ss.android.appcenter.common.view.video.listener.OnPlayerEventListener;
import com.ss.android.appcenter.common.view.video.listener.OnVideoSizeChangedListener;
import com.ss.android.appcenter.common.view.video.render.RenderSurfaceView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012*\u0001\u001e\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u001f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\u0012\u0010.\u001a\u00020+2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\b\u0010/\u001a\u00020\u000bH\u0016J\b\u00100\u001a\u00020\u000bH\u0016J\b\u00101\u001a\u00020\u000bH\u0016J\b\u00102\u001a\u00020\u000bH\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u00103\u001a\u00020\u0018H\u0016J\b\u00104\u001a\u00020\u0018H\u0016J\b\u00105\u001a\u00020\u0018H\u0016J\u0010\u00106\u001a\u00020+2\u0006\u00107\u001a\u000208H\u0014J\u0018\u00109\u001a\u00020+2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000bH\u0016J\b\u0010:\u001a\u00020+H\u0016J\b\u0010;\u001a\u00020+H\u0016J\b\u0010<\u001a\u00020+H\u0002J\u0010\u0010=\u001a\u00020+2\u0006\u0010>\u001a\u00020\u000bH\u0016J\b\u0010?\u001a\u00020+H\u0002J\b\u0010@\u001a\u00020+H\u0016J\u0010\u0010A\u001a\u00020+2\u0006\u0010>\u001a\u00020\u000bH\u0016J\u0010\u0010B\u001a\u00020+2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020+2\u0006\u0010F\u001a\u00020\u0018H\u0016J\u000e\u0010G\u001a\u00020+2\u0006\u0010H\u001a\u00020\u0010J\u0010\u0010I\u001a\u00020+2\b\u0010J\u001a\u0004\u0018\u00010\u0012J\u0010\u0010K\u001a\u00020+2\b\u0010L\u001a\u0004\u0018\u00010\u0016J\u0010\u0010M\u001a\u00020+2\u0006\u0010N\u001a\u00020-H\u0016J\u0018\u0010O\u001a\u00020+2\u0006\u0010P\u001a\u00020-2\u0006\u0010Q\u001a\u00020-H\u0016J\b\u0010R\u001a\u00020+H\u0002J\b\u0010S\u001a\u00020+H\u0016J\u0010\u0010S\u001a\u00020+2\u0006\u0010>\u001a\u00020\u000bH\u0016J\b\u0010T\u001a\u00020+H\u0016J\b\u0010U\u001a\u00020+H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0004\n\u0002\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'XD¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006V"}, d2 = {"Lcom/ss/android/appcenter/common/view/video/VideoView;", "Landroid/widget/FrameLayout;", "Lcom/ss/android/appcenter/common/view/video/base/player/IVideoView;", "Lcom/ss/android/appcenter/common/view/video/listener/OnVideoSizeChangedListener;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "audioFocusListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "bufferingListener", "Lcom/ss/android/appcenter/common/view/video/listener/OnBufferingListener;", "errorEventListener", "Lcom/ss/android/appcenter/common/view/video/listener/OnErrorEventListener;", "internalBufferingListener", "internalErrorEventListener", "internalPlayerEventListener", "Lcom/ss/android/appcenter/common/view/video/listener/OnPlayerEventListener;", "isBuffering", "", "orientation", "player", "Lcom/ss/android/appcenter/common/view/video/base/VideoPlayer;", "playerEventListener", "renderCallback", "com/ss/android/appcenter/common/view/video/VideoView$renderCallback$1", "Lcom/ss/android/appcenter/common/view/video/VideoView$renderCallback$1;", "renderHolder", "Lcom/ss/android/appcenter/common/view/video/render/RenderSurfaceView$IRenderHolder;", "screenHeightDp", "screenWidthDp", "surfaceView", "Lcom/ss/android/appcenter/common/view/video/render/RenderSurfaceView;", "tag", "", "videoHeight", "videoWidth", "adjustSurfaceSize", "", "videoRatio", "", "bindRenderHolder", "getBufferPercentage", "getCurrentPosition", "getDuration", "getState", "isInPlaybackState", "isMute", "isPlaying", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onVideoSizeChanged", "pause", "prepare", "releaseAudioFocus", "replay", "msc", "requestAudioFocus", "resume", "seekTo", "setDataSource", "dataSource", "Lcom/ss/android/appcenter/common/view/video/data/DataSource;", "setMute", "mute", "setOnBufferingListener", "onBufferingListener", "setOnErrorEventListener", "onErrorEventListener", "setOnPlayerEventListener", "onPlayerEventListener", "setSpeed", "speed", "setVolume", "left", "right", "setupSurfaceView", "start", "stop", "stopPlayback", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class VideoView extends FrameLayout implements OnVideoSizeChangedListener {

    /* renamed from: a */
    public final String f70763a = "AppCenterVideoView";

    /* renamed from: b */
    public int f70764b;

    /* renamed from: c */
    public int f70765c;

    /* renamed from: d */
    public boolean f70766d;

    /* renamed from: e */
    public RenderSurfaceView.IRenderHolder f70767e;

    /* renamed from: f */
    public OnPlayerEventListener f70768f;

    /* renamed from: g */
    public OnErrorEventListener f70769g;

    /* renamed from: h */
    public OnBufferingListener f70770h;

    /* renamed from: i */
    private final VideoPlayer f70771i;

    /* renamed from: j */
    private RenderSurfaceView f70772j;

    /* renamed from: k */
    private int f70773k;

    /* renamed from: l */
    private int f70774l;

    /* renamed from: m */
    private int f70775m;

    /* renamed from: n */
    private C28224f f70776n;

    /* renamed from: o */
    private final OnPlayerEventListener f70777o;

    /* renamed from: p */
    private final OnErrorEventListener f70778p;

    /* renamed from: q */
    private final OnBufferingListener f70779q;

    /* renamed from: r */
    private final AudioManager.OnAudioFocusChangeListener f70780r;

    /* renamed from: d */
    public boolean mo100463d() {
        return this.f70766d;
    }

    /* renamed from: c */
    public boolean mo100462c() {
        return this.f70771i.mo100501c();
    }

    /* renamed from: e */
    public void mo100464e() {
        this.f70771i.mo100505g();
    }

    /* renamed from: f */
    public void mo100465f() {
        this.f70771i.mo100485a();
    }

    /* renamed from: g */
    public void mo100466g() {
        this.f70771i.mo100507i();
    }

    public int getBufferPercentage() {
        return this.f70771i.mo100506h();
    }

    public int getCurrentPosition() {
        return this.f70771i.mo100502d();
    }

    public int getDuration() {
        return this.f70771i.mo100503e();
    }

    public int getState() {
        return this.f70771i.mo100504f();
    }

    /* renamed from: h */
    public void mo100471h() {
        this.f70771i.mo100508j();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.common.view.video.VideoView$e */
    static final class RunnableC28223e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoView f70785a;

        RunnableC28223e(VideoView videoView) {
            this.f70785a = videoView;
        }

        public final void run() {
            VideoView videoView = this.f70785a;
            videoView.mo100457a((int) ((float) videoView.f70764b), (int) ((float) this.f70785a.f70765c));
        }
    }

    /* renamed from: l */
    private final void m103339l() {
        C28184h.m103250d(this.f70763a, "<<releaseAudioFocus>>");
        Object systemService = getContext().getSystemService("audio");
        if (!(systemService instanceof AudioManager)) {
            systemService = null;
        }
        AudioManager audioManager = (AudioManager) systemService;
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.f70780r);
        }
    }

    /* renamed from: b */
    public boolean mo100461b() {
        int state = getState();
        if (state == -2 || state == -1 || state == 0 || state == 1 || state == 5) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public void mo100472i() {
        C28184h.m103250d(this.f70763a, "stopPlayback release.");
        m103339l();
        this.f70771i.mo100509k();
        this.f70767e = null;
        removeAllViews();
    }

    /* renamed from: j */
    private final void m103337j() {
        this.f70771i.mo100498b((Surface) null);
        this.f70767e = null;
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        RenderSurfaceView renderSurfaceView = new RenderSurfaceView(context);
        this.f70772j = renderSurfaceView;
        if (renderSurfaceView != null) {
            renderSurfaceView.setRenderCallback(this.f70776n);
        }
        addView(this.f70772j, new FrameLayout.LayoutParams(-2, -2, 17));
    }

    /* renamed from: k */
    private final void m103338k() {
        C28184h.m103250d(this.f70763a, ">>requestAudioFocus<<");
        Object systemService = getContext().getSystemService("audio");
        if (!(systemService instanceof AudioManager)) {
            systemService = null;
        }
        AudioManager audioManager = (AudioManager) systemService;
        if (audioManager != null) {
            audioManager.requestAudioFocus(this.f70780r, 3, 2);
        }
    }

    /* renamed from: a */
    public boolean mo100459a() {
        return this.f70771i.mo100500b();
    }

    public final void setOnErrorEventListener(OnErrorEventListener bVar) {
        this.f70769g = bVar;
    }

    public final void setOnPlayerEventListener(OnPlayerEventListener cVar) {
        this.f70768f = cVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/appcenter/common/view/video/VideoView$internalBufferingListener$1", "Lcom/ss/android/appcenter/common/view/video/listener/OnBufferingListener;", "onBufferingUpdate", "", "bufferPercentage", "", "extra", "Landroid/os/Bundle;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.common.view.video.VideoView$b */
    public static final class C28220b implements OnBufferingListener {

        /* renamed from: a */
        final /* synthetic */ VideoView f70782a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C28220b(VideoView videoView) {
            this.f70782a = videoView;
        }

        @Override // com.ss.android.appcenter.common.view.video.listener.OnBufferingListener
        /* renamed from: b */
        public void mo99388b(int i, Bundle bundle) {
            OnBufferingListener aVar = this.f70782a.f70770h;
            if (aVar != null) {
                aVar.mo99388b(i, bundle);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/appcenter/common/view/video/VideoView$internalErrorEventListener$1", "Lcom/ss/android/appcenter/common/view/video/listener/OnErrorEventListener;", "onErrorEvent", "", "eventCode", "", "bundle", "Landroid/os/Bundle;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.common.view.video.VideoView$c */
    public static final class C28221c implements OnErrorEventListener {

        /* renamed from: a */
        final /* synthetic */ VideoView f70783a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C28221c(VideoView videoView) {
            this.f70783a = videoView;
        }

        @Override // com.ss.android.appcenter.common.view.video.listener.OnErrorEventListener
        /* renamed from: c */
        public void mo99390c(int i, Bundle bundle) {
            String str;
            this.f70783a.f70766d = false;
            String str2 = this.f70783a.f70763a;
            StringBuilder sb = new StringBuilder();
            sb.append("onError : code = ");
            sb.append(i);
            sb.append(", Message = ");
            if (bundle == null || (str = bundle.toString()) == null) {
                str = "no message";
            }
            sb.append((Object) str);
            C28184h.m103248b(str2, sb.toString());
            OnErrorEventListener bVar = this.f70783a.f70769g;
            if (bVar != null) {
                bVar.mo99390c(i, bundle);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/appcenter/common/view/video/VideoView$internalPlayerEventListener$1", "Lcom/ss/android/appcenter/common/view/video/listener/OnPlayerEventListener;", "onPlayerEvent", "", "eventCode", "", "bundle", "Landroid/os/Bundle;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.common.view.video.VideoView$d */
    public static final class C28222d implements OnPlayerEventListener {

        /* renamed from: a */
        final /* synthetic */ VideoView f70784a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C28222d(VideoView videoView) {
            this.f70784a = videoView;
        }

        @Override // com.ss.android.appcenter.common.view.video.listener.OnPlayerEventListener
        /* renamed from: a */
        public void mo99385a(int i, Bundle bundle) {
            int i2;
            int i3;
            int i4 = 0;
            switch (i) {
                case -99053:
                    this.f70784a.f70766d = true;
                    break;
                case -99018:
                    this.f70784a.f70766d = false;
                    VideoView videoView = this.f70784a;
                    if (bundle != null) {
                        i2 = bundle.getInt("int_arg1");
                    } else {
                        i2 = 0;
                    }
                    videoView.f70764b = i2;
                    VideoView videoView2 = this.f70784a;
                    if (bundle != null) {
                        i4 = bundle.getInt("int_arg2");
                    }
                    videoView2.f70765c = i4;
                    VideoView videoView3 = this.f70784a;
                    videoView3.mo100458a(videoView3.f70767e);
                    break;
                case -99017:
                    VideoView videoView4 = this.f70784a;
                    if (bundle != null) {
                        i3 = bundle.getInt("int_arg1");
                    } else {
                        i3 = 0;
                    }
                    videoView4.f70764b = i3;
                    VideoView videoView5 = this.f70784a;
                    if (bundle != null) {
                        i4 = bundle.getInt("int_arg2");
                    }
                    videoView5.f70765c = i4;
                    String str = this.f70784a.f70763a;
                    C28184h.m103250d(str, "onVideoSizeChange : videoWidth = " + this.f70784a.f70764b + ", videoHeight = " + this.f70784a.f70765c);
                    break;
                case -99016:
                    this.f70784a.f70766d = false;
                    break;
                case -99011:
                    this.f70784a.f70766d = false;
                    break;
                case -99010:
                    this.f70784a.f70766d = true;
                    break;
            }
            OnPlayerEventListener cVar = this.f70784a.f70768f;
            if (cVar != null) {
                cVar.mo99385a(i, bundle);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\"\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/appcenter/common/view/video/VideoView$renderCallback$1", "Lcom/ss/android/appcenter/common/view/video/render/RenderSurfaceView$IRenderCallback;", "onSurfaceChanged", "", "renderHolder", "Lcom/ss/android/appcenter/common/view/video/render/RenderSurfaceView$IRenderHolder;", "width", "", "height", "onSurfaceCreated", "onSurfaceDestroy", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.common.view.video.VideoView$f */
    public static final class C28224f implements RenderSurfaceView.IRenderCallback {

        /* renamed from: a */
        final /* synthetic */ VideoView f70786a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C28224f(VideoView videoView) {
            this.f70786a = videoView;
        }

        @Override // com.ss.android.appcenter.common.view.video.render.RenderSurfaceView.IRenderCallback
        /* renamed from: a */
        public void mo100482a(RenderSurfaceView.IRenderHolder bVar) {
            this.f70786a.f70767e = null;
        }

        @Override // com.ss.android.appcenter.common.view.video.render.RenderSurfaceView.IRenderCallback
        /* renamed from: a */
        public void mo100483a(RenderSurfaceView.IRenderHolder bVar, int i, int i2) {
            this.f70786a.f70767e = bVar;
            this.f70786a.mo100458a(bVar);
        }

        @Override // com.ss.android.appcenter.common.view.video.render.RenderSurfaceView.IRenderCallback
        /* renamed from: b */
        public void mo100484b(RenderSurfaceView.IRenderHolder bVar, int i, int i2) {
            this.f70786a.f70767e = bVar;
            this.f70786a.mo100458a(bVar);
        }
    }

    /* renamed from: a */
    public void mo100456a(int i) {
        this.f70771i.mo100487a(i);
    }

    /* renamed from: b */
    public void mo100460b(int i) {
        this.f70771i.mo100496b(i);
    }

    public void setMute(boolean z) {
        this.f70771i.mo100499b(z);
    }

    public final void setOnBufferingListener(OnBufferingListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "onBufferingListener");
        this.f70770h = aVar;
    }

    public void setSpeed(float f) {
        this.f70771i.mo100486a(f);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "focusChange", "", "onAudioFocusChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.common.view.video.VideoView$a */
    static final class C28219a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ VideoView f70781a;

        C28219a(VideoView videoView) {
            this.f70781a = videoView;
        }

        public final void onAudioFocusChange(int i) {
            if (i == -1) {
                this.f70781a.mo100466g();
            }
        }
    }

    /* renamed from: a */
    public final void mo100458a(RenderSurfaceView.IRenderHolder bVar) {
        if (bVar != null) {
            bVar.mo100590a(this.f70771i);
        }
    }

    public void setDataSource(DataSource dataSource) {
        Intrinsics.checkParameterIsNotNull(dataSource, "dataSource");
        m103338k();
        m103337j();
        this.f70771i.mo100494a(dataSource);
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if (this.f70773k != configuration.orientation || this.f70774l != configuration.screenWidthDp || this.f70775m != configuration.screenHeightDp) {
            this.f70773k = configuration.orientation;
            this.f70774l = configuration.screenWidthDp;
            this.f70775m = configuration.screenHeightDp;
            post(new RunnableC28223e(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        VideoPlayer aVar = new VideoPlayer(context2);
        this.f70771i = aVar;
        this.f70773k = Integer.MAX_VALUE;
        this.f70774l = Integer.MAX_VALUE;
        this.f70775m = Integer.MAX_VALUE;
        this.f70776n = new C28224f(this);
        C28222d dVar = new C28222d(this);
        this.f70777o = dVar;
        C28221c cVar = new C28221c(this);
        this.f70778p = cVar;
        C28220b bVar = new C28220b(this);
        this.f70779q = bVar;
        this.f70780r = new C28219a(this);
        aVar.mo100492a(dVar);
        aVar.mo100491a(cVar);
        aVar.mo100490a(bVar);
        aVar.mo100493a(this);
        aVar.mo100495a(true);
    }

    /* renamed from: a */
    private final void m103336a(float f) {
        RenderSurfaceView renderSurfaceView;
        if (this.f70771i.mo100510l() && (renderSurfaceView = this.f70772j) != null) {
            int width = getWidth();
            int height = getHeight();
            if (width != 0 && height != 0 && f != BitmapDescriptorFactory.HUE_RED) {
                ViewGroup.LayoutParams layoutParams = renderSurfaceView.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    if (f > ((float) height) / ((float) width)) {
                        layoutParams2.height = height;
                        layoutParams2.width = (int) (((float) layoutParams2.height) / f);
                    } else {
                        layoutParams2.width = width;
                        layoutParams2.height = (int) (((float) layoutParams2.width) * f);
                    }
                    renderSurfaceView.setLayoutParams(layoutParams2);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
    }

    @Override // com.ss.android.appcenter.common.view.video.listener.OnVideoSizeChangedListener
    /* renamed from: a */
    public void mo100457a(int i, int i2) {
        if (i != 0 && i2 != 0) {
            m103336a(((float) i2) / ((float) i));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        VideoPlayer aVar = new VideoPlayer(context2);
        this.f70771i = aVar;
        this.f70773k = Integer.MAX_VALUE;
        this.f70774l = Integer.MAX_VALUE;
        this.f70775m = Integer.MAX_VALUE;
        this.f70776n = new C28224f(this);
        C28222d dVar = new C28222d(this);
        this.f70777o = dVar;
        C28221c cVar = new C28221c(this);
        this.f70778p = cVar;
        C28220b bVar = new C28220b(this);
        this.f70779q = bVar;
        this.f70780r = new C28219a(this);
        aVar.mo100492a(dVar);
        aVar.mo100491a(cVar);
        aVar.mo100490a(bVar);
        aVar.mo100493a(this);
        aVar.mo100495a(true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        VideoPlayer aVar = new VideoPlayer(context2);
        this.f70771i = aVar;
        this.f70773k = Integer.MAX_VALUE;
        this.f70774l = Integer.MAX_VALUE;
        this.f70775m = Integer.MAX_VALUE;
        this.f70776n = new C28224f(this);
        C28222d dVar = new C28222d(this);
        this.f70777o = dVar;
        C28221c cVar = new C28221c(this);
        this.f70778p = cVar;
        C28220b bVar = new C28220b(this);
        this.f70779q = bVar;
        this.f70780r = new C28219a(this);
        aVar.mo100492a(dVar);
        aVar.mo100491a(cVar);
        aVar.mo100490a(bVar);
        aVar.mo100493a(this);
        aVar.mo100495a(true);
    }
}
