package com.ss.android.lark.mm.module.player.videotoolbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.search.model.FindResponse;
import com.ss.android.lark.mm.module.detail.search.model.FindTimeline;
import com.ss.android.lark.mm.module.player.core.AbstractC46596c;
import com.ss.android.lark.mm.module.player.core.AbstractC46597d;
import com.ss.android.lark.mm.module.player.core.AbstractC46598e;
import com.ss.android.lark.mm.module.player.core.AbstractC46599f;
import com.ss.android.lark.mm.module.player.core.C46602i;
import com.ss.android.lark.mm.module.player.core.layer.widget.KeyWordCircle;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.C47116p;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.Error;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001iB%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020)H\u0002J\u0006\u0010*\u001a\u00020$J\b\u0010+\u001a\u00020$H\u0003J\u000f\u0010,\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010-J\u0006\u0010.\u001a\u00020\tJ\b\u0010/\u001a\u00020$H\u0002J\b\u00100\u001a\u00020$H\u0002J\b\u00101\u001a\u00020$H\u0016J\b\u00102\u001a\u00020$H\u0016J\b\u00103\u001a\u00020$H\u0016J\b\u00104\u001a\u00020$H\u0014J\u0012\u00105\u001a\u00020$2\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0012\u00108\u001a\u00020$2\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\u0010\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020\rH\u0016J\u000e\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u00020?J\u0006\u0010@\u001a\u00020$J\b\u0010A\u001a\u00020$H\u0016J\b\u0010B\u001a\u00020$H\u0016J\b\u0010C\u001a\u00020$H\u0016J\b\u0010D\u001a\u00020$H\u0016J\u0010\u0010E\u001a\u00020$2\u0006\u0010F\u001a\u00020GH\u0016J \u0010H\u001a\u00020$2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\t2\u0006\u0010L\u001a\u00020\rH\u0016J\b\u0010M\u001a\u00020$H\u0016J\b\u0010N\u001a\u00020$H\u0016J\b\u0010O\u001a\u00020$H\u0016J\b\u0010P\u001a\u00020$H\u0016J\b\u0010Q\u001a\u00020$H\u0016J\u0010\u0010R\u001a\u00020$2\u0006\u0010I\u001a\u00020JH\u0016J\b\u0010S\u001a\u00020$H\u0016J\u0010\u0010T\u001a\u00020$2\u0006\u0010I\u001a\u00020JH\u0016J\u000e\u0010U\u001a\u00020$2\u0006\u0010V\u001a\u00020\tJ\u000e\u0010W\u001a\u00020$2\u0006\u0010V\u001a\u00020\tJ\u0017\u0010X\u001a\u00020$2\b\u0010Y\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010ZJ\u0010\u0010[\u001a\u00020$2\b\u0010\\\u001a\u0004\u0018\u00010]J\u000e\u0010^\u001a\u00020$2\u0006\u0010_\u001a\u00020\tJ\u0016\u0010`\u001a\u00020$2\u0006\u0010V\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\tJ\u0010\u0010a\u001a\u00020$2\u0006\u0010V\u001a\u00020\tH\u0002J\u0015\u0010b\u001a\u00020$2\b\u0010c\u001a\u0004\u0018\u00010G¢\u0006\u0002\u0010dJ\u0010\u0010e\u001a\u00020$2\u0006\u0010f\u001a\u00020\rH\u0002J\u000e\u0010g\u001a\u00020$2\u0006\u0010h\u001a\u00020\rR\u000e\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0004¢\u0006\u0002\n\u0000¨\u0006j"}, d2 = {"Lcom/ss/android/lark/mm/module/player/videotoolbar/MmSimpleVideoToolbar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/ss/android/lark/mm/module/player/core/IPlayerListener;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "def", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentPos", "isSeeking", "", "mAdapter", "Lcom/ss/android/lark/mm/module/player/core/MmPlayerAdapter;", "mListener", "Lcom/ss/android/lark/mm/module/player/videotoolbar/MmSimpleVideoToolbar$ISimpleVideoToolbarListener;", "getMListener", "()Lcom/ss/android/lark/mm/module/player/videotoolbar/MmSimpleVideoToolbar$ISimpleVideoToolbarListener;", "setMListener", "(Lcom/ss/android/lark/mm/module/player/videotoolbar/MmSimpleVideoToolbar$ISimpleVideoToolbarListener;)V", "mSeekListener", "Lcom/ss/android/lark/mm/module/player/videotoolbar/ISeekBarListener;", "getMSeekListener", "()Lcom/ss/android/lark/mm/module/player/videotoolbar/ISeekBarListener;", "setMSeekListener", "(Lcom/ss/android/lark/mm/module/player/videotoolbar/ISeekBarListener;)V", "mmVideoToolbarCircle", "Lcom/ss/android/lark/mm/module/player/core/layer/widget/KeyWordCircle;", "getMmVideoToolbarCircle", "()Lcom/ss/android/lark/mm/module/player/core/layer/widget/KeyWordCircle;", "setMmVideoToolbarCircle", "(Lcom/ss/android/lark/mm/module/player/core/layer/widget/KeyWordCircle;)V", "recoverSeekbarRunnable", "Lkotlin/Function0;", "", "bind", "adapter", "delegateTouchEvent", "event", "Landroid/view/MotionEvent;", "destroy", "enlargeSeekbarTouchArea", "getVDuration", "()Ljava/lang/Integer;", "getVPostion", "initSeekBarStyle", "initView", "onBufferEnd", "onBufferStart", "onComplete", "onDetachedFromWindow", "onEngineInitPlay", "videoEngine", "Lcom/ss/ttvideoengine/TTVideoEngine;", "onError", "error", "Lcom/ss/ttvideoengine/utils/Error;", "onFullscreenChange", "isFullscreen", "onMediaViewMove", "diff", "", "onMediaViewTouchUp", "onPause", "onPlay", "onPrepare", "onPrepared", "onProgressChange", "current", "", "onProgressChanged", "seekBar", "Landroid/widget/SeekBar;", "progress", "fromUser", "onRelease", "onRenderStart", "onReplay", "onSeekComplete", "onStartSeek", "onStartTrackingTouch", "onStop", "onStopTrackingTouch", "seekTo", "pos", "seekToManual", "setDuration", "dur", "(Ljava/lang/Integer;)V", "setKeywordCircle", "findResponse", "Lcom/ss/android/lark/mm/module/detail/search/model/FindResponse;", "setKeywordHighLight", "index", "setPosDur", "setPosition", "setWholeTimeStamp", "time", "(Ljava/lang/Long;)V", "updateSeekbarStyle", "isHover", "updateSeekbarThumbVisible", "isVisible", "ISimpleVideoToolbarListener", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmSimpleVideoToolbar extends ConstraintLayout implements SeekBar.OnSeekBarChangeListener, AbstractC46599f {

    /* renamed from: a */
    public C46602i f117542a;

    /* renamed from: b */
    private boolean f117543b;

    /* renamed from: c */
    private AbstractC46732d f117544c;

    /* renamed from: d */
    private ISimpleVideoToolbarListener f117545d;

    /* renamed from: e */
    private KeyWordCircle f117546e;

    /* renamed from: f */
    private final Function0<Unit> f117547f;

    /* renamed from: g */
    private HashMap f117548g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/mm/module/player/videotoolbar/MmSimpleVideoToolbar$ISimpleVideoToolbarListener;", "", "onEnterPodcast", "", "onPageTouchSeek", "timestamp", "", "onSeekManual", "showMoreMenu", "showSpeedPicker", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.videotoolbar.MmSimpleVideoToolbar$a */
    public interface ISimpleVideoToolbarListener {
        /* renamed from: a */
        void mo164147a();

        /* renamed from: a */
        void mo164148a(long j);

        /* renamed from: b */
        void mo164149b();

        /* renamed from: c */
        void mo164150c();

        /* renamed from: d */
        void mo164151d();
    }

    public MmSimpleVideoToolbar(Context context) {
        this(context, null, 0, 6, null);
    }

    public MmSimpleVideoToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo164122a(float f) {
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: a */
    public void mo163657a(TTVideoEngine tTVideoEngine) {
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: a */
    public void mo163658a(Error error) {
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: a */
    public void mo163659a(boolean z) {
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: b */
    public void mo163660b() {
    }

    /* renamed from: c */
    public View mo164129c(int i) {
        if (this.f117548g == null) {
            this.f117548g = new HashMap();
        }
        View view = (View) this.f117548g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f117548g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: c */
    public void mo163661c() {
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: e */
    public void mo163663e() {
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: f */
    public void mo163664f() {
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: h */
    public void mo163666h() {
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: i */
    public void mo163667i() {
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: j */
    public void mo163668j() {
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: k */
    public void mo163669k() {
    }

    /* renamed from: n */
    public final void mo164136n() {
    }

    public final ISimpleVideoToolbarListener getMListener() {
        return this.f117545d;
    }

    public final AbstractC46732d getMSeekListener() {
        return this.f117544c;
    }

    public final KeyWordCircle getMmVideoToolbarCircle() {
        return this.f117546e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/mm/module/player/videotoolbar/MmSimpleVideoToolbar$bind$1", "Lcom/ss/android/lark/mm/module/player/core/IPlayerAdapterExtListener;", "onDismissForeLayer", "", "onDismissToolBar", "onEnterPodcast", "onPlayerSpeed", "speed", "", "onShowToolbar", "showMoreMenu", "showSpeedPicker", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.videotoolbar.MmSimpleVideoToolbar$b */
    public static final class C46722b implements AbstractC46596c {

        /* renamed from: a */
        final /* synthetic */ MmSimpleVideoToolbar f117549a;

        @Override // com.ss.android.lark.mm.module.player.core.AbstractC46596c
        /* renamed from: a */
        public void mo163693a(float f) {
        }

        @Override // com.ss.android.lark.mm.module.player.core.AbstractC46596c
        /* renamed from: o */
        public void mo163697o() {
            this.f117549a.mo164128b(false);
        }

        @Override // com.ss.android.lark.mm.module.player.core.AbstractC46596c
        /* renamed from: p */
        public void mo163698p() {
            this.f117549a.mo164128b(true);
        }

        @Override // com.ss.android.lark.mm.module.player.core.AbstractC46596c
        /* renamed from: q */
        public void mo163699q() {
            this.f117549a.mo164128b(false);
        }

        @Override // com.ss.android.lark.mm.module.player.core.AbstractC46596c
        /* renamed from: l */
        public void mo163694l() {
            ISimpleVideoToolbarListener mListener = this.f117549a.getMListener();
            if (mListener != null) {
                mListener.mo164147a();
            }
        }

        @Override // com.ss.android.lark.mm.module.player.core.AbstractC46596c
        /* renamed from: m */
        public void mo163695m() {
            ISimpleVideoToolbarListener mListener = this.f117549a.getMListener();
            if (mListener != null) {
                mListener.mo164149b();
            }
        }

        @Override // com.ss.android.lark.mm.module.player.core.AbstractC46596c
        /* renamed from: n */
        public void mo163696n() {
            ISimpleVideoToolbarListener mListener = this.f117549a.getMListener();
            if (mListener != null) {
                mListener.mo164150c();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46722b(MmSimpleVideoToolbar mmSimpleVideoToolbar) {
            this.f117549a = mmSimpleVideoToolbar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.videotoolbar.MmSimpleVideoToolbar$d */
    public static final class RunnableC46724d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Ref.BooleanRef f117555a;

        RunnableC46724d(Ref.BooleanRef booleanRef) {
            this.f117555a = booleanRef;
        }

        public final void run() {
            this.f117555a.element = true;
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: a */
    public void mo163655a() {
        setDuration(getVDuration());
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo164135m();
    }

    /* renamed from: m */
    public final void mo164135m() {
        C46602i iVar = this.f117542a;
        if (iVar != null) {
            iVar.mo163734b(this);
        }
    }

    /* renamed from: o */
    private final void m184923o() {
        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) mo164129c(R.id.mmVideoToolbarSeekbar);
        if (appCompatSeekBar != null) {
            appCompatSeekBar.setOnSeekBarChangeListener(this);
        }
        mo164134l();
        m184924p();
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: g */
    public void mo163665g() {
        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) mo164129c(R.id.mmVideoToolbarSeekbar);
        if (appCompatSeekBar != null) {
            int progress = appCompatSeekBar.getProgress();
            AbstractC46732d dVar = this.f117544c;
            if (dVar != null) {
                dVar.mo164222a(progress, false);
            }
        }
    }

    private final Integer getVDuration() {
        int i;
        AbstractC46598e a;
        C46602i iVar = this.f117542a;
        if (iVar == null || (a = iVar.mo163685a()) == null) {
            i = 0;
        } else {
            i = a.mo163710a();
        }
        if (i <= 0) {
            AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) mo164129c(R.id.mmVideoToolbarSeekbar);
            if (appCompatSeekBar == null) {
                return null;
            }
            i = appCompatSeekBar.getMax();
        }
        return Integer.valueOf(i);
    }

    /* renamed from: p */
    private final void m184924p() {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = false;
        RunnableC46724d dVar = new RunnableC46724d(booleanRef);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        Intrinsics.checkExpressionValueIsNotNull(viewConfiguration, "ViewConfiguration.get(context)");
        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = BitmapDescriptorFactory.HUE_RED;
        setOnTouchListener(new View$OnTouchListenerC46723c(this, floatRef, booleanRef, dVar, scaledTouchSlop));
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: d */
    public void mo163662d() {
        View c = mo164129c(R.id.rightMockBar);
        if (c != null) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            c.setBackgroundColor(UDColorUtils.getColor(context, R.color.primary_pri_500));
        }
        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) mo164129c(R.id.mmVideoToolbarSeekbar);
        if (appCompatSeekBar != null) {
            AppCompatSeekBar appCompatSeekBar2 = (AppCompatSeekBar) mo164129c(R.id.mmVideoToolbarSeekbar);
            Intrinsics.checkExpressionValueIsNotNull(appCompatSeekBar2, "mmVideoToolbarSeekbar");
            appCompatSeekBar.setProgress(appCompatSeekBar2.getMax());
        }
    }

    /* renamed from: l */
    public final void mo164134l() {
        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) mo164129c(R.id.mmVideoToolbarSeekbar);
        if (appCompatSeekBar != null) {
            appCompatSeekBar.setProgressDrawable(ContextCompat.getDrawable(getContext(), R.drawable.mm_video_seekbar_layer_progress));
        }
        AppCompatSeekBar appCompatSeekBar2 = (AppCompatSeekBar) mo164129c(R.id.mmVideoToolbarSeekbar);
        if (appCompatSeekBar2 != null) {
            appCompatSeekBar2.setThumb(ContextCompat.getDrawable(getContext(), R.drawable.mm_video_shape_thumb));
        }
        setTranslationY(-((float) UIUtils.dp2px(getContext(), 16.0f)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.videotoolbar.MmSimpleVideoToolbar$e */
    static final class C46725e extends Lambda implements Function0<Unit> {
        final /* synthetic */ MmSimpleVideoToolbar this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46725e(MmSimpleVideoToolbar mmSimpleVideoToolbar) {
            super(0);
            this.this$0 = mmSimpleVideoToolbar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            Drawable thumb;
            Drawable mutate;
            C46602i iVar;
            Drawable thumb2;
            Drawable mutate2;
            AbstractC46598e a;
            this.this$0.mo164134l();
            C46602i iVar2 = this.this$0.f117542a;
            if ((iVar2 == null || !iVar2.mo163737j()) && ((iVar = this.this$0.f117542a) == null || (a = iVar.mo163685a()) == null || a.mo163714c())) {
                AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) this.this$0.mo164129c(R.id.mmVideoToolbarSeekbar);
                if (appCompatSeekBar != null && (thumb2 = appCompatSeekBar.getThumb()) != null && (mutate2 = thumb2.mutate()) != null) {
                    mutate2.setAlpha(0);
                    return;
                }
                return;
            }
            AppCompatSeekBar appCompatSeekBar2 = (AppCompatSeekBar) this.this$0.mo164129c(R.id.mmVideoToolbarSeekbar);
            if (appCompatSeekBar2 != null && (thumb = appCompatSeekBar2.getThumb()) != null && (mutate = thumb.mutate()) != null) {
                mutate.setAlpha(255);
            }
        }
    }

    public final int getVPostion() {
        AbstractC46598e a;
        int i;
        AbstractC46598e a2;
        C46602i iVar = this.f117542a;
        if (iVar == null || (a = iVar.mo163685a()) == null || !a.mo163714c()) {
            AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) mo164129c(R.id.mmVideoToolbarSeekbar);
            if (appCompatSeekBar != null) {
                return appCompatSeekBar.getProgress();
            }
            return 0;
        }
        C46602i iVar2 = this.f117542a;
        if (iVar2 == null || (a2 = iVar2.mo163685a()) == null) {
            i = 0;
        } else {
            i = a2.mo163713b();
        }
        if (i > 0) {
            return i;
        }
        AppCompatSeekBar appCompatSeekBar2 = (AppCompatSeekBar) mo164129c(R.id.mmVideoToolbarSeekbar);
        if (appCompatSeekBar2 != null) {
            return appCompatSeekBar2.getProgress();
        }
        return 0;
    }

    public final void setMListener(ISimpleVideoToolbarListener aVar) {
        this.f117545d = aVar;
    }

    public final void setMSeekListener(AbstractC46732d dVar) {
        this.f117544c = dVar;
    }

    public final void setMmVideoToolbarCircle(KeyWordCircle keyWordCircle) {
        this.f117546e = keyWordCircle;
    }

    private final void setPosition(int i) {
        C47116p.m186582a((AppCompatSeekBar) mo164129c(R.id.mmVideoToolbarSeekbar), i);
    }

    /* renamed from: b */
    public final void mo164127b(int i) {
        ISimpleVideoToolbarListener aVar = this.f117545d;
        if (aVar != null) {
            aVar.mo164151d();
        }
        mo164123a(i);
    }

    public final void setKeywordHighLight(int i) {
        KeyWordCircle keyWordCircle = this.f117546e;
        if (keyWordCircle != null) {
            keyWordCircle.setHighLightIndex(i);
        }
        KeyWordCircle keyWordCircle2 = this.f117546e;
        if (keyWordCircle2 != null) {
            keyWordCircle2.invalidate();
        }
    }

    public final void setWholeTimeStamp(Long l) {
        KeyWordCircle keyWordCircle = this.f117546e;
        if (keyWordCircle != null) {
            keyWordCircle.setWholeWidth(l);
        }
        KeyWordCircle keyWordCircle2 = this.f117546e;
        if (keyWordCircle2 != null) {
            keyWordCircle2.invalidate();
        }
    }

    private final void setDuration(Integer num) {
        int i;
        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) mo164129c(R.id.mmVideoToolbarSeekbar);
        if (appCompatSeekBar != null) {
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            appCompatSeekBar.setMax(i);
        }
    }

    /* renamed from: a */
    public final void mo164123a(int i) {
        AbstractC46597d b;
        if (this.f117542a != null) {
            setPosition(i);
            C46602i iVar = this.f117542a;
            if (!(iVar == null || (b = iVar.mo163686b()) == null)) {
                b.mo163703a((long) i);
            }
            ISimpleVideoToolbarListener aVar = this.f117545d;
            if (aVar != null) {
                aVar.mo164148a((long) i);
            }
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        Intrinsics.checkParameterIsNotNull(seekBar, "seekBar");
        this.f117543b = true;
        AbstractC46732d dVar = this.f117544c;
        if (dVar != null) {
            dVar.mo164223b();
        }
        m184922c(true);
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: a */
    public void mo163656a(long j) {
        if (!this.f117543b) {
            C47116p.m186582a((AppCompatSeekBar) mo164129c(R.id.mmVideoToolbarSeekbar), (int) j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.lark.mm.module.player.videotoolbar.e] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.lark.mm.module.player.videotoolbar.e] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.ss.android.lark.mm.module.player.videotoolbar.e] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m184922c(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x003e
            kotlin.jvm.functions.Function0<kotlin.Unit> r3 = r2.f117547f
            if (r3 == 0) goto L_0x000c
            com.ss.android.lark.mm.module.player.videotoolbar.e r0 = new com.ss.android.lark.mm.module.player.videotoolbar.e
            r0.<init>(r3)
            r3 = r0
        L_0x000c:
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            com.ss.android.lark.mm.p2288b.C45859k.m181687b(r3)
            r3 = 2131303236(0x7f091b44, float:1.822458E38)
            android.view.View r3 = r2.mo164129c(r3)
            androidx.appcompat.widget.AppCompatSeekBar r3 = (androidx.appcompat.widget.AppCompatSeekBar) r3
            if (r3 == 0) goto L_0x002a
            android.content.Context r0 = r2.getContext()
            r1 = 2131234947(0x7f081083, float:1.8086074E38)
            android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.getDrawable(r0, r1)
            r3.setThumb(r0)
        L_0x002a:
            r3 = 1
            r2.mo164128b(r3)
            android.content.Context r3 = r2.getContext()
            r0 = 1100480512(0x41980000, float:19.0)
            int r3 = com.larksuite.framework.utils.UIUtils.dp2px(r3, r0)
            float r3 = (float) r3
            float r3 = -r3
            r2.setTranslationY(r3)
            goto L_0x005e
        L_0x003e:
            kotlin.jvm.functions.Function0<kotlin.Unit> r3 = r2.f117547f
            if (r3 == 0) goto L_0x0048
            com.ss.android.lark.mm.module.player.videotoolbar.e r0 = new com.ss.android.lark.mm.module.player.videotoolbar.e
            r0.<init>(r3)
            r3 = r0
        L_0x0048:
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            com.ss.android.lark.mm.p2288b.C45859k.m181687b(r3)
            kotlin.jvm.functions.Function0<kotlin.Unit> r3 = r2.f117547f
            if (r3 == 0) goto L_0x0057
            com.ss.android.lark.mm.module.player.videotoolbar.e r0 = new com.ss.android.lark.mm.module.player.videotoolbar.e
            r0.<init>(r3)
            r3 = r0
        L_0x0057:
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r0 = 200(0xc8, double:9.9E-322)
            com.ss.android.lark.mm.p2288b.C45859k.m181686a(r3, r0)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.player.videotoolbar.MmSimpleVideoToolbar.m184922c(boolean):void");
    }

    /* renamed from: a */
    public final void mo164125a(MotionEvent motionEvent) {
        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) mo164129c(R.id.mmVideoToolbarSeekbar);
        if (appCompatSeekBar != null) {
            appCompatSeekBar.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.ss.android.lark.mm.module.player.videotoolbar.e] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo164128b(boolean r3) {
        /*
            r2 = this;
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r2.f117547f
            if (r0 == 0) goto L_0x000a
            com.ss.android.lark.mm.module.player.videotoolbar.e r1 = new com.ss.android.lark.mm.module.player.videotoolbar.e
            r1.<init>(r0)
            r0 = r1
        L_0x000a:
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            com.ss.android.lark.mm.p2288b.C45859k.m181687b(r0)
            r0 = 2131303236(0x7f091b44, float:1.822458E38)
            if (r3 == 0) goto L_0x002e
            android.view.View r3 = r2.mo164129c(r0)
            androidx.appcompat.widget.AppCompatSeekBar r3 = (androidx.appcompat.widget.AppCompatSeekBar) r3
            if (r3 == 0) goto L_0x0046
            android.graphics.drawable.Drawable r3 = r3.getThumb()
            if (r3 == 0) goto L_0x0046
            android.graphics.drawable.Drawable r3 = r3.mutate()
            if (r3 == 0) goto L_0x0046
            r0 = 255(0xff, float:3.57E-43)
            r3.setAlpha(r0)
            goto L_0x0046
        L_0x002e:
            android.view.View r3 = r2.mo164129c(r0)
            androidx.appcompat.widget.AppCompatSeekBar r3 = (androidx.appcompat.widget.AppCompatSeekBar) r3
            if (r3 == 0) goto L_0x0046
            android.graphics.drawable.Drawable r3 = r3.getThumb()
            if (r3 == 0) goto L_0x0046
            android.graphics.drawable.Drawable r3 = r3.mutate()
            if (r3 == 0) goto L_0x0046
            r0 = 0
            r3.setAlpha(r0)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.player.videotoolbar.MmSimpleVideoToolbar.mo164128b(boolean):void");
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        AbstractC46597d b;
        Intrinsics.checkParameterIsNotNull(seekBar, "seekBar");
        this.f117543b = false;
        m184922c(false);
        AbstractC46732d dVar = this.f117544c;
        if (dVar != null) {
            dVar.mo164221a();
        }
        C46602i iVar = this.f117542a;
        if (!(iVar == null || (b = iVar.mo163686b()) == null)) {
            b.mo163703a((long) seekBar.getProgress());
        }
        C47083e.m186423a(getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("progress_bar_change").mo165423e("none").mo165414a("is_full_screen", false).mo165412a("rate_of_video_progress", Float.valueOf(((float) seekBar.getProgress()) / ((float) seekBar.getMax()))).mo165421c());
    }

    public final void setKeywordCircle(FindResponse findResponse) {
        List<FindTimeline> timeline;
        if (findResponse == null || (timeline = findResponse.getTimeline()) == null || !(!timeline.isEmpty())) {
            KeyWordCircle keyWordCircle = this.f117546e;
            if (keyWordCircle != null) {
                keyWordCircle.setVisibility(8);
            }
            KeyWordCircle keyWordCircle2 = this.f117546e;
            if (keyWordCircle2 != null) {
                keyWordCircle2.mo163938a();
            }
        } else {
            KeyWordCircle keyWordCircle3 = this.f117546e;
            if (keyWordCircle3 != null) {
                keyWordCircle3.setVisibility(0);
            }
            KeyWordCircle keyWordCircle4 = this.f117546e;
            if (keyWordCircle4 != null) {
                keyWordCircle4.mo163938a();
            }
            KeyWordCircle keyWordCircle5 = this.f117546e;
            if (keyWordCircle5 != null) {
                keyWordCircle5.setCirclePos(findResponse);
            }
        }
        KeyWordCircle keyWordCircle6 = this.f117546e;
        if (keyWordCircle6 != null) {
            keyWordCircle6.invalidate();
        }
    }

    /* renamed from: a */
    public final void mo164126a(C46602i iVar) {
        if (iVar != null) {
            this.f117542a = iVar;
            if (iVar != null) {
                iVar.mo163729a(new C46722b(this));
            }
            C46602i iVar2 = this.f117542a;
            if (iVar2 != null) {
                iVar2.mo163730a(this);
            }
        }
    }

    /* renamed from: a */
    public final void mo164124a(int i, int i2) {
        setDuration(Integer.valueOf(i2));
        setPosition(i);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.videotoolbar.MmSimpleVideoToolbar$c */
    public static final class View$OnTouchListenerC46723c implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ MmSimpleVideoToolbar f117550a;

        /* renamed from: b */
        final /* synthetic */ Ref.FloatRef f117551b;

        /* renamed from: c */
        final /* synthetic */ Ref.BooleanRef f117552c;

        /* renamed from: d */
        final /* synthetic */ Runnable f117553d;

        /* renamed from: e */
        final /* synthetic */ int f117554e;

        View$OnTouchListenerC46723c(MmSimpleVideoToolbar mmSimpleVideoToolbar, Ref.FloatRef floatRef, Ref.BooleanRef booleanRef, Runnable runnable, int i) {
            this.f117550a = mmSimpleVideoToolbar;
            this.f117551b = floatRef;
            this.f117552c = booleanRef;
            this.f117553d = runnable;
            this.f117554e = i;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f117551b.element = motionEvent.getX();
                this.f117552c.element = false;
                C45859k.m181686a(this.f117553d, (long) ViewConfiguration.getLongPressTimeout());
            } else if (action == 1) {
                C45859k.m181687b(this.f117553d);
                if (this.f117552c.element) {
                    this.f117550a.mo164125a(motionEvent);
                }
            } else if (action == 2) {
                float abs = Math.abs(motionEvent.getX() - this.f117551b.element);
                int i = this.f117554e;
                if (abs > ((float) (i * i))) {
                    C45859k.m181687b(this.f117553d);
                }
                if (this.f117552c.element) {
                    this.f117550a.mo164125a(motionEvent);
                }
            }
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmSimpleVideoToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f117547f = new C46725e(this);
        LayoutInflater.from(context).inflate(R.layout.mm_video_play_bar_layout, (ViewGroup) this, true);
        m184923o();
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C46602i iVar;
        C46602i iVar2;
        AbstractC46597d b;
        C46602i iVar3;
        AbstractC46598e a;
        AbstractC46598e a2;
        Intrinsics.checkParameterIsNotNull(seekBar, "seekBar");
        if (i < seekBar.getMax()) {
            View c = mo164129c(R.id.rightMockBar);
            if (c != null) {
                Context context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                c.setBackgroundColor(UDColorUtils.getColor(context, R.color.line_border_component));
            }
        } else {
            View c2 = mo164129c(R.id.rightMockBar);
            if (c2 != null) {
                Context context2 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                c2.setBackgroundColor(UDColorUtils.getColor(context2, R.color.primary_pri_500));
            }
        }
        AbstractC46732d dVar = this.f117544c;
        if (dVar != null) {
            dVar.mo164222a(i, z);
        }
        C46602i iVar4 = this.f117542a;
        boolean z2 = true;
        if ((iVar4 == null || (a2 = iVar4.mo163685a()) == null || a2.mo163714c()) && ((iVar3 = this.f117542a) == null || (a = iVar3.mo163685a()) == null || !a.mo163716e())) {
            z2 = false;
        }
        if (!(!z2 || (iVar2 = this.f117542a) == null || (b = iVar2.mo163686b()) == null)) {
            b.mo163702a(i);
        }
        if ((z2 || z) && (iVar = this.f117542a) != null) {
            iVar.mo163727a(i, seekBar.getMax());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MmSimpleVideoToolbar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
