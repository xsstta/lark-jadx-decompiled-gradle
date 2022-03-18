package com.ss.android.lark.mm.module.podcast.subtitle;

import android.graphics.Color;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.framework.IMmInquirer;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseViewControl;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.player.core.subtitle.MmSubtitleLine;
import com.ss.android.lark.mm.module.player.core.subtitle.MmSubtitles;
import com.ss.android.lark.mm.module.player.p2308a.C46587a;
import com.ss.android.lark.mm.module.podcast.subtitle.MmPodcastSubtitleAdapter;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.statistics.appreciable.MmAppreciablePodcastDetailTracker;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.C47114n;
import com.ss.android.lark.mm.utils.MmDateUtil;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\u00020\u0004B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\u0010\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u000bH\u0002J\b\u0010?\u001a\u00020\u000bH\u0002J\b\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u00020\u0002H\u0016J\b\u0010C\u001a\u00020=H\u0002J\b\u0010D\u001a\u00020=H\u0003J\b\u0010E\u001a\u00020=H\u0002J\u0018\u0010F\u001a\u00020=2\u0006\u0010G\u001a\u00020\u001f2\u0006\u0010H\u001a\u00020\u001cH\u0016J\b\u0010I\u001a\u00020=H\u0016J\b\u0010J\u001a\u00020=H\u0016J\b\u0010K\u001a\u00020=H\u0016J\b\u0010L\u001a\u00020=H\u0016J\b\u0010M\u001a\u00020=H\u0016J\b\u0010N\u001a\u00020=H\u0016J\b\u0010O\u001a\u00020=H\u0016J\u0010\u0010P\u001a\u00020=2\u0006\u0010Q\u001a\u00020\u000bH\u0002R\u000e\u0010\n\u001a\u00020\u000bXD¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\"8BX\u0002¢\u0006\f\n\u0004\b%\u0010\u0011\u001a\u0004\b#\u0010$R\u001b\u0010&\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b)\u0010\u0011\u001a\u0004\b'\u0010(R\u000e\u0010*\u001a\u00020+X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010,\u001a\n .*\u0004\u0018\u00010-0-X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010/\u001a\n .*\u0004\u0018\u00010000X\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001b\u00105\u001a\u0002068BX\u0002¢\u0006\f\n\u0004\b9\u0010\u0011\u001a\u0004\b7\u00108R\u000e\u0010:\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u000203X\u0004¢\u0006\u0002\n\u0000¨\u0006R"}, d2 = {"Lcom/ss/android/lark/mm/module/podcast/subtitle/MmPodcastSubtitleViewControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "Lcom/ss/android/lark/mm/module/podcast/subtitle/IMmPodcastSubtitleListener;", "Lcom/ss/android/lark/mm/module/podcast/subtitle/IMmPodcastSubtitleDependency;", "Lcom/ss/android/lark/mm/module/podcast/subtitle/IMmPodcastSubtitleInquirer;", "vcContext", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "controlAdapter", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "(Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;)V", "MAX_CLICK_DURATION", "", "adapter", "Lcom/ss/android/lark/mm/module/podcast/subtitle/MmPodcastSubtitleAdapter;", "getAdapter", "()Lcom/ss/android/lark/mm/module/podcast/subtitle/MmPodcastSubtitleAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "bH", "Landroid/os/Handler;", "handlerThread", "Landroid/os/HandlerThread;", "getHandlerThread", "()Landroid/os/HandlerThread;", "handlerThread$delegate", "highlightPositions", "Ljava/util/concurrent/CopyOnWriteArrayList;", "isAlreadySlideSubtitle", "", "isLossFocus", "lastPlayingTs", "", "lastSeekPosition", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLinearLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager$delegate", "mainHandler", "getMainHandler", "()Landroid/os/Handler;", "mainHandler$delegate", "objectLock", "", "podcastPointerTv", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "podcastRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "pointerBottom", "pointerLocation", "", "pointerTop", "simpleThrottleUtil", "Lcom/ss/android/lark/mm/utils/MmSimpleThrottleUtil;", "getSimpleThrottleUtil", "()Lcom/ss/android/lark/mm/utils/MmSimpleThrottleUtil;", "simpleThrottleUtil$delegate", "startClickTime", "viewHolderLocation", "clickItem", "", "position", "findHighlightItem", "getMmInquirer", "Lcom/ss/android/lark/mm/module/framework/IMmInquirer;", "getMmListener", "initPointerPosition", "initRecyclerView", "loadSubtitles", "notifyUpdatePlayPos", "timeStamp", "fromUser", "onCreate", "onDestroy", "onPlayNext", "onSeekManual", "onStartPlay", "onStopPlay", "onSwitchPodcastSucceed", "updateSeekItem", "currentPosition", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.g */
public final class MmPodcastSubtitleViewControl extends MmBaseViewControl<IMmPodcastSubtitleListener, IMmPodcastSubtitleDependency> implements IMmPodcastSubtitleInquirer, IMmPodcastSubtitleListener {

    /* renamed from: a */
    public long f117778a;

    /* renamed from: b */
    public final int f117779b = LocationRequest.PRIORITY_HD_ACCURACY;

    /* renamed from: c */
    public final RecyclerView f117780c;

    /* renamed from: d */
    public final TextView f117781d;

    /* renamed from: e */
    public final int[] f117782e;

    /* renamed from: f */
    public int f117783f;

    /* renamed from: g */
    public int f117784g;

    /* renamed from: h */
    public boolean f117785h;

    /* renamed from: i */
    public final CopyOnWriteArrayList<Integer> f117786i;

    /* renamed from: j */
    public boolean f117787j;

    /* renamed from: k */
    public long f117788k;

    /* renamed from: l */
    public final Object f117789l;

    /* renamed from: m */
    public final IMmViewControlContext f117790m;

    /* renamed from: n */
    private final Lazy f117791n;

    /* renamed from: o */
    private final Lazy f117792o;

    /* renamed from: p */
    private final int[] f117793p;

    /* renamed from: q */
    private int f117794q;

    /* renamed from: r */
    private final Lazy f117795r;

    /* renamed from: s */
    private Handler f117796s;

    /* renamed from: t */
    private final Lazy f117797t;

    /* renamed from: u */
    private final Lazy f117798u;

    /* renamed from: v */
    private final MmBaseViewControlAdapter<IMmPodcastSubtitleListener, IMmPodcastSubtitleDependency> f117799v;

    /* renamed from: o */
    private final HandlerThread m185457o() {
        return (HandlerThread) this.f117797t.getValue();
    }

    @Override // com.ss.android.lark.mm.module.podcast.subtitle.IMmPodcastSubtitleListener
    /* renamed from: a */
    public void mo164403a() {
    }

    @Override // com.ss.android.lark.mm.module.podcast.subtitle.IMmPodcastSubtitleListener
    /* renamed from: b */
    public void mo164405b() {
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: e */
    public IMmInquirer mo161244e() {
        return this;
    }

    @Override // com.ss.android.lark.mm.module.podcast.subtitle.IMmPodcastSubtitleListener
    /* renamed from: f */
    public void mo164406f() {
    }

    /* renamed from: i */
    public final LinearLayoutManager mo164435i() {
        return (LinearLayoutManager) this.f117791n.getValue();
    }

    /* renamed from: j */
    public final MmPodcastSubtitleAdapter mo164436j() {
        return (MmPodcastSubtitleAdapter) this.f117792o.getValue();
    }

    /* renamed from: k */
    public final Handler mo164437k() {
        return (Handler) this.f117795r.getValue();
    }

    /* renamed from: l */
    public final C47114n mo164438l() {
        return (C47114n) this.f117798u.getValue();
    }

    /* renamed from: n */
    public IMmPodcastSubtitleListener mo161243c() {
        return this;
    }

    @Override // com.ss.android.lark.mm.module.podcast.subtitle.IMmPodcastSubtitleListener
    /* renamed from: g */
    public void mo164407g() {
        m185460r();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/module/podcast/subtitle/MmPodcastSubtitleAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.g$a */
    static final class C46794a extends Lambda implements Function0<MmPodcastSubtitleAdapter> {
        public static final C46794a INSTANCE = new C46794a();

        C46794a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MmPodcastSubtitleAdapter invoke() {
            return new MmPodcastSubtitleAdapter();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/HandlerThread;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.g$c */
    static final class C46796c extends Lambda implements Function0<HandlerThread> {
        public static final C46796c INSTANCE = new C46796c();

        C46796c() {
            super(0);
        }

        public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
            return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
        }

        @Override // kotlin.jvm.functions.Function0
        public final HandlerThread invoke() {
            return new_android_os_HandlerThread_by_knot("mm-podcast");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/utils/MmSimpleThrottleUtil;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.g$l */
    static final class C46808l extends Lambda implements Function0<C47114n> {
        public static final C46808l INSTANCE = new C46808l();

        C46808l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C47114n invoke() {
            return new C47114n(LocationRequest.PRIORITY_HD_ACCURACY);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/LinearLayoutManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.g$g */
    static final class C46801g extends Lambda implements Function0<LinearLayoutManager> {
        final /* synthetic */ MmPodcastSubtitleViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46801g(MmPodcastSubtitleViewControl gVar) {
            super(0);
            this.this$0 = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LinearLayoutManager invoke() {
            return new LinearLayoutManager(this.this$0.f117790m.mo161232n());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.g$i */
    static final class C46803i extends Lambda implements Function0<Handler> {
        public static final C46803i INSTANCE = new C46803i();

        C46803i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: p */
    private final void m185458p() {
        this.f117781d.post(new RunnableC46797d(this));
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: h */
    public void mo161245h() {
        super.mo161245h();
        m185457o().quitSafely();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.g$j */
    public static final class RunnableC46804j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmPodcastSubtitleViewControl f117806a;

        RunnableC46804j(MmPodcastSubtitleViewControl gVar) {
            this.f117806a = gVar;
        }

        public final void run() {
            C45855f.m181664c("MmPodcastSubtitleViewControl", "recovery auto focus");
            this.f117806a.f117785h = false;
            this.f117806a.mo164437k().removeCallbacksAndMessages(null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.g$d */
    public static final class RunnableC46797d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmPodcastSubtitleViewControl f117802a;

        RunnableC46797d(MmPodcastSubtitleViewControl gVar) {
            this.f117802a = gVar;
        }

        public final void run() {
            this.f117802a.f117781d.getLocationOnScreen(this.f117802a.f117782e);
            MmPodcastSubtitleViewControl gVar = this.f117802a;
            gVar.f117783f = gVar.f117782e[1];
            MmPodcastSubtitleViewControl gVar2 = this.f117802a;
            int i = gVar2.f117783f;
            TextView textView = this.f117802a.f117781d;
            Intrinsics.checkExpressionValueIsNotNull(textView, "podcastPointerTv");
            gVar2.f117784g = i + textView.getMeasuredHeight();
        }
    }

    /* renamed from: r */
    private final void m185460r() {
        TextView textView = this.f117781d;
        Intrinsics.checkExpressionValueIsNotNull(textView, "podcastPointerTv");
        textView.setVisibility(8);
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = 1;
        ((IMmPodcastSubtitleDependency) mo161247w()).mo164397a(new C46802h(this, longRef));
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    public void be_() {
        super.be_();
        m185457o().start();
        this.f117796s = new Handler(m185457o().getLooper());
        m185459q();
        m185458p();
        m185460r();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/mm/module/podcast/subtitle/MmPodcastSubtitleViewControl$initRecyclerView$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.g$e */
    public static final class C46798e extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ MmPodcastSubtitleViewControl f117803a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.g$e$a */
        static final class RunnableC46799a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C46798e f117804a;

            RunnableC46799a(C46798e eVar) {
                this.f117804a = eVar;
            }

            public final void run() {
                int m = this.f117804a.f117803a.mo164439m();
                if (m != -1) {
                    C45855f.m181663b("MmPodcastSubtitleViewControl", "findHighlightItem position: " + m);
                    TextView textView = this.f117804a.f117803a.f117781d;
                    Intrinsics.checkExpressionValueIsNotNull(textView, "podcastPointerTv");
                    textView.setVisibility(0);
                    MmSubtitles b = ((IMmPodcastSubtitleDependency) this.f117804a.f117803a.mo161247w()).mo164399b();
                    if (b != null) {
                        if (b.subtitles != null && !b.subtitles.isEmpty() && b.subtitles.size() > m) {
                            TextView textView2 = this.f117804a.f117803a.f117781d;
                            Intrinsics.checkExpressionValueIsNotNull(textView2, "podcastPointerTv");
                            textView2.setText(MmDateUtil.m186536a(((int) b.subtitles.get(m).start_ms) / 1000));
                        } else {
                            return;
                        }
                    }
                    this.f117804a.f117803a.mo164434b(m);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46798e(MmPodcastSubtitleViewControl gVar) {
            this.f117803a = gVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            if (this.f117803a.f117785h) {
                this.f117803a.mo164438l().mo165502a(new RunnableC46799a(this));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.g$k */
    public static final class RunnableC46805k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmPodcastSubtitleViewControl f117807a;

        /* renamed from: b */
        final /* synthetic */ long f117808b;

        /* renamed from: c */
        final /* synthetic */ boolean f117809c;

        RunnableC46805k(MmPodcastSubtitleViewControl gVar, long j, boolean z) {
            this.f117807a = gVar;
            this.f117808b = j;
            this.f117809c = z;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/mm/module/podcast/subtitle/MmPodcastSubtitleViewControl$notifyUpdatePlayPos$2$1$1$1", "com/ss/android/lark/mm/module/podcast/subtitle/MmPodcastSubtitleViewControl$notifyUpdatePlayPos$2$$special$$inlined$let$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.g$k$a */
        static final class RunnableC46806a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ RunnableC46805k f117810a;

            RunnableC46806a(RunnableC46805k kVar) {
                this.f117810a = kVar;
            }

            public final void run() {
                synchronized (this.f117810a.f117807a.f117789l) {
                    if ((!this.f117810a.f117807a.f117785h || this.f117810a.f117809c) && (!this.f117810a.f117807a.mo164436j().mo164417a().isEmpty())) {
                        C45855f.m181663b("MmPodcastSubtitleViewControl", "main thread running 1");
                        TextView textView = this.f117810a.f117807a.f117781d;
                        Intrinsics.checkExpressionValueIsNotNull(textView, "podcastPointerTv");
                        textView.setVisibility(8);
                        this.f117810a.f117807a.mo164434b(-1);
                        this.f117810a.f117807a.mo164435i().scrollToPositionWithOffset(this.f117810a.f117807a.mo164436j().mo164417a().get(0).intValue(), 0);
                    } else {
                        C45855f.m181663b("MmPodcastSubtitleViewControl", "main thread running 2");
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
        }

        public final void run() {
            synchronized (this.f117807a.f117789l) {
                MmSubtitles b = ((IMmPodcastSubtitleDependency) this.f117807a.mo161247w()).mo164399b();
                if (b != null) {
                    C45855f.m181663b("MmPodcastSubtitleViewControl", "child thread running");
                    List<MmSubtitleLine> findLinesForPodcast = b.findLinesForPodcast(this.f117808b);
                    if (findLinesForPodcast != null) {
                        if (!findLinesForPodcast.isEmpty()) {
                            this.f117807a.f117786i.clear();
                            for (MmSubtitleLine mmSubtitleLine : findLinesForPodcast) {
                                int indexOf = b.subtitles.indexOf(mmSubtitleLine);
                                if (indexOf != -1) {
                                    this.f117807a.f117786i.add(Integer.valueOf(indexOf));
                                }
                            }
                            C45859k.m181685a(new RunnableC46807b(this));
                        }
                    }
                    C45859k.m181685a(new RunnableC46806a(this));
                    C45855f.m181663b("MmPodcastSubtitleViewControl", "highlightLines is null");
                }
                this.f117807a.f117788k = this.f117808b;
                Unit unit = Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/mm/module/podcast/subtitle/MmPodcastSubtitleViewControl$notifyUpdatePlayPos$2$1$1$2", "com/ss/android/lark/mm/module/podcast/subtitle/MmPodcastSubtitleViewControl$notifyUpdatePlayPos$2$$special$$inlined$let$lambda$2"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.g$k$b */
        static final class RunnableC46807b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ RunnableC46805k f117811a;

            RunnableC46807b(RunnableC46805k kVar) {
                this.f117811a = kVar;
            }

            public final void run() {
                synchronized (this.f117811a.f117807a.f117789l) {
                    C45855f.m181663b("MmPodcastSubtitleViewControl", "main thread running 3");
                    boolean z = true;
                    if (!this.f117811a.f117807a.f117786i.isEmpty()) {
                        Integer num = this.f117811a.f117807a.f117786i.get(0);
                        this.f117811a.f117807a.mo164436j().mo164421b(this.f117811a.f117807a.f117786i);
                        if (!this.f117811a.f117807a.f117785h || this.f117811a.f117809c) {
                            C45855f.m181663b("MmPodcastSubtitleViewControl", "isLossFocus:" + this.f117811a.f117807a.f117785h);
                            TextView textView = this.f117811a.f117807a.f117781d;
                            Intrinsics.checkExpressionValueIsNotNull(textView, "podcastPointerTv");
                            textView.setVisibility(8);
                            this.f117811a.f117807a.mo164434b(-1);
                            if (Math.abs(num.intValue() - this.f117811a.f117807a.mo164435i().findFirstVisibleItemPosition()) < 2) {
                                z = false;
                            }
                            if (!this.f117811a.f117809c) {
                                if (!z) {
                                    MmRvSmoothScroller iVar = new MmRvSmoothScroller(this.f117811a.f117807a.f117790m.mo161232n());
                                    Intrinsics.checkExpressionValueIsNotNull(num, "currentPosition");
                                    iVar.setTargetPosition(num.intValue());
                                    this.f117811a.f117807a.mo164435i().startSmoothScroll(iVar);
                                }
                            }
                            LinearLayoutManager i = this.f117811a.f117807a.mo164435i();
                            Intrinsics.checkExpressionValueIsNotNull(num, "currentPosition");
                            i.scrollToPositionWithOffset(num.intValue(), 0);
                        }
                    } else if ((!this.f117811a.f117807a.f117785h || this.f117811a.f117809c) && (!this.f117811a.f117807a.mo164436j().mo164417a().isEmpty())) {
                        TextView textView2 = this.f117811a.f117807a.f117781d;
                        Intrinsics.checkExpressionValueIsNotNull(textView2, "podcastPointerTv");
                        textView2.setVisibility(8);
                        this.f117811a.f117807a.mo164434b(-1);
                        this.f117811a.f117807a.mo164435i().scrollToPositionWithOffset(this.f117811a.f117807a.mo164436j().mo164417a().get(0).intValue(), 0);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.g$b */
    public static final class RunnableC46795b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmPodcastSubtitleViewControl f117800a;

        /* renamed from: b */
        final /* synthetic */ int f117801b;

        RunnableC46795b(MmPodcastSubtitleViewControl gVar, int i) {
            this.f117800a = gVar;
            this.f117801b = i;
        }

        public final void run() {
            List<MmSubtitleLine> list;
            MmSubtitleLine mmSubtitleLine;
            int i = this.f117801b;
            if (i != -1 && i < this.f117800a.mo164436j().getItemCount()) {
                this.f117800a.mo164436j().mo164422c();
                this.f117800a.f117785h = false;
                MmSubtitles b = ((IMmPodcastSubtitleDependency) this.f117800a.mo161247w()).mo164399b();
                if (b != null && (list = b.subtitles) != null && (mmSubtitleLine = list.get(this.f117801b)) != null) {
                    long j = mmSubtitleLine.start_ms;
                    C45855f.m181664c("MmPodcastSubtitleViewControl", "clickItem timestamp: " + j);
                    ((IMmPodcastSubtitleDependency) this.f117800a.mo161247w()).mo164396a(j);
                }
            }
        }
    }

    /* renamed from: q */
    private final void m185459q() {
        RecyclerView recyclerView = this.f117780c;
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "podcastRecyclerView");
        recyclerView.setItemAnimator(null);
        RecyclerView recyclerView2 = this.f117780c;
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "podcastRecyclerView");
        recyclerView2.setAdapter(mo164436j());
        RecyclerView recyclerView3 = this.f117780c;
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "podcastRecyclerView");
        recyclerView3.setLayoutManager(mo164435i());
        this.f117780c.addOnScrollListener(new C46798e(this));
        this.f117780c.setOnTouchListener(new View$OnTouchListenerC46800f(this));
    }

    /* renamed from: m */
    public final int mo164439m() {
        int findFirstVisibleItemPosition = mo164435i().findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = mo164435i().findLastVisibleItemPosition();
        if (findFirstVisibleItemPosition > findLastVisibleItemPosition) {
            return -1;
        }
        while (true) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.f117780c.findViewHolderForAdapterPosition(findFirstVisibleItemPosition);
            if (findViewHolderForAdapterPosition != null) {
                findViewHolderForAdapterPosition.itemView.getLocationOnScreen(this.f117793p);
                int i = this.f117793p[1];
                View view = findViewHolderForAdapterPosition.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "viewHolder.itemView");
                int measuredHeight = view.getMeasuredHeight() + i;
                if (i <= this.f117783f && measuredHeight >= this.f117784g) {
                    return findFirstVisibleItemPosition;
                }
            }
            if (findFirstVisibleItemPosition == findLastVisibleItemPosition) {
                return -1;
            }
            findFirstVisibleItemPosition++;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/player/core/subtitle/MmSubtitles;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.g$h */
    public static final class C46802h extends Lambda implements Function1<MmSubtitles, Unit> {
        final /* synthetic */ Ref.LongRef $startPos;
        final /* synthetic */ MmPodcastSubtitleViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46802h(MmPodcastSubtitleViewControl gVar, Ref.LongRef longRef) {
            super(1);
            this.this$0 = gVar;
            this.$startPos = longRef;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MmSubtitles mmSubtitles) {
            invoke(mmSubtitles);
            return Unit.INSTANCE;
        }

        public final void invoke(MmSubtitles mmSubtitles) {
            Intrinsics.checkParameterIsNotNull(mmSubtitles, "it");
            MmBaseInfo a = ((IMmPodcastSubtitleDependency) this.this$0.mo161247w()).mo161229a();
            if (a != null) {
                if (!((IMmPodcastSubtitleDependency) this.this$0.mo161247w()).mo164401d()) {
                    this.$startPos.element = RangesKt.coerceAtLeast((long) C46587a.m184214a(a.getObjectToken()), 1L);
                    if (this.$startPos.element >= a.getDuration()) {
                        this.$startPos.element = 1;
                    }
                    ((IMmPodcastSubtitleDependency) this.this$0.mo161247w()).mo164396a(this.$startPos.element);
                }
                ((IMmPodcastSubtitleDependency) this.this$0.mo161247w()).mo164402e();
                if (mmSubtitles.isEmpty()) {
                    RecyclerView recyclerView = this.this$0.f117780c;
                    Intrinsics.checkExpressionValueIsNotNull(recyclerView, "podcastRecyclerView");
                    recyclerView.setVisibility(8);
                    ((IMmPodcastSubtitleDependency) this.this$0.mo161247w()).mo164398a(true);
                } else {
                    RecyclerView recyclerView2 = this.this$0.f117780c;
                    Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "podcastRecyclerView");
                    recyclerView2.setVisibility(0);
                    ((IMmPodcastSubtitleDependency) this.this$0.mo161247w()).mo164398a(false);
                    MmPodcastSubtitleAdapter j = this.this$0.mo164436j();
                    List<MmSubtitleLine> list = mmSubtitles.subtitles;
                    Intrinsics.checkExpressionValueIsNotNull(list, "it.subtitles");
                    j.mo164419a(list);
                    this.this$0.mo164404a(this.$startPos.element, true);
                }
                MmAppreciablePodcastDetailTracker.f118531a.mo165395e();
                MmAppreciablePodcastDetailTracker.m186401f();
                ((IMmPodcastSubtitleDependency) this.this$0.mo161247w()).mo164400c();
            }
        }
    }

    /* renamed from: b */
    public final void mo164434b(int i) {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.f117780c.findViewHolderForAdapterPosition(i);
        int i2 = this.f117794q;
        if (i2 != -1) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = this.f117780c.findViewHolderForAdapterPosition(i2);
            if (findViewHolderForAdapterPosition2 instanceof MmPodcastSubtitleAdapter.MmPodcastViewHolder) {
                ((MmPodcastSubtitleAdapter.MmPodcastViewHolder) findViewHolderForAdapterPosition2).mo164423a().setTextColor(Color.parseColor("#59FFFFFF"));
            }
        }
        if (findViewHolderForAdapterPosition instanceof MmPodcastSubtitleAdapter.MmPodcastViewHolder) {
            ((MmPodcastSubtitleAdapter.MmPodcastViewHolder) findViewHolderForAdapterPosition).mo164423a().setTextColor(-1);
        }
        this.f117794q = i;
    }

    /* renamed from: a */
    public final void mo164433a(int i) {
        C47083e.m186425a(this.f117790m.mo161231e(), "vc_mm_podcast_page", C47086i.m186432a().mo165409a("click_subtitles").mo165421c());
        C47083e.m186425a(this.f117790m.mo161231e(), "vc_minutes_podcast_click", C47086i.m186432a().mo165422d("click_subtitles").mo165423e("none").mo165421c());
        mo164437k().postDelayed(new RunnableC46795b(this, i), 300);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.g$f */
    public static final class View$OnTouchListenerC46800f implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ MmPodcastSubtitleViewControl f117805a;

        View$OnTouchListenerC46800f(MmPodcastSubtitleViewControl gVar) {
            this.f117805a = gVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            View findChildViewUnder;
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f117805a.f117778a = System.currentTimeMillis();
            } else if (action == 1) {
                this.f117805a.f117787j = false;
                if (System.currentTimeMillis() - this.f117805a.f117778a < ((long) this.f117805a.f117779b)) {
                    RecyclerView recyclerView = this.f117805a.f117780c;
                    Intrinsics.checkExpressionValueIsNotNull(recyclerView, "podcastRecyclerView");
                    if (recyclerView.getScrollState() == 0 && (findChildViewUnder = this.f117805a.f117780c.findChildViewUnder(motionEvent.getX(), motionEvent.getY())) != null) {
                        int childAdapterPosition = this.f117805a.f117780c.getChildAdapterPosition(findChildViewUnder);
                        C45855f.m181663b("MmPodcastSubtitleViewControl", "ACTION_UP, adapterPosition:" + childAdapterPosition);
                        this.f117805a.mo164436j().mo164418a(childAdapterPosition);
                        this.f117805a.mo164433a(childAdapterPosition);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            } else if (action == 2) {
                if (!this.f117805a.f117787j) {
                    this.f117805a.f117787j = true;
                    C47083e.m186425a(this.f117805a.f117790m.mo161231e(), "vc_mm_podcast_page", C47086i.m186432a().mo165409a("slide_subtitles").mo165421c());
                    C47083e.m186425a(this.f117805a.f117790m.mo161231e(), "vc_minutes_podcast_click", C47086i.m186432a().mo165422d("slide_subtitles").mo165423e("none").mo165421c());
                }
                this.f117805a.f117785h = true;
                this.f117805a.mo164437k().removeCallbacksAndMessages(null);
            }
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmPodcastSubtitleViewControl(IMmViewControlContext gVar, MmBaseViewControlAdapter<IMmPodcastSubtitleListener, IMmPodcastSubtitleDependency> jVar) {
        super(gVar, jVar);
        Intrinsics.checkParameterIsNotNull(gVar, "vcContext");
        Intrinsics.checkParameterIsNotNull(jVar, "controlAdapter");
        this.f117790m = gVar;
        this.f117799v = jVar;
        this.f117780c = (RecyclerView) gVar.mo161233o().findViewById(R.id.podcastRecyclerView);
        this.f117781d = (TextView) gVar.mo161233o().findViewById(R.id.podcastPointerTv);
        this.f117791n = LazyKt.lazy(new C46801g(this));
        this.f117792o = LazyKt.lazy(C46794a.INSTANCE);
        this.f117793p = new int[2];
        this.f117782e = new int[2];
        this.f117783f = -1;
        this.f117784g = -1;
        this.f117794q = -1;
        this.f117786i = new CopyOnWriteArrayList<>();
        this.f117795r = LazyKt.lazy(C46803i.INSTANCE);
        this.f117797t = LazyKt.lazy(C46796c.INSTANCE);
        this.f117789l = new Object();
        this.f117798u = LazyKt.lazy(C46808l.INSTANCE);
    }

    @Override // com.ss.android.lark.mm.module.podcast.subtitle.IMmPodcastSubtitleListener
    /* renamed from: a */
    public void mo164404a(long j, boolean z) {
        long j2 = this.f117788k;
        if (j2 <= j || j2 - j > ((long) LocationRequest.PRIORITY_INDOOR)) {
            RecyclerView recyclerView = this.f117780c;
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "podcastRecyclerView");
            if (recyclerView.getScrollState() == 2) {
                C45855f.m181664c("MmPodcastSubtitleViewControl", "ignore when scrolling");
                return;
            }
            if (this.f117785h) {
                RecyclerView recyclerView2 = this.f117780c;
                Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "podcastRecyclerView");
                if (recyclerView2.getScrollState() == 0) {
                    mo164437k().postDelayed(new RunnableC46804j(this), 3000);
                }
            }
            C45855f.m181663b("MmPodcastSubtitleViewControl", "conPlaying... " + j);
            Handler handler = this.f117796s;
            if (handler != null) {
                handler.post(new RunnableC46805k(this, j, z));
                return;
            }
            return;
        }
        C45855f.m181664c("MmPodcastSubtitleViewControl", "The fallback interval is too small ignore");
    }
}
