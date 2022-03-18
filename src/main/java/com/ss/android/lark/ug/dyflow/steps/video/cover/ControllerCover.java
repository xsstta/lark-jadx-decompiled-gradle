package com.ss.android.lark.ug.dyflow.steps.video.cover;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.transition.C1556v;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.metriclogger.consts.domains.C24341b;
import com.larksuite.component.metriclogger_constants.domains.onboarding.video.C24354a;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.metric.OnboardingMetric;
import com.ss.android.lark.guide.statistics.OnboardingHitPoint;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.player.p2511a.AbstractC52092k;
import com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a;
import com.ss.android.lark.player.p2513c.AbstractC52112m;
import com.ss.android.lark.player.p2515d.AbstractC52127b;
import com.ss.android.lark.ug.dyflow.steps.video.volume.OnVolumeChangeListener;
import com.ss.android.lark.ug.dyflow.steps.video.volume.VolumeManager;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000§\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b**\u0001\u001c\u0018\u0000 ~2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004~\u0001B-\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\u0006\u00108\u001a\u000209J\b\u0010:\u001a\u000209H\u0002J\b\u0010;\u001a\u000209H\u0002J\b\u0010<\u001a\u000209H\u0002J\b\u0010=\u001a\u000209H\u0002J\b\u0010>\u001a\u000209H\u0002J\b\u0010?\u001a\u000209H\u0002J\u0012\u0010@\u001a\u00020&2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u0012\u0010A\u001a\u0002092\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\u0012\u0010D\u001a\u0002092\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\b\u0010E\u001a\u000209H\u0016J\u0018\u0010F\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020\u00102\b\u0010B\u001a\u0004\u0018\u00010HJ\u0018\u0010I\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020\u00102\b\u0010B\u001a\u0004\u0018\u00010HJ\u0012\u0010J\u001a\u0002092\b\u0010K\u001a\u0004\u0018\u00010CH\u0016J\u001a\u0010L\u001a\u0002092\u0006\u0010M\u001a\u00020\u00102\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\b\u0010P\u001a\u000209H\u0016J\u001a\u0010Q\u001a\u0002092\u0006\u0010M\u001a\u00020\u00102\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\b\u0010R\u001a\u000209H\u0016J,\u0010S\u001a\u0002092\b\u0010T\u001a\u0004\u0018\u00010C2\b\u0010U\u001a\u0004\u0018\u00010C2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020WH\u0016J\u0012\u0010Y\u001a\u0002092\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J \u0010Z\u001a\u0002092\u0006\u0010[\u001a\u00020\u00102\u0006\u0010\\\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010]\u001a\u000209H\u0002J\b\u0010^\u001a\u000209H\u0002J\b\u0010_\u001a\u000209H\u0002J\u0010\u0010`\u001a\u0002092\u0006\u0010a\u001a\u00020\u0010H\u0002J\u0010\u0010b\u001a\u0002092\u0006\u0010c\u001a\u00020\u001fH\u0003J\u001a\u0010d\u001a\u0002092\u0006\u0010e\u001a\u00020\u001f2\b\b\u0002\u0010f\u001a\u00020\u001fH\u0002J\u0010\u0010g\u001a\u0002092\u0006\u0010h\u001a\u00020\u001fH\u0002J\u0010\u0010i\u001a\u0002092\u0006\u0010j\u001a\u00020\u0010H\u0002J\u0010\u0010k\u001a\u0002092\u0006\u0010e\u001a\u00020\u001fH\u0002J\u0010\u0010l\u001a\u0002092\u0006\u0010\\\u001a\u00020\u0010H\u0002J\u000e\u0010m\u001a\u0002092\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010n\u001a\u0002092\u0006\u0010o\u001a\u00020\u0014J\u000e\u0010p\u001a\u0002092\u0006\u0010\"\u001a\u00020\u001fJ\u001a\u0010q\u001a\u0002092\u0006\u0010r\u001a\u00020\u001f2\b\b\u0002\u0010s\u001a\u00020\u001fH\u0002J\u0018\u0010t\u001a\u0002092\u0006\u0010j\u001a\u00020\u00102\u0006\u0010\\\u001a\u00020\u0010H\u0002J\u0010\u0010u\u001a\u0002092\u0006\u0010c\u001a\u00020\u001fH\u0003J\b\u0010v\u001a\u000209H\u0003J\u0018\u0010w\u001a\u0002092\u0006\u0010j\u001a\u00020\u00102\u0006\u0010\\\u001a\u00020\u0010H\u0002J\u0010\u0010x\u001a\u0002092\u0006\u0010a\u001a\u00020\u0010H\u0002J\b\u0010y\u001a\u000209H\u0002J\u0010\u0010z\u001a\u0002092\u0006\u0010{\u001a\u00020\u001fH\u0002J\b\u0010|\u001a\u000209H\u0002J\u0018\u0010}\u001a\u0002092\u0006\u0010j\u001a\u00020\u00102\u0006\u0010\\\u001a\u00020\u0010H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0004\n\u0002\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/video/cover/ControllerCover;", "Lcom/ss/android/lark/player/cover/BaseCover;", "Lcom/ss/android/lark/player/touch/OnTouchGestureListener;", "Lcom/ss/android/lark/player/player/OnTimerUpdateListener;", "context", "Landroid/content/Context;", "coverUrl", "", "skipText", "nextText", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "bottomAnimator", "Landroid/animation/ObjectAnimator;", "bottomContainer", "Landroid/view/ViewGroup;", "bufferPercentage", "", "closeView", "Landroid/widget/TextView;", "controllerListener", "Lcom/ss/android/lark/ug/dyflow/steps/video/cover/ControllerCover$OnControllerListener;", "coverView", "Landroid/widget/ImageView;", "curTimeView", "durationView", "firstTime", "", "handler", "com/ss/android/lark/ug/dyflow/steps/video/cover/ControllerCover$handler$1", "Lcom/ss/android/lark/ug/dyflow/steps/video/cover/ControllerCover$handler$1;", "isBind", "", "isMute", "isPlayCompletedOnce", "isPortrait", "operatorView", "orientationView", "replayView", "Landroid/view/View;", "rootView", "seekBarView", "Landroid/widget/SeekBar;", "seekHitProgress", "Landroid/widget/ProgressBar;", "seekHitText", "seekHitView", "seekProcess", "timerUpdateProgressEnable", "topAnimator", "topContainer", "volumeIcon", "volumeMgr", "Lcom/ss/android/lark/ug/dyflow/steps/video/volume/VolumeManager;", "volumeProgress", "volumeView", "Landroid/widget/FrameLayout;", "destroy", "", "destroyVolumeManager", "hideSeekHit", "hideVolumeBar", "initViews", "initVolumeManager", "loadCover", "onCreateCoverView", "onDoubleTap", "event", "Landroid/view/MotionEvent;", "onDown", "onEndGesture", "onKeyDown", "keyCode", "Landroid/view/KeyEvent;", "onKeyUp", "onLongPress", "e", "onPlayerEvent", "eventCode", "bundle", "Landroid/os/Bundle;", "onReceiverBind", "onReceiverEvent", "onReceiverUnBind", "onScroll", "e1", "e2", "distanceX", "", "distanceY", "onSingleTapUp", "onTimerUpdate", "curr", "duration", "removeDelayHiddenMessage", "resetController", "sendDelayHiddenMessage", "sendSeekEvent", "progress", "setBottomContainerState", "show", "setControllerState", "state", "delayHide", "setCoverState", "isShow", "setCurTime", "cur", "setDelayHiddenMessage", "setDurationTime", "setMute", "setOnControllerListener", "listener", "setOrientation", "setPlayState", "isPause", "replay", "setSeekProcess", "setTopContainerState", "setupListeners", "showSeekHit", "showVolumeBar", "toggleController", "togglePlay", "isReplay", "updateTopViewsForOrientation", "updateUI", "Companion", "OnControllerListener", "SeekBarChangeListener", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a.a */
public final class ControllerCover extends AbstractView$OnAttachStateChangeListenerC52070a implements AbstractC52112m, AbstractC52127b {

    /* renamed from: j */
    public static final Companion f141585j = new Companion(null);

    /* renamed from: A */
    private ObjectAnimator f141586A;

    /* renamed from: B */
    private boolean f141587B = true;

    /* renamed from: C */
    private boolean f141588C;

    /* renamed from: D */
    private long f141589D;

    /* renamed from: E */
    private final HandlerC57466d f141590E = new HandlerC57466d(this, Looper.getMainLooper());

    /* renamed from: F */
    private final String f141591F;

    /* renamed from: G */
    private final String f141592G;

    /* renamed from: H */
    private final String f141593H;

    /* renamed from: a */
    public ViewGroup f141594a;

    /* renamed from: b */
    public ViewGroup f141595b;

    /* renamed from: c */
    public SeekBar f141596c;

    /* renamed from: d */
    public ImageView f141597d;

    /* renamed from: e */
    public int f141598e;

    /* renamed from: f */
    public boolean f141599f = true;

    /* renamed from: g */
    public boolean f141600g;

    /* renamed from: h */
    public VolumeManager f141601h;

    /* renamed from: i */
    public OnControllerListener f141602i;

    /* renamed from: k */
    private ViewGroup f141603k;

    /* renamed from: l */
    private View f141604l;

    /* renamed from: m */
    private ImageView f141605m;

    /* renamed from: n */
    private FrameLayout f141606n;

    /* renamed from: o */
    private ProgressBar f141607o;

    /* renamed from: p */
    private View f141608p;

    /* renamed from: q */
    private TextView f141609q;

    /* renamed from: r */
    private ImageView f141610r;

    /* renamed from: s */
    private TextView f141611s;

    /* renamed from: t */
    private TextView f141612t;

    /* renamed from: u */
    private View f141613u;

    /* renamed from: v */
    private TextView f141614v;

    /* renamed from: w */
    private ProgressBar f141615w;

    /* renamed from: x */
    private boolean f141616x = true;

    /* renamed from: y */
    private int f141617y;

    /* renamed from: z */
    private ObjectAnimator f141618z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0005H&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/video/cover/ControllerCover$OnControllerListener;", "", "isInPlayState", "", "onChangeOrientation", "", "isPortrait", "onMute", "isMute", "onNext", "onPlay", "onSeekTo", "pos", "", "onSkip", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a.a$b */
    public interface OnControllerListener {
        /* renamed from: a */
        void mo195056a();

        /* renamed from: a */
        void mo195057a(int i);

        /* renamed from: a */
        void mo195058a(boolean z);

        /* renamed from: b */
        void mo195059b();

        /* renamed from: b */
        void mo195060b(boolean z);

        /* renamed from: c */
        void mo195061c();
    }

    @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
    /* renamed from: a */
    public void mo127016a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
    }

    @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
    /* renamed from: b */
    public void mo127022b(MotionEvent motionEvent) {
    }

    /* renamed from: b */
    public final boolean mo195069b(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
    /* renamed from: c */
    public void mo127026c(MotionEvent motionEvent) {
    }

    @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
    /* renamed from: d */
    public void mo127027d() {
    }

    @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
    /* renamed from: d */
    public void mo127028d(MotionEvent motionEvent) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/video/cover/ControllerCover$Companion;", "", "()V", "MSG_CODE_DELAY_HIDDEN_CONTROLLER", "", "MSG_CODE_DELAY_HIDDEN_VOLUME_BAR", "MSG_CODE_SEND_SEEK_EVENT", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final void mo195070c() {
        m223027x();
    }

    /* renamed from: a */
    public final void mo195065a(boolean z) {
        this.f141587B = z;
    }

    /* renamed from: a */
    public final void mo195064a(OnControllerListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f141602i = bVar;
    }

    /* renamed from: a */
    public final boolean mo195066a(int i, KeyEvent keyEvent) {
        VolumeManager bVar;
        int i2 = -1;
        if (i == 24) {
            VolumeManager bVar2 = this.f141601h;
            if (bVar2 == null) {
                return false;
            }
            int d = bVar2 != null ? bVar2.mo195099d() : -1;
            VolumeManager bVar3 = this.f141601h;
            if (bVar3 != null) {
                i2 = bVar3.mo195103h();
            }
            if (i2 > 0 && d >= 0) {
                OnboardingHitPoint.f99379a.mo141598a((((float) d) * 1.0f) / ((float) i2));
            }
            if (d >= 0) {
                return true;
            }
            return false;
        } else if (i != 25 || (bVar = this.f141601h) == null) {
            return false;
        } else {
            int e = bVar != null ? bVar.mo195100e() : -1;
            VolumeManager bVar4 = this.f141601h;
            if (bVar4 != null) {
                i2 = bVar4.mo195103h();
            }
            if (i2 > 0 && e >= 0) {
                OnboardingHitPoint.f99379a.mo141598a((((float) e) * 1.0f) / ((float) i2));
            }
            if (e >= 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: v */
    private final void m223025v() {
        this.f141590E.removeMessages(101);
    }

    /* renamed from: x */
    private final void m223027x() {
        VolumeManager bVar = this.f141601h;
        if (bVar != null) {
            bVar.mo195097c();
        }
    }

    /* renamed from: u */
    private final void m223024u() {
        m223025v();
        this.f141590E.sendEmptyMessageDelayed(101, 5000);
    }

    /* renamed from: m */
    public final void mo195073m() {
        View view = this.f141613u;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: n */
    public final void mo195074n() {
        FrameLayout frameLayout = this.f141606n;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    /* renamed from: t */
    private final void m223023t() {
        boolean z;
        ViewGroup viewGroup = this.f141595b;
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            z = false;
        } else {
            z = true;
        }
        m223010b(!z, false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/ss/android/lark/ug/dyflow/steps/video/cover/ControllerCover$initVolumeManager$1$1", "Lcom/ss/android/lark/ug/dyflow/steps/video/volume/OnVolumeChangeListener;", "onVolumeChanged", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a.a$e */
    public static final class C57467e implements OnVolumeChangeListener {

        /* renamed from: a */
        final /* synthetic */ ControllerCover f141622a;

        @Override // com.ss.android.lark.ug.dyflow.steps.video.volume.OnVolumeChangeListener
        /* renamed from: a */
        public void mo195079a() {
            int i;
            int i2;
            VolumeManager bVar = this.f141622a.f141601h;
            if (bVar != null) {
                i = bVar.mo195102g();
            } else {
                i = -1;
            }
            VolumeManager bVar2 = this.f141622a.f141601h;
            if (bVar2 != null) {
                i2 = bVar2.mo195103h();
            } else {
                i2 = -1;
            }
            if (i != -1 && i2 != -1) {
                this.f141622a.mo195062a((i * 100) / i2);
            }
        }

        C57467e(ControllerCover aVar) {
            this.f141622a = aVar;
        }
    }

    /* renamed from: q */
    private final void m223020q() {
        ViewGroup viewGroup = this.f141594a;
        if (viewGroup != null) {
            if (this.f141599f) {
                viewGroup.setPadding(0, UIUtils.dp2px(mo178442k(), 10.0f), 0, 0);
            } else {
                viewGroup.setPadding(0, 0, 0, 0);
            }
        }
        FrameLayout frameLayout = this.f141606n;
        if (frameLayout == null) {
            return;
        }
        if (this.f141599f) {
            frameLayout.setPadding(0, UIUtils.dp2px(mo178442k(), 10.0f), 0, 0);
        } else {
            frameLayout.setPadding(0, 0, 0, 0);
        }
    }

    /* renamed from: r */
    private final void m223021r() {
        boolean z;
        String str = this.f141591F;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ImageLoader.with(mo178442k()).load(this.f141591F).into(this.f141605m);
        }
    }

    /* renamed from: s */
    private final void m223022s() {
        int i;
        mo178428d((Bundle) null);
        m223010b(true, false);
        SeekBar seekBar = this.f141596c;
        if (seekBar != null) {
            i = seekBar.getMax();
        } else {
            i = 0;
        }
        mo195067b(0, i);
        m223008a(true, true);
        m223013d(true);
        TextView textView = this.f141609q;
        if (textView != null) {
            textView.setText(this.f141593H);
            this.f141600g = true;
        }
    }

    /* renamed from: w */
    private final void m223026w() {
        if (mo178442k() != null) {
            Context k = mo178442k();
            Intrinsics.checkExpressionValueIsNotNull(k, "context");
            VolumeManager bVar = new VolumeManager(k);
            this.f141601h = bVar;
            if (bVar != null) {
                bVar.mo195096b();
            }
            VolumeManager bVar2 = this.f141601h;
            if (bVar2 != null) {
                bVar2.mo195094a(new C57467e(this));
            }
        }
    }

    /* renamed from: p */
    private final void m223019p() {
        View view = this.f141604l;
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC57470h(this));
        }
        ImageView imageView = this.f141610r;
        if (imageView != null) {
            imageView.setOnClickListener(new View$OnClickListenerC57471i(this));
        }
        TextView textView = this.f141609q;
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC57472j(this));
        }
        SeekBar seekBar = this.f141596c;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(new SeekBarChangeListener());
        }
        ImageView imageView2 = this.f141597d;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View$OnClickListenerC57473k(this));
        }
        ViewGroup viewGroup = this.f141595b;
        if (viewGroup != null) {
            viewGroup.setOnTouchListener(new View$OnTouchListenerC57474l(this));
        }
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h
    /* renamed from: a */
    public void mo127010a() {
        mo178429e();
        m223018o();
        m223019p();
        m223021r();
        m223026w();
        this.f141588C = true;
    }

    /* renamed from: o */
    private final void m223018o() {
        ViewGroup viewGroup = this.f141603k;
        if (viewGroup == null) {
            Intrinsics.throwNpe();
        }
        this.f141604l = viewGroup.findViewById(R.id.flow_video_replay);
        this.f141605m = (ImageView) viewGroup.findViewById(R.id.flow_video_cover);
        this.f141606n = (FrameLayout) viewGroup.findViewById(R.id.flow_video_volume);
        this.f141607o = (ProgressBar) viewGroup.findViewById(R.id.flow_video_volume_progress);
        this.f141608p = viewGroup.findViewById(R.id.flow_video_volume_icon);
        this.f141594a = (ViewGroup) viewGroup.findViewById(R.id.controller_top_layout);
        TextView textView = (TextView) viewGroup.findViewById(R.id.flow_ctrl_close);
        this.f141609q = textView;
        if (textView != null) {
            textView.setText(this.f141592G);
        }
        this.f141595b = (ViewGroup) viewGroup.findViewById(R.id.flow_controller_bottom_layout);
        this.f141610r = (ImageView) viewGroup.findViewById(R.id.flow_video_operator);
        this.f141611s = (TextView) viewGroup.findViewById(R.id.flow_video_cur_time);
        this.f141612t = (TextView) viewGroup.findViewById(R.id.flow_video_duration);
        this.f141596c = (SeekBar) viewGroup.findViewById(R.id.flow_video_seek);
        this.f141597d = (ImageView) viewGroup.findViewById(R.id.flow_video_orientation);
        this.f141613u = viewGroup.findViewById(R.id.flow_video_seek_hit);
        this.f141614v = (TextView) viewGroup.findViewById(R.id.flow_video_seek_hit_text);
        this.f141615w = (ProgressBar) viewGroup.findViewById(R.id.flow_video_seek_hit_progress);
        TextView textView2 = this.f141611s;
        if (textView2 != null) {
            textView2.setText(C26279i.m95149a(0));
        }
        TextView textView3 = this.f141612t;
        if (textView3 != null) {
            textView3.setText(C26279i.m95149a(0));
        }
        m223007a(this, true, false, 2, null);
        ImageView imageView = this.f141597d;
        if (imageView != null) {
            imageView.setSelected(this.f141599f);
        }
        m223020q();
        mo195073m();
        mo195074n();
    }

    @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
    /* renamed from: a */
    public void mo127015a(MotionEvent motionEvent) {
        m223023t();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/video/cover/ControllerCover$SeekBarChangeListener;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "(Lcom/ss/android/lark/ug/dyflow/steps/video/cover/ControllerCover;)V", "startTouchProgress", "", "onProgressChanged", "", "seekBar", "Landroid/widget/SeekBar;", "progress", "fromUser", "", "onStartTrackingTouch", "onStopTrackingTouch", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a.a$c */
    public final class SeekBarChangeListener implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b */
        private int f141620b;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public SeekBarChangeListener() {
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            if (seekBar != null) {
                this.f141620b = seekBar.getProgress();
            }
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            if (seekBar != null) {
                ControllerCover.this.mo195071c(seekBar.getProgress());
                OnboardingHitPoint.f99379a.mo141600a(this.f141620b, seekBar.getProgress());
            }
            ControllerCover.this.mo195073m();
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z && seekBar != null) {
                ControllerCover.this.mo195067b(i, seekBar.getMax());
                ControllerCover.this.mo195063a(i, seekBar.getMax());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a.a$h */
    public static final class View$OnClickListenerC57470h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ControllerCover f141627a;

        View$OnClickListenerC57470h(ControllerCover aVar) {
            this.f141627a = aVar;
        }

        public final void onClick(View view) {
            this.f141627a.mo195072c(true);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a.a$i */
    public static final class View$OnClickListenerC57471i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ControllerCover f141628a;

        View$OnClickListenerC57471i(ControllerCover aVar) {
            this.f141628a = aVar;
        }

        public final void onClick(View view) {
            this.f141628a.mo195072c(false);
        }
    }

    /* renamed from: d */
    private final void m223013d(boolean z) {
        UIUtils.display(this.f141605m, z);
    }

    /* renamed from: d */
    private final void m223012d(int i) {
        TextView textView = this.f141611s;
        if (textView != null) {
            textView.setText(C26279i.m95149a(i));
        }
    }

    /* renamed from: e */
    private final void m223014e(int i) {
        TextView textView = this.f141612t;
        if (textView != null) {
            textView.setText(C26279i.m95149a(i));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/ug/dyflow/steps/video/cover/ControllerCover$setBottomContainerState$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a.a$f */
    public static final class C57468f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ControllerCover f141623a;

        /* renamed from: b */
        final /* synthetic */ boolean f141624b;

        public void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup;
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            super.onAnimationEnd(animator);
            if (!this.f141624b && (viewGroup = this.f141623a.f141595b) != null) {
                viewGroup.setVisibility(8);
            }
        }

        public void onAnimationStart(Animator animator) {
            ViewGroup viewGroup;
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            super.onAnimationStart(animator);
            if (this.f141624b && (viewGroup = this.f141623a.f141595b) != null) {
                viewGroup.setVisibility(0);
            }
        }

        C57468f(ControllerCover aVar, boolean z) {
            this.f141623a = aVar;
            this.f141624b = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/ug/dyflow/steps/video/cover/ControllerCover$setTopContainerState$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a.a$g */
    public static final class C57469g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ControllerCover f141625a;

        /* renamed from: b */
        final /* synthetic */ boolean f141626b;

        public void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup;
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            super.onAnimationEnd(animator);
            if (!this.f141626b && (viewGroup = this.f141625a.f141594a) != null) {
                viewGroup.setVisibility(8);
            }
        }

        public void onAnimationStart(Animator animator) {
            ViewGroup viewGroup;
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            super.onAnimationStart(animator);
            if (this.f141626b && (viewGroup = this.f141625a.f141594a) != null) {
                viewGroup.setVisibility(0);
            }
        }

        C57469g(ControllerCover aVar, boolean z) {
            this.f141625a = aVar;
            this.f141626b = z;
        }
    }

    /* renamed from: e */
    private final void m223015e(boolean z) {
        if (z) {
            m223024u();
        } else {
            m223025v();
        }
    }

    /* renamed from: c */
    public final void mo195071c(int i) {
        this.f141616x = false;
        this.f141598e = i;
        this.f141590E.removeMessages(102);
        this.f141590E.sendEmptyMessageDelayed(102, 100);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/ug/dyflow/steps/video/cover/ControllerCover$handler$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a.a$d */
    public static final class HandlerC57466d extends Handler {

        /* renamed from: a */
        final /* synthetic */ ControllerCover f141621a;

        public void handleMessage(Message message) {
            OnControllerListener bVar;
            Intrinsics.checkParameterIsNotNull(message, "msg");
            super.handleMessage(message);
            switch (message.what) {
                case 101:
                    ControllerCover.m223009b(this.f141621a, false, false, 2, null);
                    return;
                case 102:
                    if (this.f141621a.f141598e >= 0 && (bVar = this.f141621a.f141602i) != null) {
                        bVar.mo195057a(this.f141621a.f141598e);
                        return;
                    }
                    return;
                case 103:
                    this.f141621a.mo195074n();
                    return;
                default:
                    return;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        HandlerC57466d(ControllerCover aVar, Looper looper) {
            super(looper);
            this.f141621a = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a.a$j */
    public static final class View$OnClickListenerC57472j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ControllerCover f141629a;

        View$OnClickListenerC57472j(ControllerCover aVar) {
            this.f141629a = aVar;
        }

        public final void onClick(View view) {
            int i;
            SeekBar seekBar = this.f141629a.f141596c;
            if (seekBar != null) {
                i = seekBar.getProgress();
            } else {
                i = 0;
            }
            if (this.f141629a.f141600g) {
                OnControllerListener bVar = this.f141629a.f141602i;
                if (bVar != null) {
                    bVar.mo195061c();
                }
                if (this.f141629a.mo178441j() != null) {
                    OnboardingHitPoint.f99379a.mo141623f(i);
                    return;
                }
                return;
            }
            OnControllerListener bVar2 = this.f141629a.f141602i;
            if (bVar2 != null) {
                bVar2.mo195059b();
            }
            if (this.f141629a.mo178441j() != null) {
                OnboardingHitPoint.f99379a.mo141619e(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a.a$k */
    public static final class View$OnClickListenerC57473k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ControllerCover f141630a;

        View$OnClickListenerC57473k(ControllerCover aVar) {
            this.f141630a = aVar;
        }

        public final void onClick(View view) {
            ImageView imageView = this.f141630a.f141597d;
            if (imageView != null) {
                imageView.setSelected(!imageView.isSelected());
                OnControllerListener bVar = this.f141630a.f141602i;
                if (bVar != null) {
                    bVar.mo195060b(this.f141630a.f141599f);
                }
                if (this.f141630a.f141599f) {
                    OnboardingHitPoint.f99379a.mo141609b(true);
                } else {
                    OnboardingHitPoint.f99379a.mo141609b(false);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a
    /* renamed from: a */
    public View mo127009a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.flow_video_cover, (ViewGroup) null);
        if (inflate != null) {
            this.f141603k = (ViewGroup) inflate;
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…it as ViewGroup\n        }");
            return inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: f */
    private final void m223016f(boolean z) {
        float f;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (z && (viewGroup2 = this.f141594a) != null && viewGroup2.getVisibility() == 0) {
            return;
        }
        if (z || (viewGroup = this.f141594a) == null || viewGroup.getVisibility() != 8) {
            ViewGroup viewGroup3 = this.f141594a;
            if (viewGroup3 != null) {
                viewGroup3.clearAnimation();
            }
            ObjectAnimator objectAnimator = this.f141618z;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                objectAnimator.removeAllListeners();
                objectAnimator.removeAllUpdateListeners();
            }
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (z) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = 1.0f;
            }
            if (z) {
                f2 = 1.0f;
            }
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f141594a, "alpha", f, f2).setDuration(200L);
            this.f141618z = duration;
            if (duration != null) {
                duration.addListener(new C57469g(this, z));
            }
            ObjectAnimator objectAnimator2 = this.f141618z;
            if (objectAnimator2 != null) {
                objectAnimator2.start();
            }
        }
    }

    /* renamed from: g */
    private final void m223017g(boolean z) {
        float f;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if ((z && (viewGroup2 = this.f141595b) != null && viewGroup2.getVisibility() == 8) || (!z && (viewGroup = this.f141595b) != null && viewGroup.getVisibility() == 0)) {
            ViewGroup viewGroup3 = this.f141595b;
            if (viewGroup3 != null) {
                viewGroup3.clearAnimation();
            }
            ObjectAnimator objectAnimator = this.f141586A;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                objectAnimator.removeAllListeners();
                objectAnimator.removeAllUpdateListeners();
            }
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (z) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = 1.0f;
            }
            if (z) {
                f2 = 1.0f;
            }
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f141595b, "alpha", f, f2).setDuration(200L);
            this.f141586A = duration;
            if (duration != null) {
                duration.addListener(new C57468f(this, z));
            }
            ObjectAnimator objectAnimator2 = this.f141586A;
            if (objectAnimator2 != null) {
                objectAnimator2.start();
            }
        }
        if (z) {
            mo178429e();
        } else {
            mo178430f();
        }
    }

    /* renamed from: c */
    public final void mo195072c(boolean z) {
        ImageView imageView = this.f141610r;
        if (imageView != null) {
            boolean isSelected = imageView.isSelected();
            if (isSelected) {
                OnControllerListener bVar = this.f141602i;
                if (bVar != null) {
                    bVar.mo195056a();
                }
                AbstractC52092k j = mo178441j();
                if (j != null) {
                    if (z) {
                        OnboardingHitPoint.f99379a.mo141606b();
                    } else {
                        OnboardingHitPoint.Companion aVar = OnboardingHitPoint.f99379a;
                        Intrinsics.checkExpressionValueIsNotNull(j, "it");
                        aVar.mo141611c(j.mo178466b());
                    }
                }
            } else {
                mo178424a((Bundle) null);
                AbstractC52092k j2 = mo178441j();
                if (j2 != null) {
                    OnboardingHitPoint.Companion aVar2 = OnboardingHitPoint.f99379a;
                    Intrinsics.checkExpressionValueIsNotNull(j2, "it");
                    aVar2.mo141615d(j2.mo178466b());
                }
            }
            m223007a(this, !isSelected, false, 2, null);
        }
    }

    /* renamed from: a */
    public final void mo195062a(int i) {
        OnControllerListener bVar;
        boolean z = false;
        if (this.f141587B && (bVar = this.f141602i) != null) {
            bVar.mo195058a(false);
        }
        FrameLayout frameLayout = this.f141606n;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        ProgressBar progressBar = this.f141607o;
        if (progressBar != null) {
            progressBar.setMax(100);
        }
        ProgressBar progressBar2 = this.f141607o;
        if (progressBar2 != null) {
            progressBar2.setProgress(i);
        }
        View view = this.f141608p;
        if (view != null) {
            if (i == 0) {
                z = true;
            }
            view.setSelected(z);
        }
        this.f141590E.removeMessages(103);
        this.f141590E.sendEmptyMessageDelayed(103, 2000);
    }

    /* renamed from: b */
    public final void mo195068b(boolean z) {
        this.f141599f = z;
        if (this.f141588C) {
            ImageView imageView = this.f141597d;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            m223020q();
        }
    }

    /* renamed from: a */
    private final void m223008a(boolean z, boolean z2) {
        ImageView imageView = this.f141610r;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        ImageView imageView2 = this.f141610r;
        if (imageView2 != null) {
            imageView2.setHovered(z2);
        }
        UIUtils.display(this.f141604l, z2);
    }

    /* renamed from: b */
    private final void m223010b(boolean z, boolean z2) {
        if (z2) {
            m223015e(z);
        }
        m223016f(z);
        m223017g(z);
    }

    /* renamed from: c */
    private final void m223011c(int i, int i2) {
        SeekBar seekBar = this.f141596c;
        if (seekBar != null) {
            seekBar.setMax(i2);
        }
        SeekBar seekBar2 = this.f141596c;
        if (seekBar2 != null) {
            seekBar2.setProgress(i);
        }
        float f = ((((float) this.f141617y) * 1.0f) / ((float) 100)) * ((float) i2);
        SeekBar seekBar3 = this.f141596c;
        if (seekBar3 != null) {
            seekBar3.setSecondaryProgress((int) f);
        }
    }

    /* renamed from: b */
    public final void mo195067b(int i, int i2) {
        m223011c(i, i2);
        m223012d(i);
        m223014e(i2);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a.a$l */
    public static final class View$OnTouchListenerC57474l implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ ControllerCover f141631a;

        View$OnTouchListenerC57474l(ControllerCover aVar) {
            this.f141631a = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            float f;
            if (this.f141631a.f141596c == null || motionEvent == null) {
                return false;
            }
            Rect rect = new Rect();
            SeekBar seekBar = this.f141631a.f141596c;
            if (seekBar != null) {
                seekBar.getHitRect(rect);
            }
            float x = motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (y < rect.top - 500 || y > rect.bottom + ParticipantRepo.f117150c) {
                return false;
            }
            float height = ((float) rect.top) + (((float) rect.height()) / 2.0f);
            float f2 = x - ((float) rect.left);
            if (f2 < ((float) 0)) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else if (f2 > ((float) rect.width())) {
                f = (float) rect.width();
            } else {
                f = f2;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), f, height, motionEvent.getMetaState());
            SeekBar seekBar2 = this.f141631a.f141596c;
            if (seekBar2 != null) {
                return seekBar2.onTouchEvent(obtain);
            }
            return false;
        }
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h, com.ss.android.lark.player.p2511a.AbstractC52071b
    /* renamed from: b */
    public void mo127021b(int i, Bundle bundle) {
        switch (i) {
            case -66018:
                mo178425b(0);
                m223009b(this, true, false, 2, null);
                return;
            case -66017:
                m223009b(this, false, false, 2, null);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo195063a(int i, int i2) {
        View view = this.f141613u;
        if (view != null) {
            view.setVisibility(0);
        }
        TextView textView = this.f141614v;
        if (textView != null) {
            textView.setText(C26279i.m95149a(i));
        }
        if (this.f141599f) {
            ProgressBar progressBar = this.f141615w;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            ProgressBar progressBar2 = this.f141615w;
            if (progressBar2 != null) {
                progressBar2.setMax(i2);
            }
            ProgressBar progressBar3 = this.f141615w;
            if (progressBar3 != null) {
                progressBar3.setProgress(i);
                return;
            }
            return;
        }
        ProgressBar progressBar4 = this.f141615w;
        if (progressBar4 != null) {
            progressBar4.setVisibility(8);
        }
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h, com.ss.android.lark.player.p2511a.AbstractC52071b
    /* renamed from: a */
    public void mo127014a(int i, Bundle bundle) {
        int i2 = 0;
        switch (i) {
            case -99031:
                if (bundle != null) {
                    int i3 = bundle.getInt("int_data");
                    if (i3 == 4) {
                        m223007a(this, true, false, 2, null);
                        mo195073m();
                        return;
                    } else if (i3 == 3) {
                        m223007a(this, false, false, 2, null);
                        mo195073m();
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case -99018:
                int i4 = this.f141598e;
                if (i4 > 0) {
                    mo195071c(i4);
                }
                OnboardingHitPoint.f99379a.mo141604a(true);
                long uptimeMillis = SystemClock.uptimeMillis() - this.f141589D;
                OnboardingMetric.Companion aVar = OnboardingMetric.f99302a;
                C24341b bVar = C24354a.f60078a;
                Intrinsics.checkExpressionValueIsNotNull(bVar, "VideoLoadDomain.VIDEO_READY_TO_PLAY");
                aVar.mo141516a(bVar, uptimeMillis);
                return;
            case -99016:
                SeekBar seekBar = this.f141596c;
                if (seekBar != null) {
                    i2 = seekBar.getMax();
                }
                m223022s();
                mo195067b(i2, i2);
                return;
            case -99015:
                ViewGroup viewGroup = this.f141603k;
                if (viewGroup == null) {
                    Intrinsics.throwNpe();
                }
                C1556v.m7130a(viewGroup);
                m223013d(false);
                C1556v.m7132b(this.f141603k);
                this.f141616x = true;
                return;
            case -99014:
                this.f141598e = 0;
                this.f141616x = true;
                return;
            case -99010:
                m223007a(this, false, false, 2, null);
                return;
            case -99004:
                m223013d(true);
                if (this.f141598e == 0) {
                    m223009b(this, true, false, 2, null);
                }
                this.f141589D = SystemClock.uptimeMillis();
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52112m
    /* renamed from: a */
    public void mo127013a(int i, int i2, int i3) {
        if (this.f141616x) {
            this.f141617y = i3;
            mo195067b(i, i2);
        }
    }

    public ControllerCover(Context context, String str, String str2, String str3) {
        super(context);
        this.f141591F = str;
        this.f141592G = str2;
        this.f141593H = str3;
    }

    /* renamed from: a */
    static /* synthetic */ void m223007a(ControllerCover aVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        aVar.m223008a(z, z2);
    }

    /* renamed from: b */
    static /* synthetic */ void m223009b(ControllerCover aVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        aVar.m223010b(z, z2);
    }
}
