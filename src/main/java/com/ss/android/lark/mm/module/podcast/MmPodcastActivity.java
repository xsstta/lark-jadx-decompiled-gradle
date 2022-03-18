package com.ss.android.lark.mm.module.podcast;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.base.MmBaseActivity;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.floatwindow.floating.permission.ForbidPodcastFloat;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseViewControl;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.module.player.MmVideoControl;
import com.ss.android.lark.mm.module.player.MmVideoViewControl;
import com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolbarControl;
import com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolbarViewControl;
import com.ss.android.lark.mm.module.podcast.MmPodcastControl;
import com.ss.android.lark.mm.module.podcast.initial.MmPodcastInitialControl;
import com.ss.android.lark.mm.module.podcast.initial.MmPodcastInitialViewControl;
import com.ss.android.lark.mm.module.podcast.initial.MmPodcastInitialViewControlAdapter;
import com.ss.android.lark.mm.module.podcast.subtitle.MmPodcastSubtitleControl;
import com.ss.android.lark.mm.module.podcast.subtitle.MmPodcastSubtitleViewControl;
import com.ss.android.lark.mm.module.podcast.subtitle.MmPodcastSubtitleViewControlAdapter;
import com.ss.android.lark.mm.module.podcast.titlebar.MmPodcastTitleBarControl;
import com.ss.android.lark.mm.module.podcast.titlebar.MmPodcastTitleBarViewControl;
import com.ss.android.lark.mm.module.podcast.titlebar.MmPodcastTitleBarViewControlAdapter;
import com.ss.android.lark.mm.module.podcast.toolbar.MmPodcastToolbarControlAdapter;
import com.ss.android.lark.mm.module.podcast.video.MmPodcastVideoViewControlAdapter;
import com.ss.android.lark.mm.p2288b.C45852d;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.statistics.hitpoint.MmHitPointContextProvider;
import com.ss.android.lark.mm.utils.ktextensions.C47108b;
import com.ss.android.lark.mm.utils.p2335a.C47096b;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.zackratos.ultimatebarx.ultimatebarx.UltimateBarX;
import com.zackratos.ultimatebarx.ultimatebarx.operator.Operator;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.UninitializedPropertyAccessException;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@ForbidPodcastFloat
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 42\u00020\u00012\u00020\u00022\u00020\u0003:\u00014B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\n\u0010!\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010*\u001a\u00020\u001aH\u0016J\u0012\u0010+\u001a\u00020\u001a2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\b\u0010.\u001a\u00020\u001aH\u0014J\b\u0010/\u001a\u00020\u001aH\u0014J\b\u00100\u001a\u00020\u001aH\u0014J\b\u00101\u001a\u00020\u001aH\u0014J\b\u00102\u001a\u00020\u001aH\u0014J\b\u00103\u001a\u00020\u001aH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R#\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00180\u0017X\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/ss/android/lark/mm/module/podcast/MmPodcastActivity;", "Lcom/ss/android/lark/mm/base/MmBaseActivity;", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContextProvider;", "()V", "hitPointContext", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "isFinishActivity", "", "isInited", "podcastControl", "Lcom/ss/android/lark/mm/module/podcast/MmPodcastControl;", "kotlin.jvm.PlatformType", "getPodcastControl", "()Lcom/ss/android/lark/mm/module/podcast/MmPodcastControl;", "podcastControl$delegate", "Lkotlin/Lazy;", "viewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "getViewControlRegister", "()Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "viewControlRegister$delegate", "viewControls", "", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "clearViewControls", "", "finish", "generateHitPointContext", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getMContext", "Landroid/content/Context;", "getMmHitPointContext", "getMmTimeExecutor", "Lcom/ss/android/lark/mm/utils/timer/MmTimerExecutor;", "getRootView", "Landroid/view/View;", "init", "controlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "initViewControls", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "onStart", "onStop", "subscribeStates", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmPodcastActivity extends MmBaseActivity implements IMmViewControlContext, MmHitPointContextProvider {

    /* renamed from: b */
    public static final Companion f117617b = new Companion(null);

    /* renamed from: c */
    private boolean f117618c;

    /* renamed from: d */
    private final Lazy f117619d = LazyKt.lazy(C46751h.INSTANCE);

    /* renamed from: e */
    private final List<MmBaseViewControl<?, ?>> f117620e = new ArrayList();

    /* renamed from: f */
    private final Lazy f117621f = LazyKt.lazy(C46748e.INSTANCE);

    /* renamed from: g */
    private C47084f f117622g;

    /* renamed from: h */
    private boolean f117623h;

    /* renamed from: i */
    private HashMap f117624i;

    /* renamed from: h */
    private final MmViewControlRegister m185150h() {
        return (MmViewControlRegister) this.f117619d.getValue();
    }

    /* renamed from: a */
    public Context mo164247a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    @Override // com.ss.android.lark.mm.base.MmBaseActivity
    /* renamed from: a */
    public View mo161162a(int i) {
        if (this.f117624i == null) {
            this.f117624i = new HashMap();
        }
        View view = (View) this.f117624i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f117624i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final MmPodcastControl mo161315a() {
        return (MmPodcastControl) this.f117621f.getValue();
    }

    /* renamed from: a */
    public void mo164248a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m185146a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m185144a(this, configuration);
    }

    /* renamed from: f */
    public Resources mo164253f() {
        return super.getResources();
    }

    /* renamed from: g */
    public AssetManager mo164255g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m185149c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m185147b(this);
    }

    @Override // com.ss.android.lark.mm.module.framework.IMmViewControlContext
    /* renamed from: n */
    public Context mo161232n() {
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m185145a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mm/module/podcast/MmPodcastActivity$Companion;", "", "()V", "start", "", "context", "Landroid/content/Context;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.MmPodcastActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo164257a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intent intent = new Intent(context, MmPodcastActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.IMmViewControlContext, com.ss.android.lark.mm.statistics.hitpoint.MmHitPointContextProvider
    /* renamed from: e */
    public C47084f mo161231e() {
        return this.f117622g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.MmPodcastActivity$h */
    static final class C46751h extends Lambda implements Function0<MmViewControlRegister> {
        public static final C46751h INSTANCE = new C46751h();

        C46751h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MmViewControlRegister invoke() {
            return new MmViewControlRegister();
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.IMmViewControlContext
    /* renamed from: p */
    public C47096b mo161234p() {
        return mo161164b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/module/podcast/MmPodcastControl;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.MmPodcastActivity$e */
    static final class C46748e extends Lambda implements Function0<MmPodcastControl> {
        public static final C46748e INSTANCE = new C46748e();

        C46748e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MmPodcastControl invoke() {
            C45852d a = C45852d.m181651a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmControl.of()");
            return a.mo161151b();
        }
    }

    /* renamed from: d */
    public void mo164252d() {
        super.onStop();
        C45855f.m181664c("MmPodcastActivity", "onStop");
        mo161315a().mo164282r();
    }

    @Override // com.ss.android.lark.mm.module.framework.IMmViewControlContext
    /* renamed from: o */
    public View mo161233o() {
        ConstraintLayout constraintLayout = (ConstraintLayout) mo161162a(R.id.podcastRootView);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "podcastRootView");
        return constraintLayout;
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        C45855f.m181664c("MmPodcastActivity", "onBackPressed");
        if (!mo161315a().mo164281l()) {
            finish();
        } else {
            mo161315a().mo164269a(true);
        }
    }

    /* renamed from: i */
    private final void m185151i() {
        Disposable subscribe = mo161315a().mo164277g().subscribe(new C46749f(this));
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "podcastControl.displayMo…)\n            }\n        }");
        MmPodcastActivity mmPodcastActivity = this;
        C47108b.m186568a(subscribe, (FragmentActivity) mmPodcastActivity);
        Disposable subscribe2 = mo161315a().mo164276f().subscribe(new C46750g(this));
        Intrinsics.checkExpressionValueIsNotNull(subscribe2, "podcastControl.currentPl…)\n            }\n        }");
        C47108b.m186568a(subscribe2, (FragmentActivity) mmPodcastActivity);
    }

    /* renamed from: j */
    private final void m185152j() {
        m185150h().mo161260a();
        Iterator<T> it = this.f117620e.iterator();
        while (it.hasNext()) {
            it.next().mo161245h();
        }
        this.f117620e.clear();
    }

    public void finish() {
        C45855f.m181664c("MmPodcastActivity", "finish");
        this.f117618c = true;
        if (!mo161315a().mo164278h()) {
            C45855f.m181664c("MmPodcastActivity", "finish clearPodcastControl");
            C45852d.m181651a().mo161153c();
        }
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mm.base.MmBaseActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        super.onDestroy();
        C45855f.m181664c("MmPodcastActivity", "onDestroy");
        Iterator<T> it = this.f117620e.iterator();
        while (it.hasNext()) {
            it.next().mo161245h();
        }
        this.f117620e.clear();
        if (!this.f117618c) {
            mo161315a().mo164269a(true);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.mm.base.MmBaseActivity
    public void onPause() {
        super.onPause();
        C45855f.m181664c("MmPodcastActivity", "onPause");
        Iterator<T> it = this.f117620e.iterator();
        while (it.hasNext()) {
            it.next().mo161249y();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.mm.base.MmBaseActivity
    public void onResume() {
        super.onResume();
        C45855f.m181664c("MmPodcastActivity", "onResume");
        Iterator<T> it = this.f117620e.iterator();
        while (it.hasNext()) {
            it.next().mo161241A();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStart() {
        super.onStart();
        C45855f.m181664c("MmPodcastActivity", "onStart");
        Iterator<T> it = this.f117620e.iterator();
        while (it.hasNext()) {
            it.next().mo161248x();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "invoke", "com/ss/android/lark/mm/module/podcast/MmPodcastActivity$init$initialViewControl$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.MmPodcastActivity$b */
    public static final class C46745b extends Lambda implements Function1<MmBaseInfo, Unit> {
        final /* synthetic */ MmControlRegister $controlRegister$inlined;
        final /* synthetic */ MmPodcastActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46745b(MmPodcastActivity mmPodcastActivity, MmControlRegister eVar) {
            super(1);
            this.this$0 = mmPodcastActivity;
            this.$controlRegister$inlined = eVar;
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
            this.this$0.mo164249a(mmBaseInfo);
            this.this$0.mo164250a(this.$controlRegister$inlined);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "invoke", "com/ss/android/lark/mm/module/podcast/MmPodcastActivity$init$initialViewControl$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.MmPodcastActivity$c */
    public static final class C46746c extends Lambda implements Function1<MmBaseInfo, Unit> {
        final /* synthetic */ MmControlRegister $controlRegister$inlined;
        final /* synthetic */ MmPodcastActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46746c(MmPodcastActivity mmPodcastActivity, MmControlRegister eVar) {
            super(1);
            this.this$0 = mmPodcastActivity;
            this.$controlRegister$inlined = eVar;
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
            this.this$0.mo164249a(mmBaseInfo);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.MmPodcastActivity$d */
    public static final class C46747d extends Lambda implements Function1<MmBaseInfo, Unit> {
        final /* synthetic */ MmControlRegister $controlRegister;
        final /* synthetic */ MmPodcastActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46747d(MmPodcastActivity mmPodcastActivity, MmControlRegister eVar) {
            super(1);
            this.this$0 = mmPodcastActivity;
            this.$controlRegister = eVar;
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
            this.this$0.mo161315a().mo164274d().onNext(mmBaseInfo);
            this.this$0.mo164249a(mmBaseInfo);
            this.this$0.mo164250a(this.$controlRegister);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/podcast/MmPodcastControl$DisplayMode;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.MmPodcastActivity$f */
    public static final class C46749f<T> implements Consumer<MmPodcastControl.DisplayMode> {

        /* renamed from: a */
        final /* synthetic */ MmPodcastActivity f117625a;

        C46749f(MmPodcastActivity mmPodcastActivity) {
            this.f117625a = mmPodcastActivity;
        }

        /* renamed from: a */
        public final void accept(MmPodcastControl.DisplayMode displayMode) {
            if (displayMode == MmPodcastControl.DisplayMode.FLOAT_WINDOW) {
                C45855f.m181664c("MmPodcastActivity", "floatWindow showing, finish detail");
                this.f117625a.finish();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "Lcom/ss/android/lark/mm/module/podcast/MmPodcastControl$PlayState;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.MmPodcastActivity$g */
    public static final class C46750g<T> implements Consumer<Pair<? extends String, ? extends MmPodcastControl.PlayState>> {

        /* renamed from: a */
        final /* synthetic */ MmPodcastActivity f117626a;

        C46750g(MmPodcastActivity mmPodcastActivity) {
            this.f117626a = mmPodcastActivity;
        }

        /* renamed from: a */
        public final void accept(Pair<String, ? extends MmPodcastControl.PlayState> pair) {
            if (((MmPodcastControl.PlayState) pair.getSecond()) == MmPodcastControl.PlayState.TERMINATED) {
                C45855f.m181664c("MmPodcastActivity", "podcast terminated");
                this.f117626a.finish();
            }
        }
    }

    /* renamed from: b */
    public static Resources m185147b(MmPodcastActivity mmPodcastActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mmPodcastActivity);
        }
        return mmPodcastActivity.mo164253f();
    }

    /* renamed from: c */
    public static AssetManager m185149c(MmPodcastActivity mmPodcastActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mmPodcastActivity);
        }
        return mmPodcastActivity.mo164255g();
    }

    /* renamed from: a */
    public static void m185145a(MmPodcastActivity mmPodcastActivity) {
        mmPodcastActivity.mo164252d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MmPodcastActivity mmPodcastActivity2 = mmPodcastActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    mmPodcastActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    private final void m185148b(MmControlRegister eVar) {
        MmPodcastInitialControl dVar;
        m185152j();
        MmControlRegister s = mo161315a().mo164283s();
        if (s != null && (dVar = (MmPodcastInitialControl) s.mo161912a(MmPodcastInitialControl.class)) != null) {
            MmPodcastActivity mmPodcastActivity = this;
            MmPodcastInitialViewControl eVar2 = new MmPodcastInitialViewControl(mmPodcastActivity, new MmPodcastInitialViewControlAdapter(m185150h(), eVar, dVar));
            eVar2.be_();
            eVar2.mo164336a(new C46745b(this, eVar));
            eVar2.mo164338b(new C46746c(this, eVar));
            this.f117620e.add(eVar2);
            MmPodcastTitleBarControl dVar2 = (MmPodcastTitleBarControl) eVar.mo161912a(MmPodcastTitleBarControl.class);
            if (dVar2 != null) {
                List<MmBaseViewControl<?, ?>> list = this.f117620e;
                MmPodcastTitleBarViewControl eVar3 = new MmPodcastTitleBarViewControl(mmPodcastActivity, new MmPodcastTitleBarViewControlAdapter(m185150h(), eVar, dVar2));
                eVar3.be_();
                list.add(eVar3);
                MmPodcastInitialViewControl.m185254a(eVar2, new C46747d(this, eVar), null, 2, null);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mm.base.MmBaseActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C45855f.m181664c("MmPodcastActivity", "onCreate");
        overridePendingTransition(0, 0);
        setContentView(R.layout.mm_activity_podcast);
        getWindow().addFlags(SmActions.ACTION_ONTHECALL_EXIT);
        try {
            UltimateBarXInitializerWrapper.f117659b.mo164306a();
            Operator d = UltimateBarX.f171308a.mo236950a(this).mo237001d();
            d.mo236995a();
            d.mo236996b();
        } catch (UninitializedPropertyAccessException unused) {
        }
        MmControlRegister s = mo161315a().mo164283s();
        if (s == null || s.mo161919c()) {
            finish();
            return;
        }
        m185148b(s);
        m185151i();
    }

    /* renamed from: a */
    public final void mo164249a(MmBaseInfo mmBaseInfo) {
        this.f117622g = new C47084f(mmBaseInfo.getMeetingId(), mmBaseInfo.isOwner(), mmBaseInfo.getObjectToken(), mmBaseInfo.getObjectType(), mmBaseInfo.isCanModify());
    }

    /* renamed from: a */
    public final void mo164250a(MmControlRegister eVar) {
        if (!this.f117623h) {
            this.f117623h = true;
            if (eVar.mo161919c()) {
                finish();
                return;
            }
            C47083e.m186423a(this, "vc_minutes_podcast_view", C47086i.m186432a().mo165421c());
            MmVideoControl eVar2 = (MmVideoControl) eVar.mo161912a(MmVideoControl.class);
            if (eVar2 != null) {
                List<MmBaseViewControl<?, ?>> list = this.f117620e;
                MmPodcastActivity mmPodcastActivity = this;
                MmVideoViewControl fVar = new MmVideoViewControl(mmPodcastActivity, new MmPodcastVideoViewControlAdapter(m185150h(), eVar, eVar2));
                fVar.be_();
                list.add(fVar);
                MmVideoToolbarControl fVar2 = (MmVideoToolbarControl) eVar.mo161912a(MmVideoToolbarControl.class);
                if (fVar2 != null) {
                    List<MmBaseViewControl<?, ?>> list2 = this.f117620e;
                    MmVideoToolbarViewControl gVar = new MmVideoToolbarViewControl(mmPodcastActivity, new MmPodcastToolbarControlAdapter(m185150h(), eVar, fVar2));
                    gVar.be_();
                    gVar.mo164213a(eVar2.mo164025b());
                    list2.add(gVar);
                    MmPodcastSubtitleControl fVar3 = (MmPodcastSubtitleControl) eVar.mo161912a(MmPodcastSubtitleControl.class);
                    if (fVar3 != null) {
                        List<MmBaseViewControl<?, ?>> list3 = this.f117620e;
                        MmPodcastSubtitleViewControl gVar2 = new MmPodcastSubtitleViewControl(mmPodcastActivity, new MmPodcastSubtitleViewControlAdapter(m185150h(), eVar, fVar3));
                        gVar2.be_();
                        list3.add(gVar2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m185146a(MmPodcastActivity mmPodcastActivity, Context context) {
        mmPodcastActivity.mo164248a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mmPodcastActivity);
        }
    }

    /* renamed from: a */
    public static Context m185144a(MmPodcastActivity mmPodcastActivity, Configuration configuration) {
        Context a = mmPodcastActivity.mo164247a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
