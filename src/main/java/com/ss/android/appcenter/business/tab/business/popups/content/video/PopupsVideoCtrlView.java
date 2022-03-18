package com.ss.android.appcenter.business.tab.business.popups.content.video;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.net.p1270a.C27714b;
import com.ss.android.appcenter.business.p1268b.C27688a;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.appcenter.common.view.biz.WorkplaceErrorView;
import com.ss.android.appcenter.common.view.video.VideoView;
import com.ss.android.appcenter.common.view.video.listener.OnBufferingListener;
import com.ss.android.appcenter.common.view.video.listener.OnErrorEventListener;
import com.ss.android.appcenter.common.view.video.listener.OnPlayerEventListener;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001f\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u0017\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fB\u001f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u001a\u0010P\u001a\u00020Q2\b\b\u0001\u0010R\u001a\u00020O2\b\u0010S\u001a\u0004\u0018\u00010FJ\b\u0010T\u001a\u00020QH\u0003J\u001a\u0010U\u001a\u00020Q2\u0006\u0010V\u001a\u00020\u000e2\b\u0010W\u001a\u0004\u0018\u00010XH\u0016J\u0010\u0010Y\u001a\u00020Q2\u0006\u0010Z\u001a\u00020\u0017H\u0016J\u001a\u0010[\u001a\u00020Q2\u0006\u0010\\\u001a\u00020\u000e2\b\u0010]\u001a\u0004\u0018\u00010XH\u0016J\u0006\u0010^\u001a\u00020QJ\u001a\u0010_\u001a\u00020Q2\u0006\u0010\\\u001a\u00020\u000e2\b\u0010]\u001a\u0004\u0018\u00010XH\u0016J \u0010`\u001a\u00020Q2\u0006\u0010a\u001a\u00020@2\u0006\u0010b\u001a\u00020\u000e2\u0006\u0010c\u001a\u00020%H\u0016J\u0006\u0010d\u001a\u00020QJ\u0010\u0010e\u001a\u00020Q2\u0006\u0010a\u001a\u00020@H\u0016J\u0010\u0010f\u001a\u00020Q2\u0006\u0010a\u001a\u00020@H\u0016J\u0010\u0010g\u001a\u00020Q2\u0006\u0010h\u001a\u00020%H\u0002J\b\u0010i\u001a\u00020QH\u0002J\u0010\u0010j\u001a\u00020Q2\u0006\u0010k\u001a\u00020%H\u0002J\b\u0010l\u001a\u00020QH\u0002J\b\u0010m\u001a\u00020QH\u0002J\b\u0010n\u001a\u00020QH\u0002J\u0010\u0010o\u001a\u00020Q2\u0006\u0010p\u001a\u00020\u000eH\u0002J\b\u0010q\u001a\u00020QH\u0002J\b\u0010r\u001a\u00020QH\u0002J\b\u0010s\u001a\u00020QH\u0002J\u0018\u0010t\u001a\u00020Q2\u0006\u0010u\u001a\u00020\u000e2\u0006\u0010v\u001a\u00020\u000eH\u0002R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0016\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u001c\u001a\n \u0018*\u0004\u0018\u00010\u001d0\u001d8BX\u0002¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010!\u001a\u00020\"XD¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\"XD¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000R#\u0010&\u001a\n \u0018*\u0004\u0018\u00010'0'8BX\u0002¢\u0006\f\n\u0004\b*\u0010\u0015\u001a\u0004\b(\u0010)R\u000e\u0010+\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0004¢\u0006\u0002\n\u0000R#\u0010.\u001a\n \u0018*\u0004\u0018\u00010/0/8BX\u0002¢\u0006\f\n\u0004\b2\u0010\u0015\u001a\u0004\b0\u00101R#\u00103\u001a\n \u0018*\u0004\u0018\u00010/0/8BX\u0002¢\u0006\f\n\u0004\b5\u0010\u0015\u001a\u0004\b4\u00101R#\u00106\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178BX\u0002¢\u0006\f\n\u0004\b8\u0010\u0015\u001a\u0004\b7\u0010\u001aR#\u00109\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178BX\u0002¢\u0006\f\n\u0004\b;\u0010\u0015\u001a\u0004\b:\u0010\u001aR#\u0010<\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178BX\u0002¢\u0006\f\n\u0004\b>\u0010\u0015\u001a\u0004\b=\u0010\u001aR#\u0010?\u001a\n \u0018*\u0004\u0018\u00010@0@8BX\u0002¢\u0006\f\n\u0004\bC\u0010\u0015\u001a\u0004\bA\u0010BR\u000e\u0010D\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020FXD¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u000eXD¢\u0006\u0002\n\u0000R#\u0010H\u001a\n \u0018*\u0004\u0018\u00010I0I8BX\u0002¢\u0006\f\n\u0004\bL\u0010\u0015\u001a\u0004\bJ\u0010KR\u000e\u0010M\u001a\u00020FXD¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020OX.¢\u0006\u0002\n\u0000¨\u0006w"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/popups/content/video/PopupsVideoCtrlView;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Lcom/ss/android/appcenter/common/view/video/listener/OnPlayerEventListener;", "Lcom/ss/android/appcenter/common/view/video/listener/OnErrorEventListener;", "Lcom/ss/android/appcenter/common/view/video/listener/OnBufferingListener;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bufferDrawable", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "getBufferDrawable", "()Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "bufferDrawable$delegate", "Lkotlin/Lazy;", "clCtrlContainer", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getClCtrlContainer", "()Landroid/view/View;", "clCtrlContainer$delegate", "ctrlToggleAnim", "Landroid/animation/ValueAnimator;", "getCtrlToggleAnim", "()Landroid/animation/ValueAnimator;", "ctrlToggleAnim$delegate", "ctrlToggleAnimDuration", "", "ctrlViewIdleTime", "draggingSeekBar", "", "errLoadFailed", "Lcom/ss/android/appcenter/common/view/biz/WorkplaceErrorView;", "getErrLoadFailed", "()Lcom/ss/android/appcenter/common/view/biz/WorkplaceErrorView;", "errLoadFailed$delegate", "hasCover", "hideCtrlViewAction", "Ljava/lang/Runnable;", "ivBuffering", "Landroid/widget/ImageView;", "getIvBuffering", "()Landroid/widget/ImageView;", "ivBuffering$delegate", "ivCover", "getIvCover", "ivCover$delegate", "ivMuteBtn", "getIvMuteBtn", "ivMuteBtn$delegate", "ivPlayBtn", "getIvPlayBtn", "ivPlayBtn$delegate", "ivStartBtn", "getIvStartBtn", "ivStartBtn$delegate", "seekBarTime", "Landroid/widget/SeekBar;", "getSeekBarTime", "()Landroid/widget/SeekBar;", "seekBarTime$delegate", "seekBarTouchSlot", "tag", "", "timeUnitSecondsInMinute", "tvPlayedTime", "Landroid/widget/TextView;", "getTvPlayedTime", "()Landroid/widget/TextView;", "tvPlayedTime$delegate", "videoTimeFormat", "videoView", "Lcom/ss/android/appcenter/common/view/video/VideoView;", "bindVideoView", "", "vidView", "coverUrl", "initView", "onBufferingUpdate", "bufferPercentage", "extra", "Landroid/os/Bundle;", "onClick", "v", "onErrorEvent", "eventCode", "bundle", "onHide", "onPlayerEvent", "onProgressChanged", "seekBar", "progress", "fromUser", "onShow", "onStartTrackingTouch", "onStopTrackingTouch", "resetCtrlViewHideTime", "hideAgain", "startVideoPlay", "stateBuffering", "showCover", "stateError", "stateIdle", "statePlaying", "syncVideoStatus", "state", "toggleCtrlView", "toggleVideoMute", "toggleVideoPlay", "updatePlayedTime", "duration", "curTime", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PopupsVideoCtrlView extends FrameLayout implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, OnBufferingListener, OnErrorEventListener, OnPlayerEventListener {

    /* renamed from: a */
    public final long f69663a = 300;

    /* renamed from: b */
    public final int f69664b = C28209p.m103291a(12.0f);

    /* renamed from: d */
    private final String f69665d = "AppCenterPopupsVideoCtrlView";

    /* renamed from: e */
    private final String f69666e = "%1$02d:%2$02d / %3$02d:%4$02d";

    /* renamed from: f */
    private final int f69667f = 60;

    /* renamed from: g */
    private final long f69668g = 5000;

    /* renamed from: h */
    private boolean f69669h;

    /* renamed from: i */
    private VideoView f69670i;

    /* renamed from: j */
    private final Lazy f69671j = LazyKt.lazy(new C27875h(this));

    /* renamed from: k */
    private final Lazy f69672k = LazyKt.lazy(new C27878k(this));

    /* renamed from: l */
    private final Lazy f69673l = LazyKt.lazy(new C27874g(this));

    /* renamed from: m */
    private final Lazy f69674m = LazyKt.lazy(new C27871d(this));

    /* renamed from: n */
    private final Lazy f69675n = LazyKt.lazy(new C27867b(this));

    /* renamed from: o */
    private final Lazy f69676o = LazyKt.lazy(new C27877j(this));

    /* renamed from: p */
    private final Lazy f69677p = LazyKt.lazy(new C27876i(this));

    /* renamed from: q */
    private final Lazy f69678q = LazyKt.lazy(new C27880m(this));

    /* renamed from: r */
    private final Lazy f69679r = LazyKt.lazy(new C27879l(this));

    /* renamed from: s */
    private final Lazy f69680s = LazyKt.lazy(new C27866a(this));

    /* renamed from: t */
    private final Lazy f69681t = LazyKt.lazy(new C27868c(this));

    /* renamed from: u */
    private final Runnable f69682u = new RunnableC27872e(this);

    /* renamed from: v */
    private boolean f69683v;

    private final CircularProgressDrawable getBufferDrawable() {
        return (CircularProgressDrawable) this.f69680s.getValue();
    }

    private final WorkplaceErrorView getErrLoadFailed() {
        return (WorkplaceErrorView) this.f69674m.getValue();
    }

    private final ImageView getIvBuffering() {
        return (ImageView) this.f69673l.getValue();
    }

    private final ImageView getIvCover() {
        return (ImageView) this.f69671j.getValue();
    }

    private final View getIvMuteBtn() {
        return (View) this.f69677p.getValue();
    }

    private final View getIvPlayBtn() {
        return (View) this.f69676o.getValue();
    }

    private final View getIvStartBtn() {
        return (View) this.f69672k.getValue();
    }

    private final TextView getTvPlayedTime() {
        return (TextView) this.f69678q.getValue();
    }

    public final View getClCtrlContainer() {
        return (View) this.f69675n.getValue();
    }

    public final ValueAnimator getCtrlToggleAnim() {
        return (ValueAnimator) this.f69681t.getValue();
    }

    public final SeekBar getSeekBarTime() {
        return (SeekBar) this.f69679r.getValue();
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(seekBar, "seekBar");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.popups.content.video.PopupsVideoCtrlView$b */
    static final class C27867b extends Lambda implements Function0<View> {
        final /* synthetic */ PopupsVideoCtrlView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27867b(PopupsVideoCtrlView popupsVideoCtrlView) {
            super(0);
            this.this$0 = popupsVideoCtrlView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return this.this$0.findViewById(R.id.cl_video_ctrl_container);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/appcenter/common/view/biz/WorkplaceErrorView;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.popups.content.video.PopupsVideoCtrlView$d */
    static final class C27871d extends Lambda implements Function0<WorkplaceErrorView> {
        final /* synthetic */ PopupsVideoCtrlView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27871d(PopupsVideoCtrlView popupsVideoCtrlView) {
            super(0);
            this.this$0 = popupsVideoCtrlView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final WorkplaceErrorView invoke() {
            return (WorkplaceErrorView) this.this$0.findViewById(R.id.err_video_load_failed);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.popups.content.video.PopupsVideoCtrlView$g */
    static final class C27874g extends Lambda implements Function0<ImageView> {
        final /* synthetic */ PopupsVideoCtrlView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27874g(PopupsVideoCtrlView popupsVideoCtrlView) {
            super(0);
            this.this$0 = popupsVideoCtrlView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ImageView invoke() {
            return (ImageView) this.this$0.findViewById(R.id.iv_video_buffering);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.popups.content.video.PopupsVideoCtrlView$h */
    static final class C27875h extends Lambda implements Function0<ImageView> {
        final /* synthetic */ PopupsVideoCtrlView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27875h(PopupsVideoCtrlView popupsVideoCtrlView) {
            super(0);
            this.this$0 = popupsVideoCtrlView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ImageView invoke() {
            return (ImageView) this.this$0.findViewById(R.id.iv_video_cover);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.popups.content.video.PopupsVideoCtrlView$i */
    static final class C27876i extends Lambda implements Function0<View> {
        final /* synthetic */ PopupsVideoCtrlView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27876i(PopupsVideoCtrlView popupsVideoCtrlView) {
            super(0);
            this.this$0 = popupsVideoCtrlView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return this.this$0.findViewById(R.id.iv_video_mute_btn);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.popups.content.video.PopupsVideoCtrlView$j */
    static final class C27877j extends Lambda implements Function0<View> {
        final /* synthetic */ PopupsVideoCtrlView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27877j(PopupsVideoCtrlView popupsVideoCtrlView) {
            super(0);
            this.this$0 = popupsVideoCtrlView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return this.this$0.findViewById(R.id.iv_video_play_btn);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.popups.content.video.PopupsVideoCtrlView$k */
    static final class C27878k extends Lambda implements Function0<View> {
        final /* synthetic */ PopupsVideoCtrlView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27878k(PopupsVideoCtrlView popupsVideoCtrlView) {
            super(0);
            this.this$0 = popupsVideoCtrlView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return this.this$0.findViewById(R.id.iv_video_start_btn);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/SeekBar;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.popups.content.video.PopupsVideoCtrlView$l */
    static final class C27879l extends Lambda implements Function0<SeekBar> {
        final /* synthetic */ PopupsVideoCtrlView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27879l(PopupsVideoCtrlView popupsVideoCtrlView) {
            super(0);
            this.this$0 = popupsVideoCtrlView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SeekBar invoke() {
            return (SeekBar) this.this$0.findViewById(R.id.seek_video_time);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.popups.content.video.PopupsVideoCtrlView$m */
    static final class C27880m extends Lambda implements Function0<TextView> {
        final /* synthetic */ PopupsVideoCtrlView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27880m(PopupsVideoCtrlView popupsVideoCtrlView) {
            super(0);
            this.this$0 = popupsVideoCtrlView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return (TextView) this.this$0.findViewById(R.id.tv_video_played_time);
        }
    }

    /* renamed from: e */
    private final void m101774e() {
        VideoView videoView = this.f69670i;
        if (videoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoView");
        }
        if (!videoView.mo100463d()) {
            VideoView videoView2 = this.f69670i;
            if (videoView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoView");
            }
            videoView2.mo100456a(0);
            m101772b(true);
        }
    }

    /* renamed from: b */
    public final void mo99387b() {
        VideoView videoView = this.f69670i;
        if (videoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoView");
        }
        if (videoView.mo100461b() && videoView.mo100462c()) {
            videoView.mo100466g();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.popups.content.video.PopupsVideoCtrlView$a */
    static final class C27866a extends Lambda implements Function0<CircularProgressDrawable> {
        final /* synthetic */ PopupsVideoCtrlView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27866a(PopupsVideoCtrlView popupsVideoCtrlView) {
            super(0);
            this.this$0 = popupsVideoCtrlView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CircularProgressDrawable invoke() {
            CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(this.this$0.getContext());
            Context context = this.this$0.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            circularProgressDrawable.mo7701a(UDColorUtils.getColor(context, R.color.static_white));
            circularProgressDrawable.mo7694a((float) C28209p.m103291a(2.0f));
            circularProgressDrawable.mo7699a(Paint.Cap.ROUND);
            return circularProgressDrawable;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.popups.content.video.PopupsVideoCtrlView$c */
    static final class C27868c extends Lambda implements Function0<ValueAnimator> {
        final /* synthetic */ PopupsVideoCtrlView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27868c(PopupsVideoCtrlView popupsVideoCtrlView) {
            super(0);
            this.this$0 = popupsVideoCtrlView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ValueAnimator invoke() {
            ValueAnimator duration = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(this.this$0.f69663a);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                /* class com.ss.android.appcenter.business.tab.business.popups.content.video.PopupsVideoCtrlView.C27868c.C278691 */

                /* renamed from: a */
                final /* synthetic */ C27868c f69684a;

                {
                    this.f69684a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    View clCtrlContainer = this.f69684a.this$0.getClCtrlContainer();
                    Intrinsics.checkExpressionValueIsNotNull(clCtrlContainer, "clCtrlContainer");
                    Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        clCtrlContainer.setAlpha(((Float) animatedValue).floatValue());
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                }
            });
            duration.addListener(new AnimatorListenerAdapter(this) {
                /* class com.ss.android.appcenter.business.tab.business.popups.content.video.PopupsVideoCtrlView.C27868c.C278702 */

                /* renamed from: a */
                final /* synthetic */ C27868c f69685a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f69685a = r1;
                }

                public void onAnimationStart(Animator animator) {
                    View clCtrlContainer = this.f69685a.this$0.getClCtrlContainer();
                    Intrinsics.checkExpressionValueIsNotNull(clCtrlContainer, "clCtrlContainer");
                    clCtrlContainer.setVisibility(0);
                }

                public void onAnimationEnd(Animator animator) {
                    int i;
                    Object obj = null;
                    if (!(animator instanceof ValueAnimator)) {
                        animator = null;
                    }
                    ValueAnimator valueAnimator = (ValueAnimator) animator;
                    View clCtrlContainer = this.f69685a.this$0.getClCtrlContainer();
                    Intrinsics.checkExpressionValueIsNotNull(clCtrlContainer, "clCtrlContainer");
                    if (valueAnimator != null) {
                        obj = valueAnimator.getAnimatedValue();
                    }
                    if (Intrinsics.areEqual(obj, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED))) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    clCtrlContainer.setVisibility(i);
                }
            });
            return duration;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.popups.content.video.PopupsVideoCtrlView$e */
    static final class RunnableC27872e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PopupsVideoCtrlView f69686a;

        RunnableC27872e(PopupsVideoCtrlView popupsVideoCtrlView) {
            this.f69686a = popupsVideoCtrlView;
        }

        public final void run() {
            View clCtrlContainer = this.f69686a.getClCtrlContainer();
            Intrinsics.checkExpressionValueIsNotNull(clCtrlContainer, "clCtrlContainer");
            if (clCtrlContainer.getVisibility() != 8) {
                ValueAnimator ctrlToggleAnim = this.f69686a.getCtrlToggleAnim();
                Intrinsics.checkExpressionValueIsNotNull(ctrlToggleAnim, "ctrlToggleAnim");
                if (!ctrlToggleAnim.isRunning()) {
                    this.f69686a.mo99389c();
                }
            }
        }
    }

    /* renamed from: g */
    private final void m101776g() {
        View ivMuteBtn = getIvMuteBtn();
        Intrinsics.checkExpressionValueIsNotNull(ivMuteBtn, "ivMuteBtn");
        if (ivMuteBtn.isSelected()) {
            VideoView videoView = this.f69670i;
            if (videoView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoView");
            }
            videoView.setMute(false);
            View ivMuteBtn2 = getIvMuteBtn();
            Intrinsics.checkExpressionValueIsNotNull(ivMuteBtn2, "ivMuteBtn");
            ivMuteBtn2.setSelected(false);
        } else {
            VideoView videoView2 = this.f69670i;
            if (videoView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoView");
            }
            videoView2.setMute(true);
            View ivMuteBtn3 = getIvMuteBtn();
            Intrinsics.checkExpressionValueIsNotNull(ivMuteBtn3, "ivMuteBtn");
            ivMuteBtn3.setSelected(true);
        }
        m101771a(true);
    }

    /* renamed from: d */
    private final void m101773d() {
        PopupsVideoCtrlView popupsVideoCtrlView = this;
        getIvCover().setOnClickListener(popupsVideoCtrlView);
        getIvStartBtn().setOnClickListener(popupsVideoCtrlView);
        getIvBuffering().setOnClickListener(popupsVideoCtrlView);
        getIvPlayBtn().setOnClickListener(popupsVideoCtrlView);
        getIvMuteBtn().setOnClickListener(popupsVideoCtrlView);
        getErrLoadFailed().setOnClickListener(popupsVideoCtrlView);
        getErrLoadFailed().mo100451b();
        getSeekBarTime().setOnSeekBarChangeListener(this);
        getIvBuffering().setImageDrawable(getBufferDrawable());
        SeekBar seekBarTime = getSeekBarTime();
        Intrinsics.checkExpressionValueIsNotNull(seekBarTime, "seekBarTime");
        ViewParent parent = seekBarTime.getParent();
        if (parent != null) {
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.setOnTouchListener(new View$OnTouchListenerC27873f(this, viewGroup));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: f */
    private final void m101775f() {
        VideoView videoView = this.f69670i;
        if (videoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoView");
        }
        if (videoView.mo100461b()) {
            VideoView videoView2 = this.f69670i;
            if (videoView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoView");
            }
            if (videoView2.mo100462c()) {
                VideoView videoView3 = this.f69670i;
                if (videoView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("videoView");
                }
                videoView3.mo100466g();
            } else {
                VideoView videoView4 = this.f69670i;
                if (videoView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("videoView");
                }
                if (videoView4.getState() == 4) {
                    VideoView videoView5 = this.f69670i;
                    if (videoView5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("videoView");
                    }
                    videoView5.mo100471h();
                } else {
                    VideoView videoView6 = this.f69670i;
                    if (videoView6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("videoView");
                    }
                    videoView6.mo100465f();
                }
            }
        } else {
            m101774e();
        }
        View ivPlayBtn = getIvPlayBtn();
        Intrinsics.checkExpressionValueIsNotNull(ivPlayBtn, "ivPlayBtn");
        VideoView videoView7 = this.f69670i;
        if (videoView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoView");
        }
        ivPlayBtn.setSelected(videoView7.mo100462c());
        m101771a(true);
    }

    /* renamed from: h */
    private final void m101777h() {
        int i;
        View ivStartBtn = getIvStartBtn();
        Intrinsics.checkExpressionValueIsNotNull(ivStartBtn, "ivStartBtn");
        VideoView videoView = this.f69670i;
        if (videoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoView");
        }
        if (videoView.mo100462c()) {
            i = 8;
        } else {
            i = 0;
        }
        ivStartBtn.setVisibility(i);
        ImageView ivCover = getIvCover();
        Intrinsics.checkExpressionValueIsNotNull(ivCover, "ivCover");
        ivCover.setVisibility(8);
        WorkplaceErrorView errLoadFailed = getErrLoadFailed();
        Intrinsics.checkExpressionValueIsNotNull(errLoadFailed, "errLoadFailed");
        errLoadFailed.setVisibility(8);
        View ivPlayBtn = getIvPlayBtn();
        Intrinsics.checkExpressionValueIsNotNull(ivPlayBtn, "ivPlayBtn");
        VideoView videoView2 = this.f69670i;
        if (videoView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoView");
        }
        ivPlayBtn.setSelected(videoView2.mo100462c());
        ImageView ivBuffering = getIvBuffering();
        Intrinsics.checkExpressionValueIsNotNull(ivBuffering, "ivBuffering");
        ivBuffering.setVisibility(8);
        getBufferDrawable().stop();
    }

    /* renamed from: i */
    private final void m101778i() {
        int i;
        View ivStartBtn = getIvStartBtn();
        Intrinsics.checkExpressionValueIsNotNull(ivStartBtn, "ivStartBtn");
        ivStartBtn.setVisibility(0);
        ImageView ivCover = getIvCover();
        Intrinsics.checkExpressionValueIsNotNull(ivCover, "ivCover");
        if (this.f69669h) {
            i = 0;
        } else {
            i = 8;
        }
        ivCover.setVisibility(i);
        WorkplaceErrorView errLoadFailed = getErrLoadFailed();
        Intrinsics.checkExpressionValueIsNotNull(errLoadFailed, "errLoadFailed");
        errLoadFailed.setVisibility(8);
        View ivPlayBtn = getIvPlayBtn();
        Intrinsics.checkExpressionValueIsNotNull(ivPlayBtn, "ivPlayBtn");
        ivPlayBtn.setSelected(false);
        ImageView ivBuffering = getIvBuffering();
        Intrinsics.checkExpressionValueIsNotNull(ivBuffering, "ivBuffering");
        ivBuffering.setVisibility(8);
        getBufferDrawable().stop();
        View clCtrlContainer = getClCtrlContainer();
        Intrinsics.checkExpressionValueIsNotNull(clCtrlContainer, "clCtrlContainer");
        clCtrlContainer.setVisibility(8);
    }

    /* renamed from: j */
    private final void m101779j() {
        View ivStartBtn = getIvStartBtn();
        Intrinsics.checkExpressionValueIsNotNull(ivStartBtn, "ivStartBtn");
        ivStartBtn.setVisibility(8);
        ImageView ivCover = getIvCover();
        Intrinsics.checkExpressionValueIsNotNull(ivCover, "ivCover");
        ivCover.setVisibility(8);
        WorkplaceErrorView errLoadFailed = getErrLoadFailed();
        Intrinsics.checkExpressionValueIsNotNull(errLoadFailed, "errLoadFailed");
        errLoadFailed.setVisibility(0);
        View ivPlayBtn = getIvPlayBtn();
        Intrinsics.checkExpressionValueIsNotNull(ivPlayBtn, "ivPlayBtn");
        ivPlayBtn.setSelected(false);
        ImageView ivBuffering = getIvBuffering();
        Intrinsics.checkExpressionValueIsNotNull(ivBuffering, "ivBuffering");
        ivBuffering.setVisibility(8);
        getBufferDrawable().stop();
        View clCtrlContainer = getClCtrlContainer();
        Intrinsics.checkExpressionValueIsNotNull(clCtrlContainer, "clCtrlContainer");
        clCtrlContainer.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo99389c() {
        VideoView videoView = this.f69670i;
        if (videoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoView");
        }
        if (!videoView.mo100461b()) {
            View clCtrlContainer = getClCtrlContainer();
            Intrinsics.checkExpressionValueIsNotNull(clCtrlContainer, "clCtrlContainer");
            clCtrlContainer.setVisibility(8);
            return;
        }
        ValueAnimator ctrlToggleAnim = getCtrlToggleAnim();
        Intrinsics.checkExpressionValueIsNotNull(ctrlToggleAnim, "ctrlToggleAnim");
        if (!ctrlToggleAnim.isRunning()) {
            View clCtrlContainer2 = getClCtrlContainer();
            Intrinsics.checkExpressionValueIsNotNull(clCtrlContainer2, "clCtrlContainer");
            if (clCtrlContainer2.getVisibility() == 8) {
                getCtrlToggleAnim().start();
                m101771a(true);
                return;
            }
            getCtrlToggleAnim().reverse();
            m101771a(false);
        }
    }

    /* renamed from: a */
    public final void mo99384a() {
        VideoView videoView = this.f69670i;
        if (videoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoView");
        }
        if (videoView.mo100461b() && videoView.getState() == 4) {
            boolean a = videoView.mo100459a();
            videoView.setMute(true);
            videoView.mo100471h();
            videoView.setMute(a);
            videoView.mo100466g();
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        Intrinsics.checkParameterIsNotNull(seekBar, "seekBar");
        this.f69683v = true;
        m101771a(false);
    }

    /* renamed from: a */
    private final void m101771a(boolean z) {
        getClCtrlContainer().removeCallbacks(this.f69682u);
        if (z) {
            getClCtrlContainer().postDelayed(this.f69682u, this.f69668g);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        Intrinsics.checkParameterIsNotNull(seekBar, "seekBar");
        this.f69683v = false;
        VideoView videoView = this.f69670i;
        if (videoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoView");
        }
        videoView.mo100460b(seekBar.getProgress());
        m101771a(true);
    }

    /* renamed from: a */
    private final void m101769a(int i) {
        if (i != -2) {
            if (i == -1) {
                m101779j();
                return;
            } else if (!(i == 0 || i == 1)) {
                if (i == 3 || i == 4) {
                    m101777h();
                    return;
                } else if (!(i == 5 || i == 6)) {
                    return;
                }
            }
        }
        m101778i();
    }

    /* renamed from: b */
    private final void m101772b(boolean z) {
        int i;
        VideoView videoView = this.f69670i;
        if (videoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoView");
        }
        if (videoView.mo100463d()) {
            View ivStartBtn = getIvStartBtn();
            Intrinsics.checkExpressionValueIsNotNull(ivStartBtn, "ivStartBtn");
            ivStartBtn.setVisibility(8);
            ImageView ivCover = getIvCover();
            Intrinsics.checkExpressionValueIsNotNull(ivCover, "ivCover");
            if (!z || !this.f69669h) {
                i = 8;
            } else {
                i = 0;
            }
            ivCover.setVisibility(i);
            WorkplaceErrorView errLoadFailed = getErrLoadFailed();
            Intrinsics.checkExpressionValueIsNotNull(errLoadFailed, "errLoadFailed");
            errLoadFailed.setVisibility(8);
            View ivPlayBtn = getIvPlayBtn();
            Intrinsics.checkExpressionValueIsNotNull(ivPlayBtn, "ivPlayBtn");
            VideoView videoView2 = this.f69670i;
            if (videoView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoView");
            }
            ivPlayBtn.setSelected(videoView2.mo100462c());
            ImageView ivBuffering = getIvBuffering();
            Intrinsics.checkExpressionValueIsNotNull(ivBuffering, "ivBuffering");
            ivBuffering.setVisibility(0);
            if (!getBufferDrawable().isRunning()) {
                getBufferDrawable().start();
            }
        }
    }

    public void onClick(View view) {
        Intrinsics.checkParameterIsNotNull(view, "v");
        int id = view.getId();
        if (id == R.id.iv_video_cover || id == R.id.err_video_load_failed) {
            m101774e();
        } else if (id == R.id.iv_video_start_btn || id == R.id.iv_video_play_btn) {
            m101775f();
        } else if (id == R.id.iv_video_mute_btn) {
            m101776g();
        } else {
            VideoView videoView = this.f69670i;
            if (videoView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoView");
            }
            if (id == videoView.getId()) {
                mo99389c();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PopupsVideoCtrlView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        LayoutInflater.from(getContext()).inflate(R.layout.appcenter_biz_popups_video_ctrl, (ViewGroup) this, true);
        m101773d();
    }

    @Override // com.ss.android.appcenter.common.view.video.listener.OnBufferingListener
    /* renamed from: b */
    public void mo99388b(int i, Bundle bundle) {
        SeekBar seekBarTime = getSeekBarTime();
        Intrinsics.checkExpressionValueIsNotNull(seekBarTime, "seekBarTime");
        SeekBar seekBarTime2 = getSeekBarTime();
        Intrinsics.checkExpressionValueIsNotNull(seekBarTime2, "seekBarTime");
        seekBarTime2.setSecondaryProgress((int) ((((float) i) / 100.0f) * ((float) seekBarTime.getMax())));
    }

    @Override // com.ss.android.appcenter.common.view.video.listener.OnErrorEventListener
    /* renamed from: c */
    public void mo99390c(int i, Bundle bundle) {
        String str = this.f69665d;
        C28184h.m103248b(str, "errorEvent: eventCode=" + i + ",bundle=" + bundle);
        m101779j();
    }

    /* renamed from: a */
    private final void m101770a(int i, int i2) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds((long) i);
        long seconds2 = TimeUnit.MILLISECONDS.toSeconds((long) i2);
        int i3 = this.f69667f;
        long j = seconds % ((long) i3);
        long j2 = seconds / ((long) i3);
        long j3 = seconds2 % ((long) i3);
        long j4 = seconds2 / ((long) i3);
        SeekBar seekBarTime = getSeekBarTime();
        Intrinsics.checkExpressionValueIsNotNull(seekBarTime, "seekBarTime");
        seekBarTime.setMax(i);
        if (!this.f69683v) {
            SeekBar seekBarTime2 = getSeekBarTime();
            Intrinsics.checkExpressionValueIsNotNull(seekBarTime2, "seekBarTime");
            seekBarTime2.setProgress(i2);
        }
        TextView tvPlayedTime = getTvPlayedTime();
        Intrinsics.checkExpressionValueIsNotNull(tvPlayedTime, "tvPlayedTime");
        String format = String.format(this.f69666e, Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j2), Long.valueOf(j)}, 4));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(this, *args)");
        tvPlayedTime.setText(format);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.popups.content.video.PopupsVideoCtrlView$f */
    public static final class View$OnTouchListenerC27873f implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ PopupsVideoCtrlView f69687a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f69688b;

        View$OnTouchListenerC27873f(PopupsVideoCtrlView popupsVideoCtrlView, ViewGroup viewGroup) {
            this.f69687a = popupsVideoCtrlView;
            this.f69688b = viewGroup;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            float f;
            Rect rect = new Rect();
            this.f69687a.getSeekBarTime().getHitRect(rect);
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            if (motionEvent.getY() < ((float) (rect.top - this.f69687a.f69664b)) || motionEvent.getY() > ((float) (rect.bottom + this.f69687a.f69664b))) {
                return this.f69688b.onTouchEvent(motionEvent);
            }
            float height = (float) (rect.top + (rect.height() / 2));
            float x = motionEvent.getX() - ((float) rect.left);
            if (x < ((float) 0)) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else if (x > ((float) rect.width())) {
                f = (float) rect.width();
            } else {
                f = x;
            }
            return this.f69687a.getSeekBarTime().onTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), f, height, motionEvent.getMetaState()));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PopupsVideoCtrlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        LayoutInflater.from(getContext()).inflate(R.layout.appcenter_biz_popups_video_ctrl, (ViewGroup) this, true);
        m101773d();
    }

    @Override // com.ss.android.appcenter.common.view.video.listener.OnPlayerEventListener
    /* renamed from: a */
    public void mo99385a(int i, Bundle bundle) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        switch (i) {
            case -99031:
                if (bundle != null) {
                    int i7 = bundle.getInt("int_data");
                    m101769a(i7);
                    String str = this.f69665d;
                    C28184h.m103250d(str, "playerEvent: PLAYER_EVENT_ON_STATUS_CHANGE：" + i7);
                    return;
                }
                return;
            case -99019:
                if (bundle != null) {
                    i2 = bundle.getInt("int_arg1");
                } else {
                    i2 = 0;
                }
                if (bundle != null) {
                    i6 = bundle.getInt("int_arg2");
                }
                m101770a(i6, i2);
                return;
            case -99018:
                if (bundle != null) {
                    i3 = bundle.getInt("int_arg1");
                } else {
                    i3 = 0;
                }
                if (bundle != null) {
                    i4 = bundle.getInt("int_arg2");
                } else {
                    i4 = 0;
                }
                if (bundle != null) {
                    i5 = bundle.getInt("int_arg3");
                } else {
                    i5 = 0;
                }
                if (bundle != null) {
                    i6 = bundle.getInt("int_arg4");
                }
                m101778i();
                m101770a(i5, i6);
                String str2 = this.f69665d;
                C28184h.m103250d(str2, "playerEvent: PLAYER_EVENT_ON_PREPARED,videoWidth=" + i3 + ",videoHeight=" + i4);
                return;
            case -99016:
                m101778i();
                C28184h.m103250d(this.f69665d, "playerEvent: PLAYER_EVENT_ON_PLAY_COMPLETE");
                return;
            case -99011:
                m101777h();
                C28184h.m103250d(this.f69665d, "playerEvent: PLAYER_EVENT_ON_BUFFERING_END");
                return;
            case -99010:
                m101772b(false);
                C28184h.m103250d(this.f69665d, "playerEvent: PLAYER_EVENT_ON_BUFFERING_START");
                return;
            case -99004:
                m101777h();
                C28184h.m103250d(this.f69665d, "playerEvent: PLAYER_EVENT_ON_START");
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo99386a(VideoView videoView, String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(videoView, "vidView");
        this.f69670i = videoView;
        if (videoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoView");
        }
        videoView.setOnPlayerEventListener(this);
        VideoView videoView2 = this.f69670i;
        if (videoView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoView");
        }
        videoView2.setOnErrorEventListener(this);
        VideoView videoView3 = this.f69670i;
        if (videoView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoView");
        }
        videoView3.setOnBufferingListener(this);
        VideoView videoView4 = this.f69670i;
        if (videoView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoView");
        }
        videoView4.setOnClickListener(this);
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f69669h = false;
            ImageView ivCover = getIvCover();
            Intrinsics.checkExpressionValueIsNotNull(ivCover, "ivCover");
            ivCover.setVisibility(8);
            videoView.mo100464e();
            return;
        }
        this.f69669h = true;
        ImageView ivCover2 = getIvCover();
        Intrinsics.checkExpressionValueIsNotNull(ivCover2, "ivCover");
        ivCover2.setVisibility(0);
        C27688a.m101215a(str, C27714b.m101357a(), getIvCover());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PopupsVideoCtrlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        LayoutInflater.from(getContext()).inflate(R.layout.appcenter_biz_popups_video_ctrl, (ViewGroup) this, true);
        m101773d();
    }
}
