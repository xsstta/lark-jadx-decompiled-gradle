package com.ss.android.lark.mm.module.podcast.initial;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.common.utility.NetworkUtils;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mm.module.detail.MmDetailActivity;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.ObjectStatus;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmPlaySettingInfo;
import com.ss.android.lark.mm.module.framework.IMmInquirer;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseViewControl;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.player.core.subtitle.MmSubtitles;
import com.ss.android.lark.mm.module.podcast.flowbg.renderer.ShaderSurfaceView;
import com.ss.android.lark.mm.p2288b.C45852d;
import com.ss.android.lark.mm.p2288b.C45853e;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.statistics.appreciable.MmAppreciablePodcastDetailTracker;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.MmNavigationBarUtils;
import com.ss.android.lark.mm.utils.MmRxThrowable;
import com.ss.android.lark.mm.utils.ktextensions.C47107a;
import com.ss.android.lark.mm.utils.ktextensions.C47108b;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\u00020\u0004B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\b\u0010(\u001a\u00020\u0018H\u0002J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u0002H\u0016J,\u0010,\u001a\u00020\u00182\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010/J\u0010\u00100\u001a\u00020\u00182\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020\u0018H\u0002J\b\u00104\u001a\u00020\u0018H\u0017J\b\u00105\u001a\u00020\u0018H\u0016J\b\u00106\u001a\u00020\u0018H\u0016J\b\u00107\u001a\u00020\u0018H\u0016J\b\u00108\u001a\u00020\u0018H\u0016J\b\u00109\u001a\u00020\u0018H\u0016J\b\u0010:\u001a\u00020\u0018H\u0016J\b\u0010;\u001a\u00020\u0018H\u0016J\b\u0010<\u001a\u00020\u0018H\u0016J\b\u0010=\u001a\u00020\u0018H\u0002J\b\u0010>\u001a\u00020\u0018H\u0002J\b\u0010?\u001a\u00020\u0018H\u0002J\b\u0010@\u001a\u00020\u0018H\u0002J\u0010\u0010A\u001a\u00020\u00182\u0006\u0010B\u001a\u00020CH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0011*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R(\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u0016\u0010 \u001a\n \u0011*\u0004\u0018\u00010!0!X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lcom/ss/android/lark/mm/module/podcast/initial/MmPodcastInitialViewControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "Lcom/ss/android/lark/mm/module/podcast/initial/IMmPodcastInitialListener;", "Lcom/ss/android/lark/mm/module/podcast/initial/IMmPodcastInitialDependency;", "Lcom/ss/android/lark/mm/module/podcast/initial/IMmPodcastInitialInquirer;", "vcContext", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "controlAdapter", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "(Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;)V", "autoRetryTimes", "", "bgContainer", "Landroid/widget/FrameLayout;", "exitPodcastView", "Landroid/view/View;", "loadingLayout", "kotlin.jvm.PlatformType", "noContentPlaceholder", "Landroid/widget/TextView;", "noPlayableMinutesPlaceholder", "onRetrySuccess", "Lkotlin/Function1;", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "", "getOnRetrySuccess", "()Lkotlin/jvm/functions/Function1;", "setOnRetrySuccess", "(Lkotlin/jvm/functions/Function1;)V", "onSwitchSuccess", "getOnSwitchSuccess", "setOnSwitchSuccess", "podcastLottie", "Lcom/larksuite/component/ui/imageview/LKUILottieAnimationView;", "podcastRecyclerView", "retryBtn", "retryLayout", "shaderSurfaceView", "Lcom/ss/android/lark/mm/module/podcast/flowbg/renderer/ShaderSurfaceView;", "toolbar", "dismissLoading", "getMmInquirer", "Lcom/ss/android/lark/mm/module/framework/IMmInquirer;", "getMmListener", "initBaseInfo", "onSuccess", "onError", "Lkotlin/Function0;", "initShaderView", "bg", "Landroid/graphics/Bitmap;", "loadPodcastBg", "onBeginSwitchPodcast", "onCreate", "onDestroy", "onDismissLoading", "onPause", "onResume", "onShowNoPlayablePage", "onShowRetryPage", "onSwitchPodcastSucceed", "removeShaderView", "retry", "showLoading", "showRetry", "updateNoContentPlaceHolderVisibility", "show", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.podcast.a.e */
public final class MmPodcastInitialViewControl extends MmBaseViewControl<IMmPodcastInitialListener, IMmPodcastInitialDependency> implements IMmPodcastInitialInquirer, IMmPodcastInitialListener {

    /* renamed from: a */
    public int f117667a = 3;

    /* renamed from: b */
    public final IMmViewControlContext f117668b;

    /* renamed from: c */
    private Function1<? super MmBaseInfo, Unit> f117669c;

    /* renamed from: d */
    private Function1<? super MmBaseInfo, Unit> f117670d;

    /* renamed from: e */
    private final View f117671e;

    /* renamed from: f */
    private final LKUILottieAnimationView f117672f;

    /* renamed from: g */
    private final View f117673g;

    /* renamed from: h */
    private final FrameLayout f117674h;

    /* renamed from: i */
    private final TextView f117675i;

    /* renamed from: j */
    private final TextView f117676j;

    /* renamed from: k */
    private final View f117677k;

    /* renamed from: l */
    private final View f117678l;

    /* renamed from: m */
    private final View f117679m;

    /* renamed from: n */
    private final View f117680n;

    /* renamed from: o */
    private ShaderSurfaceView f117681o;

    /* renamed from: p */
    private final MmBaseViewControlAdapter<IMmPodcastInitialListener, IMmPodcastInitialDependency> f117682p;

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: e */
    public IMmInquirer mo161244e() {
        return this;
    }

    /* renamed from: n */
    public IMmPodcastInitialListener mo161243c() {
        return this;
    }

    @Override // com.ss.android.lark.mm.module.podcast.initial.IMmPodcastInitialListener
    /* renamed from: b */
    public void mo164319b() {
        mo164341l();
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo, kotlin.Unit>, kotlin.jvm.functions.Function1<com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo, kotlin.Unit> */
    /* renamed from: j */
    public final Function1<MmBaseInfo, Unit> mo164339j() {
        return this.f117669c;
    }

    @Override // com.ss.android.lark.mm.module.podcast.initial.IMmPodcastInitialListener
    /* renamed from: a */
    public void mo164317a() {
        m185255o();
        m185257q();
    }

    @Override // com.ss.android.lark.mm.module.podcast.initial.IMmPodcastInitialListener
    /* renamed from: g */
    public void mo164321g() {
        mo164341l();
        mo164342m();
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: h */
    public void mo161245h() {
        super.mo161245h();
        m185257q();
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: A */
    public void mo161241A() {
        super.mo161241A();
        ShaderSurfaceView shaderSurfaceView = this.f117681o;
        if (shaderSurfaceView != null) {
            shaderSurfaceView.onResume();
        }
    }

    @Override // com.ss.android.lark.mm.module.podcast.initial.IMmPodcastInitialListener
    /* renamed from: i */
    public void mo164322i() {
        mo164341l();
        this.f117676j.setVisibility(0);
        this.f117678l.setVisibility(0);
    }

    /* renamed from: k */
    public final void mo164340k() {
        m185254a(this, new C46771g(this), null, 2, null);
        m185256p();
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: y */
    public void mo161249y() {
        super.mo161249y();
        ShaderSurfaceView shaderSurfaceView = this.f117681o;
        if (shaderSurfaceView != null) {
            shaderSurfaceView.onPause();
        }
    }

    /* renamed from: p */
    private final void m185256p() {
        if (this.f117681o == null) {
            ((IMmPodcastInitialDependency) mo161247w()).mo164307a(new C46767d(this));
        }
    }

    /* renamed from: q */
    private final void m185257q() {
        ShaderSurfaceView shaderSurfaceView = this.f117681o;
        if (shaderSurfaceView != null) {
            shaderSurfaceView.onPause();
        }
        ShaderSurfaceView shaderSurfaceView2 = this.f117681o;
        if (shaderSurfaceView2 != null) {
            shaderSurfaceView2.setVisibility(8);
        }
        this.f117674h.removeView(this.f117681o);
        this.f117681o = null;
    }

    @Override // com.ss.android.lark.mm.module.podcast.initial.IMmPodcastInitialListener
    /* renamed from: f */
    public void mo164320f() {
        Function1<? super MmBaseInfo, Unit> function1;
        MmBaseInfo a = ((IMmPodcastInitialDependency) mo161247w()).mo161229a();
        if (!(a == null || (function1 = this.f117670d) == null)) {
            function1.invoke(a);
        }
        m185256p();
    }

    /* renamed from: l */
    public final void mo164341l() {
        this.f117672f.pauseAnimation();
        View view = this.f117671e;
        Intrinsics.checkExpressionValueIsNotNull(view, "loadingLayout");
        view.setVisibility(8);
        if (((IMmPodcastInitialDependency) mo161247w()).mo161229a() != null) {
            this.f117673g.setVisibility(0);
        } else {
            this.f117673g.setVisibility(8);
        }
        LKUILottieAnimationView lKUILottieAnimationView = this.f117672f;
        Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView, "podcastLottie");
        lKUILottieAnimationView.setVisibility(8);
        this.f117678l.setVisibility(8);
    }

    /* renamed from: m */
    public final void mo164342m() {
        this.f117679m.setVisibility(0);
        this.f117672f.pauseAnimation();
        this.f117673g.setVisibility(8);
        this.f117678l.setVisibility(0);
        View view = this.f117671e;
        Intrinsics.checkExpressionValueIsNotNull(view, "loadingLayout");
        view.setVisibility(8);
    }

    /* renamed from: o */
    private final void m185255o() {
        View view = this.f117671e;
        Intrinsics.checkExpressionValueIsNotNull(view, "loadingLayout");
        view.setVisibility(0);
        LKUILottieAnimationView lKUILottieAnimationView = this.f117672f;
        Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView, "podcastLottie");
        lKUILottieAnimationView.setVisibility(0);
        this.f117672f.setAnimation("mm_pod_cast_loading.json");
        LKUILottieAnimationView lKUILottieAnimationView2 = this.f117672f;
        Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView2, "podcastLottie");
        lKUILottieAnimationView2.setRepeatCount(-1);
        this.f117672f.playAnimation();
        this.f117678l.setVisibility(0);
        this.f117679m.setVisibility(8);
        this.f117673g.setVisibility(8);
        this.f117675i.setVisibility(8);
        this.f117677k.setVisibility(8);
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    public void be_() {
        super.be_();
        C47110e.m186573a(this.f117678l, new C46769e(this));
        ViewGroup.LayoutParams layoutParams = this.f117678l.getLayoutParams();
        if (layoutParams != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += MmNavigationBarUtils.f118632a.mo165490a(this.f117668b.mo161232n());
            C47110e.m186573a(this.f117680n, new C46770f(this));
            m185256p();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: a */
    public final void mo164336a(Function1<? super MmBaseInfo, Unit> function1) {
        this.f117669c = function1;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.a.e$d */
    public static final class C46767d extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ MmPodcastInitialViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46767d(MmPodcastInitialViewControl eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            C45853e.m181656a(this.this$0.f117668b.mo161232n(), str, C57582a.m223600a(96), C57582a.m223600a(96), new C45853e.AbstractC45854a(this) {
                /* class com.ss.android.lark.mm.module.podcast.initial.MmPodcastInitialViewControl.C46767d.C467681 */

                /* renamed from: a */
                final /* synthetic */ C46767d f117689a;

                {
                    this.f117689a = r1;
                }

                @Override // com.ss.android.lark.mm.p2288b.C45853e.AbstractC45854a
                /* renamed from: a */
                public final void mo161154a(Bitmap bitmap) {
                    MmPodcastInitialViewControl eVar = this.f117689a.this$0;
                    Intrinsics.checkExpressionValueIsNotNull(bitmap, "bitmap");
                    eVar.mo164335a(bitmap);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.a.e$e */
    public static final class C46769e extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmPodcastInitialViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46769e(MmPodcastInitialViewControl eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            C45855f.m181664c("MmPodcastInitialViewControl", "exit podcast");
            C47083e.m186425a(this.this$0.f117668b.mo161231e(), "vc_mm_recording_page", C47086i.m186432a().mo165409a("podcast_exit").mo165421c());
            C45852d a = C45852d.m181651a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmControl.of()");
            a.mo161151b().mo164279i();
            MmDetailActivity.Companion.m182008a(MmDetailActivity.f115761d, this.this$0.f117668b.mo161232n(), ((IMmPodcastInitialDependency) this.this$0.mo161247w()).mo164313g(), 18, ((IMmPodcastInitialDependency) this.this$0.mo161247w()).mo164314h(), new MmPlaySettingInfo(((IMmPodcastInitialDependency) this.this$0.mo161247w()).mo164310d(), ((IMmPodcastInitialDependency) this.this$0.mo161247w()).mo164311e(), ((IMmPodcastInitialDependency) this.this$0.mo161247w()).mo164312f()), null, 32, null);
            FragmentActivity a2 = C47107a.m186565a(this.this$0.f117668b.mo161232n());
            if (a2 != null) {
                a2.finish();
            }
            ((IMmPodcastInitialDependency) this.this$0.mo161247w()).mo164315i();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.a.e$f */
    public static final class C46770f extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmPodcastInitialViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46770f(MmPodcastInitialViewControl eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            C45855f.m181664c("MmPodcastInitialViewControl", "retry");
            this.this$0.mo164340k();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.a.e$g */
    public static final class C46771g extends Lambda implements Function1<MmBaseInfo, Unit> {
        final /* synthetic */ MmPodcastInitialViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46771g(MmPodcastInitialViewControl eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MmBaseInfo mmBaseInfo) {
            invoke(mmBaseInfo);
            return Unit.INSTANCE;
        }

        public final void invoke(MmBaseInfo mmBaseInfo) {
            Intrinsics.checkParameterIsNotNull(mmBaseInfo, "it");
            Function1<MmBaseInfo, Unit> j = this.this$0.mo164339j();
            if (j != null) {
                j.invoke(mmBaseInfo);
            }
        }
    }

    /* renamed from: b */
    public final void mo164338b(Function1<? super MmBaseInfo, Unit> function1) {
        this.f117670d = function1;
    }

    @Override // com.ss.android.lark.mm.module.podcast.initial.IMmPodcastInitialListener
    /* renamed from: a */
    public void mo164318a(boolean z) {
        int i;
        TextView textView = this.f117675i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo164335a(Bitmap bitmap) {
        if (this.f117681o == null) {
            C45855f.m181664c("MmPodcastInitialViewControl", "initShaderView");
            ShaderSurfaceView shaderSurfaceView = new ShaderSurfaceView(this.f117668b.mo161232n());
            this.f117681o = shaderSurfaceView;
            if (shaderSurfaceView != null) {
                shaderSurfaceView.mo164370a(R.raw.simplefrag, 1.0f, bitmap);
            }
            ShaderSurfaceView shaderSurfaceView2 = this.f117681o;
            if (shaderSurfaceView2 != null) {
                shaderSurfaceView2.mo164369a(1.67f);
            }
            this.f117674h.addView(this.f117681o, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "Lcom/ss/android/lark/mm/module/player/core/subtitle/MmSubtitles;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.a.e$b */
    public static final class C46764b<T> implements Consumer<Pair<? extends MmBaseInfo, ? extends MmSubtitles>> {

        /* renamed from: a */
        final /* synthetic */ MmPodcastInitialViewControl f117684a;

        /* renamed from: b */
        final /* synthetic */ Function1 f117685b;

        C46764b(MmPodcastInitialViewControl eVar, Function1 function1) {
            this.f117684a = eVar;
            this.f117685b = function1;
        }

        /* renamed from: a */
        public final void accept(Pair<? extends MmBaseInfo, ? extends MmSubtitles> pair) {
            MmBaseInfo mmBaseInfo = (MmBaseInfo) pair.getFirst();
            if (ObjectStatus.Companion.mo161608c(Integer.valueOf(mmBaseInfo.getObjectStatus())) || ObjectStatus.Companion.mo161607b(Integer.valueOf(mmBaseInfo.getObjectStatus()))) {
                C45855f.m181664c("MmPodcastInitialViewControl", "[initBaseInfo] success, auto switch next: " + pair + ", current token: " + ((IMmPodcastInitialDependency) this.f117684a.mo161247w()).mo164316j());
                C45852d a = C45852d.m181651a();
                Intrinsics.checkExpressionValueIsNotNull(a, "MmControl.of()");
                a.mo161151b().mo164285u();
                return;
            }
            C45855f.m181664c("MmPodcastInitialViewControl", "[initBaseInfo] success: " + pair + ", current token: " + ((IMmPodcastInitialDependency) this.f117684a.mo161247w()).mo164316j());
            this.f117684a.mo164341l();
            this.f117685b.invoke(mmBaseInfo);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.a.e$c */
    public static final class C46765c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ MmPodcastInitialViewControl f117686a;

        /* renamed from: b */
        final /* synthetic */ Function0 f117687b;

        C46765c(MmPodcastInitialViewControl eVar, Function0 function0) {
            this.f117686a = eVar;
            this.f117687b = function0;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Throwable th2;
            Throwable th3;
            int i;
            Throwable th4 = th;
            boolean z = th4 instanceof MmRxThrowable;
            String str = null;
            if (!z) {
                th2 = null;
            } else {
                th2 = th4;
            }
            MmRxThrowable mmRxThrowable = (MmRxThrowable) th2;
            C45855f.m181666e("MmPodcastInitialViewControl", "[initBaseInfo] error: " + th4);
            AppreciableKit a = AppreciableKit.f73094h.mo103524a();
            Biz biz = Biz.VideoConference;
            Scene scene = Scene.MinutesPodcast;
            Event event = Event.minutes_load_podcast_error;
            ErrorType errorType = ErrorType.Network;
            ErrorLevel errorLevel = ErrorLevel.Exception;
            if (!z) {
                th3 = null;
            } else {
                th3 = th4;
            }
            MmRxThrowable mmRxThrowable2 = (MmRxThrowable) th3;
            if (mmRxThrowable2 != null) {
                i = mmRxThrowable2.getErrorCode();
            } else {
                i = 0;
            }
            if (!z) {
                th4 = null;
            }
            MmRxThrowable mmRxThrowable3 = (MmRxThrowable) th4;
            if (mmRxThrowable3 != null) {
                str = mmRxThrowable3.getErrorMessage();
            }
            a.mo103514a(new ErrorParams(biz, scene, event, errorType, errorLevel, i, null, null, str, false, MapsKt.mapOf(TuplesKt.to("objecttoken", ((IMmPodcastInitialDependency) this.f117686a.mo161247w()).mo164316j())), null, null, 6144, null));
            if (mmRxThrowable == null || mmRxThrowable.getErrorCode() != 10008 || !NetworkUtils.isNetworkAvailable(this.f117686a.f117668b.mo161232n()) || this.f117686a.f117667a < 0) {
                boolean isNetworkAvailable = NetworkUtils.isNetworkAvailable(this.f117686a.f117668b.mo161232n());
                if ((mmRxThrowable == null || mmRxThrowable.getErrorCode() != 0) && ((mmRxThrowable == null || mmRxThrowable.getErrorCode() != 10008) && isNetworkAvailable)) {
                    C45855f.m181666e("MmPodcastInitialViewControl", "[initBaseInfo] failed, auto switch next, current token: " + ((IMmPodcastInitialDependency) this.f117686a.mo161247w()).mo164316j());
                    C45852d a2 = C45852d.m181651a();
                    Intrinsics.checkExpressionValueIsNotNull(a2, "MmControl.of()");
                    a2.mo161151b().mo164285u();
                } else {
                    C45855f.m181666e("MmPodcastInitialViewControl", "[initBaseInfo] show retry page, current token: " + ((IMmPodcastInitialDependency) this.f117686a.mo161247w()).mo164316j());
                    this.f117686a.mo164342m();
                }
            } else {
                MmPodcastInitialViewControl eVar = this.f117686a;
                eVar.f117667a--;
                C45855f.m181666e("MmPodcastInitialViewControl", "[initBaseInfo] ERROR_OFFLINE，retryTimes: " + this.f117686a.f117667a);
                C45859k.m181686a(new Runnable(this) {
                    /* class com.ss.android.lark.mm.module.podcast.initial.MmPodcastInitialViewControl.C46765c.RunnableC467661 */

                    /* renamed from: a */
                    final /* synthetic */ C46765c f117688a;

                    {
                        this.f117688a = r1;
                    }

                    public final void run() {
                        this.f117688a.f117686a.mo164340k();
                    }
                }, 200);
            }
            Function0 function0 = this.f117687b;
            if (function0 != null) {
                Unit unit = (Unit) function0.invoke();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "Lcom/ss/android/lark/mm/module/player/core/subtitle/MmSubtitles;", "t1", "t2", "apply"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.a.e$a */
    public static final class C46763a<T1, T2, R> implements BiFunction<MmBaseInfo, MmSubtitles, Pair<? extends MmBaseInfo, ? extends MmSubtitles>> {

        /* renamed from: a */
        public static final C46763a f117683a = new C46763a();

        C46763a() {
        }

        /* renamed from: a */
        public final Pair<MmBaseInfo, MmSubtitles> apply(MmBaseInfo mmBaseInfo, MmSubtitles mmSubtitles) {
            Intrinsics.checkParameterIsNotNull(mmBaseInfo, "t1");
            Intrinsics.checkParameterIsNotNull(mmSubtitles, "t2");
            return TuplesKt.to(mmBaseInfo, mmSubtitles);
        }
    }

    /* renamed from: a */
    public final void mo164337a(Function1<? super MmBaseInfo, Unit> function1, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
        m185255o();
        MmAppreciablePodcastDetailTracker.f118531a.mo165392b();
        Disposable subscribe = Single.zip(((IMmPodcastInitialDependency) mo161247w()).mo164308b(), ((IMmPodcastInitialDependency) mo161247w()).mo164309c(), C46763a.f117683a).subscribeOn(LarkRxSchedulers.io()).observeOn(LarkRxSchedulers.mainThread()).subscribe(new C46764b(this, function1), new C46765c(this, function0));
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "Single.zip(getDependency…voke()\n                })");
        C47108b.m186566a(subscribe, this.f117668b.mo161232n());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmPodcastInitialViewControl(IMmViewControlContext gVar, MmBaseViewControlAdapter<IMmPodcastInitialListener, IMmPodcastInitialDependency> jVar) {
        super(gVar, jVar);
        Intrinsics.checkParameterIsNotNull(gVar, "vcContext");
        Intrinsics.checkParameterIsNotNull(jVar, "controlAdapter");
        this.f117668b = gVar;
        this.f117682p = jVar;
        this.f117671e = gVar.mo161233o().findViewById(R.id.loadingLayout);
        this.f117672f = (LKUILottieAnimationView) gVar.mo161233o().findViewById(R.id.podcastLottie);
        View findViewById = gVar.mo161233o().findViewById(R.id.detail_video_toolbar);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "vcContext.getRootView().….id.detail_video_toolbar)");
        this.f117673g = findViewById;
        View findViewById2 = gVar.mo161233o().findViewById(R.id.bgContainer);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "vcContext.getRootView().…iewById(R.id.bgContainer)");
        this.f117674h = (FrameLayout) findViewById2;
        View findViewById3 = gVar.mo161233o().findViewById(R.id.noContentPlaceholderView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "vcContext.getRootView().…noContentPlaceholderView)");
        this.f117675i = (TextView) findViewById3;
        View findViewById4 = gVar.mo161233o().findViewById(R.id.noAvailablePlayView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "vcContext.getRootView().…R.id.noAvailablePlayView)");
        this.f117676j = (TextView) findViewById4;
        View findViewById5 = gVar.mo161233o().findViewById(R.id.podcastRecyclerView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "vcContext.getRootView().…R.id.podcastRecyclerView)");
        this.f117677k = findViewById5;
        View findViewById6 = gVar.mo161233o().findViewById(R.id.mm_podcast_exit);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "vcContext.getRootView().…yId(R.id.mm_podcast_exit)");
        this.f117678l = findViewById6;
        View findViewById7 = gVar.mo161233o().findViewById(R.id.retryLayout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "vcContext.getRootView().…iewById(R.id.retryLayout)");
        this.f117679m = findViewById7;
        View findViewById8 = gVar.mo161233o().findViewById(R.id.retryBtn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "vcContext.getRootView().…ndViewById(R.id.retryBtn)");
        this.f117680n = findViewById8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mm.module.podcast.a.e */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m185254a(MmPodcastInitialViewControl eVar, Function1 function1, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        eVar.mo164337a(function1, function0);
    }
}
